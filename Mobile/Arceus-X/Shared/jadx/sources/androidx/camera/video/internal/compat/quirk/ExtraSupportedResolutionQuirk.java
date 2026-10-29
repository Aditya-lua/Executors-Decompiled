package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedResolutionQuirk implements SurfaceProcessingQuirk {
    /* JADX INFO: renamed from: g */
    private static boolean m2294g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2295h() {
        return m2294g();
    }
}
