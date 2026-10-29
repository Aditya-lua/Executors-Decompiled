package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1334a = Arrays.asList("itel w6004");
    public static final List<String> b = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean g(c0 c0Var) {
        List<String> list = b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) c0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f1334a.contains(str.toLowerCase(locale));
    }
}
