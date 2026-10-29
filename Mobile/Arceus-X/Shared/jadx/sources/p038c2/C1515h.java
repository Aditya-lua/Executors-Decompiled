package p038c2;

import p591z1.C13682d;
import p591z1.C13687i;

/* JADX INFO: renamed from: c2.h */
/* JADX INFO: loaded from: classes.dex */
public class C1515h extends C1512e {

    /* JADX INFO: renamed from: L0 */
    public float f6000L0 = -1.0f;

    /* JADX INFO: renamed from: M0 */
    public int f6001M0 = -1;

    /* JADX INFO: renamed from: N0 */
    public int f6002N0 = -1;

    /* JADX INFO: renamed from: O0 */
    public boolean f6003O0 = true;

    /* JADX INFO: renamed from: P0 */
    public C1511d f6004P0 = this.f5858P;

    /* JADX INFO: renamed from: Q0 */
    public int f6005Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    public int f6006R0 = 0;

    /* JADX INFO: renamed from: S0 */
    public boolean f6007S0;

    /* JADX INFO: renamed from: c2.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6008a;

        static {
            int[] iArr = new int[C1511d.a.values().length];
            f6008a = iArr;
            try {
                iArr[C1511d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6008a[C1511d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6008a[C1511d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6008a[C1511d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6008a[C1511d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6008a[C1511d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6008a[C1511d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6008a[C1511d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6008a[C1511d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C1515h() {
        this.f5866X.clear();
        this.f5866X.add(this.f6004P0);
        int length = this.f5865W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f5865W[i10] = this.f6004P0;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m7910A1(float f10) {
        if (f10 > -1.0f) {
            this.f6000L0 = f10;
            this.f6001M0 = -1;
            this.f6002N0 = -1;
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m7911B1(int i10) {
        if (this.f6005Q0 == i10) {
            return;
        }
        this.f6005Q0 = i10;
        this.f5866X.clear();
        if (this.f6005Q0 == 1) {
            this.f6004P0 = this.f5857O;
        } else {
            this.f6004P0 = this.f5858P;
        }
        this.f5866X.add(this.f6004P0);
        int length = this.f5865W.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f5865W[i11] = this.f6004P0;
        }
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: g */
    public void mo7666g(C13682d c13682d, boolean z10) {
        C1513f c1513f = (C1513f) m7723K();
        if (c1513f == null) {
            return;
        }
        C1511d c1511dMo7791o = c1513f.mo7791o(C1511d.a.LEFT);
        C1511d c1511dMo7791o2 = c1513f.mo7791o(C1511d.a.RIGHT);
        C1512e c1512e = this.f5870a0;
        boolean z11 = c1512e != null && c1512e.f5868Z[0] == C1512e.b.WRAP_CONTENT;
        if (this.f6005Q0 == 0) {
            c1511dMo7791o = c1513f.mo7791o(C1511d.a.TOP);
            c1511dMo7791o2 = c1513f.mo7791o(C1511d.a.BOTTOM);
            C1512e c1512e2 = this.f5870a0;
            z11 = c1512e2 != null && c1512e2.f5868Z[1] == C1512e.b.WRAP_CONTENT;
        }
        if (this.f6007S0 && this.f6004P0.m7694n()) {
            C13687i c13687iM49971q = c13682d.m49971q(this.f6004P0);
            c13682d.m49960f(c13687iM49971q, this.f6004P0.m7685e());
            if (this.f6001M0 != -1) {
                if (z11) {
                    c13682d.m49962h(c13682d.m49971q(c1511dMo7791o2), c13687iM49971q, 0, 5);
                }
            } else if (this.f6002N0 != -1 && z11) {
                C13687i c13687iM49971q2 = c13682d.m49971q(c1511dMo7791o2);
                c13682d.m49962h(c13687iM49971q, c13682d.m49971q(c1511dMo7791o), 0, 5);
                c13682d.m49962h(c13687iM49971q2, c13687iM49971q, 0, 5);
            }
            this.f6007S0 = false;
            return;
        }
        if (this.f6001M0 != -1) {
            C13687i c13687iM49971q3 = c13682d.m49971q(this.f6004P0);
            c13682d.m49959e(c13687iM49971q3, c13682d.m49971q(c1511dMo7791o), this.f6001M0, 8);
            if (z11) {
                c13682d.m49962h(c13682d.m49971q(c1511dMo7791o2), c13687iM49971q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f6002N0 == -1) {
            if (this.f6000L0 != -1.0f) {
                c13682d.m49958d(C13682d.m49948s(c13682d, c13682d.m49971q(this.f6004P0), c13682d.m49971q(c1511dMo7791o2), this.f6000L0));
                return;
            }
            return;
        }
        C13687i c13687iM49971q4 = c13682d.m49971q(this.f6004P0);
        C13687i c13687iM49971q5 = c13682d.m49971q(c1511dMo7791o2);
        c13682d.m49959e(c13687iM49971q4, c13687iM49971q5, -this.f6002N0, 8);
        if (z11) {
            c13682d.m49962h(c13687iM49971q4, c13682d.m49971q(c1511dMo7791o), 0, 5);
            c13682d.m49962h(c13687iM49971q5, c13687iM49971q4, 0, 5);
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
        return this.f6007S0;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: o */
    public C1511d mo7791o(C1511d.a aVar) {
        int i10 = a.f6008a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f6005Q0 == 1) {
                return this.f6004P0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f6005Q0 == 0) {
            return this.f6004P0;
        }
        return null;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: o0 */
    public boolean mo7669o0() {
        return this.f6007S0;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: r1 */
    public void mo7801r1(C13682d c13682d, boolean z10) {
        if (m7723K() == null) {
            return;
        }
        int iM49977y = c13682d.m49977y(this.f6004P0);
        if (this.f6005Q0 == 1) {
            m7790n1(iM49977y);
            m7792o1(0);
            m7728M0(m7723K().m7812x());
            m7785l1(0);
            return;
        }
        m7790n1(0);
        m7792o1(iM49977y);
        m7785l1(m7723K().m7747W());
        m7728M0(0);
    }

    /* JADX INFO: renamed from: s1 */
    public C1511d m7912s1() {
        return this.f6004P0;
    }

    /* JADX INFO: renamed from: t1 */
    public int m7913t1() {
        return this.f6005Q0;
    }

    /* JADX INFO: renamed from: u1 */
    public int m7914u1() {
        return this.f6001M0;
    }

    /* JADX INFO: renamed from: v1 */
    public int m7915v1() {
        return this.f6002N0;
    }

    /* JADX INFO: renamed from: w1 */
    public float m7916w1() {
        return this.f6000L0;
    }

    /* JADX INFO: renamed from: x1 */
    public void m7917x1(int i10) {
        this.f6004P0.m7700t(i10);
        this.f6007S0 = true;
    }

    /* JADX INFO: renamed from: y1 */
    public void m7918y1(int i10) {
        if (i10 > -1) {
            this.f6000L0 = -1.0f;
            this.f6001M0 = i10;
            this.f6002N0 = -1;
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m7919z1(int i10) {
        if (i10 > -1) {
            this.f6000L0 = -1.0f;
            this.f6001M0 = -1;
            this.f6002N0 = i10;
        }
    }
}
