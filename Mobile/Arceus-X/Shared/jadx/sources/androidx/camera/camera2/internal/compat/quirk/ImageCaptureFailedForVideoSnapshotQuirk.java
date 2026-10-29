package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1742a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "sm-f946u1", "tecno mobile bf6"));

    /* JADX INFO: renamed from: g */
    public static boolean m2093g() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2094h() {
        Set<String> set = f1742a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (set.contains(str.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str2 = Build.HARDWARE;
        if (str2.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        return "itel".equalsIgnoreCase(Build.BRAND) && str2.toLowerCase(locale).startsWith("sp");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2095i() {
        return m2094h() || m2093g();
    }
}
