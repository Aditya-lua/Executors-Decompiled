package p001a0;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: a0.f */
/* JADX INFO: loaded from: classes.dex */
public class C0013f extends Exception {

    /* JADX INFO: renamed from: c */
    public static final Set<Integer> f10c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: d */
    public static final Set<Integer> f11d = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* JADX INFO: renamed from: a */
    public final int f12a;

    /* JADX INFO: renamed from: b */
    public final CameraAccessException f13b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0013f(int i10, String str, Throwable th2) {
        super(m30a(i10, str), th2);
        this.f12a = i10;
        this.f13b = f10c.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str, th2) : null;
    }

    /* JADX INFO: renamed from: a */
    public static String m30a(int i10, String str) {
        return String.format("%s (%d): %s", m32c(i10), Integer.valueOf(i10), str);
    }

    /* JADX INFO: renamed from: b */
    public static String m31b(int i10) {
        if (i10 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i10 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i10 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i10 == 4) {
            return "The camera device is in use already";
        }
        if (i10 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i10 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i10 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    /* JADX INFO: renamed from: c */
    public static String m32c(int i10) {
        if (i10 == 1) {
            return "CAMERA_DISABLED";
        }
        if (i10 == 2) {
            return "CAMERA_DISCONNECTED";
        }
        if (i10 == 3) {
            return "CAMERA_ERROR";
        }
        if (i10 == 4) {
            return "CAMERA_IN_USE";
        }
        if (i10 == 5) {
            return "MAX_CAMERAS_IN_USE";
        }
        if (i10 == 1000) {
            return "CAMERA_DEPRECATED_HAL";
        }
        if (i10 != 10001) {
            return i10 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR";
        }
        return "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
    }

    /* JADX INFO: renamed from: e */
    public static C0013f m33e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C0013f(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    /* JADX INFO: renamed from: d */
    public final int m34d() {
        return this.f12a;
    }

    public C0013f(int i10, Throwable th2) {
        super(m31b(i10), th2);
        this.f12a = i10;
        this.f13b = f10c.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, null, th2) : null;
    }

    public C0013f(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f12a = cameraAccessException.getReason();
        this.f13b = cameraAccessException;
    }
}
