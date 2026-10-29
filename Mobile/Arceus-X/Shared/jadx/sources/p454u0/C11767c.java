package p454u0;

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
import p296n0.C8764h3;
import p296n0.InterfaceC8758g3;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: loaded from: classes.dex */
public class C11767c {
    /* JADX INFO: renamed from: a */
    public static List<InterfaceC8758g3> m44048a(C8764h3 c8764h3) {
        ArrayList arrayList = new ArrayList();
        if (c8764h3.m35147a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.m2242l())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (c8764h3.m35147a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.m2259g())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (c8764h3.m35147a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.m2229h())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (c8764h3.m35147a(LowMemoryQuirk.class, LowMemoryQuirk.m2254g())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (c8764h3.m35147a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.m2252j())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (c8764h3.m35147a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.m2245k())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        if (c8764h3.m35147a(ImageCaptureFailedForSpecificCombinationQuirk.class, ImageCaptureFailedForSpecificCombinationQuirk.m2233j())) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (c8764h3.m35147a(PreviewGreenTintQuirk.class, PreviewGreenTintQuirk.m2255h())) {
            arrayList.add(PreviewGreenTintQuirk.f1820a);
        }
        return arrayList;
    }
}
