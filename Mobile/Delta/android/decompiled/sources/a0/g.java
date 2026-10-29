package a0;

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

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14a;

    public interface a {
        CameraCaptureSession a();

        int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f15a;
        public final Executor b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.b = executor;
            this.f15a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.b.execute(new Runnable() { // from class: a0.m
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(this.f37a.f15a, cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: a0.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23a.f15a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.b.execute(new Runnable() { // from class: a0.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32a.f15a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.b.execute(new Runnable() { // from class: a0.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26a.f15a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.b.execute(new Runnable() { // from class: a0.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42a.f15a.onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.b.execute(new Runnable() { // from class: a0.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29a.f15a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.b.execute(new Runnable() { // from class: a0.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18a.f15a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f16a;
        public final Executor b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.b = executor;
            this.f16a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: a0.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45a.f16a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: a0.r
                @Override // java.lang.Runnable
                public final void run() {
                    d.a(this.f54a.f16a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: a0.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47a.f16a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: a0.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59a.f16a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: a0.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55a.f16a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: a0.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56a.f16a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.b.execute(new Runnable() { // from class: a0.q
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(this.f52a.f16a, cameraCaptureSession, surface);
                }
            });
        }
    }

    public g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14a = new v(cameraCaptureSession);
        } else {
            this.f14a = w.e(cameraCaptureSession, handler);
        }
    }

    public static g e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new g(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f14a.b(list, executor, captureCallback);
    }

    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f14a.c(list, executor, captureCallback);
    }

    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f14a.d(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession d() {
        return this.f14a.a();
    }
}
