package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class Preview3AThreadCrashQuirk implements g3 {
    public static boolean g() {
        return "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE);
    }
}
