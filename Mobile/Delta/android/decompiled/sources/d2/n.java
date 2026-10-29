package d2;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f14360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f14361l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14362a;

        static {
            int[] iArr = new int[p.b.values().length];
            f14362a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14362a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14362a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(c2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f14360k = fVar;
        this.f14361l = null;
        this.f14381h.f14332e = f.a.TOP;
        this.f14382i.f14332e = f.a.BOTTOM;
        fVar.f14332e = f.a.BASELINE;
        this.f14379f = 1;
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f14362a[this.f14383j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            c2.e eVar = this.b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f14378e;
        if (gVar.f14330c && !gVar.f14337j && this.f14377d == c2.e.b.MATCH_CONSTRAINT) {
            c2.e eVar2 = this.b;
            int i12 = eVar2.f4405x;
            if (i12 == 2) {
                c2.e eVarK = eVar2.K();
                if (eVarK != null) {
                    g gVar2 = eVarK.f4369f.f14378e;
                    if (gVar2.f14337j) {
                        this.f14378e.d((int) ((gVar2.f14334g * this.b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f4367e.f14378e.f14337j) {
                int iW = eVar2.w();
                if (iW != -1) {
                    if (iW == 0) {
                        c2.e eVar3 = this.b;
                        fV2 = eVar3.f4367e.f14378e.f14334g * eVar3.v();
                        i10 = (int) (fV2 + 0.5f);
                    } else if (iW != 1) {
                        i10 = 0;
                    } else {
                        c2.e eVar4 = this.b;
                        f10 = eVar4.f4367e.f14378e.f14334g;
                        fV = eVar4.v();
                    }
                    this.f14378e.d(i10);
                } else {
                    c2.e eVar5 = this.b;
                    f10 = eVar5.f4367e.f14378e.f14334g;
                    fV = eVar5.v();
                }
                fV2 = f10 / fV;
                i10 = (int) (fV2 + 0.5f);
                this.f14378e.d(i10);
            }
        }
        f fVar = this.f14381h;
        if (fVar.f14330c) {
            f fVar2 = this.f14382i;
            if (fVar2.f14330c) {
                if (fVar.f14337j && fVar2.f14337j && this.f14378e.f14337j) {
                    return;
                }
                if (!this.f14378e.f14337j && this.f14377d == c2.e.b.MATCH_CONSTRAINT) {
                    c2.e eVar6 = this.b;
                    if (eVar6.f4403w == 0 && !eVar6.k0()) {
                        f fVar3 = this.f14381h.f14339l.get(0);
                        f fVar4 = this.f14382i.f14339l.get(0);
                        int i13 = fVar3.f14334g;
                        f fVar5 = this.f14381h;
                        int i14 = i13 + fVar5.f14333f;
                        int i15 = fVar4.f14334g + this.f14382i.f14333f;
                        fVar5.d(i14);
                        this.f14382i.d(i15);
                        this.f14378e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f14378e.f14337j && this.f14377d == c2.e.b.MATCH_CONSTRAINT && this.f14375a == 1 && this.f14381h.f14339l.size() > 0 && this.f14382i.f14339l.size() > 0) {
                    f fVar6 = this.f14381h.f14339l.get(0);
                    int i16 = (this.f14382i.f14339l.get(0).f14334g + this.f14382i.f14333f) - (fVar6.f14334g + this.f14381h.f14333f);
                    g gVar3 = this.f14378e;
                    int i17 = gVar3.f14348m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f14378e.f14337j && this.f14381h.f14339l.size() > 0 && this.f14382i.f14339l.size() > 0) {
                    f fVar7 = this.f14381h.f14339l.get(0);
                    f fVar8 = this.f14382i.f14339l.get(0);
                    int i18 = fVar7.f14334g + this.f14381h.f14333f;
                    int i19 = fVar8.f14334g + this.f14382i.f14333f;
                    float fR = this.b.R();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f14334g;
                        i19 = fVar8.f14334g;
                        fR = 0.5f;
                    }
                    this.f14381h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f14378e.f14334g) * fR)));
                    this.f14382i.d(this.f14381h.f14334g + this.f14378e.f14334g);
                }
            }
        }
    }

    @Override // d2.p
    public void d() {
        c2.e eVarK;
        c2.e eVarK2;
        c2.e eVar = this.b;
        if (eVar.f4360a) {
            this.f14378e.d(eVar.x());
        }
        if (!this.f14378e.f14337j) {
            this.f14377d = this.b.T();
            if (this.b.Z()) {
                this.f14361l = new d2.a(this);
            }
            c2.e.b bVar = this.f14377d;
            if (bVar != c2.e.b.MATCH_CONSTRAINT) {
                if (bVar == c2.e.b.MATCH_PARENT && (eVarK2 = this.b.K()) != null && eVarK2.T() == c2.e.b.FIXED) {
                    int iX = (eVarK2.x() - this.b.P.f()) - this.b.R.f();
                    b(this.f14381h, eVarK2.f4369f.f14381h, this.b.P.f());
                    b(this.f14382i, eVarK2.f4369f.f14382i, -this.b.R.f());
                    this.f14378e.d(iX);
                    return;
                }
                if (this.f14377d == c2.e.b.FIXED) {
                    this.f14378e.d(this.b.x());
                }
            }
        } else if (this.f14377d == c2.e.b.MATCH_PARENT && (eVarK = this.b.K()) != null && eVarK.T() == c2.e.b.FIXED) {
            b(this.f14381h, eVarK.f4369f.f14381h, this.b.P.f());
            b(this.f14382i, eVarK.f4369f.f14382i, -this.b.R.f());
            return;
        }
        g gVar = this.f14378e;
        boolean z10 = gVar.f14337j;
        if (z10) {
            c2.e eVar2 = this.b;
            if (eVar2.f4360a) {
                c2.d[] dVarArr = eVar2.W;
                c2.d dVar = dVarArr[2];
                c2.d dVar2 = dVar.f4347f;
                if (dVar2 != null && dVarArr[3].f4347f != null) {
                    if (eVar2.k0()) {
                        this.f14381h.f14333f = this.b.W[2].f();
                        this.f14382i.f14333f = -this.b.W[3].f();
                    } else {
                        f fVarH = h(this.b.W[2]);
                        if (fVarH != null) {
                            b(this.f14381h, fVarH, this.b.W[2].f());
                        }
                        f fVarH2 = h(this.b.W[3]);
                        if (fVarH2 != null) {
                            b(this.f14382i, fVarH2, -this.b.W[3].f());
                        }
                        this.f14381h.b = true;
                        this.f14382i.b = true;
                    }
                    if (this.b.Z()) {
                        b(this.f14360k, this.f14381h, this.b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f14381h, fVarH3, this.b.W[2].f());
                        b(this.f14382i, this.f14381h, this.f14378e.f14334g);
                        if (this.b.Z()) {
                            b(this.f14360k, this.f14381h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                c2.d dVar3 = dVarArr[3];
                if (dVar3.f4347f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f14382i, fVarH4, -this.b.W[3].f());
                        b(this.f14381h, this.f14382i, -this.f14378e.f14334g);
                    }
                    if (this.b.Z()) {
                        b(this.f14360k, this.f14381h, this.b.p());
                        return;
                    }
                    return;
                }
                c2.d dVar4 = dVarArr[4];
                if (dVar4.f4347f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f14360k, fVarH5, 0);
                        b(this.f14381h, this.f14360k, -this.b.p());
                        b(this.f14382i, this.f14381h, this.f14378e.f14334g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c2.i) || eVar2.K() == null || this.b.o(c2.d.a.CENTER).f4347f != null) {
                    return;
                }
                b(this.f14381h, this.b.K().f4369f.f14381h, this.b.Y());
                b(this.f14382i, this.f14381h, this.f14378e.f14334g);
                if (this.b.Z()) {
                    b(this.f14360k, this.f14381h, this.b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f14377d != c2.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            c2.e eVar3 = this.b;
            int i10 = eVar3.f4405x;
            if (i10 == 2) {
                c2.e eVarK3 = eVar3.K();
                if (eVarK3 != null) {
                    g gVar2 = eVarK3.f4369f.f14378e;
                    this.f14378e.f14339l.add(gVar2);
                    gVar2.f14338k.add(this.f14378e);
                    g gVar3 = this.f14378e;
                    gVar3.b = true;
                    gVar3.f14338k.add(this.f14381h);
                    this.f14378e.f14338k.add(this.f14382i);
                }
            } else if (i10 == 3 && !eVar3.k0()) {
                c2.e eVar4 = this.b;
                if (eVar4.f4403w != 3) {
                    g gVar4 = eVar4.f4367e.f14378e;
                    this.f14378e.f14339l.add(gVar4);
                    gVar4.f14338k.add(this.f14378e);
                    g gVar5 = this.f14378e;
                    gVar5.b = true;
                    gVar5.f14338k.add(this.f14381h);
                    this.f14378e.f14338k.add(this.f14382i);
                }
            }
        }
        c2.e eVar5 = this.b;
        c2.d[] dVarArr2 = eVar5.W;
        c2.d dVar5 = dVarArr2[2];
        c2.d dVar6 = dVar5.f4347f;
        if (dVar6 != null && dVarArr2[3].f4347f != null) {
            if (eVar5.k0()) {
                this.f14381h.f14333f = this.b.W[2].f();
                this.f14382i.f14333f = -this.b.W[3].f();
            } else {
                f fVarH6 = h(this.b.W[2]);
                f fVarH7 = h(this.b.W[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f14383j = p.b.CENTER;
            }
            if (this.b.Z()) {
                c(this.f14360k, this.f14381h, 1, this.f14361l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f14381h, fVarH8, this.b.W[2].f());
                c(this.f14382i, this.f14381h, 1, this.f14378e);
                if (this.b.Z()) {
                    c(this.f14360k, this.f14381h, 1, this.f14361l);
                }
                c2.e.b bVar2 = this.f14377d;
                c2.e.b bVar3 = c2.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.v() > 0.0f) {
                    l lVar = this.b.f4367e;
                    if (lVar.f14377d == bVar3) {
                        lVar.f14378e.f14338k.add(this.f14378e);
                        this.f14378e.f14339l.add(this.b.f4367e.f14378e);
                        this.f14378e.f14329a = this;
                    }
                }
            }
        } else {
            c2.d dVar7 = dVarArr2[3];
            if (dVar7.f4347f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f14382i, fVarH9, -this.b.W[3].f());
                    c(this.f14381h, this.f14382i, -1, this.f14378e);
                    if (this.b.Z()) {
                        c(this.f14360k, this.f14381h, 1, this.f14361l);
                    }
                }
            } else {
                c2.d dVar8 = dVarArr2[4];
                if (dVar8.f4347f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f14360k, fVarH10, 0);
                        c(this.f14381h, this.f14360k, -1, this.f14361l);
                        c(this.f14382i, this.f14381h, 1, this.f14378e);
                    }
                } else if (!(eVar5 instanceof c2.i) && eVar5.K() != null) {
                    b(this.f14381h, this.b.K().f4369f.f14381h, this.b.Y());
                    c(this.f14382i, this.f14381h, 1, this.f14378e);
                    if (this.b.Z()) {
                        c(this.f14360k, this.f14381h, 1, this.f14361l);
                    }
                    c2.e.b bVar4 = this.f14377d;
                    c2.e.b bVar5 = c2.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.v() > 0.0f) {
                        l lVar2 = this.b.f4367e;
                        if (lVar2.f14377d == bVar5) {
                            lVar2.f14378e.f14338k.add(this.f14378e);
                            this.f14378e.f14339l.add(this.b.f4367e.f14378e);
                            this.f14378e.f14329a = this;
                        }
                    }
                }
            }
        }
        if (this.f14378e.f14339l.size() == 0) {
            this.f14378e.f14330c = true;
        }
    }

    @Override // d2.p
    public void e() {
        f fVar = this.f14381h;
        if (fVar.f14337j) {
            this.b.o1(fVar.f14334g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14376c = null;
        this.f14381h.c();
        this.f14382i.c();
        this.f14360k.c();
        this.f14378e.c();
        this.f14380g = false;
    }

    @Override // d2.p
    public boolean m() {
        return this.f14377d != c2.e.b.MATCH_CONSTRAINT || this.b.f4405x == 0;
    }

    public void q() {
        this.f14380g = false;
        this.f14381h.c();
        this.f14381h.f14337j = false;
        this.f14382i.c();
        this.f14382i.f14337j = false;
        this.f14360k.c();
        this.f14360k.f14337j = false;
        this.f14378e.f14337j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.t();
    }
}
