package p066d3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: d3.f */
/* JADX INFO: loaded from: classes.dex */
public class C4428f {

    /* JADX INFO: renamed from: d3.f$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static ColorStateList m22285a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* JADX INFO: renamed from: b */
        public static PorterDuff.Mode m22286b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* JADX INFO: renamed from: c */
        public static void m22287c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        public static void m22288d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m22281a(ImageView imageView) {
        return a.m22285a(imageView);
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m22282b(ImageView imageView) {
        return a.m22286b(imageView);
    }

    /* JADX INFO: renamed from: c */
    public static void m22283c(ImageView imageView, ColorStateList colorStateList) {
        a.m22287c(imageView, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m22284d(ImageView imageView, PorterDuff.Mode mode) {
        a.m22288d(imageView, mode);
    }
}
