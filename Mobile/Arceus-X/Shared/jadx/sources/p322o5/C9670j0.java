package p322o5;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: o5.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C9670j0 {

    /* JADX INFO: renamed from: a */
    public static boolean f35089a = true;

    /* JADX INFO: renamed from: b */
    public static Field f35090b;

    /* JADX INFO: renamed from: c */
    public static boolean f35091c;

    /* JADX INFO: renamed from: o5.j0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static float m38211a(View view) {
            return view.getTransitionAlpha();
        }

        /* JADX INFO: renamed from: b */
        public static void m38212b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38203a(@NonNull View view) {
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public float mo38204b(@NonNull View view) {
        if (f35089a) {
            try {
                return a.m38211a(view);
            } catch (NoSuchMethodError unused) {
                f35089a = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: c */
    public void m38205c(@NonNull View view) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: d */
    public void mo38206d(@NonNull View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void mo38207e(@NonNull View view, float f10) {
        if (f35089a) {
            try {
                a.m38212b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f35089a = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: f */
    public void mo38208f(@NonNull View view, int i10) {
        if (!f35091c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f35090b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f35091c = true;
        }
        Field field = f35090b;
        if (field != null) {
            try {
                f35090b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo38209g(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public void mo38210h(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }
}
