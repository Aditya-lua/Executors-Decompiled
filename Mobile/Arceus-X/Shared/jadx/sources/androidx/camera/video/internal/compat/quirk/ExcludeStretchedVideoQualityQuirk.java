package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p115f1.C5306x;
import p296n0.InterfaceC8799o0;

/* JADX INFO: loaded from: classes.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    /* JADX INFO: renamed from: g */
    public static boolean m2280g() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J260F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2281h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    private static boolean m2282i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J530F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2283j() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "sm-j600g".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m2284k() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2285l() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J701F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: m */
    private static boolean m2286m() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2287n() {
        return m2280g() || m2281h() || m2282i() || m2283j() || m2285l() || m2286m() || m2284k();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: c */
    public boolean mo2288c(InterfaceC8799o0 interfaceC8799o0, C5306x c5306x) {
        if (m2281h()) {
            return c5306x == C5306x.f20631c || c5306x == C5306x.f20632d;
        }
        return (m2280g() || m2282i() || m2283j() || m2285l() || m2286m() || m2284k()) && c5306x == C5306x.f20631c;
    }
}
