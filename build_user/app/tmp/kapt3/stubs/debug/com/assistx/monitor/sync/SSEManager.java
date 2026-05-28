package com.assistx.monitor.sync;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001aJ\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/assistx/monitor/sync/SSEManager;", "", "()V", "_connectionState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/assistx/monitor/sync/SseState;", "_deviceUpdates", "", "Lcom/assistx/monitor/data/model/PcDevice;", "connectionState", "Lkotlinx/coroutines/flow/SharedFlow;", "getConnectionState", "()Lkotlinx/coroutines/flow/SharedFlow;", "deviceUpdates", "getDeviceUpdates", "eventSource", "Lokhttp3/sse/EventSource;", "gson", "Lcom/google/gson/Gson;", "isDestroyed", "", "reconnectAttempts", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "connect", "", "destroy", "disconnect", "parseAndEmit", "data", "", "scheduleReconnect", "Companion", "app_debug"})
public final class SSEManager {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "SSEManager";
    private static final long MAX_RECONNECT_DELAY = 30000L;
    private static final long BASE_RECONNECT_DELAY = 2000L;
    @org.jetbrains.annotations.Nullable
    private okhttp3.sse.EventSource eventSource;
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    private int reconnectAttempts = 0;
    private boolean isDestroyed = false;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> _deviceUpdates = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> deviceUpdates = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.assistx.monitor.sync.SseState> _connectionState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.assistx.monitor.sync.SseState> connectionState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.sync.SSEManager.Companion Companion = null;
    
    public SSEManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> getDeviceUpdates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.assistx.monitor.sync.SseState> getConnectionState() {
        return null;
    }
    
    public final void connect() {
    }
    
    private final void parseAndEmit(java.lang.String data) {
    }
    
    private final void scheduleReconnect() {
    }
    
    public final void disconnect() {
    }
    
    public final void destroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/assistx/monitor/sync/SSEManager$Companion;", "", "()V", "BASE_RECONNECT_DELAY", "", "MAX_RECONNECT_DELAY", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}