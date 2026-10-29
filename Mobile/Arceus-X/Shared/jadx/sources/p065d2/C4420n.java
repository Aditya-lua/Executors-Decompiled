package p065d2;

import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.InterfaceC1516i;

/* JADX INFO: renamed from: d2.n */
/* JADX INFO: loaded from: classes.dex */
public class C4420n extends AbstractC4422p {

    /* JADX INFO: renamed from: k */
    public C4412f f18361k;

    /* JADX INFO: renamed from: l */
    public C4413g f18362l;

    /* JADX INFO: renamed from: d2.n$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18363a;

        static {
            int[] iArr = new int[AbstractC4422p.b.values().length];
            f18363a = iArr;
            try {
                iArr[AbstractC4422p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18363a[AbstractC4422p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18363a[AbstractC4422p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4420n(C1512e c1512e) {
        super(c1512e);
        C4412f c4412f = new C4412f(this);
        this.f18361k = c4412f;
        this.f18362l = null;
        this.f18385h.f18330e = C4412f.a.TOP;
        this.f18386i.f18330e = C4412f.a.BOTTOM;
        c4412f.f18330e = C4412f.a.BASELINE;
        this.f18383f = 1;
    }

    @Override // p065d2.AbstractC4422p, p065d2.InterfaceC4410d
    /* JADX INFO: renamed from: a */
    public void mo22153a(InterfaceC4410d interfaceC4410d) {
        float f10;
        float fM7808v;
        float fM7808v2;
        int i10;
        int i11 = a.f18363a[this.f18387j.ordinal()];
        if (i11 == 1) {
            m22221p(interfaceC4410d);
        } else if (i11 == 2) {
            m22220o(interfaceC4410d);
        } else if (i11 == 3) {
            C1512e c1512e = this.f18379b;
            m22219n(interfaceC4410d, c1512e.f5858P, c1512e.f5860R, 1);
            return;
        }
        C4413g c4413g = this.f18382e;
        if (c4413g.f18328c && !c4413g.f18335j && this.f18381d == C1512e.b.MATCH_CONSTRAINT) {
            C1512e c1512e2 = this.f18379b;
            int i12 = c1512e2.f5915x;
            if (i12 == 2) {
                C1512e c1512eM7723K = c1512e2.m7723K();
                if (c1512eM7723K != null) {
                    C4413g c4413g2 = c1512eM7723K.f5879f.f18382e;
                    if (c4413g2.f18335j) {
                        this.f18382e.mo22178d((int) ((c4413g2.f18332g * this.f18379b.f5841E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && c1512e2.f5877e.f18382e.f18335j) {
                int iM7810w = c1512e2.m7810w();
                if (iM7810w != -1) {
                    if (iM7810w == 0) {
                        C1512e c1512e3 = this.f18379b;
                        fM7808v2 = c1512e3.f5877e.f18382e.f18332g * c1512e3.m7808v();
                        i10 = (int) (fM7808v2 + 0.5f);
                    } else if (iM7810w != 1) {
                        i10 = 0;
                    } else {
                        C1512e c1512e4 = this.f18379b;
                        f10 = c1512e4.f5877e.f18382e.f18332g;
                        fM7808v = c1512e4.m7808v();
                    }
                    this.f18382e.mo22178d(i10);
                } else {
                    C1512e c1512e5 = this.f18379b;
                    f10 = c1512e5.f5877e.f18382e.f18332g;
                    fM7808v = c1512e5.m7808v();
                }
                fM7808v2 = f10 / fM7808v;
                i10 = (int) (fM7808v2 + 0.5f);
                this.f18382e.mo22178d(i10);
            }
        }
        C4412f c4412f = this.f18385h;
        if (c4412f.f18328c) {
            C4412f c4412f2 = this.f18386i;
            if (c4412f2.f18328c) {
                if (c4412f.f18335j && c4412f2.f18335j && this.f18382e.f18335j) {
                    return;
                }
                if (!this.f18382e.f18335j && this.f18381d == C1512e.b.MATCH_CONSTRAINT) {
                    C1512e c1512e6 = this.f18379b;
                    if (c1512e6.f5913w == 0 && !c1512e6.m7781k0()) {
                        C4412f c4412f3 = this.f18385h.f18337l.get(0);
                        C4412f c4412f4 = this.f18386i.f18337l.get(0);
                        int i13 = c4412f3.f18332g;
                        C4412f c4412f5 = this.f18385h;
                        int i14 = i13 + c4412f5.f18331f;
                        int i15 = c4412f4.f18332g + this.f18386i.f18331f;
                        c4412f5.mo22178d(i14);
                        this.f18386i.mo22178d(i15);
                        this.f18382e.mo22178d(i15 - i14);
                        return;
                    }
                }
                if (!this.f18382e.f18335j && this.f18381d == C1512e.b.MATCH_CONSTRAINT && this.f18378a == 1 && this.f18385h.f18337l.size() > 0 && this.f18386i.f18337l.size() > 0) {
                    C4412f c4412f6 = this.f18385h.f18337l.get(0);
                    int i16 = (this.f18386i.f18337l.get(0).f18332g + this.f18386i.f18331f) - (c4412f6.f18332g + this.f18385h.f18331f);
                    C4413g c4413g3 = this.f18382e;
                    int i17 = c4413g3.f18347m;
                    if (i16 < i17) {
                        c4413g3.mo22178d(i16);
                    } else {
                        c4413g3.mo22178d(i17);
                    }
                }
                if (this.f18382e.f18335j && this.f18385h.f18337l.size() > 0 && this.f18386i.f18337l.size() > 0) {
                    C4412f c4412f7 = this.f18385h.f18337l.get(0);
                    C4412f c4412f8 = this.f18386i.f18337l.get(0);
                    int i18 = c4412f7.f18332g + this.f18385h.f18331f;
                    int i19 = c4412f8.f18332g + this.f18386i.f18331f;
                    float fM7737R = this.f18379b.m7737R();
                    if (c4412f7 == c4412f8) {
                        i18 = c4412f7.f18332g;
                        i19 = c4412f8.f18332g;
                        fM7737R = 0.5f;
                    }
                    this.f18385h.mo22178d((int) (i18 + 0.5f + (((i19 - i18) - this.f18382e.f18332g) * fM7737R)));
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
            this.f18382e.mo22178d(c1512e.m7812x());
        }
        if (!this.f18382e.f18335j) {
            this.f18381d = this.f18379b.m7741T();
            if (this.f18379b.m7753Z()) {
                this.f18362l = new C4407a(this);
            }
            C1512e.b bVar = this.f18381d;
            if (bVar != C1512e.b.MATCH_CONSTRAINT) {
                if (bVar == C1512e.b.MATCH_PARENT && (c1512eM7723K2 = this.f18379b.m7723K()) != null && c1512eM7723K2.m7741T() == C1512e.b.FIXED) {
                    int iM7812x = (c1512eM7723K2.m7812x() - this.f18379b.f5858P.m7686f()) - this.f18379b.f5860R.m7686f();
                    m22212b(this.f18385h, c1512eM7723K2.f5879f.f18385h, this.f18379b.f5858P.m7686f());
                    m22212b(this.f18386i, c1512eM7723K2.f5879f.f18386i, -this.f18379b.f5860R.m7686f());
                    this.f18382e.mo22178d(iM7812x);
                    return;
                }
                if (this.f18381d == C1512e.b.FIXED) {
                    this.f18382e.mo22178d(this.f18379b.m7812x());
                }
            }
        } else if (this.f18381d == C1512e.b.MATCH_PARENT && (c1512eM7723K = this.f18379b.m7723K()) != null && c1512eM7723K.m7741T() == C1512e.b.FIXED) {
            m22212b(this.f18385h, c1512eM7723K.f5879f.f18385h, this.f18379b.f5858P.m7686f());
            m22212b(this.f18386i, c1512eM7723K.f5879f.f18386i, -this.f18379b.f5860R.m7686f());
            return;
        }
        C4413g c4413g = this.f18382e;
        boolean z10 = c4413g.f18335j;
        if (z10) {
            C1512e c1512e2 = this.f18379b;
            if (c1512e2.f5869a) {
                C1511d[] c1511dArr = c1512e2.f5865W;
                C1511d c1511d = c1511dArr[2];
                C1511d c1511d2 = c1511d.f5818f;
                if (c1511d2 != null && c1511dArr[3].f5818f != null) {
                    if (c1512e2.m7781k0()) {
                        this.f18385h.f18331f = this.f18379b.f5865W[2].m7686f();
                        this.f18386i.f18331f = -this.f18379b.f5865W[3].m7686f();
                    } else {
                        C4412f c4412fM22215h = m22215h(this.f18379b.f5865W[2]);
                        if (c4412fM22215h != null) {
                            m22212b(this.f18385h, c4412fM22215h, this.f18379b.f5865W[2].m7686f());
                        }
                        C4412f c4412fM22215h2 = m22215h(this.f18379b.f5865W[3]);
                        if (c4412fM22215h2 != null) {
                            m22212b(this.f18386i, c4412fM22215h2, -this.f18379b.f5865W[3].m7686f());
                        }
                        this.f18385h.f18327b = true;
                        this.f18386i.f18327b = true;
                    }
                    if (this.f18379b.m7753Z()) {
                        m22212b(this.f18361k, this.f18385h, this.f18379b.m7793p());
                        return;
                    }
                    return;
                }
                if (c1511d2 != null) {
                    C4412f c4412fM22215h3 = m22215h(c1511d);
                    if (c4412fM22215h3 != null) {
                        m22212b(this.f18385h, c4412fM22215h3, this.f18379b.f5865W[2].m7686f());
                        m22212b(this.f18386i, this.f18385h, this.f18382e.f18332g);
                        if (this.f18379b.m7753Z()) {
                            m22212b(this.f18361k, this.f18385h, this.f18379b.m7793p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1511d c1511d3 = c1511dArr[3];
                if (c1511d3.f5818f != null) {
                    C4412f c4412fM22215h4 = m22215h(c1511d3);
                    if (c4412fM22215h4 != null) {
                        m22212b(this.f18386i, c4412fM22215h4, -this.f18379b.f5865W[3].m7686f());
                        m22212b(this.f18385h, this.f18386i, -this.f18382e.f18332g);
                    }
                    if (this.f18379b.m7753Z()) {
                        m22212b(this.f18361k, this.f18385h, this.f18379b.m7793p());
                        return;
                    }
                    return;
                }
                C1511d c1511d4 = c1511dArr[4];
                if (c1511d4.f5818f != null) {
                    C4412f c4412fM22215h5 = m22215h(c1511d4);
                    if (c4412fM22215h5 != null) {
                        m22212b(this.f18361k, c4412fM22215h5, 0);
                        m22212b(this.f18385h, this.f18361k, -this.f18379b.m7793p());
                        m22212b(this.f18386i, this.f18385h, this.f18382e.f18332g);
                        return;
                    }
                    return;
                }
                if ((c1512e2 instanceof InterfaceC1516i) || c1512e2.m7723K() == null || this.f18379b.mo7791o(C1511d.a.CENTER).f5818f != null) {
                    return;
                }
                m22212b(this.f18385h, this.f18379b.m7723K().f5879f.f18385h, this.f18379b.m7751Y());
                m22212b(this.f18386i, this.f18385h, this.f18382e.f18332g);
                if (this.f18379b.m7753Z()) {
                    m22212b(this.f18361k, this.f18385h, this.f18379b.m7793p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f18381d != C1512e.b.MATCH_CONSTRAINT) {
            c4413g.m22176b(this);
        } else {
            C1512e c1512e3 = this.f18379b;
            int i10 = c1512e3.f5915x;
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
            } else if (i10 == 3 && !c1512e3.m7781k0()) {
                C1512e c1512e4 = this.f18379b;
                if (c1512e4.f5913w != 3) {
                    C4413g c4413g4 = c1512e4.f5877e.f18382e;
                    this.f18382e.f18337l.add(c4413g4);
                    c4413g4.f18336k.add(this.f18382e);
                    C4413g c4413g5 = this.f18382e;
                    c4413g5.f18327b = true;
                    c4413g5.f18336k.add(this.f18385h);
                    this.f18382e.f18336k.add(this.f18386i);
                }
            }
        }
        C1512e c1512e5 = this.f18379b;
        C1511d[] c1511dArr2 = c1512e5.f5865W;
        C1511d c1511d5 = c1511dArr2[2];
        C1511d c1511d6 = c1511d5.f5818f;
        if (c1511d6 != null && c1511dArr2[3].f5818f != null) {
            if (c1512e5.m7781k0()) {
                this.f18385h.f18331f = this.f18379b.f5865W[2].m7686f();
                this.f18386i.f18331f = -this.f18379b.f5865W[3].m7686f();
            } else {
                C4412f c4412fM22215h6 = m22215h(this.f18379b.f5865W[2]);
                C4412f c4412fM22215h7 = m22215h(this.f18379b.f5865W[3]);
                if (c4412fM22215h6 != null) {
                    c4412fM22215h6.m22176b(this);
                }
                if (c4412fM22215h7 != null) {
                    c4412fM22215h7.m22176b(this);
                }
                this.f18387j = AbstractC4422p.b.CENTER;
            }
            if (this.f18379b.m7753Z()) {
                m22213c(this.f18361k, this.f18385h, 1, this.f18362l);
            }
        } else if (c1511d6 != null) {
            C4412f c4412fM22215h8 = m22215h(c1511d5);
            if (c4412fM22215h8 != null) {
                m22212b(this.f18385h, c4412fM22215h8, this.f18379b.f5865W[2].m7686f());
                m22213c(this.f18386i, this.f18385h, 1, this.f18382e);
                if (this.f18379b.m7753Z()) {
                    m22213c(this.f18361k, this.f18385h, 1, this.f18362l);
                }
                C1512e.b bVar2 = this.f18381d;
                C1512e.b bVar3 = C1512e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f18379b.m7808v() > 0.0f) {
                    C4418l c4418l = this.f18379b.f5877e;
                    if (c4418l.f18381d == bVar3) {
                        c4418l.f18382e.f18336k.add(this.f18382e);
                        this.f18382e.f18337l.add(this.f18379b.f5877e.f18382e);
                        this.f18382e.f18326a = this;
                    }
                }
            }
        } else {
            C1511d c1511d7 = c1511dArr2[3];
            if (c1511d7.f5818f != null) {
                C4412f c4412fM22215h9 = m22215h(c1511d7);
                if (c4412fM22215h9 != null) {
                    m22212b(this.f18386i, c4412fM22215h9, -this.f18379b.f5865W[3].m7686f());
                    m22213c(this.f18385h, this.f18386i, -1, this.f18382e);
                    if (this.f18379b.m7753Z()) {
                        m22213c(this.f18361k, this.f18385h, 1, this.f18362l);
                    }
                }
            } else {
                C1511d c1511d8 = c1511dArr2[4];
                if (c1511d8.f5818f != null) {
                    C4412f c4412fM22215h10 = m22215h(c1511d8);
                    if (c4412fM22215h10 != null) {
                        m22212b(this.f18361k, c4412fM22215h10, 0);
                        m22213c(this.f18385h, this.f18361k, -1, this.f18362l);
                        m22213c(this.f18386i, this.f18385h, 1, this.f18382e);
                    }
                } else if (!(c1512e5 instanceof InterfaceC1516i) && c1512e5.m7723K() != null) {
                    m22212b(this.f18385h, this.f18379b.m7723K().f5879f.f18385h, this.f18379b.m7751Y());
                    m22213c(this.f18386i, this.f18385h, 1, this.f18382e);
                    if (this.f18379b.m7753Z()) {
                        m22213c(this.f18361k, this.f18385h, 1, this.f18362l);
                    }
                    C1512e.b bVar4 = this.f18381d;
                    C1512e.b bVar5 = C1512e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f18379b.m7808v() > 0.0f) {
                        C4418l c4418l2 = this.f18379b.f5877e;
                        if (c4418l2.f18381d == bVar5) {
                            c4418l2.f18382e.f18336k.add(this.f18382e);
                            this.f18382e.f18337l.add(this.f18379b.f5877e.f18382e);
                            this.f18382e.f18326a = this;
                        }
                    }
                }
            }
        }
        if (this.f18382e.f18337l.size() == 0) {
            this.f18382e.f18328c = true;
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: e */
    public void mo22155e() {
        C4412f c4412f = this.f18385h;
        if (c4412f.f18335j) {
            this.f18379b.m7792o1(c4412f.f18332g);
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: f */
    public void mo22156f() {
        this.f18380c = null;
        this.f18385h.m22177c();
        this.f18386i.m22177c();
        this.f18361k.m22177c();
        this.f18382e.m22177c();
        this.f18384g = false;
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: m */
    public boolean mo22158m() {
        return this.f18381d != C1512e.b.MATCH_CONSTRAINT || this.f18379b.f5915x == 0;
    }

    /* JADX INFO: renamed from: q */
    public void m22201q() {
        this.f18384g = false;
        this.f18385h.m22177c();
        this.f18385h.f18335j = false;
        this.f18386i.m22177c();
        this.f18386i.f18335j = false;
        this.f18361k.m22177c();
        this.f18361k.f18335j = false;
        this.f18382e.f18335j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f18379b.m7804t();
    }
}
