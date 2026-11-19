package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class StopCodecAfterSurfaceRemovalCrashMediaServerQuirk implements g3 {
    private static boolean g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return g();
    }
}
