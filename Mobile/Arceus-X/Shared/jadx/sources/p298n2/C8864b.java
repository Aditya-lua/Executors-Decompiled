package p298n2;

import android.graphics.Color;
import androidx.core.graphics.C0546c;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: n2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8864b {

    /* JADX INFO: renamed from: a */
    public static final float[][] f32260a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f32261b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f32262c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f32263d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: a */
    public static int m35602a(float f10) {
        if (f10 < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f32262c;
        return C0546c.m2668b(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    /* JADX INFO: renamed from: b */
    public static float m35603b(int i10) {
        return m35604c(m35608g(i10));
    }

    /* JADX INFO: renamed from: c */
    public static float m35604c(float f10) {
        float f11 = f10 / 100.0f;
        return f11 <= 0.008856452f ? f11 * 903.2963f : (((float) Math.cbrt(f11)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: renamed from: d */
    public static float m35605d(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* JADX INFO: renamed from: e */
    public static float m35606e(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: f */
    public static void m35607f(int i10, float[] fArr) {
        float fM35606e = m35606e(Color.red(i10));
        float fM35606e2 = m35606e(Color.green(i10));
        float fM35606e3 = m35606e(Color.blue(i10));
        float[][] fArr2 = f32263d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fM35606e) + (fArr3[1] * fM35606e2) + (fArr3[2] * fM35606e3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fM35606e) + (fArr4[1] * fM35606e2) + (fArr4[2] * fM35606e3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fM35606e * fArr5[0]) + (fM35606e2 * fArr5[1]) + (fM35606e3 * fArr5[2]);
    }

    /* JADX INFO: renamed from: g */
    public static float m35608g(int i10) {
        float fM35606e = m35606e(Color.red(i10));
        float fM35606e2 = m35606e(Color.green(i10));
        float fM35606e3 = m35606e(Color.blue(i10));
        float[] fArr = f32263d[1];
        return (fM35606e * fArr[0]) + (fM35606e2 * fArr[1]) + (fM35606e3 * fArr[2]);
    }

    /* JADX INFO: renamed from: h */
    public static float m35609h(float f10) {
        return (f10 > 8.0f ? (float) Math.pow((((double) f10) + 16.0d) / 116.0d, 3.0d) : f10 / 903.2963f) * 100.0f;
    }
}
