package o5;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public class j {

    public static class a {
        public static <T, V> ObjectAnimator a(T t8, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t8, property, (TypeConverter) null, path);
        }
    }

    public static <T> ObjectAnimator a(T t8, Property<T, PointF> property, Path path) {
        return a.a(t8, property, path);
    }
}
