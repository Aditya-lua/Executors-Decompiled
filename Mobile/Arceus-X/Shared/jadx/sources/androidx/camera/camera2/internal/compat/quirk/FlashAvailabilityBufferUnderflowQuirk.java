package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<Pair<String, String>> f1739a = new HashSet();

    static {
        m2088g("sprd", "lemp");
        m2088g("sprd", "DM20C");
    }

    /* JADX INFO: renamed from: g */
    public static void m2088g(String str, String str2) {
        Set<Pair<String, String>> set = f1739a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2089h() {
        Set<Pair<String, String>> set = f1739a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
