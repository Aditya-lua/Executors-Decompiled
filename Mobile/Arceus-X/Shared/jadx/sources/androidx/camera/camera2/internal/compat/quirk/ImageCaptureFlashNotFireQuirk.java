package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001a0.C0008c0;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1743a = Arrays.asList("itel w6004");

    /* JADX INFO: renamed from: b */
    public static final List<String> f1744b = Arrays.asList("sm-j700f", "sm-j710f");

    /* JADX INFO: renamed from: g */
    public static boolean m2105g(C0008c0 c0008c0) {
        List<String> list = f1744b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f1743a.contains(str.toLowerCase(locale));
    }
}
