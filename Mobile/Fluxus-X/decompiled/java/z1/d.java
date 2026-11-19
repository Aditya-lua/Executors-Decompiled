package z1;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f38862s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f38863t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f38864u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f38865v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f38866w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f38867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f38868y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f38872e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f38882o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f38885r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38869a = 1000;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38870c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, i> f38871d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38873f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38874g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38876i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38877j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f38878k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38879l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38880m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f38881n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i[] f38883p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f38884q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z1.b[] f38875h = new z1.b[32];

    public interface a {
        i a(d dVar, boolean[] zArr);

        void b(i iVar);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    public static class b extends z1.b {
        public b(c cVar) {
            this.f38857e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f38882o = cVar;
        this.f38872e = new h(cVar);
        if (f38866w) {
            this.f38885r = new b(cVar);
        } else {
            this.f38885r = new z1.b(cVar);
        }
    }

    public static z1.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    public static e x() {
        return null;
    }

    public void A() {
        if (this.f38872e.isEmpty()) {
            n();
            return;
        }
        if (!this.f38876i && !this.f38877j) {
            B(this.f38872e);
            return;
        }
        for (int i10 = 0; i10 < this.f38880m; i10++) {
            if (!this.f38875h[i10].f38858f) {
                B(this.f38872e);
                return;
            }
        }
        n();
    }

    public void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public final int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f38879l; i10++) {
            this.f38878k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f38879l * 2) {
                if (aVar.getKey() != null) {
                    this.f38878k[aVar.getKey().f38898c] = true;
                }
                i iVarA = aVar.a(this, this.f38878k);
                if (iVarA != null) {
                    boolean[] zArr = this.f38878k;
                    int i12 = iVarA.f38898c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarA != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f38880m; i14++) {
                        z1.b bVar = this.f38875h[i14];
                        if (bVar.f38854a.f38905j != i.a.UNRESTRICTED && !bVar.f38858f && bVar.t(iVarA)) {
                            float fA = bVar.f38857e.a(iVarA);
                            if (fA < 0.0f) {
                                float f11 = (-bVar.b) / fA;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        z1.b bVar2 = this.f38875h[i13];
                        bVar2.f38854a.f38899d = -1;
                        bVar2.x(iVarA);
                        i iVar = bVar2.f38854a;
                        iVar.f38899d = i13;
                        iVar.m(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    public final void D() {
        int i10 = 0;
        if (f38866w) {
            while (i10 < this.f38880m) {
                z1.b bVar = this.f38875h[i10];
                if (bVar != null) {
                    this.f38882o.f38859a.a(bVar);
                }
                this.f38875h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f38880m) {
            z1.b bVar2 = this.f38875h[i10];
            if (bVar2 != null) {
                this.f38882o.b.a(bVar2);
            }
            this.f38875h[i10] = null;
            i10++;
        }
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f38882o;
            i[] iVarArr = cVar.f38861d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        cVar.f38860c.c(this.f38883p, this.f38884q);
        this.f38884q = 0;
        Arrays.fill(this.f38882o.f38861d, (Object) null);
        HashMap<String, i> map = this.f38871d;
        if (map != null) {
            map.clear();
        }
        this.f38870c = 0;
        this.f38872e.clear();
        this.f38879l = 1;
        for (int i11 = 0; i11 < this.f38880m; i11++) {
            z1.b bVar = this.f38875h[i11];
            if (bVar != null) {
                bVar.f38855c = false;
            }
        }
        D();
        this.f38880m = 0;
        if (f38866w) {
            this.f38885r = new b(this.f38882o);
        } else {
            this.f38885r = new z1.b(this.f38882o);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVarB = this.f38882o.f38860c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.k(aVar, str);
        } else {
            iVarB.e();
            iVarB.k(aVar, str);
        }
        int i10 = this.f38884q;
        int i11 = this.f38869a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f38869a = i12;
            this.f38883p = (i[]) Arrays.copyOf(this.f38883p, i12);
        }
        i[] iVarArr = this.f38883p;
        int i13 = this.f38884q;
        this.f38884q = i13 + 1;
        iVarArr[i13] = iVarB;
        return iVarB;
    }

    public void b(c2.e eVar, c2.e eVar2, float f10, int i10) {
        c2.d.a aVar = c2.d.a.LEFT;
        i iVarQ = q(eVar.o(aVar));
        c2.d.a aVar2 = c2.d.a.TOP;
        i iVarQ2 = q(eVar.o(aVar2));
        c2.d.a aVar3 = c2.d.a.RIGHT;
        i iVarQ3 = q(eVar.o(aVar3));
        c2.d.a aVar4 = c2.d.a.BOTTOM;
        i iVarQ4 = q(eVar.o(aVar4));
        i iVarQ5 = q(eVar2.o(aVar));
        i iVarQ6 = q(eVar2.o(aVar2));
        i iVarQ7 = q(eVar2.o(aVar3));
        i iVarQ8 = q(eVar2.o(aVar4));
        z1.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        z1.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        z1.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public void d(z1.b bVar) {
        i iVarV;
        if (bVar == null) {
            return;
        }
        boolean z10 = true;
        if (this.f38880m + 1 >= this.f38881n || this.f38879l + 1 >= this.f38874g) {
            z();
        }
        boolean z11 = false;
        if (!bVar.f38858f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f38854a = iVarP;
                int i10 = this.f38880m;
                l(bVar);
                if (this.f38880m == i10 + 1) {
                    this.f38885r.c(bVar);
                    C(this.f38885r, true);
                    if (iVarP.f38899d == -1) {
                        if (bVar.f38854a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            bVar.x(iVarV);
                        }
                        if (!bVar.f38858f) {
                            bVar.f38854a.m(this, bVar);
                        }
                        if (f38866w) {
                            this.f38882o.f38859a.a(bVar);
                        } else {
                            this.f38882o.b.a(bVar);
                        }
                        this.f38880m--;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public z1.b e(i iVar, i iVar2, int i10, int i11) {
        if (f38863t && i11 == 8 && iVar2.f38902g && iVar.f38899d == -1) {
            iVar.h(this, iVar2.f38901f + i10);
            return null;
        }
        z1.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        if (f38863t && iVar.f38899d == -1) {
            float f10 = i10;
            iVar.h(this, f10);
            for (int i11 = 0; i11 < this.f38870c + 1; i11++) {
                i iVar2 = this.f38882o.f38861d[i11];
                if (iVar2 != null && iVar2.f38909n && iVar2.f38910o == iVar.f38898c) {
                    iVar2.h(this, iVar2.f38911p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f38899d;
        if (i12 == -1) {
            z1.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        z1.b bVar = this.f38875h[i12];
        if (bVar.f38858f) {
            bVar.b = i10;
            return;
        }
        if (bVar.f38857e.h() == 0) {
            bVar.f38858f = true;
            bVar.b = i10;
        } else {
            z1.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f38900e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f38900e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f38857e.a(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f38900e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f38900e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f38857e.a(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        z1.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    public final void l(z1.b bVar) {
        int i10;
        if (f38864u && bVar.f38858f) {
            bVar.f38854a.h(this, bVar.b);
        } else {
            z1.b[] bVarArr = this.f38875h;
            int i11 = this.f38880m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f38854a;
            iVar.f38899d = i11;
            this.f38880m = i11 + 1;
            iVar.m(this, bVar);
        }
        if (f38864u && this.b) {
            int i12 = 0;
            while (i12 < this.f38880m) {
                if (this.f38875h[i12] == null) {
                    System.out.println("WTF");
                }
                z1.b bVar2 = this.f38875h[i12];
                if (bVar2 != null && bVar2.f38858f) {
                    bVar2.f38854a.h(this, bVar2.b);
                    if (f38866w) {
                        this.f38882o.f38859a.a(bVar2);
                    } else {
                        this.f38882o.b.a(bVar2);
                    }
                    this.f38875h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f38880m;
                        if (i13 >= i10) {
                            break;
                        }
                        z1.b[] bVarArr2 = this.f38875h;
                        int i15 = i13 - 1;
                        z1.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f38854a;
                        if (iVar2.f38899d == i13) {
                            iVar2.f38899d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f38875h[i14] = null;
                    }
                    this.f38880m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.b = false;
        }
    }

    public void m(z1.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public final void n() {
        for (int i10 = 0; i10 < this.f38880m; i10++) {
            z1.b bVar = this.f38875h[i10];
            bVar.f38854a.f38901f = bVar.b;
        }
    }

    public i o(int i10, String str) {
        if (this.f38879l + 1 >= this.f38874g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f38870c + 1;
        this.f38870c = i11;
        this.f38879l++;
        iVarA.f38898c = i11;
        iVarA.f38900e = i10;
        this.f38882o.f38861d[i11] = iVarA;
        this.f38872e.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f38879l + 1 >= this.f38874g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f38870c + 1;
        this.f38870c = i10;
        this.f38879l++;
        iVarA.f38898c = i10;
        this.f38882o.f38861d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f38879l + 1 >= this.f38874g) {
            z();
        }
        if (obj instanceof c2.d) {
            c2.d dVar = (c2.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f38882o);
                iVarI = dVar.i();
            }
            int i10 = iVarI.f38898c;
            if (i10 != -1 && i10 <= this.f38870c && this.f38882o.f38861d[i10] != null) {
                return iVarI;
            }
            if (i10 != -1) {
                iVarI.e();
            }
            int i11 = this.f38870c + 1;
            this.f38870c = i11;
            this.f38879l++;
            iVarI.f38898c = i11;
            iVarI.f38905j = i.a.UNRESTRICTED;
            this.f38882o.f38861d[i11] = iVarI;
        }
        return iVarI;
    }

    public z1.b r() {
        z1.b bVarB;
        if (f38866w) {
            bVarB = this.f38882o.f38859a.b();
            if (bVarB == null) {
                bVarB = new b(this.f38882o);
                f38868y++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.f38882o.b.b();
            if (bVarB == null) {
                bVarB = new z1.b(this.f38882o);
                f38867x++;
            } else {
                bVarB.y();
            }
        }
        i.c();
        return bVarB;
    }

    public i t() {
        if (this.f38879l + 1 >= this.f38874g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f38870c + 1;
        this.f38870c = i10;
        this.f38879l++;
        iVarA.f38898c = i10;
        this.f38882o.f38861d[i10] = iVarA;
        return iVarA;
    }

    public final int u(a aVar) {
        float f10;
        for (int i10 = 0; i10 < this.f38880m; i10++) {
            z1.b bVar = this.f38875h[i10];
            if (bVar.f38854a.f38905j != i.a.UNRESTRICTED) {
                float f11 = 0.0f;
                if (bVar.b < 0.0f) {
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
                            if (i12 >= this.f38880m) {
                                break;
                            }
                            z1.b bVar2 = this.f38875h[i12];
                            if (bVar2.f38854a.f38905j == i.a.UNRESTRICTED || bVar2.f38858f || bVar2.b >= f11) {
                                f10 = f11;
                            } else if (f38865v) {
                                int iH = bVar2.f38857e.h();
                                int i16 = 0;
                                while (i16 < iH) {
                                    i iVarB = bVar2.f38857e.b(i16);
                                    float fA = bVar2.f38857e.a(iVarB);
                                    if (fA > f11) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f13 = iVarB.f38903h[i17] / fA;
                                            if ((f13 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarB.f38898c;
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
                                for (int i18 = 1; i18 < this.f38879l; i18++) {
                                    i iVar = this.f38882o.f38861d[i18];
                                    float fA2 = bVar2.f38857e.a(iVar);
                                    if (fA2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f14 = iVar.f38903h[i19] / fA2;
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
                            z1.b bVar3 = this.f38875h[i13];
                            bVar3.f38854a.f38899d = -1;
                            bVar3.x(this.f38882o.f38861d[i14]);
                            i iVar2 = bVar3.f38854a;
                            iVar2.f38899d = i13;
                            iVar2.m(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f38879l / 2) {
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

    public void v(e eVar) {
    }

    public c w() {
        return this.f38882o;
    }

    public int y(Object obj) {
        i iVarI = ((c2.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f38901f + 0.5f);
        }
        return 0;
    }

    public final void z() {
        int i10 = this.f38873f * 2;
        this.f38873f = i10;
        this.f38875h = (z1.b[]) Arrays.copyOf(this.f38875h, i10);
        c cVar = this.f38882o;
        cVar.f38861d = (i[]) Arrays.copyOf(cVar.f38861d, this.f38873f);
        int i11 = this.f38873f;
        this.f38878k = new boolean[i11];
        this.f38874g = i11;
        this.f38881n = i11;
    }
}
