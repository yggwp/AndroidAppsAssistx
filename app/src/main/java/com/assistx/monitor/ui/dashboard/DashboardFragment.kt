package com.assistx.monitor.ui.dashboard

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.assistx.monitor.R
import com.assistx.monitor.databinding.FragmentDashboardBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import android.graphics.Color
import androidx.core.content.ContextCompat

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    private val viewModel: DashboardViewModel by viewModels()
    private lateinit var deviceAdapter: DeviceAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDashboardBinding.bind(view)

        setupRecyclerView()
        setupFilterChips()
        setupSwipeRefresh()
        setupSearch()
        observeData()
        setupCharts()

        viewModel.loadDevices()
        loadSummary()
    }

    private fun loadSummary() {
        viewLifecycleOwner.lifecycleScope.launch {
            try {
                val service = com.assistx.monitor.network.ApiClient.getApiService()
                val summary = service.getAnalyticsSummary("daily")
                if (_binding != null) {
                    updateSummary(summary)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun setupCharts() {
        listOf(binding.chartCpu, binding.chartRam, binding.chartDisk).forEach { chart ->
            chart.apply {
                description.isEnabled = false
                legend.isEnabled = false
                xAxis.isEnabled = false
                axisLeft.isEnabled = false
                axisRight.isEnabled = false
                setTouchEnabled(false)
                setDrawGridBackground(false)
                setViewPortOffsets(0f, 0f, 0f, 0f)
            }
        }
    }

    private fun updateSummary(summary: com.assistx.monitor.network.ApiService.AnalyticsSummary) {
        val cpuAvg = summary.avg_cpu?.filter { it > 0 }?.average()?.let { if (it.isNaN()) 0.0 else it } ?: 0.0
        val ramAvg = summary.avg_memory?.filter { it > 0 }?.average()?.let { if (it.isNaN()) 0.0 else it } ?: 0.0
        val diskAvg = summary.avg_storage?.filter { it > 0 }?.average()?.let { if (it.isNaN()) 0.0 else it } ?: 0.0

        binding.tvAvgCpu.text = "${cpuAvg.toInt()}%"
        binding.tvAvgRam.text = "${ramAvg.toInt()}%"
        binding.tvAvgDisk.text = "${diskAvg.toInt()}%"

        updateSparkline(binding.chartCpu, summary.avg_cpu ?: emptyList(), ContextCompat.getColor(requireContext(), R.color.brand_blue))
        updateSparkline(binding.chartRam, summary.avg_memory ?: emptyList(), ContextCompat.getColor(requireContext(), R.color.warning_orange))
        updateSparkline(binding.chartDisk, summary.avg_storage ?: emptyList(), ContextCompat.getColor(requireContext(), R.color.storage_blue))
    }

    private fun updateSparkline(chart: com.github.mikephil.charting.charts.LineChart, values: List<Double>, colorInt: Int) {
        val entries = values.mapIndexed { i, v -> Entry(i.toFloat(), v.toFloat()) }
        val set = LineDataSet(entries, "").apply {
            color = colorInt
            setDrawCircles(false)
            setDrawValues(false)
            lineWidth = 2f
            mode = LineDataSet.Mode.CUBIC_BEZIER
            setDrawFilled(true)
            fillColor = colorInt
            fillAlpha = 30
        }
        chart.data = LineData(set)
        chart.invalidate()
    }

    private fun setupSearch() {
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                viewModel.setSearchQuery(s?.toString() ?: "")
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }

    private fun setupRecyclerView() {
        deviceAdapter = DeviceAdapter { device ->
            showDeviceDetail(device)
        }
        binding.rvDevices.layoutManager = LinearLayoutManager(requireContext())
        binding.rvDevices.adapter = deviceAdapter
    }

    private fun showDeviceDetail(device: com.assistx.monitor.data.model.PcDevice) {
        val bottomSheet = com.google.android.material.bottomsheet.BottomSheetDialog(requireContext())
        val view = layoutInflater.inflate(R.layout.layout_device_detail, null)

        val tvTitle     = view.findViewById<android.widget.TextView>(R.id.tvDetailTitle)
        val tvSubtitle  = view.findViewById<android.widget.TextView>(R.id.tvDetailSubtitle)
        val statusBadge = view.findViewById<android.widget.TextView>(R.id.statusBadge)
        val tvAvgCpu    = view.findViewById<android.widget.TextView>(R.id.tvAvgCpu)
        val tvAvgRam    = view.findViewById<android.widget.TextView>(R.id.tvAvgRam)
        val tvAvgDisk   = view.findViewById<android.widget.TextView>(R.id.tvAvgDisk)
        val usageChart  = view.findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.usageChart)
        val chartProgress = view.findViewById<android.widget.ProgressBar>(R.id.chartProgress)
        val rvStatusLog = view.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.rvStatusLog)
        val tvLogEmpty  = view.findViewById<android.widget.TextView>(R.id.tvLogEmpty)
        val btnClose    = view.findViewById<android.view.View>(R.id.btnClose)

        // Header info
        tvTitle.text = device.name ?: "Unknown"
        tvSubtitle.text = "SN: ${device.serialNumber?.takeIf { it.isNotBlank() } ?: "N/A"}"

        // Status badge
        when {
            !device.isOnline -> {
                statusBadge.text = "OFFLINE"
                statusBadge.setTextColor(ContextCompat.getColor(requireContext(), R.color.danger_red))
                statusBadge.setBackgroundResource(R.drawable.bg_status_badge_offline)
            }
            device.cpuUsage >= 97 || device.memoryUsage >= 98 || device.storageUsage >= 97 -> {
                statusBadge.text = "WARNING"
                statusBadge.setTextColor(ContextCompat.getColor(requireContext(), R.color.warning_orange))
                statusBadge.setBackgroundResource(R.drawable.bg_status_badge_alert)
            }
            else -> {
                statusBadge.text = "ONLINE"
                statusBadge.setTextColor(ContextCompat.getColor(requireContext(), R.color.success_green))
                statusBadge.setBackgroundResource(R.drawable.bg_status_badge_online)
            }
        }

        // Usage saat ini
        tvAvgCpu.text = "${device.cpuUsage.toInt()}%"
        tvAvgRam.text = "${device.memoryUsage.toInt()}%"
        tvAvgDisk.text = "${device.storageUsage.toInt()}%"

        // Setup chart dasar
        setupDetailChart(usageChart)

        // RecyclerView log — non-scrollable
        rvStatusLog.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(requireContext())
        rvStatusLog.isNestedScrollingEnabled = false

        // Fetch history dari API
        val deviceId = device.id
        if (deviceId != null) {
            chartProgress.visibility = android.view.View.VISIBLE
            viewLifecycleOwner.lifecycleScope.launch {
                try {
                    val history = com.assistx.monitor.network.ApiClient.getApiService()
                        .getClientHistory(deviceId)

                    if (_binding == null) return@launch

                    chartProgress.visibility = android.view.View.GONE

                    if (history.isNotEmpty()) {
                        // Render chart — data dari API sudah urut terbaru ke terlama, balik agar kiri = lama
                        val sorted = history.reversed()
                        renderDetailChart(usageChart, sorted)

                        // Buat log perubahan status (hanya entry yang statusnya berubah)
                        val statusChanges = mutableListOf<StatusLogEntry>()
                        var prevStatus: String? = null
                        for (entry in sorted) {
                            val cur = entry.status.lowercase()
                            if (cur != prevStatus) {
                                statusChanges.add(StatusLogEntry(entry.timestamp, cur))
                                prevStatus = cur
                            }
                        }
                        // Tampilkan log terbaru di atas
                        val logEntries = statusChanges.reversed()

                        if (logEntries.isEmpty()) {
                            tvLogEmpty.visibility = android.view.View.VISIBLE
                            rvStatusLog.visibility = android.view.View.GONE
                        } else {
                            tvLogEmpty.visibility = android.view.View.GONE
                            rvStatusLog.visibility = android.view.View.VISIBLE
                            rvStatusLog.adapter = StatusLogAdapter(logEntries)
                        }
                    } else {
                        chartProgress.visibility = android.view.View.GONE
                        tvLogEmpty.visibility = android.view.View.VISIBLE
                        rvStatusLog.visibility = android.view.View.GONE
                    }
                } catch (e: Exception) {
                    if (_binding == null) return@launch
                    chartProgress.visibility = android.view.View.GONE
                    tvLogEmpty.text = "Gagal memuat data: ${e.message?.take(60)}"
                    tvLogEmpty.visibility = android.view.View.VISIBLE
                    rvStatusLog.visibility = android.view.View.GONE
                }
            }
        } else {
            chartProgress.visibility = android.view.View.GONE
            tvLogEmpty.visibility = android.view.View.VISIBLE
            rvStatusLog.visibility = android.view.View.GONE
        }

        btnClose.setOnClickListener { bottomSheet.dismiss() }
        bottomSheet.setContentView(view)
        bottomSheet.show()
    }

    /** Setup tampilan dasar chart sebelum data masuk */
    private fun setupDetailChart(chart: com.github.mikephil.charting.charts.LineChart) {
        chart.apply {
            description.isEnabled = false
            setTouchEnabled(true)
            isDragEnabled = true
            setScaleEnabled(false)
            setPinchZoom(false)
            setDrawGridBackground(false)
            legend.isEnabled = true
            legend.textColor = android.graphics.Color.GRAY
            legend.textSize = 10f

            xAxis.apply {
                position = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
                textColor = android.graphics.Color.GRAY
                setDrawGridLines(false)
                setDrawLabels(false)
            }
            axisLeft.apply {
                textColor = android.graphics.Color.GRAY
                setDrawGridLines(true)
                axisMinimum = 0f
                axisMaximum = 100f
            }
            axisRight.isEnabled = false
        }
    }

    /** Render chart dengan data history (sudah diurutkan lama → baru) */
    private fun renderDetailChart(
        chart: com.github.mikephil.charting.charts.LineChart,
        history: List<com.assistx.monitor.network.ApiService.HistoryEntry>
    ) {
        val cpuColor  = ContextCompat.getColor(requireContext(), R.color.brand_blue)
        val ramColor  = ContextCompat.getColor(requireContext(), R.color.warning_orange)

        val cpuEntries = history.mapIndexed { i, h ->
            com.github.mikephil.charting.data.Entry(i.toFloat(), h.cpu_usage.toFloat())
        }
        val ramEntries = history.mapIndexed { i, h ->
            com.github.mikephil.charting.data.Entry(i.toFloat(), h.memory_usage.toFloat())
        }

        val cpuSet = com.github.mikephil.charting.data.LineDataSet(cpuEntries, "CPU").apply {
            color = cpuColor
            setCircleColor(cpuColor)
            lineWidth = 2f
            circleRadius = 1.5f
            setDrawValues(false)
            mode = com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER
        }
        val ramSet = com.github.mikephil.charting.data.LineDataSet(ramEntries, "RAM").apply {
            color = ramColor
            setCircleColor(ramColor)
            lineWidth = 2f
            circleRadius = 1.5f
            setDrawValues(false)
            mode = com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER
        }

        chart.data = com.github.mikephil.charting.data.LineData(cpuSet, ramSet)
        chart.invalidate()
    }

    private fun setupFilterChips() {
        binding.chipAll.setOnClickListener { viewModel.setFilter(DeviceFilter.ALL) }
        binding.chipOnline.setOnClickListener { viewModel.setFilter(DeviceFilter.ONLINE) }
        binding.chipOffline.setOnClickListener { viewModel.setFilter(DeviceFilter.OFFLINE) }
        binding.chipAlerts.setOnClickListener { viewModel.setFilter(DeviceFilter.ALERTS) }
    }

    private fun setupSwipeRefresh() {
        binding.swipeRefresh.setOnRefreshListener {
            viewModel.refresh()
        }
    }

    private fun observeData() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.filteredDevices.collectLatest { devices ->
                val list = mutableListOf<DeviceListItem>()
                val grouped = devices.groupBy { it.location ?: "Unknown" }
                grouped.forEach { (location, deviceList) ->
                    list.add(DeviceListItem.Header(location))
                    list.addAll(deviceList.map { DeviceListItem.Device(it) })
                }
                deviceAdapter.submitList(list)
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.isLoading.collectLatest { loading ->
                binding.swipeRefresh.isRefreshing = loading
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.counts.collectLatest { counts ->
                binding.chipAll.text = "Semua (${counts.total})"
                binding.chipOnline.text = "Online (${counts.online})"
                binding.chipOffline.text = "Offline (${counts.offline})"
                binding.chipAlerts.text = "Peringatan (${counts.alert})"
                
                binding.tvStatusSubtitle.text = "Memantau ${counts.total} node klien secara real-time"
            }
        }

        binding.btnRefresh.setOnClickListener {
            viewModel.refresh()
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.activeFilter.collectLatest { filter ->
                binding.chipAll.isChecked = filter == DeviceFilter.ALL
                binding.chipOnline.isChecked = filter == DeviceFilter.ONLINE
                binding.chipOffline.isChecked = filter == DeviceFilter.OFFLINE
                binding.chipAlerts.isChecked = filter == DeviceFilter.ALERTS
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.error.collectLatest { msg ->
                binding.tvError.text = msg
                binding.tvError.visibility = View.VISIBLE
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
