package y3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f36428a;
    public double b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f36430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f36431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f36432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f36433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f36434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f36435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b.p f36436j;

    public f() {
        this.f36428a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f36429c = false;
        this.f36435i = Double.MAX_VALUE;
        this.f36436j = new b.p();
    }

    public float a() {
        return (float) this.f36435i;
    }

    public final void b() {
        if (this.f36429c) {
            return;
        }
        if (this.f36435i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.b;
        if (d10 > 1.0d) {
            double d11 = this.f36428a;
            this.f36432f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.b;
            double d13 = this.f36428a;
            this.f36433g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f36434h = this.f36428a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f36429c = true;
    }

    public boolean c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f36431e && ((double) Math.abs(f10 - a())) < this.f36430d;
    }

    public f d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f10;
        this.f36429c = false;
        return this;
    }

    public f e(float f10) {
        this.f36435i = f10;
        return this;
    }

    public f f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f36428a = Math.sqrt(f10);
        this.f36429c = false;
        return this;
    }

    public void g(double d10) {
        double dAbs = Math.abs(d10);
        this.f36430d = dAbs;
        this.f36431e = dAbs * 62.5d;
    }

    public b.p h(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        b();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f36435i;
        double d14 = this.b;
        if (d14 > 1.0d) {
            double d15 = this.f36433g;
            double d16 = this.f36432f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f36432f * d12) * d18);
            double d19 = this.f36433g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f36432f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f36428a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f36428a) * d12);
            double d24 = this.f36428a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f36434h;
            double d26 = this.f36428a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f36434h * d12) * d13) + (Math.sin(this.f36434h * d12) * d27));
            double d28 = this.f36428a;
            double d29 = this.b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f36434h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f36434h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        b.p pVar = this.f36436j;
        pVar.f36425a = (float) (dPow + this.f36435i);
        pVar.b = (float) dCos;
        return pVar;
    }

    public f(float f10) {
        this.f36428a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f36429c = false;
        this.f36435i = Double.MAX_VALUE;
        this.f36436j = new b.p();
        this.f36435i = f10;
    }
}
