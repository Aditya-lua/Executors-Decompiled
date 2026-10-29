package p296n0;

import p140g0.C5942u0;
import p140g0.InterfaceC5911m1;
import p424s0.InterfaceC11157r;

/* JADX INFO: renamed from: n0.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8751f2 implements InterfaceC8771i4<C5942u0>, InterfaceC8769i2, InterfaceC11157r {

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC8795n1.a<Integer> f31813Q = InterfaceC8795n1.a.m35291a("camerax.core.imageAnalysis.backpressureStrategy", C5942u0.b.class);

    /* JADX INFO: renamed from: R */
    public static final InterfaceC8795n1.a<Integer> f31814R = InterfaceC8795n1.a.m35291a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* JADX INFO: renamed from: S */
    public static final InterfaceC8795n1.a<InterfaceC5911m1> f31815S = InterfaceC8795n1.a.m35291a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC5911m1.class);

    /* JADX INFO: renamed from: T */
    public static final InterfaceC8795n1.a<Integer> f31816T = InterfaceC8795n1.a.m35291a("camerax.core.imageAnalysis.outputImageFormat", C5942u0.e.class);

    /* JADX INFO: renamed from: U */
    public static final InterfaceC8795n1.a<Boolean> f31817U = InterfaceC8795n1.a.m35291a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* JADX INFO: renamed from: V */
    public static final InterfaceC8795n1.a<Boolean> f31818V = InterfaceC8795n1.a.m35291a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* JADX INFO: renamed from: P */
    public final C8734c3 f31819P;

    public C8751f2(C8734c3 c8734c3) {
        this.f31819P = c8734c3;
    }

    /* JADX INFO: renamed from: h0 */
    public int m35088h0(int i10) {
        return ((Integer) mo35030h(f31813Q, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: i0 */
    public int m35089i0(int i10) {
        return ((Integer) mo35030h(f31814R, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: j0 */
    public InterfaceC5911m1 m35090j0() {
        return (InterfaceC5911m1) mo35030h(f31815S, null);
    }

    /* JADX INFO: renamed from: k0 */
    public Boolean m35091k0(Boolean bool) {
        return (Boolean) mo35030h(f31817U, bool);
    }

    /* JADX INFO: renamed from: l0 */
    public int m35092l0(int i10) {
        return ((Integer) mo35030h(f31816T, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: m0 */
    public Boolean m35093m0(Boolean bool) {
        return (Boolean) mo35030h(f31818V, bool);
    }

    @Override // p296n0.InterfaceC8787l3
    /* JADX INFO: renamed from: n */
    public InterfaceC8795n1 mo6691n() {
        return this.f31819P;
    }

    @Override // p296n0.InterfaceC8763h2
    /* JADX INFO: renamed from: p */
    public int mo26767p() {
        return 35;
    }
}
