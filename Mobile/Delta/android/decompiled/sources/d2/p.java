package d2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14355a;
    public c2.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f14356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2.e.b f14357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f14358e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14359f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14360g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f14361h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f14362i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f14363j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14364a;

        static {
            int[] iArr = new int[c2.d.a.values().length];
            f14364a = iArr;
            try {
                iArr[c2.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14364a[c2.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14364a[c2.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14364a[c2.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14364a[c2.d.a.BOTTOM.ordinal()] = 5;
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
        fVar.f14319l.add(fVar2);
        fVar.f14313f = i10;
        fVar2.f14318k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f14319l.add(fVar2);
        fVar.f14319l.add(this.f14358e);
        fVar.f14315h = i10;
        fVar.f14316i = gVar;
        fVar2.f14318k.add(fVar);
        gVar.f14318k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            c2.e eVar = this.b;
            int i12 = eVar.A;
            int iMax = Math.max(eVar.f4575z, i10);
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
        c2.d dVar2 = dVar.f4513f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4511d;
        int i10 = a.f14364a[dVar2.f4512e.ordinal()];
        if (i10 == 1) {
            return eVar.f4533e.f14361h;
        }
        if (i10 == 2) {
            return eVar.f4533e.f14362i;
        }
        if (i10 == 3) {
            return eVar.f4535f.f14361h;
        }
        if (i10 == 4) {
            return eVar.f4535f.f14340k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f4535f.f14362i;
    }

    public final f i(c2.d dVar, int i10) {
        c2.d dVar2 = dVar.f4513f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4511d;
        p pVar = i10 == 0 ? eVar.f4533e : eVar.f4535f;
        int i11 = a.f14364a[dVar2.f4512e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f14362i;
        }
        return pVar.f14361h;
    }

    public long j() {
        g gVar = this.f14358e;
        if (gVar.f14317j) {
            return gVar.f14314g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f14360g;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f14355a;
        if (i12 == 0) {
            this.f14358e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f14358e.d(Math.min(g(this.f14358e.f14328m, i10), i11));
            return;
        }
        if (i12 == 2) {
            c2.e eVarK = this.b.K();
            if (eVarK != null) {
                g gVar = (i10 == 0 ? eVarK.f4533e : eVarK.f4535f).f14358e;
                if (gVar.f14317j) {
                    this.f14358e.d(g((int) ((gVar.f14314g * (i10 == 0 ? this.b.B : this.b.E)) + 0.5f), i10));
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
        p pVar = eVar.f4533e;
        c2.e.b bVar = pVar.f14357d;
        c2.e.b bVar2 = c2.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f14355a == 3) {
            n nVar = eVar.f4535f;
            if (nVar.f14357d == bVar2 && nVar.f14355a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f4535f;
        }
        if (pVar.f14358e.f14317j) {
            float fV = eVar.v();
            this.f14358e.d(i10 == 1 ? (int) ((pVar.f14358e.f14314g / fV) + 0.5f) : (int) ((fV * pVar.f14358e.f14314g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, c2.d dVar2, c2.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f14317j && fVarH2.f14317j) {
            int iF = fVarH.f14314g + dVar2.f();
            int iF2 = fVarH2.f14314g - dVar3.f();
            int i11 = iF2 - iF;
            if (!this.f14358e.f14317j && this.f14357d == c2.e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f14358e;
            if (gVar.f14317j) {
                if (gVar.f14314g == i11) {
                    this.f14361h.d(iF);
                    this.f14362i.d(iF2);
                    return;
                }
                float fY = i10 == 0 ? this.b.y() : this.b.R();
                if (fVarH == fVarH2) {
                    iF = fVarH.f14314g;
                    iF2 = fVarH2.f14314g;
                    fY = 0.5f;
                }
                this.f14361h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f14358e.f14314g) * fY)));
                this.f14362i.d(this.f14361h.f14314g + this.f14358e.f14314g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
