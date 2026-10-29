package p591z1;

import java.util.Arrays;

/* JADX INFO: renamed from: z1.j */
/* JADX INFO: loaded from: classes.dex */
public class C13688j implements C13680b.a {

    /* JADX INFO: renamed from: n */
    public static float f48051n = 0.001f;

    /* JADX INFO: renamed from: a */
    public final int f48052a = -1;

    /* JADX INFO: renamed from: b */
    public int f48053b = 16;

    /* JADX INFO: renamed from: c */
    public int f48054c = 16;

    /* JADX INFO: renamed from: d */
    public int[] f48055d = new int[16];

    /* JADX INFO: renamed from: e */
    public int[] f48056e = new int[16];

    /* JADX INFO: renamed from: f */
    public int[] f48057f = new int[16];

    /* JADX INFO: renamed from: g */
    public float[] f48058g = new float[16];

    /* JADX INFO: renamed from: h */
    public int[] f48059h = new int[16];

    /* JADX INFO: renamed from: i */
    public int[] f48060i = new int[16];

    /* JADX INFO: renamed from: j */
    public int f48061j = 0;

    /* JADX INFO: renamed from: k */
    public int f48062k = -1;

    /* JADX INFO: renamed from: l */
    public final C13680b f48063l;

    /* JADX INFO: renamed from: m */
    public final C13681c f48064m;

