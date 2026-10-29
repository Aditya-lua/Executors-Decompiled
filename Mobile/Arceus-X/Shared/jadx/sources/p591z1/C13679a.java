package p591z1;

import java.util.Arrays;

/* JADX INFO: renamed from: z1.a */
/* JADX INFO: loaded from: classes.dex */
public class C13679a implements C13680b.a {

    /* JADX INFO: renamed from: l */
    public static float f47968l = 0.001f;

    /* JADX INFO: renamed from: b */
    public final C13680b f47970b;

    /* JADX INFO: renamed from: c */
    public final C13681c f47971c;

    /* JADX INFO: renamed from: a */
    public int f47969a = 0;

    /* JADX INFO: renamed from: d */
    public int f47972d = 8;

    /* JADX INFO: renamed from: e */
    public C13687i f47973e = null;

    /* JADX INFO: renamed from: f */
    public int[] f47974f = new int[8];

    /* JADX INFO: renamed from: g */
    public int[] f47975g = new int[8];

    /* JADX INFO: renamed from: h */
    public float[] f47976h = new float[8];

    /* JADX INFO: renamed from: i */
    public int f47977i = -1;

    /* JADX INFO: renamed from: j */
    public int f47978j = -1;

    /* JADX INFO: renamed from: k */
    public boolean f47979k = false;

