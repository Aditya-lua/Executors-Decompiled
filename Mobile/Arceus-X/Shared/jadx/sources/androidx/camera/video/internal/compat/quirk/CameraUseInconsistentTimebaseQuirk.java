package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1822a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* JADX INFO: renamed from: b */
    public static final Set<String> f1823b = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));

    /* JADX INFO: renamed from: c */
    public static final Set<String> f1824c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    /* JADX INFO: renamed from: g */
    private static boolean m2271g() {
        return f1824c.contains(Build.MODEL.toLowerCase());
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2272h() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f1822a.contains(Build.HARDWARE.toLowerCase());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2273i() {
        return m2274j() || m2272h() || m2271g();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2274j() {
        return Build.VERSION.SDK_INT >= 31 && f1823b.contains(Build.SOC_MODEL.toLowerCase());
    }
}
