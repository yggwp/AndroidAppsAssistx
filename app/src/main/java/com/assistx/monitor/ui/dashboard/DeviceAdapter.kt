package com.assistx.monitor.ui.dashboard

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.assistx.monitor.R
import com.assistx.monitor.data.model.PcDevice
import com.assistx.monitor.databinding.CardDeviceBinding
import com.assistx.monitor.databinding.LayoutSectionHeaderBinding

sealed class DeviceListItem {
    data class Header(val title: String) : DeviceListItem()
    data class Device(val device: PcDevice) : DeviceListItem()
}

class DeviceAdapter(private val onCardClick: (PcDevice) -> Unit) : ListAdapter<DeviceListItem, RecyclerView.ViewHolder>(DiffCallback()) {

    companion object {
        private const val TYPE_HEADER = 0
        private const val TYPE_ITEM = 1
    }

    class DeviceViewHolder(val binding: CardDeviceBinding) : RecyclerView.ViewHolder(binding.root)
    class HeaderViewHolder(val binding: LayoutSectionHeaderBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is DeviceListItem.Header -> TYPE_HEADER
            is DeviceListItem.Device -> TYPE_ITEM
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_HEADER) {
            HeaderViewHolder(LayoutSectionHeaderBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        } else {
            DeviceViewHolder(CardDeviceBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position) ?: return
        if (holder is HeaderViewHolder && item is DeviceListItem.Header) {
            holder.binding.tvSectionHeader.text = item.title
        } else if (holder is DeviceViewHolder && item is DeviceListItem.Device) {
            val device = item.device
            val ctx = holder.binding.root.context
            
            with(holder.binding) {
            tvDeviceName.text = device.name ?: "Unknown"
            tvProjectUnit.text = "${device.location ?: "N/A"} • SN: ${device.serialNumber?.takeIf { it.isNotBlank() } ?: "N/A"}"
            tvLocation.text = device.location ?: "N/A"
            tvIpAddress.text = device.ipAddress ?: "N/A"
            tvAnyDeskId.text = device.displayAnyDeskId
            tvSimcard.text = device.simcardNumber?.takeIf { it != "0" } ?: "N/A"

            // Online/Offline/Warning indicator
            val badgeText: String
            val badgeColor: Int
            val badgeBg: Int
            val indicatorRes: Int

            when {
                !device.isOnline -> {
                    badgeText = "OFFLINE"
                    badgeColor = R.color.danger_red
                    badgeBg = R.drawable.bg_status_badge_offline
                    indicatorRes = R.drawable.circle_offline
                }
                device.cpuUsage >= 97 || device.memoryUsage >= 98 || device.storageUsage >= 97 -> {
                    badgeText = "WARNING"
                    badgeColor = R.color.warning_orange
                    badgeBg = R.drawable.bg_status_badge_alert
                    indicatorRes = R.drawable.circle_online
                }
                else -> {
                    badgeText = "ONLINE"
                    badgeColor = R.color.success_green
                    badgeBg = R.drawable.bg_status_badge_online
                    indicatorRes = R.drawable.circle_online
                }
            }
            statusBadge.text = badgeText
            statusBadge.setTextColor(ContextCompat.getColor(ctx, badgeColor))
            statusBadge.setBackgroundResource(badgeBg)
            statusIndicator.setBackgroundResource(indicatorRes)

            // CPU Progress
            cpuProgress.progress = device.cpuUsage.toInt()
            cpuText.text = "CPU ${device.cpuUsage.toInt()}%"
            cpuProgress.setProgressTintList(
                ContextCompat.getColorStateList(
                    ctx,
                    when {
                        device.cpuUsage >= 97 -> R.color.danger_red
                        device.cpuUsage >= 80 -> R.color.warning_orange
                        else -> R.color.success_green
                    }
                )
            )

            // Memory Progress
            memProgress.progress = device.memoryUsage.toInt()
            memText.text = "RAM ${device.memoryUsage.toInt()}%"
            memProgress.setProgressTintList(
                ContextCompat.getColorStateList(
                    ctx,
                    when {
                        device.memoryUsage >= 98 -> R.color.danger_red
                        device.memoryUsage >= 80 -> R.color.warning_orange
                        else -> R.color.success_green
                    }
                )
            )

            // Storage Progress
            storageProgress.progress = device.storageUsage.toInt()
            storageText.text = "DISK ${device.storageUsage.toInt()}%"
            storageProgress.setProgressTintList(
                ContextCompat.getColorStateList(
                    ctx,
                    when {
                        device.storageUsage >= 97 -> R.color.danger_red
                        device.storageUsage >= 85 -> R.color.warning_orange
                        else -> R.color.storage_blue
                    }
                )
            )

            // Quota
            val quotaNumeric = device.quotaGb?.toDouble() ?: 0.0
            quotaProgress.progress = quotaNumeric.toInt().coerceIn(0, 100)
            quotaText.text = "Kuota: ${device.displayQuota}"
            if (device.isQuotaCritical) {
                quotaText.setTextColor(ContextCompat.getColor(ctx, R.color.danger_red))
                quotaProgress.setProgressTintList(ContextCompat.getColorStateList(ctx, R.color.danger_red))
            } else if (device.isQuotaWarning) {
                quotaText.setTextColor(ContextCompat.getColor(ctx, R.color.warning_orange))
                quotaProgress.setProgressTintList(ContextCompat.getColorStateList(ctx, R.color.warning_orange))
            } else {
                quotaText.setTextColor(ContextCompat.getColor(ctx, R.color.text_secondary))
                quotaProgress.setProgressTintList(ContextCompat.getColorStateList(ctx, R.color.brand_blue))
            }

            // Copy AnyDesk (Click on AnyDesk text)
            tvAnyDeskId.setOnClickListener {
                val clipboard = ctx.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                clipboard.setPrimaryClip(ClipData.newPlainText("AnyDesk ID", device.displayAnyDeskId))
                Toast.makeText(ctx, "AnyDesk ID disalin!", Toast.LENGTH_SHORT).show()
                holder.binding.root.performHapticFeedback(android.view.HapticFeedbackConstants.LONG_PRESS)
            }

            // WhatsApp / Quota Link button
            val simNumber = device.simcardNumber?.takeIf { it.isNotBlank() && it != "0" }
            if (!device.quotaLink.isNullOrBlank()) {
                btnWhatsApp.isEnabled = true
                btnWhatsApp.setOnClickListener {
                    try {
                        val intent = Intent(Intent.ACTION_VIEW).apply {
                            data = android.net.Uri.parse(device.quotaLink)
                        }
                        ctx.startActivity(intent)
                    } catch (_: Exception) { }
                }
                tvSimcard.setTextColor(ContextCompat.getColor(ctx, R.color.brand_blue))
            } else if (!simNumber.isNullOrBlank()) {
                btnWhatsApp.isEnabled = true
                btnWhatsApp.setOnClickListener {
                    try {
                        val waIntent = Intent(Intent.ACTION_VIEW).apply {
                            data = android.net.Uri.parse("https://wa.me/62${simNumber.trimStart('0')}")
                        }
                        ctx.startActivity(waIntent)
                    } catch (_: Exception) { }
                }
                tvSimcard.setTextColor(ContextCompat.getColor(ctx, R.color.text_secondary))
            } else {
                btnWhatsApp.isEnabled = false
                tvSimcard.setTextColor(ContextCompat.getColor(ctx, R.color.text_muted))
            }

            // Error message
            if (device.error != null && !device.isOnline) {
                tvError.text = device.error
                tvError.visibility = android.view.View.VISIBLE
            } else {
                tvError.visibility = android.view.View.GONE
            }

            // Pulse animation for online status
            if (device.isOnline) {
                statusIndicator.clearAnimation()
                val pulse = android.view.animation.AlphaAnimation(1.0f, 0.4f).apply {
                    duration = 800
                    repeatMode = android.view.animation.Animation.REVERSE
                    repeatCount = android.view.animation.Animation.INFINITE
                }
                statusIndicator.startAnimation(pulse)
            } else {
                statusIndicator.clearAnimation()
            }
            // Card Click (Open Detail Slide 2)
            root.setOnClickListener {
                onCardClick(device)
            }
        }
    }
}

    class DiffCallback : DiffUtil.ItemCallback<DeviceListItem>() {
        override fun areItemsTheSame(oldItem: DeviceListItem, newItem: DeviceListItem): Boolean {
            return if (oldItem is DeviceListItem.Header && newItem is DeviceListItem.Header) {
                oldItem.title == newItem.title
            } else if (oldItem is DeviceListItem.Device && newItem is DeviceListItem.Device) {
                oldItem.device.id == newItem.device.id
            } else false
        }

        override fun areContentsTheSame(oldItem: DeviceListItem, newItem: DeviceListItem): Boolean =
            oldItem == newItem
    }
}
