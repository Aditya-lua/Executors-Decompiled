package d2;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f11716k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11717a;

        static {
            int[] iArr = new int[p.b.values().length];
            f11717a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11717a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11717a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(c2.e eVar) {
        super(eVar);
        this.f11746h.f11697e = f.a.LEFT;
        this.f11747i.f11697e = f.a.RIGHT;
        this.f11744f = 0;
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
        int i12 = a.f11717a[this.f11748j.ordinal()];
        if (i12 == 1) {
            p(dVar);
        } else if (i12 == 2) {
            o(dVar);
        } else if (i12 == 3) {
            c2.e eVar = this.b;
            n(dVar, eVar.O, eVar.Q, 0);
            return;
        }
        if (!this.f11743e.f11702j && this.f11742d == c2.e.b.MATCH_CONSTRAINT) {
            c2.e eVar2 = this.b;
            int i13 = eVar2.f4696w;
            if (i13 == 2) {
                c2.e eVarK = eVar2.K();
                if (eVarK != null) {
                    g gVar = eVarK.f4660e.f11743e;
                    if (gVar.f11702j) {
                        this.f11743e.d((int) ((gVar.f11699g * this.b.B) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = eVar2.f4698x;
                if (i14 == 0 || i14 == 3) {
                    n nVar = eVar2.f4662f;
                    f fVar = nVar.f11746h;
                    f fVar2 = nVar.f11747i;
                    boolean z10 = eVar2.O.f4640f != null;
                    boolean z11 = eVar2.P.f4640f != null;
                    boolean z12 = eVar2.Q.f4640f != null;
                    boolean z13 = eVar2.R.f4640f != null;
                    int iW = eVar2.w();
                    if (z10 && z11 && z12 && z13) {
                        float fV3 = this.b.v();
                        if (fVar.f11702j && fVar2.f11702j) {
                            f fVar3 = this.f11746h;
                            if (fVar3.f11695c && this.f11747i.f11695c) {
                                q(f11716k, this.f11746h.f11698f + fVar3.f11704l.get(0).f11699g, this.f11747i.f11704l.get(0).f11699g - this.f11747i.f11698f, fVar.f11698f + fVar.f11699g, fVar2.f11699g - fVar2.f11698f, fV3, iW);
                                this.f11743e.d(f11716k[0]);
                                this.b.f4662f.f11743e.d(f11716k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f11746h;
                        if (fVar4.f11702j) {
                            f fVar5 = this.f11747i;
                            if (fVar5.f11702j) {
                                if (!fVar.f11695c || !fVar2.f11695c) {
                                    return;
                                }
                                q(f11716k, fVar4.f11699g + fVar4.f11698f, fVar5.f11699g - fVar5.f11698f, fVar.f11698f + fVar.f11704l.get(0).f11699g, fVar2.f11704l.get(0).f11699g - fVar2.f11698f, fV3, iW);
                                this.f11743e.d(f11716k[0]);
                                this.b.f4662f.f11743e.d(f11716k[1]);
                            }
                        }
                        f fVar6 = this.f11746h;
                        if (!fVar6.f11695c || !this.f11747i.f11695c || !fVar.f11695c || !fVar2.f11695c) {
                            return;
                        }
                        q(f11716k, this.f11746h.f11698f + fVar6.f11704l.get(0).f11699g, this.f11747i.f11704l.get(0).f11699g - this.f11747i.f11698f, fVar.f11698f + fVar.f11704l.get(0).f11699g, fVar2.f11704l.get(0).f11699g - fVar2.f11698f, fV3, iW);
                        this.f11743e.d(f11716k[0]);
                        this.b.f4662f.f11743e.d(f11716k[1]);
                    } else if (z10 && z12) {
                        if (!this.f11746h.f11695c || !this.f11747i.f11695c) {
                            return;
                        }
                        float fV4 = this.b.v();
                        int i15 = this.f11746h.f11704l.get(0).f11699g + this.f11746h.f11698f;
                        int i16 = this.f11747i.f11704l.get(0).f11699g - this.f11747i.f11698f;
                        if (iW == -1 || iW == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * fV4) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / fV4) + 0.5f);
                            }
                            this.f11743e.d(iG3);
                            this.b.f4662f.f11743e.d(iG4);
                        } else if (iW == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / fV4) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * fV4) + 0.5f);
                            }
                            this.f11743e.d(iG5);
                            this.b.f4662f.f11743e.d(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!fVar.f11695c || !fVar2.f11695c) {
                            return;
                        }
                        float fV5 = this.b.v();
                        int i19 = fVar.f11704l.get(0).f11699g + fVar.f11698f;
                        int i20 = fVar2.f11704l.get(0).f11699g - fVar2.f11698f;
                        if (iW == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fV5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fV5) + 0.5f);
                            }
                            this.f11743e.d(iG2);
                            this.b.f4662f.f11743e.d(iG);
                        } else if (iW == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * fV5) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / fV5) + 0.5f);
                            }
                            this.f11743e.d(iG8);
                            this.b.f4662f.f11743e.d(iG7);
                        } else if (iW == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fV5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fV5) + 0.5f);
                            }
                            this.f11743e.d(iG2);
                            this.b.f4662f.f11743e.d(iG);
                        }
                    }
                } else {
                    int iW2 = eVar2.w();
                    if (iW2 != -1) {
                        if (iW2 == 0) {
                            c2.e eVar3 = this.b;
                            fV2 = eVar3.f4662f.f11743e.f11699g / eVar3.v();
                            i11 = (int) (fV2 + 0.5f);
                        } else if (iW2 != 1) {
                            i11 = 0;
                        } else {
                            c2.e eVar4 = this.b;
                            f10 = eVar4.f4662f.f11743e.f11699g;
                            fV = eVar4.v();
                        }
                        this.f11743e.d(i11);
                    } else {
                        c2.e eVar5 = this.b;
                        f10 = eVar5.f4662f.f11743e.f11699g;
                        fV = eVar5.v();
                    }
                    fV2 = f10 * fV;
                    i11 = (int) (fV2 + 0.5f);
                    this.f11743e.d(i11);
                }
            }
        }
        f fVar7 = this.f11746h;
        if (fVar7.f11695c) {
            f fVar8 = this.f11747i;
            if (fVar8.f11695c) {
                if (fVar7.f11702j && fVar8.f11702j && this.f11743e.f11702j) {
                    return;
                }
                if (!this.f11743e.f11702j && this.f11742d == c2.e.b.MATCH_CONSTRAINT) {
                    c2.e eVar6 = this.b;
                    if (eVar6.f4696w == 0 && !eVar6.i0()) {
                        f fVar9 = this.f11746h.f11704l.get(0);
                        f fVar10 = this.f11747i.f11704l.get(0);
                        int i22 = fVar9.f11699g;
                        f fVar11 = this.f11746h;
                        int i23 = i22 + fVar11.f11698f;
                        int i24 = fVar10.f11699g + this.f11747i.f11698f;
                        fVar11.d(i23);
                        this.f11747i.d(i24);
                        this.f11743e.d(i24 - i23);
                        return;
                    }
                }
                if (!this.f11743e.f11702j && this.f11742d == c2.e.b.MATCH_CONSTRAINT && this.f11740a == 1 && this.f11746h.f11704l.size() > 0 && this.f11747i.f11704l.size() > 0) {
                    int iMin = Math.min((this.f11747i.f11704l.get(0).f11699g + this.f11747i.f11698f) - (this.f11746h.f11704l.get(0).f11699g + this.f11746h.f11698f), this.f11743e.f11713m);
                    c2.e eVar7 = this.b;
                    int i25 = eVar7.A;
                    int iMax = Math.max(eVar7.f4702z, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f11743e.d(iMax);
                }
                if (this.f11743e.f11702j) {
                    f fVar12 = this.f11746h.f11704l.get(0);
                    f fVar13 = this.f11747i.f11704l.get(0);
                    int i26 = fVar12.f11699g + this.f11746h.f11698f;
                    int i27 = fVar13.f11699g + this.f11747i.f11698f;
                    float fY = this.b.y();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f11699g;
                        i27 = fVar13.f11699g;
                        fY = 0.5f;
                    }
                    this.f11746h.d((int) (i26 + 0.5f + (((i27 - i26) - this.f11743e.f11699g) * fY)));
                    this.f11747i.d(this.f11746h.f11699g + this.f11743e.f11699g);
                }
            }
        }
    }

    @Override // d2.p
    public void d() {
        c2.e eVarK;
        c2.e eVarK2;
        c2.e eVar = this.b;
        if (eVar.f4653a) {
            this.f11743e.d(eVar.W());
        }
        if (this.f11743e.f11702j) {
            c2.e.b bVar = this.f11742d;
            c2.e.b bVar2 = c2.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarK = this.b.K()) != null && (eVarK.A() == c2.e.b.FIXED || eVarK.A() == bVar2)) {
                b(this.f11746h, eVarK.f4660e.f11746h, this.b.O.f());
                b(this.f11747i, eVarK.f4660e.f11747i, -this.b.Q.f());
                return;
            }
        } else {
            c2.e.b bVarA = this.b.A();
            this.f11742d = bVarA;
            if (bVarA != c2.e.b.MATCH_CONSTRAINT) {
                c2.e.b bVar3 = c2.e.b.MATCH_PARENT;
                if (bVarA == bVar3 && (eVarK2 = this.b.K()) != null && (eVarK2.A() == c2.e.b.FIXED || eVarK2.A() == bVar3)) {
                    int iW = (eVarK2.W() - this.b.O.f()) - this.b.Q.f();
                    b(this.f11746h, eVarK2.f4660e.f11746h, this.b.O.f());
                    b(this.f11747i, eVarK2.f4660e.f11747i, -this.b.Q.f());
                    this.f11743e.d(iW);
                    return;
                }
                if (this.f11742d == c2.e.b.FIXED) {
                    this.f11743e.d(this.b.W());
                }
            }
        }
        g gVar = this.f11743e;
        if (gVar.f11702j) {
            c2.e eVar2 = this.b;
            if (eVar2.f4653a) {
                c2.d[] dVarArr = eVar2.W;
                c2.d dVar = dVarArr[0];
                c2.d dVar2 = dVar.f4640f;
                if (dVar2 != null && dVarArr[1].f4640f != null) {
                    if (eVar2.i0()) {
                        this.f11746h.f11698f = this.b.W[0].f();
                        this.f11747i.f11698f = -this.b.W[1].f();
                        return;
                    }
                    f fVarH = h(this.b.W[0]);
                    if (fVarH != null) {
                        b(this.f11746h, fVarH, this.b.W[0].f());
                    }
                    f fVarH2 = h(this.b.W[1]);
                    if (fVarH2 != null) {
                        b(this.f11747i, fVarH2, -this.b.W[1].f());
                    }
                    this.f11746h.b = true;
                    this.f11747i.b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f11746h, fVarH3, this.b.W[0].f());
                        b(this.f11747i, this.f11746h, this.f11743e.f11699g);
                        return;
                    }
                    return;
                }
                c2.d dVar3 = dVarArr[1];
                if (dVar3.f4640f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f11747i, fVarH4, -this.b.W[1].f());
                        b(this.f11746h, this.f11747i, -this.f11743e.f11699g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c2.i) || eVar2.K() == null || this.b.o(c2.d.a.CENTER).f4640f != null) {
                    return;
                }
                b(this.f11746h, this.b.K().f4660e.f11746h, this.b.X());
                b(this.f11747i, this.f11746h, this.f11743e.f11699g);
                return;
            }
        }
        if (this.f11742d == c2.e.b.MATCH_CONSTRAINT) {
            c2.e eVar3 = this.b;
            int i10 = eVar3.f4696w;
            if (i10 == 2) {
                c2.e eVarK3 = eVar3.K();
                if (eVarK3 != null) {
                    g gVar2 = eVarK3.f4662f.f11743e;
                    this.f11743e.f11704l.add(gVar2);
                    gVar2.f11703k.add(this.f11743e);
                    g gVar3 = this.f11743e;
                    gVar3.b = true;
                    gVar3.f11703k.add(this.f11746h);
                    this.f11743e.f11703k.add(this.f11747i);
                }
            } else if (i10 == 3) {
                if (eVar3.f4698x == 3) {
                    this.f11746h.f11694a = this;
                    this.f11747i.f11694a = this;
                    n nVar = eVar3.f4662f;
                    nVar.f11746h.f11694a = this;
                    nVar.f11747i.f11694a = this;
                    gVar.f11694a = this;
                    if (eVar3.k0()) {
                        this.f11743e.f11704l.add(this.b.f4662f.f11743e);
                        this.b.f4662f.f11743e.f11703k.add(this.f11743e);
                        n nVar2 = this.b.f4662f;
                        nVar2.f11743e.f11694a = this;
                        this.f11743e.f11704l.add(nVar2.f11746h);
                        this.f11743e.f11704l.add(this.b.f4662f.f11747i);
                        this.b.f4662f.f11746h.f11703k.add(this.f11743e);
                        this.b.f4662f.f11747i.f11703k.add(this.f11743e);
                    } else if (this.b.i0()) {
                        this.b.f4662f.f11743e.f11704l.add(this.f11743e);
                        this.f11743e.f11703k.add(this.b.f4662f.f11743e);
                    } else {
                        this.b.f4662f.f11743e.f11704l.add(this.f11743e);
                    }
                } else {
                    g gVar4 = eVar3.f4662f.f11743e;
                    gVar.f11704l.add(gVar4);
                    gVar4.f11703k.add(this.f11743e);
                    this.b.f4662f.f11746h.f11703k.add(this.f11743e);
                    this.b.f4662f.f11747i.f11703k.add(this.f11743e);
                    g gVar5 = this.f11743e;
                    gVar5.b = true;
                    gVar5.f11703k.add(this.f11746h);
                    this.f11743e.f11703k.add(this.f11747i);
                    this.f11746h.f11704l.add(this.f11743e);
                    this.f11747i.f11704l.add(this.f11743e);
                }
            }
        }
        c2.e eVar4 = this.b;
        c2.d[] dVarArr2 = eVar4.W;
        c2.d dVar4 = dVarArr2[0];
        c2.d dVar5 = dVar4.f4640f;
        if (dVar5 != null && dVarArr2[1].f4640f != null) {
            if (eVar4.i0()) {
                this.f11746h.f11698f = this.b.W[0].f();
                this.f11747i.f11698f = -this.b.W[1].f();
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
            this.f11748j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f11746h, fVarH7, this.b.W[0].f());
                c(this.f11747i, this.f11746h, 1, this.f11743e);
                return;
            }
            return;
        }
        c2.d dVar6 = dVarArr2[1];
        if (dVar6.f4640f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f11747i, fVarH8, -this.b.W[1].f());
                c(this.f11746h, this.f11747i, -1, this.f11743e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof c2.i) || eVar4.K() == null) {
            return;
        }
        b(this.f11746h, this.b.K().f4660e.f11746h, this.b.X());
        c(this.f11747i, this.f11746h, 1, this.f11743e);
    }

    @Override // d2.p
    public void e() {
        f fVar = this.f11746h;
        if (fVar.f11702j) {
            this.b.n1(fVar.f11699g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f11741c = null;
        this.f11746h.c();
        this.f11747i.c();
        this.f11743e.c();
        this.f11745g = false;
    }

    @Override // d2.p
    public boolean m() {
        return this.f11742d != c2.e.b.MATCH_CONSTRAINT || this.b.f4696w == 0;
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
        this.f11745g = false;
        this.f11746h.c();
        this.f11746h.f11702j = false;
        this.f11747i.c();
        this.f11747i.f11702j = false;
        this.f11743e.f11702j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.t();
    }
}
