package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {
    public static boolean g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean i() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean j() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean k() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean l() {
        return Payload.SOURCE_XIAOMI.equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean m(c0 c0Var) {
        return g() || i() || k() || h() || j() || l();
    }
}
