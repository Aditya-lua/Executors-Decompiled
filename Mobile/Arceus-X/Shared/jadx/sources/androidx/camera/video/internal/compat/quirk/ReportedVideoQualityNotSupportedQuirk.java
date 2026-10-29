package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;
import p115f1.C5306x;
import p296n0.InterfaceC8799o0;

/* JADX INFO: loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    /* JADX INFO: renamed from: g */
    public static boolean m2322g() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2323h() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2324i() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2325j() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2326k() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2327l() {
        return m2322g() || m2323h() || m2326k() || m2324i() || m2325j();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: c */
    public boolean mo2288c(InterfaceC8799o0 interfaceC8799o0, C5306x c5306x) {
        if (m2322g() || m2323h()) {
            return c5306x == C5306x.f20632d;
        }
        if (m2326k()) {
            return c5306x == C5306x.f20630b || c5306x == C5306x.f20631c;
        }
        if (m2324i()) {
            return interfaceC8799o0.mo26583i() == 0 && (c5306x == C5306x.f20631c || c5306x == C5306x.f20630b);
        }
        return m2325j() && interfaceC8799o0.mo26583i() == 1 && c5306x == C5306x.f20632d;
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    /* JADX INFO: renamed from: f */
    public boolean mo2104f() {
        return m2322g() || m2323h() || m2324i() || m2325j();
    }
}
