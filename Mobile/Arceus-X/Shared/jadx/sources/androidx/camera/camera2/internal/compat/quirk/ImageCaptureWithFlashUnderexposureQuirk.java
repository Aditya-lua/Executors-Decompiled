package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001a0.C0008c0;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureWithFlashUnderexposureQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1747a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    /* JADX INFO: renamed from: g */
    public static boolean m2108g(C0008c0 c0008c0) {
        return f1747a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
