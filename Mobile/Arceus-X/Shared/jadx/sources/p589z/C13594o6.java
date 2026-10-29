package p589z;

import android.hardware.camera2.CameraCharacteristics;
import p001a0.C0008c0;

/* JADX INFO: renamed from: z.o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C13594o6 {
    /* JADX INFO: renamed from: a */
    public static boolean m49565a(C0008c0 c0008c0, int i10) {
        int[] iArr = (int[]) c0008c0.m9a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}
