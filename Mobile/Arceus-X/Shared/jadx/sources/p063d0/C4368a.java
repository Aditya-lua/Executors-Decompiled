package p063d0;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import p036c0.C1500e;
import p296n0.C8782k3;

/* JADX INFO: renamed from: d0.a */
/* JADX INFO: loaded from: classes.dex */
public class C4368a {

    /* JADX INFO: renamed from: a */
    public final boolean f18222a;

    /* JADX INFO: renamed from: b */
    public final boolean f18223b;

    public C4368a(C8782k3 c8782k3) {
        this.f18222a = c8782k3.m35233a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f18223b = C1500e.m7653b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    /* JADX INFO: renamed from: a */
    public int m22023a(int i10) {
        if ((this.f18222a || this.f18223b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
