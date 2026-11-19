package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements g3 {
    public static boolean g() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 29;
    }
}
