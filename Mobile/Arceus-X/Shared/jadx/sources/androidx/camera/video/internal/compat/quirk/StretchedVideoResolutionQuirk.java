package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: h */
    private static boolean m2337h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2338i() {
        return m2337h();
    }

    /* JADX INFO: renamed from: g */
    public Size m2339g(int i10) {
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
