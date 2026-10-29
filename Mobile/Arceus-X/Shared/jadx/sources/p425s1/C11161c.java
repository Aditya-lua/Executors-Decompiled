package p425s1;

import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.List;
import p296n0.C8764h3;
import p296n0.InterfaceC8758g3;

/* JADX INFO: renamed from: s1.c */
/* JADX INFO: loaded from: classes.dex */
public class C11161c {
    /* JADX INFO: renamed from: a */
    public static List<InterfaceC8758g3> m42057a(C8764h3 c8764h3) {
        ArrayList arrayList = new ArrayList();
        if (c8764h3.m35147a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.m2428j())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (c8764h3.m35147a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.m2424g())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
