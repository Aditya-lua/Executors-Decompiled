package p141g1;

import java.util.Objects;
import p115f1.C5284p1;
import p115f1.InterfaceC5237a2;
import p282m1.InterfaceC8389r1;
import p296n0.C8734c3;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8795n1;
import p424s0.InterfaceC11157r;
import p533x2.C12637g;

/* JADX INFO: renamed from: g1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5965a<T extends InterfaceC5237a2> implements InterfaceC8771i4<C5284p1<T>>, InterfaceC8769i2, InterfaceC11157r {

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC8795n1.a<InterfaceC5237a2> f22766Q = InterfaceC8795n1.a.m35291a("camerax.video.VideoCapture.videoOutput", InterfaceC5237a2.class);

    /* JADX INFO: renamed from: R */
    public static final InterfaceC8795n1.a<InterfaceC8389r1.a> f22767R = InterfaceC8795n1.a.m35291a("camerax.video.VideoCapture.videoEncoderInfoFinder", InterfaceC8389r1.a.class);

    /* JADX INFO: renamed from: S */
    public static final InterfaceC8795n1.a<Boolean> f22768S = InterfaceC8795n1.a.m35291a("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class);

    /* JADX INFO: renamed from: P */
    public final C8734c3 f22769P;

    public C5965a(C8734c3 c8734c3) {
        C12637g.m47069a(c8734c3.mo35023a(f22766Q));
        this.f22769P = c8734c3;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<m1.r1$a>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: h0 */
    public InterfaceC8389r1.a m26764h0() {
        InterfaceC8389r1.a aVar = (InterfaceC8389r1.a) mo35027e(f22767R);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<f1.a2>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: i0 */
    public T m26765i0() {
        InterfaceC5237a2 interfaceC5237a2 = (InterfaceC5237a2) mo35027e(f22766Q);
        Objects.requireNonNull(interfaceC5237a2);
        return (T) interfaceC5237a2;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Boolean>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: j0 */
    public boolean m26766j0() {
        Boolean bool = (Boolean) mo35030h(f22768S, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override // p296n0.InterfaceC8787l3
    /* JADX INFO: renamed from: n */
    public InterfaceC8795n1 mo6691n() {
        return this.f22769P;
    }

    @Override // p296n0.InterfaceC8763h2
    /* JADX INFO: renamed from: p */
    public int mo26767p() {
        return 34;
    }
}
