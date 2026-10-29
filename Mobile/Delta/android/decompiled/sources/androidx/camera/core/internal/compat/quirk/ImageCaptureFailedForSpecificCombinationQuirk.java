package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import g0.a2;
import g0.f1;
import g0.w2;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import n0.g3;
import n0.i4;
import n0.j4;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f1392a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean g() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return "google".equalsIgnoreCase(Build.BRAND) && f1392a.contains(Build.MODEL.toLowerCase());
    }

    public static boolean j() {
        return g() || h();
    }

    public final boolean i(Collection<w2> collection) {
        if (collection.size() != 3) {
            return false;
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (w2 w2Var : collection) {
            if (w2Var instanceof a2) {
                z10 = true;
            } else if (w2Var instanceof f1) {
                z12 = true;
            } else if (w2Var.l().a(i4.G)) {
                z11 = w2Var.l().X() == j4.b.VIDEO_CAPTURE;
            }
        }
        return z10 && z11 && z12;
    }

    public boolean k(String str, Collection<w2> collection) {
        if (g()) {
            return l(str, collection);
        }
        if (h()) {
            return m(str, collection);
        }
        return false;
    }

    public final boolean l(String str, Collection<w2> collection) {
        return str.equals("1") && i(collection);
    }

    public final boolean m(String str, Collection<w2> collection) {
        return str.equals("1") && i(collection);
    }
}
