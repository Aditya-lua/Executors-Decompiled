package p322o5;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: o5.j */
/* JADX INFO: loaded from: classes.dex */
public class C9669j {

    /* JADX INFO: renamed from: o5.j$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static <T, V> ObjectAnimator m38202a(T t8, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t8, property, (TypeConverter) null, path);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> ObjectAnimator m38201a(T t8, Property<T, PointF> property, Path path) {
        return a.m38202a(t8, property, path);
    }
}
