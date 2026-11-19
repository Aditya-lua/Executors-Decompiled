package r7;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30595a = s7.c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    public static final s7.c.a b = s7.c.a.a("p", "k");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s7.c.a f30596c = s7.c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    public static o7.f a(s7.c cVar, g7.i iVar) {
        n7.d dVar;
        ArrayList arrayList = new ArrayList();
        o7.g gVar = null;
        String strN = null;
        n7.c cVarG = null;
        n7.f fVarI = null;
        n7.f fVarI2 = null;
        n7.b bVarE = null;
        o7.s.a aVar = null;
        o7.s.b bVar = null;
        n7.b bVar2 = null;
        float fH = 0.0f;
        boolean zG = false;
        n7.d dVarH = null;
        while (cVar.f()) {
            o7.g gVar2 = gVar;
            switch (cVar.s(f30595a)) {
                case 0:
                    strN = cVar.n();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVarH;
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
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 2:
                    dVarH = d.h(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVarH;
                    gVar = cVar.k() == 1 ? o7.g.LINEAR : o7.g.RADIAL;
                    dVarH = dVar;
                    break;
                case 4:
                    fVarI = d.i(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 5:
                    fVarI2 = d.i(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 6:
                    bVarE = d.e(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 7:
                    dVar = dVarH;
                    aVar = o7.s.a.values()[cVar.k() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 8:
                    dVar = dVarH;
                    bVar = o7.s.b.values()[cVar.k() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 9:
                    dVar = dVarH;
                    fH = (float) cVar.h();
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 10:
                    zG = cVar.g();
                    gVar = gVar2;
                    break;
                case 11:
                    cVar.b();
                    while (cVar.f()) {
                        cVar.c();
                        String strN2 = null;
                        n7.b bVarE2 = null;
                        while (cVar.f()) {
                            int iS2 = cVar.s(f30596c);
                            if (iS2 != 0) {
                                n7.d dVar2 = dVarH;
                                if (iS2 != 1) {
                                    cVar.u();
                                    cVar.w();
                                } else {
                                    bVarE2 = d.e(cVar, iVar);
                                }
                                dVarH = dVar2;
                            } else {
                                strN2 = cVar.n();
                            }
                        }
                        n7.d dVar3 = dVarH;
                        cVar.e();
                        if (strN2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strN2.equals("d") || strN2.equals("g")) {
                                iVar.u(true);
                                arrayList.add(bVarE2);
                            }
                            dVarH = dVar3;
                        }
                        dVarH = dVar3;
                    }
                    dVar = dVarH;
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((n7.b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                default:
                    cVar.u();
                    cVar.w();
                    gVar = gVar2;
                    break;
            }
        }
        n7.d dVar4 = dVarH;
        return new o7.f(strN, gVar, cVarG, dVar4 == null ? new n7.d(Collections.singletonList(new u7.a(100))) : dVar4, fVarI, fVarI2, bVarE, aVar, bVar, fH, arrayList, bVar2, zG);
    }
}
