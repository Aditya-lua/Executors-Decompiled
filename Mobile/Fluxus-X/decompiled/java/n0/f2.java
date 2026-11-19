package n0;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements i4<g0.u0>, i2, s0.r {
    public static final n1.a<Integer> Q = n1.a.a("camerax.core.imageAnalysis.backpressureStrategy", g0.u0.b.class);
    public static final n1.a<Integer> R = n1.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final n1.a<g0.m1> S = n1.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", g0.m1.class);
    public static final n1.a<Integer> T = n1.a.a("camerax.core.imageAnalysis.outputImageFormat", g0.u0.e.class);
    public static final n1.a<Boolean> U = n1.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final n1.a<Boolean> V = n1.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);
    public final c3 P;

    public f2(c3 c3Var) {
        this.P = c3Var;
    }

    public int h0(int i10) {
        return ((Integer) h(Q, Integer.valueOf(i10))).intValue();
    }

    public int i0(int i10) {
        return ((Integer) h(R, Integer.valueOf(i10))).intValue();
    }

    public g0.m1 j0() {
        return (g0.m1) h(S, null);
    }

    public Boolean k0(Boolean bool) {
        return (Boolean) h(U, bool);
    }

    public int l0(int i10) {
        return ((Integer) h(T, Integer.valueOf(i10))).intValue();
    }

    public Boolean m0(Boolean bool) {
        return (Boolean) h(V, bool);
    }

    @Override // n0.l3
    public n1 n() {
        return this.P;
    }

    @Override // n0.h2
    public int p() {
        return 35;
    }
}
