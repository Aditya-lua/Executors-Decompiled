package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class StillCaptureFlashStopRepeatingQuirk implements g3 {
    public static boolean g() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
