package go;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagArguments;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001c\u0010\"\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006$"}, d2 = {"Lgo/e;", "", "", "Lgo/d;", "defaultFeatureFlags", "Landroid/content/Context;", "context", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)V", "featureFlag", "", "d", "(Lgo/d;)Z", "a", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "", "e", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "", "", "b", "()Ljava/util/Map;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagArguments;", "c", "()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagArguments;", "Landroidx/lifecycle/l0;", "Ljava/util/Map;", "cache", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "featureFlagPrefs", "defaultFeatureFlagMap", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile Map<String, Boolean> cache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final SharedPreferences featureFlagPrefs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, d> defaultFeatureFlagMap;

    public e(@NotNull Set<d> defaultFeatureFlags, @NotNull Context context, @NotNull l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(defaultFeatureFlags, "defaultFeatureFlags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.cache = k0.j();
        this.featureFlagPrefs = context.getSharedPreferences("com.withpersona.sdk2.feature_flag_prefs", 0);
        Set<d> set = defaultFeatureFlags;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(kotlin.collections.q.u(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(((d) obj).getKey(), obj);
        }
        this.defaultFeatureFlagMap = linkedHashMap;
        Object objB = this.savedStateHandle.b("FeatureFlagManager.cache");
        Map<String, Boolean> map = objB instanceof Map ? (Map) objB : null;
        if (map != null) {
            this.cache = map;
        }
    }

    public final boolean a(@NotNull d featureFlag) {
        Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
        return d(featureFlag);
    }

    @NotNull
    public final Map<String, Boolean> b() {
        Map<String, d> map = this.defaultFeatureFlagMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Boolean.valueOf(d((d) entry.getValue())));
        }
        return linkedHashMap;
    }

    @NotNull
    public final FeatureFlagArguments c() {
        return new FeatureFlagArguments(CollectionsKt.M0(this.defaultFeatureFlagMap.keySet()));
    }

    public final boolean d(@NotNull d featureFlag) {
        Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
        String string = this.featureFlagPrefs.getString(featureFlag.getKey(), "nil");
        if (!kotlin.text.x.x(string, "nil")) {
            return Intrinsics.c(string, "true");
        }
        Boolean bool = this.cache.get(featureFlag.getKey());
        if (bool != null) {
            return bool.booleanValue();
        }
        d dVar = this.defaultFeatureFlagMap.get(featureFlag.getKey());
        Boolean boolValueOf = dVar != null ? Boolean.valueOf(dVar.getDefaultValue()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void e(@Nullable FeatureFlagResponse data) {
        if (data == null) {
            return;
        }
        List<FeatureFlagResponse.FeatureFlagDataResponse> listA = data.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(kotlin.collections.q.u(listA, 10)), 16));
        for (FeatureFlagResponse.FeatureFlagDataResponse featureFlagDataResponse : listA) {
            Pair pairA = jt.s.a(featureFlagDataResponse.getId(), Boolean.valueOf(featureFlagDataResponse.getEnabled()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        this.cache = linkedHashMap;
        this.savedStateHandle.i("FeatureFlagManager.cache", this.cache);
    }
}
