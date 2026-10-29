package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001a0.C0008c0;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1741a = Arrays.asList("sm-j700f", "sm-j710f");

    /* JADX INFO: renamed from: g */
    public static boolean m2092g(C0008c0 c0008c0) {
        return f1741a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
