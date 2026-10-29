package a0;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6a;

    public interface a {
        void a(b0.o oVar);
    }

    public static final class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraDevice.StateCallback f7a;
        public final Executor b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.b = executor;
            this.f7a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: a0.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8a.f7a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: a0.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17a.f7a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.b.execute(new Runnable() { // from class: a0.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12a.f7a.onError(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: a0.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22a.f7a.onOpened(cameraDevice);
                }
            });
        }
    }

    public d0(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6a = new k0(cameraDevice);
        } else {
            this.f6a = j0.e(cameraDevice, handler);
        }
    }

    public static d0 b(CameraDevice cameraDevice, Handler handler) {
        return new d0(cameraDevice, handler);
    }

    public void a(b0.o oVar) {
        this.f6a.a(oVar);
    }
}
