package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1754a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* JADX INFO: renamed from: g */
    public static boolean m2134g() {
        return "Google".equals(Build.MANUFACTURER) && f1754a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
