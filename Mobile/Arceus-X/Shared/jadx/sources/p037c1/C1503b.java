package p037c1;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: renamed from: c1.b */
/* JADX INFO: loaded from: classes.dex */
public class C1503b implements InterfaceC1505d {

    /* JADX INFO: renamed from: a */
    public final CameraDevice.CameraDeviceSetup f5779a;

    public C1503b(CameraManager cameraManager, String str) {
        this.f5779a = cameraManager.getCameraDeviceSetup(str);
    }

    /* JADX INFO: renamed from: b */
    public static long m7657b() {
        String property = System.getProperty("ro.build.date.utc");
        if (property == null) {
            return 0L;
        }
        try {
            return Long.parseLong(property) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // p037c1.InterfaceC1505d
    /* JADX INFO: renamed from: a */
    public InterfaceC1505d.a mo7656a(SessionConfiguration sessionConfiguration) {
        return new InterfaceC1505d.a(this.f5779a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2, 2, m7657b());
    }
}
