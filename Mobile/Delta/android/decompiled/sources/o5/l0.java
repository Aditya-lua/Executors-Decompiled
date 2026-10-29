package o5;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f27131f = true;

    public static class a {
        public static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    @Override // o5.j0
    @SuppressLint({"NewApi"})
    public void d(@NonNull View view, int i10, int i11, int i12, int i13) {
        if (f27131f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f27131f = false;
            }
        }
    }
}
