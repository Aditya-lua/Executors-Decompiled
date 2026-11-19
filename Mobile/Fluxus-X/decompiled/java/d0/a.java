package d0;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11610a;
    public final boolean b;

    public a(k3 k3Var) {
        this.f11610a = k3Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.b = c0.e.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i10) {
        if ((this.f11610a || this.b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
