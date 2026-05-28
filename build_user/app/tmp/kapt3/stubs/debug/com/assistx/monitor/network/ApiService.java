package com.assistx.monitor.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cJ$\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0014J.\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Lcom/assistx/monitor/network/ApiService;", "", "addClient", "Lcom/assistx/monitor/network/ApiService$ClientResponse;", "client", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteClient", "Lcom/assistx/monitor/network/ApiService$StatusResponse;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnalyticsSummary", "Lcom/assistx/monitor/network/ApiService$AnalyticsSummary;", "range", "getClientHistory", "", "Lcom/assistx/monitor/network/ApiService$HistoryEntry;", "getClients", "Lcom/assistx/monitor/data/model/PcDevice;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPcs", "statusCheck", "updateClient", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AnalyticsSummary", "ClientResponse", "HistoryEntry", "StatusResponse", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "api/status")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object statusCheck(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assistx.monitor.network.ApiService.StatusResponse> $completion);
    
    @retrofit2.http.GET(value = "api/clients")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getClients(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.assistx.monitor.data.model.PcDevice>> $completion);
    
    @retrofit2.http.POST(value = "api/clients")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addClient(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> client, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assistx.monitor.network.ApiService.ClientResponse> $completion);
    
    @retrofit2.http.PUT(value = "api/clients/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateClient(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull
    java.lang.String id, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> client, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assistx.monitor.network.ApiService.ClientResponse> $completion);
    
    @retrofit2.http.DELETE(value = "api/clients/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteClient(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assistx.monitor.network.ApiService.StatusResponse> $completion);
    
    @retrofit2.http.GET(value = "api/clients/{id}/history")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getClientHistory(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.assistx.monitor.network.ApiService.HistoryEntry>> $completion);
    
    @retrofit2.http.GET(value = "api/analytics/summary")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAnalyticsSummary(@retrofit2.http.Query(value = "range")
    @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assistx.monitor.network.ApiService.AnalyticsSummary> $completion);
    
    @retrofit2.http.GET(value = "api/pcs")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPcs(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.assistx.monitor.data.model.PcDevice>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0081\u0001\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001J\t\u0010#\u001a\u00020\u0004H\u00d6\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/assistx/monitor/network/ApiService$AnalyticsSummary;", "", "labels", "", "", "online_counts", "", "offline_counts", "avg_cpu", "", "avg_memory", "avg_storage", "range", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAvg_cpu", "()Ljava/util/List;", "getAvg_memory", "getAvg_storage", "getLabels", "getOffline_counts", "getOnline_counts", "getRange", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class AnalyticsSummary {
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> labels = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.Integer> online_counts = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.Integer> offline_counts = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.Double> avg_cpu = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.Double> avg_memory = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.Double> avg_storage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String range = null;
        
        public AnalyticsSummary(@org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> labels, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Integer> online_counts, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Integer> offline_counts, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Double> avg_cpu, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Double> avg_memory, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Double> avg_storage, @org.jetbrains.annotations.Nullable
        java.lang.String range) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getLabels() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Integer> getOnline_counts() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Integer> getOffline_counts() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Double> getAvg_cpu() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Double> getAvg_memory() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Double> getAvg_storage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRange() {
            return null;
        }
        
        public AnalyticsSummary() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Integer> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Integer> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Double> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Double> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Double> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.network.ApiService.AnalyticsSummary copy(@org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> labels, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Integer> online_counts, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Integer> offline_counts, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Double> avg_cpu, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Double> avg_memory, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Double> avg_storage, @org.jetbrains.annotations.Nullable
        java.lang.String range) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/assistx/monitor/network/ApiService$ClientResponse;", "", "status", "", "client", "Lcom/assistx/monitor/data/model/PcDevice;", "error", "(Ljava/lang/String;Lcom/assistx/monitor/data/model/PcDevice;Ljava/lang/String;)V", "getClient", "()Lcom/assistx/monitor/data/model/PcDevice;", "getError", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class ClientResponse {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String status = null;
        @org.jetbrains.annotations.Nullable
        private final com.assistx.monitor.data.model.PcDevice client = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String error = null;
        
        public ClientResponse(@org.jetbrains.annotations.NotNull
        java.lang.String status, @org.jetbrains.annotations.Nullable
        com.assistx.monitor.data.model.PcDevice client, @org.jetbrains.annotations.Nullable
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.assistx.monitor.data.model.PcDevice getClient() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.assistx.monitor.data.model.PcDevice component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.network.ApiService.ClientResponse copy(@org.jetbrains.annotations.NotNull
        java.lang.String status, @org.jetbrains.annotations.Nullable
        com.assistx.monitor.data.model.PcDevice client, @org.jetbrains.annotations.Nullable
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/assistx/monitor/network/ApiService$HistoryEntry;", "", "timestamp", "", "status", "cpu_usage", "", "memory_usage", "storage_usage", "anydesk_status", "", "(Ljava/lang/String;Ljava/lang/String;DDDI)V", "getAnydesk_status", "()I", "getCpu_usage", "()D", "getMemory_usage", "getStatus", "()Ljava/lang/String;", "getStorage_usage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class HistoryEntry {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String timestamp = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String status = null;
        private final double cpu_usage = 0.0;
        private final double memory_usage = 0.0;
        private final double storage_usage = 0.0;
        private final int anydesk_status = 0;
        
        public HistoryEntry(@org.jetbrains.annotations.NotNull
        java.lang.String timestamp, @org.jetbrains.annotations.NotNull
        java.lang.String status, double cpu_usage, double memory_usage, double storage_usage, int anydesk_status) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTimestamp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStatus() {
            return null;
        }
        
        public final double getCpu_usage() {
            return 0.0;
        }
        
        public final double getMemory_usage() {
            return 0.0;
        }
        
        public final double getStorage_usage() {
            return 0.0;
        }
        
        public final int getAnydesk_status() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        public final double component3() {
            return 0.0;
        }
        
        public final double component4() {
            return 0.0;
        }
        
        public final double component5() {
            return 0.0;
        }
        
        public final int component6() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.network.ApiService.HistoryEntry copy(@org.jetbrains.annotations.NotNull
        java.lang.String timestamp, @org.jetbrains.annotations.NotNull
        java.lang.String status, double cpu_usage, double memory_usage, double storage_usage, int anydesk_status) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/assistx/monitor/network/ApiService$StatusResponse;", "", "status", "", "error", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class StatusResponse {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String status = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String error = null;
        
        public StatusResponse(@org.jetbrains.annotations.Nullable
        java.lang.String status, @org.jetbrains.annotations.Nullable
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getError() {
            return null;
        }
        
        public StatusResponse() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.network.ApiService.StatusResponse copy(@org.jetbrains.annotations.Nullable
        java.lang.String status, @org.jetbrains.annotations.Nullable
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
}