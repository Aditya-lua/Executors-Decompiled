package p063d0;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import p140g0.C5931r1;
import p296n0.C8782k3;

/* JADX INFO: renamed from: d0.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C4369a0 {

    /* JADX INFO: renamed from: a */
    public final TorchFlashRequiredFor3aUpdateQuirk f18224a;

    public C4369a0(C8782k3 c8782k3) {
        this.f18224a = (TorchFlashRequiredFor3aUpdateQuirk) c8782k3.m35234b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    /* JADX INFO: renamed from: a */
    public boolean m22024a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f18224a;
        boolean z10 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.m2156j();
        C5931r1.m26561a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z10);
        return z10;
    }
}
