package c2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f4615a;
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f4616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f4617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f4618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f4619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f4620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f4621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4624k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4635v;

    public c(e eVar, int i10, boolean z10) {
        this.f4615a = eVar;
        this.f4629p = i10;
        this.f4630q = z10;
    }

    public static boolean c(e eVar, int i10) {
        if (eVar.V() == 8 || eVar.Z[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f4700y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f4635v) {
            b();
        }
        this.f4635v = true;
    }

    public final void b() {
        int i10 = this.f4629p * 2;
        e eVar = this.f4615a;
        this.f4628o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f4622i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f4629p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.V() != 8) {
                this.f4625l++;
                e.b bVarU = eVar.u(this.f4629p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f4626m += eVar.E(this.f4629p);
                }
                int iF = this.f4626m + eVar.W[i10].f();
                this.f4626m = iF;
                int i12 = i10 + 1;
                this.f4626m = iF + eVar.W[i12].f();
                int iF2 = this.f4627n + eVar.W[i10].f();
                this.f4627n = iF2;
                this.f4627n = iF2 + eVar.W[i12].f();
                if (this.b == null) {
                    this.b = eVar;
                }
                this.f4617d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f4629p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f4700y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f4623j++;
                        float f10 = eVar.D0[i13];
                        if (f10 > 0.0f) {
                            this.f4624k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f4631r = true;
                            } else {
                                this.f4632s = true;
                            }
                            if (this.f4621h == null) {
                                this.f4621h = new ArrayList<>();
                            }
                            this.f4621h.add(eVar);
                        }
                        if (this.f4619f == null) {
                            this.f4619f = eVar;
                        }
                        e eVar4 = this.f4620g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f4629p] = eVar;
                        }
                        this.f4620g = eVar;
                    }
                    if (this.f4629p == 0) {
                        if (eVar.f4696w != 0 || eVar.f4702z != 0 || eVar.A != 0) {
                            this.f4628o = false;
                        }
                    } else if (eVar.f4698x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f4628o = false;
                    }
                    if (eVar.f4659d0 != 0.0f) {
                        this.f4628o = false;
                        this.f4634u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f4629p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f4640f;
            if (dVar != null) {
                e eVar5 = dVar.f4638d;
                d dVar2 = eVar5.W[i10].f4640f;
                if (dVar2 != null && dVar2.f4638d == eVar) {
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
            this.f4626m -= eVar6.W[i10].f();
        }
        e eVar7 = this.f4617d;
        if (eVar7 != null) {
            this.f4626m -= eVar7.W[i10 + 1].f();
        }
        this.f4616c = eVar;
        if (this.f4629p == 0 && this.f4630q) {
            this.f4618e = eVar;
        } else {
            this.f4618e = this.f4615a;
        }
        this.f4633t = this.f4632s && this.f4631r;
    }
}
