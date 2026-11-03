package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceUtil {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1234a = 0;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1235c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f1234a = iArrNativeGetSurfaceInfo[0];
        aVar.b = iArrNativeGetSurfaceInfo[1];
        aVar.f1235c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
