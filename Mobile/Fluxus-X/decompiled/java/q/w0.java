package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f29674a = new ThreadLocal<>();
    public static final int[] b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f29675c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f29676d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f29677e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f29678f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f29679g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f29680h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f29681i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f29682j = new int[1];

    public static void a(@NonNull View view, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i.j.A0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(i.j.F0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(@NonNull Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    public static int c(@NonNull Context context, int i10) {
        int[] iArr = f29682j;
        iArr[0] = i10;
        b1 b1VarU = b1.u(context, null, iArr);
        try {
            return b1VarU.b(0, 0);
        } finally {
            b1VarU.x();
        }
    }

    public static int d(@NonNull Context context, int i10, float f10) {
        int iC = c(context, i10);
        return androidx.core.graphics.c.l(iC, Math.round(Color.alpha(iC) * f10));
    }

    public static ColorStateList e(@NonNull Context context, int i10) {
        int[] iArr = f29682j;
        iArr[0] = i10;
        b1 b1VarU = b1.u(context, null, iArr);
        try {
            return b1VarU.c(0);
        } finally {
            b1VarU.x();
        }
    }

    public static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f29674a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
