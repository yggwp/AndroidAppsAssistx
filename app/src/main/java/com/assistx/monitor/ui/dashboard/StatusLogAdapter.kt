package com.assistx.monitor.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.assistx.monitor.R

data class StatusLogEntry(
    val timestamp: String,
    val status: String   // "online" | "offline"
)

class StatusLogAdapter(private val entries: List<StatusLogEntry>) :
    RecyclerView.Adapter<StatusLogAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dot: View = view.findViewById(R.id.statusDot)
        val tvStatus: TextView = view.findViewById(R.id.tvLogStatus)
        val tvTime: TextView = view.findViewById(R.id.tvLogTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_status_log, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = entries.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val entry = entries[position]
        val ctx = holder.itemView.context
        val isOnline = entry.status.lowercase() == "online"

        holder.dot.setBackgroundResource(
            if (isOnline) R.drawable.circle_online else R.drawable.circle_offline
        )
        holder.tvStatus.text = if (isOnline) "🟢 ONLINE" else "🔴 OFFLINE"
        holder.tvStatus.setTextColor(
            ContextCompat.getColor(
                ctx,
                if (isOnline) R.color.success_green else R.color.danger_red
            )
        )
        holder.tvTime.text = entry.timestamp
    }
}
