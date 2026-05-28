package com.assistx.monitor.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.assistx.monitor.AssistXApplication
import com.assistx.monitor.R
import com.assistx.monitor.databinding.ActivityMainBinding
import com.assistx.monitor.service.MonitoringService
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    
    // Launcher untuk request permission notifikasi
    private val notificationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        // Tidak perlu action khusus, notifikasi akan berfungsi jika granted
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // Apply theme before super.onCreate
        applyThemeSync()
        
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigation()
        requestNotificationPermissionIfNeeded()
        startMonitoringService()
        
        // Also observe changes for future updates
        observeThemeChanges()
    }

    private fun applyThemeSync() {
        runCatching {
            val isDark = runBlocking { AssistXApplication.instance.preferencesManager.darkMode.first() }
            val mode = if (isDark) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
            AppCompatDelegate.setDefaultNightMode(mode)
        } // Jika gagal (DataStore corrupt), gunakan default light
    }

    private fun observeThemeChanges() {
        lifecycleScope.launch {
            try {
                AssistXApplication.instance.preferencesManager.darkMode.collect { isDark ->
                    val mode = if (isDark) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
                    if (AppCompatDelegate.getDefaultNightMode() != mode) {
                        AppCompatDelegate.setDefaultNightMode(mode)
                    }
                }
            } catch (_: Exception) { }
        }
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNav.setupWithNavController(navController)
    }

    private fun requestNotificationPermissionIfNeeded() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED
            ) {
                notificationPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            }
        }
    }

    private fun startMonitoringService() {
        val intent = Intent(this, MonitoringService::class.java)
        ContextCompat.startForegroundService(this, intent)
    }
}
