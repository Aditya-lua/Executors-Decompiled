package p591z1;

import java.util.Arrays;
import java.util.HashMap;
import p038c2.C1511d;
import p038c2.C1512e;

/* JADX INFO: renamed from: z1.d */
/* JADX INFO: loaded from: classes.dex */
public class C13682d {

    /* JADX INFO: renamed from: s */
    public static boolean f47990s = false;

    /* JADX INFO: renamed from: t */
    public static boolean f47991t = true;

    /* JADX INFO: renamed from: u */
    public static boolean f47992u = true;

    /* JADX INFO: renamed from: v */
    public static boolean f47993v = true;

    /* JADX INFO: renamed from: w */
    public static boolean f47994w;

    /* JADX INFO: renamed from: x */
    public static long f47995x;

    /* JADX INFO: renamed from: y */
    public static long f47996y;

    /* JADX INFO: renamed from: e */
    public a f48001e;

    /* JADX INFO: renamed from: o */
    public final C13681c f48011o;

    /* JADX INFO: renamed from: r */
    public a f48014r;

    /* JADX INFO: renamed from: a */
    public int f47997a = 1000;

    /* JADX INFO: renamed from: b */
    public boolean f47998b = false;

    /* JADX INFO: renamed from: c */
    public int f47999c = 0;

    /* JADX INFO: renamed from: d */
    public HashMap<String, C13687i> f48000d = null;

    /* JADX INFO: renamed from: f */
    public int f48002f = 32;

    /* JADX INFO: renamed from: g */
    public int f48003g = 32;

    /* JADX INFO: renamed from: i */
    public boolean f48005i = false;

    /* JADX INFO: renamed from: j */
    public boolean f48006j = false;

    /* JADX INFO: renamed from: k */
    public boolean[] f48007k = new boolean[32];

    /* JADX INFO: renamed from: l */
    public int f48008l = 1;

    /* JADX INFO: renamed from: m */
    public int f48009m = 0;

    /* JADX INFO: renamed from: n */
    public int f48010n = 32;

    /* JADX INFO: renamed from: p */
    public C13687i[] f48012p = new C13687i[1000];

    /* JADX INFO: renamed from: q */
    public int f48013q = 0;

    /* JADX INFO: renamed from: h */
    public C13680b[] f48004h = new C13680b[32];

    /* JADX INFO: renamed from: z1.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        C13687i mo49922a(C13682d c13682d, boolean[] zArr);

        /* JADX INFO: renamed from: b */
        void mo49923b(C13687i c13687i);

        /* JADX INFO: renamed from: c */
        void mo49924c(a aVar);

        void clear();

        C13687i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: z1.d$b */
    public static class b extends C13680b {
        public b(C13681c c13681c) {
            this.f47984e = new C13688j(this, c13681c);
        }
    }

    public C13682d() {
        m49953D();
        C13681c c13681c = new C13681c();
        this.f48011o = c13681c;
        this.f48001e = new C13686h(c13681c);
        if (f47994w) {
            this.f48014r = new b(c13681c);
        } else {
            this.f48014r = new C13680b(c13681c);
        }
    }

    /* JADX INFO: renamed from: s */
    public static C13680b m49948s(C13682d c13682d, C13687i c13687i, C13687i c13687i2, float f10) {
        return c13682d.m49972r().m49931j(c13687i, c13687i2, f10);
    }

