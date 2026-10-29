package p066d3;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: d3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4427e {

    /* JADX INFO: renamed from: d3.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m22277a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    /* JADX INFO: renamed from: d3.e$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m22278a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* JADX INFO: renamed from: b */
        public static float m22279b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: c */
        public static float m22280c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static EdgeEffect m22273a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.m22278a(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: b */
    public static float m22274b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m22279b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m22275c(EdgeEffect edgeEffect, float f10, float f11) {
        a.m22277a(edgeEffect, f10, f11);
    }

    /* JADX INFO: renamed from: d */
    public static float m22276d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m22280c(edgeEffect, f10, f11);
        }
        m22275c(edgeEffect, f10, f11);
        return f10;
    }
}
