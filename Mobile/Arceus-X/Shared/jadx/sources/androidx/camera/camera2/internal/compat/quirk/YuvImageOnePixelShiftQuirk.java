package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import com.appsflyer.sdk_base.referrer.Payload;
import p001a0.C0008c0;

/* JADX INFO: loaded from: classes.dex */
public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {
    /* JADX INFO: renamed from: g */
    public static boolean m2158g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2159h() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2160i() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2161j() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2162k() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2163l() {
        return Payload.SOURCE_XIAOMI.equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2164m(C0008c0 c0008c0) {
        return m2158g() || m2160i() || m2162k() || m2159h() || m2161j() || m2163l();
    }
}
