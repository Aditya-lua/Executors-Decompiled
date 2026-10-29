package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class MediaStoreVideoCannotWrite implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2312g() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2313h() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2314i() {
        return m2313h() || m2312g();
    }
}
