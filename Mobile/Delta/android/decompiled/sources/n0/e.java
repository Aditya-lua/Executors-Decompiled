package n0;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public class e extends d2 {
    public final o0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3 f25455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f25458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.p000lifecycle.a0<g0.z2> f25459g;

    public e(o0 o0Var, h0 h0Var) {
        super(o0Var);
        this.f25456d = false;
        this.f25457e = false;
        this.f25459g = null;
        this.b = o0Var;
        this.f25458f = h0Var;
        this.f25455c = h0Var.w(null);
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
        return this.f25458f;
    }

    public q3 E() {
        return this.f25455c;
    }

    public void G(boolean z10) {
        this.f25457e = z10;
    }

    public void H(boolean z10) {
        this.f25456d = z10;
    }

    @Override // n0.d2, n0.o0
    public boolean o() {
        int[] iArrM;
        q3 q3Var = this.f25455c;
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
        return !p0.x.b(this.f25455c, 6) ? new androidx.p000lifecycle.d0(0) : this.b.p();
    }

    @Override // n0.d2, n0.o0
    public o0 q() {
        return this.b;
    }

    @Override // n0.d2, g0.t
    public androidx.p000lifecycle.a0<g0.z2> z() {
        if (!p0.x.b(this.f25455c, 0)) {
            return new androidx.p000lifecycle.d0(s0.h.e(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (this.f25455c != null) {
            g0.z2 z2VarF = this.b.z().f();
            final Range<Float> rangeJ = this.f25455c.j();
            if (rangeJ != null && (((Float) rangeJ.getLower()).floatValue() != z2VarF.c() || ((Float) rangeJ.getUpper()).floatValue() != z2VarF.a())) {
                if (this.f25459g == null) {
                    this.f25459g = p0.m.a(this.b.z(), new t.a() { // from class: n0.d
                        @Override // t.a
                        public final Object apply(Object obj) {
                            Range range = rangeJ;
                            g0.z2 z2Var = (g0.z2) obj;
                            return s0.h.e(z2Var.d(), ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), e.D(z2Var.d(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
                        }
                    });
                }
                return this.f25459g;
            }
        }
        return this.b.z();
    }
}
