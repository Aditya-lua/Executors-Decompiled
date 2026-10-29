package o5;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f27122a = true;
    public static Field b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f27123c;

    public static class a {
        public static float a(View view) {
            return view.getTransitionAlpha();
        }

        public static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    public void a(@NonNull View view) {
    }

    @SuppressLint({"NewApi"})
    public float b(@NonNull View view) {
        if (f27122a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f27122a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(@NonNull View view) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void d(@NonNull View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void e(@NonNull View view, float f10) {
        if (f27122a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f27122a = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void f(@NonNull View view, int i10) {
        if (!f27123c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f27123c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    public void h(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }
}
