package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f1395a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean g() {
        return f1395a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
