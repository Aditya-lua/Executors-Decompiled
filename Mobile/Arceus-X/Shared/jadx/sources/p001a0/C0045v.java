package p001a0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: a0.v */
/* JADX INFO: loaded from: classes.dex */
public class C0045v extends C0047w {
    public C0045v(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p001a0.C0047w, p001a0.C0015g.a
    /* JADX INFO: renamed from: b */
    public int mo41b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f93a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // p001a0.C0047w, p001a0.C0015g.a
    /* JADX INFO: renamed from: c */
    public int mo42c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f93a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // p001a0.C0047w, p001a0.C0015g.a
    /* JADX INFO: renamed from: d */
    public int mo43d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f93a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
