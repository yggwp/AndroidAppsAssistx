package com.assistx.monitor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/assistx/monitor/AssistXApplication;", "Landroid/app/Application;", "()V", "<set-?>", "Lcom/assistx/monitor/data/local/PreferencesManager;", "preferencesManager", "getPreferencesManager", "()Lcom/assistx/monitor/data/local/PreferencesManager;", "applyTheme", "", "createNotificationChannels", "onCreate", "Companion", "app_debug"})
public final class AssistXApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHANNEL_SERVICE = "assistx_monitoring_service";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHANNEL_ALERTS = "assistx_alerts";
    private static com.assistx.monitor.AssistXApplication instance;
    private com.assistx.monitor.data.local.PreferencesManager preferencesManager;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.AssistXApplication.Companion Companion = null;
    
    public AssistXApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assistx.monitor.data.local.PreferencesManager getPreferencesManager() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void applyTheme() {
    }
    
    private final void createNotificationChannels() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/assistx/monitor/AssistXApplication$Companion;", "", "()V", "CHANNEL_ALERTS", "", "CHANNEL_SERVICE", "<set-?>", "Lcom/assistx/monitor/AssistXApplication;", "instance", "getInstance", "()Lcom/assistx/monitor/AssistXApplication;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.AssistXApplication getInstance() {
            return null;
        }
    }
}