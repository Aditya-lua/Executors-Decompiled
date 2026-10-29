package q7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29238a = r7.c.a.a("nm", "p", "s", "hd", "d");

    public static n7.b a(r7.c cVar, f7.i iVar, int i10) {
        boolean z10 = i10 == 3;
        boolean zG = false;
        String strM = null;
        m7.o<PointF, PointF> oVarB = null;
        m7.f fVarI = null;
        while (cVar.f()) {
            int iR = cVar.r(f29238a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                oVarB = a.b(cVar, iVar);
            } else if (iR == 2) {
                fVarI = d.i(cVar, iVar);
            } else if (iR == 3) {
                zG = cVar.g();
            } else if (iR != 4) {
                cVar.s();
                cVar.u();
            } else {
                z10 = cVar.j() == 3;
            }
        }
        return new n7.b(strM, oVarB, fVarI, z10, zG);
    }
}
