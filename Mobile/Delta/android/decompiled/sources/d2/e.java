package d2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2.f f14301a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2.f f14303d;
    public boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14302c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<p> f14304e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<m> f14305f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.InterfaceC0276b f14306g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b.a f14307h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<m> f14308i = new ArrayList<>();

    public e(c2.f fVar) {
        this.f14301a = fVar;
        this.f14303d = fVar;
    }

    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.f14311d;
        if (pVar.f14356c == null) {
            c2.f fVar4 = this.f14301a;
            if (pVar == fVar4.f4533e || pVar == fVar4.f4535f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f14356c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f14361h.f14318k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList<m> arrayList3 = arrayList;
            for (d dVar2 : pVar.f14362i.f14318k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f14340k.f14318k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f14361h.f14319l) {
                if (fVar6 == fVar5) {
                    mVar2.b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f14362i.f14319l) {
                if (fVar7 == fVar5) {
                    mVar2.b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f14340k.f14319l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i13, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0224 A[PHI: r9
      0x0224: PHI (r9v10 c2.e$b) = (r9v8 c2.e$b), (r9v11 c2.e$b) binds: [B:122:0x0263, B:115:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(c2.f fVar) {
        c2.e.b bVar;
        int i10;
        c2.e.b bVar2;
        float f10;
        float f11;
        c2.e.b bVar3;
        c2.e.b bVar4;
        c2.e.b bVar5;
        ArrayList<c2.e> arrayList = fVar.L0;
        int size = arrayList.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            c2.e eVar = arrayList.get(i11);
            i11++;
            c2.e eVar2 = eVar;
            c2.e.b[] bVarArr = eVar2.Z;
            c2.e.b bVar6 = bVarArr[c10];
            c2.e.b bVar7 = bVarArr[1];
            if (eVar2.V() == 8) {
                eVar2.f4526a = true;
            } else {
                if (eVar2.B < 1.0f && bVar6 == c2.e.b.MATCH_CONSTRAINT) {
                    eVar2.f4569w = 2;
                }
                if (eVar2.E < 1.0f && bVar7 == c2.e.b.MATCH_CONSTRAINT) {
                    eVar2.f4571x = 2;
                }
                if (eVar2.v() > 0.0f) {
                    c2.e.b bVar8 = c2.e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == c2.e.b.WRAP_CONTENT || bVar7 == c2.e.b.FIXED)) {
                        eVar2.f4569w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == c2.e.b.WRAP_CONTENT || bVar6 == c2.e.b.FIXED)) {
                        eVar2.f4571x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar2.f4569w == 0) {
                            eVar2.f4569w = 3;
                        }
                        if (eVar2.f4571x == 0) {
                            eVar2.f4571x = 3;
                        }
                    }
                }
                c2.e.b bVar9 = c2.e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar2.f4569w == 1 && (eVar2.O.f4513f == null || eVar2.Q.f4513f == null)) {
                    bVar6 = c2.e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar2.f4571x == 1 && (eVar2.P.f4513f == null || eVar2.R.f4513f == null)) {
                    bVar7 = c2.e.b.WRAP_CONTENT;
                }
                l lVar = eVar2.f4533e;
                lVar.f14357d = bVar6;
                int i12 = eVar2.f4569w;
                lVar.f14355a = i12;
                n nVar = eVar2.f4535f;
                nVar.f14357d = bVar7;
                int i13 = eVar2.f4571x;
                nVar.f14355a = i13;
                c2.e.b bVar10 = c2.e.b.MATCH_PARENT;
                char c11 = c10;
                if ((bVar6 == bVar10 || bVar6 == c2.e.b.FIXED || bVar6 == c2.e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == c2.e.b.FIXED || bVar7 == c2.e.b.WRAP_CONTENT)) {
                    c2.e.b bVar11 = bVar7;
                    c2.e.b bVar12 = bVar6;
                    int iW = eVar2.W();
                    if (bVar12 == bVar10) {
                        iW = (fVar.W() - eVar2.O.f4514g) - eVar2.Q.f4514g;
                        bVar12 = c2.e.b.FIXED;
                    }
                    int i14 = iW;
                    int iX = eVar2.x();
                    if (bVar11 == bVar10) {
                        iX = (fVar.x() - eVar2.P.f4514g) - eVar2.R.f4514g;
                        bVar11 = c2.e.b.FIXED;
                    }
                    l(eVar2, bVar12, i14, bVar11, iX);
                    eVar2.f4533e.f14358e.d(eVar2.W());
                    eVar2.f4535f.f14358e.d(eVar2.x());
                    eVar2.f4526a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        f11 = 0.5f;
                        c2.e.b bVar13 = c2.e.b.WRAP_CONTENT;
                        f10 = 1.0f;
                        if (bVar7 != bVar13 && bVar7 != c2.e.b.FIXED) {
                            bVar = bVar7;
                            i10 = 3;
                        } else if (i12 == 3) {
                            if (bVar7 == bVar13) {
                                l(eVar2, bVar13, 0, bVar13, 0);
                            }
                            int iX2 = eVar2.x();
                            int i15 = (int) ((iX2 * eVar2.f4532d0) + 0.5f);
                            c2.e.b bVar14 = c2.e.b.FIXED;
                            l(eVar2, bVar14, i15, bVar14, iX2);
                            eVar2.f4533e.f14358e.d(eVar2.W());
                            eVar2.f4535f.f14358e.d(eVar2.x());
                            eVar2.f4526a = true;
                        } else if (i12 == 1) {
                            l(eVar2, bVar13, 0, bVar7, 0);
                            eVar2.f4533e.f14358e.f14328m = eVar2.W();
                        } else {
                            bVar = bVar7;
                            i10 = 3;
                            if (i12 == 2) {
                                c2.e.b bVar15 = fVar.Z[c11];
                                c2.e.b bVar16 = c2.e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(eVar2, bVar16, (int) ((eVar2.B * fVar.W()) + 0.5f), bVar, eVar2.x());
                                    eVar2.f4533e.f14358e.d(eVar2.W());
                                    eVar2.f4535f.f14358e.d(eVar2.x());
                                    eVar2.f4526a = true;
                                }
                            } else {
                                c2.d[] dVarArr = eVar2.W;
                                if (dVarArr[c11].f4513f == null || dVarArr[1].f4513f == null) {
                                    l(eVar2, bVar13, 0, bVar, 0);
                                    eVar2.f4533e.f14358e.d(eVar2.W());
                                    eVar2.f4535f.f14358e.d(eVar2.x());
                                    eVar2.f4526a = true;
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i10 = 3;
                        bVar2 = bVar9;
                        f10 = 1.0f;
                        f11 = 0.5f;
                    }
                    if (bVar != bVar2 || (bVar6 != (bVar4 = c2.e.b.WRAP_CONTENT) && bVar6 != c2.e.b.FIXED)) {
                        bVar3 = bVar6;
                    } else if (i13 == i10) {
                        if (bVar6 == bVar4) {
                            l(eVar2, bVar4, 0, bVar4, 0);
                        }
                        int iW2 = eVar2.W();
                        float f12 = eVar2.f4532d0;
                        if (eVar2.w() == -1) {
                            f12 = f10 / f12;
                        }
                        c2.e.b bVar17 = c2.e.b.FIXED;
                        l(eVar2, bVar17, iW2, bVar17, (int) ((iW2 * f12) + f11));
                        eVar2.f4533e.f14358e.d(eVar2.W());
                        eVar2.f4535f.f14358e.d(eVar2.x());
                        eVar2.f4526a = true;
                    } else if (i13 == 1) {
                        l(eVar2, bVar6, 0, bVar4, 0);
                        eVar2.f4535f.f14358e.f14328m = eVar2.x();
                    } else {
                        bVar3 = bVar6;
                        if (i13 == 2) {
                            c2.e.b bVar18 = fVar.Z[1];
                            bVar5 = bVar;
                            c2.e.b bVar19 = c2.e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                l(eVar2, bVar3, eVar2.W(), bVar19, (int) ((eVar2.E * fVar.x()) + f11));
                                eVar2.f4533e.f14358e.d(eVar2.W());
                                eVar2.f4535f.f14358e.d(eVar2.x());
                                eVar2.f4526a = true;
                            } else {
                                bVar = bVar5;
                            }
                        } else {
                            bVar5 = bVar;
                            c2.d[] dVarArr2 = eVar2.W;
                            if (dVarArr2[2].f4513f == null || dVarArr2[i10].f4513f == null) {
                                l(eVar2, bVar4, 0, bVar5, 0);
                                eVar2.f4533e.f14358e.d(eVar2.W());
                                eVar2.f4535f.f14358e.d(eVar2.x());
                                eVar2.f4526a = true;
                            } else {
                                bVar = bVar5;
                            }
                        }
                    }
                    if (bVar3 == bVar2 && bVar == bVar2) {
                        if (i12 == 1 || i13 == 1) {
                            c2.e.b bVar20 = c2.e.b.WRAP_CONTENT;
                            l(eVar2, bVar20, 0, bVar20, 0);
                            eVar2.f4533e.f14358e.f14328m = eVar2.W();
                            eVar2.f4535f.f14358e.f14328m = eVar2.x();
                        } else if (i13 == 2 && i12 == 2) {
                            c2.e.b[] bVarArr2 = fVar.Z;
                            c2.e.b bVar21 = bVarArr2[c11];
                            c2.e.b bVar22 = c2.e.b.FIXED;
                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                l(eVar2, bVar22, (int) ((eVar2.B * fVar.W()) + f11), bVar22, (int) ((eVar2.E * fVar.x()) + f11));
                                eVar2.f4533e.f14358e.d(eVar2.W());
                                eVar2.f4535f.f14358e.d(eVar2.x());
                                eVar2.f4526a = true;
                            }
                        }
                    }
                }
                c10 = c11;
            }
        }
        return c10;
    }

    public void c() {
        d(this.f14304e);
        this.f14308i.clear();
        m.f14333h = 0;
        i(this.f14301a.f4533e, 0, this.f14308i);
        i(this.f14301a.f4535f, 1, this.f14308i);
        this.b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f14303d.f4533e.f();
        this.f14303d.f4535f.f();
        arrayList.add(this.f14303d.f4533e);
        arrayList.add(this.f14303d.f4535f);
        ArrayList<c2.e> arrayList2 = this.f14303d.L0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            c2.e eVar = arrayList2.get(i11);
            i11++;
            c2.e eVar2 = eVar;
            if (eVar2 instanceof c2.h) {
                arrayList.add(new j(eVar2));
            } else {
                if (eVar2.i0()) {
                    if (eVar2.f4529c == null) {
                        eVar2.f4529c = new c(eVar2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.f4529c);
                } else {
                    arrayList.add(eVar2.f4533e);
                }
                if (eVar2.k0()) {
                    if (eVar2.f4531d == null) {
                        eVar2.f4531d = new c(eVar2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.f4531d);
                } else {
                    arrayList.add(eVar2.f4535f);
                }
                if (eVar2 instanceof c2.j) {
                    arrayList.add(new k(eVar2));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            p pVar = arrayList.get(i12);
            i12++;
            pVar.f();
        }
        int size3 = arrayList.size();
        while (i10 < size3) {
            p pVar2 = arrayList.get(i10);
            i10++;
            p pVar3 = pVar2;
            if (pVar3.b != this.f14303d) {
                pVar3.d();
            }
        }
    }

    public final int e(c2.f fVar, int i10) {
        int size = this.f14308i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f14308i.get(i11).b(fVar, i10));
        }
        return (int) jMax;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.b || this.f14302c) {
            ArrayList<c2.e> arrayList = this.f14301a.L0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                c2.e eVar = arrayList.get(i10);
                i10++;
                c2.e eVar2 = eVar;
                eVar2.n();
                eVar2.f4526a = false;
                eVar2.f4533e.r();
                eVar2.f4535f.q();
            }
            this.f14301a.n();
            c2.f fVar = this.f14301a;
            fVar.f4526a = false;
            fVar.f4533e.r();
            this.f14301a.f4535f.q();
            this.f14302c = false;
        }
        if (b(this.f14303d)) {
            return false;
        }
        this.f14301a.n1(0);
        this.f14301a.o1(0);
        c2.e.b bVarU = this.f14301a.u(0);
        c2.e.b bVarU2 = this.f14301a.u(1);
        if (this.b) {
            c();
        }
        int iX = this.f14301a.X();
        int iY = this.f14301a.Y();
        this.f14301a.f4533e.f14361h.d(iX);
        this.f14301a.f4535f.f14361h.d(iY);
        m();
        c2.e.b bVar = c2.e.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z10) {
                ArrayList<p> arrayList2 = this.f14304e;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    p pVar = arrayList2.get(i11);
                    i11++;
                    if (!pVar.m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarU == c2.e.b.WRAP_CONTENT) {
                this.f14301a.Q0(c2.e.b.FIXED);
                c2.f fVar2 = this.f14301a;
                fVar2.l1(e(fVar2, 0));
                c2.f fVar3 = this.f14301a;
                fVar3.f4533e.f14358e.d(fVar3.W());
            }
            if (z10 && bVarU2 == c2.e.b.WRAP_CONTENT) {
                this.f14301a.h1(c2.e.b.FIXED);
                c2.f fVar4 = this.f14301a;
                fVar4.M0(e(fVar4, 1));
                c2.f fVar5 = this.f14301a;
                fVar5.f4535f.f14358e.d(fVar5.x());
            }
        }
        c2.f fVar6 = this.f14301a;
        c2.e.b bVar2 = fVar6.Z[0];
        c2.e.b bVar3 = c2.e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == c2.e.b.MATCH_PARENT) {
            int iW = fVar6.W() + iX;
            this.f14301a.f4533e.f14362i.d(iW);
            this.f14301a.f4533e.f14358e.d(iW - iX);
            m();
            c2.f fVar7 = this.f14301a;
            c2.e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == c2.e.b.MATCH_PARENT) {
                int iX2 = fVar7.x() + iY;
                this.f14301a.f4535f.f14362i.d(iX2);
                this.f14301a.f4535f.f14358e.d(iX2 - iY);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList<p> arrayList3 = this.f14304e;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            p pVar2 = arrayList3.get(i12);
            i12++;
            p pVar3 = pVar2;
            if (pVar3.b != this.f14301a || pVar3.f14360g) {
                pVar3.e();
            }
        }
        ArrayList<p> arrayList4 = this.f14304e;
        int size4 = arrayList4.size();
        int i13 = 0;
        while (i13 < size4) {
            p pVar4 = arrayList4.get(i13);
            i13++;
            p pVar5 = pVar4;
            if (z11 || pVar5.b != this.f14301a) {
                if (!pVar5.f14361h.f14317j || ((!pVar5.f14362i.f14317j && !(pVar5 instanceof j)) || (!pVar5.f14358e.f14317j && !(pVar5 instanceof c) && !(pVar5 instanceof j)))) {
                    this.f14301a.Q0(bVarU);
                    this.f14301a.h1(bVarU2);
                    return z12;
                }
            }
        }
        z12 = true;
        this.f14301a.Q0(bVarU);
        this.f14301a.h1(bVarU2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.b) {
            ArrayList<c2.e> arrayList = this.f14301a.L0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                c2.e eVar = arrayList.get(i10);
                i10++;
                c2.e eVar2 = eVar;
                eVar2.n();
                eVar2.f4526a = false;
                l lVar = eVar2.f4533e;
                lVar.f14358e.f14317j = false;
                lVar.f14360g = false;
                lVar.r();
                n nVar = eVar2.f4535f;
                nVar.f14358e.f14317j = false;
                nVar.f14360g = false;
                nVar.q();
            }
            this.f14301a.n();
            c2.f fVar = this.f14301a;
            fVar.f4526a = false;
            l lVar2 = fVar.f4533e;
            lVar2.f14358e.f14317j = false;
            lVar2.f14360g = false;
            lVar2.r();
            n nVar2 = this.f14301a.f4535f;
            nVar2.f14358e.f14317j = false;
            nVar2.f14360g = false;
            nVar2.q();
            c();
        }
        if (b(this.f14303d)) {
            return false;
        }
        this.f14301a.n1(0);
        this.f14301a.o1(0);
        this.f14301a.f4533e.f14361h.d(0);
        this.f14301a.f4535f.f14361h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    public boolean h(boolean z10, int i10) {
        boolean z11;
        c2.e.b bVar;
        boolean z12 = false;
        c2.e.b bVarU = this.f14301a.u(0);
        c2.e.b bVarU2 = this.f14301a.u(1);
        int iX = this.f14301a.X();
        int iY = this.f14301a.Y();
        if (z10 && (bVarU == (bVar = c2.e.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            ArrayList<p> arrayList = this.f14304e;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                p pVar = arrayList.get(i11);
                i11++;
                p pVar2 = pVar;
                if (pVar2.f14359f == i10 && !pVar2.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarU == c2.e.b.WRAP_CONTENT) {
                    this.f14301a.Q0(c2.e.b.FIXED);
                    c2.f fVar = this.f14301a;
                    fVar.l1(e(fVar, 0));
                    c2.f fVar2 = this.f14301a;
                    fVar2.f4533e.f14358e.d(fVar2.W());
                }
            } else if (z10 && bVarU2 == c2.e.b.WRAP_CONTENT) {
                this.f14301a.h1(c2.e.b.FIXED);
                c2.f fVar3 = this.f14301a;
                fVar3.M0(e(fVar3, 1));
                c2.f fVar4 = this.f14301a;
                fVar4.f4535f.f14358e.d(fVar4.x());
            }
        }
        if (i10 == 0) {
            c2.f fVar5 = this.f14301a;
            c2.e.b bVar2 = fVar5.Z[0];
            if (bVar2 == c2.e.b.FIXED || bVar2 == c2.e.b.MATCH_PARENT) {
                int iW = fVar5.W() + iX;
                this.f14301a.f4533e.f14362i.d(iW);
                this.f14301a.f4533e.f14358e.d(iW - iX);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            c2.f fVar6 = this.f14301a;
            c2.e.b bVar3 = fVar6.Z[1];
            if (bVar3 == c2.e.b.FIXED || bVar3 == c2.e.b.MATCH_PARENT) {
                int iX2 = fVar6.x() + iY;
                this.f14301a.f4535f.f14362i.d(iX2);
                this.f14301a.f4535f.f14358e.d(iX2 - iY);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        m();
        ArrayList<p> arrayList2 = this.f14304e;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            p pVar3 = arrayList2.get(i12);
            i12++;
            p pVar4 = pVar3;
            if (pVar4.f14359f == i10 && (pVar4.b != this.f14301a || pVar4.f14360g)) {
                pVar4.e();
            }
        }
        ArrayList<p> arrayList3 = this.f14304e;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            p pVar5 = arrayList3.get(i13);
            i13++;
            p pVar6 = pVar5;
            if (pVar6.f14359f == i10 && (z11 || pVar6.b != this.f14301a)) {
                if (!pVar6.f14361h.f14317j || !pVar6.f14362i.f14317j || (!(pVar6 instanceof c) && !pVar6.f14358e.f14317j)) {
                    this.f14301a.Q0(bVarU);
                    this.f14301a.h1(bVarU2);
                    return z12;
                }
            }
        }
        z12 = true;
        this.f14301a.Q0(bVarU);
        this.f14301a.h1(bVarU2);
        return z12;
    }

    public final void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f14361h.f14318k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f14362i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f14361h, i10, 0, pVar.f14362i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f14362i.f14318k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f14361h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f14362i, i10, 1, pVar.f14361h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f14340k.f14318k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.f14302c = true;
    }

    public final void l(c2.e eVar, c2.e.b bVar, int i10, c2.e.b bVar2, int i11) {
        b.a aVar = this.f14307h;
        aVar.f14290a = bVar;
        aVar.b = bVar2;
        aVar.f14291c = i10;
        aVar.f14292d = i11;
        this.f14306g.b(eVar, aVar);
        eVar.l1(this.f14307h.f14293e);
        eVar.M0(this.f14307h.f14294f);
        eVar.L0(this.f14307h.f14296h);
        eVar.B0(this.f14307h.f14295g);
    }

    public void m() {
        g gVar;
        ArrayList<c2.e> arrayList = this.f14301a.L0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            c2.e eVar = arrayList.get(i10);
            i10++;
            c2.e eVar2 = eVar;
            if (!eVar2.f4526a) {
                c2.e.b[] bVarArr = eVar2.Z;
                c2.e.b bVar = bVarArr[0];
                c2.e.b bVar2 = bVarArr[1];
                int i11 = eVar2.f4569w;
                int i12 = eVar2.f4571x;
                c2.e.b bVar3 = c2.e.b.WRAP_CONTENT;
                boolean z10 = bVar == bVar3 || (bVar == c2.e.b.MATCH_CONSTRAINT && i11 == 1);
                boolean z11 = bVar2 == bVar3 || (bVar2 == c2.e.b.MATCH_CONSTRAINT && i12 == 1);
                g gVar2 = eVar2.f4533e.f14358e;
                boolean z12 = gVar2.f14317j;
                g gVar3 = eVar2.f4535f.f14358e;
                boolean z13 = gVar3.f14317j;
                if (z12 && z13) {
                    c2.e.b bVar4 = c2.e.b.FIXED;
                    l(eVar2, bVar4, gVar2.f14314g, bVar4, gVar3.f14314g);
                    eVar2.f4526a = true;
                } else if (z12 && z11) {
                    l(eVar2, c2.e.b.FIXED, gVar2.f14314g, bVar3, gVar3.f14314g);
                    if (bVar2 == c2.e.b.MATCH_CONSTRAINT) {
                        eVar2.f4535f.f14358e.f14328m = eVar2.x();
                    } else {
                        eVar2.f4535f.f14358e.d(eVar2.x());
                        eVar2.f4526a = true;
                    }
                } else if (z13 && z10) {
                    l(eVar2, bVar3, gVar2.f14314g, c2.e.b.FIXED, gVar3.f14314g);
                    if (bVar == c2.e.b.MATCH_CONSTRAINT) {
                        eVar2.f4533e.f14358e.f14328m = eVar2.W();
                    } else {
                        eVar2.f4533e.f14358e.d(eVar2.W());
                        eVar2.f4526a = true;
                    }
                }
                if (eVar2.f4526a && (gVar = eVar2.f4535f.f14341l) != null) {
                    gVar.d(eVar2.p());
                }
            }
        }
    }

    public void n(b.InterfaceC0276b interfaceC0276b) {
        this.f14306g = interfaceC0276b;
    }
}
