package d2;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f11725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f11726l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11727a;

        static {
            int[] iArr = new int[p.b.values().length];
            f11727a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11727a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11727a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(c2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f11725k = fVar;
        this.f11726l = null;
        this.f11746h.f11697e = f.a.TOP;
        this.f11747i.f11697e = f.a.BOTTOM;
        fVar.f11697e = f.a.BASELINE;
        this.f11744f = 1;
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f11727a[this.f11748j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            c2.e eVar = this.b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f11743e;
        if (gVar.f11695c && !gVar.f11702j && this.f11742d == c2.e.b.MATCH_CONSTRAINT) {
            c2.e eVar2 = this.b;
            int i12 = eVar2.f4698x;
            if (i12 == 2) {
                c2.e eVarK = eVar2.K();
                if (eVarK != null) {
                    g gVar2 = eVarK.f4662f.f11743e;
                    if (gVar2.f11702j) {
                        this.f11743e.d((int) ((gVar2.f11699g * this.b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f4660e.f11743e.f11702j) {
                int iW = eVar2.w();
                if (iW != -1) {
                    if (iW == 0) {
                        c2.e eVar3 = this.b;
                        fV2 = eVar3.f4660e.f11743e.f11699g * eVar3.v();
                        i10 = (int) (fV2 + 0.5f);
                    } else if (iW != 1) {
                        i10 = 0;
                    } else {
                        c2.e eVar4 = this.b;
                        f10 = eVar4.f4660e.f11743e.f11699g;
                        fV = eVar4.v();
                    }
                    this.f11743e.d(i10);
                } else {
                    c2.e eVar5 = this.b;
                    f10 = eVar5.f4660e.f11743e.f11699g;
                    fV = eVar5.v();
                }
                fV2 = f10 / fV;
                i10 = (int) (fV2 + 0.5f);
                this.f11743e.d(i10);
            }
        }
        f fVar = this.f11746h;
        if (fVar.f11695c) {
            f fVar2 = this.f11747i;
            if (fVar2.f11695c) {
                if (fVar.f11702j && fVar2.f11702j && this.f11743e.f11702j) {
                    return;
                }
                if (!this.f11743e.f11702j && this.f11742d == c2.e.b.MATCH_CONSTRAINT) {
                    c2.e eVar6 = this.b;
                    if (eVar6.f4696w == 0 && !eVar6.k0()) {
                        f fVar3 = this.f11746h.f11704l.get(0);
                        f fVar4 = this.f11747i.f11704l.get(0);
                        int i13 = fVar3.f11699g;
                        f fVar5 = this.f11746h;
                        int i14 = i13 + fVar5.f11698f;
                        int i15 = fVar4.f11699g + this.f11747i.f11698f;
                        fVar5.d(i14);
                        this.f11747i.d(i15);
                        this.f11743e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f11743e.f11702j && this.f11742d == c2.e.b.MATCH_CONSTRAINT && this.f11740a == 1 && this.f11746h.f11704l.size() > 0 && this.f11747i.f11704l.size() > 0) {
                    f fVar6 = this.f11746h.f11704l.get(0);
                    int i16 = (this.f11747i.f11704l.get(0).f11699g + this.f11747i.f11698f) - (fVar6.f11699g + this.f11746h.f11698f);
                    g gVar3 = this.f11743e;
                    int i17 = gVar3.f11713m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f11743e.f11702j && this.f11746h.f11704l.size() > 0 && this.f11747i.f11704l.size() > 0) {
                    f fVar7 = this.f11746h.f11704l.get(0);
                    f fVar8 = this.f11747i.f11704l.get(0);
                    int i18 = fVar7.f11699g + this.f11746h.f11698f;
                    int i19 = fVar8.f11699g + this.f11747i.f11698f;
                    float fR = this.b.R();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f11699g;
                        i19 = fVar8.f11699g;
                        fR = 0.5f;
                    }
                    this.f11746h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f11743e.f11699g) * fR)));
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
            this.f11743e.d(eVar.x());
        }
        if (!this.f11743e.f11702j) {
            this.f11742d = this.b.T();
            if (this.b.Z()) {
                this.f11726l = new d2.a(this);
            }
            c2.e.b bVar = this.f11742d;
            if (bVar != c2.e.b.MATCH_CONSTRAINT) {
                if (bVar == c2.e.b.MATCH_PARENT && (eVarK2 = this.b.K()) != null && eVarK2.T() == c2.e.b.FIXED) {
                    int iX = (eVarK2.x() - this.b.P.f()) - this.b.R.f();
                    b(this.f11746h, eVarK2.f4662f.f11746h, this.b.P.f());
                    b(this.f11747i, eVarK2.f4662f.f11747i, -this.b.R.f());
                    this.f11743e.d(iX);
                    return;
                }
                if (this.f11742d == c2.e.b.FIXED) {
                    this.f11743e.d(this.b.x());
                }
            }
        } else if (this.f11742d == c2.e.b.MATCH_PARENT && (eVarK = this.b.K()) != null && eVarK.T() == c2.e.b.FIXED) {
            b(this.f11746h, eVarK.f4662f.f11746h, this.b.P.f());
            b(this.f11747i, eVarK.f4662f.f11747i, -this.b.R.f());
            return;
        }
        g gVar = this.f11743e;
        boolean z10 = gVar.f11702j;
        if (z10) {
            c2.e eVar2 = this.b;
            if (eVar2.f4653a) {
                c2.d[] dVarArr = eVar2.W;
                c2.d dVar = dVarArr[2];
                c2.d dVar2 = dVar.f4640f;
                if (dVar2 != null && dVarArr[3].f4640f != null) {
                    if (eVar2.k0()) {
                        this.f11746h.f11698f = this.b.W[2].f();
                        this.f11747i.f11698f = -this.b.W[3].f();
                    } else {
                        f fVarH = h(this.b.W[2]);
                        if (fVarH != null) {
                            b(this.f11746h, fVarH, this.b.W[2].f());
                        }
                        f fVarH2 = h(this.b.W[3]);
                        if (fVarH2 != null) {
                            b(this.f11747i, fVarH2, -this.b.W[3].f());
                        }
                        this.f11746h.b = true;
                        this.f11747i.b = true;
                    }
                    if (this.b.Z()) {
                        b(this.f11725k, this.f11746h, this.b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f11746h, fVarH3, this.b.W[2].f());
                        b(this.f11747i, this.f11746h, this.f11743e.f11699g);
                        if (this.b.Z()) {
                            b(this.f11725k, this.f11746h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                c2.d dVar3 = dVarArr[3];
                if (dVar3.f4640f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f11747i, fVarH4, -this.b.W[3].f());
                        b(this.f11746h, this.f11747i, -this.f11743e.f11699g);
                    }
                    if (this.b.Z()) {
                        b(this.f11725k, this.f11746h, this.b.p());
                        return;
                    }
                    return;
                }
                c2.d dVar4 = dVarArr[4];
                if (dVar4.f4640f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f11725k, fVarH5, 0);
                        b(this.f11746h, this.f11725k, -this.b.p());
                        b(this.f11747i, this.f11746h, this.f11743e.f11699g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c2.i) || eVar2.K() == null || this.b.o(c2.d.a.CENTER).f4640f != null) {
                    return;
                }
                b(this.f11746h, this.b.K().f4662f.f11746h, this.b.Y());
                b(this.f11747i, this.f11746h, this.f11743e.f11699g);
                if (this.b.Z()) {
                    b(this.f11725k, this.f11746h, this.b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f11742d != c2.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            c2.e eVar3 = this.b;
            int i10 = eVar3.f4698x;
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
            } else if (i10 == 3 && !eVar3.k0()) {
                c2.e eVar4 = this.b;
                if (eVar4.f4696w != 3) {
                    g gVar4 = eVar4.f4660e.f11743e;
                    this.f11743e.f11704l.add(gVar4);
                    gVar4.f11703k.add(this.f11743e);
                    g gVar5 = this.f11743e;
                    gVar5.b = true;
                    gVar5.f11703k.add(this.f11746h);
                    this.f11743e.f11703k.add(this.f11747i);
                }
            }
        }
        c2.e eVar5 = this.b;
        c2.d[] dVarArr2 = eVar5.W;
        c2.d dVar5 = dVarArr2[2];
        c2.d dVar6 = dVar5.f4640f;
        if (dVar6 != null && dVarArr2[3].f4640f != null) {
            if (eVar5.k0()) {
                this.f11746h.f11698f = this.b.W[2].f();
                this.f11747i.f11698f = -this.b.W[3].f();
            } else {
                f fVarH6 = h(this.b.W[2]);
                f fVarH7 = h(this.b.W[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f11748j = p.b.CENTER;
            }
            if (this.b.Z()) {
                c(this.f11725k, this.f11746h, 1, this.f11726l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f11746h, fVarH8, this.b.W[2].f());
                c(this.f11747i, this.f11746h, 1, this.f11743e);
                if (this.b.Z()) {
                    c(this.f11725k, this.f11746h, 1, this.f11726l);
                }
                c2.e.b bVar2 = this.f11742d;
                c2.e.b bVar3 = c2.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.v() > 0.0f) {
                    l lVar = this.b.f4660e;
                    if (lVar.f11742d == bVar3) {
                        lVar.f11743e.f11703k.add(this.f11743e);
                        this.f11743e.f11704l.add(this.b.f4660e.f11743e);
                        this.f11743e.f11694a = this;
                    }
                }
            }
        } else {
            c2.d dVar7 = dVarArr2[3];
            if (dVar7.f4640f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f11747i, fVarH9, -this.b.W[3].f());
                    c(this.f11746h, this.f11747i, -1, this.f11743e);
                    if (this.b.Z()) {
                        c(this.f11725k, this.f11746h, 1, this.f11726l);
                    }
                }
            } else {
                c2.d dVar8 = dVarArr2[4];
                if (dVar8.f4640f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f11725k, fVarH10, 0);
                        c(this.f11746h, this.f11725k, -1, this.f11726l);
                        c(this.f11747i, this.f11746h, 1, this.f11743e);
                    }
                } else if (!(eVar5 instanceof c2.i) && eVar5.K() != null) {
                    b(this.f11746h, this.b.K().f4662f.f11746h, this.b.Y());
                    c(this.f11747i, this.f11746h, 1, this.f11743e);
                    if (this.b.Z()) {
                        c(this.f11725k, this.f11746h, 1, this.f11726l);
                    }
                    c2.e.b bVar4 = this.f11742d;
                    c2.e.b bVar5 = c2.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.v() > 0.0f) {
                        l lVar2 = this.b.f4660e;
                        if (lVar2.f11742d == bVar5) {
                            lVar2.f11743e.f11703k.add(this.f11743e);
                            this.f11743e.f11704l.add(this.b.f4660e.f11743e);
                            this.f11743e.f11694a = this;
                        }
                    }
                }
            }
        }
        if (this.f11743e.f11704l.size() == 0) {
            this.f11743e.f11695c = true;
        }
    }

    @Override // d2.p
    public void e() {
        f fVar = this.f11746h;
        if (fVar.f11702j) {
            this.b.o1(fVar.f11699g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f11741c = null;
        this.f11746h.c();
        this.f11747i.c();
        this.f11725k.c();
        this.f11743e.c();
        this.f11745g = false;
    }

    @Override // d2.p
    public boolean m() {
        return this.f11742d != c2.e.b.MATCH_CONSTRAINT || this.b.f4698x == 0;
    }

    public void q() {
        this.f11745g = false;
        this.f11746h.c();
        this.f11746h.f11702j = false;
        this.f11747i.c();
        this.f11747i.f11702j = false;
        this.f11725k.c();
        this.f11725k.f11702j = false;
        this.f11743e.f11702j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.t();
    }
}
