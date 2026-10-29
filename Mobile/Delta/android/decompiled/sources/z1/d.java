package z1;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f37062s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f37063t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f37064u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f37065v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f37066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f37067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f37068y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f37072e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f37082o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f37085r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37069a = 1000;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37070c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, i> f37071d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37073f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37074g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37076i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f37077j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f37078k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37079l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37080m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37081n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i[] f37083p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37084q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z1.b[] f37075h = new z1.b[32];

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
            this.f37057e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f37082o = cVar;
        this.f37072e = new h(cVar);
        if (f37066w) {
            this.f37085r = new b(cVar);
        } else {
            this.f37085r = new z1.b(cVar);
        }
    }

    public static z1.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    public static e x() {
        return null;
    }

    public void A() {
        if (this.f37072e.isEmpty()) {
            n();
            return;
        }
        if (!this.f37076i && !this.f37077j) {
            B(this.f37072e);
            return;
        }
        for (int i10 = 0; i10 < this.f37080m; i10++) {
            if (!this.f37075h[i10].f37058f) {
                B(this.f37072e);
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
        for (int i10 = 0; i10 < this.f37079l; i10++) {
            this.f37078k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f37079l * 2) {
                if (aVar.getKey() != null) {
                    this.f37078k[aVar.getKey().f37098c] = true;
                }
                i iVarA = aVar.a(this, this.f37078k);
                if (iVarA != null) {
                    boolean[] zArr = this.f37078k;
                    int i12 = iVarA.f37098c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarA != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f37080m; i14++) {
                        z1.b bVar = this.f37075h[i14];
                        if (bVar.f37054a.f37105j != i.a.UNRESTRICTED && !bVar.f37058f && bVar.t(iVarA)) {
                            float fA = bVar.f37057e.a(iVarA);
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
                        z1.b bVar2 = this.f37075h[i13];
                        bVar2.f37054a.f37099d = -1;
                        bVar2.x(iVarA);
                        i iVar = bVar2.f37054a;
                        iVar.f37099d = i13;
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
        if (f37066w) {
            while (i10 < this.f37080m) {
                z1.b bVar = this.f37075h[i10];
                if (bVar != null) {
                    this.f37082o.f37059a.a(bVar);
                }
                this.f37075h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f37080m) {
            z1.b bVar2 = this.f37075h[i10];
            if (bVar2 != null) {
                this.f37082o.b.a(bVar2);
            }
            this.f37075h[i10] = null;
            i10++;
        }
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f37082o;
            i[] iVarArr = cVar.f37061d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        cVar.f37060c.c(this.f37083p, this.f37084q);
        this.f37084q = 0;
        Arrays.fill(this.f37082o.f37061d, (Object) null);
        HashMap<String, i> map = this.f37071d;
        if (map != null) {
            map.clear();
        }
        this.f37070c = 0;
        this.f37072e.clear();
        this.f37079l = 1;
        for (int i11 = 0; i11 < this.f37080m; i11++) {
            z1.b bVar = this.f37075h[i11];
            if (bVar != null) {
                bVar.f37055c = false;
            }
        }
        D();
        this.f37080m = 0;
        if (f37066w) {
            this.f37085r = new b(this.f37082o);
        } else {
            this.f37085r = new z1.b(this.f37082o);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVarB = this.f37082o.f37060c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.j(aVar, str);
        } else {
            iVarB.e();
            iVarB.j(aVar, str);
        }
        int i10 = this.f37084q;
        int i11 = this.f37069a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f37069a = i12;
            this.f37083p = (i[]) Arrays.copyOf(this.f37083p, i12);
        }
        i[] iVarArr = this.f37083p;
        int i13 = this.f37084q;
        this.f37084q = i13 + 1;
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
        if (this.f37080m + 1 >= this.f37081n || this.f37079l + 1 >= this.f37074g) {
            z();
        }
        boolean z11 = false;
        if (!bVar.f37058f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f37054a = iVarP;
                int i10 = this.f37080m;
                l(bVar);
                if (this.f37080m == i10 + 1) {
                    this.f37085r.c(bVar);
                    C(this.f37085r, true);
                    if (iVarP.f37099d == -1) {
                        if (bVar.f37054a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            bVar.x(iVarV);
                        }
                        if (!bVar.f37058f) {
                            bVar.f37054a.l(this, bVar);
                        }
                        if (f37066w) {
                            this.f37082o.f37059a.a(bVar);
                        } else {
                            this.f37082o.b.a(bVar);
                        }
                        this.f37080m--;
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
        if (f37063t && i11 == 8 && iVar2.f37102g && iVar.f37099d == -1) {
            iVar.h(this, iVar2.f37101f + i10);
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
        if (f37063t && iVar.f37099d == -1) {
            float f10 = i10;
            iVar.h(this, f10);
            for (int i11 = 0; i11 < this.f37070c + 1; i11++) {
                i iVar2 = this.f37082o.f37061d[i11];
                if (iVar2 != null && iVar2.f37109n && iVar2.f37110o == iVar.f37098c) {
                    iVar2.h(this, iVar2.f37111p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f37099d;
        if (i12 == -1) {
            z1.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        z1.b bVar = this.f37075h[i12];
        if (bVar.f37058f) {
            bVar.b = i10;
            return;
        }
        if (bVar.f37057e.h() == 0) {
            bVar.f37058f = true;
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
        iVarT.f37100e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f37100e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f37057e.a(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f37100e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        z1.b bVarR = r();
        i iVarT = t();
        iVarT.f37100e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f37057e.a(iVarT) * (-1.0f)), i11);
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
        if (f37064u && bVar.f37058f) {
            bVar.f37054a.h(this, bVar.b);
        } else {
            z1.b[] bVarArr = this.f37075h;
            int i11 = this.f37080m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f37054a;
            iVar.f37099d = i11;
            this.f37080m = i11 + 1;
            iVar.l(this, bVar);
        }
        if (f37064u && this.b) {
            int i12 = 0;
            while (i12 < this.f37080m) {
                if (this.f37075h[i12] == null) {
                    System.out.println("WTF");
                }
                z1.b bVar2 = this.f37075h[i12];
                if (bVar2 != null && bVar2.f37058f) {
                    bVar2.f37054a.h(this, bVar2.b);
                    if (f37066w) {
                        this.f37082o.f37059a.a(bVar2);
                    } else {
                        this.f37082o.b.a(bVar2);
                    }
                    this.f37075h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f37080m;
                        if (i13 >= i10) {
                            break;
                        }
                        z1.b[] bVarArr2 = this.f37075h;
                        int i15 = i13 - 1;
                        z1.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f37054a;
                        if (iVar2.f37099d == i13) {
                            iVar2.f37099d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f37075h[i14] = null;
                    }
                    this.f37080m = i10 - 1;
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
        for (int i10 = 0; i10 < this.f37080m; i10++) {
            z1.b bVar = this.f37075h[i10];
            bVar.f37054a.f37101f = bVar.b;
        }
    }

    public i o(int i10, String str) {
        if (this.f37079l + 1 >= this.f37074g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f37070c + 1;
        this.f37070c = i11;
        this.f37079l++;
        iVarA.f37098c = i11;
        iVarA.f37100e = i10;
        this.f37082o.f37061d[i11] = iVarA;
        this.f37072e.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f37079l + 1 >= this.f37074g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f37070c + 1;
        this.f37070c = i10;
        this.f37079l++;
        iVarA.f37098c = i10;
        this.f37082o.f37061d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f37079l + 1 >= this.f37074g) {
            z();
        }
        if (obj instanceof c2.d) {
            c2.d dVar = (c2.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f37082o);
                iVarI = dVar.i();
            }
            int i10 = iVarI.f37098c;
            if (i10 != -1 && i10 <= this.f37070c && this.f37082o.f37061d[i10] != null) {
                return iVarI;
            }
            if (i10 != -1) {
                iVarI.e();
            }
            int i11 = this.f37070c + 1;
            this.f37070c = i11;
            this.f37079l++;
            iVarI.f37098c = i11;
            iVarI.f37105j = i.a.UNRESTRICTED;
            this.f37082o.f37061d[i11] = iVarI;
        }
        return iVarI;
    }

    public z1.b r() {
        z1.b bVarB;
        if (f37066w) {
            bVarB = this.f37082o.f37059a.b();
            if (bVarB == null) {
                bVarB = new b(this.f37082o);
                f37068y++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.f37082o.b.b();
            if (bVarB == null) {
                bVarB = new z1.b(this.f37082o);
                f37067x++;
            } else {
                bVarB.y();
            }
        }
        i.c();
        return bVarB;
    }

    public i t() {
        if (this.f37079l + 1 >= this.f37074g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f37070c + 1;
        this.f37070c = i10;
        this.f37079l++;
        iVarA.f37098c = i10;
        this.f37082o.f37061d[i10] = iVarA;
        return iVarA;
    }

    public final int u(a aVar) {
        float f10;
        for (int i10 = 0; i10 < this.f37080m; i10++) {
            z1.b bVar = this.f37075h[i10];
            if (bVar.f37054a.f37105j != i.a.UNRESTRICTED) {
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
                            if (i12 >= this.f37080m) {
                                break;
                            }
                            z1.b bVar2 = this.f37075h[i12];
                            if (bVar2.f37054a.f37105j == i.a.UNRESTRICTED || bVar2.f37058f || bVar2.b >= f11) {
                                f10 = f11;
                            } else if (f37065v) {
                                int iH = bVar2.f37057e.h();
                                int i16 = 0;
                                while (i16 < iH) {
                                    i iVarB = bVar2.f37057e.b(i16);
                                    float fA = bVar2.f37057e.a(iVarB);
                                    if (fA > f11) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f13 = iVarB.f37103h[i17] / fA;
                                            if ((f13 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarB.f37098c;
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
                                for (int i18 = 1; i18 < this.f37079l; i18++) {
                                    i iVar = this.f37082o.f37061d[i18];
                                    float fA2 = bVar2.f37057e.a(iVar);
                                    if (fA2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f14 = iVar.f37103h[i19] / fA2;
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
                            z1.b bVar3 = this.f37075h[i13];
                            bVar3.f37054a.f37099d = -1;
                            bVar3.x(this.f37082o.f37061d[i14]);
                            i iVar2 = bVar3.f37054a;
                            iVar2.f37099d = i13;
                            iVar2.l(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f37079l / 2) {
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
        return this.f37082o;
    }

    public int y(Object obj) {
        i iVarI = ((c2.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f37101f + 0.5f);
        }
        return 0;
    }

    public final void z() {
        int i10 = this.f37073f * 2;
        this.f37073f = i10;
        this.f37075h = (z1.b[]) Arrays.copyOf(this.f37075h, i10);
        c cVar = this.f37082o;
        cVar.f37061d = (i[]) Arrays.copyOf(cVar.f37061d, this.f37073f);
        int i11 = this.f37073f;
        this.f37078k = new boolean[i11];
        this.f37074g = i11;
        this.f37081n = i11;
    }
}
