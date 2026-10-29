package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1348a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");
    public static final List<String> b = Arrays.asList("MI 8");

    public static boolean g(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean h() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && g(f1348a);
    }

    public static boolean i() {
        return Payload.SOURCE_XIAOMI.equalsIgnoreCase(Build.BRAND) && g(b);
    }

    public static boolean j() {
        return h() || i();
    }
}
