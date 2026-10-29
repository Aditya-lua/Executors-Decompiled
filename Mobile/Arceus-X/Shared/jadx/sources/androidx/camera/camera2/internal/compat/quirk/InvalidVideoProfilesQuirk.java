package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1748a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* JADX INFO: renamed from: b */
    public static final List<String> f1749b = Arrays.asList("cph2417", "cph2451");

    /* JADX INFO: renamed from: c */
    public static final List<String> f1750c = Arrays.asList("cph2437", "cph2525", "pht110");

    /* JADX INFO: renamed from: g */
    public static boolean m2110g() {
        return Build.VERSION.SDK_INT == 33;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2111h() {
        return m2112i() && m2110g();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2112i() {
        return f1749b.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2113j() {
        return m2114k() && m2110g();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2114k() {
        return f1750c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2115l() {
        return m2122s() || m2120q();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2116m() {
        return m2117n() && m2115l();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2117n() {
        return f1748a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m2118o() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && m2122s();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2119p() {
        String str = Build.BRAND;
        if ("redmi".equalsIgnoreCase(str) || Payload.SOURCE_XIAOMI.equalsIgnoreCase(str)) {
            return m2121r() || m2122s();
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2120q() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m2121r() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2122s() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m2123t() {
        return m2118o() || m2116m() || m2119p() || m2111h() || m2113j();
    }
}
