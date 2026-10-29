package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionShouldUseMrirQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2049g() {
        return "google".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
