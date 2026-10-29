package d0;

import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.List;
import n0.v3;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraSupportedSurfaceCombinationsQuirk f14250a = (ExtraSupportedSurfaceCombinationsQuirk) c0.e.b(ExtraSupportedSurfaceCombinationsQuirk.class);

    public List<v3> a(String str) {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.f14250a;
        return extraSupportedSurfaceCombinationsQuirk == null ? new ArrayList() : extraSupportedSurfaceCombinationsQuirk.i(str);
    }
}
