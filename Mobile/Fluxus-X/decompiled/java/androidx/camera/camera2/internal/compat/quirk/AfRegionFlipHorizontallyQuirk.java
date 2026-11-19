package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class AfRegionFlipHorizontallyQuirk implements g3 {
    public static boolean g(c0 c0Var) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
