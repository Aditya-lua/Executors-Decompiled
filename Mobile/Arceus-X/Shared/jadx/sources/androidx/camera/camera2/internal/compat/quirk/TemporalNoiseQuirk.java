package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001a0.C0008c0;

/* JADX INFO: loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    /* JADX INFO: renamed from: g */
    public static boolean m2148g() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2149h(C0008c0 c0008c0) {
        return m2148g() && ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
