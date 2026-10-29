package q7;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29259a = r7.c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    public static final r7.c.a b = r7.c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    public static n7.s a(r7.c cVar, f7.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strM = null;
        n7.s.a aVar = null;
        n7.s.b bVar = null;
        Object obj = null;
        m7.a aVarC = null;
        m7.b bVarE = null;
        String str = null;
        float fH = 0.0f;
        boolean zG = false;
        m7.d dVar = null;
        while (cVar.f()) {
            switch (cVar.r(f29259a)) {
                case 0:
                    strM = cVar.m();
                    break;
                case 1:
                    aVarC = d.c(cVar, iVar);
                    break;
                case 2:
                    bVarE = d.e(cVar, iVar);
                    break;
                case 3:
                    dVar = d.h(cVar, iVar);
                    break;
                case 4:
                    aVar = n7.s.a.values()[cVar.j() - 1];
                    break;
                case 5:
                    bVar = n7.s.b.values()[cVar.j() - 1];
                    break;
                case 6:
                    fH = (float) cVar.h();
                    break;
                case 7:
                    zG = cVar.g();
                    break;
                case 8:
                    cVar.b();
                    while (cVar.f()) {
                        cVar.c();
                        String strM2 = str;
                        Object objE = strM2;
                        while (cVar.f()) {
                            int iR = cVar.r(b);
                            if (iR == 0) {
                                strM2 = cVar.m();
                            } else if (iR != 1) {
                                cVar.s();
                                cVar.u();
                            } else {
                                objE = d.e(cVar, iVar);
                            }
                        }
                        cVar.e();
                        strM2.getClass();
                        switch (strM2) {
                            case "d":
                            case "g":
                                iVar.u(true);
                                arrayList.add(objE);
                                break;
                            case "o":
                                obj = objE;
                                break;
                        }
                        str = null;
                    }
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((m7.b) arrayList.get(0));
                    }
                    break;
                default:
                    cVar.u();
                    continue;
            }
            str = null;
        }
        if (dVar == null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(100)));
        }
        if (aVar == null) {
            aVar = n7.s.a.BUTT;
        }
        if (bVar == null) {
            bVar = n7.s.b.MITER;
        }
        return new n7.s(strM, obj, arrayList, aVarC, dVar, bVarE, aVar, bVar, fH, zG);
    }
}
