package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecInfoReportIncorrectInfoQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1826a = Arrays.asList("lg-k430", "redmi note 4", "m2003j15sc", "m2004j19c", "rmx3231", "v2117", "sm-a032f", "moto g(20)", "sm-a035m", "v2204", "23078pnd5g", "pht110", "23053rn02l", "rmx3710", "rmx3511", "v2207", "moto e20");

    /* JADX INFO: renamed from: g */
    public static Set<Size> m2301g() {
        return m2302h() ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2302h() {
        return f1826a.contains(Build.MODEL.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: i */
    private static boolean m2303i() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    private static boolean m2304j() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m2305k() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: l */
    private static boolean m2306l() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2307m() {
        return "Redmi".equalsIgnoreCase(Build.BRAND) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2308n() {
        return "LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m2309o() {
        return "infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2310p() {
        return m2305k() || m2304j() || m2309o() || m2308n() || m2303i() || m2307m() || m2306l() || m2302h();
    }
}
