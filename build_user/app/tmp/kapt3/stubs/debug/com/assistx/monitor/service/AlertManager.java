package com.assistx.monitor.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\b\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/assistx/monitor/service/AlertManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lastAlertState", "Ljava/util/concurrent/ConcurrentHashMap;", "", "lastAlertTime", "", "notifIdCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "prefs", "Lcom/assistx/monitor/data/local/PreferencesManager;", "checkAndAlert", "", "previous", "Lcom/assistx/monitor/data/model/PcDevice;", "current", "showAlertNotification", "title", "body", "showAlertNotification$app_debug", "showPopupAlert", "device", "alertType", "Companion", "app_debug"})
public final class AlertManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.assistx.monitor.service.AlertManager instance;
    @org.jetbrains.annotations.NotNull
    private final com.assistx.monitor.data.local.PreferencesManager prefs = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> lastAlertState = null;
    @org.jetbrains.annotations.NotNull
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> lastAlertTime;
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicInteger notifIdCounter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.service.AlertManager.Companion Companion = null;
    
    private AlertManager(android.content.Context context) {
        super();
    }
    
    public final void checkAndAlert(@org.jetbrains.annotations.NotNull
    com.assistx.monitor.data.model.PcDevice previous, @org.jetbrains.annotations.NotNull
    com.assistx.monitor.data.model.PcDevice current) {
    }
    
    /**
     * Show notification — internal visibility so AssistXFCMService can call directly.
     */
    public final void showAlertNotification$app_debug(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String body) {
    }
    
    private final void showPopupAlert(com.assistx.monitor.data.model.PcDevice device, java.lang.String alertType) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/assistx/monitor/service/AlertManager$Companion;", "", "()V", "instance", "Lcom/assistx/monitor/service/AlertManager;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.service.AlertManager getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}