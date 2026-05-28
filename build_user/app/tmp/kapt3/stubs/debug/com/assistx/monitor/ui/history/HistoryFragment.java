package com.assistx.monitor.ui.history;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/assistx/monitor/ui/history/HistoryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/assistx/monitor/databinding/FragmentHistoryBinding;", "binding", "getBinding", "()Lcom/assistx/monitor/databinding/FragmentHistoryBinding;", "historyAdapter", "Lcom/assistx/monitor/ui/history/HistoryAdapter;", "lastSummary", "Lcom/assistx/monitor/ui/history/AnalyticsSummaryUi;", "showCpu", "", "showDisk", "showRam", "viewModel", "Lcom/assistx/monitor/ui/history/HistoryViewModel;", "getViewModel", "()Lcom/assistx/monitor/ui/history/HistoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeData", "", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupChart", "setupChartFilterChips", "updateChart", "summary", "app_debug"})
public final class HistoryFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.assistx.monitor.databinding.FragmentHistoryBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.assistx.monitor.ui.history.HistoryAdapter historyAdapter;
    private boolean showCpu = true;
    private boolean showRam = true;
    private boolean showDisk = true;
    @org.jetbrains.annotations.Nullable
    private com.assistx.monitor.ui.history.AnalyticsSummaryUi lastSummary;
    
    public HistoryFragment() {
        super();
    }
    
    private final com.assistx.monitor.databinding.FragmentHistoryBinding getBinding() {
        return null;
    }
    
    private final com.assistx.monitor.ui.history.HistoryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Setup chip filter CPU / RAM / DISK.
     * Jika tidak ada yang dipilih → tampilkan semua (fallback).
     */
    private final void setupChartFilterChips() {
    }
    
    private final void observeData() {
    }
    
    private final void setupChart() {
    }
    
    /**
     * Render grafik berdasarkan filter chip yang aktif.
     * Jika tidak ada yang dipilih → tampilkan semua dataset.
     */
    private final void updateChart(com.assistx.monitor.ui.history.AnalyticsSummaryUi summary) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}