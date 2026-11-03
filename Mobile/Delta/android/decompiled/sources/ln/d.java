package ln;

/* JADX INFO: loaded from: classes3.dex */
public class d extends rn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rn.d[] f23659a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23660c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23661d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23662e = 0;

    public d(rn.d... dVarArr) {
        this.f23659a = dVarArr;
    }

    @Override // rn.f
    public rn.f a(int i10) {
        this.f23660c = i10;
        return this;
    }

    @Override // rn.f
    public rn.f b(int i10) {
        this.b = i10;
        return this;
    }

    @Override // rn.f
    public rn.f e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f23662e = i10;
        return this;
    }

    public rn.d[] f() {
        return this.f23659a;
    }

    public int g() {
        return this.f23660c;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.f23662e;
    }

    public boolean j() {
        return this.f23661d;
    }
}
