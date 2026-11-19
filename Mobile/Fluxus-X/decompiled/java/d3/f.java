package d3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class f {

    public static class a {
        public static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        public static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        public static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        public static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    public static ColorStateList a(ImageView imageView) {
        return a.a(imageView);
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        a.c(imageView, colorStateList);
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        a.d(imageView, mode);
    }
}
