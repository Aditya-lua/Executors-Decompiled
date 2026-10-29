package p001a0;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public class C0005b {
    /* JADX INFO: renamed from: a */
    public static void m5a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
