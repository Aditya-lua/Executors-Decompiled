package p038c2;

import java.util.ArrayList;
import p591z1.C13682d;

/* JADX INFO: renamed from: c2.g */
/* JADX INFO: loaded from: classes.dex */
public class C1514g extends C1519l {

    /* JADX INFO: renamed from: x1 */
    public C1512e[] f5980x1;

    /* JADX INFO: renamed from: a1 */
    public int f5957a1 = -1;

    /* JADX INFO: renamed from: b1 */
    public int f5958b1 = -1;

    /* JADX INFO: renamed from: c1 */
    public int f5959c1 = -1;

    /* JADX INFO: renamed from: d1 */
    public int f5960d1 = -1;

    /* JADX INFO: renamed from: e1 */
    public int f5961e1 = -1;

    /* JADX INFO: renamed from: f1 */
    public int f5962f1 = -1;

    /* JADX INFO: renamed from: g1 */
    public float f5963g1 = 0.5f;

    /* JADX INFO: renamed from: h1 */
    public float f5964h1 = 0.5f;

    /* JADX INFO: renamed from: i1 */
    public float f5965i1 = 0.5f;

    /* JADX INFO: renamed from: j1 */
    public float f5966j1 = 0.5f;

    /* JADX INFO: renamed from: k1 */
    public float f5967k1 = 0.5f;

    /* JADX INFO: renamed from: l1 */
    public float f5968l1 = 0.5f;

    /* JADX INFO: renamed from: m1 */
    public int f5969m1 = 0;

    /* JADX INFO: renamed from: n1 */
    public int f5970n1 = 0;

    /* JADX INFO: renamed from: o1 */
    public int f5971o1 = 2;

    /* JADX INFO: renamed from: p1 */
    public int f5972p1 = 2;

    /* JADX INFO: renamed from: q1 */
    public int f5973q1 = 0;

    /* JADX INFO: renamed from: r1 */
    public int f5974r1 = -1;

    /* JADX INFO: renamed from: s1 */
    public int f5975s1 = 0;

    /* JADX INFO: renamed from: t1 */
    public ArrayList<a> f5976t1 = new ArrayList<>();

    /* JADX INFO: renamed from: u1 */
    public C1512e[] f5977u1 = null;

    /* JADX INFO: renamed from: v1 */
    public C1512e[] f5978v1 = null;

    /* JADX INFO: renamed from: w1 */
    public int[] f5979w1 = null;

    /* JADX INFO: renamed from: y1 */
    public int f5981y1 = 0;

    /* JADX INFO: renamed from: c2.g$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f5982a;

        /* JADX INFO: renamed from: d */
        public C1511d f5985d;

        /* JADX INFO: renamed from: e */
        public C1511d f5986e;

        /* JADX INFO: renamed from: f */
        public C1511d f5987f;

        /* JADX INFO: renamed from: g */
        public C1511d f5988g;

        /* JADX INFO: renamed from: h */
        public int f5989h;

        /* JADX INFO: renamed from: i */
        public int f5990i;

        /* JADX INFO: renamed from: j */
        public int f5991j;

        /* JADX INFO: renamed from: k */
        public int f5992k;

        /* JADX INFO: renamed from: q */
        public int f5998q;

        /* JADX INFO: renamed from: b */
        public C1512e f5983b = null;

        /* JADX INFO: renamed from: c */
        public int f5984c = 0;

        /* JADX INFO: renamed from: l */
        public int f5993l = 0;

        /* JADX INFO: renamed from: m */
        public int f5994m = 0;

        /* JADX INFO: renamed from: n */
        public int f5995n = 0;

        /* JADX INFO: renamed from: o */
        public int f5996o = 0;

        /* JADX INFO: renamed from: p */
        public int f5997p = 0;

        public a(int i10, C1511d c1511d, C1511d c1511d2, C1511d c1511d3, C1511d c1511d4, int i11) {
            this.f5989h = 0;
            this.f5990i = 0;
            this.f5991j = 0;
            this.f5992k = 0;
            this.f5998q = 0;
            this.f5982a = i10;
            this.f5985d = c1511d;
            this.f5986e = c1511d2;
            this.f5987f = c1511d3;
            this.f5988g = c1511d4;
            this.f5989h = C1514g.this.m7927A1();
            this.f5990i = C1514g.this.m7929C1();
            this.f5991j = C1514g.this.m7928B1();
            this.f5992k = C1514g.this.m7947z1();
            this.f5998q = i11;
        }

        /* JADX INFO: renamed from: b */
        public void m7901b(C1512e c1512e) {
            if (this.f5982a == 0) {
                int iM7886m2 = C1514g.this.m7886m2(c1512e, this.f5998q);
                if (c1512e.m7703A() == C1512e.b.MATCH_CONSTRAINT) {
                    this.f5997p++;
                    iM7886m2 = 0;
                }
                this.f5993l += iM7886m2 + (c1512e.m7745V() != 8 ? C1514g.this.f5969m1 : 0);
                int iM7885l2 = C1514g.this.m7885l2(c1512e, this.f5998q);
                if (this.f5983b == null || this.f5984c < iM7885l2) {
                    this.f5983b = c1512e;
                    this.f5984c = iM7885l2;
                    this.f5994m = iM7885l2;
                }
            } else {
                int iM7886m3 = C1514g.this.m7886m2(c1512e, this.f5998q);
                int iM7885l3 = C1514g.this.m7885l2(c1512e, this.f5998q);
                if (c1512e.m7741T() == C1512e.b.MATCH_CONSTRAINT) {
                    this.f5997p++;
                    iM7885l3 = 0;
                }
                this.f5994m += iM7885l3 + (c1512e.m7745V() != 8 ? C1514g.this.f5970n1 : 0);
                if (this.f5983b == null || this.f5984c < iM7886m3) {
                    this.f5983b = c1512e;
                    this.f5984c = iM7886m3;
                    this.f5993l = iM7886m3;
                }
            }
            this.f5996o++;
        }

