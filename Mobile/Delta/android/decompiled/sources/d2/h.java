package d2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b.a f14349a = new b.a();
    public static int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f14350c = 0;

    public static boolean a(int i10, c2.e eVar) {
        c2.e.b bVar;
        c2.e.b bVar2;
        c2.e.b bVarA = eVar.A();
        c2.e.b bVarT = eVar.T();
        c2.f fVar = eVar.K() != null ? (c2.f) eVar.K() : null;
        if (fVar != null) {
            fVar.A();
            c2.e.b bVar3 = c2.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.T();
            c2.e.b bVar4 = c2.e.b.FIXED;
        }
        c2.e.b bVar5 = c2.e.b.FIXED;
        boolean z10 = bVarA == bVar5 || eVar.n0() || bVarA == c2.e.b.WRAP_CONTENT || (bVarA == (bVar2 = c2.e.b.MATCH_CONSTRAINT) && eVar.f4403w == 0 && eVar.f4366d0 == 0.0f && eVar.a0(0)) || (bVarA == bVar2 && eVar.f4403w == 1 && eVar.d0(0, eVar.W()));
        boolean z11 = bVarT == bVar5 || eVar.o0() || bVarT == c2.e.b.WRAP_CONTENT || (bVarT == (bVar = c2.e.b.MATCH_CONSTRAINT) && eVar.f4405x == 0 && eVar.f4366d0 == 0.0f && eVar.a0(1)) || (bVarT == bVar && eVar.f4405x == 1 && eVar.d0(1, eVar.x()));
        if (eVar.f4366d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i10, c2.e eVar, b.InterfaceC0264b interfaceC0264b, boolean z10) {
        c2.d dVar;
        c2.d dVar2;
        c2.d dVar3;
        c2.d dVar4;
        if (eVar.g0()) {
            return;
        }
        boolean z11 = true;
        b++;
        if (!(eVar instanceof c2.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                c2.f.U1(i11, eVar, interfaceC0264b, new b.a(), b.a.f14307k);
            }
        }
        c2.d dVarO = eVar.o(c2.d.a.LEFT);
        c2.d dVarO2 = eVar.o(c2.d.a.RIGHT);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<c2.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                c2.d next = it.next();
                c2.e eVar2 = next.f4345d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.m0() && zA) {
                    c2.f.U1(i12, eVar2, interfaceC0264b, new b.a(), b.a.f14307k);
                }
                boolean z12 = ((next == eVar2.O && (dVar4 = eVar2.Q.f4347f) != null && dVar4.n()) || (next == eVar2.Q && (dVar3 = eVar2.O.f4347f) != null && dVar3.n())) ? z11 : false;
                c2.e.b bVarA = eVar2.A();
                c2.e.b bVar = c2.e.b.MATCH_CONSTRAINT;
                if (bVarA != bVar || zA) {
                    if (!eVar2.m0()) {
                        c2.d dVar5 = eVar2.O;
                        if (next == dVar5 && eVar2.Q.f4347f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.G0(iF, eVar2.W() + iF);
                            b(i12, eVar2, interfaceC0264b, z10);
                        } else {
                            c2.d dVar6 = eVar2.Q;
                            if (next == dVar6 && dVar5.f4347f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.G0(iF2 - eVar2.W(), iF2);
                                b(i12, eVar2, interfaceC0264b, z10);
                            } else if (z12 && !eVar2.i0()) {
                                d(i12, interfaceC0264b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.A >= 0 && eVar2.f4409z >= 0 && ((eVar2.V() == 8 || (eVar2.f4403w == 0 && eVar2.v() == 0.0f)) && !eVar2.i0() && !eVar2.l0() && z12 && !eVar2.i0())) {
                    e(i12, eVar, interfaceC0264b, eVar2, z10);
                }
                z11 = z11;
            }
        }
        boolean z13 = z11;
        if (eVar instanceof c2.h) {
            return;
        }
        if (dVarO2.d() != null && dVarO2.n()) {
            Iterator<c2.d> it2 = dVarO2.d().iterator();
            while (it2.hasNext()) {
                c2.d next2 = it2.next();
                c2.e eVar3 = next2.f4345d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.m0() && zA2) {
                    c2.f.U1(i13, eVar3, interfaceC0264b, new b.a(), b.a.f14307k);
                }
                boolean z14 = ((next2 == eVar3.O && (dVar2 = eVar3.Q.f4347f) != null && dVar2.n()) || (next2 == eVar3.Q && (dVar = eVar3.O.f4347f) != null && dVar.n())) ? z13 : false;
                c2.e.b bVarA2 = eVar3.A();
                c2.e.b bVar2 = c2.e.b.MATCH_CONSTRAINT;
                if (bVarA2 != bVar2 || zA2) {
                    if (!eVar3.m0()) {
                        c2.d dVar7 = eVar3.O;
                        if (next2 == dVar7 && eVar3.Q.f4347f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.G0(iF3, eVar3.W() + iF3);
                            b(i13, eVar3, interfaceC0264b, z10);
                        } else {
                            c2.d dVar8 = eVar3.Q;
                            if (next2 == dVar8 && dVar7.f4347f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.G0(iF4 - eVar3.W(), iF4);
                                b(i13, eVar3, interfaceC0264b, z10);
                            } else if (z14 && !eVar3.i0()) {
                                d(i13, interfaceC0264b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.A() == bVar2 && eVar3.A >= 0 && eVar3.f4409z >= 0 && (eVar3.V() == 8 || (eVar3.f4403w == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.l0() && z14 && !eVar3.i0()) {
                        e(i13, eVar, interfaceC0264b, eVar3, z10);
                    }
                }
            }
        }
        eVar.q0();
    }

    public static void c(int i10, c2.a aVar, b.InterfaceC0264b interfaceC0264b, int i11, boolean z10) {
        if (aVar.u1()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0264b, z10);
            } else {
                i(i10 + 1, aVar, interfaceC0264b);
            }
        }
    }

    public static void d(int i10, b.InterfaceC0264b interfaceC0264b, c2.e eVar, boolean z10) {
        float fY = eVar.y();
        int iE = eVar.O.f4347f.e();
        int iE2 = eVar.Q.f4347f.e();
        int iF = eVar.O.f() + iE;
        int iF2 = iE2 - eVar.Q.f();
        if (iE == iE2) {
            fY = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iW = eVar.W();
        int i11 = (iE2 - iE) - iW;
        if (iE > iE2) {
            i11 = (iE - iE2) - iW;
        }
        int i12 = ((int) (i11 > 0 ? (fY * i11) + 0.5f : fY * i11)) + iE;
        int i13 = i12 + iW;
        if (iE > iE2) {
            i13 = i12 - iW;
        }
        eVar.G0(i12, i13);
        b(i10 + 1, eVar, interfaceC0264b, z10);
    }

    public static void e(int i10, c2.e eVar, b.InterfaceC0264b interfaceC0264b, c2.e eVar2, boolean z10) {
        float fY = eVar2.y();
        int iE = eVar2.O.f4347f.e() + eVar2.O.f();
        int iE2 = eVar2.Q.f4347f.e() - eVar2.Q.f();
        if (iE2 >= iE) {
            int iW = eVar2.W();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f4403w;
                if (i11 == 2) {
                    iW = (int) (eVar2.y() * 0.5f * (eVar instanceof c2.f ? eVar.W() : eVar.K().W()));
                } else if (i11 == 0) {
                    iW = iE2 - iE;
                }
                iW = Math.max(eVar2.f4409z, iW);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    iW = Math.min(i12, iW);
                }
            }
            int i13 = iE + ((int) ((fY * ((iE2 - iE) - iW)) + 0.5f));
            eVar2.G0(i13, iW + i13);
            b(i10 + 1, eVar2, interfaceC0264b, z10);
        }
    }

    public static void f(int i10, b.InterfaceC0264b interfaceC0264b, c2.e eVar) {
        float fR = eVar.R();
        int iE = eVar.P.f4347f.e();
        int iE2 = eVar.R.f4347f.e();
        int iF = eVar.P.f() + iE;
        int iF2 = iE2 - eVar.R.f();
        if (iE == iE2) {
            fR = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iX = eVar.x();
        int i11 = (iE2 - iE) - iX;
        if (iE > iE2) {
            i11 = (iE - iE2) - iX;
        }
        int i12 = (int) (i11 > 0 ? (fR * i11) + 0.5f : fR * i11);
        int i13 = iE + i12;
        int i14 = i13 + iX;
        if (iE > iE2) {
            i13 = iE - i12;
            i14 = i13 - iX;
        }
        eVar.J0(i13, i14);
        i(i10 + 1, eVar, interfaceC0264b);
    }

    public static void g(int i10, c2.e eVar, b.InterfaceC0264b interfaceC0264b, c2.e eVar2) {
        float fR = eVar2.R();
        int iE = eVar2.P.f4347f.e() + eVar2.P.f();
        int iE2 = eVar2.R.f4347f.e() - eVar2.R.f();
        if (iE2 >= iE) {
            int iX = eVar2.x();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f4405x;
                if (i11 == 2) {
                    iX = (int) (fR * 0.5f * (eVar instanceof c2.f ? eVar.x() : eVar.K().x()));
                } else if (i11 == 0) {
                    iX = iE2 - iE;
                }
                iX = Math.max(eVar2.C, iX);
                int i12 = eVar2.D;
                if (i12 > 0) {
                    iX = Math.min(i12, iX);
                }
            }
            int i13 = iE + ((int) ((fR * ((iE2 - iE) - iX)) + 0.5f));
            eVar2.J0(i13, iX + i13);
            i(i10 + 1, eVar2, interfaceC0264b);
        }
    }

    public static void h(c2.f fVar, b.InterfaceC0264b interfaceC0264b) {
        c2.e.b bVarA = fVar.A();
        c2.e.b bVarT = fVar.T();
        b = 0;
        f14350c = 0;
        fVar.v0();
        ArrayList<c2.e> arrayListS1 = fVar.s1();
        int size = arrayListS1.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayListS1.get(i10).v0();
        }
        boolean zR1 = fVar.R1();
        if (bVarA == c2.e.b.FIXED) {
            fVar.G0(0, fVar.W());
        } else {
            fVar.H0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            c2.e eVar = arrayListS1.get(i11);
            if (eVar instanceof c2.h) {
                c2.h hVar = (c2.h) eVar;
                if (hVar.t1() == 1) {
                    if (hVar.u1() != -1) {
                        hVar.x1(hVar.u1());
                    } else if (hVar.v1() != -1 && fVar.n0()) {
                        hVar.x1(fVar.W() - hVar.v1());
                    } else if (fVar.n0()) {
                        hVar.x1((int) ((hVar.w1() * fVar.W()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof c2.a) && ((c2.a) eVar).y1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                c2.e eVar2 = arrayListS1.get(i12);
                if (eVar2 instanceof c2.h) {
                    c2.h hVar2 = (c2.h) eVar2;
                    if (hVar2.t1() == 1) {
                        b(0, hVar2, interfaceC0264b, zR1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0264b, zR1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                c2.e eVar3 = arrayListS1.get(i13);
                if (eVar3 instanceof c2.a) {
                    c2.a aVar = (c2.a) eVar3;
                    if (aVar.y1() == 0) {
                        c(0, aVar, interfaceC0264b, 0, zR1);
                    }
                }
            }
        }
        if (bVarT == c2.e.b.FIXED) {
            fVar.J0(0, fVar.x());
        } else {
            fVar.I0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            c2.e eVar4 = arrayListS1.get(i14);
            if (eVar4 instanceof c2.h) {
                c2.h hVar3 = (c2.h) eVar4;
                if (hVar3.t1() == 0) {
                    if (hVar3.u1() != -1) {
                        hVar3.x1(hVar3.u1());
                    } else if (hVar3.v1() != -1 && fVar.o0()) {
                        hVar3.x1(fVar.x() - hVar3.v1());
                    } else if (fVar.o0()) {
                        hVar3.x1((int) ((hVar3.w1() * fVar.x()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof c2.a) && ((c2.a) eVar4).y1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                c2.e eVar5 = arrayListS1.get(i15);
                if (eVar5 instanceof c2.h) {
                    c2.h hVar4 = (c2.h) eVar5;
                    if (hVar4.t1() == 0) {
                        i(1, hVar4, interfaceC0264b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0264b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                c2.e eVar6 = arrayListS1.get(i16);
                if (eVar6 instanceof c2.a) {
                    c2.a aVar2 = (c2.a) eVar6;
                    if (aVar2.y1() == 1) {
                        c(0, aVar2, interfaceC0264b, 1, zR1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            c2.e eVar7 = arrayListS1.get(i17);
            if (eVar7.m0() && a(0, eVar7)) {
                c2.f.U1(0, eVar7, interfaceC0264b, f14349a, b.a.f14307k);
                if (!(eVar7 instanceof c2.h)) {
                    b(0, eVar7, interfaceC0264b, zR1);
                    i(0, eVar7, interfaceC0264b);
                } else if (((c2.h) eVar7).t1() == 0) {
                    i(0, eVar7, interfaceC0264b);
                } else {
                    b(0, eVar7, interfaceC0264b, zR1);
                }
            }
        }
    }

    public static void i(int i10, c2.e eVar, b.InterfaceC0264b interfaceC0264b) {
        c2.d dVar;
        c2.d dVar2;
        c2.d dVar3;
        c2.d dVar4;
        if (eVar.p0()) {
            return;
        }
        boolean z10 = true;
        f14350c++;
        if (!(eVar instanceof c2.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                c2.f.U1(i11, eVar, interfaceC0264b, new b.a(), b.a.f14307k);
            }
        }
        c2.d dVarO = eVar.o(c2.d.a.TOP);
        c2.d dVarO2 = eVar.o(c2.d.a.BOTTOM);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<c2.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                c2.d next = it.next();
                c2.e eVar2 = next.f4345d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.m0() && zA) {
                    c2.f.U1(i12, eVar2, interfaceC0264b, new b.a(), b.a.f14307k);
                }
                boolean z11 = ((next == eVar2.P && (dVar4 = eVar2.R.f4347f) != null && dVar4.n()) || (next == eVar2.R && (dVar3 = eVar2.P.f4347f) != null && dVar3.n())) ? z10 : false;
                c2.e.b bVarT = eVar2.T();
                boolean z12 = z10;
                c2.e.b bVar = c2.e.b.MATCH_CONSTRAINT;
                if (bVarT != bVar || zA) {
                    if (!eVar2.m0()) {
                        c2.d dVar5 = eVar2.P;
                        if (next == dVar5 && eVar2.R.f4347f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.J0(iF, eVar2.x() + iF);
                            i(i12, eVar2, interfaceC0264b);
                        } else {
                            c2.d dVar6 = eVar2.R;
                            if (next == dVar6 && dVar5.f4347f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.J0(iF2 - eVar2.x(), iF2);
                                i(i12, eVar2, interfaceC0264b);
                            } else if (z11 && !eVar2.k0()) {
                                f(i12, interfaceC0264b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.T() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.V() == 8 || (eVar2.f4405x == 0 && eVar2.v() == 0.0f)) && !eVar2.k0() && !eVar2.l0() && z11 && !eVar2.k0())) {
                    g(i12, eVar, interfaceC0264b, eVar2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (eVar instanceof c2.h) {
            return;
        }
        if (dVarO2.d() != null && dVarO2.n()) {
            Iterator<c2.d> it2 = dVarO2.d().iterator();
            while (it2.hasNext()) {
                c2.d next2 = it2.next();
                c2.e eVar3 = next2.f4345d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.m0() && zA2) {
                    c2.f.U1(i13, eVar3, interfaceC0264b, new b.a(), b.a.f14307k);
                }
                boolean z14 = ((next2 == eVar3.P && (dVar2 = eVar3.R.f4347f) != null && dVar2.n()) || (next2 == eVar3.R && (dVar = eVar3.P.f4347f) != null && dVar.n())) ? z13 : false;
                c2.e.b bVarT2 = eVar3.T();
                c2.e.b bVar2 = c2.e.b.MATCH_CONSTRAINT;
                if (bVarT2 != bVar2 || zA2) {
                    if (!eVar3.m0()) {
                        c2.d dVar7 = eVar3.P;
                        if (next2 == dVar7 && eVar3.R.f4347f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.J0(iF3, eVar3.x() + iF3);
                            i(i13, eVar3, interfaceC0264b);
                        } else {
                            c2.d dVar8 = eVar3.R;
                            if (next2 == dVar8 && dVar7.f4347f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.J0(iF4 - eVar3.x(), iF4);
                                i(i13, eVar3, interfaceC0264b);
                            } else if (z14 && !eVar3.k0()) {
                                f(i13, interfaceC0264b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.T() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.V() == 8 || (eVar3.f4405x == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.l0() && z14 && !eVar3.k0()) {
                        g(i13, eVar, interfaceC0264b, eVar3);
                    }
                }
            }
        }
        c2.d dVarO3 = eVar.o(c2.d.a.BASELINE);
        if (dVarO3.d() != null && dVarO3.n()) {
            int iE3 = dVarO3.e();
            for (c2.d dVar9 : dVarO3.d()) {
                c2.e eVar4 = dVar9.f4345d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, eVar4);
                if (eVar4.m0() && zA3) {
                    c2.f.U1(i14, eVar4, interfaceC0264b, new b.a(), b.a.f14307k);
                }
                if (eVar4.T() != c2.e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.m0() && dVar9 == eVar4.S) {
                        eVar4.F0(dVar9.f() + iE3);
                        i(i14, eVar4, interfaceC0264b);
                    }
                }
            }
        }
        eVar.r0();
    }
}
