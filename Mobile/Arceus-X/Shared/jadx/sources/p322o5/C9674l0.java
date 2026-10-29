package p322o5;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C9674l0 extends C9672k0 {

    /* JADX INFO: renamed from: f */
    public static boolean f35100f = true;

    /* JADX INFO: renamed from: o5.l0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m38217a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    @Override // p322o5.C9670j0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public void mo38206d(@NonNull View view, int i10, int i11, int i12, int i13) {
        if (f35100f) {
            try {
                a.m38217a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f35100f = false;
            }
        }
    }
}
