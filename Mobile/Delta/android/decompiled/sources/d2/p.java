package d2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14375a;
    public c2.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f14376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2.e.b f14377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f14378e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14379f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14380g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f14381h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f14382i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f14383j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14384a;

        static {
            int[] iArr = new int[c2.d.a.values().length];
            f14384a = iArr;
            try {
                iArr[c2.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14384a[c2.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14384a[c2.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14384a[c2.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14384a[c2.d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(c2.e eVar) {
        this.b = eVar;
    }

    @Override // d2.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f14339l.add(fVar2);
        fVar.f14333f = i10;
        fVar2.f14338k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f14339l.add(fVar2);
        fVar.f14339l.add(this.f14378e);
        fVar.f14335h = i10;
        fVar.f14336i = gVar;
        fVar2.f14338k.add(fVar);
        gVar.f14338k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            c2.e eVar = this.b;
            int i12 = eVar.A;
            int iMax = Math.max(eVar.f4409z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            c2.e eVar2 = this.b;
            int i13 = eVar2.D;
            int iMax2 = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public final f h(c2.d dVar) {
        c2.d dVar2 = dVar.f4347f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4345d;
        int i10 = a.f14384a[dVar2.f4346e.ordinal()];
        if (i10 == 1) {
            return eVar.f4367e.f14381h;
        }
        if (i10 == 2) {
            return eVar.f4367e.f14382i;
        }
        if (i10 == 3) {
            return eVar.f4369f.f14381h;
        }
        if (i10 == 4) {
            return eVar.f4369f.f14360k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f4369f.f14382i;
    }

    public final f i(c2.d dVar, int i10) {
        c2.d dVar2 = dVar.f4347f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4345d;
        p pVar = i10 == 0 ? eVar.f4367e : eVar.f4369f;
        int i11 = a.f14384a[dVar2.f4346e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f14382i;
        }
        return pVar.f14381h;
    }

    public long j() {
        g gVar = this.f14378e;
        if (gVar.f14337j) {
            return gVar.f14334g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f14380g;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f14375a;
        if (i12 == 0) {
            this.f14378e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f14378e.d(Math.min(g(this.f14378e.f14348m, i10), i11));
            return;
        }
        if (i12 == 2) {
            c2.e eVarK = this.b.K();
            if (eVarK != null) {
                g gVar = (i10 == 0 ? eVarK.f4367e : eVarK.f4369f).f14378e;
                if (gVar.f14337j) {
                    this.f14378e.d(g((int) ((gVar.f14334g * (i10 == 0 ? this.b.B : this.b.E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        c2.e eVar = this.b;
        p pVar = eVar.f4367e;
        c2.e.b bVar = pVar.f14377d;
        c2.e.b bVar2 = c2.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f14375a == 3) {
            n nVar = eVar.f4369f;
            if (nVar.f14377d == bVar2 && nVar.f14375a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f4369f;
        }
        if (pVar.f14378e.f14337j) {
            float fV = eVar.v();
            this.f14378e.d(i10 == 1 ? (int) ((pVar.f14378e.f14334g / fV) + 0.5f) : (int) ((fV * pVar.f14378e.f14334g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, c2.d dVar2, c2.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f14337j && fVarH2.f14337j) {
            int iF = fVarH.f14334g + dVar2.f();
            int iF2 = fVarH2.f14334g - dVar3.f();
            int i11 = iF2 - iF;
            if (!this.f14378e.f14337j && this.f14377d == c2.e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f14378e;
            if (gVar.f14337j) {
                if (gVar.f14334g == i11) {
                    this.f14381h.d(iF);
                    this.f14382i.d(iF2);
                    return;
                }
                float fY = i10 == 0 ? this.b.y() : this.b.R();
                if (fVarH == fVarH2) {
                    iF = fVarH.f14334g;
                    iF2 = fVarH2.f14334g;
                    fY = 0.5f;
                }
                this.f14381h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f14378e.f14334g) * fY)));
                this.f14382i.d(this.f14381h.f14334g + this.f14378e.f14334g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
