package com.assistx.monitor.ui.projects

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.assistx.monitor.data.model.Project
import com.assistx.monitor.data.model.PcDevice
import com.assistx.monitor.data.repository.DeviceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class ProjectsViewModel : ViewModel() {

    private val repository = DeviceRepository

    private val _projects = MutableStateFlow<List<Project>>(emptyList())
    val projects: StateFlow<List<Project>> = _projects

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _summary = MutableStateFlow(ProjectsSummary())
    val summary: StateFlow<ProjectsSummary> = _summary

    data class ProjectsSummary(
        val totalProjects: Int = 0,
        val onlineNodes: Int = 0,
        val offlineNodes: Int = 0,
        val totalQuotaGb: Float = 0f
    )

    init {
        viewModelScope.launch {
            repository.devices.collectLatest { devices ->
                groupDevicesIntoProjects(devices)
            }
        }
        viewModelScope.launch {
            repository.isLoading.collectLatest { loading ->
                _isLoading.value = loading
            }
        }
    }

    fun refresh() {
        repository.fetchFromServer()
    }

    private fun groupDevicesIntoProjects(devices: List<PcDevice>) {
        // Gunakan nama non-null sebagai key, fallback ke "Unknown"
        val groupedMap = devices.groupBy { it.name ?: "Unknown" }
        var totalOnline = 0
        var totalOffline = 0
        var systemTotalQuota = 0f

        val projectList = groupedMap.map { (name, projectDevices) ->
            var totalCpu = 0.0
            var totalMem = 0.0
            var onlineCount = 0
            var offlineCount = 0
            var totalQuotaGb = 0f

            for (d in projectDevices) {
                if (d.isOnline) {
                    onlineCount++
                    totalOnline++
                    totalCpu += d.cpuUsage
                    totalMem += d.memoryUsage
                } else {
                    offlineCount++
                    totalOffline++
                }
                
                val quota = d.quotaGb ?: 0f
                totalQuotaGb += quota
                systemTotalQuota += quota
            }

            Project(
                name = name,
                nodes = projectDevices,
                totalCpu = totalCpu,
                totalMem = totalMem,
                onlineCount = onlineCount,
                offlineCount = offlineCount,
                totalQuotaGb = totalQuotaGb
            )
        }.sortedBy { it.name }

        _projects.value = projectList
        _summary.value = ProjectsSummary(
            totalProjects = projectList.size,
            onlineNodes = totalOnline,
            offlineNodes = totalOffline,
            totalQuotaGb = systemTotalQuota
        )
    }
}
