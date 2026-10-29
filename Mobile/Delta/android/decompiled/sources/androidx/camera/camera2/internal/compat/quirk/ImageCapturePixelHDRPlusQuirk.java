package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1335a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean g() {
        return f1335a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
