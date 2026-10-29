package ad;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0546c;
import androidx.core.view.C0590c1;
import androidx.core.view.ViewCompat;
import p463uc.C11840a;

/* JADX INFO: renamed from: ad.d */
/* JADX INFO: loaded from: classes2.dex */
public class C0132d {
    /* JADX INFO: renamed from: a */
    public static void m390a(@NonNull Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iM44226b = C11840a.m44226b(window.getContext(), R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
            if (z11) {
                num = Integer.valueOf(iM44226b);
            }
            if (z12) {
                num2 = Integer.valueOf(iM44226b);
            }
        }
        C0590c1.m2821b(window, !z10);
        int iM392c = m392c(window.getContext(), z10);
        int iM391b = m391b(window.getContext(), z10);
        window.setStatusBarColor(iM392c);
        window.setNavigationBarColor(iM391b);
        m395f(window, m393d(iM392c, C11840a.m44232h(num.intValue())));
        m394e(window, m393d(iM391b, C11840a.m44232h(num2.intValue())));
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: b */
    public static int m391b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return C0546c.m2678l(C11840a.m44226b(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
        }
        if (z10) {
            return 0;
        }
        return C11840a.m44226b(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: c */
    public static int m392c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return C11840a.m44226b(context, R.attr.statusBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m393d(int i10, boolean z10) {
        if (C11840a.m44232h(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    /* JADX INFO: renamed from: e */
    public static void m394e(@NonNull Window window, boolean z10) {
        C0590c1.m2820a(window, window.getDecorView()).m2949c(z10);
    }

    /* JADX INFO: renamed from: f */
    public static void m395f(@NonNull Window window, boolean z10) {
        C0590c1.m2820a(window, window.getDecorView()).m2950d(z10);
    }
}
