package a0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class v extends w {
    public v(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // a0.w, a0.g.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f64a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // a0.w, a0.g.a
    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f64a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // a0.w, a0.g.a
    public int d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f64a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
