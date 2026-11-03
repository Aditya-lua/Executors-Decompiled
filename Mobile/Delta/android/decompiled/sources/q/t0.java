package q;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29458a = 0;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29459c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29460d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29461e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29462f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29463g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29464h = false;

    public int a() {
        return this.f29463g ? this.f29458a : this.b;
    }

    public int b() {
        return this.f29458a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29463g ? this.b : this.f29458a;
    }

    public void e(int i10, int i11) {
        this.f29464h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f29461e = i10;
            this.f29458a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f29462f = i11;
            this.b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f29463g) {
            return;
        }
        this.f29463g = z10;
        if (!this.f29464h) {
            this.f29458a = this.f29461e;
            this.b = this.f29462f;
            return;
        }
        if (z10) {
            int i10 = this.f29460d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f29461e;
            }
            this.f29458a = i10;
            int i11 = this.f29459c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f29462f;
            }
            this.b = i11;
            return;
        }
        int i12 = this.f29459c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f29461e;
        }
        this.f29458a = i12;
        int i13 = this.f29460d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f29462f;
        }
        this.b = i13;
    }

    public void g(int i10, int i11) {
        this.f29459c = i10;
        this.f29460d = i11;
        this.f29464h = true;
        if (this.f29463g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f29458a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f29458a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.b = i11;
        }
    }
}
