package p296n0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.AbstractC5952w2;
import p140g0.C5888g2;
import p140g0.InterfaceC5957y;
import p204j0.ResolvedFeatureGroup;
import p424s0.C11145f;
import p424s0.CalculatedUseCaseInfo;

/* JADX INFO: renamed from: n0.c4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Ln0/c4;", "", "<init>", "()V", "Ln0/o0;", "cameraInfoInternal", "Lg0/g2;", "sessionConfig", "", "findMaxSupportedFrameRate", "Lj0/b;", "resolvedFeatureGroup", "Ls0/b;", "c", "(Ln0/o0;Lg0/g2;ZLj0/b;)Ls0/b;", "Lg0/y;", "b", "Lg0/y;", "a", "()Lg0/y;", "(Lg0/y;)V", "getCameraUseCaseAdapterProvider$annotations", "cameraUseCaseAdapterProvider", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C8735c4 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8735c4 f31787a = new C8735c4();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static InterfaceC5957y cameraUseCaseAdapterProvider;

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5957y m35031a() {
        InterfaceC5957y interfaceC5957y = cameraUseCaseAdapterProvider;
        if (interfaceC5957y != null) {
            return interfaceC5957y;
        }
        Intrinsics.m31998u("cameraUseCaseAdapterProvider");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m35032b(@NotNull InterfaceC5957y interfaceC5957y) {
        Intrinsics.checkNotNullParameter(interfaceC5957y, "<set-?>");
        cameraUseCaseAdapterProvider = interfaceC5957y;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final CalculatedUseCaseInfo m35033c(@NotNull InterfaceC8799o0 cameraInfoInternal, @NotNull C5888g2 sessionConfig, boolean findMaxSupportedFrameRate, @Nullable ResolvedFeatureGroup resolvedFeatureGroup) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        if (cameraUseCaseAdapterProvider == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        InterfaceC5957y interfaceC5957yM35031a = m35031a();
        String strMo6750e = cameraInfoInternal.mo6750e();
        Intrinsics.checkNotNullExpressionValue(strMo6750e, "getCameraId(...)");
        C11145f c11145fMo26748a = interfaceC5957yM35031a.mo26748a(strMo6750e);
        c11145fMo26748a.m41987m0(sessionConfig.getViewPort());
        c11145fMo26748a.m41984i0(sessionConfig.m26466c());
        c11145fMo26748a.m41986l0(sessionConfig.getSessionType());
        c11145fMo26748a.m41985k0(sessionConfig.m26469f());
        List<AbstractC5952w2> listM26474k = sessionConfig.m26474k();
        if (resolvedFeatureGroup == null) {
            resolvedFeatureGroup = ResolvedFeatureGroup.Companion.m29678c(ResolvedFeatureGroup.INSTANCE, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        CalculatedUseCaseInfo c11141bM41990o0 = c11145fMo26748a.m41990o0(listM26474k, resolvedFeatureGroup, findMaxSupportedFrameRate);
        Intrinsics.checkNotNullExpressionValue(c11141bM41990o0, "simulateAddUseCases(...)");
        return c11141bM41990o0;
    }
}
