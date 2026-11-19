package d2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11740a;
    public c2.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f11741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2.e.b f11742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f11743e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11744f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11745g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f11746h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f11747i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f11748j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11749a;

        static {
            int[] iArr = new int[c2.d.a.values().length];
            f11749a = iArr;
            try {
                iArr[c2.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11749a[c2.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11749a[c2.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11749a[c2.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11749a[c2.d.a.BOTTOM.ordinal()] = 5;
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
        fVar.f11704l.add(fVar2);
        fVar.f11698f = i10;
        fVar2.f11703k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f11704l.add(fVar2);
        fVar.f11704l.add(this.f11743e);
        fVar.f11700h = i10;
        fVar.f11701i = gVar;
        fVar2.f11703k.add(fVar);
        gVar.f11703k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            c2.e eVar = this.b;
            int i12 = eVar.A;
            int iMax = Math.max(eVar.f4702z, i10);
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
        c2.d dVar2 = dVar.f4640f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4638d;
        int i10 = a.f11749a[dVar2.f4639e.ordinal()];
        if (i10 == 1) {
            return eVar.f4660e.f11746h;
        }
        if (i10 == 2) {
            return eVar.f4660e.f11747i;
        }
        if (i10 == 3) {
            return eVar.f4662f.f11746h;
        }
        if (i10 == 4) {
            return eVar.f4662f.f11725k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f4662f.f11747i;
    }

    public final f i(c2.d dVar, int i10) {
        c2.d dVar2 = dVar.f4640f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4638d;
        p pVar = i10 == 0 ? eVar.f4660e : eVar.f4662f;
        int i11 = a.f11749a[dVar2.f4639e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f11747i;
        }
        return pVar.f11746h;
    }

    public long j() {
        g gVar = this.f11743e;
        if (gVar.f11702j) {
            return gVar.f11699g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f11745g;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f11740a;
        if (i12 == 0) {
            this.f11743e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f11743e.d(Math.min(g(this.f11743e.f11713m, i10), i11));
            return;
        }
        if (i12 == 2) {
            c2.e eVarK = this.b.K();
            if (eVarK != null) {
                g gVar = (i10 == 0 ? eVarK.f4660e : eVarK.f4662f).f11743e;
                if (gVar.f11702j) {
                    this.f11743e.d(g((int) ((gVar.f11699g * (i10 == 0 ? this.b.B : this.b.E)) + 0.5f), i10));
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
        p pVar = eVar.f4660e;
        c2.e.b bVar = pVar.f11742d;
        c2.e.b bVar2 = c2.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f11740a == 3) {
            n nVar = eVar.f4662f;
            if (nVar.f11742d == bVar2 && nVar.f11740a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f4662f;
        }
        if (pVar.f11743e.f11702j) {
            float fV = eVar.v();
            this.f11743e.d(i10 == 1 ? (int) ((pVar.f11743e.f11699g / fV) + 0.5f) : (int) ((fV * pVar.f11743e.f11699g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, c2.d dVar2, c2.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f11702j && fVarH2.f11702j) {
            int iF = fVarH.f11699g + dVar2.f();
            int iF2 = fVarH2.f11699g - dVar3.f();
            int i11 = iF2 - iF;
            if (!this.f11743e.f11702j && this.f11742d == c2.e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f11743e;
            if (gVar.f11702j) {
                if (gVar.f11699g == i11) {
                    this.f11746h.d(iF);
                    this.f11747i.d(iF2);
                    return;
                }
                float fY = i10 == 0 ? this.b.y() : this.b.R();
                if (fVarH == fVarH2) {
                    iF = fVarH.f11699g;
                    iF2 = fVarH2.f11699g;
                    fY = 0.5f;
                }
                this.f11746h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f11743e.f11699g) * fY)));
                this.f11747i.d(this.f11746h.f11699g + this.f11743e.f11699g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
