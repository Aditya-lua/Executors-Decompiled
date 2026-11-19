package z1;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f38843l = 0.001f;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f38845c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38844a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38846d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f38847e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f38848f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f38849g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f38850h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38851i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38852j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38853k = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.f38845c = cVar;
    }

    @Override // z1.b.a
    public final float a(i iVar) {
        int i10 = this.f38851i;
        for (int i11 = 0; i10 != -1 && i11 < this.f38844a; i11++) {
            if (this.f38848f[i10] == iVar.f38898c) {
                return this.f38850h[i10];
            }
            i10 = this.f38849g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public i b(int i10) {
        int i11 = this.f38851i;
        for (int i12 = 0; i11 != -1 && i12 < this.f38844a; i12++) {
            if (i12 == i10) {
                return this.f38845c.f38861d[this.f38848f[i11]];
            }
            i11 = this.f38849g[i11];
        }
        return null;
    }

    @Override // z1.b.a
    public final void c(i iVar, float f10) {
        if (f10 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i10 = this.f38851i;
        if (i10 == -1) {
            this.f38851i = 0;
            this.f38850h[0] = f10;
            this.f38848f[0] = iVar.f38898c;
            this.f38849g[0] = -1;
            iVar.f38908m++;
            iVar.a(this.b);
            this.f38844a++;
            if (this.f38853k) {
                return;
            }
            int i11 = this.f38852j + 1;
            this.f38852j = i11;
            int[] iArr = this.f38848f;
            if (i11 >= iArr.length) {
                this.f38853k = true;
                this.f38852j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f38844a; i13++) {
            int i14 = this.f38848f[i10];
            int i15 = iVar.f38898c;
            if (i14 == i15) {
                this.f38850h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f38849g[i10];
        }
        int length = this.f38852j;
        int i16 = length + 1;
        if (this.f38853k) {
            int[] iArr2 = this.f38848f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f38848f;
        if (length >= iArr3.length && this.f38844a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f38848f;
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
        int[] iArr5 = this.f38848f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f38846d * 2;
            this.f38846d = i18;
            this.f38853k = false;
            this.f38852j = length - 1;
            this.f38850h = Arrays.copyOf(this.f38850h, i18);
            this.f38848f = Arrays.copyOf(this.f38848f, this.f38846d);
            this.f38849g = Arrays.copyOf(this.f38849g, this.f38846d);
        }
        this.f38848f[length] = iVar.f38898c;
        this.f38850h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f38849g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f38849g[length] = this.f38851i;
            this.f38851i = length;
        }
        iVar.f38908m++;
        iVar.a(this.b);
        int i19 = this.f38844a + 1;
        this.f38844a = i19;
        if (!this.f38853k) {
            this.f38852j++;
        }
        int[] iArr7 = this.f38848f;
        if (i19 >= iArr7.length) {
            this.f38853k = true;
        }
        if (this.f38852j >= iArr7.length) {
            this.f38853k = true;
            this.f38852j = iArr7.length - 1;
        }
    }

    @Override // z1.b.a
    public final void clear() {
        int i10 = this.f38851i;
        for (int i11 = 0; i10 != -1 && i11 < this.f38844a; i11++) {
            i iVar = this.f38845c.f38861d[this.f38848f[i10]];
            if (iVar != null) {
                iVar.d(this.b);
            }
            i10 = this.f38849g[i10];
        }
        this.f38851i = -1;
        this.f38852j = -1;
        this.f38853k = false;
        this.f38844a = 0;
    }

    @Override // z1.b.a
    public void d() {
        int i10 = this.f38851i;
        for (int i11 = 0; i10 != -1 && i11 < this.f38844a; i11++) {
            float[] fArr = this.f38850h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f38849g[i10];
        }
    }

    @Override // z1.b.a
    public float e(b bVar, boolean z10) {
        float fA = a(bVar.f38854a);
        j(bVar.f38854a, z10);
        b.a aVar = bVar.f38857e;
        int iH = aVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarB = aVar.b(i10);
            f(iVarB, aVar.a(iVarB) * fA, z10);
        }
        return fA;
    }

    @Override // z1.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f38843l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f38851i;
            if (i10 == -1) {
                this.f38851i = 0;
                this.f38850h[0] = f10;
                this.f38848f[0] = iVar.f38898c;
                this.f38849g[0] = -1;
                iVar.f38908m++;
                iVar.a(this.b);
                this.f38844a++;
                if (this.f38853k) {
                    return;
                }
                int i11 = this.f38852j + 1;
                this.f38852j = i11;
                int[] iArr = this.f38848f;
                if (i11 >= iArr.length) {
                    this.f38853k = true;
                    this.f38852j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f38844a; i13++) {
                int i14 = this.f38848f[i10];
                int i15 = iVar.f38898c;
                if (i14 == i15) {
                    float[] fArr = this.f38850h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f38843l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f38851i) {
                            this.f38851i = this.f38849g[i10];
                        } else {
                            int[] iArr2 = this.f38849g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.d(this.b);
                        }
                        if (this.f38853k) {
                            this.f38852j = i10;
                        }
                        iVar.f38908m--;
                        this.f38844a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f38849g[i10];
            }
            int length = this.f38852j;
            int i16 = length + 1;
            if (this.f38853k) {
                int[] iArr3 = this.f38848f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f38848f;
            if (length >= iArr4.length && this.f38844a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f38848f;
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
            int[] iArr6 = this.f38848f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f38846d * 2;
                this.f38846d = i18;
                this.f38853k = false;
                this.f38852j = length - 1;
                this.f38850h = Arrays.copyOf(this.f38850h, i18);
                this.f38848f = Arrays.copyOf(this.f38848f, this.f38846d);
                this.f38849g = Arrays.copyOf(this.f38849g, this.f38846d);
            }
            this.f38848f[length] = iVar.f38898c;
            this.f38850h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f38849g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f38849g[length] = this.f38851i;
                this.f38851i = length;
            }
            iVar.f38908m++;
            iVar.a(this.b);
            this.f38844a++;
            if (!this.f38853k) {
                this.f38852j++;
            }
            int i19 = this.f38852j;
            int[] iArr8 = this.f38848f;
            if (i19 >= iArr8.length) {
                this.f38853k = true;
                this.f38852j = iArr8.length - 1;
            }
        }
    }

    @Override // z1.b.a
    public boolean g(i iVar) {
        int i10 = this.f38851i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f38844a; i11++) {
            if (this.f38848f[i10] == iVar.f38898c) {
                return true;
            }
            i10 = this.f38849g[i10];
        }
        return false;
    }

    @Override // z1.b.a
    public int h() {
        return this.f38844a;
    }

    @Override // z1.b.a
    public float i(int i10) {
        int i11 = this.f38851i;
        for (int i12 = 0; i11 != -1 && i12 < this.f38844a; i12++) {
            if (i12 == i10) {
                return this.f38850h[i11];
            }
            i11 = this.f38849g[i11];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public final float j(i iVar, boolean z10) {
        if (this.f38847e == iVar) {
            this.f38847e = null;
        }
        int i10 = this.f38851i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f38844a) {
            if (this.f38848f[i10] == iVar.f38898c) {
                if (i10 == this.f38851i) {
                    this.f38851i = this.f38849g[i10];
                } else {
                    int[] iArr = this.f38849g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.b);
                }
                iVar.f38908m--;
                this.f38844a--;
                this.f38848f[i10] = -1;
                if (this.f38853k) {
                    this.f38852j = i10;
                }
                return this.f38850h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f38849g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public void k(float f10) {
        int i10 = this.f38851i;
        for (int i11 = 0; i10 != -1 && i11 < this.f38844a; i11++) {
            float[] fArr = this.f38850h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f38849g[i10];
        }
    }

    public String toString() {
        int i10 = this.f38851i;
        String str = BuildConfig.FLAVOR;
        for (int i11 = 0; i10 != -1 && i11 < this.f38844a; i11++) {
            str = ((str + " -> ") + this.f38850h[i10] + " : ") + this.f38845c.f38861d[this.f38848f[i10]];
            i10 = this.f38849g[i10];
        }
        return str;
    }
}
