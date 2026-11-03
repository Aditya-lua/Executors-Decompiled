package s0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30945a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30947d;

    public a(float f10, float f11, float f12, float f13) {
        this.f30945a = f10;
        this.b = f11;
        this.f30946c = f12;
        this.f30947d = f13;
    }

    @Override // s0.h, g0.z2
    public float a() {
        return this.b;
    }

    @Override // s0.h, g0.z2
    public float b() {
        return this.f30947d;
    }

    @Override // s0.h, g0.z2
    public float c() {
        return this.f30946c;
    }

    @Override // s0.h, g0.z2
    public float d() {
        return this.f30945a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Float.floatToIntBits(this.f30945a) == Float.floatToIntBits(hVar.d()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(hVar.a()) && Float.floatToIntBits(this.f30946c) == Float.floatToIntBits(hVar.c()) && Float.floatToIntBits(this.f30947d) == Float.floatToIntBits(hVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f30945a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.f30946c)) * 1000003) ^ Float.floatToIntBits(this.f30947d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f30945a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.f30946c + ", linearZoom=" + this.f30947d + "}";
    }
}
