package p063d0;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import p036c0.C1500e;
import p561y.C12964a;

/* JADX INFO: renamed from: d0.j */
/* JADX INFO: loaded from: classes.dex */
public class C4379j {
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public void m22040a(int i10, C12964a.a aVar) {
        if (((ImageCapturePixelHDRPlusQuirk) C1500e.m7653b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i10 == 0) {
            aVar.m48221f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i10 != 1) {
                return;
            }
            aVar.m48221f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
