package com.assistx.monitor.ui.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007\u00a8\u0006!"}, d2 = {"Lcom/assistx/monitor/ui/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "alertsEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "getAlertsEnabled", "()Lkotlinx/coroutines/flow/Flow;", "authPassword", "", "getAuthPassword", "authUsername", "getAuthUsername", "darkMode", "getDarkMode", "pollInterval", "", "getPollInterval", "prefs", "Lcom/assistx/monitor/data/local/PreferencesManager;", "serverUrl", "getServerUrl", "setAlertsEnabled", "", "enabled", "setCredentials", "username", "password", "setDarkMode", "setPollInterval", "seconds", "setServerUrl", "url", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.assistx.monitor.data.local.PreferencesManager prefs = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> serverUrl = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> darkMode = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> alertsEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> pollInterval = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> authUsername = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> authPassword = null;
    
    public SettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getServerUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getAlertsEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getPollInterval() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getAuthUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getAuthPassword() {
        return null;
    }
    
    public final void setServerUrl(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public final void setCredentials(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void setDarkMode(boolean enabled) {
    }
    
    public final void setAlertsEnabled(boolean enabled) {
    }
    
    public final void setPollInterval(int seconds) {
    }
}