package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class AudioTimestampFramePositionIncorrectQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1821a = Arrays.asList("cph1920", "cph1923", "cph2015", "cph2083");

    /* JADX INFO: renamed from: g */
    private static boolean m2263g() {
        return "oppo".equalsIgnoreCase(Build.BRAND) && f1821a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2264h() {
        return "lge".equalsIgnoreCase(Build.BRAND) && "lg-m250".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2265i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2266j() {
        return "realme".equalsIgnoreCase(Build.BRAND) && "rmx1941".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2267k() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 6A".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2268l() {
        return Payload.SOURCE_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2269m() {
        return Payload.SOURCE_VIVO.equalsIgnoreCase(Build.BRAND) && "VIVO Y17".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2270n() {
        return m2263g() || m2264h() || m2265i() || m2266j() || m2267k() || m2268l() || m2269m();
    }
}
