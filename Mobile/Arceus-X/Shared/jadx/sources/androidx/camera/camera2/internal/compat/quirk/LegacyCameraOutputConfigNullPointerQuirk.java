package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import p001a0.C0008c0;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class LegacyCameraOutputConfigNullPointerQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2126g(C0008c0 c0008c0) {
        Integer num = (Integer) c0008c0.m9a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
