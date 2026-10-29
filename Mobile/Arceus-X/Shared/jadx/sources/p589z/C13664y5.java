package p589z;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001a0.C0008c0;

/* JADX INFO: renamed from: z.y5 */
/* JADX INFO: loaded from: classes.dex */
public final class C13664y5 {
    /* JADX INFO: renamed from: a */
    public static boolean m49814a(C0008c0 c0008c0) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) c0008c0.m9a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i10 : iArr) {
                if (i10 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
