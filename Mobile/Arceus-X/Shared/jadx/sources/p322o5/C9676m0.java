package p322o5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C9676m0 extends C9674l0 {

    /* JADX INFO: renamed from: g */
    public static boolean f35102g = true;

    /* JADX INFO: renamed from: o5.m0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m38219a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    @Override // p322o5.C9670j0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public void mo38208f(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo38208f(view, i10);
        } else if (f35102g) {
            try {
                a.m38219a(view, i10);
            } catch (NoSuchMethodError unused) {
                f35102g = false;
            }
        }
    }
}
