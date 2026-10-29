package c1;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice.CameraDeviceSetup f4316a;

    public b(CameraManager cameraManager, String str) {
        this.f4316a = cameraManager.getCameraDeviceSetup(str);
    }

    public static long b() {
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

    @Override // c1.d
    public d.a a(SessionConfiguration sessionConfiguration) {
        return new d.a(this.f4316a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2, 2, b());
    }
}
