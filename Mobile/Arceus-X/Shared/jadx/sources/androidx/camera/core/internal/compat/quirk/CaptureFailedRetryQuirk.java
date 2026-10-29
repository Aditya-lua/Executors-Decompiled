package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<Pair<String, String>> f1814a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    /* JADX INFO: renamed from: h */
    public static boolean m2229h() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f1814a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    /* JADX INFO: renamed from: g */
    public int m2230g() {
        return 1;
    }
}
