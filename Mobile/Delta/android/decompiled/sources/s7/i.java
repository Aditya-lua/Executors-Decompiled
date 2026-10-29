package s7;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30513a;
    public int b;

    public void a(float f10) {
        float f11 = this.f30513a + f10;
        this.f30513a = f11;
        int i10 = this.b + 1;
        this.b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f30513a = f11 / 2.0f;
            this.b = i10 / 2;
        }
    }
}
