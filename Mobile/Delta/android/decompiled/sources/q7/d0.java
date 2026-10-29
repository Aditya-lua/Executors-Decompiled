package q7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29235a = r7.c.a.a("nm", "p", "s", "r", "hd");

    public static n7.l a(r7.c cVar, f7.i iVar) {
        String strM = null;
        m7.o<PointF, PointF> oVarB = null;
        m7.f fVarI = null;
        m7.b bVarE = null;
        boolean zG = false;
        while (cVar.f()) {
            int iR = cVar.r(f29235a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iR == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iR == 3) {
                bVarE = d.e(cVar, iVar);
            } else if (iR != 4) {
                cVar.u();
            } else {
                zG = cVar.g();
            }
        }
        return new n7.l(strM, oVarB, fVarI, bVarE, zG);
    }
}
