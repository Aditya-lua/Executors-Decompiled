package com.squareup.workflow1.ui.backstack;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import bn.f;
import cn.e;
import com.appsflyer.sdk_base.referrer.Payload;
import d5.i;
import iu.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.q;
import kotlin.collections.r0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u001f\b\u0001\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\f2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b!\u0010\u000eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&¨\u0006)"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "viewStates", "<init>", "(Ljava/util/Map;)V", "()V", "", "Lan/m;", "retaining", "", "d", "(Ljava/util/Collection;)V", "retainedRenderings", "Landroid/view/View;", "oldViewMaybe", "newView", "h", "(Ljava/util/Collection;Landroid/view/View;Landroid/view/View;)V", "key", "Ld5/i;", "parentOwner", "a", "(Ljava/lang/String;Ld5/i;)V", "b", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "from", "f", "(Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "g", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "e", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Lbn/f;", "Lbn/f;", "stateRegistryAggregator", "Saved", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewStateCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, ViewStateFrame> viewStates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f stateRegistryAggregator;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lan/m;", "it", "", "a", "(Lan/m;)Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends m implements Function1<an.m<?>, String> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f9881i = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull an.m<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCompatibilityKey();
        }
    }

    public ViewStateCache(@NotNull Map<String, ViewStateFrame> viewStates) {
        Intrinsics.checkNotNullParameter(viewStates, "viewStates");
        this.viewStates = viewStates;
        this.stateRegistryAggregator = new f();
    }

    public final void a(@NotNull String key, @NotNull i parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        this.stateRegistryAggregator.f(key, parentOwner);
    }

    public final void b() {
        this.stateRegistryAggregator.g();
    }

    @NotNull
    public final Map<String, ViewStateFrame> c() {
        return this.viewStates;
    }

    public final void d(@NotNull Collection<? extends an.m<?>> retaining) {
        Intrinsics.checkNotNullParameter(retaining, "retaining");
        Collection<? extends an.m<?>> collection = retaining;
        ArrayList arrayList = new ArrayList(q.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((an.m) it.next()).getCompatibilityKey());
        }
        e(arrayList);
    }

    public final void e(Collection<String> retaining) {
        u.E(this.viewStates.keySet(), r0.h(this.viewStates.keySet(), retaining));
        this.stateRegistryAggregator.j(retaining);
    }

    public final void f(@NotNull Saved from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.viewStates.clear();
        this.viewStates.putAll(from.a());
    }

    @NotNull
    public final Saved g() {
        return new Saved(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(@NotNull Collection<? extends an.m<?>> retainedRenderings, @Nullable View oldViewMaybe, @NotNull View newView) {
        Intrinsics.checkNotNullParameter(retainedRenderings, "retainedRenderings");
        Intrinsics.checkNotNullParameter(newView, "newView");
        String strB = e.b(newView);
        Set setA = p.A(p.x(CollectionsKt.U(retainedRenderings), a.f9881i));
        if (retainedRenderings.size() != setA.size()) {
            throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + '.').toString());
        }
        this.stateRegistryAggregator.h(newView, strB);
        ViewStateFrame viewStateFrameRemove = this.viewStates.remove(strB);
        if (viewStateFrameRemove != null) {
            newView.restoreHierarchyState(viewStateFrameRemove.a());
        }
        if (oldViewMaybe != null) {
            String strB2 = e.b(oldViewMaybe);
            if (!setA.contains(strB2)) {
                strB2 = null;
            }
            if (strB2 != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                oldViewMaybe.saveHierarchyState(sparseArray);
                Map<String, ViewStateFrame> mapC = c();
                Pair pairA = s.a(strB2, new ViewStateFrame(strB2, sparseArray));
                mapC.put(pairA.c(), pairA.d());
                this.stateRegistryAggregator.m(strB2);
            }
        }
        e(r0.j(setA, strB));
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "Landroid/os/Parcelable;", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "viewStateCache", "<init>", "(Lcom/squareup/workflow1/ui/backstack/ViewStateCache;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "viewStates", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Saved implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, ViewStateFrame> viewStates;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.ViewStateCache$Saved$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<Saved> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Saved createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Saved(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Saved[] newArray(int size) {
                return new Saved[size];
            }

            public Companion() {
            }
        }

        public Saved(@NotNull ViewStateCache viewStateCache) {
            Intrinsics.checkNotNullParameter(viewStateCache, "viewStateCache");
            this.viewStates = k0.v(viewStateCache.c());
        }

        @NotNull
        public final Map<String, ViewStateFrame> a() {
            return this.viewStates;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeMap(this.viewStates);
        }

        public Saved(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            source.readMap(h0.d(linkedHashMap), ViewStateCache.class.getClassLoader());
            this.viewStates = k0.v(linkedHashMap);
        }
    }

    public ViewStateCache() {
        this(new LinkedHashMap());
    }
}
