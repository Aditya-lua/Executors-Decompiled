package p589z;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001a0.C0013f;
import p001a0.C0034p0;
import p140g0.C5923p1;

/* JADX INFO: renamed from: z.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C13654x2 {
    /* JADX INFO: renamed from: a */
    public static boolean m49735a(C0034p0 c0034p0, String str) throws C5923p1 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c0034p0.m64c(str).m9a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C0013f e10) {
            throw new C5923p1(C13479a3.m49169a(e10));
        }
    }
}
