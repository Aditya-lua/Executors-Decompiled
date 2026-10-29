package p063d0;

import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.List;
import p036c0.C1500e;
import p296n0.C8837v3;

/* JADX INFO: renamed from: d0.f */
/* JADX INFO: loaded from: classes.dex */
public class C4375f {

    /* JADX INFO: renamed from: a */
    public final ExtraSupportedSurfaceCombinationsQuirk f18228a = (ExtraSupportedSurfaceCombinationsQuirk) C1500e.m7653b(ExtraSupportedSurfaceCombinationsQuirk.class);

    /* JADX INFO: renamed from: a */
    public List<C8837v3> m22030a(String str) {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.f18228a;
        return extraSupportedSurfaceCombinationsQuirk == null ? new ArrayList() : extraSupportedSurfaceCombinationsQuirk.m2086i(str);
    }
}
