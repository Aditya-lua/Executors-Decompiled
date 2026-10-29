package p203j;

/* JADX INFO: renamed from: j.r */
/* JADX INFO: loaded from: classes.dex */
public class C7008r {

    /* JADX INFO: renamed from: d */
    public static C7008r f27404d;

    /* JADX INFO: renamed from: a */
    public long f27405a;

    /* JADX INFO: renamed from: b */
    public long f27406b;

    /* JADX INFO: renamed from: c */
    public int f27407c;

    /* JADX INFO: renamed from: b */
    public static C7008r m29632b() {
        if (f27404d == null) {
            f27404d = new C7008r();
        }
        return f27404d;
    }

    /* JADX INFO: renamed from: a */
    public void m29633a(long j10, double d10, double d11) {
        float f10 = (j10 - 946728000000L) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d12 = f11;
        double dSin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f10 - 9.0E-4f)) - d13) + 9.0E-4f)) + d13 + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d14 = 0.01745329238474369d * d10;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d14) * Math.sin(dAsin))) / (Math.cos(d14) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f27407c = 1;
            this.f27405a = -1L;
            this.f27406b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f27407c = 0;
                this.f27405a = -1L;
                this.f27406b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f27405a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f27406b = jRound;
            if (jRound >= j10 || this.f27405a <= j10) {
                this.f27407c = 1;
            } else {
                this.f27407c = 0;
            }
        }
    }
}
