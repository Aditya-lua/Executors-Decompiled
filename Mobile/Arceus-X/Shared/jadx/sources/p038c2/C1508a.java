package p038c2;

import p591z1.C13682d;
import p591z1.C13687i;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: loaded from: classes.dex */
public class C1508a extends C1517j {

    /* JADX INFO: renamed from: N0 */
    public int f5787N0 = 0;

    /* JADX INFO: renamed from: O0 */
    public boolean f5788O0 = true;

    /* JADX INFO: renamed from: P0 */
    public int f5789P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f5790Q0 = false;

    /* JADX INFO: renamed from: A1 */
    public void m7663A1(boolean z10) {
        this.f5788O0 = z10;
    }

    /* JADX INFO: renamed from: B1 */
    public void m7664B1(int i10) {
        this.f5787N0 = i10;
    }

    /* JADX INFO: renamed from: C1 */
    public void m7665C1(int i10) {
        this.f5789P0 = i10;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: g */
    public void mo7666g(C13682d c13682d, boolean z10) {
        C1511d[] c1511dArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        C1511d[] c1511dArr2 = this.f5865W;
        c1511dArr2[0] = this.f5857O;
        c1511dArr2[2] = this.f5858P;
        c1511dArr2[1] = this.f5859Q;
        c1511dArr2[3] = this.f5860R;
        int i13 = 0;
        while (true) {
            c1511dArr = this.f5865W;
            if (i13 >= c1511dArr.length) {
                break;
            }
            C1511d c1511d = c1511dArr[i13];
            c1511d.f5821i = c13682d.m49971q(c1511d);
            i13++;
        }
        int i14 = this.f5787N0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        C1511d c1511d2 = c1511dArr[i14];
        if (!this.f5790Q0) {
            m7670u1();
        }
        if (this.f5790Q0) {
            this.f5790Q0 = false;
            int i15 = this.f5787N0;
            if (i15 == 0 || i15 == 1) {
                c13682d.m49960f(this.f5857O.f5821i, this.f5880f0);
                c13682d.m49960f(this.f5859Q.f5821i, this.f5880f0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    c13682d.m49960f(this.f5858P.f5821i, this.f5882g0);
                    c13682d.m49960f(this.f5860R.f5821i, this.f5882g0);
                    return;
                }
                return;
            }
        }
        int i16 = 0;
        while (true) {
            if (i16 >= this.f6010M0) {
                z11 = false;
                break;
            }
            C1512e c1512e = this.f6009L0[i16];
            if ((this.f5788O0 || c1512e.mo7667h()) && ((((i11 = this.f5787N0) == 0 || i11 == 1) && c1512e.m7703A() == C1512e.b.MATCH_CONSTRAINT && c1512e.f5857O.f5818f != null && c1512e.f5859Q.f5818f != null) || (((i12 = this.f5787N0) == 2 || i12 == 3) && c1512e.m7741T() == C1512e.b.MATCH_CONSTRAINT && c1512e.f5858P.f5818f != null && c1512e.f5860R.f5818f != null))) {
                z11 = true;
                break;
            }
            i16++;
        }
        boolean z12 = this.f5857O.m7692l() || this.f5859Q.m7692l();
        boolean z13 = this.f5858P.m7692l() || this.f5860R.m7692l();
        int i17 = !(!z11 && (((i10 = this.f5787N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f6010M0; i18++) {
            C1512e c1512e2 = this.f6009L0[i18];
            if (this.f5788O0 || c1512e2.mo7667h()) {
                C13687i c13687iM49971q = c13682d.m49971q(c1512e2.f5865W[this.f5787N0]);
                C1511d[] c1511dArr3 = c1512e2.f5865W;
                int i19 = this.f5787N0;
                C1511d c1511d3 = c1511dArr3[i19];
                c1511d3.f5821i = c13687iM49971q;
                C1511d c1511d4 = c1511d3.f5818f;
                int i20 = (c1511d4 == null || c1511d4.f5816d != this) ? 0 : c1511d3.f5819g;
                if (i19 == 0 || i19 == 2) {
                    c13682d.m49963i(c1511d2.f5821i, c13687iM49971q, this.f5789P0 - i20, z11);
                } else {
                    c13682d.m49961g(c1511d2.f5821i, c13687iM49971q, this.f5789P0 + i20, z11);
                }
                c13682d.m49959e(c1511d2.f5821i, c13687iM49971q, this.f5789P0 + i20, i17);
            }
        }
        int i21 = this.f5787N0;
        if (i21 == 0) {
            c13682d.m49959e(this.f5859Q.f5821i, this.f5857O.f5821i, 0, 8);
            c13682d.m49959e(this.f5857O.f5821i, this.f5870a0.f5859Q.f5821i, 0, 4);
            c13682d.m49959e(this.f5857O.f5821i, this.f5870a0.f5857O.f5821i, 0, 0);
            return;
        }
        if (i21 == 1) {
            c13682d.m49959e(this.f5857O.f5821i, this.f5859Q.f5821i, 0, 8);
            c13682d.m49959e(this.f5857O.f5821i, this.f5870a0.f5857O.f5821i, 0, 4);
            c13682d.m49959e(this.f5857O.f5821i, this.f5870a0.f5859Q.f5821i, 0, 0);
        } else if (i21 == 2) {
            c13682d.m49959e(this.f5860R.f5821i, this.f5858P.f5821i, 0, 8);
            c13682d.m49959e(this.f5858P.f5821i, this.f5870a0.f5860R.f5821i, 0, 4);
            c13682d.m49959e(this.f5858P.f5821i, this.f5870a0.f5858P.f5821i, 0, 0);
        } else if (i21 == 3) {
            c13682d.m49959e(this.f5858P.f5821i, this.f5860R.f5821i, 0, 8);
            c13682d.m49959e(this.f5858P.f5821i, this.f5870a0.f5858P.f5821i, 0, 4);
            c13682d.m49959e(this.f5858P.f5821i, this.f5870a0.f5860R.f5821i, 0, 0);
        }
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: h */
    public boolean mo7667h() {
        return true;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: n0 */
    public boolean mo7668n0() {
        return this.f5790Q0;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: o0 */
    public boolean mo7669o0() {
        return this.f5790Q0;
    }

    @Override // p038c2.C1512e
    public String toString() {
        String str = "[Barrier] " + m7804t() + " {";
        for (int i10 = 0; i10 < this.f6010M0; i10++) {
            C1512e c1512e = this.f6009L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + c1512e.m7804t();
        }
        return str + "}";
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m7670u1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f6010M0;
            if (i13 >= i10) {
                break;
            }
            C1512e c1512e = this.f6009L0[i13];
            if ((this.f5788O0 || c1512e.mo7667h()) && ((((i11 = this.f5787N0) == 0 || i11 == 1) && !c1512e.mo7668n0()) || (((i12 = this.f5787N0) == 2 || i12 == 3) && !c1512e.mo7669o0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f6010M0; i14++) {
            C1512e c1512e2 = this.f6009L0[i14];
            if (this.f5788O0 || c1512e2.mo7667h()) {
                if (!z11) {
                    int i15 = this.f5787N0;
                    if (i15 == 0) {
                        iMax = c1512e2.mo7791o(C1511d.a.LEFT).m7685e();
                    } else if (i15 == 1) {
                        iMax = c1512e2.mo7791o(C1511d.a.RIGHT).m7685e();
                    } else if (i15 == 2) {
                        iMax = c1512e2.mo7791o(C1511d.a.TOP).m7685e();
                    } else if (i15 == 3) {
                        iMax = c1512e2.mo7791o(C1511d.a.BOTTOM).m7685e();
                    }
                    z11 = true;
                }
                int i16 = this.f5787N0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, c1512e2.mo7791o(C1511d.a.LEFT).m7685e());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, c1512e2.mo7791o(C1511d.a.RIGHT).m7685e());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, c1512e2.mo7791o(C1511d.a.TOP).m7685e());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, c1512e2.mo7791o(C1511d.a.BOTTOM).m7685e());
                }
            }
        }
        int i17 = iMax + this.f5789P0;
        int i18 = this.f5787N0;
        if (i18 == 0 || i18 == 1) {
            m7716G0(i17, i17);
        } else {
            m7722J0(i17, i17);
        }
        this.f5790Q0 = true;
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public boolean m7671v1() {
        return this.f5788O0;
    }

    /* JADX INFO: renamed from: w1 */
    public int m7672w1() {
        return this.f5787N0;
    }

    /* JADX INFO: renamed from: x1 */
    public int m7673x1() {
        return this.f5789P0;
    }

    /* JADX INFO: renamed from: y1 */
    public int m7674y1() {
        int i10 = this.f5787N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: z1 */
    public void m7675z1() {
        for (int i10 = 0; i10 < this.f6010M0; i10++) {
            C1512e c1512e = this.f6009L0[i10];
            if (this.f5788O0 || c1512e.mo7667h()) {
                int i11 = this.f5787N0;
                if (i11 == 0 || i11 == 1) {
                    c1512e.m7742T0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    c1512e.m7742T0(1, true);
                }
            }
        }
    }
}
