package n0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements i4<g0.f1>, i2, s0.i {
    public static final n1.a<Integer> Q;
    public static final n1.a<Integer> R;
    public static final n1.a<k1> S;
    public static final n1.a<Integer> T;
    public static final n1.a<Integer> U;
    public static final n1.a<Integer> V;
    public static final n1.a<g0.m1> W;
    public static final n1.a<Boolean> X;
    public static final n1.a<Integer> Y;
    public static final n1.a<Integer> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final n1.a<g0.f1.j> f24651a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final n1.a<a1.c> f24652b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final n1.a<Boolean> f24653c0;
    public final c3 P;

    static {
        Class cls = Integer.TYPE;
        Q = n1.a.a("camerax.core.imageCapture.captureMode", cls);
        R = n1.a.a("camerax.core.imageCapture.flashMode", cls);
        S = n1.a.a("camerax.core.imageCapture.captureBundle", k1.class);
        T = n1.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        U = n1.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        V = n1.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        W = n1.a.a("camerax.core.imageCapture.imageReaderProxyProvider", g0.m1.class);
        X = n1.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        Y = n1.a.a("camerax.core.imageCapture.flashType", cls);
        Z = n1.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f24651a0 = n1.a.a("camerax.core.imageCapture.screenFlash", g0.f1.j.class);
        f24652b0 = n1.a.a("camerax.core.useCase.postviewResolutionSelector", a1.c.class);
        f24653c0 = n1.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public g2(c3 c3Var) {
        this.P = c3Var;
    }

    public k1 h0(k1 k1Var) {
        return (k1) h(S, k1Var);
    }

    public int i0() {
        return ((Integer) e(Q)).intValue();
    }

    public int j0(int i10) {
        return ((Integer) h(R, Integer.valueOf(i10))).intValue();
    }

    public int k0(int i10) {
        return ((Integer) h(Y, Integer.valueOf(i10))).intValue();
    }

    public g0.m1 l0() {
        return (g0.m1) h(W, null);
    }

    public Executor m0(Executor executor) {
        return (Executor) h(s0.i.L, executor);
    }

    @Override // n0.l3
    public n1 n() {
        return this.P;
    }

    public int n0() {
        return ((Integer) e(Z)).intValue();
    }

    public g0.f1.j o0() {
        return (g0.f1.j) h(f24651a0, null);
    }

    @Override // n0.h2
    public int p() {
        return ((Integer) e(h2.f24670j)).intValue();
    }

    public boolean p0() {
        return a(Q);
    }
}
