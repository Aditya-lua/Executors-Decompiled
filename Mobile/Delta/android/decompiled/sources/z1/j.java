package z1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static float f37118n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37119a = -1;
    public int b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37120c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f37121d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f37122e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f37123f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f37124g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f37125h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f37126i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37127j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37128k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f37129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f37130m;

    public j(b bVar, c cVar) {
        this.f37129l = bVar;
        this.f37130m = cVar;
        clear();
    }

    @Override // z1.b.a
    public float a(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f37124g[iP];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public i b(int i10) {
        int i11 = this.f37127j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f37128k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f37130m.f37061d[this.f37123f[i12]];
            }
            i12 = this.f37126i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // z1.b.a
    public void c(i iVar, float f10) {
        float f11 = f37118n;
        if (f10 > (-f11) && f10 < f11) {
            j(iVar, true);
            return;
        }
        if (this.f37127j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f37128k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f37124g[iP] = f10;
            return;
        }
        if (this.f37127j + 1 >= this.b) {
            o();
        }
        int i10 = this.f37127j;
        int i11 = this.f37128k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f37123f[i11];
            int i15 = iVar.f37098c;
            if (i14 == i15) {
                this.f37124g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f37126i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // z1.b.a
    public void clear() {
        int i10 = this.f37127j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                iVarB.d(this.f37129l);
            }
        }
        for (int i12 = 0; i12 < this.b; i12++) {
            this.f37123f[i12] = -1;
            this.f37122e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f37120c; i13++) {
            this.f37121d[i13] = -1;
        }
        this.f37127j = 0;
        this.f37128k = -1;
    }

    @Override // z1.b.a
    public void d() {
        int i10 = this.f37127j;
        int i11 = this.f37128k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f37124g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f37126i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // z1.b.a
    public float e(b bVar, boolean z10) {
        float fA = a(bVar.f37054a);
        j(bVar.f37054a, z10);
        j jVar = (j) bVar.f37057e;
        int iH = jVar.h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iH) {
            int i12 = jVar.f37123f[i11];
            if (i12 != -1) {
                f(this.f37130m.f37061d[i12], jVar.f37124g[i11] * fA, z10);
                i10++;
            }
            i11++;
        }
        return fA;
    }

    @Override // z1.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f37118n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                c(iVar, f10);
                return;
            }
            float[] fArr = this.f37124g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f37118n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            j(iVar, z10);
        }
    }

    @Override // z1.b.a
    public boolean g(i iVar) {
        return p(iVar) != -1;
    }

    @Override // z1.b.a
    public int h() {
        return this.f37127j;
    }

    @Override // z1.b.a
    public float i(int i10) {
        int i11 = this.f37127j;
        int i12 = this.f37128k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f37124g[i12];
            }
            i12 = this.f37126i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public float j(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f37124g[iP];
        if (this.f37128k == iP) {
            this.f37128k = this.f37126i[iP];
        }
        this.f37123f[iP] = -1;
        int[] iArr = this.f37125h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f37126i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f37126i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f37127j--;
        iVar.f37108m--;
        if (z10) {
            iVar.d(this.f37129l);
        }
        return f10;
    }

    @Override // z1.b.a
    public void k(float f10) {
        int i10 = this.f37127j;
        int i11 = this.f37128k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f37124g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f37126i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f37098c % this.f37120c;
        int[] iArr2 = this.f37121d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f37122e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f37122e[i10] = -1;
    }

    public final void m(int i10, i iVar, float f10) {
        this.f37123f[i10] = iVar.f37098c;
        this.f37124g[i10] = f10;
        this.f37125h[i10] = -1;
        this.f37126i[i10] = -1;
        iVar.a(this.f37129l);
        iVar.f37108m++;
        this.f37127j++;
    }

    public final int n() {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.f37123f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void o() {
        int i10 = this.b * 2;
        this.f37123f = Arrays.copyOf(this.f37123f, i10);
        this.f37124g = Arrays.copyOf(this.f37124g, i10);
        this.f37125h = Arrays.copyOf(this.f37125h, i10);
        this.f37126i = Arrays.copyOf(this.f37126i, i10);
        this.f37122e = Arrays.copyOf(this.f37122e, i10);
        for (int i11 = this.b; i11 < i10; i11++) {
            this.f37123f[i11] = -1;
            this.f37122e[i11] = -1;
        }
        this.b = i10;
    }

    public int p(i iVar) {
        if (this.f37127j != 0 && iVar != null) {
            int i10 = iVar.f37098c;
            int i11 = this.f37121d[i10 % this.f37120c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f37123f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f37122e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f37123f[i11] != i10);
            if (i11 != -1 && this.f37123f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f37125h[iN] = i10;
            int[] iArr = this.f37126i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f37125h[iN] = -1;
            if (this.f37127j > 0) {
                this.f37126i[iN] = this.f37128k;
                this.f37128k = iN;
            } else {
                this.f37126i[iN] = -1;
            }
        }
        int i11 = this.f37126i[iN];
        if (i11 != -1) {
            this.f37125h[i11] = iN;
        }
        l(iVar, iN);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f37098c;
        int i12 = i11 % this.f37120c;
        int[] iArr2 = this.f37121d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f37123f[i13] == i11) {
            int[] iArr3 = this.f37122e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f37122e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f37123f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f37123f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f37127j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + i(i11) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f37125h[iP] != -1 ? str3 + this.f37130m.f37061d[this.f37123f[this.f37125h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f37126i[iP] != -1 ? str4 + this.f37130m.f37061d[this.f37123f[this.f37126i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
