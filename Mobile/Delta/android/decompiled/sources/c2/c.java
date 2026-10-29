package c2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f4322a;
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f4323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f4324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f4325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f4326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f4327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f4328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4331k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4342v;

    public c(e eVar, int i10, boolean z10) {
        this.f4322a = eVar;
        this.f4336p = i10;
        this.f4337q = z10;
    }

    public static boolean c(e eVar, int i10) {
        if (eVar.V() == 8 || eVar.Z[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f4407y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f4342v) {
            b();
        }
        this.f4342v = true;
    }

    public final void b() {
        int i10 = this.f4336p * 2;
        e eVar = this.f4322a;
        this.f4335o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f4329i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f4336p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.V() != 8) {
                this.f4332l++;
                e.b bVarU = eVar.u(this.f4336p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f4333m += eVar.E(this.f4336p);
                }
                int iF = this.f4333m + eVar.W[i10].f();
                this.f4333m = iF;
                int i12 = i10 + 1;
                this.f4333m = iF + eVar.W[i12].f();
                int iF2 = this.f4334n + eVar.W[i10].f();
                this.f4334n = iF2;
                this.f4334n = iF2 + eVar.W[i12].f();
                if (this.b == null) {
                    this.b = eVar;
                }
                this.f4324d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f4336p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f4407y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f4330j++;
                        float f10 = eVar.D0[i13];
                        if (f10 > 0.0f) {
                            this.f4331k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f4338r = true;
                            } else {
                                this.f4339s = true;
                            }
                            if (this.f4328h == null) {
                                this.f4328h = new ArrayList<>();
                            }
                            this.f4328h.add(eVar);
                        }
                        if (this.f4326f == null) {
                            this.f4326f = eVar;
                        }
                        e eVar4 = this.f4327g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f4336p] = eVar;
                        }
                        this.f4327g = eVar;
                    }
                    if (this.f4336p == 0) {
                        if (eVar.f4403w != 0 || eVar.f4409z != 0 || eVar.A != 0) {
                            this.f4335o = false;
                        }
                    } else if (eVar.f4405x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f4335o = false;
                    }
                    if (eVar.f4366d0 != 0.0f) {
                        this.f4335o = false;
                        this.f4341u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f4336p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f4347f;
            if (dVar != null) {
                e eVar5 = dVar.f4345d;
                d dVar2 = eVar5.W[i10].f4347f;
                if (dVar2 != null && dVar2.f4345d == eVar) {
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
            this.f4333m -= eVar6.W[i10].f();
        }
        e eVar7 = this.f4324d;
        if (eVar7 != null) {
            this.f4333m -= eVar7.W[i10 + 1].f();
        }
        this.f4323c = eVar;
        if (this.f4336p == 0 && this.f4337q) {
            this.f4325e = eVar;
        } else {
            this.f4325e = this.f4322a;
        }
        this.f4340t = this.f4339s && this.f4338r;
    }
}
