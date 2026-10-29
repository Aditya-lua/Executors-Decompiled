package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import p533x2.C12633c;

/* JADX INFO: renamed from: androidx.core.graphics.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0547d {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<C12633c<Rect, Rect>> f2312a = new ThreadLocal<>();

    /* JADX INFO: renamed from: androidx.core.graphics.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m2681a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.d$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m2682a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2679a(Paint paint, String str) {
        return a.m2681a(paint, str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2680b(Paint paint, EnumC0544a enumC0544a) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.m2682a(paint, enumC0544a != null ? C0545b.b.m2666a(enumC0544a) : null);
            return true;
        }
        if (enumC0544a == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeM2665a = C0545b.m2665a(enumC0544a);
        paint.setXfermode(modeM2665a != null ? new PorterDuffXfermode(modeM2665a) : null);
        return modeM2665a != null;
    }
}
