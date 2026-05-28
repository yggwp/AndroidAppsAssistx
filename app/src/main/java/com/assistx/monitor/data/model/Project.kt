package com.assistx.monitor.data.model

data class Project(
    val name: String,
    val nodes: List<PcDevice>,
    val totalCpu: Double,
    val totalMem: Double,
    val onlineCount: Int,
    val offlineCount: Int,
    val totalQuotaGb: Float
) {
    val totalNodes: Int get() = nodes.size
    val isCompletelyOffline: Boolean get() = onlineCount == 0
    val isPartialOnline: Boolean get() = onlineCount > 0 && offlineCount > 0
    val isAllOnline: Boolean get() = onlineCount > 0 && offlineCount == 0
    val avgCpu: Double get() = if (onlineCount > 0) totalCpu / onlineCount else 0.0
    val avgMem: Double get() = if (onlineCount > 0) totalMem / onlineCount else 0.0
}
