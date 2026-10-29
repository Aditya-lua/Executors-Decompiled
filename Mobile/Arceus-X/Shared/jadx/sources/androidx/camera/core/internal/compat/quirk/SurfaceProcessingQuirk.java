package androidx.camera.core.internal.compat.quirk;

import java.util.Iterator;
import p296n0.C8782k3;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends InterfaceC8758g3 {
    /* JADX INFO: renamed from: e */
    static boolean m2260e(C8782k3 c8782k3) {
        Iterator it = c8782k3.m35235c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).mo2104f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    default boolean mo2104f() {
        return true;
    }
}
