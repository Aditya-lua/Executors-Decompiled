package p322o5;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.h */
/* JADX INFO: loaded from: classes.dex */
public class C9665h {

    /* JADX INFO: renamed from: a */
    public static boolean f35083a = true;

    /* JADX INFO: renamed from: o5.h$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m38183a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38181a(@NonNull ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m38183a(imageView, matrix);
            return;
        }
        if (matrix != null) {
            m38182b(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public static void m38182b(@NonNull ImageView imageView, Matrix matrix) {
        if (f35083a) {
            try {
                a.m38183a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f35083a = false;
            }
        }
    }
}
