package p065d2;

import java.util.ArrayList;
import p038c2.C1508a;
import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.C1513f;
import p038c2.C1515h;
import p038c2.C1518k;
import p038c2.C1519l;
import p038c2.InterfaceC1516i;
import p591z1.C13682d;

/* JADX INFO: renamed from: d2.b */
/* JADX INFO: loaded from: classes.dex */
public class C4408b {

    /* JADX INFO: renamed from: a */
    public final ArrayList<C1512e> f18299a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public a f18300b = new a();

    /* JADX INFO: renamed from: c */
    public C1513f f18301c;

    /* JADX INFO: renamed from: d2.b$a */
    public static class a {

        /* JADX INFO: renamed from: k */
        public static int f18302k = 0;

        /* JADX INFO: renamed from: l */
        public static int f18303l = 1;

        /* JADX INFO: renamed from: m */
        public static int f18304m = 2;

        /* JADX INFO: renamed from: a */
        public C1512e.b f18305a;

        /* JADX INFO: renamed from: b */
        public C1512e.b f18306b;

        /* JADX INFO: renamed from: c */
        public int f18307c;

        /* JADX INFO: renamed from: d */
        public int f18308d;

        /* JADX INFO: renamed from: e */
        public int f18309e;

        /* JADX INFO: renamed from: f */
        public int f18310f;

        /* JADX INFO: renamed from: g */
        public int f18311g;

        /* JADX INFO: renamed from: h */
        public boolean f18312h;

        /* JADX INFO: renamed from: i */
        public boolean f18313i;

        /* JADX INFO: renamed from: j */
        public int f18314j;
    }

