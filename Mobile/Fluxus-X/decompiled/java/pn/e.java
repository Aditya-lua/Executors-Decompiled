package pn;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import e5.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.k0;
import p001kotlin.collections.q;
import p001kotlin.collections.r0;
import p001kotlin.collections.u;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.h0;
import p001kotlin.jvm.internal.m;
import yu.p;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\b\u0001\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\f2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b!\u0010\u000eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&¨\u0006("}, d2 = {"Lpn/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lpn/g;", "viewStates", "<init>", "(Ljava/util/Map;)V", "()V", BuildConfig.FLAVOR, "Lnn/m;", "retaining", BuildConfig.FLAVOR, "d", "(Ljava/util/Collection;)V", "retainedRenderings", "Landroid/view/View;", "oldViewMaybe", "newView", "h", "(Ljava/util/Collection;Landroid/view/View;Landroid/view/View;)V", "key", "Le5/i;", "parentOwner", "a", "(Ljava/lang/String;Le5/i;)V", "b", "Lpn/e$a;", "from", "f", "(Lpn/e$a;)V", "g", "()Lpn/e$a;", "e", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Lon/f;", "Lon/f;", "stateRegistryAggregator", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, ViewStateFrame> viewStates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final on.f stateRegistryAggregator;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnn/m;", "it", BuildConfig.FLAVOR, "a", "(Lnn/m;)Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends m implements Function1<nn.m<?>, String> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f29230i = new b();

        public b() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull nn.m<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCompatibilityKey();
        }
    }

    public e(@NotNull Map<String, ViewStateFrame> viewStates) {
        Intrinsics.checkNotNullParameter(viewStates, "viewStates");
        this.viewStates = viewStates;
        this.stateRegistryAggregator = new on.f();
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

    public final void d(@NotNull Collection<? extends nn.m<?>> retaining) {
        Intrinsics.checkNotNullParameter(retaining, "retaining");
        Collection<? extends nn.m<?>> collection = retaining;
        ArrayList arrayList = new ArrayList(q.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((nn.m) it.next()).getCompatibilityKey());
        }
        e(arrayList);
    }

    public final void e(Collection<String> retaining) {
        u.E(this.viewStates.keySet(), r0.h(this.viewStates.keySet(), retaining));
        this.stateRegistryAggregator.j(retaining);
    }

    public final void f(@NotNull a from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.viewStates.clear();
        this.viewStates.putAll(from.a());
    }

    @NotNull
    public final a g() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(@NotNull Collection<? extends nn.m<?>> retainedRenderings, @Nullable View oldViewMaybe, @NotNull View newView) {
        Intrinsics.checkNotNullParameter(retainedRenderings, "retainedRenderings");
        Intrinsics.checkNotNullParameter(newView, "newView");
        String strB = f.b(newView);
        Set setA = p.A(p.x(CollectionsKt.U(retainedRenderings), b.f29230i));
        if (retainedRenderings.size() != setA.size()) {
            throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + '.').toString());
        }
        this.stateRegistryAggregator.h(newView, strB);
        ViewStateFrame viewStateFrameRemove = this.viewStates.remove(strB);
        if (viewStateFrameRemove != null) {
            newView.restoreHierarchyState(viewStateFrameRemove.a());
        }
        if (oldViewMaybe != null) {
            String strB2 = f.b(oldViewMaybe);
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

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, d2 = {"Lpn/e$a;", "Landroid/os/Parcelable;", "Lpn/e;", "viewStateCache", "<init>", "(Lpn/e;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", BuildConfig.FLAVOR, "describeContents", "()I", "out", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lpn/g;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "viewStates", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, ViewStateFrame> viewStates;

        /* JADX INFO: renamed from: pn.e$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpn/e$a$a;", "Landroid/os/Parcelable$Creator;", "Lpn/e$a;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lpn/e$a;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "b", "(I)[Lpn/e$a;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<a> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new a(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int size) {
                return new a[size];
            }

            public Companion() {
            }
        }

        public a(@NotNull e viewStateCache) {
            Intrinsics.checkNotNullParameter(viewStateCache, "viewStateCache");
            this.viewStates = k0.w(viewStateCache.c());
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

        public a(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            source.readMap(h0.d(linkedHashMap), e.class.getClassLoader());
            this.viewStates = k0.w(linkedHashMap);
        }
    }

    public e() {
        this(new LinkedHashMap());
    }
}
