package z1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f37043l = 0.001f;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f37045c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37044a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37046d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f37047e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f37048f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f37049g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f37050h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37051i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37052j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37053k = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.f37045c = cVar;
    }

    @Override // z1.b.a
    public final float a(i iVar) {
        int i10 = this.f37051i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37044a; i11++) {
            if (this.f37048f[i10] == iVar.f37098c) {
                return this.f37050h[i10];
            }
            i10 = this.f37049g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public i b(int i10) {
        int i11 = this.f37051i;
        for (int i12 = 0; i11 != -1 && i12 < this.f37044a; i12++) {
            if (i12 == i10) {
                return this.f37045c.f37061d[this.f37048f[i11]];
            }
            i11 = this.f37049g[i11];
        }
        return null;
    }

    @Override // z1.b.a
    public final void c(i iVar, float f10) {
        if (f10 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i10 = this.f37051i;
        if (i10 == -1) {
            this.f37051i = 0;
            this.f37050h[0] = f10;
            this.f37048f[0] = iVar.f37098c;
            this.f37049g[0] = -1;
            iVar.f37108m++;
            iVar.a(this.b);
            this.f37044a++;
            if (this.f37053k) {
                return;
            }
            int i11 = this.f37052j + 1;
            this.f37052j = i11;
            int[] iArr = this.f37048f;
            if (i11 >= iArr.length) {
                this.f37053k = true;
                this.f37052j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f37044a; i13++) {
            int i14 = this.f37048f[i10];
            int i15 = iVar.f37098c;
            if (i14 == i15) {
                this.f37050h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f37049g[i10];
        }
        int length = this.f37052j;
        int i16 = length + 1;
        if (this.f37053k) {
            int[] iArr2 = this.f37048f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f37048f;
        if (length >= iArr3.length && this.f37044a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f37048f;
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
        int[] iArr5 = this.f37048f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f37046d * 2;
            this.f37046d = i18;
            this.f37053k = false;
            this.f37052j = length - 1;
            this.f37050h = Arrays.copyOf(this.f37050h, i18);
            this.f37048f = Arrays.copyOf(this.f37048f, this.f37046d);
            this.f37049g = Arrays.copyOf(this.f37049g, this.f37046d);
        }
        this.f37048f[length] = iVar.f37098c;
        this.f37050h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f37049g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f37049g[length] = this.f37051i;
            this.f37051i = length;
        }
        iVar.f37108m++;
        iVar.a(this.b);
        int i19 = this.f37044a + 1;
        this.f37044a = i19;
        if (!this.f37053k) {
            this.f37052j++;
        }
        int[] iArr7 = this.f37048f;
        if (i19 >= iArr7.length) {
            this.f37053k = true;
        }
        if (this.f37052j >= iArr7.length) {
            this.f37053k = true;
            this.f37052j = iArr7.length - 1;
        }
    }

    @Override // z1.b.a
    public final void clear() {
        int i10 = this.f37051i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37044a; i11++) {
            i iVar = this.f37045c.f37061d[this.f37048f[i10]];
            if (iVar != null) {
                iVar.d(this.b);
            }
            i10 = this.f37049g[i10];
        }
        this.f37051i = -1;
        this.f37052j = -1;
        this.f37053k = false;
        this.f37044a = 0;
    }

    @Override // z1.b.a
    public void d() {
        int i10 = this.f37051i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37044a; i11++) {
            float[] fArr = this.f37050h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f37049g[i10];
        }
    }

    @Override // z1.b.a
    public float e(b bVar, boolean z10) {
        float fA = a(bVar.f37054a);
        j(bVar.f37054a, z10);
        b.a aVar = bVar.f37057e;
        int iH = aVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarB = aVar.b(i10);
            f(iVarB, aVar.a(iVarB) * fA, z10);
        }
        return fA;
    }

    @Override // z1.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f37043l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f37051i;
            if (i10 == -1) {
                this.f37051i = 0;
                this.f37050h[0] = f10;
                this.f37048f[0] = iVar.f37098c;
                this.f37049g[0] = -1;
                iVar.f37108m++;
                iVar.a(this.b);
                this.f37044a++;
                if (this.f37053k) {
                    return;
                }
                int i11 = this.f37052j + 1;
                this.f37052j = i11;
                int[] iArr = this.f37048f;
                if (i11 >= iArr.length) {
                    this.f37053k = true;
                    this.f37052j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f37044a; i13++) {
                int i14 = this.f37048f[i10];
                int i15 = iVar.f37098c;
                if (i14 == i15) {
                    float[] fArr = this.f37050h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f37043l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f37051i) {
                            this.f37051i = this.f37049g[i10];
                        } else {
                            int[] iArr2 = this.f37049g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.d(this.b);
                        }
                        if (this.f37053k) {
                            this.f37052j = i10;
                        }
                        iVar.f37108m--;
                        this.f37044a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f37049g[i10];
            }
            int length = this.f37052j;
            int i16 = length + 1;
            if (this.f37053k) {
                int[] iArr3 = this.f37048f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f37048f;
            if (length >= iArr4.length && this.f37044a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f37048f;
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
            int[] iArr6 = this.f37048f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f37046d * 2;
                this.f37046d = i18;
                this.f37053k = false;
                this.f37052j = length - 1;
                this.f37050h = Arrays.copyOf(this.f37050h, i18);
                this.f37048f = Arrays.copyOf(this.f37048f, this.f37046d);
                this.f37049g = Arrays.copyOf(this.f37049g, this.f37046d);
            }
            this.f37048f[length] = iVar.f37098c;
            this.f37050h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f37049g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f37049g[length] = this.f37051i;
                this.f37051i = length;
            }
            iVar.f37108m++;
            iVar.a(this.b);
            this.f37044a++;
            if (!this.f37053k) {
                this.f37052j++;
            }
            int i19 = this.f37052j;
            int[] iArr8 = this.f37048f;
            if (i19 >= iArr8.length) {
                this.f37053k = true;
                this.f37052j = iArr8.length - 1;
            }
        }
    }

    @Override // z1.b.a
    public boolean g(i iVar) {
        int i10 = this.f37051i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f37044a; i11++) {
            if (this.f37048f[i10] == iVar.f37098c) {
                return true;
            }
            i10 = this.f37049g[i10];
        }
        return false;
    }

    @Override // z1.b.a
    public int h() {
        return this.f37044a;
    }

    @Override // z1.b.a
    public float i(int i10) {
        int i11 = this.f37051i;
        for (int i12 = 0; i11 != -1 && i12 < this.f37044a; i12++) {
            if (i12 == i10) {
                return this.f37050h[i11];
            }
            i11 = this.f37049g[i11];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public final float j(i iVar, boolean z10) {
        if (this.f37047e == iVar) {
            this.f37047e = null;
        }
        int i10 = this.f37051i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f37044a) {
            if (this.f37048f[i10] == iVar.f37098c) {
                if (i10 == this.f37051i) {
                    this.f37051i = this.f37049g[i10];
                } else {
                    int[] iArr = this.f37049g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.b);
                }
                iVar.f37108m--;
                this.f37044a--;
                this.f37048f[i10] = -1;
                if (this.f37053k) {
                    this.f37052j = i10;
                }
                return this.f37050h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f37049g[i10];
        }
        return 0.0f;
    }

    @Override // z1.b.a
    public void k(float f10) {
        int i10 = this.f37051i;
        for (int i11 = 0; i10 != -1 && i11 < this.f37044a; i11++) {
            float[] fArr = this.f37050h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f37049g[i10];
        }
    }

    public String toString() {
        int i10 = this.f37051i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f37044a; i11++) {
            str = ((str + " -> ") + this.f37050h[i10] + " : ") + this.f37045c.f37061d[this.f37048f[i10]];
            i10 = this.f37049g[i10];
        }
        return str;
    }
}
