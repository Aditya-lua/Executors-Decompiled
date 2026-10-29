package jq;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u00013B[\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0093\u0001\u0010\u0019\u001a\u00020\u0015\"\b\b\u0001\u0010\n*\u00028\u0000\"\b\b\u0002\u0010\f*\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u00102\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00102\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J9\u0010,\u001a\u00020\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001c\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00018\u00008\u0000078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010C\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR&\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000&8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010O\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Ljq/e;", "", "T", "Lkotlin/Function2;", "", "areItemsTheSame", "areContentsTheSame", "getChangePayload", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "R", "Lr5/a;", "VB", "Lhu/c;", "clazz", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "j", "(Lhu/c;Lhu/c;Lzt/n;Lzt/n;Lkotlin/jvm/functions/Function1;)V", "", "position", "o", "(I)I", "parent", "viewType", "r", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "holder", "q", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "", "newItems", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Lkotlin/Function0;", "cb", "s", "(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$h;Lkotlin/jvm/functions/Function0;)V", "Ljq/e$b;", "n", "(I)Ljq/e$b;", "a", "Lkotlin/jvm/functions/Function2;", "b", "c", "d", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "e", "Landroidx/recyclerview/widget/d;", "differ", "", "f", "Ljava/util/List;", "itemInfos", "", "g", "Ljava/util/Map;", "itemInfoByItemType", "h", "itemInfoByViewType", "Ljq/n0;", "i", "Ljq/n0;", "viewTypeGenerator", "p", "()Ljava/util/List;", "items", "m", "()I", "itemCount", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<T, T, Boolean> areItemsTheSame;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, T, Boolean> areContentsTheSame;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<T, T, Object> getChangePayload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RecyclerView.h<?> adapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.recyclerview.widget.d<T> differ;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ItemInfo<T>> itemInfos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<hu.c<?>, ItemInfo<T>> itemInfoByItemType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Integer, ItemInfo<T>> itemInfoByViewType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n0 viewTypeGenerator;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21610a = new a();

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(T old, T t8) {
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(t8, "new");
            return null;
        }
    }

    /* JADX INFO: renamed from: jq.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R/\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010%R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"Ljq/e$b;", "T", "", "", "viewType", "Lhu/c;", "Lr5/a;", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "<init>", "(ILhu/c;Lzt/n;Lzt/n;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Lhu/c;", "getViewBindingClass", "()Lhu/c;", "c", "Lzt/n;", "()Lzt/n;", "e", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemInfo<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final int viewType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final hu.c<? extends r5.a> viewBindingClass;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final zt.n<LayoutInflater, ViewGroup, Boolean, r5.a> inflateFn;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final zt.n<T, r5.a, RecyclerView.f0, Unit> bindViewHolder;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Function1<r5.a, Unit> onViewCreated;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemInfo(int i10, @NotNull hu.c<? extends r5.a> viewBindingClass, @NotNull zt.n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends r5.a> inflateFn, @NotNull zt.n<? super T, ? super r5.a, ? super RecyclerView.f0, Unit> bindViewHolder, @Nullable Function1<? super r5.a, Unit> function1) {
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
        public final zt.n<T, r5.a, RecyclerView.f0, Unit> a() {
            return this.bindViewHolder;
        }

        @NotNull
        public final zt.n<LayoutInflater, ViewGroup, Boolean, r5.a> b() {
            return this.inflateFn;
        }

        @Nullable
        public final Function1<r5.a, Unit> c() {
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
            return this.viewType == itemInfo.viewType && Intrinsics.c(this.viewBindingClass, itemInfo.viewBindingClass) && Intrinsics.c(this.inflateFn, itemInfo.inflateFn) && Intrinsics.c(this.bindViewHolder, itemInfo.bindViewHolder) && Intrinsics.c(this.onViewCreated, itemInfo.onViewCreated);
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.viewType) * 31) + this.viewBindingClass.hashCode()) * 31) + this.inflateFn.hashCode()) * 31) + this.bindViewHolder.hashCode()) * 31;
            Function1<r5.a, Unit> function1 = this.onViewCreated;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        @NotNull
        public String toString() {
            return "ItemInfo(viewType=" + this.viewType + ", viewBindingClass=" + this.viewBindingClass + ", inflateFn=" + this.inflateFn + ", bindViewHolder=" + this.bindViewHolder + ", onViewCreated=" + this.onViewCreated + ")";
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"jq/e$c", "Lw4/b;", "", "position", "count", "", "a", "(II)V", "b", "fromPosition", "toPosition", "d", "", "payload", "c", "(IILjava/lang/Object;)V", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements w4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f21615a;

        public c(e<T> eVar) {
            this.f21615a = eVar;
        }

        @Override // w4.b
        public void a(int position, int count) {
            RecyclerView.h hVar = this.f21615a.adapter;
            if (hVar != null) {
                hVar.o(position, count);
            }
        }

        @Override // w4.b
        public void b(int position, int count) {
            RecyclerView.h hVar = this.f21615a.adapter;
            if (hVar != null) {
                hVar.p(position, count);
            }
        }

        @Override // w4.b
        public void c(int position, int count, Object payload) {
            RecyclerView.h hVar = this.f21615a.adapter;
            if (hVar != null) {
                hVar.n(position, count, payload);
            }
        }

        @Override // w4.b
        public void d(int fromPosition, int toPosition) {
            RecyclerView.h hVar = this.f21615a.adapter;
            if (hVar != null) {
                hVar.m(fromPosition, toPosition);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"jq/e$d", "Landroidx/recyclerview/widget/g$f;", "oldItem", "newItem", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends androidx.recyclerview.widget.g.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f21616a;

        public d(e<T> eVar) {
            this.f21616a = eVar;
        }

        @Override // androidx.recyclerview.widget.g.f
        public boolean a(T oldItem, T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) this.f21616a.areContentsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.g.f
        public boolean b(T oldItem, T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) this.f21616a.areItemsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.g.f
        public Object c(T oldItem, T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return this.f21616a.getChangePayload.invoke(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull Function2<? super T, ? super T, Boolean> areItemsTheSame, @NotNull Function2<? super T, ? super T, Boolean> areContentsTheSame, @NotNull Function2<? super T, ? super T, ? extends Object> getChangePayload) {
        Intrinsics.checkNotNullParameter(areItemsTheSame, "areItemsTheSame");
        Intrinsics.checkNotNullParameter(areContentsTheSame, "areContentsTheSame");
        Intrinsics.checkNotNullParameter(getChangePayload, "getChangePayload");
        this.areItemsTheSame = areItemsTheSame;
        this.areContentsTheSame = areContentsTheSame;
        this.getChangePayload = getChangePayload;
        this.differ = new androidx.recyclerview.widget.d<>(new c(this), new androidx.recyclerview.widget.c.a(new d(this)).a());
        this.itemInfos = new ArrayList();
        this.itemInfoByItemType = new LinkedHashMap();
        this.itemInfoByViewType = new LinkedHashMap();
        this.viewTypeGenerator = o0.f21630a.a();
    }

    public static final boolean e(Object oldItem, Object newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.c(oldItem, newItem);
    }

    public static final Unit k(zt.n nVar, Object item, r5.a b, RecyclerView.f0 h10) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(h10, "h");
        nVar.invoke(item, b, h10);
        return Unit.f22483a;
    }

    public static final <VB extends r5.a> Unit l(Function1<? super VB, Unit> function1, r5.a aVar) {
        Intrinsics.d(aVar, "null cannot be cast to non-null type VB of com.withpersona.sdk2.inquiry.shared.AdapterHelper.addItemTypeInternal");
        function1.invoke(aVar);
        return Unit.f22483a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(e eVar, List list, RecyclerView.h hVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        eVar.s(list, hVar, function0);
    }

    public static final void u(Function0 function0) {
        function0.invoke();
    }

    public final <R extends T, VB extends r5.a> void j(@NotNull hu.c<?> clazz, @NotNull hu.c<VB> viewBindingClass, @NotNull zt.n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends r5.a> inflateFn, @NotNull final zt.n<? super R, ? super VB, ? super RecyclerView.f0, Unit> bindViewHolder, @Nullable final Function1<? super VB, Unit> onViewCreated) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
        Intrinsics.checkNotNullParameter(bindViewHolder, "bindViewHolder");
        if (this.itemInfoByItemType.get(clazz) == null) {
            ItemInfo<T> itemInfo = new ItemInfo<>(this.viewTypeGenerator.a(), viewBindingClass, inflateFn, new zt.n() { // from class: jq.a
                @Override // zt.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return e.k(bindViewHolder, obj, (r5.a) obj2, (RecyclerView.f0) obj3);
                }
            }, onViewCreated != null ? new Function1() { // from class: jq.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.l(onViewCreated, (r5.a) obj);
                }
            } : null);
            this.itemInfos.add(itemInfo);
            this.itemInfoByItemType.put(clazz, itemInfo);
            this.itemInfoByViewType.put(Integer.valueOf(itemInfo.getViewType()), itemInfo);
            return;
        }
        throw new IllegalArgumentException(("Item type " + clazz + " has already been added.").toString());
    }

    public final int m() {
        return this.differ.a().size();
    }

    public final ItemInfo<T> n(int position) {
        T t8 = p().get(position);
        ItemInfo<T> itemInfo = this.itemInfoByItemType.get(kotlin.jvm.internal.d0.b(t8.getClass()));
        if (itemInfo != null) {
            return itemInfo;
        }
        throw new IllegalArgumentException(("No item info for type '" + t8.getClass() + "'. Ensure this type is added.").toString());
    }

    public final int o(int position) {
        return n(position).getViewType();
    }

    @NotNull
    public final List<T> p() {
        List<T> listA = this.differ.a();
        Intrinsics.checkNotNullExpressionValue(listA, "getCurrentList(...)");
        return listA;
    }

    public final void q(@NotNull RecyclerView.f0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemInfo<T> itemInfoN = n(position);
        itemInfoN.a().invoke(p().get(position), k0.a(holder), holder);
    }

    @NotNull
    public final RecyclerView.f0 r(@NotNull ViewGroup parent, int viewType) {
        ItemInfo<T> itemInfo;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.itemInfos.size() == 1) {
            itemInfo = (ItemInfo) CollectionsKt.d0(this.itemInfos);
        } else {
            ItemInfo<T> itemInfo2 = this.itemInfoByViewType.get(Integer.valueOf(viewType));
            if (itemInfo2 == null) {
                throw new IllegalArgumentException(("No item for layout id '" + viewType + "'. Ensure this item is added. Maybe you forgot 'override fun getItemViewType(position: Int): Int = ...'?").toString());
            }
            itemInfo = itemInfo2;
        }
        zt.n<LayoutInflater, ViewGroup, Boolean, r5.a> nVarB = itemInfo.b();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        j0 j0Var = new j0(nVarB.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
        Function1<r5.a, Unit> function1C = itemInfo.c();
        if (function1C != null) {
            function1C.invoke(j0Var.N());
        }
        return j0Var;
    }

    public final void s(@NotNull List<? extends T> newItems, @NotNull RecyclerView.h<?> adapter, @Nullable final Function0<Unit> cb2) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
        this.differ.e(newItems, cb2 != null ? new Runnable() { // from class: jq.d
            @Override // java.lang.Runnable
            public final void run() {
                e.u(cb2);
            }
        } : null);
    }

    public /* synthetic */ e(Function2 function2, Function2 function3, Function2 function4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i10 & 2) != 0 ? new Function2() { // from class: jq.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(e.e(obj, obj2));
            }
        } : function3, (i10 & 4) != 0 ? a.f21610a : function4);
    }
}
