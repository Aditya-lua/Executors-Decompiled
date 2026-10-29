package p296n0;

import android.util.Range;
import java.util.Objects;
import p140g0.AbstractC5952w2;
import p140g0.InterfaceC5906l0;
import p281m0.C8289f1;
import p281m0.InterfaceC8277b1;
import p281m0.InterfaceC8279c0;
import p424s0.InterfaceC11156q;

/* JADX INFO: renamed from: n0.i4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8771i4<T extends AbstractC5952w2> extends InterfaceC11156q<T>, InterfaceC8763h2 {

    /* JADX INFO: renamed from: A */
    public static final InterfaceC8795n1.a<Integer> f31896A;

    /* JADX INFO: renamed from: B */
    public static final InterfaceC8795n1.a<Integer> f31897B;

    /* JADX INFO: renamed from: C */
    public static final InterfaceC8795n1.a<Range<Integer>> f31898C;

    /* JADX INFO: renamed from: D */
    public static final InterfaceC8795n1.a<Boolean> f31899D;

    /* JADX INFO: renamed from: E */
    public static final InterfaceC8795n1.a<Boolean> f31900E;

    /* JADX INFO: renamed from: F */
    public static final InterfaceC8795n1.a<Boolean> f31901F;

    /* JADX INFO: renamed from: G */
    public static final InterfaceC8795n1.a<InterfaceC8777j4.b> f31902G;

    /* JADX INFO: renamed from: H */
    public static final InterfaceC8795n1.a<Integer> f31903H;

    /* JADX INFO: renamed from: I */
    public static final InterfaceC8795n1.a<Integer> f31904I;

    /* JADX INFO: renamed from: J */
    public static final InterfaceC8795n1.a<InterfaceC8277b1.b> f31905J;

    /* JADX INFO: renamed from: K */
    public static final InterfaceC8795n1.a<EnumC8832u3> f31906K;

    /* JADX INFO: renamed from: w */
    public static final InterfaceC8795n1.a<C8802o3> f31907w = InterfaceC8795n1.a.m35291a("camerax.core.useCase.defaultSessionConfig", C8802o3.class);

    /* JADX INFO: renamed from: x */
    public static final InterfaceC8795n1.a<C8785l1> f31908x = InterfaceC8795n1.a.m35291a("camerax.core.useCase.defaultCaptureConfig", C8785l1.class);

    /* JADX INFO: renamed from: y */
    public static final InterfaceC8795n1.a<C8802o3.e> f31909y = InterfaceC8795n1.a.m35291a("camerax.core.useCase.sessionConfigUnpacker", C8802o3.e.class);

    /* JADX INFO: renamed from: z */
    public static final InterfaceC8795n1.a<C8785l1.b> f31910z = InterfaceC8795n1.a.m35291a("camerax.core.useCase.captureConfigUnpacker", C8785l1.b.class);

    /* JADX INFO: renamed from: n0.i4$a */
    public class a implements InterfaceC8277b1.b {
        public a() {
        }

        @Override // p281m0.InterfaceC8277b1.b
        /* JADX INFO: renamed from: a */
        public InterfaceC8277b1 mo33693a(InterfaceC8279c0 interfaceC8279c0) {
            return new C8289f1(interfaceC8279c0);
        }
    }

    /* JADX INFO: renamed from: n0.i4$b */
    public interface b<T extends AbstractC5952w2, C extends InterfaceC8771i4<T>, B> extends InterfaceC5906l0<T> {
        /* JADX INFO: renamed from: e */
        C mo6688e();
    }

    static {
        Class cls = Integer.TYPE;
        f31896A = InterfaceC8795n1.a.m35291a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f31897B = InterfaceC8795n1.a.m35291a("camerax.core.useCase.sessionType", cls);
        f31898C = InterfaceC8795n1.a.m35291a("camerax.core.useCase.targetFrameRate", Range.class);
        f31899D = InterfaceC8795n1.a.m35291a("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
        Class cls2 = Boolean.TYPE;
        f31900E = InterfaceC8795n1.a.m35291a("camerax.core.useCase.zslDisabled", cls2);
        f31901F = InterfaceC8795n1.a.m35291a("camerax.core.useCase.highResolutionDisabled", cls2);
        f31902G = InterfaceC8795n1.a.m35291a("camerax.core.useCase.captureType", InterfaceC8777j4.b.class);
        f31903H = InterfaceC8795n1.a.m35291a("camerax.core.useCase.previewStabilizationMode", cls);
        f31904I = InterfaceC8795n1.a.m35291a("camerax.core.useCase.videoStabilizationMode", cls);
        f31905J = InterfaceC8795n1.a.m35291a("camerax.core.useCase.takePictureManagerProvider", InterfaceC8277b1.b.class);
        f31906K = InterfaceC8795n1.a.m35291a("camerax.core.useCase.streamUseCase", EnumC8832u3.class);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Integer>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: B */
    default int m35199B(int i10) {
        return ((Integer) mo35030h(f31896A, Integer.valueOf(i10))).intValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Integer>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: E */
    default int m35200E() {
        return ((Integer) mo35030h(f31903H, 0)).intValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<n0.o3$e>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: F */
    default C8802o3.e m35201F(C8802o3.e eVar) {
        return (C8802o3.e) mo35030h(f31909y, eVar);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Boolean>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: H */
    default boolean m35202H() {
        Boolean bool = (Boolean) mo35030h(f31899D, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<n0.l1$b>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: K */
    default C8785l1.b m35203K(C8785l1.b bVar) {
        return (C8785l1.b) mo35030h(f31910z, bVar);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<n0.o3>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: S */
    default C8802o3 m35204S() {
        return (C8802o3) mo35027e(f31907w);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Boolean>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: T */
    default boolean m35205T(boolean z10) {
        return ((Boolean) mo35030h(f31900E, Boolean.valueOf(z10))).booleanValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<n0.u3>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: W */
    default EnumC8832u3 m35206W() {
        EnumC8832u3 enumC8832u3 = (EnumC8832u3) mo35030h(f31906K, EnumC8832u3.DEFAULT);
        Objects.requireNonNull(enumC8832u3);
        return enumC8832u3;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<n0.j4$b>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: X */
    default InterfaceC8777j4.b mo35207X() {
        return (InterfaceC8777j4.b) mo35027e(f31902G);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Boolean>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: d0 */
    default boolean m35208d0(boolean z10) {
        return ((Boolean) mo35030h(f31901F, Boolean.valueOf(z10))).booleanValue();
    }

    /* JADX INFO: renamed from: f0 */
    default boolean m35209f0() {
        return mo35023a(f31898C);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<n0.o3>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: j */
    default C8802o3 m35210j(C8802o3 c8802o3) {
        return (C8802o3) mo35030h(f31907w, c8802o3);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Integer>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: o */
    default int m35211o(int i10) {
        return ((Integer) mo35030h(f31897B, Integer.valueOf(i10))).intValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<m0.b1$b>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: r */
    default InterfaceC8277b1.b m35212r() {
        InterfaceC8277b1.b bVar = (InterfaceC8277b1.b) mo35030h(f31905J, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<n0.l1>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: s */
    default C8785l1 m35213s(C8785l1 c8785l1) {
        return (C8785l1) mo35030h(f31908x, c8785l1);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<java.lang.Integer>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: x */
    default int m35214x() {
        return ((Integer) mo35030h(f31904I, 0)).intValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: n0.n1$a<android.util.Range<java.lang.Integer>>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: z */
    default Range<Integer> m35215z(Range<Integer> range) {
        return (Range) mo35030h(f31898C, range);
    }
}
