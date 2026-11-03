package z1;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f37757s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f37758t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f37759u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f37760v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f37761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f37762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f37763y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f37767e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f37777o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f37780r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37764a = 1000;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37765c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, i> f37766d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37768f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37769g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37771i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f37772j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f37773k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37774l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37775m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37776n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i[] f37778p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37779q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z1.b[] f37770h = new z1.b[32];

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
            this.f37752e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f37777o = cVar;
        this.f37767e = new h(cVar);
        if (f37761w) {
            this.f37780r = new b(cVar);
        } else {
            this.f37780r = new z1.b(cVar);
        }
    }

    public static z1.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    public static e x() {
        return null;
    }

    public void A() {
        if (this.f37767e.isEmpty()) {
            n();
            return;
        }
        if (!this.f37771i && !this.f37772j) {
            B(this.f37767e);
            return;
        }
        for (int i10 = 0; i10 < this.f37775m; i10++) {
            if (!this.f37770h[i10].f37753f) {
                B(this.f37767e);
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
        for (int i10 = 0; i10 < this.f37774l; i10++) {
            this.f37773k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f37774l * 2) {
                if (aVar.getKey() != null) {
                    this.f37773k[aVar.getKey().f37793c] = true;
                }
                i iVarA = aVar.a(this, this.f37773k);
                if (iVarA != null) {
                    boolean[] zArr = this.f37773k;
                    int i12 = iVarA.f37793c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarA != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f37775m; i14++) {
                        z1.b bVar = this.f37770h[i14];
                        if (bVar.f37749a.f37800j != i.a.UNRESTRICTED && !bVar.f37753f && bVar.t(iVarA)) {
                            float fA = bVar.f37752e.a(iVarA);
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
                        z1.b bVar2 = this.f37770h[i13];
                        bVar2.f37749a.f37794d = -1;
                        bVar2.x(iVarA);
                        i iVar = bVar2.f37749a;
                        iVar.f37794d = i13;
                        iVar.l(this, bVar2);
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
        if (f37761w) {
            while (i10 < this.f37775m) {
                z1.b bVar = this.f37770h[i10];
                if (bVar != null) {
                    this.f37777o.f37754a.a(bVar);
                }
                this.f37770h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f37775m) {
            z1.b bVar2 = this.f37770h[i10];
            if (bVar2 != null) {
                this.f37777o.b.a(bVar2);
            }
            this.f37770h[i10] = null;
            i10++;
        }
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f37777o;
            i[] iVarArr = cVar.f37756d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        cVar.f37755c.c(this.f37778p, this.f37779q);
        this.f37779q = 0;
        Arrays.fill(this.f37777o.f37756d, (Object) null);
        HashMap<String, i> map = this.f37766d;
        if (map != null) {
            map.clear();
        }
        this.f37765c = 0;
        this.f37767e.clear();
        this.f37774l = 1;
        for (int i11 = 0; i11 < this.f37775m; i11++) {
            z1.b bVar = this.f37770h[i11];
            if (bVar != null) {
                bVar.f37750c = false;
            }
        }
        D();
        this.f37775m = 0;
        if (f37761w) {
            this.f37780r = new b(this.f37777o);
        } else {
            this.f37780r = new z1.b(this.f37777o);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVarB = this.f37777o.f37755c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.j(aVar, str);
        } else {
            iVarB.e();
            iVarB.j(aVar, str);
        }
        int i10 = this.f37779q;
        int i11 = this.f37764a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f37764a = i12;
            this.f37778p = (i[]) Arrays.copyOf(this.f37778p, i12);
        }
        i[] iVarArr = this.f37778p;
        int i13 = this.f37779q;
        this.f37779q = i13 + 1;
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
        if (this.f37775m + 1 >= this.f37776n || this.f37774l + 1 >= this.f37769g) {
            z();
        }
        boolean z11 = false;
        if (!bVar.f37753f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f37749a = iVarP;
                int i10 = this.f37775m;
                l(bVar);
                if (this.f37775m == i10 + 1) {
                    this.f37780r.c(bVar);
                    C(this.f37780r, true);
                    if (iVarP.f37794d == -1) {
                        if (bVar.f37749a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            bVar.x(iVarV);
                        }
                        if (!bVar.f37753f) {
                            bVar.f37749a.l(this, bVar);
                        }
                        if (f37761w) {
                            this.f37777o.f37754a.a(bVar);
                        } else {
                            this.f37777o.b.a(bVar);
                        }
                        this.f37775m--;
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
        if (f37758t && i11 == 8 && iVar2.f37797g && iVar.f37794d == -1) {
            iVar.h(this, iVar2.f37796f + i10);
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
        if (f37758t && iVar.f37794d == -1) {
            float f10 = i10;
            iVar.h(this, f10);
            for (int i11 = 0; i11 < this.f37765c + 1; i11++) {
                i iVar2 = this.f37777o.f37756d[i11];
                if (iVar2 != null && iVar2.f37804n && iVar2.f37805o == iVar.f37793c) {
                    iVar2.h(this, iVar2.f37806p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f37794d;
        if (i12 == -1) {
            z1.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        z1.b bVar = this.f37770h[i12];
        if (bVar.f37753f) {
            bVar.b = i10;
            return;
        }
        if (bVar.f37752e.h() == 0) {
            bVar.f37753f = true;
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
        iVarT.f37795e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f37795e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f37752e.a(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f37795e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f37795e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f37752e.a(iVarT) * (-1.0f)), i11);
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
        if (f37759u && bVar.f37753f) {
            bVar.f37749a.h(this, bVar.b);
        } else {
            z1.b[] bVarArr = this.f37770h;
            int i11 = this.f37775m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f37749a;
            iVar.f37794d = i11;
            this.f37775m = i11 + 1;
            iVar.l(this, bVar);
        }
        if (f37759u && this.b) {
            int i12 = 0;
            while (i12 < this.f37775m) {
                if (this.f37770h[i12] == null) {
                    System.out.println("WTF");
                }
                z1.b bVar2 = this.f37770h[i12];
                if (bVar2 != null && bVar2.f37753f) {
                    bVar2.f37749a.h(this, bVar2.b);
                    if (f37761w) {
                        this.f37777o.f37754a.a(bVar2);
                    } else {
                        this.f37777o.b.a(bVar2);
                    }
                    this.f37770h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f37775m;
                        if (i13 >= i10) {
                            break;
                        }
                        z1.b[] bVarArr2 = this.f37770h;
                        int i15 = i13 - 1;
                        z1.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f37749a;
                        if (iVar2.f37794d == i13) {
                            iVar2.f37794d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f37770h[i14] = null;
                    }
                    this.f37775m = i10 - 1;
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
        for (int i10 = 0; i10 < this.f37775m; i10++) {
            z1.b bVar = this.f37770h[i10];
            bVar.f37749a.f37796f = bVar.b;
        }
    }

    public i o(int i10, String str) {
        if (this.f37774l + 1 >= this.f37769g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f37765c + 1;
        this.f37765c = i11;
        this.f37774l++;
        iVarA.f37793c = i11;
        iVarA.f37795e = i10;
        this.f37777o.f37756d[i11] = iVarA;
        this.f37767e.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f37774l + 1 >= this.f37769g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f37765c + 1;
        this.f37765c = i10;
        this.f37774l++;
        iVarA.f37793c = i10;
        this.f37777o.f37756d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f37774l + 1 >= this.f37769g) {
            z();
        }
        if (obj instanceof c2.d) {
            c2.d dVar = (c2.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f37777o);
                iVarI = dVar.i();
            }
            int i10 = iVarI.f37793c;
            if (i10 != -1 && i10 <= this.f37765c && this.f37777o.f37756d[i10] != null) {
                return iVarI;
            }
            if (i10 != -1) {
                iVarI.e();
            }
            int i11 = this.f37765c + 1;
            this.f37765c = i11;
            this.f37774l++;
            iVarI.f37793c = i11;
            iVarI.f37800j = i.a.UNRESTRICTED;
            this.f37777o.f37756d[i11] = iVarI;
        }
        return iVarI;
    }

    public z1.b r() {
        z1.b bVarB;
        if (f37761w) {
            bVarB = this.f37777o.f37754a.b();
            if (bVarB == null) {
                bVarB = new b(this.f37777o);
                f37763y++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.f37777o.b.b();
            if (bVarB == null) {
                bVarB = new z1.b(this.f37777o);
                f37762x++;
            } else {
                bVarB.y();
            }
        }
        i.c();
        return bVarB;
    }

    public i t() {
        if (this.f37774l + 1 >= this.f37769g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f37765c + 1;
        this.f37765c = i10;
        this.f37774l++;
        iVarA.f37793c = i10;
        this.f37777o.f37756d[i10] = iVarA;
        return iVarA;
    }

    public final int u(a aVar) {
        float f10;
        for (int i10 = 0; i10 < this.f37775m; i10++) {
            z1.b bVar = this.f37770h[i10];
            if (bVar.f37749a.f37800j != i.a.UNRESTRICTED) {
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
                            if (i12 >= this.f37775m) {
                                break;
                            }
                            z1.b bVar2 = this.f37770h[i12];
                            if (bVar2.f37749a.f37800j == i.a.UNRESTRICTED || bVar2.f37753f || bVar2.b >= f11) {
                                f10 = f11;
                            } else if (f37760v) {
                                int iH = bVar2.f37752e.h();
                                int i16 = 0;
                                while (i16 < iH) {
                                    i iVarB = bVar2.f37752e.b(i16);
                                    float fA = bVar2.f37752e.a(iVarB);
                                    if (fA > f11) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f13 = iVarB.f37798h[i17] / fA;
                                            if ((f13 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarB.f37793c;
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
                                for (int i18 = 1; i18 < this.f37774l; i18++) {
                                    i iVar = this.f37777o.f37756d[i18];
                                    float fA2 = bVar2.f37752e.a(iVar);
                                    if (fA2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f14 = iVar.f37798h[i19] / fA2;
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
                            z1.b bVar3 = this.f37770h[i13];
                            bVar3.f37749a.f37794d = -1;
                            bVar3.x(this.f37777o.f37756d[i14]);
                            i iVar2 = bVar3.f37749a;
                            iVar2.f37794d = i13;
                            iVar2.l(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f37774l / 2) {
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
        return this.f37777o;
    }

    public int y(Object obj) {
        i iVarI = ((c2.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f37796f + 0.5f);
        }
        return 0;
    }

    public final void z() {
        int i10 = this.f37768f * 2;
        this.f37768f = i10;
        this.f37770h = (z1.b[]) Arrays.copyOf(this.f37770h, i10);
        c cVar = this.f37777o;
        cVar.f37756d = (i[]) Arrays.copyOf(cVar.f37756d, this.f37768f);
        int i11 = this.f37768f;
        this.f37773k = new boolean[i11];
        this.f37769g = i11;
        this.f37776n = i11;
    }
}
