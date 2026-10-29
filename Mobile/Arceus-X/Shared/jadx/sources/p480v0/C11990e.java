package p480v0;

import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import java.util.Collection;
import p140g0.AbstractC5952w2;
import p454u0.C11766b;

/* JADX INFO: renamed from: v0.e */
/* JADX INFO: loaded from: classes.dex */
public class C11990e {

    /* JADX INFO: renamed from: a */
    public final ImageCaptureFailedForSpecificCombinationQuirk f42464a = (ImageCaptureFailedForSpecificCombinationQuirk) C11766b.m44046b(ImageCaptureFailedForSpecificCombinationQuirk.class);

    /* JADX INFO: renamed from: b */
    public final PreviewGreenTintQuirk f42465b = (PreviewGreenTintQuirk) C11766b.m44046b(PreviewGreenTintQuirk.class);

    /* JADX INFO: renamed from: a */
    public boolean m44744a(String str, Collection<AbstractC5952w2> collection) {
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.f42464a;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.m2235k(str, collection);
        }
        if (this.f42465b != null) {
            return PreviewGreenTintQuirk.m2256i(str, collection);
        }
        return false;
    }
}
