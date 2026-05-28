package com.assistx.monitor.data.model;

/**
 * Model data untuk perangkat POC yang dimonitor.
 * Field disesuaikan dengan response API nyata dari server.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B\u00d5\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0010H\u00c6\u0003J\t\u0010D\u001a\u00020\u0012H\u00c6\u0003J\t\u0010E\u001a\u00020\u0012H\u00c6\u0003J\t\u0010F\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00de\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020/2\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020\u0010H\u00d6\u0001J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001eR\u0011\u0010(\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010.\u001a\u00020/8F\u00a2\u0006\u0006\u001a\u0004\b.\u00100R\u0011\u00101\u001a\u00020/8F\u00a2\u0006\u0006\u001a\u0004\b1\u00100R\u0011\u00102\u001a\u00020/8F\u00a2\u0006\u0006\u001a\u0004\b2\u00100R\u0011\u00103\u001a\u00020/8F\u00a2\u0006\u0006\u001a\u0004\b3\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u0013\u00108\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\b9\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010%\u00a8\u0006X"}, d2 = {"Lcom/assistx/monitor/data/model/PcDevice;", "", "id", "", "name", "endpoint", "ipAddress", "location", "anydeskId", "simcardNumber", "apiQuotaGb", "", "quotaText", "quotaLink", "status", "anydeskStatus", "", "cpuUsage", "", "memoryUsage", "storageUsage", "serialNumber", "lastUpdate", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "alertState", "Lcom/assistx/monitor/data/model/AlertState;", "getAlertState", "()Lcom/assistx/monitor/data/model/AlertState;", "getAnydeskId", "()Ljava/lang/String;", "getAnydeskStatus", "()I", "getApiQuotaGb", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCpuUsage", "()D", "displayAnyDeskId", "getDisplayAnyDeskId", "displayQuota", "getDisplayQuota", "getEndpoint", "getError", "getId", "getIpAddress", "isAnyDeskRunning", "", "()Z", "isOnline", "isQuotaCritical", "isQuotaWarning", "getLastUpdate", "getLocation", "getMemoryUsage", "getName", "quotaGb", "getQuotaGb", "getQuotaLink", "getQuotaText", "getSerialNumber", "getSimcardNumber", "getStatus", "getStorageUsage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/assistx/monitor/data/model/PcDevice;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class PcDevice {
    @com.google.gson.annotations.SerializedName(value = "id")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String id = null;
    @com.google.gson.annotations.SerializedName(value = "name")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "endpoint")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String endpoint = null;
    @com.google.gson.annotations.SerializedName(value = "ip_address", alternate = {"ip"})
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ipAddress = null;
    @com.google.gson.annotations.SerializedName(value = "location")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String location = null;
    @com.google.gson.annotations.SerializedName(value = "anydesk_id", alternate = {"anydesk"})
    @org.jetbrains.annotations.Nullable
    private final java.lang.String anydeskId = null;
    @com.google.gson.annotations.SerializedName(value = "simcard_number")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String simcardNumber = null;
    @com.google.gson.annotations.SerializedName(value = "quota_gb")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Float apiQuotaGb = null;
    @com.google.gson.annotations.SerializedName(value = "quota_text", alternate = {"quota"})
    @org.jetbrains.annotations.Nullable
    private final java.lang.String quotaText = null;
    @com.google.gson.annotations.SerializedName(value = "quota_link")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String quotaLink = null;
    @com.google.gson.annotations.SerializedName(value = "status")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String status = null;
    @com.google.gson.annotations.SerializedName(value = "anydesk_status")
    private final int anydeskStatus = 0;
    @com.google.gson.annotations.SerializedName(value = "cpu_usage")
    private final double cpuUsage = 0.0;
    @com.google.gson.annotations.SerializedName(value = "memory_usage")
    private final double memoryUsage = 0.0;
    @com.google.gson.annotations.SerializedName(value = "storage_usage")
    private final double storageUsage = 0.0;
    @com.google.gson.annotations.SerializedName(value = "sn")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String serialNumber = null;
    @com.google.gson.annotations.SerializedName(value = "last_update")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastUpdate = null;
    @com.google.gson.annotations.SerializedName(value = "error")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String error = null;
    
    public PcDevice(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String endpoint, @org.jetbrains.annotations.Nullable
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.String anydeskId, @org.jetbrains.annotations.Nullable
    java.lang.String simcardNumber, @org.jetbrains.annotations.Nullable
    java.lang.Float apiQuotaGb, @org.jetbrains.annotations.Nullable
    java.lang.String quotaText, @org.jetbrains.annotations.Nullable
    java.lang.String quotaLink, @org.jetbrains.annotations.Nullable
    java.lang.String status, int anydeskStatus, double cpuUsage, double memoryUsage, double storageUsage, @org.jetbrains.annotations.Nullable
    java.lang.String serialNumber, @org.jetbrains.annotations.Nullable
    java.lang.String lastUpdate, @org.jetbrains.annotations.Nullable
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIpAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAnydeskId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSimcardNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getApiQuotaGb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getQuotaText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getQuotaLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int getAnydeskStatus() {
        return 0;
    }
    
    public final double getCpuUsage() {
        return 0.0;
    }
    
    public final double getMemoryUsage() {
        return 0.0;
    }
    
    public final double getStorageUsage() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSerialNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    public final boolean isAnyDeskRunning() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayAnyDeskId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayQuota() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getQuotaGb() {
        return null;
    }
    
    public final boolean isQuotaCritical() {
        return false;
    }
    
    public final boolean isQuotaWarning() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assistx.monitor.data.model.AlertState getAlertState() {
        return null;
    }
    
    public PcDevice() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assistx.monitor.data.model.PcDevice copy(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String endpoint, @org.jetbrains.annotations.Nullable
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.String anydeskId, @org.jetbrains.annotations.Nullable
    java.lang.String simcardNumber, @org.jetbrains.annotations.Nullable
    java.lang.Float apiQuotaGb, @org.jetbrains.annotations.Nullable
    java.lang.String quotaText, @org.jetbrains.annotations.Nullable
    java.lang.String quotaLink, @org.jetbrains.annotations.Nullable
    java.lang.String status, int anydeskStatus, double cpuUsage, double memoryUsage, double storageUsage, @org.jetbrains.annotations.Nullable
    java.lang.String serialNumber, @org.jetbrains.annotations.Nullable
    java.lang.String lastUpdate, @org.jetbrains.annotations.Nullable
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}