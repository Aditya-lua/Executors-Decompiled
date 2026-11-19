package r7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30564a = s7.c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    public static o7.k a(s7.c cVar, g7.i iVar, int i10) {
        boolean zG = false;
        boolean z10 = i10 == 3;
        String strN = null;
        o7.k.a aVarB = null;
        n7.b bVarF = null;
        n7.o<PointF, PointF> oVarB = null;
        n7.b bVarF2 = null;
        n7.b bVarE = null;
        n7.b bVarE2 = null;
        n7.b bVarF3 = null;
        n7.b bVarF4 = null;
        while (cVar.f()) {
            switch (cVar.s(f30564a)) {
                case 0:
                    strN = cVar.n();
                    break;
                case 1:
                    aVarB = o7.k.a.b(cVar.k());
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
                    z10 = cVar.k() == 3;
                    break;
                default:
                    cVar.u();
                    cVar.w();
                    break;
            }
        }
        return new o7.k(strN, aVarB, bVarF, oVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zG, z10);
    }
}
