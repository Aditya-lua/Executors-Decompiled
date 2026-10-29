package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2425g() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2426h() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2427i() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2428j() {
        if (Build.VERSION.SDK_INT < 33) {
            return m2427i() || m2426h() || m2425g();
        }
        return false;
    }
}
