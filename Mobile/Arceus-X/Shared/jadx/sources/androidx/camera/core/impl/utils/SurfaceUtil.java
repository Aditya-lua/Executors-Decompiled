package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceUtil {

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.SurfaceUtil$a */
    public static class C0497a {

        /* JADX INFO: renamed from: a */
        public int f1811a = 0;

        /* JADX INFO: renamed from: b */
        public int f1812b = 0;

        /* JADX INFO: renamed from: c */
        public int f1813c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    /* JADX INFO: renamed from: a */
    public static C0497a m2228a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        C0497a c0497a = new C0497a();
        c0497a.f1811a = iArrNativeGetSurfaceInfo[0];
        c0497a.f1812b = iArrNativeGetSurfaceInfo[1];
        c0497a.f1813c = iArrNativeGetSurfaceInfo[2];
        return c0497a;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
