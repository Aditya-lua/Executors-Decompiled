package p065d2;

import java.util.ArrayList;
import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.C1513f;

/* JADX INFO: renamed from: d2.c */
/* JADX INFO: loaded from: classes.dex */
public class C4409c extends AbstractC4422p {

    /* JADX INFO: renamed from: k */
    public ArrayList<AbstractC4422p> f18315k;

    /* JADX INFO: renamed from: l */
    public int f18316l;

    public C4409c(C1512e c1512e, int i10) {
        super(c1512e);
        this.f18315k = new ArrayList<>();
        this.f18383f = i10;
        m22159q();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // p065d2.AbstractC4422p, p065d2.InterfaceC4410d
    /* JADX INFO: renamed from: a */
    public void mo22153a(InterfaceC4410d interfaceC4410d) {
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
        if (this.f18385h.f18335j && this.f18386i.f18335j) {
            C1512e c1512eM7723K = this.f18379b.m7723K();
            boolean zM7837R1 = c1512eM7723K instanceof C1513f ? ((C1513f) c1512eM7723K).m7837R1() : false;
            int i20 = this.f18386i.f18332g - this.f18385h.f18332g;
            int size = this.f18315k.size();
            int i21 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i21 >= size) {
                    i21 = -1;
                    break;
                } else if (this.f18315k.get(i21).f18379b.m7745V() != 8) {
                    break;
                } else {
                    i21++;
                }
            }
            int i22 = size - 1;
            for (int i23 = i22; i23 >= 0; i23--) {
                if (this.f18315k.get(i23).f18379b.m7745V() != 8) {
                    i10 = i23;
                    break;
                }
            }
            int i24 = 0;
            while (true) {
                if (i24 >= 2) {
                    z10 = zM7837R1;
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
                    AbstractC4422p abstractC4422p = this.f18315k.get(i25);
                    if (abstractC4422p.f18379b.m7745V() == i11) {
                        z11 = zM7837R1;
                    } else {
                        i26++;
                        if (i25 > 0 && i25 >= i21) {
                            i13 += abstractC4422p.f18385h.f18331f;
                        }
                        C4413g c4413g = abstractC4422p.f18382e;
                        int i27 = c4413g.f18332g;
                        boolean z12 = abstractC4422p.f18381d != C1512e.b.MATCH_CONSTRAINT;
                        if (z12) {
                            int i28 = this.f18383f;
                            if (i28 == 0 && !abstractC4422p.f18379b.f5877e.f18382e.f18335j) {
                                return;
                            }
                            if (i28 == 1 && !abstractC4422p.f18379b.f5879f.f18382e.f18335j) {
                                return;
                            } else {
                                z11 = zM7837R1;
                            }
                        } else {
                            z11 = zM7837R1;
                            if (abstractC4422p.f18378a == 1 && i24 == 0) {
                                i27 = c4413g.f18347m;
                                i14++;
                            } else if (c4413g.f18335j) {
                            }
                            z12 = true;
                        }
                        if (z12) {
                            i13 += i27;
                        } else {
                            i14++;
                            float f13 = abstractC4422p.f18379b.f5840D0[this.f18383f];
                            if (f13 >= 0.0f) {
                                f11 += f13;
                            }
                        }
                        if (i25 < i22 && i25 < i10) {
                            i13 += -abstractC4422p.f18386i.f18331f;
                        }
                    }
                    i25++;
                    zM7837R1 = z11;
                    i11 = 8;
                }
                z10 = zM7837R1;
                f10 = 0.0f;
                if (i13 < i20 || i14 == 0) {
                    i12 = i26;
                    break;
                } else {
                    i24++;
                    zM7837R1 = z10;
                    i11 = 8;
                }
            }
            int i29 = this.f18385h.f18332g;
            if (z10) {
                i29 = this.f18386i.f18332g;
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
                    AbstractC4422p abstractC4422p2 = this.f18315k.get(i31);
                    float f16 = f14;
                    int i33 = i29;
                    if (abstractC4422p2.f18379b.m7745V() != 8 && abstractC4422p2.f18381d == C1512e.b.MATCH_CONSTRAINT) {
                        C4413g c4413g2 = abstractC4422p2.f18382e;
                        if (c4413g2.f18335j) {
                            i30 = i30;
                            i32 = i32;
                        } else {
                            int i34 = f11 > f10 ? (int) (((abstractC4422p2.f18379b.f5840D0[this.f18383f] * f15) / f11) + f16) : i30;
                            if (this.f18383f == 0) {
                                C1512e c1512e = abstractC4422p2.f18379b;
                                i18 = c1512e.f5833A;
                                i19 = c1512e.f5919z;
                            } else {
                                C1512e c1512e2 = abstractC4422p2.f18379b;
                                i18 = c1512e2.f5839D;
                                i19 = c1512e2.f5837C;
                            }
                            int i35 = i32;
                            int iMax = Math.max(i19, abstractC4422p2.f18378a == 1 ? Math.min(i34, c4413g2.f18347m) : i34);
                            if (i18 > 0) {
                                iMax = Math.min(i18, iMax);
                            }
                            if (iMax != i34) {
                                i32 = i35 + 1;
                                i34 = iMax;
                            } else {
                                i32 = i35;
                            }
                            abstractC4422p2.f18382e.mo22178d(i34);
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
                        AbstractC4422p abstractC4422p3 = this.f18315k.get(i37);
                        if (abstractC4422p3.f18379b.m7745V() != 8) {
                            if (i37 > 0 && i37 >= i21) {
                                i13 += abstractC4422p3.f18385h.f18331f;
                            }
                            i13 += abstractC4422p3.f18382e.f18332g;
                            if (i37 < i22 && i37 < i10) {
                                i13 += -abstractC4422p3.f18386i.f18331f;
                            }
                        }
                    }
                }
                i17 = 2;
                if (this.f18316l == 2 && i36 == 0) {
                    i16 = 0;
                    this.f18316l = 0;
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
                this.f18316l = i17;
            }
            if (i12 > 0 && i14 == 0 && i21 == i10) {
                this.f18316l = i17;
            }
            int i38 = this.f18316l;
            if (i38 == 1) {
                int i39 = i12 > 1 ? (i20 - i13) / (i12 - 1) : i12 == 1 ? (i20 - i13) / 2 : i16;
                if (i14 > 0) {
                    i39 = i16;
                }
                int i40 = i15;
                while (i16 < size) {
                    AbstractC4422p abstractC4422p4 = this.f18315k.get(z10 ? size - (i16 + 1) : i16);
                    if (abstractC4422p4.f18379b.m7745V() == 8) {
                        abstractC4422p4.f18385h.mo22178d(i40);
                        abstractC4422p4.f18386i.mo22178d(i40);
                    } else {
                        if (i16 > 0) {
                            i40 = z10 ? i40 - i39 : i40 + i39;
                        }
                        if (i16 > 0 && i16 >= i21) {
                            i40 = z10 ? i40 - abstractC4422p4.f18385h.f18331f : i40 + abstractC4422p4.f18385h.f18331f;
                        }
                        if (z10) {
                            abstractC4422p4.f18386i.mo22178d(i40);
                        } else {
                            abstractC4422p4.f18385h.mo22178d(i40);
                        }
                        C4413g c4413g3 = abstractC4422p4.f18382e;
                        int i41 = c4413g3.f18332g;
                        if (abstractC4422p4.f18381d == C1512e.b.MATCH_CONSTRAINT && abstractC4422p4.f18378a == 1) {
                            i41 = c4413g3.f18347m;
                        }
                        i40 = z10 ? i40 - i41 : i40 + i41;
                        if (z10) {
                            abstractC4422p4.f18385h.mo22178d(i40);
                        } else {
                            abstractC4422p4.f18386i.mo22178d(i40);
                        }
                        abstractC4422p4.f18384g = true;
                        if (i16 < i22 && i16 < i10) {
                            i40 = z10 ? i40 - (-abstractC4422p4.f18386i.f18331f) : i40 + (-abstractC4422p4.f18386i.f18331f);
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
                    AbstractC4422p abstractC4422p5 = this.f18315k.get(z10 ? size - (i16 + 1) : i16);
                    if (abstractC4422p5.f18379b.m7745V() == 8) {
                        abstractC4422p5.f18385h.mo22178d(i43);
                        abstractC4422p5.f18386i.mo22178d(i43);
                    } else {
                        int i44 = z10 ? i43 - i42 : i43 + i42;
                        if (i16 > 0 && i16 >= i21) {
                            i44 = z10 ? i44 - abstractC4422p5.f18385h.f18331f : i44 + abstractC4422p5.f18385h.f18331f;
                        }
                        if (z10) {
                            abstractC4422p5.f18386i.mo22178d(i44);
                        } else {
                            abstractC4422p5.f18385h.mo22178d(i44);
                        }
                        C4413g c4413g4 = abstractC4422p5.f18382e;
                        int iMin = c4413g4.f18332g;
                        if (abstractC4422p5.f18381d == C1512e.b.MATCH_CONSTRAINT && abstractC4422p5.f18378a == 1) {
                            iMin = Math.min(iMin, c4413g4.f18347m);
                        }
                        i43 = z10 ? i44 - iMin : i44 + iMin;
                        if (z10) {
                            abstractC4422p5.f18385h.mo22178d(i43);
                        } else {
                            abstractC4422p5.f18386i.mo22178d(i43);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i43 = z10 ? i43 - (-abstractC4422p5.f18386i.f18331f) : i43 + (-abstractC4422p5.f18386i.f18331f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i38 == 2) {
                float fM7814y = this.f18383f == 0 ? this.f18379b.m7814y() : this.f18379b.m7737R();
                if (z10) {
                    fM7814y = 1.0f - fM7814y;
                }
                int i45 = (int) (((i20 - i13) * fM7814y) + f12);
                if (i45 < 0 || i14 > 0) {
                    i45 = i16;
                }
                int i46 = z10 ? i15 - i45 : i15 + i45;
                while (i16 < size) {
                    AbstractC4422p abstractC4422p6 = this.f18315k.get(z10 ? size - (i16 + 1) : i16);
                    if (abstractC4422p6.f18379b.m7745V() == 8) {
                        abstractC4422p6.f18385h.mo22178d(i46);
                        abstractC4422p6.f18386i.mo22178d(i46);
                    } else {
                        if (i16 > 0 && i16 >= i21) {
                            i46 = z10 ? i46 - abstractC4422p6.f18385h.f18331f : i46 + abstractC4422p6.f18385h.f18331f;
                        }
                        if (z10) {
                            abstractC4422p6.f18386i.mo22178d(i46);
                        } else {
                            abstractC4422p6.f18385h.mo22178d(i46);
                        }
                        C4413g c4413g5 = abstractC4422p6.f18382e;
                        int i47 = c4413g5.f18332g;
                        if (abstractC4422p6.f18381d == C1512e.b.MATCH_CONSTRAINT && abstractC4422p6.f18378a == 1) {
                            i47 = c4413g5.f18347m;
                        }
                        i46 = z10 ? i46 - i47 : i46 + i47;
                        if (z10) {
                            abstractC4422p6.f18385h.mo22178d(i46);
                        } else {
                            abstractC4422p6.f18386i.mo22178d(i46);
                        }
                        if (i16 < i22 && i16 < i10) {
                            i46 = z10 ? i46 - (-abstractC4422p6.f18386i.f18331f) : i46 + (-abstractC4422p6.f18386i.f18331f);
                        }
                    }
                    i16++;
                }
            }
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: d */
    public void mo22154d() {
        ArrayList<AbstractC4422p> arrayList = this.f18315k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            AbstractC4422p abstractC4422p = arrayList.get(i10);
            i10++;
            abstractC4422p.mo22154d();
        }
        int size2 = this.f18315k.size();
        if (size2 < 1) {
            return;
        }
        C1512e c1512e = this.f18315k.get(0).f18379b;
        C1512e c1512e2 = this.f18315k.get(size2 - 1).f18379b;
        if (this.f18383f == 0) {
            C1511d c1511d = c1512e.f5857O;
            C1511d c1511d2 = c1512e2.f5859Q;
            C4412f c4412fM22216i = m22216i(c1511d, 0);
            int iM7686f = c1511d.m7686f();
            C1512e c1512eM22160r = m22160r();
            if (c1512eM22160r != null) {
                iM7686f = c1512eM22160r.f5857O.m7686f();
            }
            if (c4412fM22216i != null) {
                m22212b(this.f18385h, c4412fM22216i, iM7686f);
            }
            C4412f c4412fM22216i2 = m22216i(c1511d2, 0);
            int iM7686f2 = c1511d2.m7686f();
            C1512e c1512eM22161s = m22161s();
            if (c1512eM22161s != null) {
                iM7686f2 = c1512eM22161s.f5859Q.m7686f();
            }
            if (c4412fM22216i2 != null) {
                m22212b(this.f18386i, c4412fM22216i2, -iM7686f2);
            }
        } else {
            C1511d c1511d3 = c1512e.f5858P;
            C1511d c1511d4 = c1512e2.f5860R;
            C4412f c4412fM22216i3 = m22216i(c1511d3, 1);
            int iM7686f3 = c1511d3.m7686f();
            C1512e c1512eM22160r2 = m22160r();
            if (c1512eM22160r2 != null) {
                iM7686f3 = c1512eM22160r2.f5858P.m7686f();
            }
            if (c4412fM22216i3 != null) {
                m22212b(this.f18385h, c4412fM22216i3, iM7686f3);
            }
            C4412f c4412fM22216i4 = m22216i(c1511d4, 1);
            int iM7686f4 = c1511d4.m7686f();
            C1512e c1512eM22161s2 = m22161s();
            if (c1512eM22161s2 != null) {
                iM7686f4 = c1512eM22161s2.f5860R.m7686f();
            }
            if (c4412fM22216i4 != null) {
                m22212b(this.f18386i, c4412fM22216i4, -iM7686f4);
            }
        }
        this.f18385h.f18326a = this;
        this.f18386i.f18326a = this;
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: e */
    public void mo22155e() {
        for (int i10 = 0; i10 < this.f18315k.size(); i10++) {
            this.f18315k.get(i10).mo22155e();
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: f */
    public void mo22156f() {
        this.f18380c = null;
        ArrayList<AbstractC4422p> arrayList = this.f18315k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            AbstractC4422p abstractC4422p = arrayList.get(i10);
            i10++;
            abstractC4422p.mo22156f();
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: j */
    public long mo22157j() {
        int size = this.f18315k.size();
        long jMo22157j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4422p abstractC4422p = this.f18315k.get(i10);
            jMo22157j = jMo22157j + ((long) abstractC4422p.f18385h.f18331f) + abstractC4422p.mo22157j() + ((long) abstractC4422p.f18386i.f18331f);
        }
        return jMo22157j;
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: m */
    public boolean mo22158m() {
        int size = this.f18315k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f18315k.get(i10).mo22158m()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m22159q() {
        C1512e c1512e;
        C1512e c1512e2 = this.f18379b;
        C1512e c1512eM7725L = c1512e2.m7725L(this.f18383f);
        while (true) {
            C1512e c1512e3 = c1512eM7725L;
            c1512e = c1512e2;
            c1512e2 = c1512e3;
            if (c1512e2 == null) {
                break;
            } else {
                c1512eM7725L = c1512e2.m7725L(this.f18383f);
            }
        }
        this.f18379b = c1512e;
        this.f18315k.add(c1512e.m7729N(this.f18383f));
        C1512e c1512eM7721J = c1512e.m7721J(this.f18383f);
        while (c1512eM7721J != null) {
            this.f18315k.add(c1512eM7721J.m7729N(this.f18383f));
            c1512eM7721J = c1512eM7721J.m7721J(this.f18383f);
        }
        ArrayList<AbstractC4422p> arrayList = this.f18315k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            AbstractC4422p abstractC4422p = arrayList.get(i10);
            i10++;
            AbstractC4422p abstractC4422p2 = abstractC4422p;
            int i11 = this.f18383f;
            if (i11 == 0) {
                abstractC4422p2.f18379b.f5873c = this;
            } else if (i11 == 1) {
                abstractC4422p2.f18379b.f5875d = this;
            }
        }
        if (this.f18383f == 0 && ((C1513f) this.f18379b.m7723K()).m7837R1() && this.f18315k.size() > 1) {
            ArrayList<AbstractC4422p> arrayList2 = this.f18315k;
            this.f18379b = arrayList2.get(arrayList2.size() - 1).f18379b;
        }
        this.f18316l = this.f18383f == 0 ? this.f18379b.m7816z() : this.f18379b.m7739S();
    }

    /* JADX INFO: renamed from: r */
    public final C1512e m22160r() {
        for (int i10 = 0; i10 < this.f18315k.size(); i10++) {
            AbstractC4422p abstractC4422p = this.f18315k.get(i10);
            if (abstractC4422p.f18379b.m7745V() != 8) {
                return abstractC4422p.f18379b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final C1512e m22161s() {
        for (int size = this.f18315k.size() - 1; size >= 0; size--) {
            AbstractC4422p abstractC4422p = this.f18315k.get(size);
            if (abstractC4422p.f18379b.m7745V() != 8) {
                return abstractC4422p.f18379b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f18383f == 0 ? "horizontal : " : "vertical : ");
        ArrayList<AbstractC4422p> arrayList = this.f18315k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            AbstractC4422p abstractC4422p = arrayList.get(i10);
            i10++;
            sb2.append("<");
            sb2.append(abstractC4422p);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
