package n0;

import android.util.Range;
import g0.w2;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface i4<T extends g0.w2> extends s0.q<T>, h2 {
    public static final n1.a<Integer> A;
    public static final n1.a<Integer> B;
    public static final n1.a<Range<Integer>> C;
    public static final n1.a<Boolean> D;
    public static final n1.a<Boolean> E;
    public static final n1.a<Boolean> F;
    public static final n1.a<j4.b> G;
    public static final n1.a<Integer> H;
    public static final n1.a<Integer> I;
    public static final n1.a<m0.b1.b> J;
    public static final n1.a<u3> K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n1.a<o3> f24697w = n1.a.a("camerax.core.useCase.defaultSessionConfig", o3.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final n1.a<l1> f24698x = n1.a.a("camerax.core.useCase.defaultCaptureConfig", l1.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final n1.a<o3.e> f24699y = n1.a.a("camerax.core.useCase.sessionConfigUnpacker", o3.e.class);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final n1.a<l1.b> f24700z = n1.a.a("camerax.core.useCase.captureConfigUnpacker", l1.b.class);

    public class a implements m0.b1.b {
        public a() {
        }

        @Override // m0.b1.b
        public m0.b1 a(m0.c0 c0Var) {
            return new m0.f1(c0Var);
        }
    }

    public interface b<T extends g0.w2, C extends i4<T>, B> extends g0.l0<T> {
        C e();
    }

    static {
        Class cls = Integer.TYPE;
        A = n1.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        B = n1.a.a("camerax.core.useCase.sessionType", cls);
        C = n1.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        D = n1.a.a("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
        Class cls2 = Boolean.TYPE;
        E = n1.a.a("camerax.core.useCase.zslDisabled", cls2);
        F = n1.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        G = n1.a.a("camerax.core.useCase.captureType", j4.b.class);
        H = n1.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        I = n1.a.a("camerax.core.useCase.videoStabilizationMode", cls);
        J = n1.a.a("camerax.core.useCase.takePictureManagerProvider", m0.b1.b.class);
        K = n1.a.a("camerax.core.useCase.streamUseCase", u3.class);
    }

    default int B(int i10) {
        return ((Integer) h(A, Integer.valueOf(i10))).intValue();
    }

    default int E() {
        return ((Integer) h(H, 0)).intValue();
    }

    default o3.e F(o3.e eVar) {
        return (o3.e) h(f24699y, eVar);
    }

    default boolean H() {
        Boolean bool = (Boolean) h(D, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default l1.b K(l1.b bVar) {
        return (l1.b) h(f24700z, bVar);
    }

    default o3 S() {
        return (o3) e(f24697w);
    }

    default boolean T(boolean z10) {
        return ((Boolean) h(E, Boolean.valueOf(z10))).booleanValue();
    }

    default u3 W() {
        u3 u3Var = (u3) h(K, u3.DEFAULT);
        Objects.requireNonNull(u3Var);
        return u3Var;
    }

    default j4.b X() {
        return (j4.b) e(G);
    }

    default boolean d0(boolean z10) {
        return ((Boolean) h(F, Boolean.valueOf(z10))).booleanValue();
    }

    default boolean f0() {
        return a(C);
    }

    default o3 j(o3 o3Var) {
        return (o3) h(f24697w, o3Var);
    }

    default int o(int i10) {
        return ((Integer) h(B, Integer.valueOf(i10))).intValue();
    }

    default m0.b1.b r() {
        m0.b1.b bVar = (m0.b1.b) h(J, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    default l1 s(l1 l1Var) {
        return (l1) h(f24698x, l1Var);
    }

    default int x() {
        return ((Integer) h(I, 0)).intValue();
    }

    default Range<Integer> z(Range<Integer> range) {
        return (Range) h(C, range);
    }
}
