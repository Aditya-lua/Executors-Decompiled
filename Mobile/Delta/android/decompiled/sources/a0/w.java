package a0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class w implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f64a;
    public final Object b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f65a;

        public a(Handler handler) {
            this.f65a = handler;
        }
    }

    public w(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f64a = (CameraCaptureSession) x2.g.g(cameraCaptureSession);
        this.b = obj;
    }

    public static g.a e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new w(cameraCaptureSession, new a(handler));
    }

    @Override // a0.g.a
    public CameraCaptureSession a() {
        return this.f64a;
    }

    @Override // a0.g.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f64a.captureBurst(list, new g.b(executor, captureCallback), ((a) this.b).f65a);
    }

    @Override // a0.g.a
    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f64a.setRepeatingBurst(list, new g.b(executor, captureCallback), ((a) this.b).f65a);
    }

    @Override // a0.g.a
    public int d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f64a.setRepeatingRequest(captureRequest, new g.b(executor, captureCallback), ((a) this.b).f65a);
    }
}
