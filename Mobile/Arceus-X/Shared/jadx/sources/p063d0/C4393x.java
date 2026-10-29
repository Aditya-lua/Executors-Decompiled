package p063d0;

import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import p001a0.C0008c0;
import p036c0.C1496a;
import p036c0.C1500e;

/* JADX INFO: renamed from: d0.x */
/* JADX INFO: loaded from: classes.dex */
public class C4393x {
    /* JADX INFO: renamed from: a */
    public int m22065a(String str, C0008c0 c0008c0) {
        Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = (Nexus4AndroidLTargetAspectRatioQuirk) C1500e.m7653b(Nexus4AndroidLTargetAspectRatioQuirk.class);
        if (nexus4AndroidLTargetAspectRatioQuirk != null) {
            return nexus4AndroidLTargetAspectRatioQuirk.m2130g();
        }
        AspectRatioLegacyApi21Quirk aspectRatioLegacyApi21Quirk = (AspectRatioLegacyApi21Quirk) C1496a.m7646a(str, c0008c0).m35234b(AspectRatioLegacyApi21Quirk.class);
        if (aspectRatioLegacyApi21Quirk != null) {
            return aspectRatioLegacyApi21Quirk.m2042g();
        }
        return 3;
    }
}
