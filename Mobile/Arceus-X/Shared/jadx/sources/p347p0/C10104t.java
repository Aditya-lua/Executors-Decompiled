package p347p0;

import android.opengl.Matrix;

/* JADX INFO: renamed from: p0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C10104t {

    /* JADX INFO: renamed from: a */
    public static final float[] f36392a = new float[16];

    /* JADX INFO: renamed from: a */
    public static void m38998a(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, -f10, -f11, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public static void m38999b(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, f10, f11, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public static void m39000c(float[] fArr, float f10, float f11, float f12) {
        m38999b(fArr, f11, f12);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        m38998a(fArr, f11, f12);
    }

    /* JADX INFO: renamed from: d */
    public static void m39001d(float[] fArr, float f10) {
        m38999b(fArr, 0.0f, f10);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        m38998a(fArr, 0.0f, f10);
    }
}
