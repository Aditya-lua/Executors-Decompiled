package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<x2.c<Rect, Rect>> f1783a = new ThreadLocal<>();

    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static class b {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, androidx.core.graphics.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, aVar != null ? androidx.core.graphics.b.C0025b.a(aVar) : null);
            return true;
        }
        if (aVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = androidx.core.graphics.b.a(aVar);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
