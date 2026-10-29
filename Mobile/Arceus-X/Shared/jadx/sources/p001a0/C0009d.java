package p001a0;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: loaded from: classes.dex */
public class C0009d {
    /* JADX INFO: renamed from: a */
    public static void m21a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
