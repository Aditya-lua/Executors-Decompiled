package r7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30568a = s7.c.a.a("nm", "p", "s", "hd", "d");

    public static o7.b a(s7.c cVar, g7.i iVar, int i10) {
        boolean z10 = i10 == 3;
        boolean zG = false;
        String strN = null;
        n7.o<PointF, PointF> oVarB = null;
        n7.f fVarI = null;
        while (cVar.f()) {
            int iS = cVar.s(f30568a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iS == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iS == 3) {
                zG = cVar.g();
            } else if (iS != 4) {
                cVar.u();
                cVar.w();
            } else {
                z10 = cVar.k() == 3;
            }
        }
        return new o7.b(strN, oVarB, fVarI, z10, zG);
    }
}
