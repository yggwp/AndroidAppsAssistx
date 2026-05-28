package com.assistx.monitor.ui.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\'H\u0002J&\u0010(\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001d2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020/H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u00060"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DashboardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/assistx/monitor/databinding/FragmentDashboardBinding;", "binding", "getBinding", "()Lcom/assistx/monitor/databinding/FragmentDashboardBinding;", "deviceAdapter", "Lcom/assistx/monitor/ui/dashboard/DeviceAdapter;", "viewModel", "Lcom/assistx/monitor/ui/dashboard/DashboardViewModel;", "getViewModel", "()Lcom/assistx/monitor/ui/dashboard/DashboardViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadSummary", "", "observeData", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderDetailChart", "chart", "Lcom/github/mikephil/charting/charts/LineChart;", "history", "", "Lcom/assistx/monitor/network/ApiService$HistoryEntry;", "setupCharts", "setupDetailChart", "setupFilterChips", "setupRecyclerView", "setupSearch", "setupSwipeRefresh", "showDeviceDetail", "device", "Lcom/assistx/monitor/data/model/PcDevice;", "updateSparkline", "values", "", "colorInt", "", "updateSummary", "summary", "Lcom/assistx/monitor/network/ApiService$AnalyticsSummary;", "app_debug"})
public final class DashboardFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.assistx.monitor.databinding.FragmentDashboardBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.assistx.monitor.ui.dashboard.DeviceAdapter deviceAdapter;
    
    public DashboardFragment() {
        super();
    }
    
    private final com.assistx.monitor.databinding.FragmentDashboardBinding getBinding() {
        return null;
    }
    
    private final com.assistx.monitor.ui.dashboard.DashboardViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadSummary() {
    }
    
    private final void setupCharts() {
    }
    
    private final void updateSummary(com.assistx.monitor.network.ApiService.AnalyticsSummary summary) {
    }
    
    private final void updateSparkline(com.github.mikephil.charting.charts.LineChart chart, java.util.List<java.lang.Double> values, int colorInt) {
    }
    
    private final void setupSearch() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void showDeviceDetail(com.assistx.monitor.data.model.PcDevice device) {
    }
    
    /**
     * Setup tampilan dasar chart sebelum data masuk
     */
    private final void setupDetailChart(com.github.mikephil.charting.charts.LineChart chart) {
    }
    
    /**
     * Render chart dengan data history (sudah diurutkan lama → baru)
     */
    private final void renderDetailChart(com.github.mikephil.charting.charts.LineChart chart, java.util.List<com.assistx.monitor.network.ApiService.HistoryEntry> history) {
    }
    
    private final void setupFilterChips() {
    }
    
    private final void setupSwipeRefresh() {
    }
    
    private final void observeData() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}