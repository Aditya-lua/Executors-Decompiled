package zc;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.view.c1;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static void a(@NonNull Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = tc.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        c1.b(window, !z10);
        int iC = c(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, tc.a.h(num.intValue())));
        e(window, d(iB2, tc.a.h(num2.intValue())));
    }

    @TargetApi(21)
    public static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.c.l(tc.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return tc.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    public static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return tc.a.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean d(int i10, boolean z10) {
        if (tc.a.h(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void e(@NonNull Window window, boolean z10) {
        c1.a(window, window.getDecorView()).c(z10);
    }

    public static void f(@NonNull Window window, boolean z10) {
        c1.a(window, window.getDecorView()).d(z10);
    }
}
