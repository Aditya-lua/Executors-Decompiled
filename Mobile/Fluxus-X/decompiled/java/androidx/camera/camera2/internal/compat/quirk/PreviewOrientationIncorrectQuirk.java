package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class PreviewOrientationIncorrectQuirk implements g3 {
    public static boolean g(c0 c0Var) {
        Integer num = (Integer) c0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
