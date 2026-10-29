package p513wc;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import p368q2.C10425a;

/* JADX INFO: renamed from: wc.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C12348c {

    /* JADX INFO: renamed from: wc.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m46214a(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    /* JADX INFO: renamed from: wc.c$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m46215a(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m46202a(Drawable drawable, Drawable drawable2) {
        return m46203b(drawable, drawable2, -1, -1);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m46203b(Drawable drawable, Drawable drawable2, int i10, int i11) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i10 == -1) {
            i10 = m46210i(drawable, drawable2);
        }
        if (i11 == -1) {
            i11 = m46209h(drawable, drawable2);
        }
        if (i10 > drawable.getIntrinsicWidth() || i11 > drawable.getIntrinsicHeight()) {
            float f10 = i10 / i11;
            if (f10 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i11 = (int) (intrinsicWidth / f10);
                i10 = intrinsicWidth;
            } else {
                i11 = drawable.getIntrinsicHeight();
                i10 = (int) (f10 * i11);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i10, i11);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m46204c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m46206e(drawable, colorStateList, mode, false);
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m46205d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m46206e(drawable, colorStateList, mode, false);
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m46206e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z10) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = C10425a.m40121r(drawable).mutate();
        if (mode != null) {
            C10425a.m40119p(drawableMutate, mode);
        }
        return drawableMutate;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static int[] m46207f(@NonNull int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m46208g(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C12346a.m46200a(drawable)) {
            return null;
        }
        return C12347b.m46201a(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: h */
    public static int m46209h(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    /* JADX INFO: renamed from: i */
    public static int m46210i(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static int[] m46211j(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 != 16842912) {
                iArr2[i10] = i11;
                i10++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: k */
    public static void m46212k(@NonNull Outline outline, @NonNull Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            b.m46215a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                a.m46214a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.m46214a(outline, path);
        }
    }

    /* JADX INFO: renamed from: l */
    public static PorterDuffColorFilter m46213l(@NonNull Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
