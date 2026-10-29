package p368q2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: q2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10425a {

    /* JADX INFO: renamed from: q2.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m40122a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m40123b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* JADX INFO: renamed from: c */
        public static ColorFilter m40124c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* JADX INFO: renamed from: d */
        public static void m40125d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* JADX INFO: renamed from: e */
        public static void m40126e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        /* JADX INFO: renamed from: f */
        public static void m40127f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: g */
        public static void m40128g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        /* JADX INFO: renamed from: h */
        public static void m40129h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* JADX INFO: renamed from: i */
        public static void m40130i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: q2.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static int m40131a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m40132b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40104a(Drawable drawable, Resources.Theme theme) {
        a.m40122a(drawable, theme);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40105b(Drawable drawable) {
        return a.m40123b(drawable);
    }

    /* JADX INFO: renamed from: c */
    public static void m40106c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static int m40107d(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: e */
    public static ColorFilter m40108e(Drawable drawable) {
        return a.m40124c(drawable);
    }

    /* JADX INFO: renamed from: f */
    public static int m40109f(Drawable drawable) {
        return b.m40131a(drawable);
    }

    /* JADX INFO: renamed from: g */
    public static void m40110g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        a.m40125d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static boolean m40111h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static void m40112i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static void m40113j(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    /* JADX INFO: renamed from: k */
    public static void m40114k(Drawable drawable, float f10, float f11) {
        a.m40126e(drawable, f10, f11);
    }

    /* JADX INFO: renamed from: l */
    public static void m40115l(Drawable drawable, int i10, int i11, int i12, int i13) {
        a.m40127f(drawable, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m40116m(Drawable drawable, int i10) {
        return b.m40132b(drawable, i10);
    }

    /* JADX INFO: renamed from: n */
    public static void m40117n(Drawable drawable, int i10) {
        a.m40128g(drawable, i10);
    }

    /* JADX INFO: renamed from: o */
    public static void m40118o(Drawable drawable, ColorStateList colorStateList) {
        a.m40129h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: p */
    public static void m40119p(Drawable drawable, PorterDuff.Mode mode) {
        a.m40130i(drawable, mode);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static <T extends Drawable> T m40120q(Drawable drawable) {
        return drawable instanceof InterfaceC10426b ? (T) ((InterfaceC10426b) drawable).m40133a() : drawable;
    }

    /* JADX INFO: renamed from: r */
    public static Drawable m40121r(Drawable drawable) {
        return drawable;
    }
}
