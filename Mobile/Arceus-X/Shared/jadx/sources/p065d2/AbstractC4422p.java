package p065d2;

import p038c2.C1511d;
import p038c2.C1512e;

/* JADX INFO: renamed from: d2.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4422p implements InterfaceC4410d {

    /* JADX INFO: renamed from: a */
    public int f18378a;

    /* JADX INFO: renamed from: b */
    public C1512e f18379b;

    /* JADX INFO: renamed from: c */
    public C4419m f18380c;

    /* JADX INFO: renamed from: d */
    public C1512e.b f18381d;

    /* JADX INFO: renamed from: e */
    public C4413g f18382e = new C4413g(this);

    /* JADX INFO: renamed from: f */
    public int f18383f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f18384g = false;

    /* JADX INFO: renamed from: h */
    public C4412f f18385h = new C4412f(this);

    /* JADX INFO: renamed from: i */
    public C4412f f18386i = new C4412f(this);

    /* JADX INFO: renamed from: j */
    public b f18387j = b.NONE;

    /* JADX INFO: renamed from: d2.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18388a;

        static {
            int[] iArr = new int[C1511d.a.values().length];
            f18388a = iArr;
            try {
                iArr[C1511d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18388a[C1511d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18388a[C1511d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18388a[C1511d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18388a[C1511d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: d2.p$b */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC4422p(C1512e c1512e) {
        this.f18379b = c1512e;
    }

    @Override // p065d2.InterfaceC4410d
    /* JADX INFO: renamed from: a */
    public void mo22153a(InterfaceC4410d interfaceC4410d) {
    }

    /* JADX INFO: renamed from: b */
    public final void m22212b(C4412f c4412f, C4412f c4412f2, int i10) {
        c4412f.f18337l.add(c4412f2);
        c4412f.f18331f = i10;
        c4412f2.f18336k.add(c4412f);
    }

    /* JADX INFO: renamed from: c */
    public final void m22213c(C4412f c4412f, C4412f c4412f2, int i10, C4413g c4413g) {
        c4412f.f18337l.add(c4412f2);
        c4412f.f18337l.add(this.f18382e);
        c4412f.f18333h = i10;
        c4412f.f18334i = c4413g;
        c4412f2.f18336k.add(c4412f);
        c4413g.f18336k.add(c4412f);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo22154d();

    /* JADX INFO: renamed from: e */
    public abstract void mo22155e();

    /* JADX INFO: renamed from: f */
    public abstract void mo22156f();

    /* JADX INFO: renamed from: g */
    public final int m22214g(int i10, int i11) {
        if (i11 == 0) {
            C1512e c1512e = this.f18379b;
            int i12 = c1512e.f5833A;
            int iMax = Math.max(c1512e.f5919z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            C1512e c1512e2 = this.f18379b;
            int i13 = c1512e2.f5839D;
            int iMax2 = Math.max(c1512e2.f5837C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public final C4412f m22215h(C1511d c1511d) {
        C1511d c1511d2 = c1511d.f5818f;
        if (c1511d2 == null) {
            return null;
        }
        C1512e c1512e = c1511d2.f5816d;
        int i10 = a.f18388a[c1511d2.f5817e.ordinal()];
        if (i10 == 1) {
            return c1512e.f5877e.f18385h;
        }
        if (i10 == 2) {
            return c1512e.f5877e.f18386i;
        }
        if (i10 == 3) {
            return c1512e.f5879f.f18385h;
        }
        if (i10 == 4) {
            return c1512e.f5879f.f18361k;
        }
        if (i10 != 5) {
            return null;
        }
        return c1512e.f5879f.f18386i;
    }

    /* JADX INFO: renamed from: i */
    public final C4412f m22216i(C1511d c1511d, int i10) {
        C1511d c1511d2 = c1511d.f5818f;
        if (c1511d2 == null) {
            return null;
        }
        C1512e c1512e = c1511d2.f5816d;
        AbstractC4422p abstractC4422p = i10 == 0 ? c1512e.f5877e : c1512e.f5879f;
        int i11 = a.f18388a[c1511d2.f5817e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return abstractC4422p.f18386i;
        }
        return abstractC4422p.f18385h;
    }

    /* JADX INFO: renamed from: j */
    public long mo22157j() {
        C4413g c4413g = this.f18382e;
        if (c4413g.f18335j) {
            return c4413g.f18332g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public boolean m22217k() {
        return this.f18384g;
    }

    /* JADX INFO: renamed from: l */
    public final void m22218l(int i10, int i11) {
        int i12 = this.f18378a;
        if (i12 == 0) {
            this.f18382e.mo22178d(m22214g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f18382e.mo22178d(Math.min(m22214g(this.f18382e.f18347m, i10), i11));
            return;
        }
        if (i12 == 2) {
            C1512e c1512eM7723K = this.f18379b.m7723K();
            if (c1512eM7723K != null) {
                C4413g c4413g = (i10 == 0 ? c1512eM7723K.f5877e : c1512eM7723K.f5879f).f18382e;
                if (c4413g.f18335j) {
                    this.f18382e.mo22178d(m22214g((int) ((c4413g.f18332g * (i10 == 0 ? this.f18379b.f5835B : this.f18379b.f5841E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        C1512e c1512e = this.f18379b;
        AbstractC4422p abstractC4422p = c1512e.f5877e;
        C1512e.b bVar = abstractC4422p.f18381d;
        C1512e.b bVar2 = C1512e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && abstractC4422p.f18378a == 3) {
            C4420n c4420n = c1512e.f5879f;
            if (c4420n.f18381d == bVar2 && c4420n.f18378a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            abstractC4422p = c1512e.f5879f;
        }
        if (abstractC4422p.f18382e.f18335j) {
            float fM7808v = c1512e.m7808v();
            this.f18382e.mo22178d(i10 == 1 ? (int) ((abstractC4422p.f18382e.f18332g / fM7808v) + 0.5f) : (int) ((fM7808v * abstractC4422p.f18382e.f18332g) + 0.5f));
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo22158m();

    /* JADX INFO: renamed from: n */
    public void m22219n(InterfaceC4410d interfaceC4410d, C1511d c1511d, C1511d c1511d2, int i10) {
        C4412f c4412fM22215h = m22215h(c1511d);
        C4412f c4412fM22215h2 = m22215h(c1511d2);
        if (c4412fM22215h.f18335j && c4412fM22215h2.f18335j) {
            int iM7686f = c4412fM22215h.f18332g + c1511d.m7686f();
            int iM7686f2 = c4412fM22215h2.f18332g - c1511d2.m7686f();
            int i11 = iM7686f2 - iM7686f;
            if (!this.f18382e.f18335j && this.f18381d == C1512e.b.MATCH_CONSTRAINT) {
                m22218l(i10, i11);
            }
            C4413g c4413g = this.f18382e;
            if (c4413g.f18335j) {
                if (c4413g.f18332g == i11) {
                    this.f18385h.mo22178d(iM7686f);
                    this.f18386i.mo22178d(iM7686f2);
                    return;
                }
                float fM7814y = i10 == 0 ? this.f18379b.m7814y() : this.f18379b.m7737R();
                if (c4412fM22215h == c4412fM22215h2) {
                    iM7686f = c4412fM22215h.f18332g;
                    iM7686f2 = c4412fM22215h2.f18332g;
                    fM7814y = 0.5f;
                }
                this.f18385h.mo22178d((int) (iM7686f + 0.5f + (((iM7686f2 - iM7686f) - this.f18382e.f18332g) * fM7814y)));
                this.f18386i.mo22178d(this.f18385h.f18332g + this.f18382e.f18332g);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m22220o(InterfaceC4410d interfaceC4410d) {
    }

    /* JADX INFO: renamed from: p */
    public void m22221p(InterfaceC4410d interfaceC4410d) {
    }
}
