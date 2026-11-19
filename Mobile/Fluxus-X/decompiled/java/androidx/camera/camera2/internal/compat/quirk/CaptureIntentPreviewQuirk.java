package androidx.camera.camera2.internal.compat.quirk;

import java.util.Iterator;
import n0.g3;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends g3 {
    static boolean d(k3 k3Var) {
        Iterator it = k3Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
