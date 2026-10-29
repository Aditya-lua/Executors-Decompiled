package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.core.os.EnvironmentCompat;
import p296n0.C8785l1;
import p296n0.InterfaceC8758g3;
import p296n0.InterfaceC8795n1;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2238g() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith(EnvironmentCompat.MEDIA_UNKNOWN)) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Cuttlefish") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || Build.PRODUCT.equals("google_sdk") || Build.HARDWARE.contains("ranchu");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2239h() {
        m2238g();
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2240i() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2241j() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2242l() {
        return m2241j() || m2240i() || m2239h();
    }

    /* JADX INFO: renamed from: k */
    public boolean m2243k(InterfaceC8795n1.a<?> aVar) {
        return aVar != C8785l1.f31943i;
    }
}
