package r7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30565a = s7.c.a.a("nm", "p", "s", "r", "hd");

    public static o7.l a(s7.c cVar, g7.i iVar) {
        String strN = null;
        n7.o<PointF, PointF> oVarB = null;
        n7.f fVarI = null;
        n7.b bVarE = null;
        boolean zG = false;
        while (cVar.f()) {
            int iS = cVar.s(f30565a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iS == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iS == 3) {
                bVarE = d.e(cVar, iVar);
            } else if (iS != 4) {
                cVar.w();
            } else {
                zG = cVar.g();
            }
        }
        return new o7.l(strN, oVarB, fVarI, bVarE, zG);
    }
}
