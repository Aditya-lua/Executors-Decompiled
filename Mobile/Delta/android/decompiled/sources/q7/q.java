package q7;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29265a = r7.c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    public static final r7.c.a b = r7.c.a.a("p", "k");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r7.c.a f29266c = r7.c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    public static n7.f a(r7.c cVar, f7.i iVar) {
        m7.d dVar;
        ArrayList arrayList = new ArrayList();
        n7.g gVar = null;
        String strM = null;
        m7.c cVarG = null;
        m7.f fVarI = null;
        m7.f fVarI2 = null;
        m7.b bVarE = null;
        n7.s.a aVar = null;
        n7.s.b bVar = null;
        m7.b bVar2 = null;
        float fH = 0.0f;
        boolean zG = false;
        m7.d dVarH = null;
        while (cVar.f()) {
            n7.g gVar2 = gVar;
            switch (cVar.r(f29265a)) {
                case 0:
                    strM = cVar.m();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVarH;
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
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 2:
                    dVarH = d.h(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVarH;
                    gVar = cVar.j() == 1 ? n7.g.LINEAR : n7.g.RADIAL;
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
                    aVar = n7.s.a.values()[cVar.j() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 8:
                    dVar = dVarH;
                    bVar = n7.s.b.values()[cVar.j() - 1];
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
                        String strM2 = null;
                        m7.b bVarE2 = null;
                        while (cVar.f()) {
                            int iR2 = cVar.r(f29266c);
                            if (iR2 != 0) {
                                m7.d dVar2 = dVarH;
                                if (iR2 != 1) {
                                    cVar.s();
                                    cVar.u();
                                } else {
                                    bVarE2 = d.e(cVar, iVar);
                                }
                                dVarH = dVar2;
                            } else {
                                strM2 = cVar.m();
                            }
                        }
                        m7.d dVar3 = dVarH;
                        cVar.e();
                        if (strM2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strM2.equals("d") || strM2.equals("g")) {
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
                        arrayList.add((m7.b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    gVar = gVar2;
                    break;
            }
        }
        m7.d dVar4 = dVarH;
        return new n7.f(strM, gVar, cVarG, dVar4 == null ? new m7.d(Collections.singletonList(new t7.a(100))) : dVar4, fVarI, fVarI2, bVarE, aVar, bVar, fH, arrayList, bVar2, zG);
    }
}
