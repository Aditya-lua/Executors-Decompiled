package p589z;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z.w2 */
/* JADX INFO: loaded from: classes.dex */
public final class C13647w2 {

    /* JADX INFO: renamed from: z.w2$a */
    public static final class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final List<CameraDevice.StateCallback> f47806a = new ArrayList();

        public a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f47806a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f47806a.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f47806a.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            Iterator<CameraDevice.StateCallback> it = this.f47806a.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, i10);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f47806a.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }
    }

    /* JADX INFO: renamed from: z.w2$b */
    public static final class b extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static CameraDevice.StateCallback m49733a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return m49734b();
        }
        return list.size() == 1 ? list.get(0) : new a(list);
    }

    /* JADX INFO: renamed from: b */
    public static CameraDevice.StateCallback m49734b() {
        return new b();
    }
}
