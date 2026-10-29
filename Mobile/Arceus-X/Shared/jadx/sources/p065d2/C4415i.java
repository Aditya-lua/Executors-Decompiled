package p065d2;

import java.util.ArrayList;
import java.util.Iterator;
import p038c2.C1508a;
import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.C1513f;
import p038c2.C1514g;
import p038c2.C1515h;
import p038c2.C1517j;

/* JADX INFO: renamed from: d2.i */
/* JADX INFO: loaded from: classes.dex */
public class C4415i {
    /* JADX INFO: renamed from: a */
    public static C4421o m22189a(C1512e c1512e, int i10, ArrayList<C4421o> arrayList, C4421o c4421o) {
        int iM7924t1;
        int i11 = i10 == 0 ? c1512e.f5850I0 : c1512e.f5852J0;
        if (i11 != -1 && (c4421o == null || i11 != c4421o.m22204c())) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                C4421o c4421o2 = arrayList.get(i12);
                if (c4421o2.m22204c() == i11) {
                    if (c4421o != null) {
                        c4421o.m22208g(i10, c4421o2);
                        arrayList.remove(c4421o);
                    }
                    c4421o = c4421o2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return c4421o;
        }
        if (c4421o == null) {
            if ((c1512e instanceof C1517j) && (iM7924t1 = ((C1517j) c1512e).m7924t1(i10)) != -1) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    C4421o c4421o3 = arrayList.get(i13);
                    if (c4421o3.m22204c() == iM7924t1) {
                        c4421o = c4421o3;
                        break;
                    }
                }
            }
            if (c4421o == null) {
                c4421o = new C4421o(i10);
            }
            arrayList.add(c4421o);
        }
        if (c4421o.m22202a(c1512e)) {
            if (c1512e instanceof C1515h) {
                C1515h c1515h = (C1515h) c1512e;
                c1515h.m7912s1().m7683c(c1515h.m7913t1() == 0 ? 1 : 0, arrayList, c4421o);
            }
            if (i10 == 0) {
                c1512e.f5850I0 = c4421o.m22204c();
                c1512e.f5857O.m7683c(i10, arrayList, c4421o);
                c1512e.f5859Q.m7683c(i10, arrayList, c4421o);
            } else {
                c1512e.f5852J0 = c4421o.m22204c();
                c1512e.f5858P.m7683c(i10, arrayList, c4421o);
                c1512e.f5861S.m7683c(i10, arrayList, c4421o);
                c1512e.f5860R.m7683c(i10, arrayList, c4421o);
            }
            c1512e.f5864V.m7683c(i10, arrayList, c4421o);
        }
        return c4421o;
    }

    /* JADX INFO: renamed from: b */
    public static C4421o m22190b(ArrayList<C4421o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4421o c4421o = arrayList.get(i11);
            if (i10 == c4421o.m22204c()) {
                return c4421o;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0341  */
    /* JADX INFO: renamed from: c */
    public static boolean m22191c(C1513f c1513f, C4408b.b bVar) {
        C4421o c4421o;
        boolean z10;
        C4421o c4421o2;
        ArrayList<C1512e> arrayListM7949s1 = c1513f.m7949s1();
        int size = arrayListM7949s1.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C1512e c1512e = arrayListM7949s1.get(i11);
            if (!m22192d(c1513f.m7703A(), c1513f.m7741T(), c1512e.m7703A(), c1512e.m7741T()) || (c1512e instanceof C1514g)) {
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
            C1512e c1512e2 = arrayListM7949s1.get(i12);
            if (!m22192d(c1513f.m7703A(), c1513f.m7741T(), c1512e2.m7703A(), c1512e2.m7741T())) {
                C1513f.m7819U1(i10, c1512e2, bVar, c1513f.f5956p1, C4408b.a.f18302k);
            }
            boolean z11 = c1512e2 instanceof C1515h;
            if (z11) {
                C1515h c1515h = (C1515h) c1512e2;
                if (c1515h.m7913t1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c1515h);
                }
                if (c1515h.m7913t1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c1515h);
                }
            }
            if (c1512e2 instanceof C1517j) {
                if (c1512e2 instanceof C1508a) {
                    C1508a c1508a = (C1508a) c1512e2;
                    if (c1508a.m7674y1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c1508a);
                    }
                    if (c1508a.m7674y1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c1508a);
                    }
                } else {
                    C1517j c1517j = (C1517j) c1512e2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c1517j);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c1517j);
                }
            }
            if (c1512e2.f5857O.f5818f == null && c1512e2.f5859Q.f5818f == null && !z11 && !(c1512e2 instanceof C1508a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(c1512e2);
            }
            if (c1512e2.f5858P.f5818f == null && c1512e2.f5860R.f5818f == null && c1512e2.f5861S.f5818f == null && !z11 && !(c1512e2 instanceof C1508a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c1512e2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList<C4421o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList.get(i13);
                i13++;
                m22189a((C1515h) obj, 0, arrayList7, null);
            }
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                C1517j c1517j2 = (C1517j) obj2;
                C4421o c4421oM22189a = m22189a(c1517j2, 0, arrayList7, null);
                c1517j2.m7923s1(arrayList7, 0, c4421oM22189a);
                c4421oM22189a.m22203b(arrayList7);
            }
        }
        C1511d c1511dMo7791o = c1513f.mo7791o(C1511d.a.LEFT);
        if (c1511dMo7791o.m7684d() != null) {
            Iterator<C1511d> it = c1511dMo7791o.m7684d().iterator();
            while (it.hasNext()) {
                m22189a(it.next().f5816d, 0, arrayList7, null);
            }
        }
        C1511d c1511dMo7791o2 = c1513f.mo7791o(C1511d.a.RIGHT);
        if (c1511dMo7791o2.m7684d() != null) {
            Iterator<C1511d> it2 = c1511dMo7791o2.m7684d().iterator();
            while (it2.hasNext()) {
                m22189a(it2.next().f5816d, 0, arrayList7, null);
            }
        }
        C1511d c1511dMo7791o3 = c1513f.mo7791o(C1511d.a.CENTER);
        if (c1511dMo7791o3.m7684d() != null) {
            Iterator<C1511d> it3 = c1511dMo7791o3.m7684d().iterator();
            while (it3.hasNext()) {
                m22189a(it3.next().f5816d, 0, arrayList7, null);
            }
        }
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj3 = arrayList5.get(i15);
                i15++;
                m22189a((C1512e) obj3, 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj4 = arrayList3.get(i16);
                i16++;
                m22189a((C1515h) obj4, 1, arrayList7, null);
            }
        }
        if (arrayList4 != null) {
            int size6 = arrayList4.size();
            int i17 = 0;
            while (i17 < size6) {
                Object obj5 = arrayList4.get(i17);
                i17++;
                C1517j c1517j3 = (C1517j) obj5;
                C4421o c4421oM22189a2 = m22189a(c1517j3, 1, arrayList7, null);
                c1517j3.m7923s1(arrayList7, 1, c4421oM22189a2);
                c4421oM22189a2.m22203b(arrayList7);
            }
        }
        C1511d c1511dMo7791o4 = c1513f.mo7791o(C1511d.a.TOP);
        if (c1511dMo7791o4.m7684d() != null) {
            Iterator<C1511d> it4 = c1511dMo7791o4.m7684d().iterator();
            while (it4.hasNext()) {
                m22189a(it4.next().f5816d, 1, arrayList7, null);
            }
        }
        C1511d c1511dMo7791o5 = c1513f.mo7791o(C1511d.a.BASELINE);
        if (c1511dMo7791o5.m7684d() != null) {
            Iterator<C1511d> it5 = c1511dMo7791o5.m7684d().iterator();
            while (it5.hasNext()) {
                m22189a(it5.next().f5816d, 1, arrayList7, null);
            }
        }
        C1511d c1511dMo7791o6 = c1513f.mo7791o(C1511d.a.BOTTOM);
        if (c1511dMo7791o6.m7684d() != null) {
            Iterator<C1511d> it6 = c1511dMo7791o6.m7684d().iterator();
            while (it6.hasNext()) {
                m22189a(it6.next().f5816d, 1, arrayList7, null);
            }
        }
        C1511d c1511dMo7791o7 = c1513f.mo7791o(C1511d.a.CENTER);
        if (c1511dMo7791o7.m7684d() != null) {
            Iterator<C1511d> it7 = c1511dMo7791o7.m7684d().iterator();
            while (it7.hasNext()) {
                m22189a(it7.next().f5816d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            int size7 = arrayList6.size();
            int i18 = 0;
            while (i18 < size7) {
                Object obj6 = arrayList6.get(i18);
                i18++;
                m22189a((C1512e) obj6, 1, arrayList7, null);
            }
        }
        for (int i19 = 0; i19 < size; i19++) {
            C1512e c1512e3 = arrayListM7949s1.get(i19);
            if (c1512e3.m7803s0()) {
                C4421o c4421oM22190b = m22190b(arrayList7, c1512e3.f5850I0);
                C4421o c4421oM22190b2 = m22190b(arrayList7, c1512e3.f5852J0);
                if (c4421oM22190b != null && c4421oM22190b2 != null) {
                    c4421oM22190b.m22208g(0, c4421oM22190b2);
                    c4421oM22190b2.m22210i(2);
                    arrayList7.remove(c4421oM22190b);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (c1513f.m7703A() == C1512e.b.WRAP_CONTENT) {
            int size8 = arrayList7.size();
            c4421o = null;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size8) {
                C4421o c4421o3 = arrayList7.get(i21);
                i21++;
                C4421o c4421o4 = c4421o3;
                if (c4421o4.m22205d() != 1) {
                    c4421o4.m22209h(false);
                    int iM22207f = c4421o4.m22207f(c1513f.m7832M1(), 0);
                    if (iM22207f > i20) {
                        c4421o = c4421o4;
                        i20 = iM22207f;
                    }
                }
            }
            if (c4421o != null) {
                c1513f.m7736Q0(C1512e.b.FIXED);
                c1513f.m7785l1(i20);
                c4421o.m22209h(true);
            } else {
                c4421o = null;
            }
        } else {
            c4421o = null;
        }
        if (c1513f.m7741T() == C1512e.b.WRAP_CONTENT) {
            int size9 = arrayList7.size();
            c4421o2 = null;
            int i22 = 0;
            int i23 = 0;
            while (i22 < size9) {
                C4421o c4421o5 = arrayList7.get(i22);
                i22++;
                C4421o c4421o6 = c4421o5;
                if (c4421o6.m22205d() != 0) {
                    c4421o6.m22209h(false);
                    int iM22207f2 = c4421o6.m22207f(c1513f.m7832M1(), 1);
                    if (iM22207f2 > i23) {
                        c4421o2 = c4421o6;
                        i23 = iM22207f2;
                    }
                }
            }
            z10 = true;
            if (c4421o2 != null) {
                c1513f.m7773h1(C1512e.b.FIXED);
                c1513f.m7728M0(i23);
                c4421o2.m22209h(true);
            }
            if (c4421o == null || c4421o2 != null) {
                return z10;
            }
            return false;
        }
        z10 = true;
        c4421o2 = null;
        if (c4421o == null) {
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22192d(C1512e.b bVar, C1512e.b bVar2, C1512e.b bVar3, C1512e.b bVar4) {
        C1512e.b bVar5;
        C1512e.b bVar6;
        C1512e.b bVar7 = C1512e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C1512e.b.WRAP_CONTENT) || (bVar3 == C1512e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C1512e.b.WRAP_CONTENT) || (bVar4 == C1512e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
