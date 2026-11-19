package rc;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30640a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f30643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f30644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f30646h;

    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f30640a = i10;
        this.b = s2.a.b(f10, f11, f12);
        this.f30641c = i11;
        this.f30643e = f13;
        this.f30642d = i12;
        this.f30644f = f14;
        this.f30645g = i13;
        d(f15, f11, f12, f14);
        this.f30646h = b(f14);
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
                    if (aVar == null || aVar2.f30646h < aVar.f30646h) {
                        if (aVar2.f30646h == 0.0f) {
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
            return Math.abs(f10 - this.f30644f) * this.f30640a;
        }
        return Float.MAX_VALUE;
    }

    public final void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f30641c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.b;
            this.b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.b;
            this.b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f30641c;
        float f17 = i11 > 0 ? this.b : 0.0f;
        this.b = f17;
        float fA = a(f10, i11, f17, this.f30642d, this.f30645g);
        this.f30644f = fA;
        float f18 = (this.b + fA) / 2.0f;
        this.f30643e = f18;
        int i12 = this.f30642d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f30645g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f30643e -= fMin / this.f30642d;
            this.f30644f += fMin / this.f30645g;
        } else {
            this.f30643e += fMin / this.f30642d;
            this.f30644f -= fMin / this.f30645g;
        }
    }

    public int e() {
        return this.f30641c + this.f30642d + this.f30645g;
    }

    public final float f() {
        return (this.f30644f * this.f30645g) + (this.f30643e * this.f30642d) + (this.b * this.f30641c);
    }

    public final boolean g() {
        int i10 = this.f30645g;
        if (i10 <= 0 || this.f30641c <= 0 || this.f30642d <= 0) {
            return i10 <= 0 || this.f30641c <= 0 || this.f30644f > this.b;
        }
        float f10 = this.f30644f;
        float f11 = this.f30643e;
        return f10 > f11 && f11 > this.b;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f30640a + ", smallCount=" + this.f30641c + ", smallSize=" + this.b + ", mediumCount=" + this.f30642d + ", mediumSize=" + this.f30643e + ", largeCount=" + this.f30645g + ", largeSize=" + this.f30644f + ", cost=" + this.f30646h + "]";
    }
}
