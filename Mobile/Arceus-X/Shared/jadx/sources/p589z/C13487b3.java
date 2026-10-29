package p589z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import p296n0.AbstractC8828u;
import p296n0.C8838w;
import p296n0.C8857z3;
import p533x2.C12637g;

/* JADX INFO: renamed from: z.b3 */
/* JADX INFO: loaded from: classes.dex */
public final class C13487b3 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    public final AbstractC8828u f47214a;

    public C13487b3(AbstractC8828u abstractC8828u) {
        if (abstractC8828u == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f47214a = abstractC8828u;
    }

    /* JADX INFO: renamed from: a */
    public final int m49171a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof C8857z3) && (num = (Integer) ((C8857z3) captureRequest.getTag()).m35564d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C8857z3 c8857z3M35562b;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C12637g.m47070b(tag instanceof C8857z3, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            c8857z3M35562b = (C8857z3) tag;
        } else {
            c8857z3M35562b = C8857z3.m35562b();
        }
        this.f47214a.mo2221b(m49171a(captureRequest), new C13531h(c8857z3M35562b, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f47214a.mo35426c(m49171a(captureRequest), new C8838w(C8838w.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        this.f47214a.mo33844d(m49171a(captureRequest));
    }
}
