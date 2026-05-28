package com.assistx.monitor.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\fH\u0082@\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\"\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/assistx/monitor/service/MonitoringService;", "Landroidx/lifecycle/LifecycleService;", "()V", "pollingJob", "Lkotlinx/coroutines/Job;", "previousStates", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/assistx/monitor/data/model/PcDevice;", "sseManager", "Lcom/assistx/monitor/sync/SSEManager;", "getPollIntervalMs", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "processDeviceUpdate", "devices", "", "startForeground", "startMonitoring", "startPollingFallback", "stopPollingFallback", "Companion", "app_debug"})
public final class MonitoringService extends androidx.lifecycle.LifecycleService {
    public static final int NOTIFICATION_ID = 1001;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_STOP = "com.assistx.monitor.STOP_SERVICE";
    private static final long DEFAULT_POLL_INTERVAL_MS = 10000L;
    private com.assistx.monitor.sync.SSEManager sseManager;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job pollingJob;
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.assistx.monitor.data.model.PcDevice> previousStates = null;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.service.MonitoringService.Companion Companion = null;
    
    public MonitoringService() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    private final void startForeground() {
    }
    
    private final void startMonitoring() {
    }
    
    private final void startPollingFallback() {
    }
    
    private final void stopPollingFallback() {
    }
    
    /**
     * Baca poll interval dari preferences secara aman.
     * Fallback ke default jika gagal.
     */
    private final java.lang.Object getPollIntervalMs(kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    private final void processDeviceUpdate(java.util.List<com.assistx.monitor.data.model.PcDevice> devices) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/assistx/monitor/service/MonitoringService$Companion;", "", "()V", "ACTION_STOP", "", "DEFAULT_POLL_INTERVAL_MS", "", "NOTIFICATION_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}