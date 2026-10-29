package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1343a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean g() {
        return "Google".equals(Build.MANUFACTURER) && f1343a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
