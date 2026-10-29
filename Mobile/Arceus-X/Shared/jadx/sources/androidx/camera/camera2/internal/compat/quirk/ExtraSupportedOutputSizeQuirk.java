package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: i */
    public static boolean m2076i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2077j() {
        return m2076i();
    }

    /* JADX INFO: renamed from: g */
    public Size[] m2078g(int i10) {
        return (i10 == 34 && m2076i()) ? m2079h() : new Size[0];
    }

    /* JADX INFO: renamed from: h */
    public final Size[] m2079h() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }
}
