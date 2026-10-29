package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1745a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* JADX INFO: renamed from: g */
    public static boolean m2106g() {
        return f1745a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
