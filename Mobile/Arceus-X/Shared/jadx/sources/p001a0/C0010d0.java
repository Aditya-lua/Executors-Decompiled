package p001a0;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import p020b0.C1189o;

/* JADX INFO: renamed from: a0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0010d0 {

    /* JADX INFO: renamed from: a */
    public final a f5a;

    /* JADX INFO: renamed from: a0.d0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24a(C1189o c1189o);
    }

    /* JADX INFO: renamed from: a0.d0$b */
    public static final class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final CameraDevice.StateCallback f6a;

        /* JADX INFO: renamed from: b */
        public final Executor f7b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f7b = executor;
            this.f6a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f7b.execute(new Runnable() { // from class: a0.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8a.f6a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f7b.execute(new Runnable() { // from class: a0.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22a.f6a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f7b.execute(new Runnable() { // from class: a0.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14a.f6a.onError(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f7b.execute(new Runnable() { // from class: a0.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29a.f6a.onOpened(cameraDevice);
                }
            });
        }
    }

    public C0010d0(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5a = new C0024k0(cameraDevice);
        } else {
            this.f5a = C0022j0.m58e(cameraDevice, handler);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0010d0 m22b(CameraDevice cameraDevice, Handler handler) {
        return new C0010d0(cameraDevice, handler);
    }

    /* JADX INFO: renamed from: a */
    public void m23a(C1189o c1189o) {
        this.f5a.mo24a(c1189o);
    }
}
