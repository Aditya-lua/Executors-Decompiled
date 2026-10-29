package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import com.appsflyer.sdk_base.referrer.Payload;
import p036c0.C1498c;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    /* JADX INFO: renamed from: g */
    public static boolean m2096g() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2097h() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2098i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2099j() {
        return "pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2100k() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2101l() {
        if (!Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2102m() {
        return Payload.SOURCE_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2103n() {
        return m2096g() || m2097h() || m2102m() || m2100k() || m2099j() || m2098i() || m2101l() || C1498c.m7648d();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* JADX INFO: renamed from: b */
    public boolean mo2035b() {
        return m2096g() || m2097h() || m2102m() || m2100k();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    /* JADX INFO: renamed from: f */
    public boolean mo2104f() {
        return m2096g() || m2097h() || m2102m() || m2100k() || m2099j() || m2098i() || m2101l() || C1498c.m7648d();
    }
}
