package d2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<c2.e> f14305a = new ArrayList<>();
    public a b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2.f f14306c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f14307k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f14308l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f14309m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c2.e.b f14310a;
        public c2.e.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f14316h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f14317i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14318j;
    }

    /* JADX INFO: renamed from: d2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0264b {
        void a();

        void b(c2.e eVar, a aVar);
    }

    public b(c2.f fVar) {
        this.f14306c = fVar;
    }

    public final boolean a(InterfaceC0264b interfaceC0264b, c2.e eVar, int i10) {
        this.b.f14310a = eVar.A();
        this.b.b = eVar.T();
        this.b.f14311c = eVar.W();
        this.b.f14312d = eVar.x();
        a aVar = this.b;
        aVar.f14317i = false;
        aVar.f14318j = i10;
        c2.e.b bVar = aVar.f14310a;
        c2.e.b bVar2 = c2.e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.b == bVar2;
        boolean z12 = z10 && eVar.f4366d0 > 0.0f;
        boolean z13 = z11 && eVar.f4366d0 > 0.0f;
        if (z12 && eVar.f4407y[0] == 4) {
            aVar.f14310a = c2.e.b.FIXED;
        }
        if (z13 && eVar.f4407y[1] == 4) {
            aVar.b = c2.e.b.FIXED;
        }
        interfaceC0264b.b(eVar, aVar);
        eVar.l1(this.b.f14313e);
        eVar.M0(this.b.f14314f);
        eVar.L0(this.b.f14316h);
        eVar.B0(this.b.f14315g);
        a aVar2 = this.b;
        aVar2.f14318j = a.f14307k;
        return aVar2.f14317i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(c2.f fVar) {
        boolean z10;
        l lVar;
        n nVar;
        int size = fVar.L0.size();
        boolean zV1 = fVar.V1(64);
        InterfaceC0264b interfaceC0264bK1 = fVar.K1();
        for (int i10 = 0; i10 < size; i10++) {
            c2.e eVar = fVar.L0.get(i10);
            if (!(eVar instanceof c2.h) && !(eVar instanceof c2.a) && !eVar.l0() && (!zV1 || (lVar = eVar.f4367e) == null || (nVar = eVar.f4369f) == null || !lVar.f14378e.f14337j || !nVar.f14378e.f14337j)) {
                c2.e.b bVarU = eVar.u(0);
                c2.e.b bVarU2 = eVar.u(1);
                c2.e.b bVar = c2.e.b.MATCH_CONSTRAINT;
                boolean z11 = bVarU == bVar && eVar.f4403w != 1 && bVarU2 == bVar && eVar.f4405x != 1;
                if (!z11 && fVar.V1(1) && !(eVar instanceof c2.l)) {
                    if (bVarU == bVar && eVar.f4403w == 0 && bVarU2 != bVar && !eVar.i0()) {
                        z11 = true;
                    }
                    if (bVarU2 == bVar && eVar.f4405x == 0 && bVarU != bVar && !eVar.i0()) {
                        z11 = true;
                    }
                    z10 = (!(bVarU == bVar || bVarU2 == bVar) || eVar.f4366d0 <= 0.0f) ? z11 : true;
                }
                if (!z10) {
                    a(interfaceC0264bK1, eVar, a.f14307k);
                }
            }
        }
        interfaceC0264bK1.a();
    }

    public final void c(c2.f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int I = fVar.I();
        int iH = fVar.H();
        fVar.b1(0);
        fVar.a1(0);
        fVar.l1(i11);
        fVar.M0(i12);
        fVar.b1(I);
        fVar.a1(iH);
        this.f14306c.Z1(i10);
        this.f14306c.t1();
    }

    public long d(c2.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zI1;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22;
        boolean z11;
        b bVar = this;
        InterfaceC0264b interfaceC0264bK1 = fVar.K1();
        int size = fVar.L0.size();
        int iW = fVar.W();
        int iX = fVar.x();
        boolean zB = c2.k.b(i10, 128);
        boolean z12 = zB || c2.k.b(i10, 64);
        if (z12) {
            for (int i23 = 0; i23 < size; i23++) {
                c2.e eVar = fVar.L0.get(i23);
                c2.e.b bVarA = eVar.A();
                c2.e.b bVar2 = c2.e.b.MATCH_CONSTRAINT;
                boolean z13 = (bVarA == bVar2) && (eVar.T() == bVar2) && eVar.v() > 0.0f;
                if ((eVar.i0() && z13) || ((eVar.k0() && z13) || (eVar instanceof c2.l) || eVar.i0() || eVar.k0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = z1.d.f37062s;
        }
        boolean z15 = z12 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i24 = 2;
        if (z15) {
            int iMin = Math.min(fVar.G(), i14);
            int iMin2 = Math.min(fVar.F(), i16);
            if (i13 == 1073741824 && fVar.W() != iMin) {
                fVar.l1(iMin);
                fVar.O1();
            }
            if (i15 == 1073741824 && fVar.x() != iMin2) {
                fVar.M0(iMin2);
                fVar.O1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zI1 = fVar.G1(zB);
                i19 = 2;
            } else {
                boolean zH1 = fVar.H1(zB);
                if (i13 == 1073741824) {
                    zH1 &= fVar.I1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zI1 = fVar.I1(zB, 1) & zH1;
                    i19++;
                } else {
                    zI1 = zH1;
                }
            }
            if (zI1) {
                fVar.q1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zI1 = false;
            i19 = 0;
        }
        if (zI1 && i19 == 2) {
            return 0L;
        }
        int iL1 = fVar.L1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f14305a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, iW, iX);
            i20 = iW;
            i21 = iX;
        } else {
            i20 = iW;
            i21 = iX;
        }
        if (size2 > 0) {
            c2.e.b bVarA2 = fVar.A();
            c2.e.b bVar3 = c2.e.b.WRAP_CONTENT;
            boolean z16 = bVarA2 == bVar3;
            boolean z17 = fVar.T() == bVar3;
            int iMax = Math.max(fVar.W(), bVar.f14306c.I());
            int iMax2 = Math.max(fVar.x(), bVar.f14306c.H());
            int i25 = 0;
            boolean zG1 = false;
            while (i25 < size2) {
                c2.e eVar2 = bVar.f14305a.get(i25);
                if (eVar2 instanceof c2.l) {
                    int iW2 = eVar2.W();
                    int iX2 = eVar2.x();
                    boolean zA = bVar.a(interfaceC0264bK1, eVar2, a.f14308l) | zG1;
                    int iW3 = eVar2.W();
                    int iX3 = eVar2.x();
                    if (iW3 != iW2) {
                        eVar2.l1(iW3);
                        if (z16 && eVar2.M() > iMax) {
                            iMax = Math.max(iMax, eVar2.M() + eVar2.o(c2.d.a.RIGHT).f());
                        }
                        z11 = true;
                    } else {
                        z11 = zA;
                    }
                    if (iX3 != iX2) {
                        eVar2.M0(iX3);
                        if (z17 && eVar2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.r() + eVar2.o(c2.d.a.BOTTOM).f());
                        }
                        z11 = true;
                    }
                    zG1 = z11 | ((c2.l) eVar2).G1();
                }
                i25++;
                i20 = i20;
                i24 = 2;
            }
            int i26 = i20;
            int i27 = i24;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = 0;
                while (i29 < size2) {
                    c2.e eVar3 = bVar.f14305a.get(i29);
                    if (((eVar3 instanceof c2.i) && !(eVar3 instanceof c2.l)) || (eVar3 instanceof c2.h) || eVar3.V() == 8 || ((z15 && eVar3.f4367e.f14378e.f14337j && eVar3.f4369f.f14378e.f14337j) || (eVar3 instanceof c2.l))) {
                        z10 = z15;
                        i22 = size2;
                    } else {
                        int iW4 = eVar3.W();
                        int iX4 = eVar3.x();
                        z10 = z15;
                        int iP = eVar3.p();
                        int i30 = a.f14308l;
                        i22 = size2;
                        if (i28 == 1) {
                            i30 = a.f14309m;
                        }
                        boolean zA2 = bVar.a(interfaceC0264bK1, eVar3, i30) | zG1;
                        int iW5 = eVar3.W();
                        int iX5 = eVar3.x();
                        if (iW5 != iW4) {
                            eVar3.l1(iW5);
                            if (z16 && eVar3.M() > iMax) {
                                iMax = Math.max(iMax, eVar3.M() + eVar3.o(c2.d.a.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iX5 != iX4) {
                            eVar3.M0(iX5);
                            if (z17 && eVar3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.r() + eVar3.o(c2.d.a.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zG1 = (!eVar3.Z() || iP == eVar3.p()) ? zA2 : true;
                    }
                    i29++;
                    bVar = this;
                    size2 = i22;
                    z15 = z10;
                }
                boolean z18 = z15;
                int i31 = size2;
                if (!zG1) {
                    break;
                }
                i28++;
                c(fVar, "intermediate pass", i28, i26, i21);
                bVar = this;
                size2 = i31;
                z15 = z18;
                i27 = 2;
                zG1 = false;
            }
        }
        fVar.Y1(iL1);
        return 0L;
    }

    public void e(c2.f fVar) {
        this.f14305a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            c2.e eVar = fVar.L0.get(i10);
            c2.e.b bVarA = eVar.A();
            c2.e.b bVar = c2.e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || eVar.T() == bVar) {
                this.f14305a.add(eVar);
            }
        }
        fVar.O1();
    }
}
