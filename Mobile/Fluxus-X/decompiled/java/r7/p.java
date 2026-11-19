package r7;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30594a = s7.c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    public static final s7.c.a b = s7.c.a.a("p", "k");

    public static o7.e a(s7.c cVar, g7.i iVar) {
        n7.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strN = null;
        o7.g gVar = null;
        n7.c cVarG = null;
        n7.f fVarI = null;
        n7.f fVarI2 = null;
        boolean zG = false;
        while (cVar.f()) {
            switch (cVar.s(f30594a)) {
                case 0:
                    strN = cVar.n();
                    break;
                case 1:
                    cVar.c();
                    int iK = -1;
                    while (cVar.f()) {
                        int iS = cVar.s(b);
                        if (iS == 0) {
                            iK = cVar.k();
                        } else if (iS != 1) {
                            cVar.u();
                            cVar.w();
                        } else {
                            cVarG = d.g(cVar, iVar, iK);
                        }
                    }
                    cVar.e();
                    break;
                case 2:
                    dVar = d.h(cVar, iVar);
                    break;
                case 3:
                    gVar = cVar.k() == 1 ? o7.g.LINEAR : o7.g.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(cVar, iVar);
                    break;
                case 5:
                    fVarI2 = d.i(cVar, iVar);
                    break;
                case 6:
                    fillType = cVar.k() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zG = cVar.g();
                    break;
                default:
                    cVar.u();
                    cVar.w();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new n7.d(Collections.singletonList(new u7.a(100)));
        }
        return new o7.e(strN, gVar, fillType, cVarG, dVar, fVarI, fVarI2, null, null, zG);
    }
}
