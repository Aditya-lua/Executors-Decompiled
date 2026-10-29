package com.squareup.workflow1.p052ui.backstack;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import bn.C1474f;
import cn.C1684e;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.collections.C7701q;
import kotlin.collections.C7704r0;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0384m;
import p068d5.InterfaceC4445i;
import p201iu.C6988p;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u001f\b\u0001\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\f2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b!\u0010\u000eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&¨\u0006)"}, m31665d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "viewStates", "<init>", "(Ljava/util/Map;)V", "()V", "", "Lan/m;", "retaining", "", "d", "(Ljava/util/Collection;)V", "retainedRenderings", "Landroid/view/View;", "oldViewMaybe", "newView", "h", "(Ljava/util/Collection;Landroid/view/View;Landroid/view/View;)V", "key", "Ld5/i;", "parentOwner", "a", "(Ljava/lang/String;Ld5/i;)V", "b", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "from", "f", "(Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "g", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "e", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Lbn/f;", "Lbn/f;", "stateRegistryAggregator", "Saved", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class ViewStateCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, ViewStateFrame> viewStates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1474f stateRegistryAggregator;

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.ViewStateCache$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lan/m;", "it", "", "a", "(Lan/m;)Ljava/lang/String;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class C3382a extends AbstractC7746m implements Function1<C0384m<?>, String> {

        /* JADX INFO: renamed from: i */
        public static final C3382a f12857i = new C3382a();

        public C3382a() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull C0384m<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCompatibilityKey();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewStateCache(@NotNull Map<String, ViewStateFrame> viewStates) {
        Intrinsics.checkNotNullParameter(viewStates, "viewStates");
        this.viewStates = viewStates;
        this.stateRegistryAggregator = new C1474f();
    }

    /* JADX INFO: renamed from: a */
    public final void m16117a(@NotNull String key, @NotNull InterfaceC4445i parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        this.stateRegistryAggregator.m7560f(key, parentOwner);
    }

    /* JADX INFO: renamed from: b */
    public final void m16118b() {
        this.stateRegistryAggregator.m7561g();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, ViewStateFrame> m16119c() {
        return this.viewStates;
    }

    /* JADX INFO: renamed from: d */
    public final void m16120d(@NotNull Collection<? extends C0384m<?>> retaining) {
        Intrinsics.checkNotNullParameter(retaining, "retaining");
        Collection<? extends C0384m<?>> collection = retaining;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0384m) it.next()).getCompatibilityKey());
        }
        m16121e(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final void m16121e(Collection<String> retaining) {
        C7708u.m31924E(this.viewStates.keySet(), C7704r0.m31912h(this.viewStates.keySet(), retaining));
        this.stateRegistryAggregator.m7564j(retaining);
    }

    /* JADX INFO: renamed from: f */
    public final void m16122f(@NotNull Saved from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.viewStates.clear();
        this.viewStates.putAll(from.m16125a());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Saved m16123g() {
        return new Saved(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: java.util.Map<java.lang.String, com.squareup.workflow1.ui.backstack.ViewStateFrame> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m16124h(@NotNull Collection<? extends C0384m<?>> retainedRenderings, @Nullable View oldViewMaybe, @NotNull View newView) {
        Intrinsics.checkNotNullParameter(retainedRenderings, "retainedRenderings");
        Intrinsics.checkNotNullParameter(newView, "newView");
        String strM8401b = C1684e.m8401b(newView);
        Set setM29383A = C6988p.m29383A(C6988p.m29396x(CollectionsKt.m31696U(retainedRenderings), C3382a.f12857i));
        if (retainedRenderings.size() != setM29383A.size()) {
            throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + '.').toString());
        }
        this.stateRegistryAggregator.m7562h(newView, strM8401b);
        ViewStateFrame viewStateFrameRemove = this.viewStates.remove(strM8401b);
        if (viewStateFrameRemove != null) {
            newView.restoreHierarchyState(viewStateFrameRemove.m16129a());
        }
        if (oldViewMaybe != null) {
            String strM8401b2 = C1684e.m8401b(oldViewMaybe);
            if (!setM29383A.contains(strM8401b2)) {
                strM8401b2 = null;
            }
            if (strM8401b2 != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                oldViewMaybe.saveHierarchyState(sparseArray);
                Map<String, ViewStateFrame> mapM16119c = m16119c();
                Pair pairM30477a = C7352s.m30477a(strM8401b2, new ViewStateFrame(strM8401b2, sparseArray));
                mapM16119c.put(pairM30477a.m31673c(), pairM30477a.m31674d());
                this.stateRegistryAggregator.m7567m(strM8401b2);
            }
        }
        m16121e(C7704r0.m31914j(setM29383A, strM8401b));
    }

    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, m31665d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "Landroid/os/Parcelable;", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "viewStateCache", "<init>", "(Lcom/squareup/workflow1/ui/backstack/ViewStateCache;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "viewStates", "CREATOR", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Saved implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, ViewStateFrame> viewStates;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.ViewStateCache$Saved$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class Companion implements Parcelable.Creator<Saved> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.squareup.workflow1.ui.backstack.ViewStateCache.Saved.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Saved createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Saved(source);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Saved[] newArray(int size) {
                return new Saved[size];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Saved(@NotNull ViewStateCache viewStateCache) {
            Intrinsics.checkNotNullParameter(viewStateCache, "viewStateCache");
            this.viewStates = C7690k0.m31807v(viewStateCache.m16119c());
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, ViewStateFrame> m16125a() {
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
            source.readMap(C7739h0.m32039d(linkedHashMap), ViewStateCache.class.getClassLoader());
            this.viewStates = C7690k0.m31807v(linkedHashMap);
        }
    }

    public ViewStateCache() {
        this(new LinkedHashMap());
    }
}
