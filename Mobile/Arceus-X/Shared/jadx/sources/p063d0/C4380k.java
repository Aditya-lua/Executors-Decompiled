package p063d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import p036c0.C1500e;
import p296n0.SurfaceConfig;

/* JADX INFO: renamed from: d0.k */
/* JADX INFO: loaded from: classes.dex */
public class C4380k {

    /* JADX INFO: renamed from: a */
    public final ExtraCroppingQuirk f18233a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4380k() {
        this((ExtraCroppingQuirk) C1500e.m7653b(ExtraCroppingQuirk.class));
    }

    /* JADX INFO: renamed from: a */
    public Size m22041a(Size size) {
        Size sizeM2075g;
        ExtraCroppingQuirk extraCroppingQuirk = this.f18233a;
        return (extraCroppingQuirk == null || (sizeM2075g = extraCroppingQuirk.m2075g(SurfaceConfig.d.PRIV)) == null || sizeM2075g.getWidth() * sizeM2075g.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeM2075g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4380k(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f18233a = extraCroppingQuirk;
    }
}
