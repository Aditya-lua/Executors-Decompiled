package p065d2;

import java.util.ArrayList;
import java.util.Iterator;
import p038c2.C1508a;
import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.C1513f;
import p038c2.C1515h;

/* JADX INFO: renamed from: d2.h */
/* JADX INFO: loaded from: classes.dex */
public class C4414h {

    /* JADX INFO: renamed from: a */
    public static C4408b.a f18348a = new C4408b.a();

    /* JADX INFO: renamed from: b */
    public static int f18349b = 0;

    /* JADX INFO: renamed from: c */
    public static int f18350c = 0;

    /* JADX INFO: renamed from: a */
    public static boolean m22180a(int i10, C1512e c1512e) {
        C1512e.b bVar;
        C1512e.b bVar2;
        C1512e.b bVarM7703A = c1512e.m7703A();
        C1512e.b bVarM7741T = c1512e.m7741T();
        C1513f c1513f = c1512e.m7723K() != null ? (C1513f) c1512e.m7723K() : null;
        if (c1513f != null) {
            c1513f.m7703A();
            C1512e.b bVar3 = C1512e.b.FIXED;
        }
        if (c1513f != null) {
            c1513f.m7741T();
            C1512e.b bVar4 = C1512e.b.FIXED;
        }
        C1512e.b bVar5 = C1512e.b.FIXED;
        boolean z10 = bVarM7703A == bVar5 || c1512e.mo7668n0() || bVarM7703A == C1512e.b.WRAP_CONTENT || (bVarM7703A == (bVar2 = C1512e.b.MATCH_CONSTRAINT) && c1512e.f5913w == 0 && c1512e.f5876d0 == 0.0f && c1512e.m7755a0(0)) || (bVarM7703A == bVar2 && c1512e.f5913w == 1 && c1512e.m7762d0(0, c1512e.m7747W()));
        boolean z11 = bVarM7741T == bVar5 || c1512e.mo7669o0() || bVarM7741T == C1512e.b.WRAP_CONTENT || (bVarM7741T == (bVar = C1512e.b.MATCH_CONSTRAINT) && c1512e.f5915x == 0 && c1512e.f5876d0 == 0.0f && c1512e.m7755a0(1)) || (bVarM7741T == bVar && c1512e.f5915x == 1 && c1512e.m7762d0(1, c1512e.m7812x()));
        if (c1512e.f5876d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m22181b(int i10, C1512e c1512e, C4408b.b bVar, boolean z10) {
        C1511d c1511d;
        C1511d c1511d2;
        C1511d c1511d3;
        C1511d c1511d4;
        if (c1512e.m7770g0()) {
            return;
        }
        boolean z11 = true;
        f18349b++;
        if (!(c1512e instanceof C1513f) && c1512e.m7787m0()) {
            int i11 = i10 + 1;
            if (m22180a(i11, c1512e)) {
                C1513f.m7819U1(i11, c1512e, bVar, new C4408b.a(), C4408b.a.f18302k);
            }
        }
        C1511d c1511dMo7791o = c1512e.mo7791o(C1511d.a.LEFT);
        C1511d c1511dMo7791o2 = c1512e.mo7791o(C1511d.a.RIGHT);
        int iM7685e = c1511dMo7791o.m7685e();
        int iM7685e2 = c1511dMo7791o2.m7685e();
        if (c1511dMo7791o.m7684d() != null && c1511dMo7791o.m7694n()) {
            Iterator<C1511d> it = c1511dMo7791o.m7684d().iterator();
            while (it.hasNext()) {
                C1511d next = it.next();
                C1512e c1512e2 = next.f5816d;
                int i12 = i10 + 1;
                boolean zM22180a = m22180a(i12, c1512e2);
                if (c1512e2.m7787m0() && zM22180a) {
                    C1513f.m7819U1(i12, c1512e2, bVar, new C4408b.a(), C4408b.a.f18302k);
                }
                boolean z12 = ((next == c1512e2.f5857O && (c1511d4 = c1512e2.f5859Q.f5818f) != null && c1511d4.m7694n()) || (next == c1512e2.f5859Q && (c1511d3 = c1512e2.f5857O.f5818f) != null && c1511d3.m7694n())) ? z11 : false;
                C1512e.b bVarM7703A = c1512e2.m7703A();
                C1512e.b bVar2 = C1512e.b.MATCH_CONSTRAINT;
                if (bVarM7703A != bVar2 || zM22180a) {
                    if (!c1512e2.m7787m0()) {
                        C1511d c1511d5 = c1512e2.f5857O;
                        if (next == c1511d5 && c1512e2.f5859Q.f5818f == null) {
                            int iM7686f = c1511d5.m7686f() + iM7685e;
                            c1512e2.m7716G0(iM7686f, c1512e2.m7747W() + iM7686f);
                            m22181b(i12, c1512e2, bVar, z10);
                        } else {
                            C1511d c1511d6 = c1512e2.f5859Q;
                            if (next == c1511d6 && c1511d5.f5818f == null) {
                                int iM7686f2 = iM7685e - c1511d6.m7686f();
                                c1512e2.m7716G0(iM7686f2 - c1512e2.m7747W(), iM7686f2);
                                m22181b(i12, c1512e2, bVar, z10);
                            } else if (z12 && !c1512e2.m7775i0()) {
                                m22183d(i12, bVar, c1512e2, z10);
                            }
                        }
                    }
                } else if (c1512e2.m7703A() == bVar2 && c1512e2.f5833A >= 0 && c1512e2.f5919z >= 0 && ((c1512e2.m7745V() == 8 || (c1512e2.f5913w == 0 && c1512e2.m7808v() == 0.0f)) && !c1512e2.m7775i0() && !c1512e2.m7784l0() && z12 && !c1512e2.m7775i0())) {
                    m22184e(i12, c1512e, bVar, c1512e2, z10);
                }
                z11 = z11;
            }
        }
        boolean z13 = z11;
        if (c1512e instanceof C1515h) {
            return;
        }
        if (c1511dMo7791o2.m7684d() != null && c1511dMo7791o2.m7694n()) {
            Iterator<C1511d> it2 = c1511dMo7791o2.m7684d().iterator();
            while (it2.hasNext()) {
                C1511d next2 = it2.next();
                C1512e c1512e3 = next2.f5816d;
                int i13 = i10 + 1;
                boolean zM22180a2 = m22180a(i13, c1512e3);
                if (c1512e3.m7787m0() && zM22180a2) {
                    C1513f.m7819U1(i13, c1512e3, bVar, new C4408b.a(), C4408b.a.f18302k);
                }
                boolean z14 = ((next2 == c1512e3.f5857O && (c1511d2 = c1512e3.f5859Q.f5818f) != null && c1511d2.m7694n()) || (next2 == c1512e3.f5859Q && (c1511d = c1512e3.f5857O.f5818f) != null && c1511d.m7694n())) ? z13 : false;
                C1512e.b bVarM7703A2 = c1512e3.m7703A();
                C1512e.b bVar3 = C1512e.b.MATCH_CONSTRAINT;
                if (bVarM7703A2 != bVar3 || zM22180a2) {
                    if (!c1512e3.m7787m0()) {
                        C1511d c1511d7 = c1512e3.f5857O;
                        if (next2 == c1511d7 && c1512e3.f5859Q.f5818f == null) {
                            int iM7686f3 = c1511d7.m7686f() + iM7685e2;
                            c1512e3.m7716G0(iM7686f3, c1512e3.m7747W() + iM7686f3);
                            m22181b(i13, c1512e3, bVar, z10);
                        } else {
                            C1511d c1511d8 = c1512e3.f5859Q;
                            if (next2 == c1511d8 && c1511d7.f5818f == null) {
                                int iM7686f4 = iM7685e2 - c1511d8.m7686f();
                                c1512e3.m7716G0(iM7686f4 - c1512e3.m7747W(), iM7686f4);
                                m22181b(i13, c1512e3, bVar, z10);
                            } else if (z14 && !c1512e3.m7775i0()) {
                                m22183d(i13, bVar, c1512e3, z10);
                            }
                        }
                    }
                } else if (c1512e3.m7703A() == bVar3 && c1512e3.f5833A >= 0 && c1512e3.f5919z >= 0 && (c1512e3.m7745V() == 8 || (c1512e3.f5913w == 0 && c1512e3.m7808v() == 0.0f))) {
                    if (!c1512e3.m7775i0() && !c1512e3.m7784l0() && z14 && !c1512e3.m7775i0()) {
                        m22184e(i13, c1512e, bVar, c1512e3, z10);
                    }
                }
            }
        }
        c1512e.m7797q0();
    }

    /* JADX INFO: renamed from: c */
    public static void m22182c(int i10, C1508a c1508a, C4408b.b bVar, int i11, boolean z10) {
        if (c1508a.m7670u1()) {
            if (i11 == 0) {
                m22181b(i10 + 1, c1508a, bVar, z10);
            } else {
                m22188i(i10 + 1, c1508a, bVar);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22183d(int i10, C4408b.b bVar, C1512e c1512e, boolean z10) {
        float fM7814y = c1512e.m7814y();
        int iM7685e = c1512e.f5857O.f5818f.m7685e();
        int iM7685e2 = c1512e.f5859Q.f5818f.m7685e();
        int iM7686f = c1512e.f5857O.m7686f() + iM7685e;
        int iM7686f2 = iM7685e2 - c1512e.f5859Q.m7686f();
        if (iM7685e == iM7685e2) {
            fM7814y = 0.5f;
        } else {
            iM7685e = iM7686f;
            iM7685e2 = iM7686f2;
        }
        int iM7747W = c1512e.m7747W();
        int i11 = (iM7685e2 - iM7685e) - iM7747W;
        if (iM7685e > iM7685e2) {
            i11 = (iM7685e - iM7685e2) - iM7747W;
        }
        int i12 = ((int) (i11 > 0 ? (fM7814y * i11) + 0.5f : fM7814y * i11)) + iM7685e;
        int i13 = i12 + iM7747W;
        if (iM7685e > iM7685e2) {
            i13 = i12 - iM7747W;
        }
        c1512e.m7716G0(i12, i13);
        m22181b(i10 + 1, c1512e, bVar, z10);
    }

    /* JADX INFO: renamed from: e */
    public static void m22184e(int i10, C1512e c1512e, C4408b.b bVar, C1512e c1512e2, boolean z10) {
        float fM7814y = c1512e2.m7814y();
        int iM7685e = c1512e2.f5857O.f5818f.m7685e() + c1512e2.f5857O.m7686f();
        int iM7685e2 = c1512e2.f5859Q.f5818f.m7685e() - c1512e2.f5859Q.m7686f();
        if (iM7685e2 >= iM7685e) {
            int iM7747W = c1512e2.m7747W();
            if (c1512e2.m7745V() != 8) {
                int i11 = c1512e2.f5913w;
                if (i11 == 2) {
                    iM7747W = (int) (c1512e2.m7814y() * 0.5f * (c1512e instanceof C1513f ? c1512e.m7747W() : c1512e.m7723K().m7747W()));
                } else if (i11 == 0) {
                    iM7747W = iM7685e2 - iM7685e;
                }
                iM7747W = Math.max(c1512e2.f5919z, iM7747W);
                int i12 = c1512e2.f5833A;
                if (i12 > 0) {
                    iM7747W = Math.min(i12, iM7747W);
                }
            }
            int i13 = iM7685e + ((int) ((fM7814y * ((iM7685e2 - iM7685e) - iM7747W)) + 0.5f));
            c1512e2.m7716G0(i13, iM7747W + i13);
            m22181b(i10 + 1, c1512e2, bVar, z10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m22185f(int i10, C4408b.b bVar, C1512e c1512e) {
        float fM7737R = c1512e.m7737R();
        int iM7685e = c1512e.f5858P.f5818f.m7685e();
        int iM7685e2 = c1512e.f5860R.f5818f.m7685e();
        int iM7686f = c1512e.f5858P.m7686f() + iM7685e;
        int iM7686f2 = iM7685e2 - c1512e.f5860R.m7686f();
        if (iM7685e == iM7685e2) {
            fM7737R = 0.5f;
        } else {
            iM7685e = iM7686f;
            iM7685e2 = iM7686f2;
        }
        int iM7812x = c1512e.m7812x();
        int i11 = (iM7685e2 - iM7685e) - iM7812x;
        if (iM7685e > iM7685e2) {
            i11 = (iM7685e - iM7685e2) - iM7812x;
        }
        int i12 = (int) (i11 > 0 ? (fM7737R * i11) + 0.5f : fM7737R * i11);
        int i13 = iM7685e + i12;
        int i14 = i13 + iM7812x;
        if (iM7685e > iM7685e2) {
            i13 = iM7685e - i12;
            i14 = i13 - iM7812x;
        }
        c1512e.m7722J0(i13, i14);
        m22188i(i10 + 1, c1512e, bVar);
    }

    /* JADX INFO: renamed from: g */
    public static void m22186g(int i10, C1512e c1512e, C4408b.b bVar, C1512e c1512e2) {
        float fM7737R = c1512e2.m7737R();
        int iM7685e = c1512e2.f5858P.f5818f.m7685e() + c1512e2.f5858P.m7686f();
        int iM7685e2 = c1512e2.f5860R.f5818f.m7685e() - c1512e2.f5860R.m7686f();
        if (iM7685e2 >= iM7685e) {
            int iM7812x = c1512e2.m7812x();
            if (c1512e2.m7745V() != 8) {
                int i11 = c1512e2.f5915x;
                if (i11 == 2) {
                    iM7812x = (int) (fM7737R * 0.5f * (c1512e instanceof C1513f ? c1512e.m7812x() : c1512e.m7723K().m7812x()));
                } else if (i11 == 0) {
                    iM7812x = iM7685e2 - iM7685e;
                }
                iM7812x = Math.max(c1512e2.f5837C, iM7812x);
                int i12 = c1512e2.f5839D;
                if (i12 > 0) {
                    iM7812x = Math.min(i12, iM7812x);
                }
            }
            int i13 = iM7685e + ((int) ((fM7737R * ((iM7685e2 - iM7685e) - iM7812x)) + 0.5f));
            c1512e2.m7722J0(i13, iM7812x + i13);
            m22188i(i10 + 1, c1512e2, bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m22187h(C1513f c1513f, C4408b.b bVar) {
        C1512e.b bVarM7703A = c1513f.m7703A();
        C1512e.b bVarM7741T = c1513f.m7741T();
        f18349b = 0;
        f18350c = 0;
        c1513f.m7809v0();
        ArrayList<C1512e> arrayListM7949s1 = c1513f.m7949s1();
        int size = arrayListM7949s1.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayListM7949s1.get(i10).m7809v0();
        }
        boolean zM7837R1 = c1513f.m7837R1();
        if (bVarM7703A == C1512e.b.FIXED) {
            c1513f.m7716G0(0, c1513f.m7747W());
        } else {
            c1513f.m7718H0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C1512e c1512e = arrayListM7949s1.get(i11);
            if (c1512e instanceof C1515h) {
                C1515h c1515h = (C1515h) c1512e;
                if (c1515h.m7913t1() == 1) {
                    if (c1515h.m7914u1() != -1) {
                        c1515h.m7917x1(c1515h.m7914u1());
                    } else if (c1515h.m7915v1() != -1 && c1513f.mo7668n0()) {
                        c1515h.m7917x1(c1513f.m7747W() - c1515h.m7915v1());
                    } else if (c1513f.mo7668n0()) {
                        c1515h.m7917x1((int) ((c1515h.m7916w1() * c1513f.m7747W()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((c1512e instanceof C1508a) && ((C1508a) c1512e).m7674y1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                C1512e c1512e2 = arrayListM7949s1.get(i12);
                if (c1512e2 instanceof C1515h) {
                    C1515h c1515h2 = (C1515h) c1512e2;
                    if (c1515h2.m7913t1() == 1) {
                        m22181b(0, c1515h2, bVar, zM7837R1);
                    }
                }
            }
        }
        m22181b(0, c1513f, bVar, zM7837R1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C1512e c1512e3 = arrayListM7949s1.get(i13);
                if (c1512e3 instanceof C1508a) {
                    C1508a c1508a = (C1508a) c1512e3;
                    if (c1508a.m7674y1() == 0) {
                        m22182c(0, c1508a, bVar, 0, zM7837R1);
                    }
                }
            }
        }
        if (bVarM7741T == C1512e.b.FIXED) {
            c1513f.m7722J0(0, c1513f.m7812x());
        } else {
            c1513f.m7720I0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C1512e c1512e4 = arrayListM7949s1.get(i14);
            if (c1512e4 instanceof C1515h) {
                C1515h c1515h3 = (C1515h) c1512e4;
                if (c1515h3.m7913t1() == 0) {
                    if (c1515h3.m7914u1() != -1) {
                        c1515h3.m7917x1(c1515h3.m7914u1());
                    } else if (c1515h3.m7915v1() != -1 && c1513f.mo7669o0()) {
                        c1515h3.m7917x1(c1513f.m7812x() - c1515h3.m7915v1());
                    } else if (c1513f.mo7669o0()) {
                        c1515h3.m7917x1((int) ((c1515h3.m7916w1() * c1513f.m7812x()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((c1512e4 instanceof C1508a) && ((C1508a) c1512e4).m7674y1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                C1512e c1512e5 = arrayListM7949s1.get(i15);
                if (c1512e5 instanceof C1515h) {
                    C1515h c1515h4 = (C1515h) c1512e5;
                    if (c1515h4.m7913t1() == 0) {
                        m22188i(1, c1515h4, bVar);
                    }
                }
            }
        }
        m22188i(0, c1513f, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                C1512e c1512e6 = arrayListM7949s1.get(i16);
                if (c1512e6 instanceof C1508a) {
                    C1508a c1508a2 = (C1508a) c1512e6;
                    if (c1508a2.m7674y1() == 1) {
                        m22182c(0, c1508a2, bVar, 1, zM7837R1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            C1512e c1512e7 = arrayListM7949s1.get(i17);
            if (c1512e7.m7787m0() && m22180a(0, c1512e7)) {
                C1513f.m7819U1(0, c1512e7, bVar, f18348a, C4408b.a.f18302k);
                if (!(c1512e7 instanceof C1515h)) {
                    m22181b(0, c1512e7, bVar, zM7837R1);
                    m22188i(0, c1512e7, bVar);
                } else if (((C1515h) c1512e7).m7913t1() == 0) {
                    m22188i(0, c1512e7, bVar);
                } else {
                    m22181b(0, c1512e7, bVar, zM7837R1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m22188i(int i10, C1512e c1512e, C4408b.b bVar) {
        C1511d c1511d;
        C1511d c1511d2;
        C1511d c1511d3;
        C1511d c1511d4;
        if (c1512e.m7794p0()) {
            return;
        }
        boolean z10 = true;
        f18350c++;
        if (!(c1512e instanceof C1513f) && c1512e.m7787m0()) {
            int i11 = i10 + 1;
            if (m22180a(i11, c1512e)) {
                C1513f.m7819U1(i11, c1512e, bVar, new C4408b.a(), C4408b.a.f18302k);
            }
        }
        C1511d c1511dMo7791o = c1512e.mo7791o(C1511d.a.TOP);
        C1511d c1511dMo7791o2 = c1512e.mo7791o(C1511d.a.BOTTOM);
        int iM7685e = c1511dMo7791o.m7685e();
        int iM7685e2 = c1511dMo7791o2.m7685e();
        if (c1511dMo7791o.m7684d() != null && c1511dMo7791o.m7694n()) {
            Iterator<C1511d> it = c1511dMo7791o.m7684d().iterator();
            while (it.hasNext()) {
                C1511d next = it.next();
                C1512e c1512e2 = next.f5816d;
                int i12 = i10 + 1;
                boolean zM22180a = m22180a(i12, c1512e2);
                if (c1512e2.m7787m0() && zM22180a) {
                    C1513f.m7819U1(i12, c1512e2, bVar, new C4408b.a(), C4408b.a.f18302k);
                }
                boolean z11 = ((next == c1512e2.f5858P && (c1511d4 = c1512e2.f5860R.f5818f) != null && c1511d4.m7694n()) || (next == c1512e2.f5860R && (c1511d3 = c1512e2.f5858P.f5818f) != null && c1511d3.m7694n())) ? z10 : false;
                C1512e.b bVarM7741T = c1512e2.m7741T();
                boolean z12 = z10;
                C1512e.b bVar2 = C1512e.b.MATCH_CONSTRAINT;
                if (bVarM7741T != bVar2 || zM22180a) {
                    if (!c1512e2.m7787m0()) {
                        C1511d c1511d5 = c1512e2.f5858P;
                        if (next == c1511d5 && c1512e2.f5860R.f5818f == null) {
                            int iM7686f = c1511d5.m7686f() + iM7685e;
                            c1512e2.m7722J0(iM7686f, c1512e2.m7812x() + iM7686f);
                            m22188i(i12, c1512e2, bVar);
                        } else {
                            C1511d c1511d6 = c1512e2.f5860R;
                            if (next == c1511d6 && c1511d5.f5818f == null) {
                                int iM7686f2 = iM7685e - c1511d6.m7686f();
                                c1512e2.m7722J0(iM7686f2 - c1512e2.m7812x(), iM7686f2);
                                m22188i(i12, c1512e2, bVar);
                            } else if (z11 && !c1512e2.m7781k0()) {
                                m22185f(i12, bVar, c1512e2);
                            }
                        }
                    }
                } else if (c1512e2.m7741T() == bVar2 && c1512e2.f5839D >= 0 && c1512e2.f5837C >= 0 && ((c1512e2.m7745V() == 8 || (c1512e2.f5915x == 0 && c1512e2.m7808v() == 0.0f)) && !c1512e2.m7781k0() && !c1512e2.m7784l0() && z11 && !c1512e2.m7781k0())) {
                    m22186g(i12, c1512e, bVar, c1512e2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (c1512e instanceof C1515h) {
            return;
        }
        if (c1511dMo7791o2.m7684d() != null && c1511dMo7791o2.m7694n()) {
            Iterator<C1511d> it2 = c1511dMo7791o2.m7684d().iterator();
            while (it2.hasNext()) {
                C1511d next2 = it2.next();
                C1512e c1512e3 = next2.f5816d;
                int i13 = i10 + 1;
                boolean zM22180a2 = m22180a(i13, c1512e3);
                if (c1512e3.m7787m0() && zM22180a2) {
                    C1513f.m7819U1(i13, c1512e3, bVar, new C4408b.a(), C4408b.a.f18302k);
                }
                boolean z14 = ((next2 == c1512e3.f5858P && (c1511d2 = c1512e3.f5860R.f5818f) != null && c1511d2.m7694n()) || (next2 == c1512e3.f5860R && (c1511d = c1512e3.f5858P.f5818f) != null && c1511d.m7694n())) ? z13 : false;
                C1512e.b bVarM7741T2 = c1512e3.m7741T();
                C1512e.b bVar3 = C1512e.b.MATCH_CONSTRAINT;
                if (bVarM7741T2 != bVar3 || zM22180a2) {
                    if (!c1512e3.m7787m0()) {
                        C1511d c1511d7 = c1512e3.f5858P;
                        if (next2 == c1511d7 && c1512e3.f5860R.f5818f == null) {
                            int iM7686f3 = c1511d7.m7686f() + iM7685e2;
                            c1512e3.m7722J0(iM7686f3, c1512e3.m7812x() + iM7686f3);
                            m22188i(i13, c1512e3, bVar);
                        } else {
                            C1511d c1511d8 = c1512e3.f5860R;
                            if (next2 == c1511d8 && c1511d7.f5818f == null) {
                                int iM7686f4 = iM7685e2 - c1511d8.m7686f();
                                c1512e3.m7722J0(iM7686f4 - c1512e3.m7812x(), iM7686f4);
                                m22188i(i13, c1512e3, bVar);
                            } else if (z14 && !c1512e3.m7781k0()) {
                                m22185f(i13, bVar, c1512e3);
                            }
                        }
                    }
                } else if (c1512e3.m7741T() == bVar3 && c1512e3.f5839D >= 0 && c1512e3.f5837C >= 0 && (c1512e3.m7745V() == 8 || (c1512e3.f5915x == 0 && c1512e3.m7808v() == 0.0f))) {
                    if (!c1512e3.m7781k0() && !c1512e3.m7784l0() && z14 && !c1512e3.m7781k0()) {
                        m22186g(i13, c1512e, bVar, c1512e3);
                    }
                }
            }
        }
        C1511d c1511dMo7791o3 = c1512e.mo7791o(C1511d.a.BASELINE);
        if (c1511dMo7791o3.m7684d() != null && c1511dMo7791o3.m7694n()) {
            int iM7685e3 = c1511dMo7791o3.m7685e();
            for (C1511d c1511d9 : c1511dMo7791o3.m7684d()) {
                C1512e c1512e4 = c1511d9.f5816d;
                int i14 = i10 + 1;
                boolean zM22180a3 = m22180a(i14, c1512e4);
                if (c1512e4.m7787m0() && zM22180a3) {
                    C1513f.m7819U1(i14, c1512e4, bVar, new C4408b.a(), C4408b.a.f18302k);
                }
                if (c1512e4.m7741T() != C1512e.b.MATCH_CONSTRAINT || zM22180a3) {
                    if (!c1512e4.m7787m0() && c1511d9 == c1512e4.f5861S) {
                        c1512e4.m7714F0(c1511d9.m7686f() + iM7685e3);
                        m22188i(i14, c1512e4, bVar);
                    }
                }
            }
        }
        c1512e.m7800r0();
    }
}
