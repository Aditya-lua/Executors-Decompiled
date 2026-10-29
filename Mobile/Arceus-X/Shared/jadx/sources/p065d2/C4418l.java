package p065d2;

import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.InterfaceC1516i;

/* JADX INFO: renamed from: d2.l */
/* JADX INFO: loaded from: classes.dex */
public class C4418l extends AbstractC4422p {

    /* JADX INFO: renamed from: k */
    public static int[] f18351k = new int[2];

    /* JADX INFO: renamed from: d2.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18352a;

        static {
            int[] iArr = new int[AbstractC4422p.b.values().length];
            f18352a = iArr;
            try {
                iArr[AbstractC4422p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18352a[AbstractC4422p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18352a[AbstractC4422p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4418l(C1512e c1512e) {
        super(c1512e);
        this.f18385h.f18330e = C4412f.a.LEFT;
        this.f18386i.f18330e = C4412f.a.RIGHT;
        this.f18383f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // p065d2.AbstractC4422p, p065d2.InterfaceC4410d
    /* JADX INFO: renamed from: a */
    public void mo22153a(InterfaceC4410d interfaceC4410d) {
        int iM22214g;
        int i10;
        int iM22214g2;
        float f10;
        float fM7808v;
        float fM7808v2;
        int i11;
        int i12 = a.f18352a[this.f18387j.ordinal()];
        if (i12 == 1) {
            m22221p(interfaceC4410d);
        } else if (i12 == 2) {
            m22220o(interfaceC4410d);
        } else if (i12 == 3) {
            C1512e c1512e = this.f18379b;
            m22219n(interfaceC4410d, c1512e.f5857O, c1512e.f5859Q, 0);
            return;
        }
        if (!this.f18382e.f18335j && this.f18381d == C1512e.b.MATCH_CONSTRAINT) {
            C1512e c1512e2 = this.f18379b;
            int i13 = c1512e2.f5913w;
            if (i13 == 2) {
                C1512e c1512eM7723K = c1512e2.m7723K();
                if (c1512eM7723K != null) {
                    C4413g c4413g = c1512eM7723K.f5877e.f18382e;
                    if (c4413g.f18335j) {
                        this.f18382e.mo22178d((int) ((c4413g.f18332g * this.f18379b.f5835B) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = c1512e2.f5915x;
                if (i14 == 0 || i14 == 3) {
                    C4420n c4420n = c1512e2.f5879f;
                    C4412f c4412f = c4420n.f18385h;
                    C4412f c4412f2 = c4420n.f18386i;
                    boolean z10 = c1512e2.f5857O.f5818f != null;
                    boolean z11 = c1512e2.f5858P.f5818f != null;
                    boolean z12 = c1512e2.f5859Q.f5818f != null;
                    boolean z13 = c1512e2.f5860R.f5818f != null;
                    int iM7810w = c1512e2.m7810w();
                    if (z10 && z11 && z12 && z13) {
                        float fM7808v3 = this.f18379b.m7808v();
                        if (c4412f.f18335j && c4412f2.f18335j) {
                            C4412f c4412f3 = this.f18385h;
                            if (c4412f3.f18328c && this.f18386i.f18328c) {
                                m22195q(f18351k, this.f18385h.f18331f + c4412f3.f18337l.get(0).f18332g, this.f18386i.f18337l.get(0).f18332g - this.f18386i.f18331f, c4412f.f18331f + c4412f.f18332g, c4412f2.f18332g - c4412f2.f18331f, fM7808v3, iM7810w);
                                this.f18382e.mo22178d(f18351k[0]);
                                this.f18379b.f5879f.f18382e.mo22178d(f18351k[1]);
                                return;
                            }
                            return;
                        }
                        C4412f c4412f4 = this.f18385h;
                        if (c4412f4.f18335j) {
                            C4412f c4412f5 = this.f18386i;
                            if (c4412f5.f18335j) {
                                if (!c4412f.f18328c || !c4412f2.f18328c) {
                                    return;
                                }
                                m22195q(f18351k, c4412f4.f18332g + c4412f4.f18331f, c4412f5.f18332g - c4412f5.f18331f, c4412f.f18331f + c4412f.f18337l.get(0).f18332g, c4412f2.f18337l.get(0).f18332g - c4412f2.f18331f, fM7808v3, iM7810w);
                                this.f18382e.mo22178d(f18351k[0]);
                                this.f18379b.f5879f.f18382e.mo22178d(f18351k[1]);
                            }
                        }
                        C4412f c4412f6 = this.f18385h;
                        if (!c4412f6.f18328c || !this.f18386i.f18328c || !c4412f.f18328c || !c4412f2.f18328c) {
                            return;
                        }
                        m22195q(f18351k, this.f18385h.f18331f + c4412f6.f18337l.get(0).f18332g, this.f18386i.f18337l.get(0).f18332g - this.f18386i.f18331f, c4412f.f18331f + c4412f.f18337l.get(0).f18332g, c4412f2.f18337l.get(0).f18332g - c4412f2.f18331f, fM7808v3, iM7810w);
                        this.f18382e.mo22178d(f18351k[0]);
                        this.f18379b.f5879f.f18382e.mo22178d(f18351k[1]);
                    } else if (z10 && z12) {
                        if (!this.f18385h.f18328c || !this.f18386i.f18328c) {
                            return;
                        }
                        float fM7808v4 = this.f18379b.m7808v();
                        int i15 = this.f18385h.f18337l.get(0).f18332g + this.f18385h.f18331f;
                        int i16 = this.f18386i.f18337l.get(0).f18332g - this.f18386i.f18331f;
                        if (iM7810w == -1 || iM7810w == 0) {
                            int iM22214g3 = m22214g(i16 - i15, 0);
                            int i17 = (int) ((iM22214g3 * fM7808v4) + 0.5f);
                            int iM22214g4 = m22214g(i17, 1);
                            if (i17 != iM22214g4) {
                                iM22214g3 = (int) ((iM22214g4 / fM7808v4) + 0.5f);
                            }
                            this.f18382e.mo22178d(iM22214g3);
                            this.f18379b.f5879f.f18382e.mo22178d(iM22214g4);
                        } else if (iM7810w == 1) {
                            int iM22214g5 = m22214g(i16 - i15, 0);
                            int i18 = (int) ((iM22214g5 / fM7808v4) + 0.5f);
                            int iM22214g6 = m22214g(i18, 1);
                            if (i18 != iM22214g6) {
                                iM22214g5 = (int) ((iM22214g6 * fM7808v4) + 0.5f);
                            }
                            this.f18382e.mo22178d(iM22214g5);
                            this.f18379b.f5879f.f18382e.mo22178d(iM22214g6);
                        }
                    } else if (z11 && z13) {
                        if (!c4412f.f18328c || !c4412f2.f18328c) {
                            return;
                        }
                        float fM7808v5 = this.f18379b.m7808v();
                        int i19 = c4412f.f18337l.get(0).f18332g + c4412f.f18331f;
                        int i20 = c4412f2.f18337l.get(0).f18332g - c4412f2.f18331f;
                        if (iM7810w == -1) {
                            iM22214g = m22214g(i20 - i19, 1);
                            i10 = (int) ((iM22214g / fM7808v5) + 0.5f);
                            iM22214g2 = m22214g(i10, 0);
                            if (i10 != iM22214g2) {
                                iM22214g = (int) ((iM22214g2 * fM7808v5) + 0.5f);
                            }
                            this.f18382e.mo22178d(iM22214g2);
                            this.f18379b.f5879f.f18382e.mo22178d(iM22214g);
                        } else if (iM7810w == 0) {
                            int iM22214g7 = m22214g(i20 - i19, 1);
                            int i21 = (int) ((iM22214g7 * fM7808v5) + 0.5f);
                            int iM22214g8 = m22214g(i21, 0);
                            if (i21 != iM22214g8) {
                                iM22214g7 = (int) ((iM22214g8 / fM7808v5) + 0.5f);
                            }
                            this.f18382e.mo22178d(iM22214g8);
                            this.f18379b.f5879f.f18382e.mo22178d(iM22214g7);
                        } else if (iM7810w == 1) {
                            iM22214g = m22214g(i20 - i19, 1);
                            i10 = (int) ((iM22214g / fM7808v5) + 0.5f);
                            iM22214g2 = m22214g(i10, 0);
                            if (i10 != iM22214g2) {
                                iM22214g = (int) ((iM22214g2 * fM7808v5) + 0.5f);
                            }
                            this.f18382e.mo22178d(iM22214g2);
                            this.f18379b.f5879f.f18382e.mo22178d(iM22214g);
                        }
                    }
                } else {
                    int iM7810w2 = c1512e2.m7810w();
                    if (iM7810w2 != -1) {
                        if (iM7810w2 == 0) {
                            C1512e c1512e3 = this.f18379b;
                            fM7808v2 = c1512e3.f5879f.f18382e.f18332g / c1512e3.m7808v();
                            i11 = (int) (fM7808v2 + 0.5f);
                        } else if (iM7810w2 != 1) {
                            i11 = 0;
                        } else {
                            C1512e c1512e4 = this.f18379b;
                            f10 = c1512e4.f5879f.f18382e.f18332g;
                            fM7808v = c1512e4.m7808v();
                        }
                        this.f18382e.mo22178d(i11);
                    } else {
                        C1512e c1512e5 = this.f18379b;
                        f10 = c1512e5.f5879f.f18382e.f18332g;
                        fM7808v = c1512e5.m7808v();
                    }
                    fM7808v2 = f10 * fM7808v;
                    i11 = (int) (fM7808v2 + 0.5f);
                    this.f18382e.mo22178d(i11);
                }
            }
        }
        C4412f c4412f7 = this.f18385h;
        if (c4412f7.f18328c) {
            C4412f c4412f8 = this.f18386i;
            if (c4412f8.f18328c) {
                if (c4412f7.f18335j && c4412f8.f18335j && this.f18382e.f18335j) {
                    return;
                }
                if (!this.f18382e.f18335j && this.f18381d == C1512e.b.MATCH_CONSTRAINT) {
                    C1512e c1512e6 = this.f18379b;
                    if (c1512e6.f5913w == 0 && !c1512e6.m7775i0()) {
                        C4412f c4412f9 = this.f18385h.f18337l.get(0);
                        C4412f c4412f10 = this.f18386i.f18337l.get(0);
                        int i22 = c4412f9.f18332g;
                        C4412f c4412f11 = this.f18385h;
                        int i23 = i22 + c4412f11.f18331f;
                        int i24 = c4412f10.f18332g + this.f18386i.f18331f;
                        c4412f11.mo22178d(i23);
                        this.f18386i.mo22178d(i24);
                        this.f18382e.mo22178d(i24 - i23);
                        return;
                    }
                }
                if (!this.f18382e.f18335j && this.f18381d == C1512e.b.MATCH_CONSTRAINT && this.f18378a == 1 && this.f18385h.f18337l.size() > 0 && this.f18386i.f18337l.size() > 0) {
                    int iMin = Math.min((this.f18386i.f18337l.get(0).f18332g + this.f18386i.f18331f) - (this.f18385h.f18337l.get(0).f18332g + this.f18385h.f18331f), this.f18382e.f18347m);
                    C1512e c1512e7 = this.f18379b;
                    int i25 = c1512e7.f5833A;
                    int iMax = Math.max(c1512e7.f5919z, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f18382e.mo22178d(iMax);
                }
                if (this.f18382e.f18335j) {
                    C4412f c4412f12 = this.f18385h.f18337l.get(0);
                    C4412f c4412f13 = this.f18386i.f18337l.get(0);
                    int i26 = c4412f12.f18332g + this.f18385h.f18331f;
                    int i27 = c4412f13.f18332g + this.f18386i.f18331f;
                    float fM7814y = this.f18379b.m7814y();
                    if (c4412f12 == c4412f13) {
                        i26 = c4412f12.f18332g;
                        i27 = c4412f13.f18332g;
                        fM7814y = 0.5f;
                    }
                    this.f18385h.mo22178d((int) (i26 + 0.5f + (((i27 - i26) - this.f18382e.f18332g) * fM7814y)));
                    this.f18386i.mo22178d(this.f18385h.f18332g + this.f18382e.f18332g);
                }
            }
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: d */
    public void mo22154d() {
        C1512e c1512eM7723K;
        C1512e c1512eM7723K2;
        C1512e c1512e = this.f18379b;
        if (c1512e.f5869a) {
            this.f18382e.mo22178d(c1512e.m7747W());
        }
        if (this.f18382e.f18335j) {
            C1512e.b bVar = this.f18381d;
            C1512e.b bVar2 = C1512e.b.MATCH_PARENT;
            if (bVar == bVar2 && (c1512eM7723K = this.f18379b.m7723K()) != null && (c1512eM7723K.m7703A() == C1512e.b.FIXED || c1512eM7723K.m7703A() == bVar2)) {
                m22212b(this.f18385h, c1512eM7723K.f5877e.f18385h, this.f18379b.f5857O.m7686f());
                m22212b(this.f18386i, c1512eM7723K.f5877e.f18386i, -this.f18379b.f5859Q.m7686f());
                return;
            }
        } else {
            C1512e.b bVarM7703A = this.f18379b.m7703A();
            this.f18381d = bVarM7703A;
            if (bVarM7703A != C1512e.b.MATCH_CONSTRAINT) {
                C1512e.b bVar3 = C1512e.b.MATCH_PARENT;
                if (bVarM7703A == bVar3 && (c1512eM7723K2 = this.f18379b.m7723K()) != null && (c1512eM7723K2.m7703A() == C1512e.b.FIXED || c1512eM7723K2.m7703A() == bVar3)) {
                    int iM7747W = (c1512eM7723K2.m7747W() - this.f18379b.f5857O.m7686f()) - this.f18379b.f5859Q.m7686f();
                    m22212b(this.f18385h, c1512eM7723K2.f5877e.f18385h, this.f18379b.f5857O.m7686f());
                    m22212b(this.f18386i, c1512eM7723K2.f5877e.f18386i, -this.f18379b.f5859Q.m7686f());
                    this.f18382e.mo22178d(iM7747W);
                    return;
                }
                if (this.f18381d == C1512e.b.FIXED) {
                    this.f18382e.mo22178d(this.f18379b.m7747W());
                }
            }
        }
        C4413g c4413g = this.f18382e;
        if (c4413g.f18335j) {
            C1512e c1512e2 = this.f18379b;
            if (c1512e2.f5869a) {
                C1511d[] c1511dArr = c1512e2.f5865W;
                C1511d c1511d = c1511dArr[0];
                C1511d c1511d2 = c1511d.f5818f;
                if (c1511d2 != null && c1511dArr[1].f5818f != null) {
                    if (c1512e2.m7775i0()) {
                        this.f18385h.f18331f = this.f18379b.f5865W[0].m7686f();
                        this.f18386i.f18331f = -this.f18379b.f5865W[1].m7686f();
                        return;
                    }
                    C4412f c4412fM22215h = m22215h(this.f18379b.f5865W[0]);
                    if (c4412fM22215h != null) {
                        m22212b(this.f18385h, c4412fM22215h, this.f18379b.f5865W[0].m7686f());
                    }
                    C4412f c4412fM22215h2 = m22215h(this.f18379b.f5865W[1]);
                    if (c4412fM22215h2 != null) {
                        m22212b(this.f18386i, c4412fM22215h2, -this.f18379b.f5865W[1].m7686f());
                    }
                    this.f18385h.f18327b = true;
                    this.f18386i.f18327b = true;
                    return;
                }
                if (c1511d2 != null) {
                    C4412f c4412fM22215h3 = m22215h(c1511d);
                    if (c4412fM22215h3 != null) {
                        m22212b(this.f18385h, c4412fM22215h3, this.f18379b.f5865W[0].m7686f());
                        m22212b(this.f18386i, this.f18385h, this.f18382e.f18332g);
                        return;
                    }
                    return;
                }
                C1511d c1511d3 = c1511dArr[1];
                if (c1511d3.f5818f != null) {
                    C4412f c4412fM22215h4 = m22215h(c1511d3);
                    if (c4412fM22215h4 != null) {
                        m22212b(this.f18386i, c4412fM22215h4, -this.f18379b.f5865W[1].m7686f());
                        m22212b(this.f18385h, this.f18386i, -this.f18382e.f18332g);
                        return;
                    }
                    return;
                }
                if ((c1512e2 instanceof InterfaceC1516i) || c1512e2.m7723K() == null || this.f18379b.mo7791o(C1511d.a.CENTER).f5818f != null) {
                    return;
                }
                m22212b(this.f18385h, this.f18379b.m7723K().f5877e.f18385h, this.f18379b.m7749X());
                m22212b(this.f18386i, this.f18385h, this.f18382e.f18332g);
                return;
            }
        }
        if (this.f18381d == C1512e.b.MATCH_CONSTRAINT) {
            C1512e c1512e3 = this.f18379b;
            int i10 = c1512e3.f5913w;
            if (i10 == 2) {
                C1512e c1512eM7723K3 = c1512e3.m7723K();
                if (c1512eM7723K3 != null) {
                    C4413g c4413g2 = c1512eM7723K3.f5879f.f18382e;
                    this.f18382e.f18337l.add(c4413g2);
                    c4413g2.f18336k.add(this.f18382e);
                    C4413g c4413g3 = this.f18382e;
                    c4413g3.f18327b = true;
                    c4413g3.f18336k.add(this.f18385h);
                    this.f18382e.f18336k.add(this.f18386i);
                }
            } else if (i10 == 3) {
                if (c1512e3.f5915x == 3) {
                    this.f18385h.f18326a = this;
                    this.f18386i.f18326a = this;
                    C4420n c4420n = c1512e3.f5879f;
                    c4420n.f18385h.f18326a = this;
                    c4420n.f18386i.f18326a = this;
                    c4413g.f18326a = this;
                    if (c1512e3.m7781k0()) {
                        this.f18382e.f18337l.add(this.f18379b.f5879f.f18382e);
                        this.f18379b.f5879f.f18382e.f18336k.add(this.f18382e);
                        C4420n c4420n2 = this.f18379b.f5879f;
                        c4420n2.f18382e.f18326a = this;
                        this.f18382e.f18337l.add(c4420n2.f18385h);
                        this.f18382e.f18337l.add(this.f18379b.f5879f.f18386i);
                        this.f18379b.f5879f.f18385h.f18336k.add(this.f18382e);
                        this.f18379b.f5879f.f18386i.f18336k.add(this.f18382e);
                    } else if (this.f18379b.m7775i0()) {
                        this.f18379b.f5879f.f18382e.f18337l.add(this.f18382e);
                        this.f18382e.f18336k.add(this.f18379b.f5879f.f18382e);
                    } else {
                        this.f18379b.f5879f.f18382e.f18337l.add(this.f18382e);
                    }
                } else {
                    C4413g c4413g4 = c1512e3.f5879f.f18382e;
                    c4413g.f18337l.add(c4413g4);
                    c4413g4.f18336k.add(this.f18382e);
                    this.f18379b.f5879f.f18385h.f18336k.add(this.f18382e);
                    this.f18379b.f5879f.f18386i.f18336k.add(this.f18382e);
                    C4413g c4413g5 = this.f18382e;
                    c4413g5.f18327b = true;
                    c4413g5.f18336k.add(this.f18385h);
                    this.f18382e.f18336k.add(this.f18386i);
                    this.f18385h.f18337l.add(this.f18382e);
                    this.f18386i.f18337l.add(this.f18382e);
                }
            }
        }
        C1512e c1512e4 = this.f18379b;
        C1511d[] c1511dArr2 = c1512e4.f5865W;
        C1511d c1511d4 = c1511dArr2[0];
        C1511d c1511d5 = c1511d4.f5818f;
        if (c1511d5 != null && c1511dArr2[1].f5818f != null) {
            if (c1512e4.m7775i0()) {
                this.f18385h.f18331f = this.f18379b.f5865W[0].m7686f();
                this.f18386i.f18331f = -this.f18379b.f5865W[1].m7686f();
                return;
            }
            C4412f c4412fM22215h5 = m22215h(this.f18379b.f5865W[0]);
            C4412f c4412fM22215h6 = m22215h(this.f18379b.f5865W[1]);
            if (c4412fM22215h5 != null) {
                c4412fM22215h5.m22176b(this);
            }
            if (c4412fM22215h6 != null) {
                c4412fM22215h6.m22176b(this);
            }
            this.f18387j = AbstractC4422p.b.CENTER;
            return;
        }
        if (c1511d5 != null) {
            C4412f c4412fM22215h7 = m22215h(c1511d4);
            if (c4412fM22215h7 != null) {
                m22212b(this.f18385h, c4412fM22215h7, this.f18379b.f5865W[0].m7686f());
                m22213c(this.f18386i, this.f18385h, 1, this.f18382e);
                return;
            }
            return;
        }
        C1511d c1511d6 = c1511dArr2[1];
        if (c1511d6.f5818f != null) {
            C4412f c4412fM22215h8 = m22215h(c1511d6);
            if (c4412fM22215h8 != null) {
                m22212b(this.f18386i, c4412fM22215h8, -this.f18379b.f5865W[1].m7686f());
                m22213c(this.f18385h, this.f18386i, -1, this.f18382e);
                return;
            }
            return;
        }
        if ((c1512e4 instanceof InterfaceC1516i) || c1512e4.m7723K() == null) {
            return;
        }
        m22212b(this.f18385h, this.f18379b.m7723K().f5877e.f18385h, this.f18379b.m7749X());
        m22213c(this.f18386i, this.f18385h, 1, this.f18382e);
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: e */
    public void mo22155e() {
        C4412f c4412f = this.f18385h;
        if (c4412f.f18335j) {
            this.f18379b.m7790n1(c4412f.f18332g);
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: f */
    public void mo22156f() {
        this.f18380c = null;
        this.f18385h.m22177c();
        this.f18386i.m22177c();
        this.f18382e.m22177c();
        this.f18384g = false;
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: m */
    public boolean mo22158m() {
        return this.f18381d != C1512e.b.MATCH_CONSTRAINT || this.f18379b.f5913w == 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m22195q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m22196r() {
        this.f18384g = false;
        this.f18385h.m22177c();
        this.f18385h.f18335j = false;
        this.f18386i.m22177c();
        this.f18386i.f18335j = false;
        this.f18382e.f18335j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f18379b.m7804t();
    }
}
