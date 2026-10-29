package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements g3 {
    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean i() {
        return h();
    }

    public Size g(int i10) {
        if (i10 == 4) {
            return new Size(640, 480);
        }
        if (i10 == 5) {
            return new Size(960, 720);
        }
        if (i10 != 6) {
            return null;
        }
        return new Size(1440, 1080);
    }
}