        /* JADX INFO: renamed from: c */
        public void m7902c() {
            this.f5984c = 0;
            this.f5983b = null;
            this.f5993l = 0;
            this.f5994m = 0;
            this.f5995n = 0;
            this.f5996o = 0;
            this.f5997p = 0;
        }

        /* JADX INFO: renamed from: d */
        public void m7903d(boolean z10, int i10, boolean z11) {
            C1512e c1512e;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f5996o;
            for (int i13 = 0; i13 < i12 && this.f5995n + i13 < C1514g.this.f5981y1; i13++) {
                C1512e c1512e2 = C1514g.this.f5980x1[this.f5995n + i13];
                if (c1512e2 != null) {
                    c1512e2.m7807u0();
                }
            }
            if (i12 == 0 || this.f5983b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f5995n + i17 >= C1514g.this.f5981y1) {
                    break;
                }
                C1512e c1512e3 = C1514g.this.f5980x1[this.f5995n + i17];
                if (c1512e3 != null && c1512e3.m7745V() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            C1512e c1512e4 = null;
            if (this.f5982a != 0) {
                C1512e c1512e5 = this.f5983b;
                c1512e5.m7732O0(C1514g.this.f5957a1);
                int i18 = this.f5989h;
                if (i10 > 0) {
                    i18 += C1514g.this.f5969m1;
                }
                if (z10) {
                    c1512e5.f5859Q.m7681a(this.f5987f, i18);
                    if (z11) {
                        c1512e5.f5857O.m7681a(this.f5985d, this.f5991j);
                    }
                    if (i10 > 0) {
                        this.f5987f.f5816d.f5857O.m7681a(c1512e5.f5859Q, 0);
                    }
                } else {
                    c1512e5.f5857O.m7681a(this.f5985d, i18);
                    if (z11) {
                        c1512e5.f5859Q.m7681a(this.f5987f, this.f5991j);
                    }
                    if (i10 > 0) {
                        this.f5985d.f5816d.f5859Q.m7681a(c1512e5.f5857O, 0);
                    }
                }
                for (int i19 = 0; i19 < i12 && this.f5995n + i19 < C1514g.this.f5981y1; i19++) {
                    C1512e c1512e6 = C1514g.this.f5980x1[this.f5995n + i19];
                    if (c1512e6 != null) {
                        if (i19 == 0) {
                            c1512e6.m7780k(c1512e6.f5858P, this.f5986e, this.f5990i);
                            int i20 = C1514g.this.f5958b1;
                            float f12 = C1514g.this.f5964h1;
                            if (this.f5995n == 0 && C1514g.this.f5960d1 != -1) {
                                i20 = C1514g.this.f5960d1;
                                f12 = C1514g.this.f5966j1;
                            } else if (z11 && C1514g.this.f5962f1 != -1) {
                                i20 = C1514g.this.f5962f1;
                                f12 = C1514g.this.f5968l1;
                            }
                            c1512e6.m7769f1(i20);
                            c1512e6.m7766e1(f12);
                        }
                        if (i19 == i12 - 1) {
                            c1512e6.m7780k(c1512e6.f5860R, this.f5988g, this.f5992k);
                        }
                        if (c1512e4 != null) {
                            c1512e6.f5858P.m7681a(c1512e4.f5860R, C1514g.this.f5970n1);
                            if (i19 == i14) {
                                c1512e6.f5858P.m7701u(this.f5990i);
                            }
                            c1512e4.f5860R.m7681a(c1512e6.f5858P, 0);
                            if (i19 == i15 + 1) {
                                c1512e4.f5860R.m7701u(this.f5992k);
                            }
                        }
                        if (c1512e6 != c1512e5) {
                            if (z10) {
                                int i21 = C1514g.this.f5971o1;
                                if (i21 == 0) {
                                    c1512e6.f5859Q.m7681a(c1512e5.f5859Q, 0);
                                } else if (i21 == 1) {
                                    c1512e6.f5857O.m7681a(c1512e5.f5857O, 0);
                                } else if (i21 == 2) {
                                    c1512e6.f5857O.m7681a(c1512e5.f5857O, 0);
                                    c1512e6.f5859Q.m7681a(c1512e5.f5859Q, 0);
                                }
                            } else {
                                int i22 = C1514g.this.f5971o1;
                                if (i22 == 0) {
                                    c1512e6.f5857O.m7681a(c1512e5.f5857O, 0);
                                } else if (i22 == 1) {
                                    c1512e6.f5859Q.m7681a(c1512e5.f5859Q, 0);
                                } else if (i22 == 2) {
                                    if (z12) {
                                        c1512e6.f5857O.m7681a(this.f5985d, this.f5989h);
                                        c1512e6.f5859Q.m7681a(this.f5987f, this.f5991j);
                                    } else {
                                        c1512e6.f5857O.m7681a(c1512e5.f5857O, 0);
                                        c1512e6.f5859Q.m7681a(c1512e5.f5859Q, 0);
                                    }
                                }
                            }
                        }
                        c1512e4 = c1512e6;
                    }
                }
                return;
            }
            C1512e c1512e7 = this.f5983b;
            c1512e7.m7769f1(C1514g.this.f5958b1);
            int i23 = this.f5990i;
            if (i10 > 0) {
                i23 += C1514g.this.f5970n1;
            }
            c1512e7.f5858P.m7681a(this.f5986e, i23);
            if (z11) {
                c1512e7.f5860R.m7681a(this.f5988g, this.f5992k);
            }
            if (i10 > 0) {
                this.f5986e.f5816d.f5860R.m7681a(c1512e7.f5858P, 0);
            }
            char c11 = 3;
            if (C1514g.this.f5972p1 != 3 || c1512e7.m7753Z()) {
                c1512e = c1512e7;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i12) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f5995n + i25 < C1514g.this.f5981y1) {
                        c1512e = C1514g.this.f5980x1[this.f5995n + i25];
                        if (c1512e.m7753Z()) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                c1512e = c1512e7;
                break;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f5995n + i27 >= C1514g.this.f5981y1) {
                    return;
                }
                C1512e c1512e8 = C1514g.this.f5980x1[this.f5995n + i27];
                if (c1512e8 == null) {
                    c1512e8 = c1512e4;
                    c10 = c11;
                } else {
                    if (i26 == 0) {
                        i11 = 1;
                        c1512e8.m7780k(c1512e8.f5857O, this.f5985d, this.f5989h);
                    } else {
                        i11 = 1;
                    }
                    if (i27 == 0) {
                        int i28 = C1514g.this.f5957a1;
                        float f13 = C1514g.this.f5963g1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f5995n == 0 && C1514g.this.f5959c1 != -1) {
                            i28 = C1514g.this.f5959c1;
                            if (z10) {
                                f11 = C1514g.this.f5965i1;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = C1514g.this.f5965i1;
                            }
                            f13 = f10;
                        } else if (z11 && C1514g.this.f5961e1 != -1) {
                            i28 = C1514g.this.f5961e1;
                            if (z10) {
                                f11 = C1514g.this.f5967k1;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = C1514g.this.f5967k1;
                            }
                            f13 = f10;
                        }
                        c1512e8.m7732O0(i28);
                        c1512e8.m7730N0(f13);
                    }
                    if (i26 == i12 - 1) {
                        c1512e8.m7780k(c1512e8.f5859Q, this.f5987f, this.f5991j);
                    }
                    if (c1512e4 != null) {
                        c1512e8.f5857O.m7681a(c1512e4.f5859Q, C1514g.this.f5969m1);
                        if (i26 == i14) {
                            c1512e8.f5857O.m7701u(this.f5989h);
                        }
                        c1512e4.f5859Q.m7681a(c1512e8.f5857O, 0);
                        if (i26 == i15 + 1) {
                            c1512e4.f5859Q.m7701u(this.f5991j);
                        }
                    }
                    if (c1512e8 != c1512e7) {
                        c10 = 3;
                        if (C1514g.this.f5972p1 == 3 && c1512e.m7753Z() && c1512e8 != c1512e && c1512e8.m7753Z()) {
                            c1512e8.f5861S.m7681a(c1512e.f5861S, 0);
                        } else {
                            int i29 = C1514g.this.f5972p1;
                            if (i29 == 0) {
                                c1512e8.f5858P.m7681a(c1512e7.f5858P, 0);
                            } else if (i29 == i11) {
                                c1512e8.f5860R.m7681a(c1512e7.f5860R, 0);
                            } else if (z12) {
                                c1512e8.f5858P.m7681a(this.f5986e, this.f5990i);
                                c1512e8.f5860R.m7681a(this.f5988g, this.f5992k);
                            } else {
                                c1512e8.f5858P.m7681a(c1512e7.f5858P, 0);
                                c1512e8.f5860R.m7681a(c1512e7.f5860R, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i26++;
                c11 = c10;
                c1512e4 = c1512e8;
            }
        }

        /* JADX INFO: renamed from: e */
        public int m7904e() {
            return this.f5982a == 1 ? this.f5994m - C1514g.this.f5970n1 : this.f5994m;
        }

        /* JADX INFO: renamed from: f */
        public int m7905f() {
            return this.f5982a == 0 ? this.f5993l - C1514g.this.f5969m1 : this.f5993l;
        }

        /* JADX INFO: renamed from: g */
        public void m7906g(int i10) {
            int i11 = this.f5997p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f5996o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f5995n + i14 < C1514g.this.f5981y1; i14++) {
                C1512e c1512e = C1514g.this.f5980x1[this.f5995n + i14];
                if (this.f5982a == 0) {
                    if (c1512e != null && c1512e.m7703A() == C1512e.b.MATCH_CONSTRAINT && c1512e.f5913w == 0) {
                        C1514g.this.m7930E1(c1512e, C1512e.b.FIXED, i13, c1512e.m7741T(), c1512e.m7812x());
                    }
                } else if (c1512e != null && c1512e.m7741T() == C1512e.b.MATCH_CONSTRAINT && c1512e.f5915x == 0) {
                    int i15 = i13;
                    C1514g.this.m7930E1(c1512e, c1512e.m7703A(), c1512e.m7747W(), C1512e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            m7907h();
        }

        /* JADX INFO: renamed from: h */
        public final void m7907h() {
            this.f5993l = 0;
            this.f5994m = 0;
            this.f5983b = null;
            this.f5984c = 0;
            int i10 = this.f5996o;
            for (int i11 = 0; i11 < i10 && this.f5995n + i11 < C1514g.this.f5981y1; i11++) {
                C1512e c1512e = C1514g.this.f5980x1[this.f5995n + i11];
                if (this.f5982a == 0) {
                    int iM7747W = c1512e.m7747W();
                    int i12 = C1514g.this.f5969m1;
                    if (c1512e.m7745V() == 8) {
                        i12 = 0;
                    }
                    this.f5993l += iM7747W + i12;
                    int iM7885l2 = C1514g.this.m7885l2(c1512e, this.f5998q);
                    if (this.f5983b == null || this.f5984c < iM7885l2) {
                        this.f5983b = c1512e;
                        this.f5984c = iM7885l2;
                        this.f5994m = iM7885l2;
                    }
                } else {
                    int iM7886m2 = C1514g.this.m7886m2(c1512e, this.f5998q);
                    int iM7885l3 = C1514g.this.m7885l2(c1512e, this.f5998q);
                    int i13 = C1514g.this.f5970n1;
                    if (c1512e.m7745V() == 8) {
                        i13 = 0;
                    }
                    this.f5994m += iM7885l3 + i13;
                    if (this.f5983b == null || this.f5984c < iM7886m2) {
                        this.f5983b = c1512e;
                        this.f5984c = iM7886m2;
                        this.f5993l = iM7886m2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m7908i(int i10) {
            this.f5995n = i10;
        }

        /* JADX INFO: renamed from: j */
        public void m7909j(int i10, C1511d c1511d, C1511d c1511d2, C1511d c1511d3, C1511d c1511d4, int i11, int i12, int i13, int i14, int i15) {
            this.f5982a = i10;
            this.f5985d = c1511d;
            this.f5986e = c1511d2;
            this.f5987f = c1511d3;
            this.f5988g = c1511d4;
            this.f5989h = i11;
            this.f5990i = i12;
            this.f5991j = i13;
            this.f5992k = i14;
            this.f5998q = i15;
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m7873A2(int i10) {
        this.f5961e1 = i10;
    }

    /* JADX INFO: renamed from: B2 */
    public void m7874B2(float f10) {
        this.f5968l1 = f10;
    }

    /* JADX INFO: renamed from: C2 */
    public void m7875C2(int i10) {
        this.f5962f1 = i10;
    }

    @Override // p038c2.C1519l
    /* JADX INFO: renamed from: D1 */
    public void mo7876D1(int i10, int i11, int i12, int i13) {
        int i14;
        C1512e[] c1512eArr;
        if (this.f6010M0 > 0 && !m7931F1()) {
            m7934I1(0, 0);
            m7933H1(false);
            return;
        }
        int iM7927A1 = m7927A1();
        int iM7928B1 = m7928B1();
        int iM7929C1 = m7929C1();
        int iM7947z1 = m7947z1();
        int[] iArr = new int[2];
        int i15 = (i11 - iM7927A1) - iM7928B1;
        int i16 = this.f5975s1;
        if (i16 == 1) {
            i15 = (i13 - iM7929C1) - iM7947z1;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f5957a1 == -1) {
                this.f5957a1 = 0;
            }
            if (this.f5958b1 == -1) {
                this.f5958b1 = 0;
            }
        } else {
            if (this.f5957a1 == -1) {
                this.f5957a1 = 0;
            }
            if (this.f5958b1 == -1) {
                this.f5958b1 = 0;
            }
        }
        C1512e[] c1512eArr2 = this.f6009L0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.f6010M0;
            if (i18 >= i14) {
                break;
            }
            if (this.f6009L0[i18].m7745V() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            C1512e[] c1512eArr3 = new C1512e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.f6010M0) {
                C1512e c1512e = this.f6009L0[i20];
                C1512e[] c1512eArr4 = c1512eArr3;
                if (c1512e.m7745V() != 8) {
                    c1512eArr4[i14] = c1512e;
                    i14++;
                }
                i20++;
                c1512eArr3 = c1512eArr4;
            }
            c1512eArr = c1512eArr3;
        } else {
            c1512eArr = c1512eArr2;
        }
        int i21 = i14;
        this.f5980x1 = c1512eArr;
        this.f5981y1 = i21;
        int i22 = this.f5973q1;
        if (i22 == 0) {
            m7890q2(c1512eArr, i21, this.f5975s1, i17, iArr);
        } else if (i22 == 1) {
            m7888o2(c1512eArr, i21, this.f5975s1, i17, iArr);
        } else if (i22 == 2) {
            m7887n2(c1512eArr, i21, this.f5975s1, i17, iArr);
        } else if (i22 == 3) {
            m7889p2(c1512eArr, i21, this.f5975s1, i17, iArr);
        }
        int iMin = iArr[0] + iM7927A1 + iM7928B1;
        int iMin2 = iArr[1] + iM7929C1 + iM7947z1;
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
        m7934I1(iMin, iMin2);
        m7785l1(iMin);
        m7728M0(iMin2);
        m7933H1(this.f6010M0 > 0);
    }

    /* JADX INFO: renamed from: D2 */
    public void m7877D2(int i10) {
        this.f5974r1 = i10;
    }

    /* JADX INFO: renamed from: E2 */
    public void m7878E2(int i10) {
        this.f5975s1 = i10;
    }

    /* JADX INFO: renamed from: F2 */
    public void m7879F2(int i10) {
        this.f5972p1 = i10;
    }

    /* JADX INFO: renamed from: G2 */
    public void m7880G2(float f10) {
        this.f5964h1 = f10;
    }

    /* JADX INFO: renamed from: H2 */
    public void m7881H2(int i10) {
        this.f5970n1 = i10;
    }

    /* JADX INFO: renamed from: I2 */
    public void m7882I2(int i10) {
        this.f5958b1 = i10;
    }

    /* JADX INFO: renamed from: J2 */
    public void m7883J2(int i10) {
        this.f5973q1 = i10;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: g */
    public void mo7666g(C13682d c13682d, boolean z10) {
        super.mo7666g(c13682d, z10);
        boolean z11 = m7723K() != null && ((C1513f) m7723K()).m7837R1();
        int i10 = this.f5973q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f5976t1.size();
                int i11 = 0;
                while (i11 < size) {
                    this.f5976t1.get(i11).m7903d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                m7884k2(z11);
            } else if (i10 == 3) {
                int size2 = this.f5976t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    this.f5976t1.get(i12).m7903d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f5976t1.size() > 0) {
            this.f5976t1.get(0).m7903d(z11, 0, true);
        }
        m7933H1(false);
    }

    /* JADX INFO: renamed from: k2 */
    public final void m7884k2(boolean z10) {
        C1512e c1512e;
        float f10;
        int i10;
        if (this.f5979w1 == null || this.f5978v1 == null || this.f5977u1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f5981y1; i11++) {
            this.f5980x1[i11].m7807u0();
        }
        int[] iArr = this.f5979w1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f5963g1;
        C1512e c1512e2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f5963g1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            C1512e c1512e3 = this.f5978v1[i10];
            if (c1512e3 != null && c1512e3.m7745V() != 8) {
                if (i14 == 0) {
                    c1512e3.m7780k(c1512e3.f5857O, this.f5857O, m7927A1());
                    c1512e3.m7732O0(this.f5957a1);
                    c1512e3.m7730N0(f10);
                }
                if (i14 == i12 - 1) {
                    c1512e3.m7780k(c1512e3.f5859Q, this.f5859Q, m7928B1());
                }
                if (i14 > 0 && c1512e2 != null) {
                    c1512e3.m7780k(c1512e3.f5857O, c1512e2.f5859Q, this.f5969m1);
                    c1512e2.m7780k(c1512e2.f5859Q, c1512e3.f5857O, 0);
                }
                c1512e2 = c1512e3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            C1512e c1512e4 = this.f5977u1[i15];
            if (c1512e4 != null && c1512e4.m7745V() != 8) {
                if (i15 == 0) {
                    c1512e4.m7780k(c1512e4.f5858P, this.f5858P, m7929C1());
                    c1512e4.m7769f1(this.f5958b1);
                    c1512e4.m7766e1(this.f5964h1);
                }
                if (i15 == i13 - 1) {
                    c1512e4.m7780k(c1512e4.f5860R, this.f5860R, m7947z1());
                }
                if (i15 > 0 && c1512e2 != null) {
                    c1512e4.m7780k(c1512e4.f5858P, c1512e2.f5860R, this.f5970n1);
                    c1512e2.m7780k(c1512e2.f5860R, c1512e4.f5858P, 0);
                }
                c1512e2 = c1512e4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f5975s1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                C1512e[] c1512eArr = this.f5980x1;
                if (i18 < c1512eArr.length && (c1512e = c1512eArr[i18]) != null && c1512e.m7745V() != 8) {
                    C1512e c1512e5 = this.f5978v1[i16];
                    C1512e c1512e6 = this.f5977u1[i17];
                    if (c1512e != c1512e5) {
                        c1512e.m7780k(c1512e.f5857O, c1512e5.f5857O, 0);
                        c1512e.m7780k(c1512e.f5859Q, c1512e5.f5859Q, 0);
                    }
                    if (c1512e != c1512e6) {
                        c1512e.m7780k(c1512e.f5858P, c1512e6.f5858P, 0);
                        c1512e.m7780k(c1512e.f5860R, c1512e6.f5860R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final int m7885l2(C1512e c1512e, int i10) {
        C1512e c1512e2;
        if (c1512e == null) {
            return 0;
        }
        if (c1512e.m7741T() == C1512e.b.MATCH_CONSTRAINT) {
            int i11 = c1512e.f5915x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c1512e.f5841E * i10);
                if (i12 != c1512e.m7812x()) {
                    c1512e.m7754Z0(true);
                    m7930E1(c1512e, c1512e.m7703A(), c1512e.m7747W(), C1512e.b.FIXED, i12);
                }
                return i12;
            }
            c1512e2 = c1512e;
            if (i11 == 1) {
                return c1512e2.m7812x();
            }
            if (i11 == 3) {
                return (int) ((c1512e2.m7747W() * c1512e2.f5876d0) + 0.5f);
            }
        } else {
            c1512e2 = c1512e;
        }
        return c1512e2.m7812x();
    }

    /* JADX INFO: renamed from: m2 */
    public final int m7886m2(C1512e c1512e, int i10) {
        C1512e c1512e2;
        if (c1512e == null) {
            return 0;
        }
        if (c1512e.m7703A() == C1512e.b.MATCH_CONSTRAINT) {
            int i11 = c1512e.f5913w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c1512e.f5835B * i10);
                if (i12 != c1512e.m7747W()) {
                    c1512e.m7754Z0(true);
                    m7930E1(c1512e, C1512e.b.FIXED, i12, c1512e.m7741T(), c1512e.m7812x());
                }
                return i12;
            }
            c1512e2 = c1512e;
            if (i11 == 1) {
                return c1512e2.m7747W();
            }
            if (i11 == 3) {
                return (int) ((c1512e2.m7812x() * c1512e2.f5876d0) + 0.5f);
            }
        } else {
            c1512e2 = c1512e;
        }
        return c1512e2.m7747W();
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
    /* JADX INFO: renamed from: n2 */
    public final void m7887n2(p038c2.C1512e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L26
            int r1 = r10.f5974r1
            if (r1 > 0) goto L23
            r1 = r0
            r2 = r1
            r3 = r2
        La:
            if (r2 >= r12) goto L23
            if (r2 <= 0) goto L11
            int r4 = r10.f5969m1
            int r3 = r3 + r4
        L11:
            r4 = r11[r2]
            if (r4 != 0) goto L16
            goto L20
        L16:
            int r4 = r10.m7886m2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L1e
            goto L23
        L1e:
            int r1 = r1 + 1
        L20:
            int r2 = r2 + 1
            goto La
        L23:
            r2 = r1
            r1 = r0
            goto L47
        L26:
            int r1 = r10.f5974r1
            if (r1 > 0) goto L46
            r1 = r0
            r2 = r1
            r3 = r2
        L2d:
            if (r2 >= r12) goto L46
            if (r2 <= 0) goto L34
            int r4 = r10.f5970n1
            int r3 = r3 + r4
        L34:
            r4 = r11[r2]
            if (r4 != 0) goto L39
            goto L43
        L39:
            int r4 = r10.m7885l2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L41
            goto L46
        L41:
            int r1 = r1 + 1
        L43:
            int r2 = r2 + 1
            goto L2d
        L46:
            r2 = r0
        L47:
            int[] r3 = r10.f5979w1
            if (r3 != 0) goto L50
            r3 = 2
            int[] r3 = new int[r3]
            r10.f5979w1 = r3
        L50:
            r3 = 1
            if (r1 != 0) goto L55
            if (r13 == r3) goto L59
        L55:
            if (r2 != 0) goto L5b
            if (r13 != 0) goto L5b
        L59:
            r4 = r3
            goto L5c
        L5b:
            r4 = r0
        L5c:
            if (r4 != 0) goto L11d
            if (r13 != 0) goto L6a
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L73
        L6a:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L73:
            c2.e[] r5 = r10.f5978v1
            r6 = 0
            if (r5 == 0) goto L80
            int r7 = r5.length
            if (r7 >= r2) goto L7c
            goto L80
        L7c:
            java.util.Arrays.fill(r5, r6)
            goto L84
        L80:
            c2.e[] r5 = new p038c2.C1512e[r2]
            r10.f5978v1 = r5
        L84:
            c2.e[] r5 = r10.f5977u1
            if (r5 == 0) goto L90
            int r7 = r5.length
            if (r7 >= r1) goto L8c
            goto L90
        L8c:
            java.util.Arrays.fill(r5, r6)
            goto L94
        L90:
            c2.e[] r5 = new p038c2.C1512e[r1]
            r10.f5977u1 = r5
        L94:
            r5 = r0
        L95:
            if (r5 >= r2) goto Ld9
            r6 = r0
        L98:
            if (r6 >= r1) goto Ld6
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto La2
            int r7 = r5 * r1
            int r7 = r7 + r6
        La2:
            int r8 = r11.length
            if (r7 < r8) goto La6
            goto Ld3
        La6:
            r7 = r11[r7]
            if (r7 != 0) goto Lab
            goto Ld3
        Lab:
            int r8 = r10.m7886m2(r7, r14)
            c2.e[] r9 = r10.f5978v1
            r9 = r9[r5]
            if (r9 == 0) goto Lbb
            int r9 = r9.m7747W()
            if (r9 >= r8) goto Lbf
        Lbb:
            c2.e[] r8 = r10.f5978v1
            r8[r5] = r7
        Lbf:
            int r8 = r10.m7885l2(r7, r14)
            c2.e[] r9 = r10.f5977u1
            r9 = r9[r6]
            if (r9 == 0) goto Lcf
            int r9 = r9.m7812x()
            if (r9 >= r8) goto Ld3
        Lcf:
            c2.e[] r8 = r10.f5977u1
            r8[r6] = r7
        Ld3:
            int r6 = r6 + 1
            goto L98
        Ld6:
            int r5 = r5 + 1
            goto L95
        Ld9:
            r5 = r0
            r6 = r5
        Ldb:
            if (r5 >= r2) goto Lf0
            c2.e[] r7 = r10.f5978v1
            r7 = r7[r5]
            if (r7 == 0) goto Led
            if (r5 <= 0) goto Le8
            int r8 = r10.f5969m1
            int r6 = r6 + r8
        Le8:
            int r7 = r10.m7886m2(r7, r14)
            int r6 = r6 + r7
        Led:
            int r5 = r5 + 1
            goto Ldb
        Lf0:
            r5 = r0
            r7 = r5
        Lf2:
            if (r5 >= r1) goto L107
            c2.e[] r8 = r10.f5977u1
            r8 = r8[r5]
            if (r8 == 0) goto L104
            if (r5 <= 0) goto Lff
            int r9 = r10.f5970n1
            int r7 = r7 + r9
        Lff:
            int r8 = r10.m7885l2(r8, r14)
            int r7 = r7 + r8
        L104:
            int r5 = r5 + 1
            goto Lf2
        L107:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L115
            if (r6 <= r14) goto L59
            if (r2 <= r3) goto L59
            int r2 = r2 + (-1)
            goto L5c
        L115:
            if (r7 <= r14) goto L59
            if (r1 <= r3) goto L59
            int r1 = r1 + (-1)
            goto L5c
        L11d:
            int[] r11 = r10.f5979w1
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p038c2.C1514g.m7887n2(c2.e[], int, int, int, int[]):void");
    }

    /* JADX INFO: renamed from: o2 */
    public final void m7888o2(C1512e[] c1512eArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        C1514g c1514g;
        int i14;
        C1511d c1511d;
        int i15;
        C1514g c1514g2 = this;
        if (i10 == 0) {
            return;
        }
        c1514g2.f5976t1.clear();
        int i16 = i12;
        a aVar = c1514g2.new a(i11, c1514g2.f5857O, c1514g2.f5858P, c1514g2.f5859Q, c1514g2.f5860R, i16);
        c1514g2.f5976t1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C1512e c1512e = c1512eArr[i18];
                int iM7886m2 = c1514g2.m7886m2(c1512e, i16);
                if (c1512e.m7703A() == C1512e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (c1514g2.f5969m1 + i17) + iM7886m2 > i16) && aVar.f5983b != null;
                if (!z10 && i18 > 0 && (i15 = c1514g2.f5974r1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = c1514g2.new a(i11, c1514g2.f5857O, c1514g2.f5858P, c1514g2.f5859Q, c1514g2.f5860R, i16);
                    aVar.m7908i(i18);
                    c1514g2.f5976t1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += c1514g2.f5969m1 + iM7886m2;
                    }
                    aVar.m7901b(c1512e);
                    i18++;
                    i13 = i19;
                }
                i17 = iM7886m2;
                aVar.m7901b(c1512e);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                C1512e c1512e2 = c1512eArr[i21];
                int iM7885l2 = c1514g2.m7885l2(c1512e2, i16);
                if (c1512e2.m7741T() == C1512e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (c1514g2.f5970n1 + i20) + iM7885l2 > i16) && aVar.f5983b != null;
                if (!z11 && i21 > 0 && (i14 = c1514g2.f5974r1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = c1514g2.new a(i11, c1514g2.f5857O, c1514g2.f5858P, c1514g2.f5859Q, c1514g2.f5860R, i16);
                    c1514g = c1514g2;
                    aVar.m7908i(i21);
                    c1514g.f5976t1.add(aVar);
                } else {
                    c1514g = c1514g2;
                    if (i21 > 0) {
                        i20 += c1514g.f5970n1 + iM7885l2;
                    }
                    aVar.m7901b(c1512e2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    c1514g2 = c1514g;
                }
                i20 = iM7885l2;
                aVar.m7901b(c1512e2);
                i21++;
                i16 = i12;
                i13 = i22;
                c1514g2 = c1514g;
            }
        }
        C1514g c1514g3 = c1514g2;
        int size = c1514g3.f5976t1.size();
        C1511d c1511d2 = c1514g3.f5857O;
        C1511d c1511d3 = c1514g3.f5858P;
        C1511d c1511d4 = c1514g3.f5859Q;
        C1511d c1511d5 = c1514g3.f5860R;
        int iM7927A1 = c1514g3.m7927A1();
        int iM7929C1 = c1514g3.m7929C1();
        int iM7928B1 = c1514g3.m7928B1();
        int iM7947z1 = c1514g3.m7947z1();
        C1512e.b bVarM7703A = c1514g3.m7703A();
        C1512e.b bVar = C1512e.b.WRAP_CONTENT;
        boolean z12 = bVarM7703A == bVar || c1514g3.m7741T() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = c1514g3.f5976t1.get(i23);
                if (i11 == 0) {
                    aVar2.m7906g(i12 - aVar2.m7905f());
                } else {
                    aVar2.m7906g(i12 - aVar2.m7904e());
                }
            }
        }
        C1511d c1511d6 = c1511d2;
        int iM7947z2 = iM7947z1;
        int i24 = 0;
        int iM7928B2 = iM7928B1;
        int i25 = iM7929C1;
        int i26 = iM7927A1;
        C1511d c1511d7 = c1511d5;
        C1511d c1511d8 = c1511d4;
        C1511d c1511d9 = c1511d3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = c1514g3.f5976t1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    c1511d7 = c1514g3.f5976t1.get(i28 + 1).f5983b.f5858P;
                    iM7947z2 = 0;
                } else {
                    c1511d7 = c1514g3.f5860R;
                    iM7947z2 = c1514g3.m7947z1();
                }
                C1511d c1511d10 = aVar3.f5983b.f5860R;
                int i29 = i27;
                aVar3.m7909j(i11, c1511d6, c1511d9, c1511d8, c1511d7, i26, i25, iM7928B2, iM7947z2, i12);
                int iMax = Math.max(i24, aVar3.m7905f());
                int iM7904e = aVar3.m7904e() + i29;
                if (i28 > 0) {
                    iM7904e += c1514g3.f5970n1;
                }
                i27 = iM7904e;
                i24 = iMax;
                c1511d9 = c1511d10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    c1511d = c1514g3.f5976t1.get(i28 + 1).f5983b.f5857O;
                    iM7928B2 = 0;
                } else {
                    c1511d = c1514g3.f5859Q;
                    iM7928B2 = c1514g3.m7928B1();
                }
                c1511d8 = c1511d;
                C1511d c1511d11 = aVar3.f5983b.f5859Q;
                aVar3.m7909j(i11, c1511d6, c1511d9, c1511d8, c1511d7, i26, i25, iM7928B2, iM7947z2, i12);
                int iM7905f = aVar3.m7905f() + i30;
                int iMax2 = Math.max(i31, aVar3.m7904e());
                if (i28 > 0) {
                    iM7905f += c1514g3.f5969m1;
                }
                int i32 = iM7905f;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                c1511d6 = c1511d11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    /* JADX INFO: renamed from: p2 */
    public final void m7889p2(C1512e[] c1512eArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        C1514g c1514g;
        int i14;
        C1511d c1511d;
        int i15;
        C1514g c1514g2 = this;
        if (i10 == 0) {
            return;
        }
        c1514g2.f5976t1.clear();
        int i16 = i12;
        a aVar = c1514g2.new a(i11, c1514g2.f5857O, c1514g2.f5858P, c1514g2.f5859Q, c1514g2.f5860R, i16);
        c1514g2.f5976t1.add(aVar);
        boolean z10 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                C1512e c1512e = c1512eArr[i19];
                int iM7886m2 = c1514g2.m7886m2(c1512e, i16);
                if (c1512e.m7703A() == C1512e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z11 = (i18 == i16 || (c1514g2.f5969m1 + i18) + iM7886m2 > i16) && aVar.f5983b != null;
                if (!z11 && i19 > 0 && (i15 = c1514g2.f5974r1) > 0 && i17 > i15) {
                    z11 = true;
                }
                if (z11) {
                    aVar = c1514g2.new a(i11, c1514g2.f5857O, c1514g2.f5858P, c1514g2.f5859Q, c1514g2.f5860R, i16);
                    aVar.m7908i(i19);
                    c1514g2.f5976t1.add(aVar);
                    i17 = 1;
                } else {
                    if (i19 > 0) {
                        i18 += c1514g2.f5969m1 + iM7886m2;
                    }
                    aVar.m7901b(c1512e);
                    i19++;
                    i13 = i20;
                }
                i18 = iM7886m2;
                aVar.m7901b(c1512e);
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
                C1512e c1512e2 = c1512eArr[i23];
                int iM7885l2 = c1514g2.m7885l2(c1512e2, i16);
                if (c1512e2.m7741T() == C1512e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z12 = (i22 == i16 || (c1514g2.f5970n1 + i22) + iM7885l2 > i16) && aVar.f5983b != null;
                if (!z12 && i23 > 0 && (i14 = c1514g2.f5974r1) > 0 && i21 > i14) {
                    z12 = true;
                }
                if (z12) {
                    aVar = c1514g2.new a(i11, c1514g2.f5857O, c1514g2.f5858P, c1514g2.f5859Q, c1514g2.f5860R, i16);
                    c1514g = c1514g2;
                    aVar.m7908i(i23);
                    c1514g.f5976t1.add(aVar);
                    i21 = 1;
                } else {
                    c1514g = c1514g2;
                    if (i23 > 0) {
                        i22 += c1514g.f5970n1 + iM7885l2;
                    }
                    aVar.m7901b(c1512e2);
                    i23++;
                    i16 = i12;
                    i13 = i24;
                    c1514g2 = c1514g;
                }
                i22 = iM7885l2;
                aVar.m7901b(c1512e2);
                i23++;
                i16 = i12;
                i13 = i24;
                c1514g2 = c1514g;
            }
        }
        C1514g c1514g3 = c1514g2;
        int size = c1514g3.f5976t1.size();
        C1511d c1511d2 = c1514g3.f5857O;
        C1511d c1511d3 = c1514g3.f5858P;
        C1511d c1511d4 = c1514g3.f5859Q;
        C1511d c1511d5 = c1514g3.f5860R;
        int iM7927A1 = c1514g3.m7927A1();
        int iM7929C1 = c1514g3.m7929C1();
        int iM7928B1 = c1514g3.m7928B1();
        int iM7947z1 = c1514g3.m7947z1();
        C1512e.b bVarM7703A = c1514g3.m7703A();
        C1512e.b bVar = C1512e.b.WRAP_CONTENT;
        boolean z13 = bVarM7703A == bVar || c1514g3.m7741T() == bVar;
        if (i13 > 0 && z13) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = c1514g3.f5976t1.get(i25);
                if (i11 == 0) {
                    aVar2.m7906g(i12 - aVar2.m7905f());
                } else {
                    aVar2.m7906g(i12 - aVar2.m7904e());
                }
            }
        }
        C1511d c1511d6 = c1511d3;
        int iM7947z2 = iM7947z1;
        int i26 = 0;
        int i27 = 0;
        int iM7928B2 = iM7928B1;
        int i28 = iM7929C1;
        int i29 = iM7927A1;
        C1511d c1511d7 = c1511d5;
        C1511d c1511d8 = c1511d4;
        C1511d c1511d9 = c1511d2;
        int i30 = 0;
        while (i27 < size) {
            a aVar3 = c1514g3.f5976t1.get(i27);
            if (i11 == 0) {
                if (i27 < size - 1) {
                    c1511d7 = c1514g3.f5976t1.get(i27 + 1).f5983b.f5858P;
                    iM7947z2 = 0;
                } else {
                    c1511d7 = c1514g3.f5860R;
                    iM7947z2 = c1514g3.m7947z1();
                }
                C1511d c1511d10 = aVar3.f5983b.f5860R;
                int i31 = i26;
                aVar3.m7909j(i11, c1511d9, c1511d6, c1511d8, c1511d7, i29, i28, iM7928B2, iM7947z2, i12);
                int iMax = Math.max(i30, aVar3.m7905f());
                int iM7904e = aVar3.m7904e() + i31;
                if (i27 > 0) {
                    iM7904e += c1514g3.f5970n1;
                }
                i26 = iM7904e;
                i30 = iMax;
                c1511d6 = c1511d10;
                i28 = 0;
            } else {
                int i32 = i26;
                int i33 = i30;
                if (i27 < size - 1) {
                    c1511d = c1514g3.f5976t1.get(i27 + 1).f5983b.f5857O;
                    iM7928B2 = 0;
                } else {
                    c1511d = c1514g3.f5859Q;
                    iM7928B2 = c1514g3.m7928B1();
                }
                c1511d8 = c1511d;
                C1511d c1511d11 = aVar3.f5983b.f5859Q;
                aVar3.m7909j(i11, c1511d9, c1511d6, c1511d8, c1511d7, i29, i28, iM7928B2, iM7947z2, i12);
                int iM7905f = aVar3.m7905f() + i33;
                int iMax2 = Math.max(i32, aVar3.m7904e());
                if (i27 > 0) {
                    iM7905f += c1514g3.f5969m1;
                }
                int i34 = iM7905f;
                i26 = iMax2;
                i30 = i34;
                i29 = 0;
                c1511d9 = c1511d11;
            }
            i27++;
            z10 = z10;
        }
        iArr[0] = i30;
        iArr[z10 ? 1 : 0] = i26;
    }

    /* JADX INFO: renamed from: q2 */
    public final void m7890q2(C1512e[] c1512eArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f5976t1.size() == 0) {
            aVar = new a(i11, this.f5857O, this.f5858P, this.f5859Q, this.f5860R, i12);
            this.f5976t1.add(aVar);
        } else {
            a aVar2 = this.f5976t1.get(0);
            aVar2.m7902c();
            aVar2.m7909j(i11, this.f5857O, this.f5858P, this.f5859Q, this.f5860R, m7927A1(), m7929C1(), m7928B1(), m7947z1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.m7901b(c1512eArr[i13]);
        }
        iArr[0] = aVar.m7905f();
        iArr[1] = aVar.m7904e();
    }

    /* JADX INFO: renamed from: r2 */
    public void m7891r2(float f10) {
        this.f5965i1 = f10;
    }

    /* JADX INFO: renamed from: s2 */
    public void m7892s2(int i10) {
        this.f5959c1 = i10;
    }

    /* JADX INFO: renamed from: t2 */
    public void m7893t2(float f10) {
        this.f5966j1 = f10;
    }

    /* JADX INFO: renamed from: u2 */
    public void m7894u2(int i10) {
        this.f5960d1 = i10;
    }

    /* JADX INFO: renamed from: v2 */
    public void m7895v2(int i10) {
        this.f5971o1 = i10;
    }

    /* JADX INFO: renamed from: w2 */
    public void m7896w2(float f10) {
        this.f5963g1 = f10;
    }

    /* JADX INFO: renamed from: x2 */
    public void m7897x2(int i10) {
        this.f5969m1 = i10;
    }

    /* JADX INFO: renamed from: y2 */
    public void m7898y2(int i10) {
        this.f5957a1 = i10;
    }

    /* JADX INFO: renamed from: z2 */
    public void m7899z2(float f10) {
        this.f5967k1 = f10;
    }
}
