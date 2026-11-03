package t7;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f32212a;
    public float b;

    public d(float f10, float f11) {
        this.f32212a = f10;
        this.b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f32212a == f10 && this.b == f11;
    }

    public float b() {
        return this.f32212a;
    }

    public float c() {
        return this.b;
    }

    public void d(float f10, float f11) {
        this.f32212a = f10;
        this.b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
