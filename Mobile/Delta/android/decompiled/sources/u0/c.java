package u0;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.List;
import n0.g3;
import n0.h3;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static List<g3> a(h3 h3Var) {
        ArrayList arrayList = new ArrayList();
        if (h3Var.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.l())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (h3Var.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.g())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (h3Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.h())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (h3Var.a(LowMemoryQuirk.class, LowMemoryQuirk.g())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (h3Var.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.j())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (h3Var.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.k())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        if (h3Var.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ImageCaptureFailedForSpecificCombinationQuirk.j())) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (h3Var.a(PreviewGreenTintQuirk.class, PreviewGreenTintQuirk.h())) {
            arrayList.add(PreviewGreenTintQuirk.f1396a);
        }
        return arrayList;
    }
}
