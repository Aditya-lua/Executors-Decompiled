package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class AudioEncoderIgnoresInputTimestampQuirk implements g3 {
    public static boolean g() {
        return "Sony".equalsIgnoreCase(Build.BRAND) && "G3125".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return g();
    }
}
