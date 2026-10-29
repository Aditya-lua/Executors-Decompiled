package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class PreviewStretchWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk {
    /* JADX INFO: renamed from: g */
    public static boolean m2135g() {
        return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2136h() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "A37F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2137i() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2138j() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2139k() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j510fn".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2140l() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2141m() {
        return m2135g() || m2138j() || m2140l() || m2137i() || m2136h() || m2139k();
    }
}
