package a0;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
