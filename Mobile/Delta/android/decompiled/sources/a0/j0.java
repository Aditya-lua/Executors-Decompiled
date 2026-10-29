package a0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends i0 {
    public j0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static j0 e(CameraDevice cameraDevice, Handler handler) {
        return new j0(cameraDevice, new l0.a(handler));
    }

    @Override // a0.d0.a
    public void a(b0.o oVar) throws f {
        l0.c(this.f35a, oVar);
        g.c cVar = new g.c(oVar.a(), oVar.e());
        List<b0.i> listC = oVar.c();
        Handler handler = ((l0.a) x2.g.g((l0.a) this.b)).f36a;
        b0.h hVarB = oVar.b();
        try {
            if (hVarB != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) hVarB.a();
                x2.g.g(inputConfiguration);
                this.f35a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, b0.o.h(listC), cVar, handler);
            } else if (oVar.d() == 1) {
                this.f35a.createConstrainedHighSpeedCaptureSession(l0.d(listC), cVar, handler);
            } else {
                this.f35a.createCaptureSessionByOutputConfigurations(b0.o.h(listC), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
