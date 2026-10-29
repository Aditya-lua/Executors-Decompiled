package p347p0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;
import p533x2.C12637g;

/* JADX INFO: renamed from: p0.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C10085a0 {

    /* JADX INFO: renamed from: a */
    public static final RectF f36321a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public static float m38873a(float f10, float f11, float f12, float f13) {
        float f14 = (f10 * f12) + (f11 * f13);
        float f15 = (f10 * f13) - (f11 * f12);
        double dSqrt = Math.sqrt((f10 * f10) + (f11 * f11)) * Math.sqrt((f12 * f12) + (f13 * f13));
        return (float) Math.toDegrees(Math.atan2(((double) f15) / dSqrt, ((double) f14) / dSqrt));
    }

    /* JADX INFO: renamed from: b */
    public static Matrix m38874b(Rect rect) {
        return m38875c(new RectF(rect));
    }

    /* JADX INFO: renamed from: c */
    public static Matrix m38875c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f36321a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* JADX INFO: renamed from: d */
    public static Matrix m38876d(RectF rectF, RectF rectF2, int i10) {
        return m38877e(rectF, rectF2, i10, false);
    }

    /* JADX INFO: renamed from: e */
    public static Matrix m38877e(RectF rectF, RectF rectF2, int i10, boolean z10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f36321a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(m38875c(rectF2));
        return matrix;
    }

    /* JADX INFO: renamed from: f */
    public static Size m38878f(Rect rect, int i10) {
        return m38889q(m38885m(rect), i10);
    }

    /* JADX INFO: renamed from: g */
    public static int m38879g(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return m38895w((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m38880h(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m38881i(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i10);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m38882j(Size size, Size size2) {
        return m38883k(size, false, size2, false);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m38883k(Size size, boolean z10, Size size2, boolean z11) {
        float width;
        float width2;
        float width3;
        float f10;
        if (z10) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z11) {
            width3 = size2.getWidth() / size2.getHeight();
            f10 = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f10 = width4;
        }
        return width >= width3 && f10 >= width2;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m38884l(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return m38873a(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public static Size m38885m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* JADX INFO: renamed from: n */
    public static String m38886n(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    /* JADX INFO: renamed from: o */
    public static Size m38887o(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    /* JADX INFO: renamed from: p */
    public static RectF m38888p(RectF rectF, int i10) {
        C12637g.m47070b(i10 % 90 == 0, "Invalid rotation degrees: " + i10);
        return m38881i(m38895w(i10)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    /* JADX INFO: renamed from: q */
    public static Size m38889q(Size size, int i10) {
        C12637g.m47070b(i10 % 90 == 0, "Invalid rotation degrees: " + i10);
        return m38881i(m38895w(i10)) ? m38887o(size) : size;
    }

    /* JADX INFO: renamed from: r */
    public static Rect m38890r(Size size) {
        return m38891s(size, 0, 0);
    }

    /* JADX INFO: renamed from: s */
    public static Rect m38891s(Size size, int i10, int i11) {
        return new Rect(i10, i11, size.getWidth() + i10, size.getHeight() + i11);
    }

    /* JADX INFO: renamed from: t */
    public static RectF m38892t(Size size) {
        return m38893u(size, 0, 0);
    }

    /* JADX INFO: renamed from: u */
    public static RectF m38893u(Size size, int i10, int i11) {
        return new RectF(i10, i11, i10 + size.getWidth(), i11 + size.getHeight());
    }

    /* JADX INFO: renamed from: v */
    public static Matrix m38894v(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    /* JADX INFO: renamed from: w */
    public static int m38895w(int i10) {
        return ((i10 % 360) + 360) % 360;
    }
}
