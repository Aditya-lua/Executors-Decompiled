package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    public static boolean g() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h(c0 c0Var) {
        return g() && ((Integer) c0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
