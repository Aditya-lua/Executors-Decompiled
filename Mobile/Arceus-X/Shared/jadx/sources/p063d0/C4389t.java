package p063d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.List;
import p036c0.C1500e;
import p296n0.SurfaceConfig;

/* JADX INFO: renamed from: d0.t */
/* JADX INFO: loaded from: classes.dex */
public class C4389t {

    /* JADX INFO: renamed from: a */
    public final ExtraCroppingQuirk f18249a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4389t() {
        this((ExtraCroppingQuirk) C1500e.m7653b(ExtraCroppingQuirk.class));
    }

    /* JADX INFO: renamed from: a */
    public List<Size> m22061a(SurfaceConfig.d dVar, List<Size> list) {
        Size sizeM2075g;
        ExtraCroppingQuirk extraCroppingQuirk = this.f18249a;
        if (extraCroppingQuirk == null || (sizeM2075g = extraCroppingQuirk.m2075g(dVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeM2075g);
        for (Size size : list) {
            if (!size.equals(sizeM2075g)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4389t(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f18249a = extraCroppingQuirk;
    }
}
