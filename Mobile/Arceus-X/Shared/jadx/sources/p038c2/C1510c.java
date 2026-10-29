package p038c2;

import java.util.ArrayList;

/* JADX INFO: renamed from: c2.c */
/* JADX INFO: loaded from: classes.dex */
public class C1510c {

    /* JADX INFO: renamed from: a */
    public C1512e f5791a;

    /* JADX INFO: renamed from: b */
    public C1512e f5792b;

    /* JADX INFO: renamed from: c */
    public C1512e f5793c;

    /* JADX INFO: renamed from: d */
    public C1512e f5794d;

    /* JADX INFO: renamed from: e */
    public C1512e f5795e;

    /* JADX INFO: renamed from: f */
    public C1512e f5796f;

    /* JADX INFO: renamed from: g */
    public C1512e f5797g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C1512e> f5798h;

    /* JADX INFO: renamed from: i */
    public int f5799i;

    /* JADX INFO: renamed from: j */
    public int f5800j;

    /* JADX INFO: renamed from: k */
    public float f5801k = 0.0f;

    /* JADX INFO: renamed from: l */
    public int f5802l;

    /* JADX INFO: renamed from: m */
    public int f5803m;

    /* JADX INFO: renamed from: n */
    public int f5804n;

    /* JADX INFO: renamed from: o */
    public boolean f5805o;

    /* JADX INFO: renamed from: p */
    public int f5806p;

    /* JADX INFO: renamed from: q */
    public boolean f5807q;

    /* JADX INFO: renamed from: r */
    public boolean f5808r;

    /* JADX INFO: renamed from: s */
    public boolean f5809s;

    /* JADX INFO: renamed from: t */
    public boolean f5810t;

    /* JADX INFO: renamed from: u */
    public boolean f5811u;

    /* JADX INFO: renamed from: v */
    public boolean f5812v;

    public C1510c(C1512e c1512e, int i10, boolean z10) {
        this.f5791a = c1512e;
        this.f5806p = i10;
        this.f5807q = z10;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7678c(C1512e c1512e, int i10) {
        if (c1512e.m7745V() == 8 || c1512e.f5868Z[i10] != C1512e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = c1512e.f5917y[i10];
        return i11 == 0 || i11 == 3;
    }

    /* JADX INFO: renamed from: a */
    public void m7679a() {
        if (!this.f5812v) {
            m7680b();
        }
        this.f5812v = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7680b() {
        int i10 = this.f5806p * 2;
        C1512e c1512e = this.f5791a;
        this.f5805o = true;
        C1512e c1512e2 = c1512e;
        boolean z10 = false;
        while (!z10) {
            this.f5799i++;
            C1512e[] c1512eArr = c1512e.f5844F0;
            int i11 = this.f5806p;
            C1512e c1512e3 = null;
            c1512eArr[i11] = null;
            c1512e.f5842E0[i11] = null;
            if (c1512e.m7745V() != 8) {
                this.f5802l++;
                C1512e.b bVarM7806u = c1512e.m7806u(this.f5806p);
                C1512e.b bVar = C1512e.b.MATCH_CONSTRAINT;
                if (bVarM7806u != bVar) {
                    this.f5803m += c1512e.m7711E(this.f5806p);
                }
                int iM7686f = this.f5803m + c1512e.f5865W[i10].m7686f();
                this.f5803m = iM7686f;
                int i12 = i10 + 1;
                this.f5803m = iM7686f + c1512e.f5865W[i12].m7686f();
                int iM7686f2 = this.f5804n + c1512e.f5865W[i10].m7686f();
                this.f5804n = iM7686f2;
                this.f5804n = iM7686f2 + c1512e.f5865W[i12].m7686f();
                if (this.f5792b == null) {
                    this.f5792b = c1512e;
                }
                this.f5794d = c1512e;
                C1512e.b[] bVarArr = c1512e.f5868Z;
                int i13 = this.f5806p;
                if (bVarArr[i13] == bVar) {
                    int i14 = c1512e.f5917y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f5800j++;
                        float f10 = c1512e.f5840D0[i13];
                        if (f10 > 0.0f) {
                            this.f5801k += f10;
                        }
                        if (m7678c(c1512e, i13)) {
                            if (f10 < 0.0f) {
                                this.f5808r = true;
                            } else {
                                this.f5809s = true;
                            }
                            if (this.f5798h == null) {
                                this.f5798h = new ArrayList<>();
                            }
                            this.f5798h.add(c1512e);
                        }
                        if (this.f5796f == null) {
                            this.f5796f = c1512e;
                        }
                        C1512e c1512e4 = this.f5797g;
                        if (c1512e4 != null) {
                            c1512e4.f5842E0[this.f5806p] = c1512e;
                        }
                        this.f5797g = c1512e;
                    }
                    if (this.f5806p == 0) {
                        if (c1512e.f5913w != 0 || c1512e.f5919z != 0 || c1512e.f5833A != 0) {
                            this.f5805o = false;
                        }
                    } else if (c1512e.f5915x != 0 || c1512e.f5837C != 0 || c1512e.f5839D != 0) {
                        this.f5805o = false;
                    }
                    if (c1512e.f5876d0 != 0.0f) {
                        this.f5805o = false;
                        this.f5811u = true;
                    }
                }
            }
            if (c1512e2 != c1512e) {
                c1512e2.f5844F0[this.f5806p] = c1512e;
            }
            C1511d c1511d = c1512e.f5865W[i10 + 1].f5818f;
            if (c1511d != null) {
                C1512e c1512e5 = c1511d.f5816d;
                C1511d c1511d2 = c1512e5.f5865W[i10].f5818f;
                if (c1511d2 != null && c1511d2.f5816d == c1512e) {
                    c1512e3 = c1512e5;
                }
            }
            if (c1512e3 == null) {
                c1512e3 = c1512e;
                z10 = true;
            }
            c1512e2 = c1512e;
            c1512e = c1512e3;
        }
        C1512e c1512e6 = this.f5792b;
        if (c1512e6 != null) {
            this.f5803m -= c1512e6.f5865W[i10].m7686f();
        }
        C1512e c1512e7 = this.f5794d;
        if (c1512e7 != null) {
            this.f5803m -= c1512e7.f5865W[i10 + 1].m7686f();
        }
        this.f5793c = c1512e;
        if (this.f5806p == 0 && this.f5807q) {
            this.f5795e = c1512e;
        } else {
            this.f5795e = this.f5791a;
        }
        this.f5810t = this.f5809s && this.f5808r;
    }
}
