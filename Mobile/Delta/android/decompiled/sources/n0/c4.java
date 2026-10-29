package n0;

import j0.ResolvedFeatureGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.CalculatedUseCaseInfo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014¨\u0006\u0017"}, d2 = {"Ln0/c4;", "", "<init>", "()V", "Ln0/o0;", "cameraInfoInternal", "Lg0/g2;", "sessionConfig", "", "findMaxSupportedFrameRate", "Lj0/b;", "resolvedFeatureGroup", "Ls0/b;", "c", "(Ln0/o0;Lg0/g2;ZLj0/b;)Ls0/b;", "Lg0/y;", "b", "Lg0/y;", "a", "()Lg0/y;", "(Lg0/y;)V", "getCameraUseCaseAdapterProvider$annotations", "cameraUseCaseAdapterProvider", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c4 f24622a = new c4();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static g0.y cameraUseCaseAdapterProvider;

    @NotNull
    public static final g0.y a() {
        g0.y yVar = cameraUseCaseAdapterProvider;
        if (yVar != null) {
            return yVar;
        }
        Intrinsics.u("cameraUseCaseAdapterProvider");
        return null;
    }

    public static final void b(@NotNull g0.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        cameraUseCaseAdapterProvider = yVar;
    }

    @NotNull
    public static final CalculatedUseCaseInfo c(@NotNull o0 cameraInfoInternal, @NotNull g0.g2 sessionConfig, boolean findMaxSupportedFrameRate, @Nullable ResolvedFeatureGroup resolvedFeatureGroup) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        if (cameraUseCaseAdapterProvider == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        g0.y yVarA = a();
        String strE = cameraInfoInternal.e();
        Intrinsics.checkNotNullExpressionValue(strE, "getCameraId(...)");
        s0.f fVarA = yVarA.a(strE);
        fVarA.m0(sessionConfig.getViewPort());
        fVarA.i0(sessionConfig.c());
        fVarA.l0(sessionConfig.getSessionType());
        fVarA.k0(sessionConfig.f());
        List<g0.w2> listK = sessionConfig.k();
        if (resolvedFeatureGroup == null) {
            resolvedFeatureGroup = ResolvedFeatureGroup.Companion.c(ResolvedFeatureGroup.INSTANCE, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        CalculatedUseCaseInfo bVarO0 = fVarA.o0(listK, resolvedFeatureGroup, findMaxSupportedFrameRate);
        Intrinsics.checkNotNullExpressionValue(bVarO0, "simulateAddUseCases(...)");
        return bVarO0;
    }
}
