package p431s7;

/* JADX INFO: renamed from: s7.c */
/* JADX INFO: loaded from: classes3.dex */
public class C11187c {
    /* JADX INFO: renamed from: a */
    public static float m42147a(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: b */
    public static float m42148b(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: c */
    public static int m42149c(float f10, int i10, int i11) {
        if (i10 == i11 || f10 <= 0.0f) {
            return i10;
        }
        if (f10 >= 1.0f) {
            return i11;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fM42147a = m42147a(((i10 >> 16) & 255) / 255.0f);
        float fM42147a2 = m42147a(((i10 >> 8) & 255) / 255.0f);
        float fM42147a3 = m42147a((i10 & 255) / 255.0f);
        float fM42147a4 = m42147a(((i11 >> 16) & 255) / 255.0f);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fM42147a5 = fM42147a2 + ((m42147a(((i11 >> 8) & 255) / 255.0f) - fM42147a2) * f10);
        float fM42147a6 = fM42147a3 + (f10 * (m42147a((i11 & 255) / 255.0f) - fM42147a3));
        return (Math.round(m42148b(fM42147a + ((fM42147a4 - fM42147a) * f10)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(m42148b(fM42147a5) * 255.0f) << 8) | Math.round(m42148b(fM42147a6) * 255.0f);
    }
}
