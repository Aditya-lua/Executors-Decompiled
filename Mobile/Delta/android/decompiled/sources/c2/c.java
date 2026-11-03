package c2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f4488a;
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f4489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f4490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f4491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f4492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f4493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f4494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4497k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4508v;

    public c(e eVar, int i10, boolean z10) {
        this.f4488a = eVar;
        this.f4502p = i10;
        this.f4503q = z10;
    }

    public static boolean c(e eVar, int i10) {
        if (eVar.V() == 8 || eVar.Z[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f4573y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f4508v) {
            b();
        }
        this.f4508v = true;
    }

    public final void b() {
        int i10 = this.f4502p * 2;
        e eVar = this.f4488a;
        this.f4501o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f4495i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f4502p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.V() != 8) {
                this.f4498l++;
                e.b bVarU = eVar.u(this.f4502p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f4499m += eVar.E(this.f4502p);
                }
                int iF = this.f4499m + eVar.W[i10].f();
                this.f4499m = iF;
                int i12 = i10 + 1;
                this.f4499m = iF + eVar.W[i12].f();
                int iF2 = this.f4500n + eVar.W[i10].f();
                this.f4500n = iF2;
                this.f4500n = iF2 + eVar.W[i12].f();
                if (this.b == null) {
                    this.b = eVar;
                }
                this.f4490d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f4502p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f4573y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f4496j++;
                        float f10 = eVar.D0[i13];
                        if (f10 > 0.0f) {
                            this.f4497k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f4504r = true;
                            } else {
                                this.f4505s = true;
                            }
                            if (this.f4494h == null) {
                                this.f4494h = new ArrayList<>();
                            }
                            this.f4494h.add(eVar);
                        }
                        if (this.f4492f == null) {
                            this.f4492f = eVar;
                        }
                        e eVar4 = this.f4493g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f4502p] = eVar;
                        }
                        this.f4493g = eVar;
                    }
                    if (this.f4502p == 0) {
                        if (eVar.f4569w != 0 || eVar.f4575z != 0 || eVar.A != 0) {
                            this.f4501o = false;
                        }
                    } else if (eVar.f4571x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f4501o = false;
                    }
                    if (eVar.f4532d0 != 0.0f) {
                        this.f4501o = false;
                        this.f4507u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f4502p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f4513f;
            if (dVar != null) {
                e eVar5 = dVar.f4511d;
                d dVar2 = eVar5.W[i10].f4513f;
                if (dVar2 != null && dVar2.f4511d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.b;
        if (eVar6 != null) {
            this.f4499m -= eVar6.W[i10].f();
        }
        e eVar7 = this.f4490d;
        if (eVar7 != null) {
            this.f4499m -= eVar7.W[i10 + 1].f();
        }
        this.f4489c = eVar;
        if (this.f4502p == 0 && this.f4503q) {
            this.f4491e = eVar;
        } else {
            this.f4491e = this.f4488a;
        }
        this.f4506t = this.f4505s && this.f4504r;
    }
}
