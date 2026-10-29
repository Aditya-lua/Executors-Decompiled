package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p001a0.C0008c0;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2051g(C0008c0 c0008c0) {
        return m2052h(c0008c0);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2052h(C0008c0 c0008c0) {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && c0008c0.m10b().equals("1");
    }
}
