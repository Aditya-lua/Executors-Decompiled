package r7;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30575a = s7.c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static o7.p a(s7.c cVar, g7.i iVar) {
        n7.d dVar = null;
        String strN = null;
        n7.a aVarC = null;
        boolean zG = false;
        boolean zG2 = false;
        int iK = 1;
        while (cVar.f()) {
            int iS = cVar.s(f30575a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                aVarC = d.c(cVar, iVar);
            } else if (iS == 2) {
                dVar = d.h(cVar, iVar);
            } else if (iS == 3) {
                zG = cVar.g();
            } else if (iS == 4) {
                iK = cVar.k();
            } else if (iS != 5) {
                cVar.u();
                cVar.w();
            } else {
                zG2 = cVar.g();
            }
        }
        if (dVar == null) {
            dVar = new n7.d(Collections.singletonList(new u7.a(100)));
        }
        return new o7.p(strN, zG, iK == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zG2);
    }
}
