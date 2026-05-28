package com.assistx.monitor.data.repository;

/**
 * Singleton repository untuk sharing data antara MonitoringService dan UI fragments.
 * Service menulis data dari SSE/polling, Fragment membaca via StateFlow.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010\u001c\u001a\u00020\u001a2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/assistx/monitor/data/repository/DeviceRepository;", "", "()V", "_devices", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/assistx/monitor/data/model/PcDevice;", "_error", "", "_isLoading", "", "_lastUpdate", "", "devices", "Lkotlinx/coroutines/flow/StateFlow;", "getDevices", "()Lkotlinx/coroutines/flow/StateFlow;", "error", "getError", "isFetching", "isLoading", "lastUpdate", "getLastUpdate", "scope", "Lkotlinx/coroutines/CoroutineScope;", "fetchFromServer", "", "getCachedDevices", "updateDevices", "app_debug"})
public final class DeviceRepository {
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> _devices = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> devices = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> _lastUpdate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.StateFlow<java.lang.Long> lastUpdate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.StateFlow<java.lang.String> error = null;
    @kotlin.jvm.Volatile
    private static volatile boolean isFetching = false;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.data.repository.DeviceRepository INSTANCE = null;
    
    private DeviceRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> getDevices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Long> getLastUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getError() {
        return null;
    }
    
    /**
     * Dipanggil oleh SSE atau polling untuk update data.
     */
    public final void updateDevices(@org.jetbrains.annotations.NotNull
    java.util.List<com.assistx.monitor.data.model.PcDevice> devices) {
    }
    
    /**
     * Dipanggil oleh fragment untuk fetch manual (pull-to-refresh).
     * Dilindungi guard agar tidak concurrent fetch.
     */
    public final void fetchFromServer() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.assistx.monitor.data.model.PcDevice> getCachedDevices() {
        return null;
    }
}