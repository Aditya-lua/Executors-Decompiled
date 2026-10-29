package p152go;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagArguments;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;

/* JADX INFO: renamed from: go.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001c\u0010\"\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006$"}, m31665d2 = {"Lgo/e;", "", "", "Lgo/d;", "defaultFeatureFlags", "Landroid/content/Context;", "context", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)V", "featureFlag", "", "d", "(Lgo/d;)Z", "a", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "", "e", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "", "", "b", "()Ljava/util/Map;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagArguments;", "c", "()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagArguments;", "Landroidx/lifecycle/l0;", "Ljava/util/Map;", "cache", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "featureFlagPrefs", "defaultFeatureFlagMap", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6159e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile Map<String, Boolean> cache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final SharedPreferences featureFlagPrefs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InterfaceC6158d> defaultFeatureFlagMap;

    public C6159e(@NotNull Set<InterfaceC6158d> defaultFeatureFlags, @NotNull Context context, @NotNull C0967l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(defaultFeatureFlags, "defaultFeatureFlags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.cache = C7690k0.m31795j();
        this.featureFlagPrefs = context.getSharedPreferences("com.withpersona.sdk2.feature_flag_prefs", 0);
        Set<InterfaceC6158d> set = defaultFeatureFlags;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(((InterfaceC6158d) obj).getKey(), obj);
        }
        this.defaultFeatureFlagMap = linkedHashMap;
        Object objM4947b = this.savedStateHandle.m4947b("FeatureFlagManager.cache");
        Map<String, Boolean> map = objM4947b instanceof Map ? (Map) objM4947b : null;
        if (map != null) {
            this.cache = map;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27145a(@NotNull InterfaceC6158d featureFlag) {
        Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
        return m27148d(featureFlag);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, Boolean> m27146b() {
        Map<String, InterfaceC6158d> map = this.defaultFeatureFlagMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Boolean.valueOf(m27148d((InterfaceC6158d) entry.getValue())));
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final FeatureFlagArguments m27147c() {
        return new FeatureFlagArguments(CollectionsKt.m31687M0(this.defaultFeatureFlagMap.keySet()));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m27148d(@NotNull InterfaceC6158d featureFlag) {
        Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
        String string = this.featureFlagPrefs.getString(featureFlag.getKey(), "nil");
        if (!C7797x.m32312x(string, "nil")) {
            return Intrinsics.m31980c(string, "true");
        }
        Boolean bool = this.cache.get(featureFlag.getKey());
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC6158d interfaceC6158d = this.defaultFeatureFlagMap.get(featureFlag.getKey());
        Boolean boolValueOf = interfaceC6158d != null ? Boolean.valueOf(interfaceC6158d.getDefaultValue()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m27149e(@Nullable FeatureFlagResponse data) {
        if (data == null) {
            return;
        }
        List<FeatureFlagResponse.FeatureFlagDataResponse> listM16913a = data.m16913a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(listM16913a, 10)), 16));
        for (FeatureFlagResponse.FeatureFlagDataResponse featureFlagDataResponse : listM16913a) {
            Pair pairM30477a = C7352s.m30477a(featureFlagDataResponse.getId(), Boolean.valueOf(featureFlagDataResponse.getEnabled()));
            linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
        }
        this.cache = linkedHashMap;
        this.savedStateHandle.m4954i("FeatureFlagManager.cache", this.cache);
    }
}
