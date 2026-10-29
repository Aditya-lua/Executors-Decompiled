package p463uc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0546c;
import p101ed.C5049b;
import p261l2.C7975b;

/* JADX INFO: renamed from: uc.a */
/* JADX INFO: loaded from: classes2.dex */
public class C11840a {
    /* JADX INFO: renamed from: a */
    public static int m44225a(int i10, int i11) {
        return C0546c.m2678l(i10, (Color.alpha(i10) * i11) / 255);
    }

    /* JADX INFO: renamed from: b */
    public static int m44226b(@NonNull Context context, int i10, int i11) {
        Integer numM44230f = m44230f(context, i10);
        return numM44230f != null ? numM44230f.intValue() : i11;
    }

    /* JADX INFO: renamed from: c */
    public static int m44227c(Context context, int i10, String str) {
        return m44236l(context, C5049b.m23734e(context, i10, str));
    }

    /* JADX INFO: renamed from: d */
    public static int m44228d(@NonNull View view, int i10) {
        return m44236l(view.getContext(), C5049b.m23735f(view, i10));
    }

    /* JADX INFO: renamed from: e */
    public static int m44229e(@NonNull View view, int i10, int i11) {
        return m44226b(view.getContext(), i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public static Integer m44230f(@NonNull Context context, int i10) {
        TypedValue typedValueM23730a = C5049b.m23730a(context, i10);
        if (typedValueM23730a != null) {
            return Integer.valueOf(m44236l(context, typedValueM23730a));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m44231g(@NonNull Context context, int i10) {
        TypedValue typedValueM23730a = C5049b.m23730a(context, i10);
        if (typedValueM23730a == null) {
            return null;
        }
        int i11 = typedValueM23730a.resourceId;
        if (i11 != 0) {
            return C7975b.m33006d(context, i11);
        }
        int i12 = typedValueM23730a.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m44232h(int i10) {
        return i10 != 0 && C0546c.m2671e(i10) > 0.5d;
    }

    /* JADX INFO: renamed from: i */
    public static int m44233i(int i10, int i11) {
        return C0546c.m2674h(i11, i10);
    }

    /* JADX INFO: renamed from: j */
    public static int m44234j(int i10, int i11, float f10) {
        return m44233i(i10, C0546c.m2678l(i11, Math.round(Color.alpha(i11) * f10)));
    }

    /* JADX INFO: renamed from: k */
    public static int m44235k(@NonNull View view, int i10, int i11, float f10) {
        return m44234j(m44228d(view, i10), m44228d(view, i11), f10);
    }

    /* JADX INFO: renamed from: l */
    public static int m44236l(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? C7975b.m33005c(context, i10) : typedValue.data;
    }
}
