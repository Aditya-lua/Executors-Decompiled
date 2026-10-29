package p001a0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import p533x2.C12637g;

/* JADX INFO: renamed from: a0.w */
/* JADX INFO: loaded from: classes.dex */
public class C0047w implements C0015g.a {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession f93a;

    /* JADX INFO: renamed from: b */
    public final Object f94b;

    /* JADX INFO: renamed from: a0.w$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Handler f95a;

        public a(Handler handler) {
            this.f95a = handler;
        }
    }

    public C0047w(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f93a = (CameraCaptureSession) C12637g.m47075g(cameraCaptureSession);
        this.f94b = obj;
    }

    /* JADX INFO: renamed from: e */
    public static C0015g.a m105e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C0047w(cameraCaptureSession, new a(handler));
    }

    @Override // p001a0.C0015g.a
    /* JADX INFO: renamed from: a */
    public CameraCaptureSession mo40a() {
        return this.f93a;
    }

    @Override // p001a0.C0015g.a
    /* JADX INFO: renamed from: b */
    public int mo41b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f93a.captureBurst(list, new C0015g.b(executor, captureCallback), ((a) this.f94b).f95a);
    }

    @Override // p001a0.C0015g.a
    /* JADX INFO: renamed from: c */
    public int mo42c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f93a.setRepeatingBurst(list, new C0015g.b(executor, captureCallback), ((a) this.f94b).f95a);
    }

    @Override // p001a0.C0015g.a
    /* JADX INFO: renamed from: d */
    public int mo43d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f93a.setRepeatingRequest(captureRequest, new C0015g.b(executor, captureCallback), ((a) this.f94b).f95a);
    }
}
