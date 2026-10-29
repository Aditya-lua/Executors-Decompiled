package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class SignalEosOutputBufferNotComeQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    private static boolean m2328g() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2329h() {
        return m2328g();
    }
}
