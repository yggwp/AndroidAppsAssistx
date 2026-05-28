package com.assistx.monitor.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/assistx/monitor/network/ApiClient;", "", "()V", "cachedPassword", "", "cachedUsername", "currentBaseUrl", "okHttpClient", "Lokhttp3/OkHttpClient;", "<set-?>", "Lcom/assistx/monitor/data/local/PreferencesManager;", "preferencesManager", "getPreferencesManager", "()Lcom/assistx/monitor/data/local/PreferencesManager;", "retrofitRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lretrofit2/Retrofit;", "buildOkHttpClient", "", "getApiService", "Lcom/assistx/monitor/network/ApiService;", "getBaseUrl", "getOkHttpClient", "init", "prefs", "onServerUrlChanged", "newUrl", "statusCheck", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCredentials", "username", "password", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReference<retrofit2.Retrofit> retrofitRef = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String currentBaseUrl = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String cachedUsername = "presales";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String cachedPassword = "presales";
    private static com.assistx.monitor.data.local.PreferencesManager preferencesManager;
    private static okhttp3.OkHttpClient okHttpClient;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.network.ApiClient INSTANCE = null;
    
    private ApiClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assistx.monitor.data.local.PreferencesManager getPreferencesManager() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    com.assistx.monitor.data.local.PreferencesManager prefs) {
    }
    
    /**
     * Update cached credentials (dipanggil dari SettingsFragment setelah user menyimpan kredensial baru).
     * Memaksa rebuild OkHttpClient dan Retrofit instance.
     */
    public final void updateCredentials(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    /**
     * Status check ke server – aman dipanggil dari coroutine.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object statusCheck(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * Get the current server URL.
     * Menggunakan cached value, hanya baca DataStore sekali.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    /**
     * Called when user changes server URL in Settings.
     */
    public final void onServerUrlChanged(@org.jetbrains.annotations.NotNull
    java.lang.String newUrl) {
    }
    
    private final void buildOkHttpClient() {
    }
    
    /**
     * Expose OkHttpClient untuk digunakan SSEManager
     */
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assistx.monitor.network.ApiService getApiService() {
        return null;
    }
}