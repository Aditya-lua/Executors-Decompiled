package q7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29234a = r7.c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    public static n7.k a(r7.c cVar, f7.i iVar, int i10) {
        boolean zG = false;
        boolean z10 = i10 == 3;
        String strM = null;
        n7.k.a aVarB = null;
        m7.b bVarF = null;
        m7.o<PointF, PointF> oVarB = null;
        m7.b bVarF2 = null;
        m7.b bVarE = null;
        m7.b bVarE2 = null;
        m7.b bVarF3 = null;
        m7.b bVarF4 = null;
        while (cVar.f()) {
            switch (cVar.r(f29234a)) {
                case 0:
                    strM = cVar.m();
                    break;
                case 1:
                    aVarB = n7.k.a.b(cVar.j());
                    break;
                case 2:
                    bVarF = d.f(cVar, iVar, false);
                    break;
                case 3:
                    oVarB = a.b(cVar, iVar);
                    break;
                case 4:
                    bVarF2 = d.f(cVar, iVar, false);
                    break;
                case 5:
                    bVarE2 = d.e(cVar, iVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, iVar, false);
                    break;
                case 7:
                    bVarE = d.e(cVar, iVar);
                    break;
                case 8:
                    bVarF3 = d.f(cVar, iVar, false);
                    break;
                case 9:
                    zG = cVar.g();
                    break;
                case 10:
                    z10 = cVar.j() == 3;
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        return new n7.k(strM, aVarB, bVarF, oVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zG, z10);
    }
}
