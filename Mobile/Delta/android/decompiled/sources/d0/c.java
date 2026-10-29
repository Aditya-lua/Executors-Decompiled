package d0;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static boolean a(k3 k3Var) {
        return k3Var.a(LegacyCameraOutputConfigNullPointerQuirk.class) || k3Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
    }
}
