package com.assistx.monitor.data.model

import com.google.gson.annotations.SerializedName

/**
 * Model data untuk perangkat POC yang dimonitor.
 * Field disesuaikan dengan response API nyata dari server.
 */
data class PcDevice(
    @SerializedName("id")
    val id: String? = null,

    @SerializedName("name")
    val name: String? = "Unknown",

    @SerializedName("endpoint")
    val endpoint: String? = null,

    @SerializedName("ip_address", alternate = ["ip"])
    val ipAddress: String? = "N/A",

    @SerializedName("location")
    val location: String? = "N/A",

    // Server mengirim "anydesk_id" di SSE dan REST, "anydesk" sebagai fallback
    @SerializedName("anydesk_id", alternate = ["anydesk"])
    val anydeskId: String? = null,

    @SerializedName("simcard_number")
    val simcardNumber: String? = null,

    // quota_gb bisa ada atau tidak tergantung device
    @SerializedName("quota_gb")
    val apiQuotaGb: Float? = null,

    @SerializedName("quota_text", alternate = ["quota"])
    val quotaText: String? = "N/A",

    @SerializedName("quota_link")
    val quotaLink: String? = null,

    @SerializedName("status")
    val status: String? = "offline",

    @SerializedName("anydesk_status")
    val anydeskStatus: Int = 0,

    @SerializedName("cpu_usage")
    val cpuUsage: Double = 0.0,

    @SerializedName("memory_usage")
    val memoryUsage: Double = 0.0,

    @SerializedName("storage_usage")
    val storageUsage: Double = 0.0,

    @SerializedName("sn")
    val serialNumber: String? = null,

    @SerializedName("last_update")
    val lastUpdate: String? = null,

    @SerializedName("error")
    val error: String? = null
) {
    /**
     * Device dianggap online jika status == "online".
     * anydesk_status TIDAK dipakai sebagai syarat online karena banyak device
     * yang online tapi anydesk_status = 0 (AnyDesk tidak running).
     */
    val isOnline: Boolean get() = status?.lowercase() == "online"

    val isAnyDeskRunning: Boolean get() = anydeskStatus == 1

    val displayAnyDeskId: String get() = anydeskId ?: "N/A"

    val displayQuota: String
        get() {
            val text = quotaText?.trim()
            return if (text.isNullOrEmpty() || text == "null") "N/A" else text
        }

    /**
     * Ekstrak nilai kuota dalam GB.
     * Prioritas: field quota_gb dari API, lalu parse dari quota_text.
     */
    val quotaGb: Float?
        get() {
            // Jika ada quota_gb dari API dan nilainya > 0, gunakan itu
            if (apiQuotaGb != null && apiQuotaGb > 0f) return apiQuotaGb
            // Parse dari quota_text (contoh: "3.468 GB", "0 GB")
            val text = quotaText ?: return null
            if (text == "N/A" || text == "Not Configured" || text.isBlank()) return null
            val match = Regex("([0-9]+(?:\\.[0-9]+)?)\\s*GB", RegexOption.IGNORE_CASE).find(text)
            return match?.groupValues?.get(1)?.toFloatOrNull()
        }

    /**
     * Kuota kritis jika di bawah atau sama dengan 1 GB
     * (dan bukan 0 yang berarti tidak dikonfigurasi).
     */
    val isQuotaCritical: Boolean
        get() {
            val gb = quotaGb ?: return false
            return gb > 0f && gb <= 1.0f
        }

    /**
     * Kuota warning jika antara 1 GB (exclusive) dan 5 GB (exclusive).
     */
    val isQuotaWarning: Boolean
        get() {
            val gb = quotaGb ?: return false
            return gb > 1.0f && gb < 5.0f
        }

    val alertState: AlertState
        get() = when {
            !isOnline -> AlertState.OFFLINE
            isQuotaCritical -> AlertState.QUOTA_CRITICAL
            isQuotaWarning -> AlertState.QUOTA_WARNING
            else -> AlertState.ONLINE
        }
}

enum class AlertState {
    ONLINE,
    OFFLINE,
    QUOTA_WARNING,
    QUOTA_CRITICAL
}
