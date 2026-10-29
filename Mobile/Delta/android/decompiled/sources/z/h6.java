package z;

/* JADX INFO: loaded from: classes.dex */
public class h6 implements g0.z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f36622a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f36624d;

    public h6(float f10, float f11) {
        this.b = f10;
        this.f36623c = f11;
    }

    @Override // g0.z2
    public float a() {
        return this.b;
    }

    @Override // g0.z2
    public float b() {
        return this.f36624d;
    }

    @Override // g0.z2
    public float c() {
        return this.f36623c;
    }

    @Override // g0.z2
    public float d() {
        return this.f36622a;
    }

    public void e(float f10) {
        if (f10 <= 1.0f && f10 >= 0.0f) {
            this.f36624d = f10;
            this.f36622a = n0.e.F(f10, this.f36623c, this.b);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
    }

    public void f(float f10) {
        float f11 = this.b;
        if (f10 <= f11) {
            float f12 = this.f36623c;
            if (f10 >= f12) {
                this.f36622a = f10;
                this.f36624d = n0.e.D(f10, f12, f11);
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f36623c + " , " + this.b + "]");
    }
}
