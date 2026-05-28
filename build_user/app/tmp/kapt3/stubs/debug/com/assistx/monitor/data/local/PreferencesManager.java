package com.assistx.monitor.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010!\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010(R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\u00a8\u0006*"}, d2 = {"Lcom/assistx/monitor/data/local/PreferencesManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alertsEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "getAlertsEnabled", "()Lkotlinx/coroutines/flow/Flow;", "authPassword", "", "getAuthPassword", "authUsername", "getAuthUsername", "darkMode", "getDarkMode", "firstRun", "getFirstRun", "pollInterval", "", "getPollInterval", "serverUrl", "getServerUrl", "setAlertsEnabled", "", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCredentials", "username", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDarkMode", "setFirstRunComplete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPollInterval", "seconds", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setServerUrl", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class PreferencesManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> KEY_SERVER_URL = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> KEY_AUTH_USERNAME = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> KEY_AUTH_PASSWORD = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> KEY_DARK_MODE = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> KEY_POLL_INTERVAL = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> KEY_ALERTS_ENABLED = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> KEY_FIRST_RUN = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_SERVER_URL = "https://depravity-wolf-cringe.ngrok-free.dev";
    public static final int DEFAULT_POLL_INTERVAL = 5;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> serverUrl = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> authUsername = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> authPassword = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> darkMode = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> pollInterval = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> alertsEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> firstRun = null;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.data.local.PreferencesManager.Companion Companion = null;
    
    public PreferencesManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getServerUrl() {
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
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getPollInterval() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getAlertsEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getFirstRun() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setServerUrl(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setCredentials(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setDarkMode(boolean enabled, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setPollInterval(int seconds, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setAlertsEnabled(boolean enabled, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setFirstRunComplete(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/assistx/monitor/data/local/PreferencesManager$Companion;", "", "()V", "DEFAULT_POLL_INTERVAL", "", "DEFAULT_SERVER_URL", "", "KEY_ALERTS_ENABLED", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "KEY_AUTH_PASSWORD", "KEY_AUTH_USERNAME", "KEY_DARK_MODE", "KEY_FIRST_RUN", "KEY_POLL_INTERVAL", "KEY_SERVER_URL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}