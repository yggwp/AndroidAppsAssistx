package com.assistx.monitor.ui.projects

import android.content.Intent
import android.net.Uri
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.assistx.monitor.R
import com.assistx.monitor.data.model.Project
import com.assistx.monitor.databinding.CardProjectBinding

class ProjectsAdapter : ListAdapter<Project, ProjectsAdapter.ViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardProjectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(private val binding: CardProjectBinding) : RecyclerView.ViewHolder(binding.root) {
        
        fun bind(project: Project) {
            val context = binding.root.context
            
            binding.tvProjectName.text = project.name
            binding.tvNodesCount.text = "${project.totalNodes} Nodes • ${project.onlineCount} Online"
            binding.tvTotalQuotaText.text = String.format("%.1f GB", project.totalQuotaGb)
            
            // Average CPU Progress and color
            binding.tvAvgCpuText.text = String.format("%.1f%%", project.avgCpu)
            binding.pbAvgCpu.progress = project.avgCpu.toInt()
            binding.pbAvgCpu.setProgressTintList(
                ContextCompat.getColorStateList(
                    context,
                    when {
                        project.avgCpu >= 97 -> R.color.danger_red
                        project.avgCpu >= 80 -> R.color.warning_orange
                        else -> R.color.success_green
                    }
                )
            )
            
            // Average RAM Progress and color
            binding.tvAvgRamText.text = String.format("%.1f%%", project.avgMem)
            binding.pbAvgRam.progress = project.avgMem.toInt()
            binding.pbAvgRam.setProgressTintList(
                ContextCompat.getColorStateList(
                    context,
                    when {
                        project.avgMem >= 98 -> R.color.danger_red
                        project.avgMem >= 80 -> R.color.warning_orange
                        else -> R.color.success_green
                    }
                )
            )

            // Status indicator and badge styling
            when {
                project.isCompletelyOffline -> {
                    binding.statusIndicator.setBackgroundResource(R.drawable.circle_offline)
                    binding.statusBadge.text = "OFFLINE"
                    binding.statusBadge.setTextColor(ContextCompat.getColor(context, R.color.danger_red))
                    binding.statusBadge.setBackgroundResource(R.drawable.bg_status_badge_offline)
                    binding.resourceLayout.visibility = View.GONE
                }
                project.isPartialOnline -> {
                    binding.statusIndicator.setBackgroundResource(R.drawable.circle_offline)
                    binding.statusBadge.text = "PARTIAL"
                    binding.statusBadge.setTextColor(ContextCompat.getColor(context, R.color.warning_orange))
                    binding.statusBadge.setBackgroundResource(R.drawable.bg_status_badge_alert)
                    binding.resourceLayout.visibility = View.VISIBLE
                }
                else -> { // All Online
                    binding.statusIndicator.setBackgroundResource(R.drawable.circle_online)
                    binding.statusBadge.text = "ALL ONLINE"
                    binding.statusBadge.setTextColor(ContextCompat.getColor(context, R.color.success_green))
                    binding.statusBadge.setBackgroundResource(R.drawable.bg_status_badge_online)
                    binding.resourceLayout.visibility = View.VISIBLE
                }
            }

            // Pulse animation for online projects
            if (!project.isCompletelyOffline) {
                binding.statusIndicator.clearAnimation()
                val pulse = android.view.animation.AlphaAnimation(1.0f, 0.4f).apply {
                    duration = 800
                    repeatMode = android.view.animation.Animation.REVERSE
                    repeatCount = android.view.animation.Animation.INFINITE
                }
                binding.statusIndicator.startAnimation(pulse)
            } else {
                binding.statusIndicator.clearAnimation()
            }

            // Dynamic PC list population
            binding.layoutPcList.removeAllViews()
            project.nodes.forEach { node ->
                val row = LinearLayout(context).apply {
                    orientation = LinearLayout.HORIZONTAL
                    layoutParams = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    ).apply {
                        topMargin = 12
                    }
                    gravity = Gravity.CENTER_VERTICAL
                }

                // Status Dot indicator
                val dot = View(context).apply {
                    val size = (6 * context.resources.displayMetrics.density).toInt()
                    layoutParams = LinearLayout.LayoutParams(size, size).apply {
                        marginEnd = (8 * context.resources.displayMetrics.density).toInt()
                    }
                    setBackgroundResource(if (node.isOnline) R.drawable.circle_online else R.drawable.circle_offline)
                }
                row.addView(dot)

                // Location / Unit Name
                val nameTv = TextView(context).apply {
                    layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)
                    text = node.location ?: "N/A"
                    textSize = 13f
                    setTextColor(ContextCompat.getColor(context, R.color.text_secondary))
                    maxLines = 1
                }
                row.addView(nameTv)

                // Quota display
                val quotaTv = TextView(context).apply {
                    text = node.quotaText
                    textSize = 13f
                    setTextColor(ContextCompat.getColor(context, R.color.text_primary))
                    typeface = android.graphics.Typeface.MONOSPACE
                    
                    // Click handler if quota link is provided
                    if (!node.quotaLink.isNullOrBlank()) {
                        setTextColor(ContextCompat.getColor(context, R.color.success_green))
                        paintFlags = paintFlags or android.graphics.Paint.UNDERLINE_TEXT_FLAG
                        setOnClickListener {
                            try {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(node.quotaLink))
                                context.startActivity(intent)
                            } catch (e: Exception) {
                                // Ignore exceptions
                            }
                        }
                    }
                }
                row.addView(quotaTv)

                binding.layoutPcList.addView(row)
            }
        }
    }

    private object DiffCallback : DiffUtil.ItemCallback<Project>() {
        override fun areItemsTheSame(oldItem: Project, newItem: Project): Boolean = oldItem.name == newItem.name
        override fun areContentsTheSame(oldItem: Project, newItem: Project): Boolean = oldItem == newItem
    }}
