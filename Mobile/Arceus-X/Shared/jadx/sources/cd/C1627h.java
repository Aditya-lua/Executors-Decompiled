package cd;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0552e;
import p101ed.C5049b;
import p592z2.C13689a;

/* JADX INFO: renamed from: cd.h */
/* JADX INFO: loaded from: classes2.dex */
public class C1627h {
    /* JADX INFO: renamed from: a */
    public static float m8218a(String[] strArr, int i10) {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    /* JADX INFO: renamed from: b */
    public static String m8219b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* JADX INFO: renamed from: c */
    public static TimeInterpolator m8220c(String str) {
        if (!m8222e(str, "cubic-bezier")) {
            if (m8222e(str, "path")) {
                return C13689a.m50008b(C0552e.m2715e(m8219b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = m8219b(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return C13689a.m50007a(m8218a(strArrSplit, 0), m8218a(strArrSplit, 1), m8218a(strArrSplit, 2), m8218a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8221d(String str) {
        return m8222e(str, "cubic-bezier") || m8222e(str, "path");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8222e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: f */
    public static int m8223f(@NonNull Context context, int i10, int i11) {
        return C5049b.m23732c(context, i10, i11);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static TimeInterpolator m8224g(@NonNull Context context, int i10, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return m8221d(strValueOf) ? m8220c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
