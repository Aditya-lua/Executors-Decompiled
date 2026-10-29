package n0;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public class e extends d2 {
    public final o0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3 f24634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f24637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.p000lifecycle.a0<g0.z2> f24638g;

    public e(o0 o0Var, h0 h0Var) {
        super(o0Var);
        this.f24635d = false;
        this.f24636e = false;
        this.f24638g = null;
        this.b = o0Var;
        this.f24637f = h0Var;
        this.f24634c = h0Var.w(null);
        H(h0Var.U());
        G(h0Var.c0());
    }

    public static float D(float f10, float f11, float f12) {
        if (f12 == f11) {
            return 0.0f;
        }
        if (f10 == f12) {
            return 1.0f;
        }
        if (f10 == f11) {
            return 0.0f;
        }
        float f13 = 1.0f / f11;
        return ((1.0f / f10) - f13) / ((1.0f / f12) - f13);
    }

    public static float F(float f10, float f11, float f12) {
        if (f10 == 1.0f) {
            return f12;
        }
        if (f10 == 0.0f) {
            return f11;
        }
        double d10 = 1.0f / f11;
        return (float) s2.a.a(1.0d / (d10 + ((((double) (1.0f / f12)) - d10) * ((double) f10))), f11, f12);
    }

    public h0 C() {
        return this.f24637f;
    }

    public q3 E() {
        return this.f24634c;
    }

    public void G(boolean z10) {
        this.f24636e = z10;
    }

    public void H(boolean z10) {
        this.f24635d = z10;
    }

    @Override // n0.d2, n0.o0
    public boolean o() {
        int[] iArrM;
        q3 q3Var = this.f24634c;
        if (q3Var == null || (iArrM = q3Var.m()) == null) {
            return super.o();
        }
        for (int i10 : iArrM) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.d2, g0.t
    public androidx.p000lifecycle.a0<Integer> p() {
        return !p0.x.b(this.f24634c, 6) ? new androidx.p000lifecycle.d0(0) : this.b.p();
    }

    @Override // n0.d2, n0.o0
    public o0 q() {
        return this.b;
    }

    @Override // n0.d2, g0.t
    public androidx.p000lifecycle.a0<g0.z2> z() {
        if (!p0.x.b(this.f24634c, 0)) {
            return new androidx.p000lifecycle.d0(s0.h.e(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (this.f24634c != null) {
            g0.z2 z2VarF = this.b.z().f();
            final Range<Float> rangeJ = this.f24634c.j();
            if (rangeJ != null && (((Float) rangeJ.getLower()).floatValue() != z2VarF.c() || ((Float) rangeJ.getUpper()).floatValue() != z2VarF.a())) {
                if (this.f24638g == null) {
                    this.f24638g = p0.m.a(this.b.z(), new t.a() { // from class: n0.d
                        @Override // t.a
                        public final Object apply(Object obj) {
                            Range range = rangeJ;
                            g0.z2 z2Var = (g0.z2) obj;
                            return s0.h.e(z2Var.d(), ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), e.D(z2Var.d(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
                        }
                    });
                }
                return this.f24638g;
            }
        }
        return this.b.z();
    }
}
