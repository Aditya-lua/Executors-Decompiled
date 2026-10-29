package androidx.camera.camera2.internal.compat.quirk;

import java.util.Iterator;
import p296n0.C8782k3;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends InterfaceC8758g3 {
    /* JADX INFO: renamed from: d */
    static boolean m2046d(C8782k3 c8782k3) {
        Iterator it = c8782k3.m35235c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).mo2035b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    default boolean mo2035b() {
        return true;
    }
}
