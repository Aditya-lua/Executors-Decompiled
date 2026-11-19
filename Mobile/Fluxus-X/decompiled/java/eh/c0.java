package eh;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Leh/c0;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "consentRequired", "Leh/b0;", "cache", "trackingOptedOut", "attributionBlocked", "Leh/d0;", "b", "(Ljava/lang/Boolean;Leh/b0;ZZ)Leh/d0;", "e", "(Leh/b0;)Z", "applySharingFilter", "dmaConsented", "d", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZ)Leh/d0;", "c", "(ZLjava/lang/Boolean;)Leh/d0;", BuildConfig.FLAVOR, "timestampMs", "hasApplySharingFilter", "dmaMalformed", "nowMs", "ttlMs", "a", "(JZZLjava/lang/Boolean;ZJJ)Leh/b0;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f13482a = new c0();

    @NotNull
    public static final b0 a(long timestampMs, boolean hasApplySharingFilter, boolean applySharingFilter, @Nullable Boolean dmaConsented, boolean dmaMalformed, long nowMs, long ttlMs) {
        boolean z10 = timestampMs != 0;
        if (!z10 && !hasApplySharingFilter) {
            return b0.a.f13478a;
        }
        if (z10 && hasApplySharingFilter && !dmaMalformed) {
            return nowMs - timestampMs > ttlMs ? b0.d.f13481a : new b0.Fresh(applySharingFilter, dmaConsented);
        }
        return b0.c.f13480a;
    }

    @NotNull
    public static final d0 b(@Nullable Boolean consentRequired, @NotNull b0 cache, boolean trackingOptedOut, boolean attributionBlocked) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        if (trackingOptedOut) {
            return d0.BLOCK_TRACKING_OPT_OUT;
        }
        if (attributionBlocked) {
            return d0.BLOCK_ATTRIBUTION_BLOCKED;
        }
        b0.Fresh fresh = cache instanceof b0.Fresh ? (b0.Fresh) cache : null;
        d0 d0VarC = fresh != null ? c(fresh.getApplySharingFilter(), fresh.getDmaConsented()) : null;
        if (d0VarC == null || d0VarC.getCollectionEnabled()) {
            if (Intrinsics.c(consentRequired, Boolean.FALSE)) {
                return d0.NOT_REQUIRED;
            }
            if (d0VarC == null) {
                return Intrinsics.c(cache, b0.a.f13478a) ? d0.STAY_OFF_NO_DECISION : d0.STAY_OFF_STALE_CACHE;
            }
        }
        return d0VarC;
    }

    @NotNull
    public static final d0 c(boolean applySharingFilter, @Nullable Boolean dmaConsented) {
        if (applySharingFilter) {
            return d0.BLOCK_SHARING_FILTER;
        }
        return Intrinsics.c(dmaConsented, Boolean.FALSE) ? d0.BLOCK_DMA_WITHDRAWAL : d0.ALLOW;
    }

    @Nullable
    public static final d0 d(@Nullable Boolean consentRequired, @Nullable Boolean applySharingFilter, @Nullable Boolean dmaConsented, boolean trackingOptedOut, boolean attributionBlocked) {
        if (trackingOptedOut) {
            return d0.BLOCK_TRACKING_OPT_OUT;
        }
        if (attributionBlocked) {
            return d0.BLOCK_ATTRIBUTION_BLOCKED;
        }
        if (applySharingFilter != null) {
            return c(applySharingFilter.booleanValue(), dmaConsented);
        }
        Boolean bool = Boolean.FALSE;
        if (!Intrinsics.c(consentRequired, bool)) {
            return c(true, dmaConsented);
        }
        if (Intrinsics.c(dmaConsented, bool)) {
            return d0.BLOCK_DMA_WITHDRAWAL;
        }
        return null;
    }

    public static final boolean e(@NotNull b0 cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        b0.Fresh fresh = cache instanceof b0.Fresh ? (b0.Fresh) cache : null;
        return fresh != null && (c(fresh.getApplySharingFilter(), fresh.getDmaConsented()).getCollectionEnabled() ^ true);
    }
}
