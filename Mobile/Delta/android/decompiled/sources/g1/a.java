package g1;

import f1.a2;
import f1.p1;
import java.util.Objects;
import m1.r1;
import n0.c3;
import n0.i2;
import n0.i4;
import n0.n1;
import s0.r;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class a<T extends a2> implements i4<p1<T>>, i2, r {
    public static final n1.a<a2> Q = n1.a.a("camerax.video.VideoCapture.videoOutput", a2.class);
    public static final n1.a<r1.a> R = n1.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", r1.a.class);
    public static final n1.a<Boolean> S = n1.a.a("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class);
    public final c3 P;

    public a(c3 c3Var) {
        g.a(c3Var.a(Q));
        this.P = c3Var;
    }

    public r1.a h0() {
        r1.a aVar = (r1.a) e(R);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    public T i0() {
        a2 a2Var = (a2) e(Q);
        Objects.requireNonNull(a2Var);
        return (T) a2Var;
    }

    public boolean j0() {
        Boolean bool = (Boolean) h(S, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override // n0.l3
    public n1 n() {
        return this.P;
    }

    @Override // n0.h2
    public int p() {
        return 34;
    }
}
