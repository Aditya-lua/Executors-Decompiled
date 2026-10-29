package p591z1;

import java.util.ArrayList;

/* JADX INFO: renamed from: z1.b */
/* JADX INFO: loaded from: classes.dex */
public class C13680b implements C13682d.a {

    /* JADX INFO: renamed from: e */
    public a f47984e;

    /* JADX INFO: renamed from: a */
    public C13687i f47980a = null;

    /* JADX INFO: renamed from: b */
    public float f47981b = 0.0f;

    /* JADX INFO: renamed from: c */
    public boolean f47982c = false;

    /* JADX INFO: renamed from: d */
    public ArrayList<C13687i> f47983d = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public boolean f47985f = false;

    /* JADX INFO: renamed from: z1.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        float mo49907a(C13687i c13687i);

        /* JADX INFO: renamed from: b */
        C13687i mo49908b(int i10);

        /* JADX INFO: renamed from: c */
        void mo49909c(C13687i c13687i, float f10);

        void clear();

        /* JADX INFO: renamed from: d */
        void mo49910d();

        /* JADX INFO: renamed from: e */
        float mo49911e(C13680b c13680b, boolean z10);

        /* JADX INFO: renamed from: f */
        void mo49912f(C13687i c13687i, float f10, boolean z10);

        /* JADX INFO: renamed from: g */
        boolean mo49913g(C13687i c13687i);

        /* JADX INFO: renamed from: h */
        int mo49914h();

        /* JADX INFO: renamed from: i */
        float mo49915i(int i10);

        /* JADX INFO: renamed from: j */
        float mo49916j(C13687i c13687i, boolean z10);

