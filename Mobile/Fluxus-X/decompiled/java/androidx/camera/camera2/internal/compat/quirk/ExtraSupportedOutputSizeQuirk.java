package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements g3 {
    public static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean j() {
        return i();
    }

    public Size[] g(int i10) {
        return (i10 == 34 && i()) ? h() : new Size[0];
    }

    public final Size[] h() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }
}
