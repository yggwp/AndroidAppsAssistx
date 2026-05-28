package com.assistx.monitor.network

import com.assistx.monitor.data.local.PreferencesManager
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

object ApiClient {

    private val retrofitRef = AtomicReference<Retrofit?>(null)
    private var currentBaseUrl: String = ""
    private var cachedUsername: String = "presales"
    private var cachedPassword: String = "presales"

    lateinit var preferencesManager: PreferencesManager
        private set

    private lateinit var okHttpClient: OkHttpClient

    fun init(prefs: PreferencesManager) {
        preferencesManager = prefs
        // Cache credentials awal dari DataStore (blocking, hanya sekali di Application.onCreate di background)
        runCatching {
            val username = runBlocking { prefs.authUsername.first() }
            val password = runBlocking { prefs.authPassword.first() }
            cachedUsername = username
            cachedPassword = password
        }
        buildOkHttpClient()
    }

    /**
     * Update cached credentials (dipanggil dari SettingsFragment setelah user menyimpan kredensial baru).
     * Memaksa rebuild OkHttpClient dan Retrofit instance.
     */
    fun updateCredentials(username: String, password: String) {
        cachedUsername = username
        cachedPassword = password
        retrofitRef.set(null) // force rebuild
        buildOkHttpClient()
    }

    /**
     * Status check ke server – aman dipanggil dari coroutine.
     */
    suspend fun statusCheck(): Boolean = runCatching {
        val service = getApiService()
        service.statusCheck()
        true
    }.getOrDefault(false)

    /**
     * Get the current server URL.
     * Menggunakan cached value, hanya baca DataStore sekali.
     */
    fun getBaseUrl(): String {
        if (!::preferencesManager.isInitialized) return PreferencesManager.DEFAULT_SERVER_URL

        if (currentBaseUrl.isNotEmpty()) return currentBaseUrl

        // Baca dari DataStore (blocking) — hanya dipanggil sekali, setelah itu pakai cache
        runCatching {
            currentBaseUrl = runBlocking { preferencesManager.serverUrl.first() }
        }
        if (currentBaseUrl.isEmpty()) {
            currentBaseUrl = PreferencesManager.DEFAULT_SERVER_URL
        }
        return currentBaseUrl
    }

    /**
     * Called when user changes server URL in Settings.
     */
    fun onServerUrlChanged(newUrl: String) {
        currentBaseUrl = newUrl.trimEnd('/')
        retrofitRef.set(null) // force rebuild
    }

    private fun buildOkHttpClient() {
        val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.NONE
        }
        okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS) // SSE butuh timeout panjang
            .writeTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(logging)
            .addInterceptor { chain ->
                val credentials = okhttp3.Credentials.basic(cachedUsername, cachedPassword)
                val request = chain.request().newBuilder()
                    .addHeader("Authorization", credentials)
                    .addHeader("Cache-Control", "no-cache")
                    .addHeader("Pragma", "no-cache")
                    // Header wajib untuk ngrok agar tidak return HTML warning page
                    .addHeader("ngrok-skip-browser-warning", "true")
                    .build()
                chain.proceed(request)
            }
            .build()
    }

    /** Expose OkHttpClient untuk digunakan SSEManager */
    fun getOkHttpClient(): OkHttpClient = okHttpClient

    fun getApiService(): ApiService {
        val baseUrl = getBaseUrl()
        if (baseUrl.isEmpty()) {
            throw IllegalStateException("Server URL belum diatur. Buka Settings untuk mengatur URL server.")
        }
        var retrofit = retrofitRef.get()
        if (retrofit == null || currentBaseUrl != baseUrl) {
            currentBaseUrl = baseUrl
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl.trimEnd('/').plus("/"))
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofitRef.set(retrofit)
        }
        return retrofit!!.create(ApiService::class.java)
    }
}
