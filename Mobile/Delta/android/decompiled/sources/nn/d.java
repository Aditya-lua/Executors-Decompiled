package nn;

/* JADX INFO: loaded from: classes3.dex */
public class d extends tn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn.d[] f26370a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26371c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26372d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26373e = 0;

    public d(tn.d... dVarArr) {
        this.f26370a = dVarArr;
    }

    @Override // tn.f
    public tn.f a(int i10) {
        this.f26371c = i10;
        return this;
    }

    @Override // tn.f
    public tn.f b(int i10) {
        this.b = i10;
        return this;
    }

    @Override // tn.f
    public tn.f e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f26373e = i10;
        return this;
    }

    public tn.d[] f() {
        return this.f26370a;
    }

    public int g() {
        return this.f26371c;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.f26373e;
    }

    public boolean j() {
        return this.f26372d;
    }
}
