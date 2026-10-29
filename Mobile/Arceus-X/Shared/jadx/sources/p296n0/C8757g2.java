package p296n0;

import java.util.concurrent.Executor;
import p002a1.C0054c;
import p140g0.C5883f1;
import p140g0.InterfaceC5911m1;
import p424s0.InterfaceC11148i;

/* JADX INFO: renamed from: n0.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8757g2 implements InterfaceC8771i4<C5883f1>, InterfaceC8769i2, InterfaceC11148i {

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC8795n1.a<Integer> f31831Q;

    /* JADX INFO: renamed from: R */
    public static final InterfaceC8795n1.a<Integer> f31832R;

    /* JADX INFO: renamed from: S */
    public static final InterfaceC8795n1.a<InterfaceC8780k1> f31833S;

    /* JADX INFO: renamed from: T */
    public static final InterfaceC8795n1.a<Integer> f31834T;

    /* JADX INFO: renamed from: U */
    public static final InterfaceC8795n1.a<Integer> f31835U;

    /* JADX INFO: renamed from: V */
    public static final InterfaceC8795n1.a<Integer> f31836V;

    /* JADX INFO: renamed from: W */
    public static final InterfaceC8795n1.a<InterfaceC5911m1> f31837W;

    /* JADX INFO: renamed from: X */
    public static final InterfaceC8795n1.a<Boolean> f31838X;

    /* JADX INFO: renamed from: Y */
    public static final InterfaceC8795n1.a<Integer> f31839Y;

    /* JADX INFO: renamed from: Z */
    public static final InterfaceC8795n1.a<Integer> f31840Z;

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC8795n1.a<C5883f1.j> f31841a0;

    /* JADX INFO: renamed from: b0 */
    public static final InterfaceC8795n1.a<C0054c> f31842b0;

    /* JADX INFO: renamed from: c0 */
    public static final InterfaceC8795n1.a<Boolean> f31843c0;

    /* JADX INFO: renamed from: P */
    public final C8734c3 f31844P;

    static {
        Class cls = Integer.TYPE;
        f31831Q = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.captureMode", cls);
        f31832R = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.flashMode", cls);
        f31833S = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.captureBundle", InterfaceC8780k1.class);
        f31834T = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f31835U = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.outputFormat", Integer.class);
        f31836V = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f31837W = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC5911m1.class);
        f31838X = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f31839Y = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.flashType", cls);
        f31840Z = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f31841a0 = InterfaceC8795n1.a.m35291a("camerax.core.imageCapture.screenFlash", C5883f1.j.class);
        f31842b0 = InterfaceC8795n1.a.m35291a("camerax.core.useCase.postviewResolutionSelector", C0054c.class);
        f31843c0 = InterfaceC8795n1.a.m35291a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public C8757g2(C8734c3 c8734c3) {
        this.f31844P = c8734c3;
    }

    /* JADX INFO: renamed from: h0 */
    public InterfaceC8780k1 m35123h0(InterfaceC8780k1 interfaceC8780k1) {
        return (InterfaceC8780k1) mo35030h(f31833S, interfaceC8780k1);
    }

    /* JADX INFO: renamed from: i0 */
    public int m35124i0() {
        return ((Integer) mo35027e(f31831Q)).intValue();
    }

    /* JADX INFO: renamed from: j0 */
    public int m35125j0(int i10) {
        return ((Integer) mo35030h(f31832R, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: k0 */
    public int m35126k0(int i10) {
        return ((Integer) mo35030h(f31839Y, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: l0 */
    public InterfaceC5911m1 m35127l0() {
        return (InterfaceC5911m1) mo35030h(f31837W, null);
    }

    /* JADX INFO: renamed from: m0 */
    public Executor m35128m0(Executor executor) {
        return (Executor) mo35030h(InterfaceC11148i.f39377L, executor);
    }

    @Override // p296n0.InterfaceC8787l3
    /* JADX INFO: renamed from: n */
    public InterfaceC8795n1 mo6691n() {
        return this.f31844P;
    }

    /* JADX INFO: renamed from: n0 */
    public int m35129n0() {
        return ((Integer) mo35027e(f31840Z)).intValue();
    }

    /* JADX INFO: renamed from: o0 */
    public C5883f1.j m35130o0() {
        return (C5883f1.j) mo35030h(f31841a0, null);
    }

    @Override // p296n0.InterfaceC8763h2
    /* JADX INFO: renamed from: p */
    public int mo26767p() {
        return ((Integer) mo35027e(InterfaceC8763h2.f31863j)).intValue();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m35131p0() {
        return mo35023a(f31831Q);
    }
}
