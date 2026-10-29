package p377qc;

import androidx.annotation.NonNull;
import p426s2.C11162a;

/* JADX INFO: renamed from: qc.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10495a {

    /* JADX INFO: renamed from: a */
    public final int f37706a;

    /* JADX INFO: renamed from: b */
    public float f37707b;

    /* JADX INFO: renamed from: c */
    public int f37708c;

    /* JADX INFO: renamed from: d */
    public int f37709d;

    /* JADX INFO: renamed from: e */
    public float f37710e;

    /* JADX INFO: renamed from: f */
    public float f37711f;

    /* JADX INFO: renamed from: g */
    public final int f37712g;

    /* JADX INFO: renamed from: h */
    public final float f37713h;

    public C10495a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f37706a = i10;
        this.f37707b = C11162a.m42059b(f10, f11, f12);
        this.f37708c = i11;
        this.f37710e = f13;
        this.f37709d = i12;
        this.f37711f = f14;
        this.f37712g = i13;
        m40300d(f15, f11, f12, f14);
        this.f37713h = m40299b(f14);
    }

    /* JADX INFO: renamed from: c */
    public static C10495a m40297c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        C10495a c10495a = null;
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
                    C10495a c10495a2 = new C10495a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (c10495a == null || c10495a2.f37713h < c10495a.f37713h) {
                        if (c10495a2.f37713h == 0.0f) {
                            return c10495a2;
                        }
                        c10495a = c10495a2;
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
        return c10495a;
    }

    /* JADX INFO: renamed from: a */
    public final float m40298a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    /* JADX INFO: renamed from: b */
    public final float m40299b(float f10) {
        if (m40303g()) {
            return Math.abs(f10 - this.f37711f) * this.f37706a;
        }
        return Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public final void m40300d(float f10, float f11, float f12, float f13) {
        float fM40302f = f10 - m40302f();
        int i10 = this.f37708c;
        if (i10 > 0 && fM40302f > 0.0f) {
            float f14 = this.f37707b;
            this.f37707b = f14 + Math.min(fM40302f / i10, f12 - f14);
        } else if (i10 > 0 && fM40302f < 0.0f) {
            float f15 = this.f37707b;
            this.f37707b = f15 + Math.max(fM40302f / i10, f11 - f15);
        }
        int i11 = this.f37708c;
        float f16 = i11 > 0 ? this.f37707b : 0.0f;
        this.f37707b = f16;
        float fM40298a = m40298a(f10, i11, f16, this.f37709d, this.f37712g);
        this.f37711f = fM40298a;
        float f17 = (this.f37707b + fM40298a) / 2.0f;
        this.f37710e = f17;
        int i12 = this.f37709d;
        if (i12 <= 0 || fM40298a == f13) {
            return;
        }
        float f18 = (f13 - fM40298a) * this.f37712g;
        float fMin = Math.min(Math.abs(f18), f17 * 0.1f * i12);
        if (f18 > 0.0f) {
            this.f37710e -= fMin / this.f37709d;
            this.f37711f += fMin / this.f37712g;
        } else {
            this.f37710e += fMin / this.f37709d;
            this.f37711f -= fMin / this.f37712g;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m40301e() {
        return this.f37708c + this.f37709d + this.f37712g;
    }

    /* JADX INFO: renamed from: f */
    public final float m40302f() {
        return (this.f37711f * this.f37712g) + (this.f37710e * this.f37709d) + (this.f37707b * this.f37708c);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m40303g() {
        int i10 = this.f37712g;
        if (i10 <= 0 || this.f37708c <= 0 || this.f37709d <= 0) {
            return i10 <= 0 || this.f37708c <= 0 || this.f37711f > this.f37707b;
        }
        float f10 = this.f37711f;
        float f11 = this.f37710e;
        return f10 > f11 && f11 > this.f37707b;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f37706a + ", smallCount=" + this.f37708c + ", smallSize=" + this.f37707b + ", mediumCount=" + this.f37709d + ", mediumSize=" + this.f37710e + ", largeCount=" + this.f37712g + ", largeSize=" + this.f37711f + ", cost=" + this.f37713h + "]";
    }
}
