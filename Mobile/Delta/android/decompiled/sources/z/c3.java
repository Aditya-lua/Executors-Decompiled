package z;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final class c3 extends n0.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f36459a;

    public c3(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f36459a = captureCallback;
    }

    public static c3 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new c3(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback f() {
        return this.f36459a;
    }
}
