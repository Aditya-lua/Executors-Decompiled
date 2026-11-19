package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureNoResponseQuirk implements g3 {
    public static boolean g(c0 c0Var) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) c0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
