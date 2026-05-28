package com.assistx.monitor.ui.history

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.assistx.monitor.R
import com.assistx.monitor.databinding.FragmentHistoryBinding
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class HistoryFragment : Fragment(R.layout.fragment_history) {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!
    private val viewModel: HistoryViewModel by viewModels()
    private lateinit var historyAdapter: HistoryAdapter

    // State filter grafik — default semua aktif
    private var showCpu = true
    private var showRam = true
    private var showDisk = true

    // Cache summary terakhir agar bisa re-render saat chip berubah
    private var lastSummary: AnalyticsSummaryUi? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHistoryBinding.bind(view)

        historyAdapter = HistoryAdapter()
        binding.rvHistory.layoutManager = LinearLayoutManager(requireContext())
        binding.rvHistory.adapter = historyAdapter

        setupChart()
        setupChartFilterChips()

        binding.toggleGroup.addOnButtonCheckedListener { _, checkedId, isChecked ->
            if (!isChecked) return@addOnButtonCheckedListener
            val range = when (checkedId) {
                R.id.btnDaily -> "daily"
                R.id.btnWeekly -> "weekly"
                R.id.btnMonthly -> "monthly"
                else -> "daily"
            }
            viewModel.loadSummary(range)
        }

        observeData()
        viewModel.loadSummary("daily")
    }

    /**
     * Setup chip filter CPU / RAM / DISK.
     * Jika tidak ada yang dipilih → tampilkan semua (fallback).
     */
    private fun setupChartFilterChips() {
        val onChipChanged = {
            val cpuChecked = binding.chipCpu.isChecked
            val ramChecked = binding.chipRam.isChecked
            val diskChecked = binding.chipDisk.isChecked

            // Jika tidak ada yang dipilih, tampilkan semua
            val noneSelected = !cpuChecked && !ramChecked && !diskChecked
            showCpu = if (noneSelected) true else cpuChecked
            showRam = if (noneSelected) true else ramChecked
            showDisk = if (noneSelected) true else diskChecked

            lastSummary?.let { updateChart(it) }
        }

        binding.chipCpu.setOnCheckedChangeListener { _, _ -> onChipChanged() }
        binding.chipRam.setOnCheckedChangeListener { _, _ -> onChipChanged() }
        binding.chipDisk.setOnCheckedChangeListener { _, _ -> onChipChanged() }
    }

    private fun observeData() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.summary.collectLatest { summary ->
                if (_binding == null || summary == null) return@collectLatest

                lastSummary = summary

                // Update Average Usage Cards
                val globalAvgCpu = summary.avgCpus.filter { it > 0 }.average()
                    .let { if (it.isNaN()) 0.0 else it }
                val globalAvgMem = summary.avgMems.filter { it > 0 }.average()
                    .let { if (it.isNaN()) 0.0 else it }
                val globalAvgStorage = summary.avgStorages.filter { it > 0 }.average()
                    .let { if (it.isNaN()) 0.0 else it }

                binding.tvAvgCpu.text = String.format("%.1f%%", globalAvgCpu)
                binding.tvAvgRam.text = String.format("%.1f%%", globalAvgMem)
                binding.tvAvgStorage.text = String.format("%.1f%%", globalAvgStorage)

                // Update timeline list
                historyAdapter.submitList(
                    summary.labels.zip(summary.onlineCounts)
                        .mapIndexed { index, (label, online) ->
                            TimelineItem(
                                timestamp = label,
                                online = online,
                                offline = summary.offlineCounts.getOrElse(index) { 0 },
                                avgCpu = summary.avgCpus.getOrElse(index) { 0.0 },
                                avgMem = summary.avgMems.getOrElse(index) { 0.0 },
                                avgStorage = summary.avgStorages.getOrElse(index) { 0.0 }
                            )
                        }
                )

                updateChart(summary)
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.isLoading.collectLatest { loading ->
                if (_binding != null) {
                    binding.progressBar.visibility = if (loading) View.VISIBLE else View.GONE
                }
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.error.collectLatest { msg ->
                if (_binding != null) {
                    binding.tvError.text = msg
                    binding.tvError.visibility = if (msg != null) View.VISIBLE else View.GONE
                }
            }
        }
    }

    private fun setupChart() {
        binding.historyChart.apply {
            description.isEnabled = false
            setTouchEnabled(true)
            isDragEnabled = true
            setScaleEnabled(true)
            setPinchZoom(true)
            setDrawGridBackground(false)
            legend.isEnabled = true
            legend.textColor = Color.GRAY
            legend.textSize = 11f

            xAxis.apply {
                position = XAxis.XAxisPosition.BOTTOM
                textColor = Color.GRAY
                setDrawGridLines(false)
                setDrawLabels(false) // label terlalu padat, sembunyikan
            }

            axisLeft.apply {
                textColor = Color.GRAY
                setDrawGridLines(true)
                axisMinimum = 0f
                axisMaximum = 100f
            }

            axisRight.isEnabled = false
        }
    }

    /**
     * Render grafik berdasarkan filter chip yang aktif.
     * Jika tidak ada yang dipilih → tampilkan semua dataset.
     */
    private fun updateChart(summary: AnalyticsSummaryUi) {
        if (_binding == null) return

        val cpuColor  = ContextCompat.getColor(requireContext(), R.color.brand_blue)
        val ramColor  = ContextCompat.getColor(requireContext(), R.color.warning_orange)
        val diskColor = ContextCompat.getColor(requireContext(), R.color.storage_blue)

        val datasets = mutableListOf<LineDataSet>()

        if (showCpu) {
            val entries = summary.avgCpus.mapIndexed { i, v -> Entry(i.toFloat(), v.toFloat()) }
            datasets.add(LineDataSet(entries, "CPU").apply {
                color = cpuColor
                setCircleColor(cpuColor)
                lineWidth = 2f
                circleRadius = 2f
                setDrawValues(false)
                mode = LineDataSet.Mode.CUBIC_BEZIER
            })
        }

        if (showRam) {
            val entries = summary.avgMems.mapIndexed { i, v -> Entry(i.toFloat(), v.toFloat()) }
            datasets.add(LineDataSet(entries, "RAM").apply {
                color = ramColor
                setCircleColor(ramColor)
                lineWidth = 2f
                circleRadius = 2f
                setDrawValues(false)
                mode = LineDataSet.Mode.CUBIC_BEZIER
            })
        }

        if (showDisk) {
            val entries = summary.avgStorages.mapIndexed { i, v -> Entry(i.toFloat(), v.toFloat()) }
            datasets.add(LineDataSet(entries, "DISK").apply {
                color = diskColor
                setCircleColor(diskColor)
                lineWidth = 2f
                circleRadius = 2f
                setDrawValues(false)
                mode = LineDataSet.Mode.CUBIC_BEZIER
            })
        }

        if (datasets.isEmpty()) {
            binding.historyChart.clear()
            binding.historyChart.invalidate()
            return
        }

        binding.historyChart.data = LineData(datasets.map { it })
        binding.historyChart.invalidate()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

data class TimelineItem(
    val timestamp: String,
    val online: Int,
    val offline: Int,
    val avgCpu: Double,
    val avgMem: Double,
    val avgStorage: Double
)
