package com.assistx.monitor.ui.projects

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.assistx.monitor.R
import com.assistx.monitor.databinding.FragmentProjectsBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class ProjectsFragment : Fragment(R.layout.fragment_projects) {

    private var _binding: FragmentProjectsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ProjectsViewModel by viewModels()
    private lateinit var projectsAdapter: ProjectsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProjectsBinding.bind(view)

        setupRecyclerView()
        setupSwipeRefresh()
        observeData()

        viewModel.refresh()
    }

    private fun setupRecyclerView() {
        projectsAdapter = ProjectsAdapter()
        binding.rvProjects.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = projectsAdapter
        }
    }

    private fun setupSwipeRefresh() {
        binding.swipeRefreshProjects.setOnRefreshListener {
            viewModel.refresh()
        }
    }

    private fun observeData() {
        // Observe projects list
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.projects.collectLatest { projectsList ->
                projectsAdapter.submitList(projectsList)
            }
        }

        // Observe loading state
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.isLoading.collectLatest { loading ->
                binding.swipeRefreshProjects.isRefreshing = loading
            }
        }

        // Observe stats summary
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.summary.collectLatest { summary ->
                binding.tvProjectSubtitle.text = "Mengelompokkan ${summary.totalProjects} proyek secara real-time"
                binding.tvTotalProjects.text = summary.totalProjects.toString()
                binding.tvOnlineNodes.text = "${summary.onlineNodes} / ${summary.onlineNodes + summary.offlineNodes}"
                binding.tvTotalQuota.text = String.format("%.1f GB", summary.totalQuotaGb)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
