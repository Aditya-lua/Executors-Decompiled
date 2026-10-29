package p140g0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p155h0.InterfaceC6259a;
import p296n0.C8738d1;
import p296n0.C8742e;
import p296n0.C8779k0;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8804p0;
import p424s0.C11145f;
import p424s0.InterfaceC11152m;

/* JADX INFO: renamed from: g0.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m31665d2 = {"Lg0/z;", "Lg0/y;", "Ln0/d1;", "cameraRepository", "Lh0/a;", "cameraCoordinator", "Ln0/j4;", "useCaseConfigFactory", "Ls0/m;", "streamSpecsCalculator", "<init>", "(Ln0/d1;Lh0/a;Ln0/j4;Ls0/m;)V", "", "cameraId", "Ls0/f;", "a", "(Ljava/lang/String;)Ls0/f;", "Ln0/p0;", "camera", "secondaryCamera", "Ln0/e;", "adapterCameraInfo", "secondaryAdapterCameraInfo", "Lg0/i0;", "compositionSettings", "secondaryCompositionSettings", "b", "(Ln0/p0;Ln0/p0;Ln0/e;Ln0/e;Lg0/i0;Lg0/i0;)Ls0/f;", "c", "Ln0/d1;", "Lh0/a;", "Ln0/j4;", "d", "Ls0/m;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C5961z implements InterfaceC5957y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C8738d1 cameraRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6259a cameraCoordinator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8777j4 useCaseConfigFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11152m streamSpecsCalculator;

    public C5961z(@NotNull C8738d1 cameraRepository, @NotNull InterfaceC6259a cameraCoordinator, @NotNull InterfaceC8777j4 useCaseConfigFactory, @NotNull InterfaceC11152m streamSpecsCalculator) {
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        Intrinsics.checkNotNullParameter(cameraCoordinator, "cameraCoordinator");
        Intrinsics.checkNotNullParameter(useCaseConfigFactory, "useCaseConfigFactory");
        Intrinsics.checkNotNullParameter(streamSpecsCalculator, "streamSpecsCalculator");
        this.cameraRepository = cameraRepository;
        this.cameraCoordinator = cameraCoordinator;
        this.useCaseConfigFactory = useCaseConfigFactory;
        this.streamSpecsCalculator = streamSpecsCalculator;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C11145f m26758d(C5961z c5961z, InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, C8742e c8742e, C8742e c8742e2, C5894i0 c5894i0, C5894i0 c5894i1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC8804p1 = null;
        }
        if ((i10 & 8) != 0) {
            c8742e2 = null;
        }
        if ((i10 & 16) != 0) {
            c5894i0 = C5894i0.f22527d;
        }
        if ((i10 & 32) != 0) {
            c5894i1 = C5894i0.f22527d;
        }
        return c5961z.m26759c(interfaceC8804p0, interfaceC8804p1, c8742e, c8742e2, c5894i0, c5894i1);
    }

    @Override // p140g0.InterfaceC5957y
    @NotNull
    /* JADX INFO: renamed from: a */
    public C11145f mo26748a(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        InterfaceC8804p0 interfaceC8804p0M35039l = this.cameraRepository.m35039l(cameraId);
        Intrinsics.checkNotNullExpressionValue(interfaceC8804p0M35039l, "getCamera(...)");
        return m26758d(this, interfaceC8804p0M35039l, null, new C8742e(interfaceC8804p0M35039l.mo6698k(), C8779k0.m35231a()), null, null, null, 58, null);
    }

    @Override // p140g0.InterfaceC5957y
    @NotNull
    /* JADX INFO: renamed from: b */
    public C11145f mo26749b(@NotNull InterfaceC8804p0 camera, @Nullable InterfaceC8804p0 secondaryCamera, @NotNull C8742e adapterCameraInfo, @Nullable C8742e secondaryAdapterCameraInfo, @NotNull C5894i0 compositionSettings, @NotNull C5894i0 secondaryCompositionSettings) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(adapterCameraInfo, "adapterCameraInfo");
        Intrinsics.checkNotNullParameter(compositionSettings, "compositionSettings");
        Intrinsics.checkNotNullParameter(secondaryCompositionSettings, "secondaryCompositionSettings");
        return m26759c(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings);
    }

    /* JADX INFO: renamed from: c */
    public final C11145f m26759c(InterfaceC8804p0 camera, InterfaceC8804p0 secondaryCamera, C8742e adapterCameraInfo, C8742e secondaryAdapterCameraInfo, C5894i0 compositionSettings, C5894i0 secondaryCompositionSettings) {
        return new C11145f(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings, this.cameraCoordinator, this.streamSpecsCalculator, this.useCaseConfigFactory);
    }
}
