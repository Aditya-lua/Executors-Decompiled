package z1;

import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static float f38918n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38919a = -1;
    public int b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38920c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f38921d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f38922e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f38923f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f38924g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f38925h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f38926i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38927j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38928k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f38929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f38930m;

    public j(b bVar, c cVar) {
        this.f38929l = bVar;
        this.f38930m = cVar;
        clear();
    }

    @Override // z1.b.a
    public float a(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f38924g[iP];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public i b(int i10) {
        int i11 = this.f38927j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f38928k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f38930m.f38861d[this.f38923f[i12]];
            }
            i12 = this.f38926i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // z1.b.a
    public void c(i iVar, float f10) {
        float f11 = f38918n;
        if (f10 > (-f11) && f10 < f11) {
            j(iVar, true);
            return;
        }
        if (this.f38927j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f38928k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f38924g[iP] = f10;
            return;
        }
        if (this.f38927j + 1 >= this.b) {
            o();
        }
        int i10 = this.f38927j;
        int i11 = this.f38928k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f38923f[i11];
            int i15 = iVar.f38898c;
            if (i14 == i15) {
                this.f38924g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f38926i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // z1.b.a
    public void clear() {
        int i10 = this.f38927j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                iVarB.d(this.f38929l);
            }
        }
        for (int i12 = 0; i12 < this.b; i12++) {
            this.f38923f[i12] = -1;
            this.f38922e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f38920c; i13++) {
            this.f38921d[i13] = -1;
        }
        this.f38927j = 0;
        this.f38928k = -1;
    }

    @Override // z1.b.a
    public void d() {
        int i10 = this.f38927j;
        int i11 = this.f38928k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f38924g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f38926i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // z1.b.a
    public float e(b bVar, boolean z10) {
        float fA = a(bVar.f38854a);
        j(bVar.f38854a, z10);
        j jVar = (j) bVar.f38857e;
        int iH = jVar.h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iH) {
            int i12 = jVar.f38923f[i11];
            if (i12 != -1) {
                f(this.f38930m.f38861d[i12], jVar.f38924g[i11] * fA, z10);
                i10++;
            }
            i11++;
        }
        return fA;
    }

    @Override // z1.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f38918n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                c(iVar, f10);
                return;
            }
            float[] fArr = this.f38924g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f38918n;
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
        return this.f38927j;
    }

    @Override // z1.b.a
    public float i(int i10) {
        int i11 = this.f38927j;
        int i12 = this.f38928k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f38924g[i12];
            }
            i12 = this.f38926i[i12];
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
        float f10 = this.f38924g[iP];
        if (this.f38928k == iP) {
            this.f38928k = this.f38926i[iP];
        }
        this.f38923f[iP] = -1;
        int[] iArr = this.f38925h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f38926i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f38926i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f38927j--;
        iVar.f38908m--;
        if (z10) {
            iVar.d(this.f38929l);
        }
        return f10;
    }

    @Override // z1.b.a
    public void k(float f10) {
        int i10 = this.f38927j;
        int i11 = this.f38928k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f38924g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f38926i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f38898c % this.f38920c;
        int[] iArr2 = this.f38921d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f38922e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f38922e[i10] = -1;
    }

    public final void m(int i10, i iVar, float f10) {
        this.f38923f[i10] = iVar.f38898c;
        this.f38924g[i10] = f10;
        this.f38925h[i10] = -1;
        this.f38926i[i10] = -1;
        iVar.a(this.f38929l);
        iVar.f38908m++;
        this.f38927j++;
    }

    public final int n() {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.f38923f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void o() {
        int i10 = this.b * 2;
        this.f38923f = Arrays.copyOf(this.f38923f, i10);
        this.f38924g = Arrays.copyOf(this.f38924g, i10);
        this.f38925h = Arrays.copyOf(this.f38925h, i10);
        this.f38926i = Arrays.copyOf(this.f38926i, i10);
        this.f38922e = Arrays.copyOf(this.f38922e, i10);
        for (int i11 = this.b; i11 < i10; i11++) {
            this.f38923f[i11] = -1;
            this.f38922e[i11] = -1;
        }
        this.b = i10;
    }

    public int p(i iVar) {
        if (this.f38927j != 0 && iVar != null) {
            int i10 = iVar.f38898c;
            int i11 = this.f38921d[i10 % this.f38920c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f38923f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f38922e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f38923f[i11] != i10);
            if (i11 != -1 && this.f38923f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f38925h[iN] = i10;
            int[] iArr = this.f38926i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f38925h[iN] = -1;
            if (this.f38927j > 0) {
                this.f38926i[iN] = this.f38928k;
                this.f38928k = iN;
            } else {
                this.f38926i[iN] = -1;
            }
        }
        int i11 = this.f38926i[iN];
        if (i11 != -1) {
            this.f38925h[i11] = iN;
        }
        l(iVar, iN);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f38898c;
        int i12 = i11 % this.f38920c;
        int[] iArr2 = this.f38921d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f38923f[i13] == i11) {
            int[] iArr3 = this.f38922e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f38922e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f38923f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f38923f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f38927j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + i(i11) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f38925h[iP] != -1 ? str3 + this.f38930m.f38861d[this.f38923f[this.f38925h[iP]]] : str3 + PayloadNotificationChannel.SOUND_NONE) + ", n: ";
                str = (this.f38926i[iP] != -1 ? str4 + this.f38930m.f38861d[this.f38923f[this.f38926i[iP]]] : str4 + PayloadNotificationChannel.SOUND_NONE) + "]";
            }
        }
        return str + " }";
    }
}
