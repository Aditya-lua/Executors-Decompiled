package bd;

/* JADX INFO: renamed from: bd.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1304a {
    /* JADX INFO: renamed from: a */
    public static float m7096a(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    /* JADX INFO: renamed from: b */
    public static float m7097b(float f10, float f11, float f12, float f13, float f14, float f15) {
        return m7099d(m7096a(f10, f11, f12, f13), m7096a(f10, f11, f14, f13), m7096a(f10, f11, f14, f15), m7096a(f10, f11, f12, f15));
    }

    /* JADX INFO: renamed from: c */
    public static float m7098c(float f10, float f11, float f12) {
        return ((1.0f - f12) * f10) + (f12 * f11);
    }

    /* JADX INFO: renamed from: d */
    public static float m7099d(float f10, float f11, float f12, float f13) {
        if (f10 > f11 && f10 > f12 && f10 > f13) {
            return f10;
        }
        if (f11 <= f12 || f11 <= f13) {
            return f12 > f13 ? f12 : f13;
        }
        return f11;
    }
}
