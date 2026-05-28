package com.assistx.monitor.service

import android.app.PendingIntent
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import androidx.lifecycle.LifecycleService
import androidx.lifecycle.lifecycleScope
import com.assistx.monitor.AssistXApplication
import com.assistx.monitor.R
import com.assistx.monitor.data.model.PcDevice
import com.assistx.monitor.data.repository.DeviceRepository
import com.assistx.monitor.network.ApiClient
import com.assistx.monitor.sync.SSEManager
import com.assistx.monitor.sync.SseState
import com.assistx.monitor.ui.MainActivity
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.util.concurrent.ConcurrentHashMap

class MonitoringService : LifecycleService() {

    companion object {
        const val NOTIFICATION_ID = 1001
        const val ACTION_STOP = "com.assistx.monitor.STOP_SERVICE"
        private const val DEFAULT_POLL_INTERVAL_MS = 10_000L
    }

    private lateinit var sseManager: SSEManager
    private var pollingJob: Job? = null
    private val previousStates = ConcurrentHashMap<String, PcDevice>()

    override fun onCreate() {
        super.onCreate()
        sseManager = SSEManager()
        startForeground()
        startMonitoring()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) {
            stopSelf()
            return START_NOT_STICKY
        }
        return START_STICKY
    }

    override fun onBind(intent: Intent): IBinder? = null

    private fun startForeground() {
        val pendingIntent = PendingIntent.getActivity(
            this, 0, Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        val notification = NotificationCompat.Builder(this, AssistXApplication.CHANNEL_SERVICE)
            .setContentTitle("AssistX Monitoring")
            .setContentText("Memantau semua perangkat 24/7")
            .setSmallIcon(R.drawable.ic_monitor)
            .setContentIntent(pendingIntent)
            .setOngoing(true)
            .setSilent(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()
        startForeground(NOTIFICATION_ID, notification)
    }

    private fun startMonitoring() {
        // Initial fetch saat service start
        lifecycleScope.launch {
            try {
                val devices = ApiClient.getApiService().getClients()
                DeviceRepository.updateDevices(devices)
                processDeviceUpdate(devices)
            } catch (_: Exception) { }
        }

        // Collect SSE device updates
        lifecycleScope.launch {
            try {
                sseManager.deviceUpdates.collect { devices ->
                    try {
                        DeviceRepository.updateDevices(devices)
                        processDeviceUpdate(devices)
                    } catch (_: Exception) { }
                }
            } catch (_: Exception) { }
        }

        // Observe SSE connection state untuk fallback polling
        lifecycleScope.launch {
            try {
                sseManager.connectionState.collect { state ->
                    when (state) {
                        SseState.DISCONNECTED -> startPollingFallback()
                        SseState.CONNECTED -> stopPollingFallback()
                        SseState.CONNECTING -> { /* tunggu */ }
                    }
                }
            } catch (_: Exception) { }
        }

        // Mulai SSE
        try {
            sseManager.connect()
        } catch (_: Exception) {
            startPollingFallback()
        }
    }

    private fun startPollingFallback() {
        if (pollingJob?.isActive == true) return // sudah berjalan
        pollingJob = lifecycleScope.launch {
            val pollMs = getPollIntervalMs()
            while (isActive) {
                try {
                    val devices = ApiClient.getApiService().getClients()
                    DeviceRepository.updateDevices(devices)
                    processDeviceUpdate(devices)
                } catch (_: Exception) { }
                delay(pollMs)
            }
        }
    }

    private fun stopPollingFallback() {
        pollingJob?.cancel()
        pollingJob = null
    }

    /**
     * Baca poll interval dari preferences secara aman.
     * Fallback ke default jika gagal.
     */
    private suspend fun getPollIntervalMs(): Long {
        return try {
            val seconds = AssistXApplication.instance.preferencesManager.pollInterval.first()
            (seconds * 1000L).coerceAtLeast(3000L)
        } catch (_: Exception) {
            DEFAULT_POLL_INTERVAL_MS
        }
    }

    private fun processDeviceUpdate(devices: List<PcDevice>?) {
        if (devices.isNullOrEmpty()) return
        val alertManager = try {
            AlertManager.getInstance(this)
        } catch (_: Exception) {
            return
        }
        for (device in devices) {
            val id = device.id ?: continue
            val prev = previousStates[id]
            if (prev != null) {
                try {
                    alertManager.checkAndAlert(prev, device)
                } catch (_: Exception) { }
            }
            previousStates[id] = device
        }
    }

    override fun onDestroy() {
        sseManager.destroy()
        pollingJob?.cancel()
        super.onDestroy()
    }
}
