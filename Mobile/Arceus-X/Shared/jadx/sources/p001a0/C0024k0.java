package p001a0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import p020b0.C1189o;
import p533x2.C12637g;

/* JADX INFO: renamed from: a0.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0024k0 extends C0022j0 {
    public C0024k0(CameraDevice cameraDevice) {
        super((CameraDevice) C12637g.m47075g(cameraDevice), null);
    }

    @Override // p001a0.C0022j0, p001a0.C0010d0.a
    /* JADX INFO: renamed from: a */
    public void mo24a(C1189o c1189o) throws C0013f {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) c1189o.m6586j();
        C12637g.m47075g(sessionConfiguration);
        try {
            this.f47a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }
}
