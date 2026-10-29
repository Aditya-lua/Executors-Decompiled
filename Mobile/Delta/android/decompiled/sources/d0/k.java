package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import n0.SurfaceConfig;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f14254a;

    public k() {
        this((ExtraCroppingQuirk) c0.e.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size size) {
        Size sizeG;
        ExtraCroppingQuirk extraCroppingQuirk = this.f14254a;
        return (extraCroppingQuirk == null || (sizeG = extraCroppingQuirk.g(SurfaceConfig.d.PRIV)) == null || sizeG.getWidth() * sizeG.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeG;
    }

    public k(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f14254a = extraCroppingQuirk;
    }
}
