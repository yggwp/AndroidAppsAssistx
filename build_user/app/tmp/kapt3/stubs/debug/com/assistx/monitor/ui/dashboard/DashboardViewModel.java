package com.assistx.monitor.ui.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\u000e\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014\u00a8\u0006,"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_activeFilter", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/assistx/monitor/ui/dashboard/DeviceFilter;", "_counts", "Lcom/assistx/monitor/ui/dashboard/DashboardViewModel$DeviceCounts;", "_error", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "_filteredDevices", "", "Lcom/assistx/monitor/data/model/PcDevice;", "_isLoading", "", "_searchQuery", "activeFilter", "Lkotlinx/coroutines/flow/StateFlow;", "getActiveFilter", "()Lkotlinx/coroutines/flow/StateFlow;", "counts", "getCounts", "error", "Lkotlinx/coroutines/flow/SharedFlow;", "getError", "()Lkotlinx/coroutines/flow/SharedFlow;", "filteredDevices", "getFilteredDevices", "isLoading", "repository", "Lcom/assistx/monitor/data/repository/DeviceRepository;", "searchQuery", "getSearchQuery", "applyFilters", "", "allDevices", "loadDevices", "refresh", "setFilter", "filter", "setSearchQuery", "query", "DeviceCounts", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.assistx.monitor.data.repository.DeviceRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> _filteredDevices = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> filteredDevices = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assistx.monitor.ui.dashboard.DeviceFilter> _activeFilter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.dashboard.DeviceFilter> activeFilter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assistx.monitor.ui.dashboard.DashboardViewModel.DeviceCounts> _counts = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.dashboard.DashboardViewModel.DeviceCounts> counts = null;
    
    public DashboardViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.PcDevice>> getFilteredDevices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.dashboard.DeviceFilter> getActiveFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.dashboard.DashboardViewModel.DeviceCounts> getCounts() {
        return null;
    }
    
    public final void loadDevices() {
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull
    com.assistx.monitor.ui.dashboard.DeviceFilter filter) {
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void refresh() {
    }
    
    private final void applyFilters(java.util.List<com.assistx.monitor.data.model.PcDevice> allDevices) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DashboardViewModel$DeviceCounts;", "", "total", "", "online", "offline", "alert", "(IIII)V", "getAlert", "()I", "getOffline", "getOnline", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class DeviceCounts {
        private final int total = 0;
        private final int online = 0;
        private final int offline = 0;
        private final int alert = 0;
        
        public DeviceCounts(int total, int online, int offline, int alert) {
            super();
        }
        
        public final int getTotal() {
            return 0;
        }
        
        public final int getOnline() {
            return 0;
        }
        
        public final int getOffline() {
            return 0;
        }
        
        public final int getAlert() {
            return 0;
        }
        
        public DeviceCounts() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.ui.dashboard.DashboardViewModel.DeviceCounts copy(int total, int online, int offline, int alert) {
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