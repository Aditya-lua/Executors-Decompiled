package d2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(c2.e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int iT1;
        int i11 = i10 == 0 ? eVar.I0 : eVar.J0;
        if (i11 != -1 && (oVar == null || i11 != oVar.c())) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                o oVar2 = arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof c2.j) && (iT1 = ((c2.j) eVar).t1(i10)) != -1) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    o oVar3 = arrayList.get(i13);
                    if (oVar3.c() == iT1) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof c2.h) {
                c2.h hVar = (c2.h) eVar;
                hVar.s1().c(hVar.t1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.I0 = oVar.c();
                eVar.O.c(i10, arrayList, oVar);
                eVar.Q.c(i10, arrayList, oVar);
            } else {
                eVar.J0 = oVar.c();
                eVar.P.c(i10, arrayList, oVar);
                eVar.S.c(i10, arrayList, oVar);
                eVar.R.c(i10, arrayList, oVar);
            }
            eVar.V.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0341  */
    public static boolean c(c2.f fVar, b.InterfaceC0264b interfaceC0264b) {
        o oVar;
        boolean z10;
        o oVar2;
        ArrayList<c2.e> arrayListS1 = fVar.s1();
        int size = arrayListS1.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c2.e eVar = arrayListS1.get(i11);
            if (!d(fVar.A(), fVar.T(), eVar.A(), eVar.T()) || (eVar instanceof c2.g)) {
                return false;
            }
        }
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i12 < size) {
            c2.e eVar2 = arrayListS1.get(i12);
            if (!d(fVar.A(), fVar.T(), eVar2.A(), eVar2.T())) {
                c2.f.U1(i10, eVar2, interfaceC0264b, fVar.f4431p1, b.a.f14307k);
            }
            boolean z11 = eVar2 instanceof c2.h;
            if (z11) {
                c2.h hVar = (c2.h) eVar2;
                if (hVar.t1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(hVar);
                }
                if (hVar.t1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hVar);
                }
            }
            if (eVar2 instanceof c2.j) {
                if (eVar2 instanceof c2.a) {
                    c2.a aVar = (c2.a) eVar2;
                    if (aVar.y1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.y1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    c2.j jVar = (c2.j) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(jVar);
                }
            }
            if (eVar2.O.f4347f == null && eVar2.Q.f4347f == null && !z11 && !(eVar2 instanceof c2.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.P.f4347f == null && eVar2.R.f4347f == null && eVar2.S.f4347f == null && !z11 && !(eVar2 instanceof c2.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList.get(i13);
                i13++;
                a((c2.h) obj, 0, arrayList7, null);
            }
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                c2.j jVar2 = (c2.j) obj2;
                o oVarA = a(jVar2, 0, arrayList7, null);
                jVar2.s1(arrayList7, 0, oVarA);
                oVarA.b(arrayList7);
            }
        }
        c2.d dVarO = fVar.o(c2.d.a.LEFT);
        if (dVarO.d() != null) {
            Iterator<c2.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                a(it.next().f4345d, 0, arrayList7, null);
            }
        }
        c2.d dVarO2 = fVar.o(c2.d.a.RIGHT);
        if (dVarO2.d() != null) {
            Iterator<c2.d> it2 = dVarO2.d().iterator();
            while (it2.hasNext()) {
                a(it2.next().f4345d, 0, arrayList7, null);
            }
        }
        c2.d dVarO3 = fVar.o(c2.d.a.CENTER);
        if (dVarO3.d() != null) {
            Iterator<c2.d> it3 = dVarO3.d().iterator();
            while (it3.hasNext()) {
                a(it3.next().f4345d, 0, arrayList7, null);
            }
        }
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj3 = arrayList5.get(i15);
                i15++;
                a((c2.e) obj3, 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj4 = arrayList3.get(i16);
                i16++;
                a((c2.h) obj4, 1, arrayList7, null);
            }
        }
        if (arrayList4 != null) {
            int size6 = arrayList4.size();
            int i17 = 0;
            while (i17 < size6) {
                Object obj5 = arrayList4.get(i17);
                i17++;
                c2.j jVar3 = (c2.j) obj5;
                o oVarA2 = a(jVar3, 1, arrayList7, null);
                jVar3.s1(arrayList7, 1, oVarA2);
                oVarA2.b(arrayList7);
            }
        }
        c2.d dVarO4 = fVar.o(c2.d.a.TOP);
        if (dVarO4.d() != null) {
            Iterator<c2.d> it4 = dVarO4.d().iterator();
            while (it4.hasNext()) {
                a(it4.next().f4345d, 1, arrayList7, null);
            }
        }
        c2.d dVarO5 = fVar.o(c2.d.a.BASELINE);
        if (dVarO5.d() != null) {
            Iterator<c2.d> it5 = dVarO5.d().iterator();
            while (it5.hasNext()) {
                a(it5.next().f4345d, 1, arrayList7, null);
            }
        }
        c2.d dVarO6 = fVar.o(c2.d.a.BOTTOM);
        if (dVarO6.d() != null) {
            Iterator<c2.d> it6 = dVarO6.d().iterator();
            while (it6.hasNext()) {
                a(it6.next().f4345d, 1, arrayList7, null);
            }
        }
        c2.d dVarO7 = fVar.o(c2.d.a.CENTER);
        if (dVarO7.d() != null) {
            Iterator<c2.d> it7 = dVarO7.d().iterator();
            while (it7.hasNext()) {
                a(it7.next().f4345d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            int size7 = arrayList6.size();
            int i18 = 0;
            while (i18 < size7) {
                Object obj6 = arrayList6.get(i18);
                i18++;
                a((c2.e) obj6, 1, arrayList7, null);
            }
        }
        for (int i19 = 0; i19 < size; i19++) {
            c2.e eVar3 = arrayListS1.get(i19);
            if (eVar3.s0()) {
                o oVarB = b(arrayList7, eVar3.I0);
                o oVarB2 = b(arrayList7, eVar3.J0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.g(0, oVarB2);
                    oVarB2.i(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.A() == c2.e.b.WRAP_CONTENT) {
            int size8 = arrayList7.size();
            oVar = null;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size8) {
                o oVar3 = arrayList7.get(i21);
                i21++;
                o oVar4 = oVar3;
                if (oVar4.d() != 1) {
                    oVar4.h(false);
                    int iF = oVar4.f(fVar.M1(), 0);
                    if (iF > i20) {
                        oVar = oVar4;
                        i20 = iF;
                    }
                }
            }
            if (oVar != null) {
                fVar.Q0(c2.e.b.FIXED);
                fVar.l1(i20);
                oVar.h(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.T() == c2.e.b.WRAP_CONTENT) {
            int size9 = arrayList7.size();
            oVar2 = null;
            int i22 = 0;
            int i23 = 0;
            while (i22 < size9) {
                o oVar5 = arrayList7.get(i22);
                i22++;
                o oVar6 = oVar5;
                if (oVar6.d() != 0) {
                    oVar6.h(false);
                    int iF2 = oVar6.f(fVar.M1(), 1);
                    if (iF2 > i23) {
                        oVar2 = oVar6;
                        i23 = iF2;
                    }
                }
            }
            z10 = true;
            if (oVar2 != null) {
                fVar.h1(c2.e.b.FIXED);
                fVar.M0(i23);
                oVar2.h(true);
            }
            if (oVar == null || oVar2 != null) {
                return z10;
            }
            return false;
        }
        z10 = true;
        oVar2 = null;
        if (oVar == null) {
        }
        return z10;
    }

    public static boolean d(c2.e.b bVar, c2.e.b bVar2, c2.e.b bVar3, c2.e.b bVar4) {
        c2.e.b bVar5;
        c2.e.b bVar6;
        c2.e.b bVar7 = c2.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = c2.e.b.WRAP_CONTENT) || (bVar3 == c2.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = c2.e.b.WRAP_CONTENT) || (bVar4 == c2.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
