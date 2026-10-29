package c2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public e[] f4455x1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f4432a1 = -1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f4433b1 = -1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f4434c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f4435d1 = -1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f4436e1 = -1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f4437f1 = -1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public float f4438g1 = 0.5f;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public float f4439h1 = 0.5f;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public float f4440i1 = 0.5f;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f4441j1 = 0.5f;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public float f4442k1 = 0.5f;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public float f4443l1 = 0.5f;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f4444m1 = 0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f4445n1 = 0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f4446o1 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f4447p1 = 2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f4448q1 = 0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f4449r1 = -1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f4450s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public ArrayList<a> f4451t1 = new ArrayList<>();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public e[] f4452u1 = null;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public e[] f4453v1 = null;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int[] f4454w1 = null;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f4456y1 = 0;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4457a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f4459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f4460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f4461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d f4462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4463h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4464i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f4465j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f4466k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f4472q;
        public e b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4458c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f4467l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4468m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f4469n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f4470o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f4471p = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f4463h = 0;
            this.f4464i = 0;
            this.f4465j = 0;
            this.f4466k = 0;
            this.f4472q = 0;
            this.f4457a = i10;
            this.f4459d = dVar;
            this.f4460e = dVar2;
            this.f4461f = dVar3;
            this.f4462g = dVar4;
            this.f4463h = g.this.A1();
            this.f4464i = g.this.C1();
            this.f4465j = g.this.B1();
            this.f4466k = g.this.z1();
            this.f4472q = i11;
        }

        public void b(e eVar) {
            if (this.f4457a == 0) {
                int iM2 = g.this.m2(eVar, this.f4472q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f4471p++;
                    iM2 = 0;
                }
                this.f4467l += iM2 + (eVar.V() != 8 ? g.this.f4444m1 : 0);
                int iL2 = g.this.l2(eVar, this.f4472q);
                if (this.b == null || this.f4458c < iL2) {
                    this.b = eVar;
                    this.f4458c = iL2;
                    this.f4468m = iL2;
                }
            } else {
                int iM3 = g.this.m2(eVar, this.f4472q);
                int iL3 = g.this.l2(eVar, this.f4472q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f4471p++;
                    iL3 = 0;
                }
                this.f4468m += iL3 + (eVar.V() != 8 ? g.this.f4445n1 : 0);
                if (this.b == null || this.f4458c < iM3) {
                    this.b = eVar;
                    this.f4458c = iM3;
                    this.f4467l = iM3;
                }
            }
            this.f4470o++;
        }

        public void c() {
            this.f4458c = 0;
            this.b = null;
            this.f4467l = 0;
            this.f4468m = 0;
            this.f4469n = 0;
            this.f4470o = 0;
            this.f4471p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f4470o;
            for (int i13 = 0; i13 < i12 && this.f4469n + i13 < g.this.f4456y1; i13++) {
                e eVar2 = g.this.f4455x1[this.f4469n + i13];
                if (eVar2 != null) {
                    eVar2.u0();
                }
            }
            if (i12 == 0 || this.b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f4469n + i17 >= g.this.f4456y1) {
                    break;
                }
                e eVar3 = g.this.f4455x1[this.f4469n + i17];
                if (eVar3 != null && eVar3.V() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar4 = null;
            if (this.f4457a != 0) {
                e eVar5 = this.b;
                eVar5.O0(g.this.f4432a1);
                int i18 = this.f4463h;
                if (i10 > 0) {
                    i18 += g.this.f4444m1;
                }
                if (z10) {
                    eVar5.Q.a(this.f4461f, i18);
                    if (z11) {
                        eVar5.O.a(this.f4459d, this.f4465j);
                    }
                    if (i10 > 0) {
                        this.f4461f.f4345d.O.a(eVar5.Q, 0);
                    }
                } else {
                    eVar5.O.a(this.f4459d, i18);
                    if (z11) {
                        eVar5.Q.a(this.f4461f, this.f4465j);
                    }
                    if (i10 > 0) {
                        this.f4459d.f4345d.Q.a(eVar5.O, 0);
                    }
                }
                for (int i19 = 0; i19 < i12 && this.f4469n + i19 < g.this.f4456y1; i19++) {
                    e eVar6 = g.this.f4455x1[this.f4469n + i19];
                    if (eVar6 != null) {
                        if (i19 == 0) {
                            eVar6.k(eVar6.P, this.f4460e, this.f4464i);
                            int i20 = g.this.f4433b1;
                            float f12 = g.this.f4439h1;
                            if (this.f4469n == 0 && g.this.f4435d1 != -1) {
                                i20 = g.this.f4435d1;
                                f12 = g.this.f4441j1;
                            } else if (z11 && g.this.f4437f1 != -1) {
                                i20 = g.this.f4437f1;
                                f12 = g.this.f4443l1;
                            }
                            eVar6.f1(i20);
                            eVar6.e1(f12);
                        }
                        if (i19 == i12 - 1) {
                            eVar6.k(eVar6.R, this.f4462g, this.f4466k);
                        }
                        if (eVar4 != null) {
                            eVar6.P.a(eVar4.R, g.this.f4445n1);
                            if (i19 == i14) {
                                eVar6.P.u(this.f4464i);
                            }
                            eVar4.R.a(eVar6.P, 0);
                            if (i19 == i15 + 1) {
                                eVar4.R.u(this.f4466k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z10) {
                                int i21 = g.this.f4446o1;
                                if (i21 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i21 == 1) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i21 == 2) {
                                    eVar6.O.a(eVar5.O, 0);
                                    eVar6.Q.a(eVar5.Q, 0);
                                }
                            } else {
                                int i22 = g.this.f4446o1;
                                if (i22 == 0) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i22 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i22 == 2) {
                                    if (z12) {
                                        eVar6.O.a(this.f4459d, this.f4463h);
                                        eVar6.Q.a(this.f4461f, this.f4465j);
                                    } else {
                                        eVar6.O.a(eVar5.O, 0);
                                        eVar6.Q.a(eVar5.Q, 0);
                                    }
                                }
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.b;
            eVar7.f1(g.this.f4433b1);
            int i23 = this.f4464i;
            if (i10 > 0) {
                i23 += g.this.f4445n1;
            }
            eVar7.P.a(this.f4460e, i23);
            if (z11) {
                eVar7.R.a(this.f4462g, this.f4466k);
            }
            if (i10 > 0) {
                this.f4460e.f4345d.R.a(eVar7.P, 0);
            }
            char c11 = 3;
            if (g.this.f4447p1 != 3 || eVar7.Z()) {
                eVar = eVar7;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i12) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f4469n + i25 < g.this.f4456y1) {
                        eVar = g.this.f4455x1[this.f4469n + i25];
                        if (eVar.Z()) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                eVar = eVar7;
                break;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f4469n + i27 >= g.this.f4456y1) {
                    return;
                }
                e eVar8 = g.this.f4455x1[this.f4469n + i27];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c10 = c11;
                } else {
                    if (i26 == 0) {
                        i11 = 1;
                        eVar8.k(eVar8.O, this.f4459d, this.f4463h);
                    } else {
                        i11 = 1;
                    }
                    if (i27 == 0) {
                        int i28 = g.this.f4432a1;
                        float f13 = g.this.f4438g1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f4469n == 0 && g.this.f4434c1 != -1) {
                            i28 = g.this.f4434c1;
                            if (z10) {
                                f11 = g.this.f4440i1;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = g.this.f4440i1;
                            }
                            f13 = f10;
                        } else if (z11 && g.this.f4436e1 != -1) {
                            i28 = g.this.f4436e1;
                            if (z10) {
                                f11 = g.this.f4442k1;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = g.this.f4442k1;
                            }
                            f13 = f10;
                        }
                        eVar8.O0(i28);
                        eVar8.N0(f13);
                    }
                    if (i26 == i12 - 1) {
                        eVar8.k(eVar8.Q, this.f4461f, this.f4465j);
                    }
                    if (eVar4 != null) {
                        eVar8.O.a(eVar4.Q, g.this.f4444m1);
                        if (i26 == i14) {
                            eVar8.O.u(this.f4463h);
                        }
                        eVar4.Q.a(eVar8.O, 0);
                        if (i26 == i15 + 1) {
                            eVar4.Q.u(this.f4465j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c10 = 3;
                        if (g.this.f4447p1 == 3 && eVar.Z() && eVar8 != eVar && eVar8.Z()) {
                            eVar8.S.a(eVar.S, 0);
                        } else {
                            int i29 = g.this.f4447p1;
                            if (i29 == 0) {
                                eVar8.P.a(eVar7.P, 0);
                            } else if (i29 == i11) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (z12) {
                                eVar8.P.a(this.f4460e, this.f4464i);
                                eVar8.R.a(this.f4462g, this.f4466k);
                            } else {
                                eVar8.P.a(eVar7.P, 0);
                                eVar8.R.a(eVar7.R, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i26++;
                c11 = c10;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f4457a == 1 ? this.f4468m - g.this.f4445n1 : this.f4468m;
        }

        public int f() {
            return this.f4457a == 0 ? this.f4467l - g.this.f4444m1 : this.f4467l;
        }

        public void g(int i10) {
            int i11 = this.f4471p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f4470o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f4469n + i14 < g.this.f4456y1; i14++) {
                e eVar = g.this.f4455x1[this.f4469n + i14];
                if (this.f4457a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f4403w == 0) {
                        g.this.E1(eVar, e.b.FIXED, i13, eVar.T(), eVar.x());
                    }
                } else if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f4405x == 0) {
                    int i15 = i13;
                    g.this.E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public final void h() {
            this.f4467l = 0;
            this.f4468m = 0;
            this.b = null;
            this.f4458c = 0;
            int i10 = this.f4470o;
            for (int i11 = 0; i11 < i10 && this.f4469n + i11 < g.this.f4456y1; i11++) {
                e eVar = g.this.f4455x1[this.f4469n + i11];
                if (this.f4457a == 0) {
                    int iW = eVar.W();
                    int i12 = g.this.f4444m1;
                    if (eVar.V() == 8) {
                        i12 = 0;
                    }
                    this.f4467l += iW + i12;
                    int iL2 = g.this.l2(eVar, this.f4472q);
                    if (this.b == null || this.f4458c < iL2) {
                        this.b = eVar;
                        this.f4458c = iL2;
                        this.f4468m = iL2;
                    }
                } else {
                    int iM2 = g.this.m2(eVar, this.f4472q);
                    int iL3 = g.this.l2(eVar, this.f4472q);
                    int i13 = g.this.f4445n1;
                    if (eVar.V() == 8) {
                        i13 = 0;
                    }
                    this.f4468m += iL3 + i13;
                    if (this.b == null || this.f4458c < iM2) {
                        this.b = eVar;
                        this.f4458c = iM2;
                        this.f4467l = iM2;
                    }
                }
            }
        }

        public void i(int i10) {
            this.f4469n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f4457a = i10;
            this.f4459d = dVar;
            this.f4460e = dVar2;
            this.f4461f = dVar3;
            this.f4462g = dVar4;
            this.f4463h = i11;
            this.f4464i = i12;
            this.f4465j = i13;
            this.f4466k = i14;
            this.f4472q = i15;
        }
    }

    public void A2(int i10) {
        this.f4436e1 = i10;
    }

    public void B2(float f10) {
        this.f4443l1 = f10;
    }

    public void C2(int i10) {
        this.f4437f1 = i10;
    }

    @Override // c2.l
    public void D1(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.M0 > 0 && !F1()) {
            I1(0, 0);
            H1(false);
            return;
        }
        int iA1 = A1();
        int iB1 = B1();
        int iC1 = C1();
        int iZ1 = z1();
        int[] iArr = new int[2];
        int i15 = (i11 - iA1) - iB1;
        int i16 = this.f4450s1;
        if (i16 == 1) {
            i15 = (i13 - iC1) - iZ1;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f4432a1 == -1) {
                this.f4432a1 = 0;
            }
            if (this.f4433b1 == -1) {
                this.f4433b1 = 0;
            }
        } else {
            if (this.f4432a1 == -1) {
                this.f4432a1 = 0;
            }
            if (this.f4433b1 == -1) {
                this.f4433b1 = 0;
            }
        }
        e[] eVarArr2 = this.L0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.M0;
            if (i18 >= i14) {
                break;
            }
            if (this.L0[i18].V() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.M0) {
                e eVar = this.L0[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.V() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.f4455x1 = eVarArr;
        this.f4456y1 = i21;
        int i22 = this.f4448q1;
        if (i22 == 0) {
            q2(eVarArr, i21, this.f4450s1, i17, iArr);
        } else if (i22 == 1) {
            o2(eVarArr, i21, this.f4450s1, i17, iArr);
        } else if (i22 == 2) {
            n2(eVarArr, i21, this.f4450s1, i17, iArr);
        } else if (i22 == 3) {
            p2(eVarArr, i21, this.f4450s1, i17, iArr);
        }
        int iMin = iArr[0] + iA1 + iB1;
        int iMin2 = iArr[1] + iC1 + iZ1;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        I1(iMin, iMin2);
        l1(iMin);
        M0(iMin2);
        H1(this.M0 > 0);
    }

    public void D2(int i10) {
        this.f4449r1 = i10;
    }

    public void E2(int i10) {
        this.f4450s1 = i10;
    }

    public void F2(int i10) {
        this.f4447p1 = i10;
    }

    public void G2(float f10) {
        this.f4439h1 = f10;
    }

    public void H2(int i10) {
        this.f4445n1 = i10;
    }

    public void I2(int i10) {
        this.f4433b1 = i10;
    }

    public void J2(int i10) {
        this.f4448q1 = i10;
    }

    @Override // c2.e
    public void g(z1.d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = K() != null && ((f) K()).R1();
        int i10 = this.f4448q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f4451t1.size();
                int i11 = 0;
                while (i11 < size) {
                    this.f4451t1.get(i11).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                k2(z11);
            } else if (i10 == 3) {
                int size2 = this.f4451t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    this.f4451t1.get(i12).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f4451t1.size() > 0) {
            this.f4451t1.get(0).d(z11, 0, true);
        }
        H1(false);
    }

    public final void k2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f4454w1 == null || this.f4453v1 == null || this.f4452u1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f4456y1; i11++) {
            this.f4455x1[i11].u0();
        }
        int[] iArr = this.f4454w1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f4438g1;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f4438g1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.f4453v1[i10];
            if (eVar3 != null && eVar3.V() != 8) {
                if (i14 == 0) {
                    eVar3.k(eVar3.O, this.O, A1());
                    eVar3.O0(this.f4432a1);
                    eVar3.N0(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.k(eVar3.Q, this.Q, B1());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.O, eVar2.Q, this.f4444m1);
                    eVar2.k(eVar2.Q, eVar3.O, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.f4452u1[i15];
            if (eVar4 != null && eVar4.V() != 8) {
                if (i15 == 0) {
                    eVar4.k(eVar4.P, this.P, C1());
                    eVar4.f1(this.f4433b1);
                    eVar4.e1(this.f4439h1);
                }
                if (i15 == i13 - 1) {
                    eVar4.k(eVar4.R, this.R, z1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.P, eVar2.R, this.f4445n1);
                    eVar2.k(eVar2.R, eVar4.P, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f4450s1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.f4455x1;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.V() != 8) {
                    e eVar5 = this.f4453v1[i16];
                    e eVar6 = this.f4452u1[i17];
                    if (eVar != eVar5) {
                        eVar.k(eVar.O, eVar5.O, 0);
                        eVar.k(eVar.Q, eVar5.Q, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.P, eVar6.P, 0);
                        eVar.k(eVar.R, eVar6.R, 0);
                    }
                }
            }
        }
    }

    public final int l2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f4405x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.E * i10);
                if (i12 != eVar.x()) {
                    eVar.Z0(true);
                    E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.x();
            }
            if (i11 == 3) {
                return (int) ((eVar2.W() * eVar2.f4366d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.x();
    }

    public final int m2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f4403w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.B * i10);
                if (i12 != eVar.W()) {
                    eVar.Z0(true);
                    E1(eVar, e.b.FIXED, i12, eVar.T(), eVar.x());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.W();
            }
            if (i11 == 3) {
                return (int) ((eVar2.x() * eVar2.f4366d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.W();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void n2(c2.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g.n2(c2.e[], int, int, int, int[]):void");
    }

    public final void o2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f4451t1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
        gVar2.f4451t1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iM2 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f4444m1 + i17) + iM2 > i16) && aVar.b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.f4449r1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    aVar.i(i18);
                    gVar2.f4451t1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += gVar2.f4444m1 + iM2;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iM2;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iL2 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f4445n1 + i20) + iL2 > i16) && aVar.b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.f4449r1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f4451t1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f4445n1 + iL2;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    gVar2 = gVar;
                }
                i20 = iL2;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f4451t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int iA1 = gVar3.A1();
        int iC1 = gVar3.C1();
        int iB1 = gVar3.B1();
        int iZ1 = gVar3.z1();
        e.b bVarA = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarA == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = gVar3.f4451t1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iZ2 = iZ1;
        int i24 = 0;
        int iB2 = iB1;
        int i25 = iC1;
        int i26 = iA1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = gVar3.f4451t1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = gVar3.f4451t1.get(i28 + 1).b.P;
                    iZ2 = 0;
                } else {
                    dVar7 = gVar3.R;
                    iZ2 = gVar3.z1();
                }
                d dVar10 = aVar3.b.R;
                int i29 = i27;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iB2, iZ2, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += gVar3.f4445n1;
                }
                i27 = iE;
                i24 = iMax;
                dVar9 = dVar10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    dVar = gVar3.f4451t1.get(i28 + 1).b.O;
                    iB2 = 0;
                } else {
                    dVar = gVar3.Q;
                    iB2 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.b.Q;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iB2, iZ2, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += gVar3.f4444m1;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    public final void p2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f4451t1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
        gVar2.f4451t1.add(aVar);
        boolean z10 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int iM2 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z11 = (i18 == i16 || (gVar2.f4444m1 + i18) + iM2 > i16) && aVar.b != null;
                if (!z11 && i19 > 0 && (i15 = gVar2.f4449r1) > 0 && i17 > i15) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    aVar.i(i19);
                    gVar2.f4451t1.add(aVar);
                    i17 = 1;
                } else {
                    if (i19 > 0) {
                        i18 += gVar2.f4444m1 + iM2;
                    }
                    aVar.b(eVar);
                    i19++;
                    i13 = i20;
                }
                i18 = iM2;
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int iL2 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z12 = (i22 == i16 || (gVar2.f4445n1 + i22) + iL2 > i16) && aVar.b != null;
                if (!z12 && i23 > 0 && (i14 = gVar2.f4449r1) > 0 && i21 > i14) {
                    z12 = true;
                }
                if (z12) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    gVar = gVar2;
                    aVar.i(i23);
                    gVar.f4451t1.add(aVar);
                    i21 = 1;
                } else {
                    gVar = gVar2;
                    if (i23 > 0) {
                        i22 += gVar.f4445n1 + iL2;
                    }
                    aVar.b(eVar2);
                    i23++;
                    i16 = i12;
                    i13 = i24;
                    gVar2 = gVar;
                }
                i22 = iL2;
                aVar.b(eVar2);
                i23++;
                i16 = i12;
                i13 = i24;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f4451t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int iA1 = gVar3.A1();
        int iC1 = gVar3.C1();
        int iB1 = gVar3.B1();
        int iZ1 = gVar3.z1();
        e.b bVarA = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z13 = bVarA == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z13) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = gVar3.f4451t1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int iZ2 = iZ1;
        int i26 = 0;
        int i27 = 0;
        int iB2 = iB1;
        int i28 = iC1;
        int i29 = iA1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i30 = 0;
        while (i27 < size) {
            a aVar3 = gVar3.f4451t1.get(i27);
            if (i11 == 0) {
                if (i27 < size - 1) {
                    dVar7 = gVar3.f4451t1.get(i27 + 1).b.P;
                    iZ2 = 0;
                } else {
                    dVar7 = gVar3.R;
                    iZ2 = gVar3.z1();
                }
                d dVar10 = aVar3.b.R;
                int i31 = i26;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i29, i28, iB2, iZ2, i12);
                int iMax = Math.max(i30, aVar3.f());
                int iE = aVar3.e() + i31;
                if (i27 > 0) {
                    iE += gVar3.f4445n1;
                }
                i26 = iE;
                i30 = iMax;
                dVar6 = dVar10;
                i28 = 0;
            } else {
                int i32 = i26;
                int i33 = i30;
                if (i27 < size - 1) {
                    dVar = gVar3.f4451t1.get(i27 + 1).b.O;
                    iB2 = 0;
                } else {
                    dVar = gVar3.Q;
                    iB2 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.b.Q;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i29, i28, iB2, iZ2, i12);
                int iF = aVar3.f() + i33;
                int iMax2 = Math.max(i32, aVar3.e());
                if (i27 > 0) {
                    iF += gVar3.f4444m1;
                }
                int i34 = iF;
                i26 = iMax2;
                i30 = i34;
                i29 = 0;
                dVar9 = dVar11;
            }
            i27++;
            z10 = z10;
        }
        iArr[0] = i30;
        iArr[z10 ? 1 : 0] = i26;
    }

    public final void q2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f4451t1.size() == 0) {
            aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
            this.f4451t1.add(aVar);
        } else {
            a aVar2 = this.f4451t1.get(0);
            aVar2.c();
            aVar2.j(i11, this.O, this.P, this.Q, this.R, A1(), C1(), B1(), z1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void r2(float f10) {
        this.f4440i1 = f10;
    }

    public void s2(int i10) {
        this.f4434c1 = i10;
    }

    public void t2(float f10) {
        this.f4441j1 = f10;
    }

    public void u2(int i10) {
        this.f4435d1 = i10;
    }

    public void v2(int i10) {
        this.f4446o1 = i10;
    }

    public void w2(float f10) {
        this.f4438g1 = f10;
    }

    public void x2(int i10) {
        this.f4444m1 = i10;
    }

    public void y2(int i10) {
        this.f4432a1 = i10;
    }

    public void z2(float f10) {
        this.f4442k1 = f10;
    }
}
