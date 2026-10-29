package p431s7;

/* JADX INFO: renamed from: s7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C11193i {

    /* JADX INFO: renamed from: a */
    public float f39484a;

    /* JADX INFO: renamed from: b */
    public int f39485b;

    /* JADX INFO: renamed from: a */
    public void m42182a(float f10) {
        float f11 = this.f39484a + f10;
        this.f39484a = f11;
        int i10 = this.f39485b + 1;
        this.f39485b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f39484a = f11 / 2.0f;
            this.f39485b = i10 / 2;
        }
    }
}
