package com.assistx.monitor.ui.alerts;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/assistx/monitor/ui/alerts/AlertsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_alertCount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_alertDevices", "", "Lcom/assistx/monitor/data/model/PcDevice;", "alertCount", "Lkotlinx/coroutines/flow/StateFlow;", "getAlertCount", "()Lkotlinx/coroutines/flow/StateFlow;", "alertDevices", "getAlertDevices", "loadAlertDevices", "", "refresh", "app_debug"})
public final class AlertsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> _alertDevices = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> alertDevices = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _alertCount = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> alertCount = null;
    
    public AlertsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> getAlertDevices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getAlertCount() {
        return null;
    }
    
    public final void loadAlertDevices() {
    }
    
    public final void refresh() {
    }
}