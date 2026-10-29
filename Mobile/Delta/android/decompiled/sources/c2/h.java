package c2;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {
    public float L0 = -1.0f;
    public int M0 = -1;
    public int N0 = -1;
    public boolean O0 = true;
    public d P0 = this.P;
    public int Q0 = 0;
    public int R0 = 0;
    public boolean S0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4474a;

        static {
            int[] iArr = new int[d.a.values().length];
            f4474a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4474a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4474a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4474a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4474a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4474a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4474a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4474a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4474a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.W[i10] = this.P0;
        }
    }

    public void A1(float f10) {
        if (f10 > -1.0f) {
            this.L0 = f10;
            this.M0 = -1;
            this.N0 = -1;
        }
    }

    public void B1(int i10) {
        if (this.Q0 == i10) {
            return;
        }
        this.Q0 = i10;
        this.X.clear();
        if (this.Q0 == 1) {
            this.P0 = this.O;
        } else {
            this.P0 = this.P;
        }
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.W[i11] = this.P0;
        }
    }

    @Override // c2.e
    public void g(z1.d dVar, boolean z10) {
        f fVar = (f) K();
        if (fVar == null) {
            return;
        }
        d dVarO = fVar.o(d.a.LEFT);
        d dVarO2 = fVar.o(d.a.RIGHT);
        e eVar = this.f4361a0;
        boolean z11 = eVar != null && eVar.Z[0] == e.b.WRAP_CONTENT;
        if (this.Q0 == 0) {
            dVarO = fVar.o(d.a.TOP);
            dVarO2 = fVar.o(d.a.BOTTOM);
            e eVar2 = this.f4361a0;
            z11 = eVar2 != null && eVar2.Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.S0 && this.P0.n()) {
            z1.i iVarQ = dVar.q(this.P0);
            dVar.f(iVarQ, this.P0.e());
            if (this.M0 != -1) {
                if (z11) {
                    dVar.h(dVar.q(dVarO2), iVarQ, 0, 5);
                }
            } else if (this.N0 != -1 && z11) {
                z1.i iVarQ2 = dVar.q(dVarO2);
                dVar.h(iVarQ, dVar.q(dVarO), 0, 5);
                dVar.h(iVarQ2, iVarQ, 0, 5);
            }
            this.S0 = false;
            return;
        }
        if (this.M0 != -1) {
            z1.i iVarQ3 = dVar.q(this.P0);
            dVar.e(iVarQ3, dVar.q(dVarO), this.M0, 8);
            if (z11) {
                dVar.h(dVar.q(dVarO2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.N0 == -1) {
            if (this.L0 != -1.0f) {
                dVar.d(z1.d.s(dVar, dVar.q(this.P0), dVar.q(dVarO2), this.L0));
                return;
            }
            return;
        }
        z1.i iVarQ4 = dVar.q(this.P0);
        z1.i iVarQ5 = dVar.q(dVarO2);
        dVar.e(iVarQ4, iVarQ5, -this.N0, 8);
        if (z11) {
            dVar.h(iVarQ4, dVar.q(dVarO), 0, 5);
            dVar.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // c2.e
    public boolean h() {
        return true;
    }

    @Override // c2.e
    public boolean n0() {
        return this.S0;
    }

    @Override // c2.e
    public d o(d.a aVar) {
        int i10 = a.f4474a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.Q0 == 0) {
            return this.P0;
        }
        return null;
    }

    @Override // c2.e
    public boolean o0() {
        return this.S0;
    }

    @Override // c2.e
    public void r1(z1.d dVar, boolean z10) {
        if (K() == null) {
            return;
        }
        int iY = dVar.y(this.P0);
        if (this.Q0 == 1) {
            n1(iY);
            o1(0);
            M0(K().x());
            l1(0);
            return;
        }
        n1(0);
        o1(iY);
        l1(K().W());
        M0(0);
    }

    public d s1() {
        return this.P0;
    }

    public int t1() {
        return this.Q0;
    }

    public int u1() {
        return this.M0;
    }

    public int v1() {
        return this.N0;
    }

    public float w1() {
        return this.L0;
    }

    public void x1(int i10) {
        this.P0.t(i10);
        this.S0 = true;
    }

    public void y1(int i10) {
        if (i10 > -1) {
            this.L0 = -1.0f;
            this.M0 = i10;
            this.N0 = -1;
        }
    }

    public void z1(int i10) {
        if (i10 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i10;
        }
    }
}
