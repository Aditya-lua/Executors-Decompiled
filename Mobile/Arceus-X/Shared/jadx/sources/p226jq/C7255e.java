package p226jq;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1052c;
import androidx.recyclerview.widget.C1053d;
import androidx.recyclerview.widget.C1056g;
import androidx.recyclerview.widget.RecyclerView;
import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402r5.InterfaceC10784a;
import p507w4.InterfaceC12307b;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: jq.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u00013B[\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0093\u0001\u0010\u0019\u001a\u00020\u0015\"\b\b\u0001\u0010\n*\u00028\u0000\"\b\b\u0002\u0010\f*\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u00102\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00102\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J9\u0010,\u001a\u00020\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001c\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00018\u00008\u0000078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010C\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR&\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000&8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010O\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, m31665d2 = {"Ljq/e;", "", "T", "Lkotlin/Function2;", "", "areItemsTheSame", "areContentsTheSame", "getChangePayload", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "R", "Lr5/a;", "VB", "Lhu/c;", "clazz", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "j", "(Lhu/c;Lhu/c;Lzt/n;Lzt/n;Lkotlin/jvm/functions/Function1;)V", "", "position", "o", "(I)I", "parent", "viewType", "r", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "holder", "q", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "", "newItems", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Lkotlin/Function0;", "cb", "s", "(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$h;Lkotlin/jvm/functions/Function0;)V", "Ljq/e$b;", "n", "(I)Ljq/e$b;", "a", "Lkotlin/jvm/functions/Function2;", "b", "c", "d", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "e", "Landroidx/recyclerview/widget/d;", "differ", "", "f", "Ljava/util/List;", "itemInfos", "", "g", "Ljava/util/Map;", "itemInfoByItemType", "h", "itemInfoByViewType", "Ljq/n0;", "i", "Ljq/n0;", "viewTypeGenerator", "p", "()Ljava/util/List;", "items", "m", "()I", "itemCount", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7255e<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, T, Boolean> areItemsTheSame;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, T, Boolean> areContentsTheSame;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, T, Object> getChangePayload;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public RecyclerView.AbstractC1025h<?> adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C1053d<T> differ;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<ItemInfo<T>> itemInfos;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Map<InterfaceC6567c<?>, ItemInfo<T>> itemInfoByItemType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, ItemInfo<T>> itemInfoByViewType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C7274n0 viewTypeGenerator;

    /* JADX INFO: renamed from: jq.e$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final a f28008a = new a();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(T old, T t8) {
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(t8, "new");
            return null;
        }
    }

    /* JADX INFO: renamed from: jq.e$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R/\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010%R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, m31665d2 = {"Ljq/e$b;", "T", "", "", "viewType", "Lhu/c;", "Lr5/a;", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "<init>", "(ILhu/c;Lzt/n;Lzt/n;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Lhu/c;", "getViewBindingClass", "()Lhu/c;", "c", "Lzt/n;", "()Lzt/n;", "e", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ItemInfo<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int viewType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC6567c<? extends InterfaceC10784a> viewBindingClass;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, InterfaceC10784a> inflateFn;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC14057n<T, InterfaceC10784a, RecyclerView.AbstractC1023f0, Unit> bindViewHolder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final Function1<InterfaceC10784a, Unit> onViewCreated;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: zt.n<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends r5.a> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: zt.n<? super T, ? super r5.a, ? super androidx.recyclerview.widget.RecyclerView$f0, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super r5.a, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ItemInfo(int i10, @NotNull InterfaceC6567c<? extends InterfaceC10784a> viewBindingClass, @NotNull InterfaceC14057n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends InterfaceC10784a> inflateFn, @NotNull InterfaceC14057n<? super T, ? super InterfaceC10784a, ? super RecyclerView.AbstractC1023f0, Unit> bindViewHolder, @Nullable Function1<? super InterfaceC10784a, Unit> function1) {
            Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
            Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
            Intrinsics.checkNotNullParameter(bindViewHolder, "bindViewHolder");
            this.viewType = i10;
            this.viewBindingClass = viewBindingClass;
            this.inflateFn = inflateFn;
            this.bindViewHolder = bindViewHolder;
            this.onViewCreated = function1;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC14057n<T, InterfaceC10784a, RecyclerView.AbstractC1023f0, Unit> m30251a() {
            return this.bindViewHolder;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, InterfaceC10784a> m30252b() {
            return this.inflateFn;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Function1<InterfaceC10784a, Unit> m30253c() {
            return this.onViewCreated;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getViewType() {
            return this.viewType;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemInfo)) {
                return false;
            }
            ItemInfo itemInfo = (ItemInfo) other;
            return this.viewType == itemInfo.viewType && Intrinsics.m31980c(this.viewBindingClass, itemInfo.viewBindingClass) && Intrinsics.m31980c(this.inflateFn, itemInfo.inflateFn) && Intrinsics.m31980c(this.bindViewHolder, itemInfo.bindViewHolder) && Intrinsics.m31980c(this.onViewCreated, itemInfo.onViewCreated);
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.viewType) * 31) + this.viewBindingClass.hashCode()) * 31) + this.inflateFn.hashCode()) * 31) + this.bindViewHolder.hashCode()) * 31;
            Function1<InterfaceC10784a, Unit> function1 = this.onViewCreated;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        @NotNull
        public String toString() {
            return "ItemInfo(viewType=" + this.viewType + ", viewBindingClass=" + this.viewBindingClass + ", inflateFn=" + this.inflateFn + ", bindViewHolder=" + this.bindViewHolder + ", onViewCreated=" + this.onViewCreated + ")";
        }
    }

    /* JADX INFO: renamed from: jq.e$c */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"jq/e$c", "Lw4/b;", "", "position", "count", "", "a", "(II)V", "b", "fromPosition", "toPosition", "d", "", "payload", "c", "(IILjava/lang/Object;)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC12307b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7255e<T> f28014a;

        public c(C7255e<T> c7255e) {
            this.f28014a = c7255e;
        }

        @Override // p507w4.InterfaceC12307b
        /* JADX INFO: renamed from: a */
        public void mo5856a(int position, int count) {
            RecyclerView.AbstractC1025h abstractC1025h = this.f28014a.adapter;
            if (abstractC1025h != null) {
                abstractC1025h.m5483o(position, count);
            }
        }

        @Override // p507w4.InterfaceC12307b
        /* JADX INFO: renamed from: b */
        public void mo5857b(int position, int count) {
            RecyclerView.AbstractC1025h abstractC1025h = this.f28014a.adapter;
            if (abstractC1025h != null) {
                abstractC1025h.m5484p(position, count);
            }
        }

        @Override // p507w4.InterfaceC12307b
        /* JADX INFO: renamed from: c */
        public void mo5858c(int position, int count, Object payload) {
            RecyclerView.AbstractC1025h abstractC1025h = this.f28014a.adapter;
            if (abstractC1025h != null) {
                abstractC1025h.m5482n(position, count, payload);
            }
        }

        @Override // p507w4.InterfaceC12307b
        /* JADX INFO: renamed from: d */
        public void mo5859d(int fromPosition, int toPosition) {
            RecyclerView.AbstractC1025h abstractC1025h = this.f28014a.adapter;
            if (abstractC1025h != null) {
                abstractC1025h.m5481m(fromPosition, toPosition);
            }
        }
    }

    /* JADX INFO: renamed from: jq.e$d */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"jq/e$d", "Landroidx/recyclerview/widget/g$f;", "oldItem", "newItem", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends C1056g.f<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7255e<T> f28015a;

        public d(C7255e<T> c7255e) {
            this.f28015a = c7255e;
        }

        @Override // androidx.recyclerview.widget.C1056g.f
        /* JADX INFO: renamed from: a */
        public boolean mo5935a(T oldItem, T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) this.f28015a.areContentsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.C1056g.f
        /* JADX INFO: renamed from: b */
        public boolean mo5936b(T oldItem, T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) this.f28015a.areItemsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.C1056g.f
        /* JADX INFO: renamed from: c */
        public Object mo5937c(T oldItem, T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return this.f28015a.getChangePayload.invoke(oldItem, newItem);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super T, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7255e(@NotNull Function2<? super T, ? super T, Boolean> areItemsTheSame, @NotNull Function2<? super T, ? super T, Boolean> areContentsTheSame, @NotNull Function2<? super T, ? super T, ? extends Object> getChangePayload) {
        Intrinsics.checkNotNullParameter(areItemsTheSame, "areItemsTheSame");
        Intrinsics.checkNotNullParameter(areContentsTheSame, "areContentsTheSame");
        Intrinsics.checkNotNullParameter(getChangePayload, "getChangePayload");
        this.areItemsTheSame = areItemsTheSame;
        this.areContentsTheSame = areContentsTheSame;
        this.getChangePayload = getChangePayload;
        this.differ = new C1053d<>(new c(this), new C1052c.a(new d(this)).m5863a());
        this.itemInfos = new ArrayList();
        this.itemInfoByItemType = new LinkedHashMap();
        this.itemInfoByViewType = new LinkedHashMap();
        this.viewTypeGenerator = C7276o0.f28033a.m30317a();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m30233e(Object oldItem, Object newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.m31980c(oldItem, newItem);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m30238k(InterfaceC14057n interfaceC14057n, Object item, InterfaceC10784a b, RecyclerView.AbstractC1023f0 h10) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(h10, "h");
        interfaceC14057n.invoke(item, b, h10);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final <VB extends InterfaceC10784a> Unit m30239l(Function1<? super VB, Unit> function1, InterfaceC10784a interfaceC10784a) {
        Intrinsics.m31981d(interfaceC10784a, "null cannot be cast to non-null type VB of com.withpersona.sdk2.inquiry.shared.AdapterHelper.addItemTypeInternal");
        function1.invoke(interfaceC10784a);
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: jq.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m30240t(C7255e c7255e, List list, RecyclerView.AbstractC1025h abstractC1025h, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        c7255e.m30249s(list, abstractC1025h, function0);
    }

    /* JADX INFO: renamed from: u */
    public static final void m30241u(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: j */
    public final <R extends T, VB extends InterfaceC10784a> void m30242j(@NotNull InterfaceC6567c<?> clazz, @NotNull InterfaceC6567c<VB> viewBindingClass, @NotNull InterfaceC14057n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends InterfaceC10784a> inflateFn, @NotNull final InterfaceC14057n<? super R, ? super VB, ? super RecyclerView.AbstractC1023f0, Unit> bindViewHolder, @Nullable final Function1<? super VB, Unit> onViewCreated) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
        Intrinsics.checkNotNullParameter(bindViewHolder, "bindViewHolder");
        if (this.itemInfoByItemType.get(clazz) == null) {
            ItemInfo<T> itemInfo = new ItemInfo<>(this.viewTypeGenerator.m30316a(), viewBindingClass, inflateFn, new InterfaceC14057n() { // from class: jq.a
                @Override // p615zt.InterfaceC14057n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C7255e.m30238k(bindViewHolder, obj, (InterfaceC10784a) obj2, (RecyclerView.AbstractC1023f0) obj3);
                }
            }, onViewCreated != null ? new Function1() { // from class: jq.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C7255e.m30239l(onViewCreated, (InterfaceC10784a) obj);
                }
            } : null);
            this.itemInfos.add(itemInfo);
            this.itemInfoByItemType.put(clazz, itemInfo);
            this.itemInfoByViewType.put(Integer.valueOf(itemInfo.getViewType()), itemInfo);
            return;
        }
        throw new IllegalArgumentException(("Item type " + clazz + " has already been added.").toString());
    }

    /* JADX INFO: renamed from: m */
    public final int m30243m() {
        return this.differ.m5864a().size();
    }

    /* JADX INFO: renamed from: n */
    public final ItemInfo<T> m30244n(int position) {
        T t8 = m30246p().get(position);
        ItemInfo<T> itemInfo = this.itemInfoByItemType.get(C7731d0.m32002b(t8.getClass()));
        if (itemInfo != null) {
            return itemInfo;
        }
        throw new IllegalArgumentException(("No item info for type '" + t8.getClass() + "'. Ensure this type is added.").toString());
    }

    /* JADX INFO: renamed from: o */
    public final int m30245o(int position) {
        return m30244n(position).getViewType();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<T> m30246p() {
        List<T> listM5864a = this.differ.m5864a();
        Intrinsics.checkNotNullExpressionValue(listM5864a, "getCurrentList(...)");
        return listM5864a;
    }

    /* JADX INFO: renamed from: q */
    public final void m30247q(@NotNull RecyclerView.AbstractC1023f0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemInfo<T> itemInfoM30244n = m30244n(position);
        itemInfoM30244n.m30251a().invoke(m30246p().get(position), C7268k0.m30294a(holder), holder);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final RecyclerView.AbstractC1023f0 m30248r(@NotNull ViewGroup parent, int viewType) {
        ItemInfo<T> itemInfo;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.itemInfos.size() == 1) {
            itemInfo = (ItemInfo) CollectionsKt.m31706d0(this.itemInfos);
        } else {
            ItemInfo<T> itemInfo2 = this.itemInfoByViewType.get(Integer.valueOf(viewType));
            if (itemInfo2 == null) {
                throw new IllegalArgumentException(("No item for layout id '" + viewType + "'. Ensure this item is added. Maybe you forgot 'override fun getItemViewType(position: Int): Int = ...'?").toString());
            }
            itemInfo = itemInfo2;
        }
        InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, InterfaceC10784a> interfaceC14057nM30252b = itemInfo.m30252b();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        C7266j0 c7266j0 = new C7266j0(interfaceC14057nM30252b.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
        Function1<InterfaceC10784a, Unit> function1M30253c = itemInfo.m30253c();
        if (function1M30253c != null) {
            function1M30253c.invoke(c7266j0.m30292N());
        }
        return c7266j0;
    }

    /* JADX INFO: renamed from: s */
    public final void m30249s(@NotNull List<? extends T> newItems, @NotNull RecyclerView.AbstractC1025h<?> adapter, @Nullable final Function0<Unit> cb2) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
        this.differ.m5868e(newItems, cb2 != null ? new Runnable() { // from class: jq.d
            @Override // java.lang.Runnable
            public final void run() {
                C7255e.m30241u(cb2);
            }
        } : null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
      (r1v0 kotlin.jvm.functions.Function2)
      (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function2:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:16) call: jq.c.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function2))
      (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0009: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function2:0x000d: SGET  A[WRAPPED] (LINE:17) jq.e.a.a jq.e$a) : (r3v0 kotlin.jvm.functions.Function2))
     A[MD:(kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean>, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean>, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends java.lang.Object>):void (m)] (LINE:18) call: jq.e.<init>(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C7255e(Function2 function2, Function2 function3, Function2 function4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i10 & 2) != 0 ? new Function2() { // from class: jq.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C7255e.m30233e(obj, obj2));
            }
        } : function3, (i10 & 4) != 0 ? a.f28008a : function4);
    }
}
