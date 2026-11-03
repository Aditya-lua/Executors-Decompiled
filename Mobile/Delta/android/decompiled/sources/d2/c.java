package d2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<p> f14299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14300l;

    public c(c2.e eVar, int i10) {
        super(eVar);
        this.f14299k = new ArrayList<>();
        this.f14359f = i10;
        q();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // d2.p, d2.d
    public void a(d dVar) {
        int i10;
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        if (this.f14361h.f14317j && this.f14362i.f14317j) {
            c2.e eVarK = this.b.K();
            boolean zR1 = eVarK instanceof c2.f ? ((c2.f) eVarK).R1() : false;
            int i20 = this.f14362i.f14314g - this.f14361h.f14314g;
            int size = this.f14299k.size();
            int i21 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i21 >= size) {
                    i21 = -1;
                    break;
                } else if (this.f14299k.get(i21).b.V() != 8) {
                    break;
                } else {
                    i21++;
                }
            }
            int i22 = size - 1;
            for (int i23 = i22; i23 >= 0; i23--) {
                if (this.f14299k.get(i23).b.V() != 8) {
                    i10 = i23;
                    break;
                }
            }
            int i24 = 0;
            while (true) {
                if (i24 >= 2) {
                    z10 = zR1;
                    f10 = 0.0f;
                    f11 = 0.0f;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    break;
                }
                int i25 = 0;
                i13 = 0;
                i14 = 0;
                int i26 = 0;
                f11 = 0.0f;
                while (i25 < size) {
                    p pVar = this.f14299k.get(i25);
                    if (pVar.b.V() == i11) {
                        z11 = zR1;
                    } else {
                        i26++;
                        if (i25 > 0 && i25 >= i21) {
                            i13 += pVar.f14361h.f14313f;
                        }
                        g gVar = pVar.f14358e;
                        int i27 = gVar.f14314g;
                        boolean z12 = pVar.f14357d != c2.e.b.MATCH_CONSTRAINT;
                        if (z12) {
                            int i28 = this.f14359f;
                            if (i28 == 0 && !pVar.b.f4533e.f14358e.f14317j) {
                                return;
                            }
                            if (i28 == 1 && !pVar.b.f4535f.f14358e.f14317j) {
                                return;
                            } else {
                                z11 = zR1;
                            }
                        } else {
                            z11 = zR1;
                            if (pVar.f14355a == 1 && i24 == 0) {
                                i27 = gVar.f14328m;
                                i14++;
                            } else if (gVar.f14317j) {
                            }
                            z12 = true;
                        }
                        if (z12) {
                            i13 += i27;
                        } else {
                            i14++;
                            float f13 = pVar.b.D0[this.f14359f];
                            if (f13 >= 0.0f) {
                                f11 += f13;
                            }
                        }
                        if (i25 < i22 && i25 < i10) {
                            i13 += -pVar.f14362i.f14313f;
                        }
                    }
                    i25++;
                    zR1 = z11;
                    i11 = 8;
                }
                z10 = zR1;
                f10 = 0.0f;
                if (i13 < i20 || i14 == 0) {
                    i12 = i26;
                    break;
                } else {
                    i24++;
                    zR1 = z10;
                    i11 = 8;
                }
            }
            int i29 = this.f14361h.f14314g;
            if (z10) {
                i29 = this.f14362i.f14314g;
            }
            float f14 = 0.5f;
            if (i13 > i20) {
                i29 = z10 ? i29 + ((int) (((i13 - i20) / 2.0f) + 0.5f)) : i29 - ((int) (((i13 - i20) / 2.0f) + 0.5f));
            }
            if (i14 > 0) {
                float f15 = i20 - i13;
                int i30 = (int) ((f15 / i14) + 0.5f);
                int i31 = 0;
                int i32 = 0;
                while (i31 < size) {
                    p pVar2 = this.f14299k.get(i31);
                    float f16 = f14;
                    int i33 = i29;
                    if (pVar2.b.V() != 8 && pVar2.f14357d == c2.e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f14358e;
                        if (gVar2.f14317j) {
                            i30 = i30;
                            i32 = i32;
                        } else {
                            int i34 = f11 > f10 ? (int) (((pVar2.b.D0[this.f14359f] * f15) / f11) + f16) : i30;
                            if (this.f14359f == 0) {
                                c2.e eVar = pVar2.b;
                                i18 = eVar.A;
                                i19 = eVar.f4575z;
                            } else {
                                c2.e eVar2 = pVar2.b;
                                i18 = eVar2.D;
                                i19 = eVar2.C;
                            }
                            int i35 = i32;
                            int iMax = Math.max(i19, pVar2.f14355a == 1 ? Math.min(i34, gVar2.f14328m) : i34);
                            if (i18 > 0) {
                                iMax = Math.min(i18, iMax);
                            }
                            if (iMax != i34) {
                                i32 = i35 + 1;
                                i34 = iMax;
                            } else {
                                i32 = i35;
                            }
                            pVar2.f14358e.d(i34);
                        }
                    } else {
                        i30 = i30;
                        i32 = i32;
                    }
                    i31++;
                    f14 = f16;
                    i29 = i33;
                    f15 = f15;
                    i30 = i30;
                }
                i15 = i29;
                f12 = f14;
                int i36 = i32;
                if (i36 > 0) {
                    i14 -= i36;
                    i13 = 0;
                    for (int i37 = 0; i37 < size; i37++) {
                        p pVar3 = this.f14299k.get(i37);
                        if (pVar3.b.V() != 8) {
                            if (i37 > 0 && i37 >= i21) {
                                i13 += pVar3.f14361h.f14313f;
                            }
                            i13 += pVar3.f14358e.f14314g;
                            if (i37 < i22 && i37 < i10) {
                                i13 += -pVar3.f14362i.f14313f;
                            }
                        }
                    }
                }
                i17 = 2;
                if (this.f14300l == 2 && i36 == 0) {
                    i16 = 0;
                    this.f14300l = 0;
                } else {
                    i16 = 0;
                }
            } else {
                i15 = i29;
                f12 = 0.5f;
                i16 = 0;
                i17 = 2;
            }
            if (i13 > i20) {
                this.f14300l = i17;
            }
            if (i12 > 0 && i14 == 0 && i21 == i10) {
                this.f14300l = i17;
            }
            int i38 = this.f14300l;
            if (i38 == 1) {
                int i39 = i12 > 1 ? (i20 - i13) / (i12 - 1) : i12 == 1 ? (i20 - i13) / 2 : i16;
                if (i14 > 0) {
                    i39 = i16;
                }
                int i40 = i15;
                while (i16 < size) {
                    p pVar4 = this.f14299k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar4.b.V() == 8) {
                        pVar4.f14361h.d(i40);
                        pVar4.f14362i.d(i40);
                    } else {
                        if (i16 > 0) {
                            i40 = z10 ? i40 - i39 : i40 + i39;
                        }
                        if (i16 > 0 && i16 >= i21) {
                            i40 = z10 ? i40 - pVar4.f14361h.f14313f : i40 + pVar4.f14361h.f14313f;
                        }
                        if (z10) {
                            pVar4.f14362i.d(i40);
                        } else {
                            pVar4.f14361h.d(i40);
                        }
                        g gVar3 = pVar4.f14358e;
                        int i41 = gVar3.f14314g;
                        if (pVar4.f14357d == c2.e.b.MATCH_CONSTRAINT && pVar4.f14355a == 1) {
                            i41 = gVar3.f14328m;
                        }
                        i40 = z10 ? i40 - i41 : i40 + i41;
                        if (z10) {
                            pVar4.f14361h.d(i40);
                        } else {
                            pVar4.f14362i.d(i40);
                        }
                        pVar4.f14360g = true;
                        if (i16 < i22 && i16 < i10) {
                            i40 = z10 ? i40 - (-pVar4.f14362i.f14313f) : i40 + (-pVar4.f14362i.f14313f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i38 == 0) {
                int i42 = (i20 - i13) / (i12 + 1);
                if (i14 > 0) {
                    i42 = i16;
                }
                int i43 = i15;
                while (i16 < size) {
                    p pVar5 = this.f14299k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar5.b.V() == 8) {
                        pVar5.f14361h.d(i43);
                        pVar5.f14362i.d(i43);
                    } else {
                        int i44 = z10 ? i43 - i42 : i43 + i42;
                        if (i16 > 0 && i16 >= i21) {
                            i44 = z10 ? i44 - pVar5.f14361h.f14313f : i44 + pVar5.f14361h.f14313f;
                        }
                        if (z10) {
                            pVar5.f14362i.d(i44);
                        } else {
                            pVar5.f14361h.d(i44);
                        }
                        g gVar4 = pVar5.f14358e;
                        int iMin = gVar4.f14314g;
                        if (pVar5.f14357d == c2.e.b.MATCH_CONSTRAINT && pVar5.f14355a == 1) {
                            iMin = Math.min(iMin, gVar4.f14328m);
                        }
                        i43 = z10 ? i44 - iMin : i44 + iMin;
                        if (z10) {
                            pVar5.f14361h.d(i43);
                        } else {
                            pVar5.f14362i.d(i43);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i43 = z10 ? i43 - (-pVar5.f14362i.f14313f) : i43 + (-pVar5.f14362i.f14313f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i38 == 2) {
                float fY = this.f14359f == 0 ? this.b.y() : this.b.R();
                if (z10) {
                    fY = 1.0f - fY;
                }
                int i45 = (int) (((i20 - i13) * fY) + f12);
                if (i45 < 0 || i14 > 0) {
                    i45 = i16;
                }
                int i46 = z10 ? i15 - i45 : i15 + i45;
                while (i16 < size) {
                    p pVar6 = this.f14299k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar6.b.V() == 8) {
                        pVar6.f14361h.d(i46);
                        pVar6.f14362i.d(i46);
                    } else {
                        if (i16 > 0 && i16 >= i21) {
                            i46 = z10 ? i46 - pVar6.f14361h.f14313f : i46 + pVar6.f14361h.f14313f;
                        }
                        if (z10) {
                            pVar6.f14362i.d(i46);
                        } else {
                            pVar6.f14361h.d(i46);
                        }
                        g gVar5 = pVar6.f14358e;
                        int i47 = gVar5.f14314g;
                        if (pVar6.f14357d == c2.e.b.MATCH_CONSTRAINT && pVar6.f14355a == 1) {
                            i47 = gVar5.f14328m;
                        }
                        i46 = z10 ? i46 - i47 : i46 + i47;
                        if (z10) {
                            pVar6.f14361h.d(i46);
                        } else {
                            pVar6.f14362i.d(i46);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i46 = z10 ? i46 - (-pVar6.f14362i.f14313f) : i46 + (-pVar6.f14362i.f14313f);
                        }
                    }
                    i16++;
                }
            }
        }
    }

    @Override // d2.p
    public void d() {
        ArrayList<p> arrayList = this.f14299k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            pVar.d();
        }
        int size2 = this.f14299k.size();
        if (size2 < 1) {
            return;
        }
        c2.e eVar = this.f14299k.get(0).b;
        c2.e eVar2 = this.f14299k.get(size2 - 1).b;
        if (this.f14359f == 0) {
            c2.d dVar = eVar.O;
            c2.d dVar2 = eVar2.Q;
            f fVarI = i(dVar, 0);
            int iF = dVar.f();
            c2.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.O.f();
            }
            if (fVarI != null) {
                b(this.f14361h, fVarI, iF);
            }
            f fVarI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            c2.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.Q.f();
            }
            if (fVarI2 != null) {
                b(this.f14362i, fVarI2, -iF2);
            }
        } else {
            c2.d dVar3 = eVar.P;
            c2.d dVar4 = eVar2.R;
            f fVarI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            c2.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.P.f();
            }
            if (fVarI3 != null) {
                b(this.f14361h, fVarI3, iF3);
            }
            f fVarI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            c2.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.R.f();
            }
            if (fVarI4 != null) {
                b(this.f14362i, fVarI4, -iF4);
            }
        }
        this.f14361h.f14309a = this;
        this.f14362i.f14309a = this;
    }

    @Override // d2.p
    public void e() {
        for (int i10 = 0; i10 < this.f14299k.size(); i10++) {
            this.f14299k.get(i10).e();
        }
    }

    @Override // d2.p
    public void f() {
        this.f14356c = null;
        ArrayList<p> arrayList = this.f14299k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            pVar.f();
        }
    }

    @Override // d2.p
    public long j() {
        int size = this.f14299k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f14299k.get(i10);
            j10 = j10 + ((long) pVar.f14361h.f14313f) + pVar.j() + ((long) pVar.f14362i.f14313f);
        }
        return j10;
    }

    @Override // d2.p
    public boolean m() {
        int size = this.f14299k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f14299k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        c2.e eVar;
        c2.e eVar2 = this.b;
        c2.e eVarL = eVar2.L(this.f14359f);
        while (true) {
            c2.e eVar3 = eVarL;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarL = eVar2.L(this.f14359f);
            }
        }
        this.b = eVar;
        this.f14299k.add(eVar.N(this.f14359f));
        c2.e eVarJ = eVar.J(this.f14359f);
        while (eVarJ != null) {
            this.f14299k.add(eVarJ.N(this.f14359f));
            eVarJ = eVarJ.J(this.f14359f);
        }
        ArrayList<p> arrayList = this.f14299k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            p pVar2 = pVar;
            int i11 = this.f14359f;
            if (i11 == 0) {
                pVar2.b.f4529c = this;
            } else if (i11 == 1) {
                pVar2.b.f4531d = this;
            }
        }
        if (this.f14359f == 0 && ((c2.f) this.b.K()).R1() && this.f14299k.size() > 1) {
            ArrayList<p> arrayList2 = this.f14299k;
            this.b = arrayList2.get(arrayList2.size() - 1).b;
        }
        this.f14300l = this.f14359f == 0 ? this.b.z() : this.b.S();
    }

    public final c2.e r() {
        for (int i10 = 0; i10 < this.f14299k.size(); i10++) {
            p pVar = this.f14299k.get(i10);
            if (pVar.b.V() != 8) {
                return pVar.b;
            }
        }
        return null;
    }

    public final c2.e s() {
        for (int size = this.f14299k.size() - 1; size >= 0; size--) {
            p pVar = this.f14299k.get(size);
            if (pVar.b.V() != 8) {
                return pVar.b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f14359f == 0 ? "horizontal : " : "vertical : ");
        ArrayList<p> arrayList = this.f14299k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = arrayList.get(i10);
            i10++;
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
