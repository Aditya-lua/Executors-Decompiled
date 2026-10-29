package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public final class LargeJpegImageQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1817a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* JADX INFO: renamed from: b */
    public static final Set<String> f1818b = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    /* JADX INFO: renamed from: g */
    public static boolean m2249g() {
        return "Samsung".equalsIgnoreCase(Build.BRAND);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m2250h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f1817a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2251i() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && f1818b.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2252j() {
        return m2249g() || m2251i();
    }

    /* JADX INFO: renamed from: k */
    public boolean m2253k(byte[] bArr) {
        return m2250h() || m2251i() || bArr.length > 10000000;
    }
}
