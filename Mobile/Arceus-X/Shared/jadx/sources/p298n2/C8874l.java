package p298n2;

/* JADX INFO: renamed from: n2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8874l {

    /* JADX INFO: renamed from: k */
    public static final C8874l f32296k = m35694k(C8864b.f32262c, (float) ((((double) C8864b.m35609h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a */
    public final float f32297a;

    /* JADX INFO: renamed from: b */
    public final float f32298b;

    /* JADX INFO: renamed from: c */
    public final float f32299c;

    /* JADX INFO: renamed from: d */
    public final float f32300d;

    /* JADX INFO: renamed from: e */
    public final float f32301e;

    /* JADX INFO: renamed from: f */
    public final float f32302f;

    /* JADX INFO: renamed from: g */
    public final float[] f32303g;

    /* JADX INFO: renamed from: h */
    public final float f32304h;

    /* JADX INFO: renamed from: i */
    public final float f32305i;

    /* JADX INFO: renamed from: j */
    public final float f32306j;

    public C8874l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f32302f = f10;
        this.f32297a = f11;
        this.f32298b = f12;
        this.f32299c = f13;
        this.f32300d = f14;
        this.f32301e = f15;
        this.f32303g = fArr;
        this.f32304h = f16;
        this.f32305i = f17;
        this.f32306j = f18;
    }

    /* JADX INFO: renamed from: k */
    public static C8874l m35694k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = C8864b.f32260a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float fM35605d = ((double) f21) >= 0.9d ? C8864b.m35605d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : C8864b.m35605d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f20) * fExp) + 1.0f) - fExp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float fCbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(((double) f10) * 5.0d)));
        float fM35609h = C8864b.m35609h(f11) / fArr[1];
        double d11 = fM35609h;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f19)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f20)) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        return new C8874l(fM35609h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fM35605d, f21, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: a */
    public float m35695a() {
        return this.f32297a;
    }

    /* JADX INFO: renamed from: b */
    public float m35696b() {
        return this.f32300d;
    }

    /* JADX INFO: renamed from: c */
    public float m35697c() {
        return this.f32304h;
    }

    /* JADX INFO: renamed from: d */
    public float m35698d() {
        return this.f32305i;
    }

    /* JADX INFO: renamed from: e */
    public float m35699e() {
        return this.f32302f;
    }

    /* JADX INFO: renamed from: f */
    public float m35700f() {
        return this.f32298b;
    }

    /* JADX INFO: renamed from: g */
    public float m35701g() {
        return this.f32301e;
    }

    /* JADX INFO: renamed from: h */
    public float m35702h() {
        return this.f32299c;
    }

    /* JADX INFO: renamed from: i */
    public float[] m35703i() {
        return this.f32303g;
    }

    /* JADX INFO: renamed from: j */
    public float m35704j() {
        return this.f32306j;
    }
}
