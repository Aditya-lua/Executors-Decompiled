package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u6 f7329f = new u6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7330a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f7331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7333e;

    public u6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7332d = -1;
        this.f7330a = i10;
        this.b = iArr;
        this.f7331c = objArr;
        this.f7333e = z10;
    }

    public static u6 c() {
        return f7329f;
    }

    public static u6 e(u6 u6Var, u6 u6Var2) {
        int i10 = u6Var.f7330a + u6Var2.f7330a;
        int[] iArrCopyOf = Arrays.copyOf(u6Var.b, i10);
        System.arraycopy(u6Var2.b, 0, iArrCopyOf, u6Var.f7330a, u6Var2.f7330a);
        Object[] objArrCopyOf = Arrays.copyOf(u6Var.f7331c, i10);
        System.arraycopy(u6Var2.f7331c, 0, objArrCopyOf, u6Var.f7330a, u6Var2.f7330a);
        return new u6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static u6 f() {
        return new u6(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iV;
        int iW;
        int iV2;
        int i10 = this.f7332d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7330a; i12++) {
            int i13 = this.b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f7331c[i12]).getClass();
                    iV2 = a4.v(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    s3 s3Var = (s3) this.f7331c[i12];
                    int iV3 = a4.v(i16);
                    int iD = s3Var.d();
                    iV2 = iV3 + a4.v(iD) + iD;
                } else if (i15 == 3) {
                    int iV4 = a4.v(i14 << 3);
                    iV = iV4 + iV4;
                    iW = ((u6) this.f7331c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new e5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f7331c[i12]).getClass();
                    iV2 = a4.v(i14 << 3) + 4;
                }
                i11 += iV2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f7331c[i12]).longValue();
                iV = a4.v(i17);
                iW = a4.w(jLongValue);
            }
            iV2 = iV + iW;
            i11 += iV2;
        }
        this.f7332d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f7332d;
        if (i10 != -1) {
            return i10;
        }
        int iV = 0;
        for (int i11 = 0; i11 < this.f7330a; i11++) {
            int i12 = this.b[i11] >>> 3;
            s3 s3Var = (s3) this.f7331c[i11];
            int iV2 = a4.v(8);
            int iV3 = a4.v(16) + a4.v(i12);
            int iV4 = a4.v(24);
            int iD = s3Var.d();
            iV += iV2 + iV2 + iV3 + iV4 + a4.v(iD) + iD;
        }
        this.f7332d = iV;
        return iV;
    }

    public final u6 d(u6 u6Var) {
        if (u6Var.equals(f7329f)) {
            return this;
        }
        g();
        int i10 = this.f7330a + u6Var.f7330a;
        m(i10);
        System.arraycopy(u6Var.b, 0, this.b, this.f7330a, u6Var.f7330a);
        System.arraycopy(u6Var.f7331c, 0, this.f7331c, this.f7330a, u6Var.f7330a);
        this.f7330a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        int i10 = this.f7330a;
        if (i10 == u6Var.f7330a) {
            int[] iArr = this.b;
            int[] iArr2 = u6Var.b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f7331c;
            Object[] objArr2 = u6Var.f7331c;
            int i12 = this.f7330a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g() {
        if (!this.f7333e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f7333e) {
            this.f7333e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f7330a;
        int i11 = i10 + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f7331c;
        int i15 = this.f7330a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f7330a; i11++) {
            z5.b(sb2, i10, String.valueOf(this.b[i11] >>> 3), this.f7331c[i11]);
        }
    }

    public final void j(int i10, Object obj) {
        g();
        m(this.f7330a + 1);
        int[] iArr = this.b;
        int i11 = this.f7330a;
        iArr[i11] = i10;
        this.f7331c[i11] = obj;
        this.f7330a = i11 + 1;
    }

    public final void k(i7 i7Var) {
        for (int i10 = 0; i10 < this.f7330a; i10++) {
            i7Var.D(this.b[i10] >>> 3, this.f7331c[i10]);
        }
    }

    public final void l(i7 i7Var) {
        if (this.f7330a != 0) {
            for (int i10 = 0; i10 < this.f7330a; i10++) {
                int i11 = this.b[i10];
                Object obj = this.f7331c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    i7Var.k(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    i7Var.L(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    i7Var.E(i13, (s3) obj);
                } else if (i12 == 3) {
                    i7Var.q(i13);
                    ((u6) obj).l(i7Var);
                    i7Var.w(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new e5("Protocol message tag had invalid wire type."));
                    }
                    i7Var.d(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void m(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.f7330a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.f7331c = Arrays.copyOf(this.f7331c, i10);
        }
    }

    public u6() {
        this(0, new int[8], new Object[8], true);
    }
}
