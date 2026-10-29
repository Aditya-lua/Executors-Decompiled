package p365q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0546c;
import p181i.C6598j;

/* JADX INFO: renamed from: q.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C10406v0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f37499a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final int[] f37500b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f37501c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f37502d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e */
    public static final int[] f37503e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    public static final int[] f37504f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    public static final int[] f37505g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h */
    public static final int[] f37506h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i */
    public static final int[] f37507i = new int[0];

    /* JADX INFO: renamed from: j */
    public static final int[] f37508j = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m40056a(@NonNull View view, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C6598j.f25203A0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C6598j.f25228F0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m40057b(@NonNull Context context, int i10) {
        ColorStateList colorStateListM40060e = m40060e(context, i10);
        if (colorStateListM40060e != null && colorStateListM40060e.isStateful()) {
            return colorStateListM40060e.getColorForState(f37500b, colorStateListM40060e.getDefaultColor());
        }
        TypedValue typedValueM40061f = m40061f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM40061f, true);
        return m40059d(context, i10, typedValueM40061f.getFloat());
    }

    /* JADX INFO: renamed from: c */
    public static int m40058c(@NonNull Context context, int i10) {
        int[] iArr = f37508j;
        iArr[0] = i10;
        C10357a1 c10357a1M39727u = C10357a1.m39727u(context, null, iArr);
        try {
            return c10357a1M39727u.m39730b(0, 0);
        } finally {
            c10357a1M39727u.m39749x();
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m40059d(@NonNull Context context, int i10, float f10) {
        int iM40058c = m40058c(context, i10);
        return C0546c.m2678l(iM40058c, Math.round(Color.alpha(iM40058c) * f10));
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m40060e(@NonNull Context context, int i10) {
        int[] iArr = f37508j;
        iArr[0] = i10;
        C10357a1 c10357a1M39727u = C10357a1.m39727u(context, null, iArr);
        try {
            return c10357a1M39727u.m39731c(0);
        } finally {
            c10357a1M39727u.m39749x();
        }
    }

    /* JADX INFO: renamed from: f */
    public static TypedValue m40061f() {
        ThreadLocal<TypedValue> threadLocal = f37499a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
