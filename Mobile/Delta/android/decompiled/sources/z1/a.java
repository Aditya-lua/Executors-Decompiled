package z1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f37738l = 0.001f;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f37740c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37739a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37741d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f37742e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f37743f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f37744g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f37745h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37746i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37747j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37748k = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.f37740c = cVar;
    }

    @Override // z1.b.a
    public final float a(i iVar) {
        int i10 = this.f37746i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37739a; i11++) {
            if (this.f37743f[i10] == iVar.f37793c) {
                return this.f37745h[i10];
            }
            i10 = this.f37744g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public i b(int i10) {
        int i11 = this.f37746i;
        for (int i12 = 0; i11 != -1 && i12 < this.f37739a; i12++) {
            if (i12 == i10) {
                return this.f37740c.f37756d[this.f37743f[i11]];
            }
            i11 = this.f37744g[i11];
        }
        return null;
    }

    @Override // z1.b.a
    public final void c(i iVar, float f10) {
        if (f10 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i10 = this.f37746i;
        if (i10 == -1) {
            this.f37746i = 0;
            this.f37745h[0] = f10;
            this.f37743f[0] = iVar.f37793c;
            this.f37744g[0] = -1;
            iVar.f37803m++;
            iVar.a(this.b);
            this.f37739a++;
            if (this.f37748k) {
                return;
            }
            int i11 = this.f37747j + 1;
            this.f37747j = i11;
            int[] iArr = this.f37743f;
            if (i11 >= iArr.length) {
                this.f37748k = true;
                this.f37747j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f37739a; i13++) {
            int i14 = this.f37743f[i10];
            int i15 = iVar.f37793c;
            if (i14 == i15) {
                this.f37745h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f37744g[i10];
        }
        int length = this.f37747j;
        int i16 = length + 1;
        if (this.f37748k) {
            int[] iArr2 = this.f37743f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f37743f;
        if (length >= iArr3.length && this.f37739a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f37743f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f37743f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f37741d * 2;
            this.f37741d = i18;
            this.f37748k = false;
            this.f37747j = length - 1;
            this.f37745h = Arrays.copyOf(this.f37745h, i18);
            this.f37743f = Arrays.copyOf(this.f37743f, this.f37741d);
            this.f37744g = Arrays.copyOf(this.f37744g, this.f37741d);
        }
        this.f37743f[length] = iVar.f37793c;
        this.f37745h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f37744g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f37744g[length] = this.f37746i;
            this.f37746i = length;
        }
        iVar.f37803m++;
        iVar.a(this.b);
        int i19 = this.f37739a + 1;
        this.f37739a = i19;
        if (!this.f37748k) {
            this.f37747j++;
        }
        int[] iArr7 = this.f37743f;
        if (i19 >= iArr7.length) {
            this.f37748k = true;
        }
        if (this.f37747j >= iArr7.length) {
            this.f37748k = true;
            this.f37747j = iArr7.length - 1;
        }
    }

    @Override // z1.b.a
    public final void clear() {
        int i10 = this.f37746i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37739a; i11++) {
            i iVar = this.f37740c.f37756d[this.f37743f[i10]];
            if (iVar != null) {
                iVar.d(this.b);
            }
            i10 = this.f37744g[i10];
        }
        this.f37746i = -1;
        this.f37747j = -1;
        this.f37748k = false;
        this.f37739a = 0;
    }

    @Override // z1.b.a
    public void d() {
        int i10 = this.f37746i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37739a; i11++) {
            float[] fArr = this.f37745h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f37744g[i10];
        }
    }

    @Override // z1.b.a
    public float e(b bVar, boolean z10) {
        float fA = a(bVar.f37749a);
        j(bVar.f37749a, z10);
        b.a aVar = bVar.f37752e;
        int iH = aVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarB = aVar.b(i10);
            f(iVarB, aVar.a(iVarB) * fA, z10);
        }
        return fA;
    }

    @Override // z1.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f37738l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f37746i;
            if (i10 == -1) {
                this.f37746i = 0;
                this.f37745h[0] = f10;
                this.f37743f[0] = iVar.f37793c;
                this.f37744g[0] = -1;
                iVar.f37803m++;
                iVar.a(this.b);
                this.f37739a++;
                if (this.f37748k) {
                    return;
                }
                int i11 = this.f37747j + 1;
                this.f37747j = i11;
                int[] iArr = this.f37743f;
                if (i11 >= iArr.length) {
                    this.f37748k = true;
                    this.f37747j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f37739a; i13++) {
                int i14 = this.f37743f[i10];
                int i15 = iVar.f37793c;
                if (i14 == i15) {
                    float[] fArr = this.f37745h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f37738l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f37746i) {
                            this.f37746i = this.f37744g[i10];
                        } else {
                            int[] iArr2 = this.f37744g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.d(this.b);
                        }
                        if (this.f37748k) {
                            this.f37747j = i10;
                        }
                        iVar.f37803m--;
                        this.f37739a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f37744g[i10];
            }
            int length = this.f37747j;
            int i16 = length + 1;
            if (this.f37748k) {
                int[] iArr3 = this.f37743f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f37743f;
            if (length >= iArr4.length && this.f37739a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f37743f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f37743f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f37741d * 2;
                this.f37741d = i18;
                this.f37748k = false;
                this.f37747j = length - 1;
                this.f37745h = Arrays.copyOf(this.f37745h, i18);
                this.f37743f = Arrays.copyOf(this.f37743f, this.f37741d);
                this.f37744g = Arrays.copyOf(this.f37744g, this.f37741d);
            }
            this.f37743f[length] = iVar.f37793c;
            this.f37745h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f37744g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f37744g[length] = this.f37746i;
                this.f37746i = length;
            }
            iVar.f37803m++;
            iVar.a(this.b);
            this.f37739a++;
            if (!this.f37748k) {
                this.f37747j++;
            }
            int i19 = this.f37747j;
            int[] iArr8 = this.f37743f;
            if (i19 >= iArr8.length) {
                this.f37748k = true;
                this.f37747j = iArr8.length - 1;
            }
        }
    }

    @Override // z1.b.a
    public boolean g(i iVar) {
        int i10 = this.f37746i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f37739a; i11++) {
            if (this.f37743f[i10] == iVar.f37793c) {
                return true;
            }
            i10 = this.f37744g[i10];
        }
        return false;
    }

    @Override // z1.b.a
    public int h() {
        return this.f37739a;
    }

    @Override // z1.b.a
    public float i(int i10) {
        int i11 = this.f37746i;
        for (int i12 = 0; i11 != -1 && i12 < this.f37739a; i12++) {
            if (i12 == i10) {
                return this.f37745h[i11];
            }
            i11 = this.f37744g[i11];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public final float j(i iVar, boolean z10) {
        if (this.f37742e == iVar) {
            this.f37742e = null;
        }
        int i10 = this.f37746i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f37739a) {
            if (this.f37743f[i10] == iVar.f37793c) {
                if (i10 == this.f37746i) {
                    this.f37746i = this.f37744g[i10];
                } else {
                    int[] iArr = this.f37744g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.b);
                }
                iVar.f37803m--;
                this.f37739a--;
                this.f37743f[i10] = -1;
                if (this.f37748k) {
                    this.f37747j = i10;
                }
                return this.f37745h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f37744g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public void k(float f10) {
        int i10 = this.f37746i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37739a; i11++) {
            float[] fArr = this.f37745h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f37744g[i10];
        }
    }

    public String toString() {
        int i10 = this.f37746i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f37739a; i11++) {
            str = ((str + " -> ") + this.f37745h[i10] + " : ") + this.f37740c.f37756d[this.f37743f[i10]];
            i10 = this.f37744g[i10];
        }
        return str;
    }
}
