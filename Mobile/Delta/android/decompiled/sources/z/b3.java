package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.u f36444a;

    public b3(n0.u uVar) {
        if (uVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f36444a = uVar;
    }

    public final int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof n0.z3) && (num = (Integer) ((n0.z3) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        n0.z3 z3VarB;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            x2.g.b(tag instanceof n0.z3, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            z3VarB = (n0.z3) tag;
        } else {
            z3VarB = n0.z3.b();
        }
        this.f36444a.b(a(captureRequest), new h(z3VarB, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f36444a.c(a(captureRequest), new n0.w(n0.w.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        this.f36444a.d(a(captureRequest));
    }
}
