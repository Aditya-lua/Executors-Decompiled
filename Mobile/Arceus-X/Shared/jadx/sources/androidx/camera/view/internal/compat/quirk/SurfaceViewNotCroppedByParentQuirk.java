package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceViewNotCroppedByParentQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2424g() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