    /* JADX INFO: renamed from: d2.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2466a();

        /* JADX INFO: renamed from: b */
        void mo2467b(C1512e c1512e, a aVar);
    }

    public C4408b(C1513f c1513f) {
        this.f18301c = c1513f;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22148a(b bVar, C1512e c1512e, int i10) {
        this.f18300b.f18305a = c1512e.m7703A();
        this.f18300b.f18306b = c1512e.m7741T();
        this.f18300b.f18307c = c1512e.m7747W();
        this.f18300b.f18308d = c1512e.m7812x();
        a aVar = this.f18300b;
        aVar.f18313i = false;
        aVar.f18314j = i10;
        C1512e.b bVar2 = aVar.f18305a;
        C1512e.b bVar3 = C1512e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f18306b == bVar3;
        boolean z12 = z10 && c1512e.f5876d0 > 0.0f;
        boolean z13 = z11 && c1512e.f5876d0 > 0.0f;
        if (z12 && c1512e.f5917y[0] == 4) {
            aVar.f18305a = C1512e.b.FIXED;
        }
        if (z13 && c1512e.f5917y[1] == 4) {
            aVar.f18306b = C1512e.b.FIXED;
        }
        bVar.mo2467b(c1512e, aVar);
        c1512e.m7785l1(this.f18300b.f18309e);
        c1512e.m7728M0(this.f18300b.f18310f);
        c1512e.m7726L0(this.f18300b.f18312h);
        c1512e.m7706B0(this.f18300b.f18311g);
        a aVar2 = this.f18300b;
        aVar2.f18314j = a.f18302k;
        return aVar2.f18313i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public final void m22149b(C1513f c1513f) {
        boolean z10;
        C4418l c4418l;
        C4420n c4420n;
        int size = c1513f.f6025L0.size();
        boolean zM7840V1 = c1513f.m7840V1(64);
        b bVarM7830K1 = c1513f.m7830K1();
        for (int i10 = 0; i10 < size; i10++) {
            C1512e c1512e = c1513f.f6025L0.get(i10);
            if (!(c1512e instanceof C1515h) && !(c1512e instanceof C1508a) && !c1512e.m7784l0() && (!zM7840V1 || (c4418l = c1512e.f5877e) == null || (c4420n = c1512e.f5879f) == null || !c4418l.f18382e.f18335j || !c4420n.f18382e.f18335j)) {
                C1512e.b bVarM7806u = c1512e.m7806u(0);
                C1512e.b bVarM7806u2 = c1512e.m7806u(1);
                C1512e.b bVar = C1512e.b.MATCH_CONSTRAINT;
                boolean z11 = bVarM7806u == bVar && c1512e.f5913w != 1 && bVarM7806u2 == bVar && c1512e.f5915x != 1;
                if (!z11 && c1513f.m7840V1(1) && !(c1512e instanceof C1519l)) {
                    if (bVarM7806u == bVar && c1512e.f5913w == 0 && bVarM7806u2 != bVar && !c1512e.m7775i0()) {
                        z11 = true;
                    }
                    if (bVarM7806u2 == bVar && c1512e.f5915x == 0 && bVarM7806u != bVar && !c1512e.m7775i0()) {
                        z11 = true;
                    }
                    z10 = (!(bVarM7806u == bVar || bVarM7806u2 == bVar) || c1512e.f5876d0 <= 0.0f) ? z11 : true;
                }
                if (!z10) {
                    m22148a(bVarM7830K1, c1512e, a.f18302k);
                }
            }
        }
        bVarM7830K1.mo2466a();
    }

    /* JADX INFO: renamed from: c */
    public final void m22150c(C1513f c1513f, String str, int i10, int i11, int i12) {
        c1513f.getClass();
        int iM7719I = c1513f.m7719I();
        int iM7717H = c1513f.m7717H();
        c1513f.m7758b1(0);
        c1513f.m7756a1(0);
        c1513f.m7785l1(i11);
        c1513f.m7728M0(i12);
        c1513f.m7758b1(iM7719I);
        c1513f.m7756a1(iM7717H);
        this.f18301c.m7844Z1(i10);
        this.f18301c.mo7848t1();
    }

    /* JADX INFO: renamed from: d */
    public long m22151d(C1513f c1513f, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zM7828I1;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22;
        boolean z11;
        C4408b c4408b = this;
        b bVarM7830K1 = c1513f.m7830K1();
        int size = c1513f.f6025L0.size();
        int iM7747W = c1513f.m7747W();
        int iM7812x = c1513f.m7812x();
        boolean zM7926b = C1518k.m7926b(i10, 128);
        boolean z12 = zM7926b || C1518k.m7926b(i10, 64);
        if (z12) {
            for (int i23 = 0; i23 < size; i23++) {
                C1512e c1512e = c1513f.f6025L0.get(i23);
                C1512e.b bVarM7703A = c1512e.m7703A();
                C1512e.b bVar = C1512e.b.MATCH_CONSTRAINT;
                boolean z13 = (bVarM7703A == bVar) && (c1512e.m7741T() == bVar) && c1512e.m7808v() > 0.0f;
                if ((c1512e.m7775i0() && z13) || ((c1512e.m7781k0() && z13) || (c1512e instanceof C1519l) || c1512e.m7775i0() || c1512e.m7781k0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = C13682d.f47990s;
        }
        boolean z15 = z12 & ((i13 == 1073741824 && i15 == 1073741824) || zM7926b);
        int i24 = 2;
        if (z15) {
            int iMin = Math.min(c1513f.m7715G(), i14);
            int iMin2 = Math.min(c1513f.m7713F(), i16);
            if (i13 == 1073741824 && c1513f.m7747W() != iMin) {
                c1513f.m7785l1(iMin);
                c1513f.m7834O1();
            }
            if (i15 == 1073741824 && c1513f.m7812x() != iMin2) {
                c1513f.m7728M0(iMin2);
                c1513f.m7834O1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zM7828I1 = c1513f.m7826G1(zM7926b);
                i19 = 2;
            } else {
                boolean zM7827H1 = c1513f.m7827H1(zM7926b);
                if (i13 == 1073741824) {
                    zM7827H1 &= c1513f.m7828I1(zM7926b, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zM7828I1 = c1513f.m7828I1(zM7926b, 1) & zM7827H1;
                    i19++;
                } else {
                    zM7828I1 = zM7827H1;
                }
            }
            if (zM7828I1) {
                c1513f.mo7798q1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zM7828I1 = false;
            i19 = 0;
        }
        if (zM7828I1 && i19 == 2) {
            return 0L;
        }
        int iM7831L1 = c1513f.m7831L1();
        if (size > 0) {
            m22149b(c1513f);
        }
        m22152e(c1513f);
        int size2 = c4408b.f18299a.size();
        if (size > 0) {
            c4408b.m22150c(c1513f, "First pass", 0, iM7747W, iM7812x);
            i20 = iM7747W;
            i21 = iM7812x;
        } else {
            i20 = iM7747W;
            i21 = iM7812x;
        }
        if (size2 > 0) {
            C1512e.b bVarM7703A2 = c1513f.m7703A();
            C1512e.b bVar2 = C1512e.b.WRAP_CONTENT;
            boolean z16 = bVarM7703A2 == bVar2;
            boolean z17 = c1513f.m7741T() == bVar2;
            int iMax = Math.max(c1513f.m7747W(), c4408b.f18301c.m7719I());
            int iMax2 = Math.max(c1513f.m7812x(), c4408b.f18301c.m7717H());
            int i25 = 0;
            boolean zM7932G1 = false;
            while (i25 < size2) {
                C1512e c1512e2 = c4408b.f18299a.get(i25);
                if (c1512e2 instanceof C1519l) {
                    int iM7747W2 = c1512e2.m7747W();
                    int iM7812x2 = c1512e2.m7812x();
                    boolean zM22148a = c4408b.m22148a(bVarM7830K1, c1512e2, a.f18303l) | zM7932G1;
                    int iM7747W3 = c1512e2.m7747W();
                    int iM7812x3 = c1512e2.m7812x();
                    if (iM7747W3 != iM7747W2) {
                        c1512e2.m7785l1(iM7747W3);
                        if (z16 && c1512e2.m7727M() > iMax) {
                            iMax = Math.max(iMax, c1512e2.m7727M() + c1512e2.mo7791o(C1511d.a.RIGHT).m7686f());
                        }
                        z11 = true;
                    } else {
                        z11 = zM22148a;
                    }
                    if (iM7812x3 != iM7812x2) {
                        c1512e2.m7728M0(iM7812x3);
                        if (z17 && c1512e2.m7799r() > iMax2) {
                            iMax2 = Math.max(iMax2, c1512e2.m7799r() + c1512e2.mo7791o(C1511d.a.BOTTOM).m7686f());
                        }
                        z11 = true;
                    }
                    zM7932G1 = z11 | ((C1519l) c1512e2).m7932G1();
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
                    C1512e c1512e3 = c4408b.f18299a.get(i29);
                    if (((c1512e3 instanceof InterfaceC1516i) && !(c1512e3 instanceof C1519l)) || (c1512e3 instanceof C1515h) || c1512e3.m7745V() == 8 || ((z15 && c1512e3.f5877e.f18382e.f18335j && c1512e3.f5879f.f18382e.f18335j) || (c1512e3 instanceof C1519l))) {
                        z10 = z15;
                        i22 = size2;
                    } else {
                        int iM7747W4 = c1512e3.m7747W();
                        int iM7812x4 = c1512e3.m7812x();
                        z10 = z15;
                        int iM7793p = c1512e3.m7793p();
                        int i30 = a.f18303l;
                        i22 = size2;
                        if (i28 == 1) {
                            i30 = a.f18304m;
                        }
                        boolean zM22148a2 = c4408b.m22148a(bVarM7830K1, c1512e3, i30) | zM7932G1;
                        int iM7747W5 = c1512e3.m7747W();
                        int iM7812x5 = c1512e3.m7812x();
                        if (iM7747W5 != iM7747W4) {
                            c1512e3.m7785l1(iM7747W5);
                            if (z16 && c1512e3.m7727M() > iMax) {
                                iMax = Math.max(iMax, c1512e3.m7727M() + c1512e3.mo7791o(C1511d.a.RIGHT).m7686f());
                            }
                            zM22148a2 = true;
                        }
                        if (iM7812x5 != iM7812x4) {
                            c1512e3.m7728M0(iM7812x5);
                            if (z17 && c1512e3.m7799r() > iMax2) {
                                iMax2 = Math.max(iMax2, c1512e3.m7799r() + c1512e3.mo7791o(C1511d.a.BOTTOM).m7686f());
                            }
                            zM22148a2 = true;
                        }
                        zM7932G1 = (!c1512e3.m7753Z() || iM7793p == c1512e3.m7793p()) ? zM22148a2 : true;
                    }
                    i29++;
                    c4408b = this;
                    size2 = i22;
                    z15 = z10;
                }
                boolean z18 = z15;
                int i31 = size2;
                if (!zM7932G1) {
                    break;
                }
                i28++;
                m22150c(c1513f, "intermediate pass", i28, i26, i21);
                c4408b = this;
                size2 = i31;
                z15 = z18;
                i27 = 2;
                zM7932G1 = false;
            }
        }
        c1513f.m7843Y1(iM7831L1);
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public void m22152e(C1513f c1513f) {
        this.f18299a.clear();
        int size = c1513f.f6025L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1512e c1512e = c1513f.f6025L0.get(i10);
            C1512e.b bVarM7703A = c1512e.m7703A();
            C1512e.b bVar = C1512e.b.MATCH_CONSTRAINT;
            if (bVarM7703A == bVar || c1512e.m7741T() == bVar) {
                this.f18299a.add(c1512e);
            }
        }
        c1513f.m7834O1();
    }
}
