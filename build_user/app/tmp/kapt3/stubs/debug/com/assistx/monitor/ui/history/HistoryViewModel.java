package com.assistx.monitor.ui.history;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/assistx/monitor/ui/history/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_error", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_summary", "Lcom/assistx/monitor/ui/history/AnalyticsSummaryUi;", "error", "Lkotlinx/coroutines/flow/SharedFlow;", "getError", "()Lkotlinx/coroutines/flow/SharedFlow;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "summary", "getSummary", "loadSummary", "", "range", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assistx.monitor.ui.history.AnalyticsSummaryUi> _summary = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.history.AnalyticsSummaryUi> summary = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.String> error = null;
    
    public HistoryViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.history.AnalyticsSummaryUi> getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<java.lang.String> getError() {
        return null;
    }
    
    public final void loadSummary(@org.jetbrains.annotations.NotNull
    java.lang.String range) {
    }
}