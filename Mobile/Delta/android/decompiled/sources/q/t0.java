package q;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29105a = 0;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29106c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29107d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29108e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29109f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29110g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29111h = false;

    public int a() {
        return this.f29110g ? this.f29105a : this.b;
    }

    public int b() {
        return this.f29105a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29110g ? this.b : this.f29105a;
    }

    public void e(int i10, int i11) {
        this.f29111h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f29108e = i10;
            this.f29105a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f29109f = i11;
            this.b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f29110g) {
            return;
        }
        this.f29110g = z10;
        if (!this.f29111h) {
            this.f29105a = this.f29108e;
            this.b = this.f29109f;
            return;
        }
        if (z10) {
            int i10 = this.f29107d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f29108e;
            }
            this.f29105a = i10;
            int i11 = this.f29106c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f29109f;
            }
            this.b = i11;
            return;
        }
        int i12 = this.f29106c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f29108e;
        }
        this.f29105a = i12;
        int i13 = this.f29107d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f29109f;
        }
        this.b = i13;
    }

    public void g(int i10, int i11) {
        this.f29106c = i10;
        this.f29107d = i11;
        this.f29111h = true;
        if (this.f29110g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f29105a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f29105a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.b = i11;
        }
    }
}
