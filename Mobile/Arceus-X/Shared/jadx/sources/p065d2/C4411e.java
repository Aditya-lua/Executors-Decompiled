package p065d2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.C1513f;
import p038c2.C1515h;
import p038c2.C1517j;

/* JADX INFO: renamed from: d2.e */
/* JADX INFO: loaded from: classes.dex */
public class C4411e {

    /* JADX INFO: renamed from: a */
    public C1513f f18317a;

    /* JADX INFO: renamed from: d */
    public C1513f f18320d;

    /* JADX INFO: renamed from: b */
    public boolean f18318b = true;

    /* JADX INFO: renamed from: c */
    public boolean f18319c = true;

    /* JADX INFO: renamed from: e */
    public ArrayList<AbstractC4422p> f18321e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public ArrayList<C4419m> f18322f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public C4408b.b f18323g = null;

    /* JADX INFO: renamed from: h */
    public C4408b.a f18324h = new C4408b.a();

    /* JADX INFO: renamed from: i */
    public ArrayList<C4419m> f18325i = new ArrayList<>();

    public C4411e(C1513f c1513f) {
        this.f18317a = c1513f;
        this.f18320d = c1513f;
    }

    /* JADX INFO: renamed from: a */
    public final void m22162a(C4412f c4412f, int i10, int i11, C4412f c4412f2, ArrayList<C4419m> arrayList, C4419m c4419m) {
        int i12;
        C4412f c4412f3;
        ArrayList<C4419m> arrayList2;
        AbstractC4422p abstractC4422p = c4412f.f18329d;
        if (abstractC4422p.f18380c == null) {
            C1513f c1513f = this.f18317a;
            if (abstractC4422p == c1513f.f5877e || abstractC4422p == c1513f.f5879f) {
                return;
            }
            if (c4419m == null) {
                c4419m = new C4419m(abstractC4422p, i11);
                arrayList.add(c4419m);
            }
            C4419m c4419m2 = c4419m;
            abstractC4422p.f18380c = c4419m2;
            c4419m2.m22197a(abstractC4422p);
            for (InterfaceC4410d interfaceC4410d : abstractC4422p.f18385h.f18336k) {
                if (interfaceC4410d instanceof C4412f) {
                    i12 = i10;
                    c4412f3 = c4412f2;
                    arrayList2 = arrayList;
                    m22162a((C4412f) interfaceC4410d, i12, 0, c4412f3, arrayList2, c4419m2);
                } else {
                    i12 = i10;
                    c4412f3 = c4412f2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                c4412f2 = c4412f3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            C4412f c4412f4 = c4412f2;
            ArrayList<C4419m> arrayList3 = arrayList;
            for (InterfaceC4410d interfaceC4410d2 : abstractC4422p.f18386i.f18336k) {
                if (interfaceC4410d2 instanceof C4412f) {
                    m22162a((C4412f) interfaceC4410d2, i13, 1, c4412f4, arrayList3, c4419m2);
                }
            }
            if (i13 == 1 && (abstractC4422p instanceof C4420n)) {
                for (InterfaceC4410d interfaceC4410d3 : ((C4420n) abstractC4422p).f18361k.f18336k) {
                    if (interfaceC4410d3 instanceof C4412f) {
                        m22162a((C4412f) interfaceC4410d3, i13, 2, c4412f4, arrayList3, c4419m2);
                    }
                }
            }
            for (C4412f c4412f5 : abstractC4422p.f18385h.f18337l) {
                if (c4412f5 == c4412f4) {
                    c4419m2.f18355b = true;
                }
                m22162a(c4412f5, i13, 0, c4412f4, arrayList3, c4419m2);
            }
            for (C4412f c4412f6 : abstractC4422p.f18386i.f18337l) {
                if (c4412f6 == c4412f4) {
                    c4419m2.f18355b = true;
                }
                m22162a(c4412f6, i13, 1, c4412f4, arrayList3, c4419m2);
            }
            if (i13 == 1 && (abstractC4422p instanceof C4420n)) {
                Iterator<C4412f> it = ((C4420n) abstractC4422p).f18361k.f18337l.iterator();
                while (it.hasNext()) {
                    m22162a(it.next(), i13, 2, c4412f4, arrayList3, c4419m2);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: boolean */
    /* JADX WARN: Code duplicated, block: B:117:0x0224 A[PHI: r9
      0x0224: PHI (r9v10 c2.e$b) = (r9v8 c2.e$b), (r9v11 c2.e$b) binds: [B:122:0x0263, B:115:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m22163b(C1513f c1513f) {
        C1512e.b bVar;
        int i10;
        C1512e.b bVar2;
        float f10;
        float f11;
        C1512e.b bVar3;
        C1512e.b bVar4;
        C1512e.b bVar5;
        ArrayList<C1512e> arrayList = c1513f.f6025L0;
        int size = arrayList.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            C1512e c1512e = arrayList.get(i11);
            i11++;
            C1512e c1512e2 = c1512e;
            C1512e.b[] bVarArr = c1512e2.f5868Z;
            C1512e.b bVar6 = bVarArr[c10];
            C1512e.b bVar7 = bVarArr[1];
            if (c1512e2.m7745V() == 8) {
                c1512e2.f5869a = true;
            } else {
                if (c1512e2.f5835B < 1.0f && bVar6 == C1512e.b.MATCH_CONSTRAINT) {
                    c1512e2.f5913w = 2;
                }
                if (c1512e2.f5841E < 1.0f && bVar7 == C1512e.b.MATCH_CONSTRAINT) {
                    c1512e2.f5915x = 2;
                }
                if (c1512e2.m7808v() > 0.0f) {
                    C1512e.b bVar8 = C1512e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == C1512e.b.WRAP_CONTENT || bVar7 == C1512e.b.FIXED)) {
                        c1512e2.f5913w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == C1512e.b.WRAP_CONTENT || bVar6 == C1512e.b.FIXED)) {
                        c1512e2.f5915x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (c1512e2.f5913w == 0) {
                            c1512e2.f5913w = 3;
                        }
                        if (c1512e2.f5915x == 0) {
                            c1512e2.f5915x = 3;
                        }
                    }
                }
                C1512e.b bVar9 = C1512e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && c1512e2.f5913w == 1 && (c1512e2.f5857O.f5818f == null || c1512e2.f5859Q.f5818f == null)) {
                    bVar6 = C1512e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && c1512e2.f5915x == 1 && (c1512e2.f5858P.f5818f == null || c1512e2.f5860R.f5818f == null)) {
                    bVar7 = C1512e.b.WRAP_CONTENT;
                }
                C4418l c4418l = c1512e2.f5877e;
                c4418l.f18381d = bVar6;
                int i12 = c1512e2.f5913w;
                c4418l.f18378a = i12;
                C4420n c4420n = c1512e2.f5879f;
                c4420n.f18381d = bVar7;
                int i13 = c1512e2.f5915x;
                c4420n.f18378a = i13;
                C1512e.b bVar10 = C1512e.b.MATCH_PARENT;
                char c11 = c10;
                if ((bVar6 == bVar10 || bVar6 == C1512e.b.FIXED || bVar6 == C1512e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == C1512e.b.FIXED || bVar7 == C1512e.b.WRAP_CONTENT)) {
                    C1512e.b bVar11 = bVar7;
                    C1512e.b bVar12 = bVar6;
                    int iM7747W = c1512e2.m7747W();
                    if (bVar12 == bVar10) {
                        iM7747W = (c1513f.m7747W() - c1512e2.f5857O.f5819g) - c1512e2.f5859Q.f5819g;
                        bVar12 = C1512e.b.FIXED;
                    }
                    int i14 = iM7747W;
                    int iM7812x = c1512e2.m7812x();
                    if (bVar11 == bVar10) {
                        iM7812x = (c1513f.m7812x() - c1512e2.f5858P.f5819g) - c1512e2.f5860R.f5819g;
                        bVar11 = C1512e.b.FIXED;
                    }
                    m22173l(c1512e2, bVar12, i14, bVar11, iM7812x);
                    c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                    c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                    c1512e2.f5869a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        f11 = 0.5f;
                        C1512e.b bVar13 = C1512e.b.WRAP_CONTENT;
                        f10 = 1.0f;
                        if (bVar7 != bVar13 && bVar7 != C1512e.b.FIXED) {
                            bVar = bVar7;
                            i10 = 3;
                        } else if (i12 == 3) {
                            if (bVar7 == bVar13) {
                                m22173l(c1512e2, bVar13, 0, bVar13, 0);
                            }
                            int iM7812x2 = c1512e2.m7812x();
                            int i15 = (int) ((iM7812x2 * c1512e2.f5876d0) + 0.5f);
                            C1512e.b bVar14 = C1512e.b.FIXED;
                            m22173l(c1512e2, bVar14, i15, bVar14, iM7812x2);
                            c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                            c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                            c1512e2.f5869a = true;
                        } else if (i12 == 1) {
                            m22173l(c1512e2, bVar13, 0, bVar7, 0);
                            c1512e2.f5877e.f18382e.f18347m = c1512e2.m7747W();
                        } else {
                            bVar = bVar7;
                            i10 = 3;
                            if (i12 == 2) {
                                C1512e.b bVar15 = c1513f.f5868Z[c11];
                                C1512e.b bVar16 = C1512e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    m22173l(c1512e2, bVar16, (int) ((c1512e2.f5835B * c1513f.m7747W()) + 0.5f), bVar, c1512e2.m7812x());
                                    c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                                    c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                                    c1512e2.f5869a = true;
                                }
                            } else {
                                C1511d[] c1511dArr = c1512e2.f5865W;
                                if (c1511dArr[c11].f5818f == null || c1511dArr[1].f5818f == null) {
                                    m22173l(c1512e2, bVar13, 0, bVar, 0);
                                    c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                                    c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                                    c1512e2.f5869a = true;
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
                    if (bVar != bVar2 || (bVar6 != (bVar4 = C1512e.b.WRAP_CONTENT) && bVar6 != C1512e.b.FIXED)) {
                        bVar3 = bVar6;
                    } else if (i13 == i10) {
                        if (bVar6 == bVar4) {
                            m22173l(c1512e2, bVar4, 0, bVar4, 0);
                        }
                        int iM7747W2 = c1512e2.m7747W();
                        float f12 = c1512e2.f5876d0;
                        if (c1512e2.m7810w() == -1) {
                            f12 = f10 / f12;
                        }
                        C1512e.b bVar17 = C1512e.b.FIXED;
                        m22173l(c1512e2, bVar17, iM7747W2, bVar17, (int) ((iM7747W2 * f12) + f11));
                        c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                        c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                        c1512e2.f5869a = true;
                    } else if (i13 == 1) {
                        m22173l(c1512e2, bVar6, 0, bVar4, 0);
                        c1512e2.f5879f.f18382e.f18347m = c1512e2.m7812x();
                    } else {
                        bVar3 = bVar6;
                        if (i13 == 2) {
                            C1512e.b bVar18 = c1513f.f5868Z[1];
                            bVar5 = bVar;
                            C1512e.b bVar19 = C1512e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                m22173l(c1512e2, bVar3, c1512e2.m7747W(), bVar19, (int) ((c1512e2.f5841E * c1513f.m7812x()) + f11));
                                c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                                c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                                c1512e2.f5869a = true;
                            } else {
                                bVar = bVar5;
                            }
                        } else {
                            bVar5 = bVar;
                            C1511d[] c1511dArr2 = c1512e2.f5865W;
                            if (c1511dArr2[2].f5818f == null || c1511dArr2[i10].f5818f == null) {
                                m22173l(c1512e2, bVar4, 0, bVar5, 0);
                                c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                                c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                                c1512e2.f5869a = true;
                            } else {
                                bVar = bVar5;
                            }
                        }
                    }
                    if (bVar3 == bVar2 && bVar == bVar2) {
                        if (i12 == 1 || i13 == 1) {
                            C1512e.b bVar20 = C1512e.b.WRAP_CONTENT;
                            m22173l(c1512e2, bVar20, 0, bVar20, 0);
                            c1512e2.f5877e.f18382e.f18347m = c1512e2.m7747W();
                            c1512e2.f5879f.f18382e.f18347m = c1512e2.m7812x();
                        } else if (i13 == 2 && i12 == 2) {
                            C1512e.b[] bVarArr2 = c1513f.f5868Z;
                            C1512e.b bVar21 = bVarArr2[c11];
                            C1512e.b bVar22 = C1512e.b.FIXED;
                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                m22173l(c1512e2, bVar22, (int) ((c1512e2.f5835B * c1513f.m7747W()) + f11), bVar22, (int) ((c1512e2.f5841E * c1513f.m7812x()) + f11));
                                c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                                c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                                c1512e2.f5869a = true;
                            }
                        }
                    }
                }
                c10 = c11;
            }
        }
        return c10;
    }

    /* JADX INFO: renamed from: c */
    public void m22164c() {
        m22165d(this.f18321e);
        this.f18325i.clear();
        C4419m.f18353h = 0;
        m22170i(this.f18317a.f5877e, 0, this.f18325i);
        m22170i(this.f18317a.f5879f, 1, this.f18325i);
        this.f18318b = false;
    }

    /* JADX INFO: renamed from: d */
    public void m22165d(ArrayList<AbstractC4422p> arrayList) {
        arrayList.clear();
        this.f18320d.f5877e.mo22156f();
        this.f18320d.f5879f.mo22156f();
        arrayList.add(this.f18320d.f5877e);
        arrayList.add(this.f18320d.f5879f);
        ArrayList<C1512e> arrayList2 = this.f18320d.f6025L0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            C1512e c1512e = arrayList2.get(i11);
            i11++;
            C1512e c1512e2 = c1512e;
            if (c1512e2 instanceof C1515h) {
                arrayList.add(new C4416j(c1512e2));
            } else {
                if (c1512e2.m7775i0()) {
                    if (c1512e2.f5873c == null) {
                        c1512e2.f5873c = new C4409c(c1512e2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1512e2.f5873c);
                } else {
                    arrayList.add(c1512e2.f5877e);
                }
                if (c1512e2.m7781k0()) {
                    if (c1512e2.f5875d == null) {
                        c1512e2.f5875d = new C4409c(c1512e2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1512e2.f5875d);
                } else {
                    arrayList.add(c1512e2.f5879f);
                }
                if (c1512e2 instanceof C1517j) {
                    arrayList.add(new C4417k(c1512e2));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            AbstractC4422p abstractC4422p = arrayList.get(i12);
            i12++;
            abstractC4422p.mo22156f();
        }
        int size3 = arrayList.size();
        while (i10 < size3) {
            AbstractC4422p abstractC4422p2 = arrayList.get(i10);
            i10++;
            AbstractC4422p abstractC4422p3 = abstractC4422p2;
            if (abstractC4422p3.f18379b != this.f18320d) {
                abstractC4422p3.mo22154d();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m22166e(C1513f c1513f, int i10) {
        int size = this.f18325i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f18325i.get(i11).m22198b(c1513f, i10));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22167f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f18318b || this.f18319c) {
            ArrayList<C1512e> arrayList = this.f18317a.f6025L0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                C1512e c1512e = arrayList.get(i10);
                i10++;
                C1512e c1512e2 = c1512e;
                c1512e2.m7789n();
                c1512e2.f5869a = false;
                c1512e2.f5877e.m22196r();
                c1512e2.f5879f.m22201q();
            }
            this.f18317a.m7789n();
            C1513f c1513f = this.f18317a;
            c1513f.f5869a = false;
            c1513f.f5877e.m22196r();
            this.f18317a.f5879f.m22201q();
            this.f18319c = false;
        }
        if (m22163b(this.f18320d)) {
            return false;
        }
        this.f18317a.m7790n1(0);
        this.f18317a.m7792o1(0);
        C1512e.b bVarM7806u = this.f18317a.m7806u(0);
        C1512e.b bVarM7806u2 = this.f18317a.m7806u(1);
        if (this.f18318b) {
            m22164c();
        }
        int iM7749X = this.f18317a.m7749X();
        int iM7751Y = this.f18317a.m7751Y();
        this.f18317a.f5877e.f18385h.mo22178d(iM7749X);
        this.f18317a.f5879f.f18385h.mo22178d(iM7751Y);
        m22174m();
        C1512e.b bVar = C1512e.b.WRAP_CONTENT;
        if (bVarM7806u == bVar || bVarM7806u2 == bVar) {
            if (z10) {
                ArrayList<AbstractC4422p> arrayList2 = this.f18321e;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    AbstractC4422p abstractC4422p = arrayList2.get(i11);
                    i11++;
                    if (!abstractC4422p.mo22158m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarM7806u == C1512e.b.WRAP_CONTENT) {
                this.f18317a.m7736Q0(C1512e.b.FIXED);
                C1513f c1513f2 = this.f18317a;
                c1513f2.m7785l1(m22166e(c1513f2, 0));
                C1513f c1513f3 = this.f18317a;
                c1513f3.f5877e.f18382e.mo22178d(c1513f3.m7747W());
            }
            if (z10 && bVarM7806u2 == C1512e.b.WRAP_CONTENT) {
                this.f18317a.m7773h1(C1512e.b.FIXED);
                C1513f c1513f4 = this.f18317a;
                c1513f4.m7728M0(m22166e(c1513f4, 1));
                C1513f c1513f5 = this.f18317a;
                c1513f5.f5879f.f18382e.mo22178d(c1513f5.m7812x());
            }
        }
        C1513f c1513f6 = this.f18317a;
        C1512e.b bVar2 = c1513f6.f5868Z[0];
        C1512e.b bVar3 = C1512e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C1512e.b.MATCH_PARENT) {
            int iM7747W = c1513f6.m7747W() + iM7749X;
            this.f18317a.f5877e.f18386i.mo22178d(iM7747W);
            this.f18317a.f5877e.f18382e.mo22178d(iM7747W - iM7749X);
            m22174m();
            C1513f c1513f7 = this.f18317a;
            C1512e.b bVar4 = c1513f7.f5868Z[1];
            if (bVar4 == bVar3 || bVar4 == C1512e.b.MATCH_PARENT) {
                int iM7812x = c1513f7.m7812x() + iM7751Y;
                this.f18317a.f5879f.f18386i.mo22178d(iM7812x);
                this.f18317a.f5879f.f18382e.mo22178d(iM7812x - iM7751Y);
            }
            m22174m();
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList<AbstractC4422p> arrayList3 = this.f18321e;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            AbstractC4422p abstractC4422p2 = arrayList3.get(i12);
            i12++;
            AbstractC4422p abstractC4422p3 = abstractC4422p2;
            if (abstractC4422p3.f18379b != this.f18317a || abstractC4422p3.f18384g) {
                abstractC4422p3.mo22155e();
            }
        }
        ArrayList<AbstractC4422p> arrayList4 = this.f18321e;
        int size4 = arrayList4.size();
        int i13 = 0;
        while (i13 < size4) {
            AbstractC4422p abstractC4422p4 = arrayList4.get(i13);
            i13++;
            AbstractC4422p abstractC4422p5 = abstractC4422p4;
            if (z11 || abstractC4422p5.f18379b != this.f18317a) {
                if (!abstractC4422p5.f18385h.f18335j || ((!abstractC4422p5.f18386i.f18335j && !(abstractC4422p5 instanceof C4416j)) || (!abstractC4422p5.f18382e.f18335j && !(abstractC4422p5 instanceof C4409c) && !(abstractC4422p5 instanceof C4416j)))) {
                    this.f18317a.m7736Q0(bVarM7806u);
                    this.f18317a.m7773h1(bVarM7806u2);
                    return z12;
                }
            }
        }
        z12 = true;
        this.f18317a.m7736Q0(bVarM7806u);
        this.f18317a.m7773h1(bVarM7806u2);
        return z12;
    }

    /* JADX INFO: renamed from: g */
    public boolean m22168g(boolean z10) {
        if (this.f18318b) {
            ArrayList<C1512e> arrayList = this.f18317a.f6025L0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                C1512e c1512e = arrayList.get(i10);
                i10++;
                C1512e c1512e2 = c1512e;
                c1512e2.m7789n();
                c1512e2.f5869a = false;
                C4418l c4418l = c1512e2.f5877e;
                c4418l.f18382e.f18335j = false;
                c4418l.f18384g = false;
                c4418l.m22196r();
                C4420n c4420n = c1512e2.f5879f;
                c4420n.f18382e.f18335j = false;
                c4420n.f18384g = false;
                c4420n.m22201q();
            }
            this.f18317a.m7789n();
            C1513f c1513f = this.f18317a;
            c1513f.f5869a = false;
            C4418l c4418l2 = c1513f.f5877e;
            c4418l2.f18382e.f18335j = false;
            c4418l2.f18384g = false;
            c4418l2.m22196r();
            C4420n c4420n2 = this.f18317a.f5879f;
            c4420n2.f18382e.f18335j = false;
            c4420n2.f18384g = false;
            c4420n2.m22201q();
            m22164c();
        }
        if (m22163b(this.f18320d)) {
            return false;
        }
        this.f18317a.m7790n1(0);
        this.f18317a.m7792o1(0);
        this.f18317a.f5877e.f18385h.mo22178d(0);
        this.f18317a.f5879f.f18385h.mo22178d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX INFO: renamed from: h */
    public boolean m22169h(boolean z10, int i10) {
        boolean z11;
        C1512e.b bVar;
        boolean z12 = false;
        C1512e.b bVarM7806u = this.f18317a.m7806u(0);
        C1512e.b bVarM7806u2 = this.f18317a.m7806u(1);
        int iM7749X = this.f18317a.m7749X();
        int iM7751Y = this.f18317a.m7751Y();
        if (z10 && (bVarM7806u == (bVar = C1512e.b.WRAP_CONTENT) || bVarM7806u2 == bVar)) {
            ArrayList<AbstractC4422p> arrayList = this.f18321e;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                AbstractC4422p abstractC4422p = arrayList.get(i11);
                i11++;
                AbstractC4422p abstractC4422p2 = abstractC4422p;
                if (abstractC4422p2.f18383f == i10 && !abstractC4422p2.mo22158m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarM7806u == C1512e.b.WRAP_CONTENT) {
                    this.f18317a.m7736Q0(C1512e.b.FIXED);
                    C1513f c1513f = this.f18317a;
                    c1513f.m7785l1(m22166e(c1513f, 0));
                    C1513f c1513f2 = this.f18317a;
                    c1513f2.f5877e.f18382e.mo22178d(c1513f2.m7747W());
                }
            } else if (z10 && bVarM7806u2 == C1512e.b.WRAP_CONTENT) {
                this.f18317a.m7773h1(C1512e.b.FIXED);
                C1513f c1513f3 = this.f18317a;
                c1513f3.m7728M0(m22166e(c1513f3, 1));
                C1513f c1513f4 = this.f18317a;
                c1513f4.f5879f.f18382e.mo22178d(c1513f4.m7812x());
            }
        }
        if (i10 == 0) {
            C1513f c1513f5 = this.f18317a;
            C1512e.b bVar2 = c1513f5.f5868Z[0];
            if (bVar2 == C1512e.b.FIXED || bVar2 == C1512e.b.MATCH_PARENT) {
                int iM7747W = c1513f5.m7747W() + iM7749X;
                this.f18317a.f5877e.f18386i.mo22178d(iM7747W);
                this.f18317a.f5877e.f18382e.mo22178d(iM7747W - iM7749X);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            C1513f c1513f6 = this.f18317a;
            C1512e.b bVar3 = c1513f6.f5868Z[1];
            if (bVar3 == C1512e.b.FIXED || bVar3 == C1512e.b.MATCH_PARENT) {
                int iM7812x = c1513f6.m7812x() + iM7751Y;
                this.f18317a.f5879f.f18386i.mo22178d(iM7812x);
                this.f18317a.f5879f.f18382e.mo22178d(iM7812x - iM7751Y);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        m22174m();
        ArrayList<AbstractC4422p> arrayList2 = this.f18321e;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            AbstractC4422p abstractC4422p3 = arrayList2.get(i12);
            i12++;
            AbstractC4422p abstractC4422p4 = abstractC4422p3;
            if (abstractC4422p4.f18383f == i10 && (abstractC4422p4.f18379b != this.f18317a || abstractC4422p4.f18384g)) {
                abstractC4422p4.mo22155e();
            }
        }
        ArrayList<AbstractC4422p> arrayList3 = this.f18321e;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            AbstractC4422p abstractC4422p5 = arrayList3.get(i13);
            i13++;
            AbstractC4422p abstractC4422p6 = abstractC4422p5;
            if (abstractC4422p6.f18383f == i10 && (z11 || abstractC4422p6.f18379b != this.f18317a)) {
                if (!abstractC4422p6.f18385h.f18335j || !abstractC4422p6.f18386i.f18335j || (!(abstractC4422p6 instanceof C4409c) && !abstractC4422p6.f18382e.f18335j)) {
                    this.f18317a.m7736Q0(bVarM7806u);
                    this.f18317a.m7773h1(bVarM7806u2);
                    return z12;
                }
            }
        }
        z12 = true;
        this.f18317a.m7736Q0(bVarM7806u);
        this.f18317a.m7773h1(bVarM7806u2);
        return z12;
    }

    /* JADX INFO: renamed from: i */
    public final void m22170i(AbstractC4422p abstractC4422p, int i10, ArrayList<C4419m> arrayList) {
        for (InterfaceC4410d interfaceC4410d : abstractC4422p.f18385h.f18336k) {
            if (interfaceC4410d instanceof C4412f) {
                m22162a((C4412f) interfaceC4410d, i10, 0, abstractC4422p.f18386i, arrayList, null);
            } else if (interfaceC4410d instanceof AbstractC4422p) {
                m22162a(((AbstractC4422p) interfaceC4410d).f18385h, i10, 0, abstractC4422p.f18386i, arrayList, null);
            }
        }
        for (InterfaceC4410d interfaceC4410d2 : abstractC4422p.f18386i.f18336k) {
            if (interfaceC4410d2 instanceof C4412f) {
                m22162a((C4412f) interfaceC4410d2, i10, 1, abstractC4422p.f18385h, arrayList, null);
            } else if (interfaceC4410d2 instanceof AbstractC4422p) {
                m22162a(((AbstractC4422p) interfaceC4410d2).f18386i, i10, 1, abstractC4422p.f18385h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (InterfaceC4410d interfaceC4410d3 : ((C4420n) abstractC4422p).f18361k.f18336k) {
                if (interfaceC4410d3 instanceof C4412f) {
                    m22162a((C4412f) interfaceC4410d3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m22171j() {
        this.f18318b = true;
    }

    /* JADX INFO: renamed from: k */
    public void m22172k() {
        this.f18319c = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m22173l(C1512e c1512e, C1512e.b bVar, int i10, C1512e.b bVar2, int i11) {
        C4408b.a aVar = this.f18324h;
        aVar.f18305a = bVar;
        aVar.f18306b = bVar2;
        aVar.f18307c = i10;
        aVar.f18308d = i11;
        this.f18323g.mo2467b(c1512e, aVar);
        c1512e.m7785l1(this.f18324h.f18309e);
        c1512e.m7728M0(this.f18324h.f18310f);
        c1512e.m7726L0(this.f18324h.f18312h);
        c1512e.m7706B0(this.f18324h.f18311g);
    }

    /* JADX INFO: renamed from: m */
    public void m22174m() {
        C4413g c4413g;
        ArrayList<C1512e> arrayList = this.f18317a.f6025L0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            C1512e c1512e = arrayList.get(i10);
            i10++;
            C1512e c1512e2 = c1512e;
            if (!c1512e2.f5869a) {
                C1512e.b[] bVarArr = c1512e2.f5868Z;
                C1512e.b bVar = bVarArr[0];
                C1512e.b bVar2 = bVarArr[1];
                int i11 = c1512e2.f5913w;
                int i12 = c1512e2.f5915x;
                C1512e.b bVar3 = C1512e.b.WRAP_CONTENT;
                boolean z10 = bVar == bVar3 || (bVar == C1512e.b.MATCH_CONSTRAINT && i11 == 1);
                boolean z11 = bVar2 == bVar3 || (bVar2 == C1512e.b.MATCH_CONSTRAINT && i12 == 1);
                C4413g c4413g2 = c1512e2.f5877e.f18382e;
                boolean z12 = c4413g2.f18335j;
                C4413g c4413g3 = c1512e2.f5879f.f18382e;
                boolean z13 = c4413g3.f18335j;
                if (z12 && z13) {
                    C1512e.b bVar4 = C1512e.b.FIXED;
                    m22173l(c1512e2, bVar4, c4413g2.f18332g, bVar4, c4413g3.f18332g);
                    c1512e2.f5869a = true;
                } else if (z12 && z11) {
                    m22173l(c1512e2, C1512e.b.FIXED, c4413g2.f18332g, bVar3, c4413g3.f18332g);
                    if (bVar2 == C1512e.b.MATCH_CONSTRAINT) {
                        c1512e2.f5879f.f18382e.f18347m = c1512e2.m7812x();
                    } else {
                        c1512e2.f5879f.f18382e.mo22178d(c1512e2.m7812x());
                        c1512e2.f5869a = true;
                    }
                } else if (z13 && z10) {
                    m22173l(c1512e2, bVar3, c4413g2.f18332g, C1512e.b.FIXED, c4413g3.f18332g);
                    if (bVar == C1512e.b.MATCH_CONSTRAINT) {
                        c1512e2.f5877e.f18382e.f18347m = c1512e2.m7747W();
                    } else {
                        c1512e2.f5877e.f18382e.mo22178d(c1512e2.m7747W());
                        c1512e2.f5869a = true;
                    }
                }
                if (c1512e2.f5869a && (c4413g = c1512e2.f5879f.f18362l) != null) {
                    c4413g.mo22178d(c1512e2.m7793p());
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m22175n(C4408b.b bVar) {
        this.f18323g = bVar;
    }
}