        /* JADX INFO: renamed from: k */
        void mo49917k(float f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13680b() {
    }

    /* JADX INFO: renamed from: A */
    public void m49918A(C13682d c13682d, C13687i c13687i, boolean z10) {
        if (c13687i == null || !c13687i.f48034g) {
            return;
        }
        this.f47981b += c13687i.f48033f * this.f47984e.mo49907a(c13687i);
        this.f47984e.mo49916j(c13687i, z10);
        if (z10) {
            c13687i.m49994d(this);
        }
        if (C13682d.f47992u && this.f47984e.mo49914h() == 0) {
            this.f47985f = true;
            c13682d.f47998b = true;
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo49919B(C13682d c13682d, C13680b c13680b, boolean z10) {
        this.f47981b += c13680b.f47981b * this.f47984e.mo49911e(c13680b, z10);
        if (z10) {
            c13680b.f47980a.m49994d(this);
        }
        if (C13682d.f47992u && this.f47980a != null && this.f47984e.mo49914h() == 0) {
            this.f47985f = true;
            c13682d.f47998b = true;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m49920C(C13682d c13682d, C13687i c13687i, boolean z10) {
        if (c13687i == null || !c13687i.f48041n) {
            return;
        }
        float fMo49907a = this.f47984e.mo49907a(c13687i);
        this.f47981b += c13687i.f48043p * fMo49907a;
        this.f47984e.mo49916j(c13687i, z10);
        if (z10) {
            c13687i.m49994d(this);
        }
        this.f47984e.mo49912f(c13682d.f48011o.f47989d[c13687i.f48042o], fMo49907a, z10);
        if (C13682d.f47992u && this.f47984e.mo49914h() == 0) {
            this.f47985f = true;
            c13682d.f47998b = true;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m49921D(C13682d c13682d) {
        if (c13682d.f48004h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iMo49914h = this.f47984e.mo49914h();
            for (int i10 = 0; i10 < iMo49914h; i10++) {
                C13687i c13687iMo49908b = this.f47984e.mo49908b(i10);
                if (c13687iMo49908b.f48031d != -1 || c13687iMo49908b.f48034g || c13687iMo49908b.f48041n) {
                    this.f47983d.add(c13687iMo49908b);
                }
            }
            int size = this.f47983d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    C13687i c13687i = this.f47983d.get(i11);
                    if (c13687i.f48034g) {
                        m49918A(c13682d, c13687i, true);
                    } else if (c13687i.f48041n) {
                        m49920C(c13682d, c13687i, true);
                    } else {
                        mo49919B(c13682d, c13682d.f48004h[c13687i.f48031d], true);
                    }
                }
                this.f47983d.clear();
            } else {
                z10 = true;
            }
        }
        if (C13682d.f47992u && this.f47980a != null && this.f47984e.mo49914h() == 0) {
            this.f47985f = true;
            c13682d.f47998b = true;
        }
    }

    @Override // p591z1.C13682d.a
    /* JADX INFO: renamed from: a */
    public C13687i mo49922a(C13682d c13682d, boolean[] zArr) {
        return m49944w(zArr, null);
    }

    @Override // p591z1.C13682d.a
    /* JADX INFO: renamed from: b */
    public void mo49923b(C13687i c13687i) {
        int i10 = c13687i.f48032e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f47984e.mo49909c(c13687i, f10);
    }

    @Override // p591z1.C13682d.a
    /* JADX INFO: renamed from: c */
    public void mo49924c(C13682d.a aVar) {
        if (aVar instanceof C13680b) {
            C13680b c13680b = (C13680b) aVar;
            this.f47980a = null;
            this.f47984e.clear();
            for (int i10 = 0; i10 < c13680b.f47984e.mo49914h(); i10++) {
                this.f47984e.mo49912f(c13680b.f47984e.mo49908b(i10), c13680b.f47984e.mo49915i(i10), true);
            }
        }
    }

    @Override // p591z1.C13682d.a
    public void clear() {
        this.f47984e.clear();
        this.f47980a = null;
        this.f47981b = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public C13680b m49925d(C13682d c13682d, int i10) {
        this.f47984e.mo49909c(c13682d.m49969o(i10, "ep"), 1.0f);
        this.f47984e.mo49909c(c13682d.m49969o(i10, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C13680b m49926e(C13687i c13687i, int i10) {
        this.f47984e.mo49909c(c13687i, i10);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public boolean m49927f(C13682d c13682d) {
        boolean z10;
        C13687i c13687iM49928g = m49928g(c13682d);
        if (c13687iM49928g == null) {
            z10 = true;
        } else {
            m49945x(c13687iM49928g);
            z10 = false;
        }
        if (this.f47984e.mo49914h() == 0) {
            this.f47985f = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: g */
    public C13687i m49928g(C13682d c13682d) {
        int iMo49914h = this.f47984e.mo49914h();
        C13687i c13687i = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        C13687i c13687i2 = null;
        for (int i10 = 0; i10 < iMo49914h; i10++) {
            float fMo49915i = this.f47984e.mo49915i(i10);
            C13687i c13687iMo49908b = this.f47984e.mo49908b(i10);
            if (c13687iMo49908b.f48037j == C13687i.a.UNRESTRICTED) {
                if (c13687i == null || f10 > fMo49915i) {
                    boolean zM49942u = m49942u(c13687iMo49908b, c13682d);
                    z10 = zM49942u;
                    f10 = fMo49915i;
                    c13687i = c13687iMo49908b;
                } else if (!z10 && m49942u(c13687iMo49908b, c13682d)) {
                    f10 = fMo49915i;
                    c13687i = c13687iMo49908b;
                    z10 = true;
                }
            } else if (c13687i == null && fMo49915i < 0.0f) {
                if (c13687i2 == null || f11 > fMo49915i) {
                    boolean zM49942u2 = m49942u(c13687iMo49908b, c13682d);
                    z11 = zM49942u2;
                    f11 = fMo49915i;
                    c13687i2 = c13687iMo49908b;
                } else if (!z11 && m49942u(c13687iMo49908b, c13682d)) {
                    f11 = fMo49915i;
                    c13687i2 = c13687iMo49908b;
                    z11 = true;
                }
            }
        }
        return c13687i != null ? c13687i : c13687i2;
    }

    @Override // p591z1.C13682d.a
    public C13687i getKey() {
        return this.f47980a;
    }

    /* JADX INFO: renamed from: h */
    public C13680b m49929h(C13687i c13687i, C13687i c13687i2, int i10, float f10, C13687i c13687i3, C13687i c13687i4, int i11) {
        if (c13687i2 == c13687i3) {
            this.f47984e.mo49909c(c13687i, 1.0f);
            this.f47984e.mo49909c(c13687i4, 1.0f);
            this.f47984e.mo49909c(c13687i2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f47984e.mo49909c(c13687i, 1.0f);
            this.f47984e.mo49909c(c13687i2, -1.0f);
            this.f47984e.mo49909c(c13687i3, -1.0f);
            this.f47984e.mo49909c(c13687i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f47981b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f47984e.mo49909c(c13687i, -1.0f);
                this.f47984e.mo49909c(c13687i2, 1.0f);
                this.f47981b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f47984e.mo49909c(c13687i4, -1.0f);
                this.f47984e.mo49909c(c13687i3, 1.0f);
                this.f47981b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f47984e.mo49909c(c13687i, f11 * 1.0f);
            this.f47984e.mo49909c(c13687i2, f11 * (-1.0f));
            this.f47984e.mo49909c(c13687i3, (-1.0f) * f10);
            this.f47984e.mo49909c(c13687i4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f47981b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C13680b m49930i(C13687i c13687i, int i10) {
        this.f47980a = c13687i;
        float f10 = i10;
        c13687i.f48033f = f10;
        this.f47981b = f10;
        this.f47985f = true;
        return this;
    }

    @Override // p591z1.C13682d.a
    public boolean isEmpty() {
        return this.f47980a == null && this.f47981b == 0.0f && this.f47984e.mo49914h() == 0;
    }

    /* JADX INFO: renamed from: j */
    public C13680b m49931j(C13687i c13687i, C13687i c13687i2, float f10) {
        this.f47984e.mo49909c(c13687i, -1.0f);
        this.f47984e.mo49909c(c13687i2, f10);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C13680b m49932k(C13687i c13687i, C13687i c13687i2, C13687i c13687i3, C13687i c13687i4, float f10) {
        this.f47984e.mo49909c(c13687i, -1.0f);
        this.f47984e.mo49909c(c13687i2, 1.0f);
        this.f47984e.mo49909c(c13687i3, f10);
        this.f47984e.mo49909c(c13687i4, -f10);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C13680b m49933l(float f10, float f11, float f12, C13687i c13687i, C13687i c13687i2, C13687i c13687i3, C13687i c13687i4) {
        this.f47981b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f47984e.mo49909c(c13687i, 1.0f);
            this.f47984e.mo49909c(c13687i2, -1.0f);
            this.f47984e.mo49909c(c13687i4, 1.0f);
            this.f47984e.mo49909c(c13687i3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f47984e.mo49909c(c13687i, 1.0f);
            this.f47984e.mo49909c(c13687i2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f47984e.mo49909c(c13687i3, 1.0f);
            this.f47984e.mo49909c(c13687i4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f47984e.mo49909c(c13687i, 1.0f);
        this.f47984e.mo49909c(c13687i2, -1.0f);
        this.f47984e.mo49909c(c13687i4, f13);
        this.f47984e.mo49909c(c13687i3, -f13);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C13680b m49934m(C13687i c13687i, int i10) {
        if (i10 < 0) {
            this.f47981b = i10 * (-1);
            this.f47984e.mo49909c(c13687i, 1.0f);
            return this;
        }
        this.f47981b = i10;
        this.f47984e.mo49909c(c13687i, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C13680b m49935n(C13687i c13687i, C13687i c13687i2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f47981b = i10;
        }
        if (z10) {
            this.f47984e.mo49909c(c13687i, 1.0f);
            this.f47984e.mo49909c(c13687i2, -1.0f);
            return this;
        }
        this.f47984e.mo49909c(c13687i, -1.0f);
        this.f47984e.mo49909c(c13687i2, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C13680b m49936o(C13687i c13687i, C13687i c13687i2, C13687i c13687i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f47981b = i10;
        }
        if (z10) {
            this.f47984e.mo49909c(c13687i, 1.0f);
            this.f47984e.mo49909c(c13687i2, -1.0f);
            this.f47984e.mo49909c(c13687i3, -1.0f);
            return this;
        }
        this.f47984e.mo49909c(c13687i, -1.0f);
        this.f47984e.mo49909c(c13687i2, 1.0f);
        this.f47984e.mo49909c(c13687i3, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C13680b m49937p(C13687i c13687i, C13687i c13687i2, C13687i c13687i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f47981b = i10;
        }
        if (z10) {
            this.f47984e.mo49909c(c13687i, 1.0f);
            this.f47984e.mo49909c(c13687i2, -1.0f);
            this.f47984e.mo49909c(c13687i3, 1.0f);
            return this;
        }
        this.f47984e.mo49909c(c13687i, -1.0f);
        this.f47984e.mo49909c(c13687i2, 1.0f);
        this.f47984e.mo49909c(c13687i3, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C13680b m49938q(C13687i c13687i, C13687i c13687i2, C13687i c13687i3, C13687i c13687i4, float f10) {
        this.f47984e.mo49909c(c13687i3, 0.5f);
        this.f47984e.mo49909c(c13687i4, 0.5f);
        this.f47984e.mo49909c(c13687i, -0.5f);
        this.f47984e.mo49909c(c13687i2, -0.5f);
        this.f47981b = -f10;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m49939r() {
        float f10 = this.f47981b;
        if (f10 < 0.0f) {
            this.f47981b = f10 * (-1.0f);
            this.f47984e.mo49910d();
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m49940s() {
        C13687i c13687i = this.f47980a;
        if (c13687i != null) {
            return c13687i.f48037j == C13687i.a.UNRESTRICTED || this.f47981b >= 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m49941t(C13687i c13687i) {
        return this.f47984e.mo49913g(c13687i);
    }

    public String toString() {
        return m49947z();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m49942u(C13687i c13687i, C13682d c13682d) {
        return c13687i.f48040m <= 1;
    }

    /* JADX INFO: renamed from: v */
    public C13687i m49943v(C13687i c13687i) {
        return m49944w(null, c13687i);
    }

    /* JADX INFO: renamed from: w */
    public final C13687i m49944w(boolean[] zArr, C13687i c13687i) {
        C13687i.a aVar;
        int iMo49914h = this.f47984e.mo49914h();
        C13687i c13687i2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iMo49914h; i10++) {
            float fMo49915i = this.f47984e.mo49915i(i10);
            if (fMo49915i < 0.0f) {
                C13687i c13687iMo49908b = this.f47984e.mo49908b(i10);
                if ((zArr == null || !zArr[c13687iMo49908b.f48030c]) && c13687iMo49908b != c13687i && (((aVar = c13687iMo49908b.f48037j) == C13687i.a.SLACK || aVar == C13687i.a.ERROR) && fMo49915i < f10)) {
                    f10 = fMo49915i;
                    c13687i2 = c13687iMo49908b;
                }
            }
        }
        return c13687i2;
    }

    /* JADX INFO: renamed from: x */
    public void m49945x(C13687i c13687i) {
        C13687i c13687i2 = this.f47980a;
        if (c13687i2 != null) {
            this.f47984e.mo49909c(c13687i2, -1.0f);
            this.f47980a.f48031d = -1;
            this.f47980a = null;
        }
        float fMo49916j = this.f47984e.mo49916j(c13687i, true) * (-1.0f);
        this.f47980a = c13687i;
        if (fMo49916j == 1.0f) {
            return;
        }
        this.f47981b /= fMo49916j;
        this.f47984e.mo49917k(fMo49916j);
    }

    /* JADX INFO: renamed from: y */
    public void m49946y() {
        this.f47980a = null;
        this.f47984e.clear();
        this.f47981b = 0.0f;
        this.f47985f = false;
    }

    /* JADX INFO: renamed from: z */
    public String m49947z() {
        boolean z10;
        String str = (this.f47980a == null ? "0" : "" + this.f47980a) + " = ";
        if (this.f47981b != 0.0f) {
            str = str + this.f47981b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iMo49914h = this.f47984e.mo49914h();
        for (int i10 = 0; i10 < iMo49914h; i10++) {
            C13687i c13687iMo49908b = this.f47984e.mo49908b(i10);
            if (c13687iMo49908b != null) {
                float fMo49915i = this.f47984e.mo49915i(i10);
                if (fMo49915i != 0.0f) {
                    String string = c13687iMo49908b.toString();
                    if (z10) {
                        if (fMo49915i > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fMo49915i *= -1.0f;
                        }
                    } else if (fMo49915i < 0.0f) {
                        str = str + "- ";
                        fMo49915i *= -1.0f;
                    }
                    str = fMo49915i == 1.0f ? str + string : str + fMo49915i + " " + string;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public C13680b(C13681c c13681c) {
        this.f47984e = new C13679a(this, c13681c);
    }
}
