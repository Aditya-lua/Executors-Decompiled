package p001a0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: a0.r0 */
/* JADX INFO: loaded from: classes.dex */
public class C0038r0 extends C0036q0 {
    public C0038r0(Context context) {
        super(context);
    }

    @Override // p001a0.C0036q0, p001a0.C0042t0, p001a0.C0034p0.b
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo78c(String str) throws C0013f {
        try {
            return this.f82a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }

    @Override // p001a0.C0036q0, p001a0.C0042t0, p001a0.C0034p0.b
    /* JADX INFO: renamed from: e */
    public void mo80e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C0013f {
        try {
            this.f82a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }
}
