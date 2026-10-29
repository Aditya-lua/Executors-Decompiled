package pc;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28405a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f28408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f28411h;

    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f28405a = i10;
        this.b = s2.a.b(f10, f11, f12);
        this.f28406c = i11;
        this.f28408e = f13;
        this.f28407d = i12;
        this.f28409f = f14;
        this.f28410g = i13;
        d(f15, f11, f12, f14);
        this.f28411h = b(f14);
    }

    public static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f28411h < aVar.f28411h) {
                        if (aVar2.f28411h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    public final float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    public final float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f28409f) * this.f28405a;
        }
        return Float.MAX_VALUE;
    }

    public final void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f28406c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.b;
            this.b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.b;
            this.b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f28406c;
        float f17 = i11 > 0 ? this.b : 0.0f;
        this.b = f17;
        float fA = a(f10, i11, f17, this.f28407d, this.f28410g);
        this.f28409f = fA;
        float f18 = (this.b + fA) / 2.0f;
        this.f28408e = f18;
        int i12 = this.f28407d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f28410g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f28408e -= fMin / this.f28407d;
            this.f28409f += fMin / this.f28410g;
        } else {
            this.f28408e += fMin / this.f28407d;
            this.f28409f -= fMin / this.f28410g;
        }
    }

    public int e() {
        return this.f28406c + this.f28407d + this.f28410g;
    }

    public final float f() {
        return (this.f28409f * this.f28410g) + (this.f28408e * this.f28407d) + (this.b * this.f28406c);
    }

    public final boolean g() {
        int i10 = this.f28410g;
        if (i10 <= 0 || this.f28406c <= 0 || this.f28407d <= 0) {
            return i10 <= 0 || this.f28406c <= 0 || this.f28409f > this.b;
        }
        float f10 = this.f28409f;
        float f11 = this.f28408e;
        return f10 > f11 && f11 > this.b;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f28405a + ", smallCount=" + this.f28406c + ", smallSize=" + this.b + ", mediumCount=" + this.f28407d + ", mediumSize=" + this.f28408e + ", largeCount=" + this.f28410g + ", largeSize=" + this.f28409f + ", cost=" + this.f28411h + "]";
    }
}
