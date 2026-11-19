package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class SignalEosOutputBufferNotComeQuirk implements g3 {
    private static boolean g() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return g();
    }
}
