package p565y3;

/* JADX INFO: renamed from: y3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13026f {

    /* JADX INFO: renamed from: a */
    public double f46141a;

    /* JADX INFO: renamed from: b */
    public double f46142b;

    /* JADX INFO: renamed from: c */
    public boolean f46143c;

    /* JADX INFO: renamed from: d */
    public double f46144d;

    /* JADX INFO: renamed from: e */
    public double f46145e;

    /* JADX INFO: renamed from: f */
    public double f46146f;

    /* JADX INFO: renamed from: g */
    public double f46147g;

    /* JADX INFO: renamed from: h */
    public double f46148h;

    /* JADX INFO: renamed from: i */
    public double f46149i;

    /* JADX INFO: renamed from: j */
    public final AbstractC13022b.p f46150j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13026f() {
        this.f46141a = Math.sqrt(1500.0d);
        this.f46142b = 0.5d;
        this.f46143c = false;
        this.f46149i = Double.MAX_VALUE;
        this.f46150j = new AbstractC13022b.p();
    }

    /* JADX INFO: renamed from: a */
    public float m48526a() {
        return (float) this.f46149i;
    }

    /* JADX INFO: renamed from: b */
    public final void m48527b() {
        if (this.f46143c) {
            return;
        }
        if (this.f46149i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f46142b;
        if (d10 > 1.0d) {
            double d11 = this.f46141a;
            this.f46146f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f46142b;
            double d13 = this.f46141a;
            this.f46147g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f46148h = this.f46141a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f46143c = true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m48528c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f46145e && ((double) Math.abs(f10 - m48526a())) < this.f46144d;
    }

    /* JADX INFO: renamed from: d */
    public C13026f m48529d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f46142b = f10;
        this.f46143c = false;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C13026f m48530e(float f10) {
        this.f46149i = f10;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C13026f m48531f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f46141a = Math.sqrt(f10);
        this.f46143c = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m48532g(double d10) {
        double dAbs = Math.abs(d10);
        this.f46144d = dAbs;
        this.f46145e = dAbs * 62.5d;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC13022b.p m48533h(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        m48527b();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f46149i;
        double d14 = this.f46142b;
        if (d14 > 1.0d) {
            double d15 = this.f46147g;
            double d16 = this.f46146f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f46146f * d12) * d18);
            double d19 = this.f46147g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f46146f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f46141a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f46141a) * d12);
            double d24 = this.f46141a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f46148h;
            double d26 = this.f46141a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f46148h * d12) * d13) + (Math.sin(this.f46148h * d12) * d27));
            double d28 = this.f46141a;
            double d29 = this.f46142b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f46148h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f46148h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        AbstractC13022b.p pVar = this.f46150j;
        pVar.f46134a = (float) (dPow + this.f46149i);
        pVar.f46135b = (float) dCos;
        return pVar;
    }

    public C13026f(float f10) {
        this.f46141a = Math.sqrt(1500.0d);
        this.f46142b = 0.5d;
        this.f46143c = false;
        this.f46149i = Double.MAX_VALUE;
        this.f46150j = new AbstractC13022b.p();
        this.f46149i = f10;
    }
}
