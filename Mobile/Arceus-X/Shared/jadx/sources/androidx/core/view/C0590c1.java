package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0590c1 {

    /* JADX INFO: renamed from: androidx.core.view.c1$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m2822a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.c1$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m2823a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.c1$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static void m2824a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0619l1 m2820a(Window window, View view) {
        return new C0619l1(window, view);
    }

    /* JADX INFO: renamed from: b */
    public static void m2821b(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c.m2824a(window, z10);
        } else if (i10 >= 30) {
            b.m2823a(window, z10);
        } else {
            a.m2822a(window, z10);
        }
    }
}
