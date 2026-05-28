package com.assistx.monitor.data.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\t\u0010-\u001a\u00020\u000eH\u00c6\u0003JU\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010/\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u000bH\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0010\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012R\u0011\u0010#\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u00063"}, d2 = {"Lcom/assistx/monitor/data/model/Project;", "", "name", "", "nodes", "", "Lcom/assistx/monitor/data/model/PcDevice;", "totalCpu", "", "totalMem", "onlineCount", "", "offlineCount", "totalQuotaGb", "", "(Ljava/lang/String;Ljava/util/List;DDIIF)V", "avgCpu", "getAvgCpu", "()D", "avgMem", "getAvgMem", "isAllOnline", "", "()Z", "isCompletelyOffline", "isPartialOnline", "getName", "()Ljava/lang/String;", "getNodes", "()Ljava/util/List;", "getOfflineCount", "()I", "getOnlineCount", "getTotalCpu", "getTotalMem", "totalNodes", "getTotalNodes", "getTotalQuotaGb", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Project {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.assistx.monitor.data.model.PcDevice> nodes = null;
    private final double totalCpu = 0.0;
    private final double totalMem = 0.0;
    private final int onlineCount = 0;
    private final int offlineCount = 0;
    private final float totalQuotaGb = 0.0F;
    
    public Project(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<com.assistx.monitor.data.model.PcDevice> nodes, double totalCpu, double totalMem, int onlineCount, int offlineCount, float totalQuotaGb) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.assistx.monitor.data.model.PcDevice> getNodes() {
        return null;
    }
    
    public final double getTotalCpu() {
        return 0.0;
    }
    
    public final double getTotalMem() {
        return 0.0;
    }
    
    public final int getOnlineCount() {
        return 0;
    }
    
    public final int getOfflineCount() {
        return 0;
    }
    
    public final float getTotalQuotaGb() {
        return 0.0F;
    }
    
    public final int getTotalNodes() {
        return 0;
    }
    
    public final boolean isCompletelyOffline() {
        return false;
    }
    
    public final boolean isPartialOnline() {
        return false;
    }
    
    public final boolean isAllOnline() {
        return false;
    }
    
    public final double getAvgCpu() {
        return 0.0;
    }
    
    public final double getAvgMem() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.assistx.monitor.data.model.PcDevice> component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final float component7() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assistx.monitor.data.model.Project copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<com.assistx.monitor.data.model.PcDevice> nodes, double totalCpu, double totalMem, int onlineCount, int offlineCount, float totalQuotaGb) {
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