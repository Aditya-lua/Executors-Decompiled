package p424s0;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11140a extends AbstractC11147h {

    /* JADX INFO: renamed from: a */
    public final float f39336a;

    /* JADX INFO: renamed from: b */
    public final float f39337b;

    /* JADX INFO: renamed from: c */
    public final float f39338c;

    /* JADX INFO: renamed from: d */
    public final float f39339d;

    public C11140a(float f10, float f11, float f12, float f13) {
        this.f39336a = f10;
        this.f39337b = f11;
        this.f39338c = f12;
        this.f39339d = f13;
    }

    @Override // p424s0.AbstractC11147h, p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: a */
    public float mo26760a() {
        return this.f39337b;
    }

    @Override // p424s0.AbstractC11147h, p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: b */
    public float mo26761b() {
        return this.f39339d;
    }

    @Override // p424s0.AbstractC11147h, p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: c */
    public float mo26762c() {
        return this.f39338c;
    }

    @Override // p424s0.AbstractC11147h, p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: d */
    public float mo26763d() {
        return this.f39336a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11147h) {
            AbstractC11147h abstractC11147h = (AbstractC11147h) obj;
            if (Float.floatToIntBits(this.f39336a) == Float.floatToIntBits(abstractC11147h.mo26763d()) && Float.floatToIntBits(this.f39337b) == Float.floatToIntBits(abstractC11147h.mo26760a()) && Float.floatToIntBits(this.f39338c) == Float.floatToIntBits(abstractC11147h.mo26762c()) && Float.floatToIntBits(this.f39339d) == Float.floatToIntBits(abstractC11147h.mo26761b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f39336a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f39337b)) * 1000003) ^ Float.floatToIntBits(this.f39338c)) * 1000003) ^ Float.floatToIntBits(this.f39339d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f39336a + ", maxZoomRatio=" + this.f39337b + ", minZoomRatio=" + this.f39338c + ", linearZoom=" + this.f39339d + "}";
    }
}
