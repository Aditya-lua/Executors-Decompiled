package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p140g0.AbstractC5952w2;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p296n0.InterfaceC8758g3;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1815a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    /* JADX INFO: renamed from: g */
    public static boolean m2231g() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2232h() {
        return "google".equalsIgnoreCase(Build.BRAND) && f1815a.contains(Build.MODEL.toLowerCase());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2233j() {
        return m2231g() || m2232h();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2234i(Collection<AbstractC5952w2> collection) {
        if (collection.size() != 3) {
            return false;
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            if (abstractC5952w2 instanceof C5864a2) {
                z10 = true;
            } else if (abstractC5952w2 instanceof C5883f1) {
                z12 = true;
            } else if (abstractC5952w2.m26707l().mo35023a(InterfaceC8771i4.f31902G)) {
                z11 = abstractC5952w2.m26707l().mo35207X() == InterfaceC8777j4.b.VIDEO_CAPTURE;
            }
        }
        return z10 && z11 && z12;
    }

    /* JADX INFO: renamed from: k */
    public boolean m2235k(String str, Collection<AbstractC5952w2> collection) {
        if (m2231g()) {
            return m2236l(str, collection);
        }
        if (m2232h()) {
            return m2237m(str, collection);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2236l(String str, Collection<AbstractC5952w2> collection) {
        return str.equals("1") && m2234i(collection);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2237m(String str, Collection<AbstractC5952w2> collection) {
        return str.equals("1") && m2234i(collection);
    }
}
