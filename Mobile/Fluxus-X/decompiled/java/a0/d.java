package a0;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
