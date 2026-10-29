package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1761a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* JADX INFO: renamed from: b */
    public static final List<String> f1762b = Arrays.asList("MI 8");

    /* JADX INFO: renamed from: g */
    public static boolean m2165g(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m2166h() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && m2165g(f1761a);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2167i() {
        return Payload.SOURCE_XIAOMI.equalsIgnoreCase(Build.BRAND) && m2165g(f1762b);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2168j() {
        return m2166h() || m2167i();
    }
}
