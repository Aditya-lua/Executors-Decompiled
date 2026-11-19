package androidx.camera.core.internal.compat.quirk;

import java.util.Iterator;
import n0.g3;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends g3 {
    static boolean e(k3 k3Var) {
        Iterator it = k3Var.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).f()) {
                return true;
            }
        }
        return false;
    }

    default boolean f() {
        return true;
    }
}
