package a0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends q0 {
    public r0(Context context) {
        super(context);
    }

    @Override // a0.q0, a0.t0, a0.p0.b
    public CameraCharacteristics c(String str) throws f {
        try {
            return this.f57a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }

    @Override // a0.q0, a0.t0, a0.p0.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws f {
        try {
            this.f57a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
