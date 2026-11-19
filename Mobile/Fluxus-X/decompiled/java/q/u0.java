package q;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29648a = 0;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29649c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29650d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29651e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29652f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29653g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29654h = false;

    public int a() {
        return this.f29653g ? this.f29648a : this.b;
    }

    public int b() {
        return this.f29648a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29653g ? this.b : this.f29648a;
    }

    public void e(int i10, int i11) {
        this.f29654h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f29651e = i10;
            this.f29648a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f29652f = i11;
            this.b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f29653g) {
            return;
        }
        this.f29653g = z10;
        if (!this.f29654h) {
            this.f29648a = this.f29651e;
            this.b = this.f29652f;
            return;
        }
        if (z10) {
            int i10 = this.f29650d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f29651e;
            }
            this.f29648a = i10;
            int i11 = this.f29649c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f29652f;
            }
            this.b = i11;
            return;
        }
        int i12 = this.f29649c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f29651e;
        }
        this.f29648a = i12;
        int i13 = this.f29650d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f29652f;
        }
        this.b = i13;
    }

    public void g(int i10, int i11) {
        this.f29649c = i10;
        this.f29650d = i11;
        this.f29654h = true;
        if (this.f29653g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f29648a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f29648a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.b = i11;
        }
    }
}
