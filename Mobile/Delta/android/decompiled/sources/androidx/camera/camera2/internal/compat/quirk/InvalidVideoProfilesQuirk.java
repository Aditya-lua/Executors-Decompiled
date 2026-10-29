package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1338a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");
    public static final List<String> b = Arrays.asList("cph2417", "cph2451");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f1339c = Arrays.asList("cph2437", "cph2525", "pht110");

    public static boolean g() {
        return Build.VERSION.SDK_INT == 33;
    }

    public static boolean h() {
        return i() && g();
    }

    public static boolean i() {
        return b.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean j() {
        return k() && g();
    }

    public static boolean k() {
        return f1339c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean l() {
        return s() || q();
    }

    public static boolean m() {
        return n() && l();
    }

    public static boolean n() {
        return f1338a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean o() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && s();
    }

    public static boolean p() {
        String str = Build.BRAND;
        if ("redmi".equalsIgnoreCase(str) || Payload.SOURCE_XIAOMI.equalsIgnoreCase(str)) {
            return r() || s();
        }
        return false;
    }

    public static boolean q() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    public static boolean r() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    public static boolean s() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    public static boolean t() {
        return o() || m() || p() || h() || j();
    }
}