    public C13688j(C13680b c13680b, C13681c c13681c) {
        this.f48063l = c13680b;
        this.f48064m = c13681c;
        clear();
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: a */
    public float mo49907a(C13687i c13687i) {
        int iM50004p = m50004p(c13687i);
        if (iM50004p != -1) {
            return this.f48058g[iM50004p];
        }
        return 0.0f;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: b */
    public C13687i mo49908b(int i10) {
        int i11 = this.f48061j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f48062k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f48064m.f47989d[this.f48057f[i12]];
            }
            i12 = this.f48060i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: c */
    public void mo49909c(C13687i c13687i, float f10) {
        float f11 = f48051n;
        if (f10 > (-f11) && f10 < f11) {
            mo49916j(c13687i, true);
            return;
        }
        if (this.f48061j == 0) {
            m50001m(0, c13687i, f10);
            m50000l(c13687i, 0);
            this.f48062k = 0;
            return;
        }
        int iM50004p = m50004p(c13687i);
        if (iM50004p != -1) {
            this.f48058g[iM50004p] = f10;
            return;
        }
        if (this.f48061j + 1 >= this.f48053b) {
            m50003o();
        }
        int i10 = this.f48061j;
        int i11 = this.f48062k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f48057f[i11];
            int i15 = c13687i.f48030c;
            if (i14 == i15) {
                this.f48058g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f48060i[i11];
            if (i11 == -1) {
                break;
            }
        }
        m50005q(i12, c13687i, f10);
    }

    @Override // p591z1.C13680b.a
    public void clear() {
        int i10 = this.f48061j;
        for (int i11 = 0; i11 < i10; i11++) {
            C13687i c13687iMo49908b = mo49908b(i11);
            if (c13687iMo49908b != null) {
                c13687iMo49908b.m49994d(this.f48063l);
            }
        }
        for (int i12 = 0; i12 < this.f48053b; i12++) {
            this.f48057f[i12] = -1;
            this.f48056e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f48054c; i13++) {
            this.f48055d[i13] = -1;
        }
        this.f48061j = 0;
        this.f48062k = -1;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: d */
    public void mo49910d() {
        int i10 = this.f48061j;
        int i11 = this.f48062k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f48058g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f48060i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: e */
    public float mo49911e(C13680b c13680b, boolean z10) {
        float fMo49907a = mo49907a(c13680b.f47980a);
        mo49916j(c13680b.f47980a, z10);
        C13688j c13688j = (C13688j) c13680b.f47984e;
        int iMo49914h = c13688j.mo49914h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iMo49914h) {
            int i12 = c13688j.f48057f[i11];
            if (i12 != -1) {
                mo49912f(this.f48064m.f47989d[i12], c13688j.f48058g[i11] * fMo49907a, z10);
                i10++;
            }
            i11++;
        }
        return fMo49907a;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: f */
    public void mo49912f(C13687i c13687i, float f10, boolean z10) {
        float f11 = f48051n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iM50004p = m50004p(c13687i);
            if (iM50004p == -1) {
                mo49909c(c13687i, f10);
                return;
            }
            float[] fArr = this.f48058g;
            float f12 = fArr[iM50004p] + f10;
            fArr[iM50004p] = f12;
            float f13 = f48051n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iM50004p] = 0.0f;
            mo49916j(c13687i, z10);
        }
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: g */
    public boolean mo49913g(C13687i c13687i) {
        return m50004p(c13687i) != -1;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: h */
    public int mo49914h() {
        return this.f48061j;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: i */
    public float mo49915i(int i10) {
        int i11 = this.f48061j;
        int i12 = this.f48062k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f48058g[i12];
            }
            i12 = this.f48060i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: j */
    public float mo49916j(C13687i c13687i, boolean z10) {
        int iM50004p = m50004p(c13687i);
        if (iM50004p == -1) {
            return 0.0f;
        }
        m50006r(c13687i);
        float f10 = this.f48058g[iM50004p];
        if (this.f48062k == iM50004p) {
            this.f48062k = this.f48060i[iM50004p];
        }
        this.f48057f[iM50004p] = -1;
        int[] iArr = this.f48059h;
        int i10 = iArr[iM50004p];
        if (i10 != -1) {
            int[] iArr2 = this.f48060i;
            iArr2[i10] = iArr2[iM50004p];
        }
        int i11 = this.f48060i[iM50004p];
        if (i11 != -1) {
            iArr[i11] = iArr[iM50004p];
        }
        this.f48061j--;
        c13687i.f48040m--;
        if (z10) {
            c13687i.m49994d(this.f48063l);
        }
        return f10;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: k */
    public void mo49917k(float f10) {
        int i10 = this.f48061j;
        int i11 = this.f48062k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f48058g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f48060i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m50000l(C13687i c13687i, int i10) {
        int[] iArr;
        int i11 = c13687i.f48030c % this.f48054c;
        int[] iArr2 = this.f48055d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f48056e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f48056e[i10] = -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m50001m(int i10, C13687i c13687i, float f10) {
        this.f48057f[i10] = c13687i.f48030c;
        this.f48058g[i10] = f10;
        this.f48059h[i10] = -1;
        this.f48060i[i10] = -1;
        c13687i.m49992a(this.f48063l);
        c13687i.f48040m++;
        this.f48061j++;
    }

    /* JADX INFO: renamed from: n */
    public final int m50002n() {
        for (int i10 = 0; i10 < this.f48053b; i10++) {
            if (this.f48057f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public final void m50003o() {
        int i10 = this.f48053b * 2;
        this.f48057f = Arrays.copyOf(this.f48057f, i10);
        this.f48058g = Arrays.copyOf(this.f48058g, i10);
        this.f48059h = Arrays.copyOf(this.f48059h, i10);
        this.f48060i = Arrays.copyOf(this.f48060i, i10);
        this.f48056e = Arrays.copyOf(this.f48056e, i10);
        for (int i11 = this.f48053b; i11 < i10; i11++) {
            this.f48057f[i11] = -1;
            this.f48056e[i11] = -1;
        }
        this.f48053b = i10;
    }

    /* JADX INFO: renamed from: p */
    public int m50004p(C13687i c13687i) {
        if (this.f48061j != 0 && c13687i != null) {
            int i10 = c13687i.f48030c;
            int i11 = this.f48055d[i10 % this.f48054c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f48057f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f48056e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f48057f[i11] != i10);
            if (i11 != -1 && this.f48057f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public final void m50005q(int i10, C13687i c13687i, float f10) {
        int iM50002n = m50002n();
        m50001m(iM50002n, c13687i, f10);
        if (i10 != -1) {
            this.f48059h[iM50002n] = i10;
            int[] iArr = this.f48060i;
            iArr[iM50002n] = iArr[i10];
            iArr[i10] = iM50002n;
        } else {
            this.f48059h[iM50002n] = -1;
            if (this.f48061j > 0) {
                this.f48060i[iM50002n] = this.f48062k;
                this.f48062k = iM50002n;
            } else {
                this.f48060i[iM50002n] = -1;
            }
        }
        int i11 = this.f48060i[iM50002n];
        if (i11 != -1) {
            this.f48059h[i11] = iM50002n;
        }
        m50000l(c13687i, iM50002n);
    }

    /* JADX INFO: renamed from: r */
    public final void m50006r(C13687i c13687i) {
        int[] iArr;
        int i10;
        int i11 = c13687i.f48030c;
        int i12 = i11 % this.f48054c;
        int[] iArr2 = this.f48055d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f48057f[i13] == i11) {
            int[] iArr3 = this.f48056e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f48056e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f48057f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f48057f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f48061j;
        for (int i11 = 0; i11 < i10; i11++) {
            C13687i c13687iMo49908b = mo49908b(i11);
            if (c13687iMo49908b != null) {
                String str2 = str + c13687iMo49908b + " = " + mo49915i(i11) + " ";
                int iM50004p = m50004p(c13687iMo49908b);
                String str3 = str2 + "[p: ";
                String str4 = (this.f48059h[iM50004p] != -1 ? str3 + this.f48064m.f47989d[this.f48057f[this.f48059h[iM50004p]]] : str3 + "none") + ", n: ";
                str = (this.f48060i[iM50004p] != -1 ? str4 + this.f48064m.f47989d[this.f48057f[this.f48060i[iM50004p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
