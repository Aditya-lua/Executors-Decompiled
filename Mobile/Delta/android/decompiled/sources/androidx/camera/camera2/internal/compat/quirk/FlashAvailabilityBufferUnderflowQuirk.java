package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Pair<String, String>> f1330a = new HashSet();

    static {
        g("sprd", "lemp");
        g("sprd", "DM20C");
    }

    public static void g(String str, String str2) {
        Set<Pair<String, String>> set = f1330a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    public static boolean h() {
        Set<Pair<String, String>> set = f1330a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
