package p480v0;

import androidx.camera.core.InterfaceC0494d;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import p296n0.C8785l1;
import p454u0.C11766b;
import p503w0.C12272b;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: loaded from: classes.dex */
public class C11987b {
    /* JADX INFO: renamed from: a */
    public boolean m44739a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) C11766b.m44046b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.m2243k(C8785l1.f31943i);
    }

    /* JADX INFO: renamed from: b */
    public boolean m44740b(InterfaceC0494d interfaceC0494d) {
        return m44739a() && C12272b.m45561j(interfaceC0494d.getFormat());
    }
}
