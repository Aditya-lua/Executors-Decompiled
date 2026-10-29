package p589z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ne.InterfaceFutureC9440x;
import p001a0.C0015g;
import p020b0.C1183i;
import p020b0.C1189o;
import p296n0.AbstractC8830u1;
import p296n0.C8782k3;

/* JADX INFO: renamed from: z.h5 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC13537h5 {

    /* JADX INFO: renamed from: z.h5$a */
    public interface a {
        Executor getExecutor();

        /* JADX INFO: renamed from: h */
        InterfaceFutureC9440x<Void> mo49421h(CameraDevice cameraDevice, C1189o c1189o, List<AbstractC8830u1> list);

        /* JADX INFO: renamed from: j */
        InterfaceFutureC9440x<List<Surface>> mo49422j(List<AbstractC8830u1> list, long j10);

        /* JADX INFO: renamed from: k */
        C1189o mo49423k(int i10, List<C1183i> list, c cVar);

        boolean stop();
    }

    /* JADX INFO: renamed from: z.h5$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Executor f47430a;

        /* JADX INFO: renamed from: b */
        public final ScheduledExecutorService f47431b;

        /* JADX INFO: renamed from: c */
        public final Handler f47432c;

        /* JADX INFO: renamed from: d */
        public final C13591o3 f47433d;

        /* JADX INFO: renamed from: e */
        public final C8782k3 f47434e;

        /* JADX INFO: renamed from: f */
        public final C8782k3 f47435f;

        public b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C13591o3 c13591o3, C8782k3 c8782k3, C8782k3 c8782k4) {
            this.f47430a = executor;
            this.f47431b = scheduledExecutorService;
            this.f47432c = handler;
            this.f47433d = c13591o3;
            this.f47434e = c8782k3;
            this.f47435f = c8782k4;
        }

        /* JADX INFO: renamed from: a */
        public a m49424a() {
            return new C13615r5(this.f47434e, this.f47435f, this.f47433d, this.f47430a, this.f47431b, this.f47432c);
        }
    }

    /* JADX INFO: renamed from: z.h5$c */
    public static abstract class c {
        /* JADX INFO: renamed from: p */
        public void mo49425p(InterfaceC13537h5 interfaceC13537h5) {
        }

        /* JADX INFO: renamed from: q */
        public void mo49426q(InterfaceC13537h5 interfaceC13537h5) {
        }

        /* JADX INFO: renamed from: r */
        public void mo49427r(InterfaceC13537h5 interfaceC13537h5) {
        }

        /* JADX INFO: renamed from: s */
        public void mo49428s(InterfaceC13537h5 interfaceC13537h5) {
        }

        /* JADX INFO: renamed from: t */
        public void mo49429t(InterfaceC13537h5 interfaceC13537h5) {
        }

        /* JADX INFO: renamed from: u */
        public void mo49430u(InterfaceC13537h5 interfaceC13537h5) {
        }

        /* JADX INFO: renamed from: v */
        public void mo49431v(InterfaceC13537h5 interfaceC13537h5) {
        }

        /* JADX INFO: renamed from: w */
        public void mo49432w(InterfaceC13537h5 interfaceC13537h5, Surface surface) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo49409a();

    /* JADX INFO: renamed from: b */
    c mo49410b();

    /* JADX INFO: renamed from: c */
    void mo49411c();

    void close();

    /* JADX INFO: renamed from: d */
    void mo49412d(int i10);

    /* JADX INFO: renamed from: e */
    void mo49413e();

    /* JADX INFO: renamed from: f */
    CameraDevice mo49414f();

    /* JADX INFO: renamed from: g */
    int mo49415g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    /* JADX INFO: renamed from: i */
    List<CaptureRequest> mo49416i(CaptureRequest captureRequest);

    /* JADX INFO: renamed from: l */
    int mo49417l(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    /* JADX INFO: renamed from: m */
    int mo49418m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    /* JADX INFO: renamed from: n */
    C0015g mo49419n();

    /* JADX INFO: renamed from: o */
    InterfaceFutureC9440x<Void> mo49420o();
}
