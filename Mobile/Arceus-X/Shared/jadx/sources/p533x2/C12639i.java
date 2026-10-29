package p533x2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: renamed from: x2.i */
/* JADX INFO: loaded from: classes.dex */
public class C12639i {

    /* JADX INFO: renamed from: x2.i$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static float m47083a(int i10, float f10, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i10, f10, displayMetrics);
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m47080a(int i10, float f10, DisplayMetrics displayMetrics) {
        float f11;
        float f12;
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m47083a(i10, f10, displayMetrics);
        }
        if (i10 == 0) {
            return f10;
        }
        if (i10 == 1) {
            float f13 = displayMetrics.density;
            if (f13 == 0.0f) {
                return 0.0f;
            }
            return f10 / f13;
        }
        if (i10 == 2) {
            float f14 = displayMetrics.scaledDensity;
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return f10 / f14;
        }
        if (i10 == 3) {
            float f15 = displayMetrics.xdpi;
            if (f15 == 0.0f) {
                return 0.0f;
            }
            f11 = f10 / f15;
            f12 = 0.013888889f;
        } else {
            if (i10 == 4) {
                float f16 = displayMetrics.xdpi;
                if (f16 == 0.0f) {
                    return 0.0f;
                }
                return f10 / f16;
            }
            if (i10 != 5) {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i10);
            }
            float f17 = displayMetrics.xdpi;
            if (f17 == 0.0f) {
                return 0.0f;
            }
            f11 = f10 / f17;
            f12 = 0.03937008f;
        }
        return f11 / f12;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static int m47081b(int i10) {
        return i10 & 15;
    }

    /* JADX INFO: renamed from: c */
    public static float m47082c(float f10, DisplayMetrics displayMetrics) {
        return m47080a(1, f10, displayMetrics);
    }
}
