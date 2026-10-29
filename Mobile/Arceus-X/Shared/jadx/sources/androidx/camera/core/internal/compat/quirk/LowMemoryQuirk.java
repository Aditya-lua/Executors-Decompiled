package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1819a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    /* JADX INFO: renamed from: g */
    public static boolean m2254g() {
        return f1819a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
