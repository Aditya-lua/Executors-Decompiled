package g0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.j4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lg0/z;", "Lg0/y;", "Ln0/d1;", "cameraRepository", "Lh0/a;", "cameraCoordinator", "Ln0/j4;", "useCaseConfigFactory", "Ls0/m;", "streamSpecsCalculator", "<init>", "(Ln0/d1;Lh0/a;Ln0/j4;Ls0/m;)V", "", "cameraId", "Ls0/f;", "a", "(Ljava/lang/String;)Ls0/f;", "Ln0/p0;", "camera", "secondaryCamera", "Ln0/e;", "adapterCameraInfo", "secondaryAdapterCameraInfo", "Lg0/i0;", "compositionSettings", "secondaryCompositionSettings", "b", "(Ln0/p0;Ln0/p0;Ln0/e;Ln0/e;Lg0/i0;Lg0/i0;)Ls0/f;", "c", "Ln0/d1;", "Lh0/a;", "Ln0/j4;", "d", "Ls0/m;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n0.d1 cameraRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h0.a cameraCoordinator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j4 useCaseConfigFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s0.m streamSpecsCalculator;

    public z(@NotNull n0.d1 cameraRepository, @NotNull h0.a cameraCoordinator, @NotNull j4 useCaseConfigFactory, @NotNull s0.m streamSpecsCalculator) {
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        Intrinsics.checkNotNullParameter(cameraCoordinator, "cameraCoordinator");
        Intrinsics.checkNotNullParameter(useCaseConfigFactory, "useCaseConfigFactory");
        Intrinsics.checkNotNullParameter(streamSpecsCalculator, "streamSpecsCalculator");
        this.cameraRepository = cameraRepository;
        this.cameraCoordinator = cameraCoordinator;
        this.useCaseConfigFactory = useCaseConfigFactory;
        this.streamSpecsCalculator = streamSpecsCalculator;
    }

    public static /* synthetic */ s0.f d(z zVar, n0.p0 p0Var, n0.p0 p0Var2, n0.e eVar, n0.e eVar2, i0 i0Var, i0 i0Var2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            p0Var2 = null;
        }
        if ((i10 & 8) != 0) {
            eVar2 = null;
        }
        if ((i10 & 16) != 0) {
            i0Var = i0.f17453d;
        }
        if ((i10 & 32) != 0) {
            i0Var2 = i0.f17453d;
        }
        return zVar.c(p0Var, p0Var2, eVar, eVar2, i0Var, i0Var2);
    }

    @Override // g0.y
    @NotNull
    public s0.f a(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        n0.p0 p0VarL = this.cameraRepository.l(cameraId);
        Intrinsics.checkNotNullExpressionValue(p0VarL, "getCamera(...)");
        return d(this, p0VarL, null, new n0.e(p0VarL.k(), n0.k0.a()), null, null, null, 58, null);
    }

    @Override // g0.y
    @NotNull
    public s0.f b(@NotNull n0.p0 camera, @Nullable n0.p0 secondaryCamera, @NotNull n0.e adapterCameraInfo, @Nullable n0.e secondaryAdapterCameraInfo, @NotNull i0 compositionSettings, @NotNull i0 secondaryCompositionSettings) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(adapterCameraInfo, "adapterCameraInfo");
        Intrinsics.checkNotNullParameter(compositionSettings, "compositionSettings");
        Intrinsics.checkNotNullParameter(secondaryCompositionSettings, "secondaryCompositionSettings");
        return c(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings);
    }

    public final s0.f c(n0.p0 camera, n0.p0 secondaryCamera, n0.e adapterCameraInfo, n0.e secondaryAdapterCameraInfo, i0 compositionSettings, i0 secondaryCompositionSettings) {
        return new s0.f(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings, this.cameraCoordinator, this.streamSpecsCalculator, this.useCaseConfigFactory);
    }
}
