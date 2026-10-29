package q7;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29245a = r7.c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static n7.p a(r7.c cVar, f7.i iVar) {
        m7.d dVar = null;
        String strM = null;
        m7.a aVarC = null;
        boolean zG = false;
        boolean zG2 = false;
        int iJ = 1;
        while (cVar.f()) {
            int iR = cVar.r(f29245a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                aVarC = d.c(cVar, iVar);
            } else if (iR == 2) {
                dVar = d.h(cVar, iVar);
            } else if (iR == 3) {
                zG = cVar.g();
            } else if (iR == 4) {
                iJ = cVar.j();
            } else if (iR != 5) {
                cVar.s();
                cVar.u();
            } else {
                zG2 = cVar.g();
            }
        }
        if (dVar == null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(100)));
        }
        return new n7.p(strM, zG, iJ == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zG2);
    }
}
