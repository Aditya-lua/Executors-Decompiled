package v0;

import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import n0.l1;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) u0.b.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.k(l1.f24728i);
    }

    public boolean b(androidx.camera.core.d dVar) {
        return a() && w0.b.j(dVar.getFormat());
    }
}
