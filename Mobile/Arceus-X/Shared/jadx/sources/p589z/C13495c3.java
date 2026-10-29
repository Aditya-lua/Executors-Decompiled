package p589z;

import android.hardware.camera2.CameraCaptureSession;
import p296n0.AbstractC8828u;

/* JADX INFO: renamed from: z.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class C13495c3 extends AbstractC8828u {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession.CaptureCallback f47234a;

    public C13495c3(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f47234a = captureCallback;
    }

    /* JADX INFO: renamed from: e */
    public static C13495c3 m49188e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C13495c3(captureCallback);
    }

    /* JADX INFO: renamed from: f */
    public CameraCaptureSession.CaptureCallback m49189f() {
        return this.f47234a;
    }
}
