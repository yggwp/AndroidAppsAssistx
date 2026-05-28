package com.assistx.monitor.ui.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0012\u0013\u0014\u0015B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DeviceAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/assistx/monitor/ui/dashboard/DeviceListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCardClick", "Lkotlin/Function1;", "Lcom/assistx/monitor/data/model/PcDevice;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "DeviceViewHolder", "DiffCallback", "HeaderViewHolder", "app_debug"})
public final class DeviceAdapter extends androidx.recyclerview.widget.ListAdapter<com.assistx.monitor.ui.dashboard.DeviceListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.assistx.monitor.data.model.PcDevice, kotlin.Unit> onCardClick = null;
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    @org.jetbrains.annotations.NotNull
    public static final com.assistx.monitor.ui.dashboard.DeviceAdapter.Companion Companion = null;
    
    public DeviceAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.assistx.monitor.data.model.PcDevice, kotlin.Unit> onCardClick) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DeviceAdapter$Companion;", "", "()V", "TYPE_HEADER", "", "TYPE_ITEM", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DeviceAdapter$DeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/assistx/monitor/databinding/CardDeviceBinding;", "(Lcom/assistx/monitor/databinding/CardDeviceBinding;)V", "getBinding", "()Lcom/assistx/monitor/databinding/CardDeviceBinding;", "app_debug"})
    public static final class DeviceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.assistx.monitor.databinding.CardDeviceBinding binding = null;
        
        public DeviceViewHolder(@org.jetbrains.annotations.NotNull
        com.assistx.monitor.databinding.CardDeviceBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.databinding.CardDeviceBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DeviceAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/assistx/monitor/ui/dashboard/DeviceListItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.assistx.monitor.ui.dashboard.DeviceListItem> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.assistx.monitor.ui.dashboard.DeviceListItem oldItem, @org.jetbrains.annotations.NotNull
        com.assistx.monitor.ui.dashboard.DeviceListItem newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.assistx.monitor.ui.dashboard.DeviceListItem oldItem, @org.jetbrains.annotations.NotNull
        com.assistx.monitor.ui.dashboard.DeviceListItem newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/assistx/monitor/ui/dashboard/DeviceAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/assistx/monitor/databinding/LayoutSectionHeaderBinding;", "(Lcom/assistx/monitor/databinding/LayoutSectionHeaderBinding;)V", "getBinding", "()Lcom/assistx/monitor/databinding/LayoutSectionHeaderBinding;", "app_debug"})
    public static final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.assistx.monitor.databinding.LayoutSectionHeaderBinding binding = null;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull
        com.assistx.monitor.databinding.LayoutSectionHeaderBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assistx.monitor.databinding.LayoutSectionHeaderBinding getBinding() {
            return null;
        }
    }
}