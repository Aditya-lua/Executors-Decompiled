package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.os.Build;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements g3 {
    public static boolean g(c0 c0Var) {
        return h(c0Var);
    }

    public static boolean h(c0 c0Var) {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && c0Var.b().equals("1");
    }
}
