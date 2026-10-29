package d2;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f14351k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14352a;

        static {
            int[] iArr = new int[p.b.values().length];
            f14352a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14352a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14352a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(c2.e eVar) {
        super(eVar);
        this.f14381h.f14332e = f.a.LEFT;
        this.f14382i.f14332e = f.a.RIGHT;
        this.f14379f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // d2.p, d2.d
    public void a(d dVar) {
        int iG;
        int i10;
        int iG2;
        float f10;
        float fV;
        float fV2;
        int i11;
        int i12 = a.f14352a[this.f14383j.ordinal()];
        if (i12 == 1) {
            p(dVar);
        } else if (i12 == 2) {
            o(dVar);
        } else if (i12 == 3) {
            c2.e eVar = this.b;
            n(dVar, eVar.O, eVar.Q, 0);
            return;
        }
        if (!this.f14378e.f14337j && this.f14377d == c2.e.b.MATCH_CONSTRAINT) {
            c2.e eVar2 = this.b;
            int i13 = eVar2.f4403w;
            if (i13 == 2) {
                c2.e eVarK = eVar2.K();
                if (eVarK != null) {
                    g gVar = eVarK.f4367e.f14378e;
                    if (gVar.f14337j) {
                        this.f14378e.d((int) ((gVar.f14334g * this.b.B) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = eVar2.f4405x;
                if (i14 == 0 || i14 == 3) {
                    n nVar = eVar2.f4369f;
                    f fVar = nVar.f14381h;
                    f fVar2 = nVar.f14382i;
                    boolean z10 = eVar2.O.f4347f != null;
                    boolean z11 = eVar2.P.f4347f != null;
                    boolean z12 = eVar2.Q.f4347f != null;
                    boolean z13 = eVar2.R.f4347f != null;
                    int iW = eVar2.w();
                    if (z10 && z11 && z12 && z13) {
                        float fV3 = this.b.v();
                        if (fVar.f14337j && fVar2.f14337j) {
                            f fVar3 = this.f14381h;
                            if (fVar3.f14330c && this.f14382i.f14330c) {
                                q(f14351k, this.f14381h.f14333f + fVar3.f14339l.get(0).f14334g, this.f14382i.f14339l.get(0).f14334g - this.f14382i.f14333f, fVar.f14333f + fVar.f14334g, fVar2.f14334g - fVar2.f14333f, fV3, iW);
                                this.f14378e.d(f14351k[0]);
                                this.b.f4369f.f14378e.d(f14351k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f14381h;
                        if (fVar4.f14337j) {
                            f fVar5 = this.f14382i;
                            if (fVar5.f14337j) {
                                if (!fVar.f14330c || !fVar2.f14330c) {
                                    return;
                                }
                                q(f14351k, fVar4.f14334g + fVar4.f14333f, fVar5.f14334g - fVar5.f14333f, fVar.f14333f + fVar.f14339l.get(0).f14334g, fVar2.f14339l.get(0).f14334g - fVar2.f14333f, fV3, iW);
                                this.f14378e.d(f14351k[0]);
                                this.b.f4369f.f14378e.d(f14351k[1]);
                            }
                        }
                        f fVar6 = this.f14381h;
                        if (!fVar6.f14330c || !this.f14382i.f14330c || !fVar.f14330c || !fVar2.f14330c) {
                            return;
                        }
                        q(f14351k, this.f14381h.f14333f + fVar6.f14339l.get(0).f14334g, this.f14382i.f14339l.get(0).f14334g - this.f14382i.f14333f, fVar.f14333f + fVar.f14339l.get(0).f14334g, fVar2.f14339l.get(0).f14334g - fVar2.f14333f, fV3, iW);
                        this.f14378e.d(f14351k[0]);
                        this.b.f4369f.f14378e.d(f14351k[1]);
                    } else if (z10 && z12) {
                        if (!this.f14381h.f14330c || !this.f14382i.f14330c) {
                            return;
                        }
                        float fV4 = this.b.v();
                        int i15 = this.f14381h.f14339l.get(0).f14334g + this.f14381h.f14333f;
                        int i16 = this.f14382i.f14339l.get(0).f14334g - this.f14382i.f14333f;
                        if (iW == -1 || iW == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * fV4) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / fV4) + 0.5f);
                            }
                            this.f14378e.d(iG3);
                            this.b.f4369f.f14378e.d(iG4);
                        } else if (iW == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / fV4) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * fV4) + 0.5f);
                            }
                            this.f14378e.d(iG5);
                            this.b.f4369f.f14378e.d(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!fVar.f14330c || !fVar2.f14330c) {
                            return;
                        }
                        float fV5 = this.b.v();
                        int i19 = fVar.f14339l.get(0).f14334g + fVar.f14333f;
                        int i20 = fVar2.f14339l.get(0).f14334g - fVar2.f14333f;
                        if (iW == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fV5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fV5) + 0.5f);
                            }
                            this.f14378e.d(iG2);
                            this.b.f4369f.f14378e.d(iG);
                        } else if (iW == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * fV5) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / fV5) + 0.5f);
                            }
                            this.f14378e.d(iG8);
                            this.b.f4369f.f14378e.d(iG7);
                        } else if (iW == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fV5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fV5) + 0.5f);
                            }
                            this.f14378e.d(iG2);
                            this.b.f4369f.f14378e.d(iG);
                        }
                    }
                } else {
                    int iW2 = eVar2.w();
                    if (iW2 != -1) {
                        if (iW2 == 0) {
                            c2.e eVar3 = this.b;
                            fV2 = eVar3.f4369f.f14378e.f14334g / eVar3.v();
                            i11 = (int) (fV2 + 0.5f);
                        } else if (iW2 != 1) {
                            i11 = 0;
                        } else {
                            c2.e eVar4 = this.b;
                            f10 = eVar4.f4369f.f14378e.f14334g;
                            fV = eVar4.v();
                        }
                        this.f14378e.d(i11);
                    } else {
                        c2.e eVar5 = this.b;
                        f10 = eVar5.f4369f.f14378e.f14334g;
                        fV = eVar5.v();
                    }
                    fV2 = f10 * fV;
                    i11 = (int) (fV2 + 0.5f);
                    this.f14378e.d(i11);
                }
            }
        }
        f fVar7 = this.f14381h;
        if (fVar7.f14330c) {
            f fVar8 = this.f14382i;
            if (fVar8.f14330c) {
                if (fVar7.f14337j && fVar8.f14337j && this.f14378e.f14337j) {
                    return;
                }
                if (!this.f14378e.f14337j && this.f14377d == c2.e.b.MATCH_CONSTRAINT) {
                    c2.e eVar6 = this.b;
                    if (eVar6.f4403w == 0 && !eVar6.i0()) {
                        f fVar9 = this.f14381h.f14339l.get(0);
                        f fVar10 = this.f14382i.f14339l.get(0);
                        int i22 = fVar9.f14334g;
                        f fVar11 = this.f14381h;
                        int i23 = i22 + fVar11.f14333f;
                        int i24 = fVar10.f14334g + this.f14382i.f14333f;
                        fVar11.d(i23);
                        this.f14382i.d(i24);
                        this.f14378e.d(i24 - i23);
                        return;
                    }
                }
                if (!this.f14378e.f14337j && this.f14377d == c2.e.b.MATCH_CONSTRAINT && this.f14375a == 1 && this.f14381h.f14339l.size() > 0 && this.f14382i.f14339l.size() > 0) {
                    int iMin = Math.min((this.f14382i.f14339l.get(0).f14334g + this.f14382i.f14333f) - (this.f14381h.f14339l.get(0).f14334g + this.f14381h.f14333f), this.f14378e.f14348m);
                    c2.e eVar7 = this.b;
                    int i25 = eVar7.A;
                    int iMax = Math.max(eVar7.f4409z, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f14378e.d(iMax);
                }
                if (this.f14378e.f14337j) {
                    f fVar12 = this.f14381h.f14339l.get(0);
                    f fVar13 = this.f14382i.f14339l.get(0);
                    int i26 = fVar12.f14334g + this.f14381h.f14333f;
                    int i27 = fVar13.f14334g + this.f14382i.f14333f;
                    float fY = this.b.y();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f14334g;
                        i27 = fVar13.f14334g;
                        fY = 0.5f;
                    }
                    this.f14381h.d((int) (i26 + 0.5f + (((i27 - i26) - this.f14378e.f14334g) * fY)));
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
            this.f14378e.d(eVar.W());
        }
        if (this.f14378e.f14337j) {
            c2.e.b bVar = this.f14377d;
            c2.e.b bVar2 = c2.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarK = this.b.K()) != null && (eVarK.A() == c2.e.b.FIXED || eVarK.A() == bVar2)) {
                b(this.f14381h, eVarK.f4367e.f14381h, this.b.O.f());
                b(this.f14382i, eVarK.f4367e.f14382i, -this.b.Q.f());
                return;
            }
        } else {
            c2.e.b bVarA = this.b.A();
            this.f14377d = bVarA;
            if (bVarA != c2.e.b.MATCH_CONSTRAINT) {
                c2.e.b bVar3 = c2.e.b.MATCH_PARENT;
                if (bVarA == bVar3 && (eVarK2 = this.b.K()) != null && (eVarK2.A() == c2.e.b.FIXED || eVarK2.A() == bVar3)) {
                    int iW = (eVarK2.W() - this.b.O.f()) - this.b.Q.f();
                    b(this.f14381h, eVarK2.f4367e.f14381h, this.b.O.f());
                    b(this.f14382i, eVarK2.f4367e.f14382i, -this.b.Q.f());
                    this.f14378e.d(iW);
                    return;
                }
                if (this.f14377d == c2.e.b.FIXED) {
                    this.f14378e.d(this.b.W());
                }
            }
        }
        g gVar = this.f14378e;
        if (gVar.f14337j) {
            c2.e eVar2 = this.b;
            if (eVar2.f4360a) {
                c2.d[] dVarArr = eVar2.W;
                c2.d dVar = dVarArr[0];
                c2.d dVar2 = dVar.f4347f;
                if (dVar2 != null && dVarArr[1].f4347f != null) {
                    if (eVar2.i0()) {
                        this.f14381h.f14333f = this.b.W[0].f();
                        this.f14382i.f14333f = -this.b.W[1].f();
                        return;
                    }
                    f fVarH = h(this.b.W[0]);
                    if (fVarH != null) {
                        b(this.f14381h, fVarH, this.b.W[0].f());
                    }
                    f fVarH2 = h(this.b.W[1]);
                    if (fVarH2 != null) {
                        b(this.f14382i, fVarH2, -this.b.W[1].f());
                    }
                    this.f14381h.b = true;
                    this.f14382i.b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f14381h, fVarH3, this.b.W[0].f());
                        b(this.f14382i, this.f14381h, this.f14378e.f14334g);
                        return;
                    }
                    return;
                }
                c2.d dVar3 = dVarArr[1];
                if (dVar3.f4347f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f14382i, fVarH4, -this.b.W[1].f());
                        b(this.f14381h, this.f14382i, -this.f14378e.f14334g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c2.i) || eVar2.K() == null || this.b.o(c2.d.a.CENTER).f4347f != null) {
                    return;
                }
                b(this.f14381h, this.b.K().f4367e.f14381h, this.b.X());
                b(this.f14382i, this.f14381h, this.f14378e.f14334g);
                return;
            }
        }
        if (this.f14377d == c2.e.b.MATCH_CONSTRAINT) {
            c2.e eVar3 = this.b;
            int i10 = eVar3.f4403w;
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
            } else if (i10 == 3) {
                if (eVar3.f4405x == 3) {
                    this.f14381h.f14329a = this;
                    this.f14382i.f14329a = this;
                    n nVar = eVar3.f4369f;
                    nVar.f14381h.f14329a = this;
                    nVar.f14382i.f14329a = this;
                    gVar.f14329a = this;
                    if (eVar3.k0()) {
                        this.f14378e.f14339l.add(this.b.f4369f.f14378e);
                        this.b.f4369f.f14378e.f14338k.add(this.f14378e);
                        n nVar2 = this.b.f4369f;
                        nVar2.f14378e.f14329a = this;
                        this.f14378e.f14339l.add(nVar2.f14381h);
                        this.f14378e.f14339l.add(this.b.f4369f.f14382i);
                        this.b.f4369f.f14381h.f14338k.add(this.f14378e);
                        this.b.f4369f.f14382i.f14338k.add(this.f14378e);
                    } else if (this.b.i0()) {
                        this.b.f4369f.f14378e.f14339l.add(this.f14378e);
                        this.f14378e.f14338k.add(this.b.f4369f.f14378e);
                    } else {
                        this.b.f4369f.f14378e.f14339l.add(this.f14378e);
                    }
                } else {
                    g gVar4 = eVar3.f4369f.f14378e;
                    gVar.f14339l.add(gVar4);
                    gVar4.f14338k.add(this.f14378e);
                    this.b.f4369f.f14381h.f14338k.add(this.f14378e);
                    this.b.f4369f.f14382i.f14338k.add(this.f14378e);
                    g gVar5 = this.f14378e;
                    gVar5.b = true;
                    gVar5.f14338k.add(this.f14381h);
                    this.f14378e.f14338k.add(this.f14382i);
                    this.f14381h.f14339l.add(this.f14378e);
                    this.f14382i.f14339l.add(this.f14378e);
                }
            }
        }
        c2.e eVar4 = this.b;
        c2.d[] dVarArr2 = eVar4.W;
        c2.d dVar4 = dVarArr2[0];
        c2.d dVar5 = dVar4.f4347f;
        if (dVar5 != null && dVarArr2[1].f4347f != null) {
            if (eVar4.i0()) {
                this.f14381h.f14333f = this.b.W[0].f();
                this.f14382i.f14333f = -this.b.W[1].f();
                return;
            }
            f fVarH5 = h(this.b.W[0]);
            f fVarH6 = h(this.b.W[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f14383j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f14381h, fVarH7, this.b.W[0].f());
                c(this.f14382i, this.f14381h, 1, this.f14378e);
                return;
            }
            return;
        }
        c2.d dVar6 = dVarArr2[1];
        if (dVar6.f4347f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f14382i, fVarH8, -this.b.W[1].f());
                c(this.f14381h, this.f14382i, -1, this.f14378e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof c2.i) || eVar4.K() == null) {
            return;
        }
        b(this.f14381h, this.b.K().f4367e.f14381h, this.b.X());
        c(this.f14382i, this.f14381h, 1, this.f14378e);
    }

    @Override // d2.p
    public void e() {
        f fVar = this.f14381h;
        if (fVar.f14337j) {
            this.b.n1(fVar.f14334g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14376c = null;
        this.f14381h.c();
        this.f14382i.c();
        this.f14378e.c();
        this.f14380g = false;
    }

    @Override // d2.p
    public boolean m() {
        return this.f14377d != c2.e.b.MATCH_CONSTRAINT || this.b.f4403w == 0;
    }

    public final void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void r() {
        this.f14380g = false;
        this.f14381h.c();
        this.f14381h.f14337j = false;
        this.f14382i.c();
        this.f14382i.f14337j = false;
        this.f14378e.f14337j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.t();
    }
}
