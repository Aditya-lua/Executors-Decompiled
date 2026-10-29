package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001a0.C0008c0;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class AfRegionFlipHorizontallyQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2040g(C0008c0 c0008c0) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
