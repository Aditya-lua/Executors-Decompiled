package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionShouldUseMrirQuirk implements g3 {
    public static boolean g() {
        return "google".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
