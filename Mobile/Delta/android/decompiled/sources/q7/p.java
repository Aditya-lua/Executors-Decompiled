package q7;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29264a = r7.c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    public static final r7.c.a b = r7.c.a.a("p", "k");

    public static n7.e a(r7.c cVar, f7.i iVar) {
        m7.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strM = null;
        n7.g gVar = null;
        m7.c cVarG = null;
        m7.f fVarI = null;
        m7.f fVarI2 = null;
        boolean zG = false;
        while (cVar.f()) {
            switch (cVar.r(f29264a)) {
                case 0:
                    strM = cVar.m();
                    break;
                case 1:
                    cVar.c();
                    int iJ = -1;
                    while (cVar.f()) {
                        int iR = cVar.r(b);
                        if (iR == 0) {
                            iJ = cVar.j();
                        } else if (iR != 1) {
                            cVar.s();
                            cVar.u();
                        } else {
                            cVarG = d.g(cVar, iVar, iJ);
                        }
                    }
                    cVar.e();
                    break;
                case 2:
                    dVar = d.h(cVar, iVar);
                    break;
                case 3:
                    gVar = cVar.j() == 1 ? n7.g.LINEAR : n7.g.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(cVar, iVar);
                    break;
                case 5:
                    fVarI2 = d.i(cVar, iVar);
                    break;
                case 6:
                    fillType = cVar.j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zG = cVar.g();
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(100)));
        }
        return new n7.e(strM, gVar, fillType, cVarG, dVar, fVarI, fVarI2, null, null, zG);
    }
}
