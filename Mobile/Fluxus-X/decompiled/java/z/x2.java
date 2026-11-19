package z;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {
    public static boolean a(a0.p0 p0Var, String str) throws g0.p1 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) p0Var.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (a0.f e10) {
            throw new g0.p1(a3.a(e10));
        }
    }
}
