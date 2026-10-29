package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class AudioEncoderIgnoresInputTimestampQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2261g() {
        return "Sony".equalsIgnoreCase(Build.BRAND) && "G3125".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2262h() {
        return m2261g();
    }
}
