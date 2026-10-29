package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.List;
import n0.SurfaceConfig;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f14265a;

    public t() {
        this((ExtraCroppingQuirk) c0.e.b(ExtraCroppingQuirk.class));
    }

    public List<Size> a(SurfaceConfig.d dVar, List<Size> list) {
        Size sizeG;
        ExtraCroppingQuirk extraCroppingQuirk = this.f14265a;
        if (extraCroppingQuirk == null || (sizeG = extraCroppingQuirk.g(dVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeG);
        for (Size size : list) {
            if (!size.equals(sizeG)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public t(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f14265a = extraCroppingQuirk;
    }
}
