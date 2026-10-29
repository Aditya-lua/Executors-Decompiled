package n0;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public class c extends c2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f24614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q3 f24615d;

    public c(l0 l0Var, q3 q3Var) {
        super(l0Var);
        this.f24614c = l0Var;
        this.f24615d = q3Var;
    }

    @Override // n0.c2, g0.m
    public me.x<Void> c(boolean z10) {
        return !p0.x.b(this.f24615d, 6) ? r0.n.n(new IllegalStateException("Torch is not supported")) : this.f24614c.c(z10);
    }

    @Override // n0.c2, g0.m
    public me.x<Void> e(float f10) {
        Range<Float> rangeJ;
        if (!p0.x.b(this.f24615d, 0)) {
            return r0.n.n(new IllegalStateException("Zoom is not supported"));
        }
        q3 q3Var = this.f24615d;
        if (q3Var != null && (rangeJ = q3Var.j()) != null) {
            if (f10 <= 1.0f && f10 >= 0.0f) {
                return this.f24614c.g(e.F(f10, ((Float) rangeJ.getLower()).floatValue(), ((Float) rangeJ.getUpper()).floatValue()));
            }
            return r0.n.n(new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]"));
        }
        return this.f24614c.e(f10);
    }

    @Override // n0.c2, g0.m
    public me.x<Void> g(float f10) {
        Range<Float> rangeJ;
        if (!p0.x.b(this.f24615d, 0)) {
            return r0.n.n(new IllegalStateException("Zoom is not supported"));
        }
        q3 q3Var = this.f24615d;
        if (q3Var == null || (rangeJ = q3Var.j()) == null || (f10 >= ((Float) rangeJ.getLower()).floatValue() && f10 <= ((Float) rangeJ.getUpper()).floatValue())) {
            return this.f24614c.g(f10);
        }
        return r0.n.n(new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + rangeJ.getLower() + " , " + rangeJ.getUpper() + "]"));
    }

    @Override // n0.c2, g0.m
    public me.x<g0.n0> o(g0.m0 m0Var) {
        g0.m0 m0VarA = p0.x.a(this.f24615d, m0Var);
        return m0VarA == null ? r0.n.n(new IllegalStateException("FocusMetering is not supported")) : this.f24614c.o(m0VarA);
    }
}
