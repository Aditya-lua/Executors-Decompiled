package d2;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f14340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f14341l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14342a;

        static {
            int[] iArr = new int[p.b.values().length];
            f14342a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14342a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14342a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(c2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f14340k = fVar;
        this.f14341l = null;
        this.f14361h.f14312e = f.a.TOP;
        this.f14362i.f14312e = f.a.BOTTOM;
        fVar.f14312e = f.a.BASELINE;
        this.f14359f = 1;
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f14342a[this.f14363j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            c2.e eVar = this.b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f14358e;
        if (gVar.f14310c && !gVar.f14317j && this.f14357d == c2.e.b.MATCH_CONSTRAINT) {
            c2.e eVar2 = this.b;
            int i12 = eVar2.f4571x;
            if (i12 == 2) {
                c2.e eVarK = eVar2.K();
                if (eVarK != null) {
                    g gVar2 = eVarK.f4535f.f14358e;
                    if (gVar2.f14317j) {
                        this.f14358e.d((int) ((gVar2.f14314g * this.b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f4533e.f14358e.f14317j) {
                int iW = eVar2.w();
                if (iW != -1) {
                    if (iW == 0) {
                        c2.e eVar3 = this.b;
                        fV2 = eVar3.f4533e.f14358e.f14314g * eVar3.v();
                        i10 = (int) (fV2 + 0.5f);
                    } else if (iW != 1) {
                        i10 = 0;
                    } else {
                        c2.e eVar4 = this.b;
                        f10 = eVar4.f4533e.f14358e.f14314g;
                        fV = eVar4.v();
                    }
                    this.f14358e.d(i10);
                } else {
                    c2.e eVar5 = this.b;
                    f10 = eVar5.f4533e.f14358e.f14314g;
                    fV = eVar5.v();
                }
                fV2 = f10 / fV;
                i10 = (int) (fV2 + 0.5f);
                this.f14358e.d(i10);
            }
        }
        f fVar = this.f14361h;
        if (fVar.f14310c) {
            f fVar2 = this.f14362i;
            if (fVar2.f14310c) {
                if (fVar.f14317j && fVar2.f14317j && this.f14358e.f14317j) {
                    return;
                }
                if (!this.f14358e.f14317j && this.f14357d == c2.e.b.MATCH_CONSTRAINT) {
                    c2.e eVar6 = this.b;
                    if (eVar6.f4569w == 0 && !eVar6.k0()) {
                        f fVar3 = this.f14361h.f14319l.get(0);
                        f fVar4 = this.f14362i.f14319l.get(0);
                        int i13 = fVar3.f14314g;
                        f fVar5 = this.f14361h;
                        int i14 = i13 + fVar5.f14313f;
                        int i15 = fVar4.f14314g + this.f14362i.f14313f;
                        fVar5.d(i14);
                        this.f14362i.d(i15);
                        this.f14358e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f14358e.f14317j && this.f14357d == c2.e.b.MATCH_CONSTRAINT && this.f14355a == 1 && this.f14361h.f14319l.size() > 0 && this.f14362i.f14319l.size() > 0) {
                    f fVar6 = this.f14361h.f14319l.get(0);
                    int i16 = (this.f14362i.f14319l.get(0).f14314g + this.f14362i.f14313f) - (fVar6.f14314g + this.f14361h.f14313f);
                    g gVar3 = this.f14358e;
                    int i17 = gVar3.f14328m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f14358e.f14317j && this.f14361h.f14319l.size() > 0 && this.f14362i.f14319l.size() > 0) {
                    f fVar7 = this.f14361h.f14319l.get(0);
                    f fVar8 = this.f14362i.f14319l.get(0);
                    int i18 = fVar7.f14314g + this.f14361h.f14313f;
                    int i19 = fVar8.f14314g + this.f14362i.f14313f;
                    float fR = this.b.R();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f14314g;
                        i19 = fVar8.f14314g;
                        fR = 0.5f;
                    }
                    this.f14361h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f14358e.f14314g) * fR)));
                    this.f14362i.d(this.f14361h.f14314g + this.f14358e.f14314g);
                }
            }
        }
    }

    @Override // d2.p
    public void d() {
        c2.e eVarK;
        c2.e eVarK2;
        c2.e eVar = this.b;
        if (eVar.f4526a) {
            this.f14358e.d(eVar.x());
        }
        if (!this.f14358e.f14317j) {
            this.f14357d = this.b.T();
            if (this.b.Z()) {
                this.f14341l = new d2.a(this);
            }
            c2.e.b bVar = this.f14357d;
            if (bVar != c2.e.b.MATCH_CONSTRAINT) {
                if (bVar == c2.e.b.MATCH_PARENT && (eVarK2 = this.b.K()) != null && eVarK2.T() == c2.e.b.FIXED) {
                    int iX = (eVarK2.x() - this.b.P.f()) - this.b.R.f();
                    b(this.f14361h, eVarK2.f4535f.f14361h, this.b.P.f());
                    b(this.f14362i, eVarK2.f4535f.f14362i, -this.b.R.f());
                    this.f14358e.d(iX);
                    return;
                }
                if (this.f14357d == c2.e.b.FIXED) {
                    this.f14358e.d(this.b.x());
                }
            }
        } else if (this.f14357d == c2.e.b.MATCH_PARENT && (eVarK = this.b.K()) != null && eVarK.T() == c2.e.b.FIXED) {
            b(this.f14361h, eVarK.f4535f.f14361h, this.b.P.f());
            b(this.f14362i, eVarK.f4535f.f14362i, -this.b.R.f());
            return;
        }
        g gVar = this.f14358e;
        boolean z10 = gVar.f14317j;
        if (z10) {
            c2.e eVar2 = this.b;
            if (eVar2.f4526a) {
                c2.d[] dVarArr = eVar2.W;
                c2.d dVar = dVarArr[2];
                c2.d dVar2 = dVar.f4513f;
                if (dVar2 != null && dVarArr[3].f4513f != null) {
                    if (eVar2.k0()) {
                        this.f14361h.f14313f = this.b.W[2].f();
                        this.f14362i.f14313f = -this.b.W[3].f();
                    } else {
                        f fVarH = h(this.b.W[2]);
                        if (fVarH != null) {
                            b(this.f14361h, fVarH, this.b.W[2].f());
                        }
                        f fVarH2 = h(this.b.W[3]);
                        if (fVarH2 != null) {
                            b(this.f14362i, fVarH2, -this.b.W[3].f());
                        }
                        this.f14361h.b = true;
                        this.f14362i.b = true;
                    }
                    if (this.b.Z()) {
                        b(this.f14340k, this.f14361h, this.b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f14361h, fVarH3, this.b.W[2].f());
                        b(this.f14362i, this.f14361h, this.f14358e.f14314g);
                        if (this.b.Z()) {
                            b(this.f14340k, this.f14361h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                c2.d dVar3 = dVarArr[3];
                if (dVar3.f4513f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f14362i, fVarH4, -this.b.W[3].f());
                        b(this.f14361h, this.f14362i, -this.f14358e.f14314g);
                    }
                    if (this.b.Z()) {
                        b(this.f14340k, this.f14361h, this.b.p());
                        return;
                    }
                    return;
                }
                c2.d dVar4 = dVarArr[4];
                if (dVar4.f4513f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f14340k, fVarH5, 0);
                        b(this.f14361h, this.f14340k, -this.b.p());
                        b(this.f14362i, this.f14361h, this.f14358e.f14314g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c2.i) || eVar2.K() == null || this.b.o(c2.d.a.CENTER).f4513f != null) {
                    return;
                }
                b(this.f14361h, this.b.K().f4535f.f14361h, this.b.Y());
                b(this.f14362i, this.f14361h, this.f14358e.f14314g);
                if (this.b.Z()) {
                    b(this.f14340k, this.f14361h, this.b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f14357d != c2.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            c2.e eVar3 = this.b;
            int i10 = eVar3.f4571x;
            if (i10 == 2) {
                c2.e eVarK3 = eVar3.K();
                if (eVarK3 != null) {
                    g gVar2 = eVarK3.f4535f.f14358e;
                    this.f14358e.f14319l.add(gVar2);
                    gVar2.f14318k.add(this.f14358e);
                    g gVar3 = this.f14358e;
                    gVar3.b = true;
                    gVar3.f14318k.add(this.f14361h);
                    this.f14358e.f14318k.add(this.f14362i);
                }
            } else if (i10 == 3 && !eVar3.k0()) {
                c2.e eVar4 = this.b;
                if (eVar4.f4569w != 3) {
                    g gVar4 = eVar4.f4533e.f14358e;
                    this.f14358e.f14319l.add(gVar4);
                    gVar4.f14318k.add(this.f14358e);
                    g gVar5 = this.f14358e;
                    gVar5.b = true;
                    gVar5.f14318k.add(this.f14361h);
                    this.f14358e.f14318k.add(this.f14362i);
                }
            }
        }
        c2.e eVar5 = this.b;
        c2.d[] dVarArr2 = eVar5.W;
        c2.d dVar5 = dVarArr2[2];
        c2.d dVar6 = dVar5.f4513f;
        if (dVar6 != null && dVarArr2[3].f4513f != null) {
            if (eVar5.k0()) {
                this.f14361h.f14313f = this.b.W[2].f();
                this.f14362i.f14313f = -this.b.W[3].f();
            } else {
                f fVarH6 = h(this.b.W[2]);
                f fVarH7 = h(this.b.W[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f14363j = p.b.CENTER;
            }
            if (this.b.Z()) {
                c(this.f14340k, this.f14361h, 1, this.f14341l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f14361h, fVarH8, this.b.W[2].f());
                c(this.f14362i, this.f14361h, 1, this.f14358e);
                if (this.b.Z()) {
                    c(this.f14340k, this.f14361h, 1, this.f14341l);
                }
                c2.e.b bVar2 = this.f14357d;
                c2.e.b bVar3 = c2.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.v() > 0.0f) {
                    l lVar = this.b.f4533e;
                    if (lVar.f14357d == bVar3) {
                        lVar.f14358e.f14318k.add(this.f14358e);
                        this.f14358e.f14319l.add(this.b.f4533e.f14358e);
                        this.f14358e.f14309a = this;
                    }
                }
            }
        } else {
            c2.d dVar7 = dVarArr2[3];
            if (dVar7.f4513f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f14362i, fVarH9, -this.b.W[3].f());
                    c(this.f14361h, this.f14362i, -1, this.f14358e);
                    if (this.b.Z()) {
                        c(this.f14340k, this.f14361h, 1, this.f14341l);
                    }
                }
            } else {
                c2.d dVar8 = dVarArr2[4];
                if (dVar8.f4513f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f14340k, fVarH10, 0);
                        c(this.f14361h, this.f14340k, -1, this.f14341l);
                        c(this.f14362i, this.f14361h, 1, this.f14358e);
                    }
                } else if (!(eVar5 instanceof c2.i) && eVar5.K() != null) {
                    b(this.f14361h, this.b.K().f4535f.f14361h, this.b.Y());
                    c(this.f14362i, this.f14361h, 1, this.f14358e);
                    if (this.b.Z()) {
                        c(this.f14340k, this.f14361h, 1, this.f14341l);
                    }
                    c2.e.b bVar4 = this.f14357d;
                    c2.e.b bVar5 = c2.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.v() > 0.0f) {
                        l lVar2 = this.b.f4533e;
                        if (lVar2.f14357d == bVar5) {
                            lVar2.f14358e.f14318k.add(this.f14358e);
                            this.f14358e.f14319l.add(this.b.f4533e.f14358e);
                            this.f14358e.f14309a = this;
                        }
                    }
                }
            }
        }
        if (this.f14358e.f14319l.size() == 0) {
            this.f14358e.f14310c = true;
        }
    }

    @Override // d2.p
    public void e() {
        f fVar = this.f14361h;
        if (fVar.f14317j) {
            this.b.o1(fVar.f14314g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14356c = null;
        this.f14361h.c();
        this.f14362i.c();
        this.f14340k.c();
        this.f14358e.c();
        this.f14360g = false;
    }

    @Override // d2.p
    public boolean m() {
        return this.f14357d != c2.e.b.MATCH_CONSTRAINT || this.b.f4571x == 0;
    }

    public void q() {
        this.f14360g = false;
        this.f14361h.c();
        this.f14361h.f14317j = false;
        this.f14362i.c();
        this.f14362i.f14317j = false;
        this.f14340k.c();
        this.f14340k.f14317j = false;
        this.f14358e.f14317j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.t();
    }
}
