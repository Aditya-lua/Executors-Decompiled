package p322o5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.h0 */
/* JADX INFO: loaded from: classes.dex */
public class C9666h0 {

    /* JADX INFO: renamed from: a */
    public static boolean f35084a = true;

    /* JADX INFO: renamed from: o5.h0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m38186a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        /* JADX INFO: renamed from: b */
        public static void m38187b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static void m38184a(@NonNull ViewGroup viewGroup, boolean z10) {
        if (f35084a) {
            try {
                a.m38187b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f35084a = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m38185b(@NonNull ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m38187b(viewGroup, z10);
        } else {
            m38184a(viewGroup, z10);
        }
    }
}