    public C13679a(C13680b c13680b, C13681c c13681c) {
        this.f47970b = c13680b;
        this.f47971c = c13681c;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: a */
    public final float mo49907a(C13687i c13687i) {
        int i10 = this.f47977i;
        for (int i11 = 0; i10 != -1 && i11 < this.f47969a; i11++) {
            if (this.f47974f[i10] == c13687i.f48030c) {
                return this.f47976h[i10];
            }
            i10 = this.f47975g[i10];
        }
        return 0.0f;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: b */
    public C13687i mo49908b(int i10) {
        int i11 = this.f47977i;
        for (int i12 = 0; i11 != -1 && i12 < this.f47969a; i12++) {
            if (i12 == i10) {
                return this.f47971c.f47989d[this.f47974f[i11]];
            }
            i11 = this.f47975g[i11];
        }
        return null;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: c */
    public final void mo49909c(C13687i c13687i, float f10) {
        if (f10 == 0.0f) {
            mo49916j(c13687i, true);
            return;
        }
        int i10 = this.f47977i;
        if (i10 == -1) {
            this.f47977i = 0;
            this.f47976h[0] = f10;
            this.f47974f[0] = c13687i.f48030c;
            this.f47975g[0] = -1;
            c13687i.f48040m++;
            c13687i.m49992a(this.f47970b);
            this.f47969a++;
            if (this.f47979k) {
                return;
            }
            int i11 = this.f47978j + 1;
            this.f47978j = i11;
            int[] iArr = this.f47974f;
            if (i11 >= iArr.length) {
                this.f47979k = true;
                this.f47978j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f47969a; i13++) {
            int i14 = this.f47974f[i10];
            int i15 = c13687i.f48030c;
            if (i14 == i15) {
                this.f47976h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f47975g[i10];
        }
        int length = this.f47978j;
        int i16 = length + 1;
        if (this.f47979k) {
            int[] iArr2 = this.f47974f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f47974f;
        if (length >= iArr3.length && this.f47969a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f47974f;
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
        int[] iArr5 = this.f47974f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f47972d * 2;
            this.f47972d = i18;
            this.f47979k = false;
            this.f47978j = length - 1;
            this.f47976h = Arrays.copyOf(this.f47976h, i18);
            this.f47974f = Arrays.copyOf(this.f47974f, this.f47972d);
            this.f47975g = Arrays.copyOf(this.f47975g, this.f47972d);
        }
        this.f47974f[length] = c13687i.f48030c;
        this.f47976h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f47975g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f47975g[length] = this.f47977i;
            this.f47977i = length;
        }
        c13687i.f48040m++;
        c13687i.m49992a(this.f47970b);
        int i19 = this.f47969a + 1;
        this.f47969a = i19;
        if (!this.f47979k) {
            this.f47978j++;
        }
        int[] iArr7 = this.f47974f;
        if (i19 >= iArr7.length) {
            this.f47979k = true;
        }
        if (this.f47978j >= iArr7.length) {
            this.f47979k = true;
            this.f47978j = iArr7.length - 1;
        }
    }

    @Override // p591z1.C13680b.a
    public final void clear() {
        int i10 = this.f47977i;
        for (int i11 = 0; i10 != -1 && i11 < this.f47969a; i11++) {
            C13687i c13687i = this.f47971c.f47989d[this.f47974f[i10]];
            if (c13687i != null) {
                c13687i.m49994d(this.f47970b);
            }
            i10 = this.f47975g[i10];
        }
        this.f47977i = -1;
        this.f47978j = -1;
        this.f47979k = false;
        this.f47969a = 0;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: d */
    public void mo49910d() {
        int i10 = this.f47977i;
        for (int i11 = 0; i10 != -1 && i11 < this.f47969a; i11++) {
            float[] fArr = this.f47976h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f47975g[i10];
        }
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: e */
    public float mo49911e(C13680b c13680b, boolean z10) {
        float fMo49907a = mo49907a(c13680b.f47980a);
        mo49916j(c13680b.f47980a, z10);
        C13680b.a aVar = c13680b.f47984e;
        int iMo49914h = aVar.mo49914h();
        for (int i10 = 0; i10 < iMo49914h; i10++) {
            C13687i c13687iMo49908b = aVar.mo49908b(i10);
            mo49912f(c13687iMo49908b, aVar.mo49907a(c13687iMo49908b) * fMo49907a, z10);
        }
        return fMo49907a;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: f */
    public void mo49912f(C13687i c13687i, float f10, boolean z10) {
        float f11 = f47968l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f47977i;
            if (i10 == -1) {
                this.f47977i = 0;
                this.f47976h[0] = f10;
                this.f47974f[0] = c13687i.f48030c;
                this.f47975g[0] = -1;
                c13687i.f48040m++;
                c13687i.m49992a(this.f47970b);
                this.f47969a++;
                if (this.f47979k) {
                    return;
                }
                int i11 = this.f47978j + 1;
                this.f47978j = i11;
                int[] iArr = this.f47974f;
                if (i11 >= iArr.length) {
                    this.f47979k = true;
                    this.f47978j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f47969a; i13++) {
                int i14 = this.f47974f[i10];
                int i15 = c13687i.f48030c;
                if (i14 == i15) {
                    float[] fArr = this.f47976h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f47968l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f47977i) {
                            this.f47977i = this.f47975g[i10];
                        } else {
                            int[] iArr2 = this.f47975g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            c13687i.m49994d(this.f47970b);
                        }
                        if (this.f47979k) {
                            this.f47978j = i10;
                        }
                        c13687i.f48040m--;
                        this.f47969a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f47975g[i10];
            }
            int length = this.f47978j;
            int i16 = length + 1;
            if (this.f47979k) {
                int[] iArr3 = this.f47974f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f47974f;
            if (length >= iArr4.length && this.f47969a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f47974f;
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
            int[] iArr6 = this.f47974f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f47972d * 2;
                this.f47972d = i18;
                this.f47979k = false;
                this.f47978j = length - 1;
                this.f47976h = Arrays.copyOf(this.f47976h, i18);
                this.f47974f = Arrays.copyOf(this.f47974f, this.f47972d);
                this.f47975g = Arrays.copyOf(this.f47975g, this.f47972d);
            }
            this.f47974f[length] = c13687i.f48030c;
            this.f47976h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f47975g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f47975g[length] = this.f47977i;
                this.f47977i = length;
            }
            c13687i.f48040m++;
            c13687i.m49992a(this.f47970b);
            this.f47969a++;
            if (!this.f47979k) {
                this.f47978j++;
            }
            int i19 = this.f47978j;
            int[] iArr8 = this.f47974f;
            if (i19 >= iArr8.length) {
                this.f47979k = true;
                this.f47978j = iArr8.length - 1;
            }
        }
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: g */
    public boolean mo49913g(C13687i c13687i) {
        int i10 = this.f47977i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f47969a; i11++) {
            if (this.f47974f[i10] == c13687i.f48030c) {
                return true;
            }
            i10 = this.f47975g[i10];
        }
        return false;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: h */
    public int mo49914h() {
        return this.f47969a;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: i */
    public float mo49915i(int i10) {
        int i11 = this.f47977i;
        for (int i12 = 0; i11 != -1 && i12 < this.f47969a; i12++) {
            if (i12 == i10) {
                return this.f47976h[i11];
            }
            i11 = this.f47975g[i11];
        }
        return 0.0f;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: j */
    public final float mo49916j(C13687i c13687i, boolean z10) {
        if (this.f47973e == c13687i) {
            this.f47973e = null;
        }
        int i10 = this.f47977i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f47969a) {
            if (this.f47974f[i10] == c13687i.f48030c) {
                if (i10 == this.f47977i) {
                    this.f47977i = this.f47975g[i10];
                } else {
                    int[] iArr = this.f47975g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c13687i.m49994d(this.f47970b);
                }
                c13687i.f48040m--;
                this.f47969a--;
                this.f47974f[i10] = -1;
                if (this.f47979k) {
                    this.f47978j = i10;
                }
                return this.f47976h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f47975g[i10];
        }
        return 0.0f;
    }

    @Override // p591z1.C13680b.a
    /* JADX INFO: renamed from: k */
    public void mo49917k(float f10) {
        int i10 = this.f47977i;
        for (int i11 = 0; i10 != -1 && i11 < this.f47969a; i11++) {
            float[] fArr = this.f47976h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f47975g[i10];
        }
    }

    public String toString() {
        int i10 = this.f47977i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f47969a; i11++) {
            str = ((str + " -> ") + this.f47976h[i10] + " : ") + this.f47971c.f47989d[this.f47974f[i10]];
            i10 = this.f47975g[i10];
        }
        return str;
    }
}
