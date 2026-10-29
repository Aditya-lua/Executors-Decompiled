package s1;

import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.List;
import n0.g3;
import n0.h3;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static List<g3> a(h3 h3Var) {
        ArrayList arrayList = new ArrayList();
        if (h3Var.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.j())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (h3Var.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.g())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
