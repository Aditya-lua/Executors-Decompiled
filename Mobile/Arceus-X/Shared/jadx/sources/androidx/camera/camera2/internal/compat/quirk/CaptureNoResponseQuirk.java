package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001a0.C0008c0;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureNoResponseQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2047g(C0008c0 c0008c0) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
