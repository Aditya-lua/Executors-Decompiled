package p001a0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: a0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0015g {

    /* JADX INFO: renamed from: a */
    public final a f17a;

    /* JADX INFO: renamed from: a0.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        CameraCaptureSession mo40a();

        /* JADX INFO: renamed from: b */
        int mo41b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        /* JADX INFO: renamed from: c */
        int mo42c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        /* JADX INFO: renamed from: d */
        int mo43d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* JADX INFO: renamed from: a0.g$b */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.CaptureCallback f18a;

        /* JADX INFO: renamed from: b */
        public final Executor f19b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f19b = executor;
            this.f18a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f19b.execute(new Runnable() { // from class: a0.m
                @Override // java.lang.Runnable
                public final void run() {
                    C0007c.m7a(this.f50a.f18a, cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f19b.execute(new Runnable() { // from class: a0.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31a.f18a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f19b.execute(new Runnable() { // from class: a0.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43a.f18a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f19b.execute(new Runnable() { // from class: a0.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35a.f18a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f19b.execute(new Runnable() { // from class: a0.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57a.f18a.onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f19b.execute(new Runnable() { // from class: a0.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39a.f18a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f19b.execute(new Runnable() { // from class: a0.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24a.f18a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0.g$c */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.StateCallback f20a;

        /* JADX INFO: renamed from: b */
        public final Executor f21b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f21b = executor;
            this.f20a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f21b.execute(new Runnable() { // from class: a0.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61a.f20a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f21b.execute(new Runnable() { // from class: a0.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0009d.m21a(this.f76a.f20a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f21b.execute(new Runnable() { // from class: a0.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65a.f20a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f21b.execute(new Runnable() { // from class: a0.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86a.f20a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f21b.execute(new Runnable() { // from class: a0.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78a.f20a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f21b.execute(new Runnable() { // from class: a0.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80a.f20a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f21b.execute(new Runnable() { // from class: a0.q
                @Override // java.lang.Runnable
                public final void run() {
                    C0005b.m5a(this.f73a.f20a, cameraCaptureSession, surface);
                }
            });
        }
    }

    public C0015g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17a = new C0045v(cameraCaptureSession);
        } else {
            this.f17a = C0047w.m105e(cameraCaptureSession, handler);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0015g m35e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C0015g(cameraCaptureSession, handler);
    }

    /* JADX INFO: renamed from: a */
    public int m36a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f17a.mo41b(list, executor, captureCallback);
    }

    /* JADX INFO: renamed from: b */
    public int m37b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f17a.mo42c(list, executor, captureCallback);
    }

    /* JADX INFO: renamed from: c */
    public int m38c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f17a.mo43d(captureRequest, executor, captureCallback);
    }

    /* JADX INFO: renamed from: d */
    public CameraCaptureSession m39d() {
        return this.f17a.mo40a();
    }
}
