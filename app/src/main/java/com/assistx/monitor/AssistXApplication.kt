package com.assistx.monitor

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.assistx.monitor.data.local.PreferencesManager
import com.assistx.monitor.network.ApiClient
import com.assistx.monitor.service.MonitoringService
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

class AssistXApplication : Application() {

    companion object {
        const val CHANNEL_SERVICE = "assistx_monitoring_service"
        const val CHANNEL_ALERTS = "assistx_alerts"
        lateinit var instance: AssistXApplication
            private set
    }

    lateinit var preferencesManager: PreferencesManager
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this
        preferencesManager = PreferencesManager(this)
        
        // Apply saved theme preference globally
        applyTheme()
        
        ApiClient.init(preferencesManager)
        createNotificationChannels()
    }

    private fun applyTheme() {
        runCatching {
            val isDark = runBlocking { preferencesManager.darkMode.first() }
            val mode = if (isDark) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
            AppCompatDelegate.setDefaultNightMode(mode)
        } // Jika gagal (DataStore corrupt), gunakan default light
    }

    private fun createNotificationChannels() {
        val notificationManager = getSystemService(NotificationManager::class.java)
        
        // Service channel (silent, runs 24/7)
        val serviceChannel = NotificationChannel(
            CHANNEL_SERVICE,
            "Monitoring Service",
            NotificationManager.IMPORTANCE_LOW
        ).apply {
            description = "Menampilkan status monitoring yang berjalan 24/7"
            setShowBadge(false)
        }
        
        // Alert channel (popup + sound)
        val alertChannel = NotificationChannel(
            CHANNEL_ALERTS,
            "Alerts & Notifications",
            NotificationManager.IMPORTANCE_HIGH
        ).apply {
            description = "Notifikasi penting saat ada perangkat offline atau kuota kritis"
            enableVibration(true)
            enableLights(true)
        }
        
        notificationManager.createNotificationChannel(serviceChannel)
        notificationManager.createNotificationChannel(alertChannel)
    }
}