    /* JADX INFO: renamed from: x */
    public static C13683e m49949x() {
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m49950A() {
        if (this.f48001e.isEmpty()) {
            m49968n();
            return;
        }
        if (!this.f48005i && !this.f48006j) {
            m49951B(this.f48001e);
            return;
        }
        for (int i10 = 0; i10 < this.f48009m; i10++) {
            if (!this.f48004h[i10].f47985f) {
                m49951B(this.f48001e);
                return;
            }
        }
        m49968n();
    }

    /* JADX INFO: renamed from: B */
    public void m49951B(a aVar) {
        m49974u(aVar);
        m49952C(aVar, false);
        m49968n();
    }

    /* JADX INFO: renamed from: C */
    public final int m49952C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f48008l; i10++) {
            this.f48007k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f48008l * 2) {
                if (aVar.getKey() != null) {
                    this.f48007k[aVar.getKey().f48030c] = true;
                }
                C13687i c13687iMo49922a = aVar.mo49922a(this, this.f48007k);
                if (c13687iMo49922a != null) {
                    boolean[] zArr = this.f48007k;
                    int i12 = c13687iMo49922a.f48030c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (c13687iMo49922a != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f48009m; i14++) {
                        C13680b c13680b = this.f48004h[i14];
                        if (c13680b.f47980a.f48037j != C13687i.a.UNRESTRICTED && !c13680b.f47985f && c13680b.m49941t(c13687iMo49922a)) {
                            float fMo49907a = c13680b.f47984e.mo49907a(c13687iMo49922a);
                            if (fMo49907a < 0.0f) {
                                float f11 = (-c13680b.f47981b) / fMo49907a;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        C13680b c13680b2 = this.f48004h[i13];
                        c13680b2.f47980a.f48031d = -1;
                        c13680b2.m49945x(c13687iMo49922a);
                        C13687i c13687i = c13680b2.f47980a;
                        c13687i.f48031d = i13;
                        c13687i.m49998l(this, c13680b2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    /* JADX INFO: renamed from: D */
    public final void m49953D() {
        int i10 = 0;
        if (f47994w) {
            while (i10 < this.f48009m) {
                C13680b c13680b = this.f48004h[i10];
                if (c13680b != null) {
                    this.f48011o.f47986a.mo49979a(c13680b);
                }
                this.f48004h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f48009m) {
            C13680b c13680b2 = this.f48004h[i10];
            if (c13680b2 != null) {
                this.f48011o.f47987b.mo49979a(c13680b2);
            }
            this.f48004h[i10] = null;
            i10++;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m49954E() {
        C13681c c13681c;
        int i10 = 0;
        while (true) {
            c13681c = this.f48011o;
            C13687i[] c13687iArr = c13681c.f47989d;
            if (i10 >= c13687iArr.length) {
                break;
            }
            C13687i c13687i = c13687iArr[i10];
            if (c13687i != null) {
                c13687i.m49995e();
            }
            i10++;
        }
        c13681c.f47988c.mo49981c(this.f48012p, this.f48013q);
        this.f48013q = 0;
        Arrays.fill(this.f48011o.f47989d, (Object) null);
        HashMap<String, C13687i> map = this.f48000d;
        if (map != null) {
            map.clear();
        }
        this.f47999c = 0;
        this.f48001e.clear();
        this.f48008l = 1;
        for (int i11 = 0; i11 < this.f48009m; i11++) {
            C13680b c13680b = this.f48004h[i11];
            if (c13680b != null) {
                c13680b.f47982c = false;
            }
        }
        m49953D();
        this.f48009m = 0;
        if (f47994w) {
            this.f48014r = new b(this.f48011o);
        } else {
            this.f48014r = new C13680b(this.f48011o);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C13687i m49955a(C13687i.a aVar, String str) {
        C13687i c13687iMo49980b = this.f48011o.f47988c.mo49980b();
        if (c13687iMo49980b == null) {
            c13687iMo49980b = new C13687i(aVar, str);
            c13687iMo49980b.m49997j(aVar, str);
        } else {
            c13687iMo49980b.m49995e();
            c13687iMo49980b.m49997j(aVar, str);
        }
        int i10 = this.f48013q;
        int i11 = this.f47997a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f47997a = i12;
            this.f48012p = (C13687i[]) Arrays.copyOf(this.f48012p, i12);
        }
        C13687i[] c13687iArr = this.f48012p;
        int i13 = this.f48013q;
        this.f48013q = i13 + 1;
        c13687iArr[i13] = c13687iMo49980b;
        return c13687iMo49980b;
    }

    /* JADX INFO: renamed from: b */
    public void m49956b(C1512e c1512e, C1512e c1512e2, float f10, int i10) {
        C1511d.a aVar = C1511d.a.LEFT;
        C13687i c13687iM49971q = m49971q(c1512e.mo7791o(aVar));
        C1511d.a aVar2 = C1511d.a.TOP;
        C13687i c13687iM49971q2 = m49971q(c1512e.mo7791o(aVar2));
        C1511d.a aVar3 = C1511d.a.RIGHT;
        C13687i c13687iM49971q3 = m49971q(c1512e.mo7791o(aVar3));
        C1511d.a aVar4 = C1511d.a.BOTTOM;
        C13687i c13687iM49971q4 = m49971q(c1512e.mo7791o(aVar4));
        C13687i c13687iM49971q5 = m49971q(c1512e2.mo7791o(aVar));
        C13687i c13687iM49971q6 = m49971q(c1512e2.mo7791o(aVar2));
        C13687i c13687iM49971q7 = m49971q(c1512e2.mo7791o(aVar3));
        C13687i c13687iM49971q8 = m49971q(c1512e2.mo7791o(aVar4));
        C13680b c13680bM49972r = m49972r();
        double d10 = f10;
        double d11 = i10;
        c13680bM49972r.m49938q(c13687iM49971q2, c13687iM49971q4, c13687iM49971q6, c13687iM49971q8, (float) (Math.sin(d10) * d11));
        m49958d(c13680bM49972r);
        C13680b c13680bM49972r2 = m49972r();
        c13680bM49972r2.m49938q(c13687iM49971q, c13687iM49971q3, c13687iM49971q5, c13687iM49971q7, (float) (Math.cos(d10) * d11));
        m49958d(c13680bM49972r2);
    }

    /* JADX INFO: renamed from: c */
    public void m49957c(C13687i c13687i, C13687i c13687i2, int i10, float f10, C13687i c13687i3, C13687i c13687i4, int i11, int i12) {
        C13680b c13680bM49972r = m49972r();
        c13680bM49972r.m49929h(c13687i, c13687i2, i10, f10, c13687i3, c13687i4, i11);
        if (i12 != 8) {
            c13680bM49972r.m49925d(this, i12);
        }
        m49958d(c13680bM49972r);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX INFO: renamed from: d */
    public void m49958d(C13680b c13680b) {
        C13687i c13687iM49943v;
        if (c13680b == null) {
            return;
        }
        boolean z10 = true;
        if (this.f48009m + 1 >= this.f48010n || this.f48008l + 1 >= this.f48003g) {
            m49978z();
        }
        boolean z11 = false;
        if (!c13680b.f47985f) {
            c13680b.m49921D(this);
            if (c13680b.isEmpty()) {
                return;
            }
            c13680b.m49939r();
            if (c13680b.m49927f(this)) {
                C13687i c13687iM49970p = m49970p();
                c13680b.f47980a = c13687iM49970p;
                int i10 = this.f48009m;
                m49966l(c13680b);
                if (this.f48009m == i10 + 1) {
                    this.f48014r.mo49924c(c13680b);
                    m49952C(this.f48014r, true);
                    if (c13687iM49970p.f48031d == -1) {
                        if (c13680b.f47980a == c13687iM49970p && (c13687iM49943v = c13680b.m49943v(c13687iM49970p)) != null) {
                            c13680b.m49945x(c13687iM49943v);
                        }
                        if (!c13680b.f47985f) {
                            c13680b.f47980a.m49998l(this, c13680b);
                        }
                        if (f47994w) {
                            this.f48011o.f47986a.mo49979a(c13680b);
                        } else {
                            this.f48011o.f47987b.mo49979a(c13680b);
                        }
                        this.f48009m--;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!c13680b.m49940s()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        m49966l(c13680b);
    }

    /* JADX INFO: renamed from: e */
    public C13680b m49959e(C13687i c13687i, C13687i c13687i2, int i10, int i11) {
        if (f47991t && i11 == 8 && c13687i2.f48034g && c13687i.f48031d == -1) {
            c13687i.m49996h(this, c13687i2.f48033f + i10);
            return null;
        }
        C13680b c13680bM49972r = m49972r();
        c13680bM49972r.m49935n(c13687i, c13687i2, i10);
        if (i11 != 8) {
            c13680bM49972r.m49925d(this, i11);
        }
        m49958d(c13680bM49972r);
        return c13680bM49972r;
    }

    /* JADX INFO: renamed from: f */
    public void m49960f(C13687i c13687i, int i10) {
        if (f47991t && c13687i.f48031d == -1) {
            float f10 = i10;
            c13687i.m49996h(this, f10);
            for (int i11 = 0; i11 < this.f47999c + 1; i11++) {
                C13687i c13687i2 = this.f48011o.f47989d[i11];
                if (c13687i2 != null && c13687i2.f48041n && c13687i2.f48042o == c13687i.f48030c) {
                    c13687i2.m49996h(this, c13687i2.f48043p + f10);
                }
            }
            return;
        }
        int i12 = c13687i.f48031d;
        if (i12 == -1) {
            C13680b c13680bM49972r = m49972r();
            c13680bM49972r.m49930i(c13687i, i10);
            m49958d(c13680bM49972r);
            return;
        }
        C13680b c13680b = this.f48004h[i12];
        if (c13680b.f47985f) {
            c13680b.f47981b = i10;
            return;
        }
        if (c13680b.f47984e.mo49914h() == 0) {
            c13680b.f47985f = true;
            c13680b.f47981b = i10;
        } else {
            C13680b c13680bM49972r2 = m49972r();
            c13680bM49972r2.m49934m(c13687i, i10);
            m49958d(c13680bM49972r2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m49961g(C13687i c13687i, C13687i c13687i2, int i10, boolean z10) {
        C13680b c13680bM49972r = m49972r();
        C13687i c13687iM49973t = m49973t();
        c13687iM49973t.f48032e = 0;
        c13680bM49972r.m49936o(c13687i, c13687i2, c13687iM49973t, i10);
        m49958d(c13680bM49972r);
    }

    /* JADX INFO: renamed from: h */
    public void m49962h(C13687i c13687i, C13687i c13687i2, int i10, int i11) {
        C13680b c13680bM49972r = m49972r();
        C13687i c13687iM49973t = m49973t();
        c13687iM49973t.f48032e = 0;
        c13680bM49972r.m49936o(c13687i, c13687i2, c13687iM49973t, i10);
        if (i11 != 8) {
            m49967m(c13680bM49972r, (int) (c13680bM49972r.f47984e.mo49907a(c13687iM49973t) * (-1.0f)), i11);
        }
        m49958d(c13680bM49972r);
    }

    /* JADX INFO: renamed from: i */
    public void m49963i(C13687i c13687i, C13687i c13687i2, int i10, boolean z10) {
        C13680b c13680bM49972r = m49972r();
        C13687i c13687iM49973t = m49973t();
        c13687iM49973t.f48032e = 0;
        c13680bM49972r.m49937p(c13687i, c13687i2, c13687iM49973t, i10);
        m49958d(c13680bM49972r);
    }

    /* JADX INFO: renamed from: j */
    public void m49964j(C13687i c13687i, C13687i c13687i2, int i10, int i11) {
        C13680b c13680bM49972r = m49972r();
        C13687i c13687iM49973t = m49973t();
        c13687iM49973t.f48032e = 0;
        c13680bM49972r.m49937p(c13687i, c13687i2, c13687iM49973t, i10);
        if (i11 != 8) {
            m49967m(c13680bM49972r, (int) (c13680bM49972r.f47984e.mo49907a(c13687iM49973t) * (-1.0f)), i11);
        }
        m49958d(c13680bM49972r);
    }

    /* JADX INFO: renamed from: k */
    public void m49965k(C13687i c13687i, C13687i c13687i2, C13687i c13687i3, C13687i c13687i4, float f10, int i10) {
        C13680b c13680bM49972r = m49972r();
        c13680bM49972r.m49932k(c13687i, c13687i2, c13687i3, c13687i4, f10);
        if (i10 != 8) {
            c13680bM49972r.m49925d(this, i10);
        }
        m49958d(c13680bM49972r);
    }

    /* JADX INFO: renamed from: l */
    public final void m49966l(C13680b c13680b) {
        int i10;
        if (f47992u && c13680b.f47985f) {
            c13680b.f47980a.m49996h(this, c13680b.f47981b);
        } else {
            C13680b[] c13680bArr = this.f48004h;
            int i11 = this.f48009m;
            c13680bArr[i11] = c13680b;
            C13687i c13687i = c13680b.f47980a;
            c13687i.f48031d = i11;
            this.f48009m = i11 + 1;
            c13687i.m49998l(this, c13680b);
        }
        if (f47992u && this.f47998b) {
            int i12 = 0;
            while (i12 < this.f48009m) {
                if (this.f48004h[i12] == null) {
                    System.out.println("WTF");
                }
                C13680b c13680b2 = this.f48004h[i12];
                if (c13680b2 != null && c13680b2.f47985f) {
                    c13680b2.f47980a.m49996h(this, c13680b2.f47981b);
                    if (f47994w) {
                        this.f48011o.f47986a.mo49979a(c13680b2);
                    } else {
                        this.f48011o.f47987b.mo49979a(c13680b2);
                    }
                    this.f48004h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f48009m;
                        if (i13 >= i10) {
                            break;
                        }
                        C13680b[] c13680bArr2 = this.f48004h;
                        int i15 = i13 - 1;
                        C13680b c13680b3 = c13680bArr2[i13];
                        c13680bArr2[i15] = c13680b3;
                        C13687i c13687i2 = c13680b3.f47980a;
                        if (c13687i2.f48031d == i13) {
                            c13687i2.f48031d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f48004h[i14] = null;
                    }
                    this.f48009m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f47998b = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m49967m(C13680b c13680b, int i10, int i11) {
        c13680b.m49926e(m49969o(i11, null), i10);
    }

    /* JADX INFO: renamed from: n */
    public final void m49968n() {
        for (int i10 = 0; i10 < this.f48009m; i10++) {
            C13680b c13680b = this.f48004h[i10];
            c13680b.f47980a.f48033f = c13680b.f47981b;
        }
    }

    /* JADX INFO: renamed from: o */
    public C13687i m49969o(int i10, String str) {
        if (this.f48008l + 1 >= this.f48003g) {
            m49978z();
        }
        C13687i c13687iM49955a = m49955a(C13687i.a.ERROR, str);
        int i11 = this.f47999c + 1;
        this.f47999c = i11;
        this.f48008l++;
        c13687iM49955a.f48030c = i11;
        c13687iM49955a.f48032e = i10;
        this.f48011o.f47989d[i11] = c13687iM49955a;
        this.f48001e.mo49923b(c13687iM49955a);
        return c13687iM49955a;
    }

    /* JADX INFO: renamed from: p */
    public C13687i m49970p() {
        if (this.f48008l + 1 >= this.f48003g) {
            m49978z();
        }
        C13687i c13687iM49955a = m49955a(C13687i.a.SLACK, null);
        int i10 = this.f47999c + 1;
        this.f47999c = i10;
        this.f48008l++;
        c13687iM49955a.f48030c = i10;
        this.f48011o.f47989d[i10] = c13687iM49955a;
        return c13687iM49955a;
    }

    /* JADX INFO: renamed from: q */
    public C13687i m49971q(Object obj) {
        C13687i c13687iM7689i = null;
        if (obj == null) {
            return null;
        }
        if (this.f48008l + 1 >= this.f48003g) {
            m49978z();
        }
        if (obj instanceof C1511d) {
            C1511d c1511d = (C1511d) obj;
            c13687iM7689i = c1511d.m7689i();
            if (c13687iM7689i == null) {
                c1511d.m7699s(this.f48011o);
                c13687iM7689i = c1511d.m7689i();
            }
            int i10 = c13687iM7689i.f48030c;
            if (i10 != -1 && i10 <= this.f47999c && this.f48011o.f47989d[i10] != null) {
                return c13687iM7689i;
            }
            if (i10 != -1) {
                c13687iM7689i.m49995e();
            }
            int i11 = this.f47999c + 1;
            this.f47999c = i11;
            this.f48008l++;
            c13687iM7689i.f48030c = i11;
            c13687iM7689i.f48037j = C13687i.a.UNRESTRICTED;
            this.f48011o.f47989d[i11] = c13687iM7689i;
        }
        return c13687iM7689i;
    }

    /* JADX INFO: renamed from: r */
    public C13680b m49972r() {
        C13680b c13680bMo49980b;
        if (f47994w) {
            c13680bMo49980b = this.f48011o.f47986a.mo49980b();
            if (c13680bMo49980b == null) {
                c13680bMo49980b = new b(this.f48011o);
                f47996y++;
            } else {
                c13680bMo49980b.m49946y();
            }
        } else {
            c13680bMo49980b = this.f48011o.f47987b.mo49980b();
            if (c13680bMo49980b == null) {
                c13680bMo49980b = new C13680b(this.f48011o);
                f47995x++;
            } else {
                c13680bMo49980b.m49946y();
            }
        }
        C13687i.m49991c();
        return c13680bMo49980b;
    }

    /* JADX INFO: renamed from: t */
    public C13687i m49973t() {
        if (this.f48008l + 1 >= this.f48003g) {
            m49978z();
        }
        C13687i c13687iM49955a = m49955a(C13687i.a.SLACK, null);
        int i10 = this.f47999c + 1;
        this.f47999c = i10;
        this.f48008l++;
        c13687iM49955a.f48030c = i10;
        this.f48011o.f47989d[i10] = c13687iM49955a;
        return c13687iM49955a;
    }

    /* JADX INFO: renamed from: u */
    public final int m49974u(a aVar) {
        float f10;
        for (int i10 = 0; i10 < this.f48009m; i10++) {
            C13680b c13680b = this.f48004h[i10];
            if (c13680b.f47980a.f48037j != C13687i.a.UNRESTRICTED) {
                float f11 = 0.0f;
                if (c13680b.f47981b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f12 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f48009m) {
                                break;
                            }
                            C13680b c13680b2 = this.f48004h[i12];
                            if (c13680b2.f47980a.f48037j == C13687i.a.UNRESTRICTED || c13680b2.f47985f || c13680b2.f47981b >= f11) {
                                f10 = f11;
                            } else if (f47993v) {
                                int iMo49914h = c13680b2.f47984e.mo49914h();
                                int i16 = 0;
                                while (i16 < iMo49914h) {
                                    C13687i c13687iMo49908b = c13680b2.f47984e.mo49908b(i16);
                                    float fMo49907a = c13680b2.f47984e.mo49907a(c13687iMo49908b);
                                    if (fMo49907a > f11) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f13 = c13687iMo49908b.f48035h[i17] / fMo49907a;
                                            if ((f13 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = c13687iMo49908b.f48030c;
                                                i13 = i12;
                                                f12 = f13;
                                            }
                                        }
                                    }
                                    i16++;
                                    f11 = f11;
                                }
                                f10 = f11;
                            } else {
                                f10 = f11;
                                for (int i18 = 1; i18 < this.f48008l; i18++) {
                                    C13687i c13687i = this.f48011o.f47989d[i18];
                                    float fMo49907a2 = c13680b2.f47984e.mo49907a(c13687i);
                                    if (fMo49907a2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f14 = c13687i.f48035h[i19] / fMo49907a2;
                                            if ((f14 < f12 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i13 = i12;
                                                i14 = i18;
                                                f12 = f14;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f11 = f10;
                        }
                        float f15 = f11;
                        if (i13 != -1) {
                            C13680b c13680b3 = this.f48004h[i13];
                            c13680b3.f47980a.f48031d = -1;
                            c13680b3.m49945x(this.f48011o.f47989d[i14]);
                            C13687i c13687i2 = c13680b3.f47980a;
                            c13687i2.f48031d = i13;
                            c13687i2.m49998l(this, c13680b3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f48008l / 2) {
                            z10 = true;
                        }
                        f11 = f15;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public void m49975v(C13683e c13683e) {
    }

    /* JADX INFO: renamed from: w */
    public C13681c m49976w() {
        return this.f48011o;
    }

    /* JADX INFO: renamed from: y */
    public int m49977y(Object obj) {
        C13687i c13687iM7689i = ((C1511d) obj).m7689i();
        if (c13687iM7689i != null) {
            return (int) (c13687iM7689i.f48033f + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m49978z() {
        int i10 = this.f48002f * 2;
        this.f48002f = i10;
        this.f48004h = (C13680b[]) Arrays.copyOf(this.f48004h, i10);
        C13681c c13681c = this.f48011o;
        c13681c.f47989d = (C13687i[]) Arrays.copyOf(c13681c.f47989d, this.f48002f);
        int i11 = this.f48002f;
        this.f48007k = new boolean[i11];
        this.f48003g = i11;
        this.f48010n = i11;
    }
}
