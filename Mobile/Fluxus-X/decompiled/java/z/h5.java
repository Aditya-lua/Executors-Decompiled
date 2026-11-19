package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface h5 {

    public interface a {
        Executor getExecutor();

        pe.x<Void> h(CameraDevice cameraDevice, b0.o oVar, List<n0.u1> list);

        pe.x<List<Surface>> j(List<n0.u1> list, long j10);

        b0.o k(int i10, List<b0.i> list, c cVar);

        boolean stop();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f38417a;
        public final ScheduledExecutorService b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f38418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o3 f38419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n0.k3 f38420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final n0.k3 f38421f;

        public b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, o3 o3Var, n0.k3 k3Var, n0.k3 k3Var2) {
            this.f38417a = executor;
            this.b = scheduledExecutorService;
            this.f38418c = handler;
            this.f38419d = o3Var;
            this.f38420e = k3Var;
            this.f38421f = k3Var2;
        }

        public a a() {
            return new r5(this.f38420e, this.f38421f, this.f38419d, this.f38417a, this.b, this.f38418c);
        }
    }

    public static abstract class c {
        public void p(h5 h5Var) {
        }

        public void q(h5 h5Var) {
        }

        public void r(h5 h5Var) {
        }

        public void s(h5 h5Var) {
        }

        public void t(h5 h5Var) {
        }

        public void u(h5 h5Var) {
        }

        public void v(h5 h5Var) {
        }

        public void w(h5 h5Var, Surface surface) {
        }
    }

    void a();

    c b();

    void c();

    void close();

    void d(int i10);

    void e();

    CameraDevice f();

    int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    List<CaptureRequest> i(CaptureRequest captureRequest);

    int l(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    int m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    a0.g n();

    pe.x<Void> o();
}
