package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import p533x2.C12632b;

/* JADX INFO: renamed from: androidx.core.view.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0611j {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f2430a;

    /* JADX INFO: renamed from: androidx.core.view.j$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m2923a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* JADX INFO: renamed from: b */
        public static int m2924b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* JADX INFO: renamed from: c */
        public static int m2925c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* JADX INFO: renamed from: d */
        public static int m2926d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.j$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Insets m2927a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public C0611j(DisplayCutout displayCutout) {
        this.f2430a = displayCutout;
    }

    /* JADX INFO: renamed from: g */
    public static C0611j m2916g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0611j(displayCutout);
    }

    /* JADX INFO: renamed from: a */
    public int m2917a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m2923a(this.f2430a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int m2918b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m2924b(this.f2430a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m2919c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m2925c(this.f2430a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m2920d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m2926d(this.f2430a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public androidx.core.graphics.Insets m2921e() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.Insets.toCompatInsets(b.m2927a(this.f2430a)) : androidx.core.graphics.Insets.NONE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0611j.class != obj.getClass()) {
            return false;
        }
        return C12632b.m47060a(this.f2430a, ((C0611j) obj).f2430a);
    }

    /* JADX INFO: renamed from: f */
    public DisplayCutout m2922f() {
        return this.f2430a;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f2430a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2430a + "}";
    }
}
