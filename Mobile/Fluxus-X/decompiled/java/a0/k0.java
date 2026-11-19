package a0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends j0 {
    public k0(CameraDevice cameraDevice) {
        super((CameraDevice) x2.g.g(cameraDevice), null);
    }

    @Override // a0.j0, a0.d0.a
    public void a(b0.o oVar) throws f {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) oVar.j();
        x2.g.g(sessionConfiguration);
        try {
            this.f35a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
