package p322o5;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C9672k0 extends C9670j0 {

    /* JADX INFO: renamed from: d */
    public static boolean f35092d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f35093e = true;

    /* JADX INFO: renamed from: o5.k0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m38214a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        /* JADX INFO: renamed from: b */
        public static void m38215b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        /* JADX INFO: renamed from: c */
        public static void m38216c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // p322o5.C9670j0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void mo38209g(@NonNull View view, @NonNull Matrix matrix) {
        if (f35092d) {
            try {
                a.m38215b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f35092d = false;
            }
        }
    }

    @Override // p322o5.C9670j0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public void mo38210h(@NonNull View view, @NonNull Matrix matrix) {
        if (f35093e) {
            try {
                a.m38216c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f35093e = false;
            }
        }
    }
}
