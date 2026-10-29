package p001a0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import p020b0.C1182h;
import p020b0.C1183i;
import p020b0.C1189o;
import p533x2.C12637g;

/* JADX INFO: renamed from: a0.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C0022j0 extends C0020i0 {
    public C0022j0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* JADX INFO: renamed from: e */
    public static C0022j0 m58e(CameraDevice cameraDevice, Handler handler) {
        return new C0022j0(cameraDevice, new C0026l0.a(handler));
    }

    @Override // p001a0.C0010d0.a
    /* JADX INFO: renamed from: a */
    public void mo24a(C1189o c1189o) throws C0013f {
        C0026l0.m60c(this.f47a, c1189o);
        C0015g.c cVar = new C0015g.c(c1189o.m6579a(), c1189o.m6583e());
        List<C1183i> listM6581c = c1189o.m6581c();
        Handler handler = ((C0026l0.a) C12637g.m47075g((C0026l0.a) this.f48b)).f49a;
        C1182h c1182hM6580b = c1189o.m6580b();
        try {
            if (c1182hM6580b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) c1182hM6580b.m6554a();
                C12637g.m47075g(inputConfiguration);
                this.f47a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C1189o.m6577h(listM6581c), cVar, handler);
            } else if (c1189o.m6582d() == 1) {
                this.f47a.createConstrainedHighSpeedCaptureSession(C0026l0.m61d(listM6581c), cVar, handler);
            } else {
                this.f47a.createCaptureSessionByOutputConfigurations(C1189o.m6577h(listM6581c), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }
}
