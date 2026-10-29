package s0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30398a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30400d;

    public a(float f10, float f11, float f12, float f13) {
        this.f30398a = f10;
        this.b = f11;
        this.f30399c = f12;
        this.f30400d = f13;
    }

    @Override // s0.h, g0.z2
    public float a() {
        return this.b;
    }

    @Override // s0.h, g0.z2
    public float b() {
        return this.f30400d;
    }

    @Override // s0.h, g0.z2
    public float c() {
        return this.f30399c;
    }

    @Override // s0.h, g0.z2
    public float d() {
        return this.f30398a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Float.floatToIntBits(this.f30398a) == Float.floatToIntBits(hVar.d()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(hVar.a()) && Float.floatToIntBits(this.f30399c) == Float.floatToIntBits(hVar.c()) && Float.floatToIntBits(this.f30400d) == Float.floatToIntBits(hVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f30398a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.f30399c)) * 1000003) ^ Float.floatToIntBits(this.f30400d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f30398a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.f30399c + ", linearZoom=" + this.f30400d + "}";
    }
}
