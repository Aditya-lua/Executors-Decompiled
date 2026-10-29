package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Pair<String, String>> f1391a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    public static boolean h() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f1391a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int g() {
        return 1;
    }
}
