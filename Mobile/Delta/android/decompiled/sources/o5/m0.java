package o5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f27133g = true;

    public static class a {
        public static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    @Override // o5.j0
    @SuppressLint({"NewApi"})
    public void f(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f27133g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f27133g = false;
            }
        }
    }
}
