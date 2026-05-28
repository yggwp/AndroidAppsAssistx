package com.assistx.monitor.ui.projects;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007H\u0002J\u0006\u0010\u0018\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/assistx/monitor/ui/projects/ProjectsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_projects", "", "Lcom/assistx/monitor/data/model/Project;", "_summary", "Lcom/assistx/monitor/ui/projects/ProjectsViewModel$ProjectsSummary;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "projects", "getProjects", "repository", "Lcom/assistx/monitor/data/repository/DeviceRepository;", "summary", "getSummary", "groupDevicesIntoProjects", "", "devices", "Lcom/assistx/monitor/data/model/PcDevice;", "refresh", "ProjectsSummary", "app_debug"})
public final class ProjectsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.assistx.monitor.data.repository.DeviceRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assistx.monitor.data.model.Project>> _projects = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.Project>> projects = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assistx.monitor.ui.projects.ProjectsViewModel.ProjectsSummary> _summary = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.projects.ProjectsViewModel.ProjectsSummary> summary = null;
    
    public ProjectsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assistx.monitor.data.model.Project>> getProjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.assistx.monitor.ui.projects.ProjectsViewModel.ProjectsSummary> getSummary() {
        return null;
    }
    
    public final void refresh() {
    }
    
    private final void groupDevicesIntoProjects(java.util.List<com.assistx.monitor.data.model.PcDevice> devices) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/assistx/monitor/ui/projects/ProjectsViewModel$ProjectsSummary;", "", "totalProjects", "", "onlineNodes", "offlineNodes", "totalQuotaGb", "", "(IIIF)V", "getOfflineNodes", "()I", "getOnlineNodes", "getTotalProjects", "getTotalQuotaGb", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class ProjectsSummary {
        private final int totalProjects = 0;
        private final int onlineNodes = 0;
        private final int offlineNodes = 0;
        private final float totalQuotaGb = 0.0F;
        
        public ProjectsSummary(int totalProjects, int onlineNodes, int offlineNodes, float totalQuotaGb) {
            super();
        }
        
        public final int getTotalProjects() {
            return 0;
        }
        
        public final int getOnlineNodes() {
            return 0;
        }
        
        public final int getOfflineNodes() {
            return 0;
        }
        
        public final float getTotalQuotaGb() {
            return 0.0F;
        }
        
        public ProjectsSummary() {
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
        
        public final float component4() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.ui.projects.ProjectsViewModel.ProjectsSummary copy(int totalProjects, int onlineNodes, int offlineNodes, float totalQuotaGb) {
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