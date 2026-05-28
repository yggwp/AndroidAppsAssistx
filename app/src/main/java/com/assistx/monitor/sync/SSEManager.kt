package com.assistx.monitor.sync

import android.util.Log
import com.assistx.monitor.data.model.PcDevice
import com.assistx.monitor.network.ApiClient
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import okhttp3.Request
import okhttp3.Response
import okhttp3.sse.EventSource
import okhttp3.sse.EventSourceListener
import okhttp3.sse.EventSources
import java.io.IOException

class SSEManager {

    companion object {
        private const val TAG = "SSEManager"
        private const val MAX_RECONNECT_DELAY = 30_000L
        private const val BASE_RECONNECT_DELAY = 2_000L
    }

    private var eventSource: EventSource? = null
    private val gson = Gson()
    private var reconnectAttempts = 0
    private var isDestroyed = false

    private val _deviceUpdates = MutableSharedFlow<List<PcDevice>>(extraBufferCapacity = 8)
    val deviceUpdates: SharedFlow<List<PcDevice>> = _deviceUpdates

    private val _connectionState = MutableSharedFlow<SseState>(extraBufferCapacity = 4)
    val connectionState: SharedFlow<SseState> = _connectionState

    private val scope = CoroutineScope(Dispatchers.IO)

    fun connect() {
        if (isDestroyed) return
        disconnect()

        val serverUrl = ApiClient.getBaseUrl()
        if (serverUrl.isEmpty()) {
            Log.w(TAG, "Server URL kosong, tidak bisa connect SSE")
            scope.launch { _connectionState.emit(SseState.DISCONNECTED) }
            return
        }

        val request = try {
            Request.Builder()
                .url("$serverUrl/api/stream")
                .header("Accept", "text/event-stream")
                .header("Cache-Control", "no-cache")
                .header("Connection", "keep-alive")
                // Wajib untuk ngrok agar tidak return HTML warning page
                .header("ngrok-skip-browser-warning", "true")
                .build()
        } catch (e: Exception) {
            Log.e(TAG, "Invalid SSE URL: ${e.message}")
            scope.launch { _connectionState.emit(SseState.DISCONNECTED) }
            return
        }

        scope.launch { _connectionState.emit(SseState.CONNECTING) }

        val factory = EventSources.createFactory(ApiClient.getOkHttpClient())

        eventSource = factory.newEventSource(request, object : EventSourceListener() {
            override fun onOpen(eventSource: EventSource, response: Response) {
                Log.i(TAG, "SSE Connected ke $serverUrl")
                reconnectAttempts = 0
                scope.launch { _connectionState.emit(SseState.CONNECTED) }
            }

            override fun onEvent(
                eventSource: EventSource,
                id: String?,
                type: String?,
                data: String
            ) {
                if (data.isBlank() || data == ":") return // heartbeat/ping
                parseAndEmit(data)
            }

            override fun onClosed(eventSource: EventSource) {
                Log.w(TAG, "SSE Closed by server")
                scope.launch { _connectionState.emit(SseState.DISCONNECTED) }
                scheduleReconnect()
            }

            override fun onFailure(
                eventSource: EventSource,
                t: Throwable?,
                response: Response?
            ) {
                val code = response?.code
                Log.e(TAG, "SSE Failure: ${t?.message}, HTTP $code")
                scope.launch { _connectionState.emit(SseState.DISCONNECTED) }
                scheduleReconnect()
            }
        })
    }

    private fun parseAndEmit(data: String) {
        try {
            val listType = object : TypeToken<List<PcDevice>>() {}.type
            val devices: List<PcDevice> = gson.fromJson(data, listType)
            if (devices != null) {
                scope.launch { _deviceUpdates.emit(devices) }
            }
        } catch (e: JsonSyntaxException) {
            Log.w(TAG, "SSE parse error (bukan JSON array): ${e.message?.take(100)}")
        } catch (e: Exception) {
            Log.w(TAG, "SSE emit error: ${e.message}")
        }
    }

    private fun scheduleReconnect() {
        if (isDestroyed) return
        val delay = (BASE_RECONNECT_DELAY * (1L shl reconnectAttempts.coerceAtMost(4)))
            .coerceAtMost(MAX_RECONNECT_DELAY)
        reconnectAttempts++
        Log.i(TAG, "Reconnecting SSE dalam ${delay}ms (attempt $reconnectAttempts)...")

        scope.launch {
            kotlinx.coroutines.delay(delay)
            if (!isDestroyed) connect()
        }
    }

    fun disconnect() {
        eventSource?.cancel()
        eventSource = null
    }

    fun destroy() {
        isDestroyed = true
        disconnect()
    }
}

enum class SseState {
    CONNECTED, DISCONNECTED, CONNECTING
}
