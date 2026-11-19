package ao;

/* JADX INFO: loaded from: classes3.dex */
public class d extends ho.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho.d[] f3062a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3063c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3064d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3065e = 0;

    public d(ho.d... dVarArr) {
        this.f3062a = dVarArr;
    }

    @Override // ho.f
    public ho.f a(int i10) {
        this.f3063c = i10;
        return this;
    }

    @Override // ho.f
    public ho.f b(int i10) {
        this.b = i10;
        return this;
    }

    @Override // ho.f
    public ho.f e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f3065e = i10;
        return this;
    }

    public ho.d[] f() {
        return this.f3062a;
    }

    public int g() {
        return this.f3063c;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.f3065e;
    }

    public boolean j() {
        return this.f3064d;
    }
}
