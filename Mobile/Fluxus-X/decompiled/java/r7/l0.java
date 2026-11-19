package r7;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30589a = s7.c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    public static final s7.c.a b = s7.c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    public static o7.s a(s7.c cVar, g7.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strN = null;
        o7.s.a aVar = null;
        o7.s.b bVar = null;
        Object obj = null;
        n7.a aVarC = null;
        n7.b bVarE = null;
        String str = null;
        float fH = 0.0f;
        boolean zG = false;
        n7.d dVar = null;
        while (cVar.f()) {
            switch (cVar.s(f30589a)) {
                case 0:
                    strN = cVar.n();
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
                    aVar = o7.s.a.values()[cVar.k() - 1];
                    break;
                case 5:
                    bVar = o7.s.b.values()[cVar.k() - 1];
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
                        String strN2 = str;
                        Object objE = strN2;
                        while (cVar.f()) {
                            int iS = cVar.s(b);
                            if (iS == 0) {
                                strN2 = cVar.n();
                            } else if (iS != 1) {
                                cVar.u();
                                cVar.w();
                            } else {
                                objE = d.e(cVar, iVar);
                            }
                        }
                        cVar.e();
                        strN2.getClass();
                        switch (strN2) {
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
                        arrayList.add((n7.b) arrayList.get(0));
                    }
                    break;
                default:
                    cVar.w();
                    continue;
            }
            str = null;
        }
        if (dVar == null) {
            dVar = new n7.d(Collections.singletonList(new u7.a(100)));
        }
        if (aVar == null) {
            aVar = o7.s.a.BUTT;
        }
        if (bVar == null) {
            bVar = o7.s.b.MITER;
        }
        return new o7.s(strN, obj, arrayList, aVarC, dVar, bVarE, aVar, bVar, fH, zG);
    }
}
