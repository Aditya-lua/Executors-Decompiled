package p298n2;

import androidx.core.graphics.C0546c;

/* JADX INFO: renamed from: n2.a */
/* JADX INFO: loaded from: classes.dex */
public class C8863a {

    /* JADX INFO: renamed from: a */
    public final float f32251a;

    /* JADX INFO: renamed from: b */
    public final float f32252b;

    /* JADX INFO: renamed from: c */
    public final float f32253c;

    /* JADX INFO: renamed from: d */
    public final float f32254d;

    /* JADX INFO: renamed from: e */
    public final float f32255e;

    /* JADX INFO: renamed from: f */
    public final float f32256f;

    /* JADX INFO: renamed from: g */
    public final float f32257g;

    /* JADX INFO: renamed from: h */
    public final float f32258h;

    /* JADX INFO: renamed from: i */
    public final float f32259i;

    public C8863a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f32251a = f10;
        this.f32252b = f11;
        this.f32253c = f12;
        this.f32254d = f13;
        this.f32255e = f14;
        this.f32256f = f15;
        this.f32257g = f16;
        this.f32258h = f17;
        this.f32259i = f18;
    }

    /* JADX INFO: renamed from: b */
    public static C8863a m35586b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        C8863a c8863a = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int iM35601p = m35589e(f17, f11, f10).m35601p();
            float fM35603b = C8864b.m35603b(iM35601p);
            float fAbs = Math.abs(f12 - fM35603b);
            if (fAbs < 0.2f) {
                C8863a c8863aM35587c = m35587c(iM35601p);
                float fM35593a = c8863aM35587c.m35593a(m35589e(c8863aM35587c.m35598k(), c8863aM35587c.m35596i(), f10));
                if (fM35593a <= 1.0f) {
                    c8863a = c8863aM35587c;
                    f14 = fAbs;
                    f16 = fM35593a;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                return c8863a;
            }
            if (fM35603b < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return c8863a;
    }

    /* JADX INFO: renamed from: c */
    public static C8863a m35587c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m35588d(i10, C8874l.f32296k, fArr, fArr2);
        return new C8863a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: d */
    public static void m35588d(int i10, C8874l c8874l, float[] fArr, float[] fArr2) {
        C8864b.m35607f(i10, fArr2);
        float[][] fArr3 = C8864b.f32260a;
        float f10 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f11 = fArr4[0] * f10;
        float f12 = fArr2[1];
        float f13 = f11 + (fArr4[1] * f12);
        float f14 = fArr2[2];
        float f15 = f13 + (fArr4[2] * f14);
        float[] fArr5 = fArr3[1];
        float f16 = (fArr5[0] * f10) + (fArr5[1] * f12) + (fArr5[2] * f14);
        float[] fArr6 = fArr3[2];
        float f17 = (f10 * fArr6[0]) + (f12 * fArr6[1]) + (f14 * fArr6[2]);
        float f18 = c8874l.m35703i()[0] * f15;
        float f19 = c8874l.m35703i()[1] * f16;
        float f20 = c8874l.m35703i()[2] * f17;
        float fPow = (float) Math.pow(((double) (c8874l.m35697c() * Math.abs(f18))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c8874l.m35697c() * Math.abs(f19))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c8874l.m35697c() * Math.abs(f20))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f21 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d10)) / 11.0f;
        float f22 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * c8874l.m35700f()) / c8874l.m35695a(), c8874l.m35696b() * c8874l.m35704j())) * 100.0f;
        float fM35696b = (4.0f / c8874l.m35696b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c8874l.m35695a() + 4.0f) * c8874l.m35698d();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c8874l.m35699e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c8874l.m35701g()) * c8874l.m35702h()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fM35698d = c8874l.m35698d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * c8874l.m35696b()) / (c8874l.m35695a() + 4.0f))) * 50.0f;
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM35698d) + 1.0f)) * 43.85965f;
        double d11 = f26;
        float fCos = ((float) Math.cos(d11)) * fLog;
        float fSin = fLog * ((float) Math.sin(d11));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM35696b;
            fArr[2] = fM35698d;
            fArr[3] = fSqrt2;
            fArr[4] = f27;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C8863a m35589e(float f10, float f11, float f12) {
        return m35590f(f10, f11, f12, C8874l.f32296k);
    }

    /* JADX INFO: renamed from: f */
    public static C8863a m35590f(float f10, float f11, float f12, C8874l c8874l) {
        double d10 = ((double) f10) / 100.0d;
        float fM35696b = (4.0f / c8874l.m35696b()) * ((float) Math.sqrt(d10)) * (c8874l.m35695a() + 4.0f) * c8874l.m35698d();
        float fM35698d = c8874l.m35698d() * f11;
        float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(d10))) * c8874l.m35696b()) / (c8874l.m35695a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) fM35698d) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new C8863a(f12, f11, f10, fM35696b, fM35698d, fSqrt, f13, ((float) Math.cos(d11)) * fLog, fLog * ((float) Math.sin(d11)));
    }

    /* JADX INFO: renamed from: m */
    public static int m35591m(float f10, float f11, float f12) {
        return m35592n(f10, f11, f12, C8874l.f32296k);
    }

    /* JADX INFO: renamed from: n */
    public static int m35592n(float f10, float f11, float f12, C8874l c8874l) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return C8864b.m35602a(f12);
        }
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        C8863a c8863a = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            C8863a c8863aM35586b = m35586b(fMin, f14, f12);
            if (!z10) {
                if (c8863aM35586b == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    c8863a = c8863aM35586b;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else {
                if (c8863aM35586b != null) {
                    return c8863aM35586b.m35600o(c8874l);
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return c8863a == null ? C8864b.m35602a(f12) : c8863a.m35600o(c8874l);
    }

    /* JADX INFO: renamed from: a */
    public float m35593a(C8863a c8863a) {
        float fM35599l = m35599l() - c8863a.m35599l();
        float fM35594g = m35594g() - c8863a.m35594g();
        float fM35595h = m35595h() - c8863a.m35595h();
        return (float) (Math.pow(Math.sqrt((fM35599l * fM35599l) + (fM35594g * fM35594g) + (fM35595h * fM35595h)), 0.63d) * 1.41d);
    }

    /* JADX INFO: renamed from: g */
    public float m35594g() {
        return this.f32258h;
    }

    /* JADX INFO: renamed from: h */
    public float m35595h() {
        return this.f32259i;
    }

    /* JADX INFO: renamed from: i */
    public float m35596i() {
        return this.f32252b;
    }

    /* JADX INFO: renamed from: j */
    public float m35597j() {
        return this.f32251a;
    }

    /* JADX INFO: renamed from: k */
    public float m35598k() {
        return this.f32253c;
    }

    /* JADX INFO: renamed from: l */
    public float m35599l() {
        return this.f32257g;
    }

    /* JADX INFO: renamed from: o */
    public int m35600o(C8874l c8874l) {
        float fPow = (float) Math.pow(((double) ((((double) m35596i()) == 0.0d || ((double) m35598k()) == 0.0d) ? 0.0f : m35596i() / ((float) Math.sqrt(((double) m35598k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, c8874l.m35699e()), 0.73d), 1.1111111111111112d);
        double dM35597j = (m35597j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM35597j) + 3.8d)) * 0.25f;
        float fM35695a = c8874l.m35695a() * ((float) Math.pow(((double) m35598k()) / 100.0d, (1.0d / ((double) c8874l.m35696b())) / ((double) c8874l.m35704j())));
        float fM35701g = fCos * 3846.1538f * c8874l.m35701g() * c8874l.m35702h();
        float fM35700f = fM35695a / c8874l.m35700f();
        float fSin = (float) Math.sin(dM35597j);
        float fCos2 = (float) Math.cos(dM35597j);
        float f10 = (((0.305f + fM35700f) * 23.0f) * fPow) / (((fM35701g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = fM35700f * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f14) * (100.0f / c8874l.m35697c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f15) * (100.0f / c8874l.m35697c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f16) * (100.0f / c8874l.m35697c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16)))), 2.380952380952381d));
        float f17 = fSignum / c8874l.m35703i()[0];
        float f18 = fSignum2 / c8874l.m35703i()[1];
        float f19 = fSignum3 / c8874l.m35703i()[2];
        float[][] fArr = C8864b.f32261b;
        float[] fArr2 = fArr[0];
        float f20 = (fArr2[0] * f17) + (fArr2[1] * f18) + (fArr2[2] * f19);
        float[] fArr3 = fArr[1];
        float f21 = (fArr3[0] * f17) + (fArr3[1] * f18) + (fArr3[2] * f19);
        float[] fArr4 = fArr[2];
        return C0546c.m2668b(f20, f21, (f17 * fArr4[0]) + (f18 * fArr4[1]) + (f19 * fArr4[2]));
    }

    /* JADX INFO: renamed from: p */
    public int m35601p() {
        return m35600o(C8874l.f32296k);
    }
}
