package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class md {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final md f6626f = new md(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6627a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6630e;

    public md(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f6629d = -1;
        this.f6627a = i10;
        this.b = iArr;
        this.f6628c = objArr;
        this.f6630e = z10;
    }

    public static md a() {
        return f6626f;
    }

    public static md b() {
        return new md(0, new int[8], new Object[8], true);
    }

    public static md c(md mdVar, md mdVar2) {
        int i10 = mdVar.f6627a + mdVar2.f6627a;
        int[] iArrCopyOf = Arrays.copyOf(mdVar.b, i10);
        System.arraycopy(mdVar2.b, 0, iArrCopyOf, mdVar.f6627a, mdVar2.f6627a);
        Object[] objArrCopyOf = Arrays.copyOf(mdVar.f6628c, i10);
        System.arraycopy(mdVar2.f6628c, 0, objArrCopyOf, mdVar.f6627a, mdVar2.f6627a);
        return new md(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final void d() {
        if (this.f6630e) {
            this.f6630e = false;
        }
    }

    public final void e() {
        if (!this.f6630e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        int i10 = this.f6627a;
        if (i10 == mdVar.f6627a) {
            int[] iArr = this.b;
            int[] iArr2 = mdVar.b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f6628c;
            Object[] objArr2 = mdVar.f6628c;
            int i12 = this.f6627a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(yd ydVar) {
        for (int i10 = 0; i10 < this.f6627a; i10++) {
            ydVar.J(this.b[i10] >>> 3, this.f6628c[i10]);
        }
    }

    public final void g(yd ydVar) {
        if (this.f6627a != 0) {
            for (int i10 = 0; i10 < this.f6627a; i10++) {
                int i11 = this.b[i10];
                Object obj = this.f6628c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ydVar.k(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ydVar.w(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ydVar.v(i13, (ha) obj);
                } else if (i12 == 3) {
                    ydVar.n(i13);
                    ((md) obj).g(ydVar);
                    ydVar.o(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new rb("Protocol message tag had invalid wire type."));
                    }
                    ydVar.d(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i10 = this.f6629d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f6627a; i11++) {
            int i12 = this.b[i11] >>> 3;
            ha haVar = (ha) this.f6628c[i11];
            int iG2 = ma.G(8);
            int iG3 = ma.G(16) + ma.G(i12);
            int iG4 = ma.G(24);
            int iD = haVar.d();
            iG += iG2 + iG2 + iG3 + iG4 + ma.G(iD) + iD;
        }
        this.f6629d = iG;
        return iG;
    }

    public final int hashCode() {
        int i10 = this.f6627a;
        int i11 = i10 + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f6628c;
        int i15 = this.f6627a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int iG;
        int iA;
        int iG2;
        int i10 = this.f6629d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6627a; i12++) {
            int i13 = this.b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f6628c[i12]).getClass();
                    iG2 = ma.G(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    ha haVar = (ha) this.f6628c[i12];
                    int iG3 = ma.G(i16);
                    int iD = haVar.d();
                    iG2 = iG3 + ma.G(iD) + iD;
                } else if (i15 == 3) {
                    int iG4 = ma.G(i14 << 3);
                    iG = iG4 + iG4;
                    iA = ((md) this.f6628c[i12]).i();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new rb("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f6628c[i12]).getClass();
                    iG2 = ma.G(i14 << 3) + 4;
                }
                i11 += iG2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f6628c[i12]).longValue();
                iG = ma.G(i17);
                iA = ma.a(jLongValue);
            }
            iG2 = iG + iA;
            i11 += iG2;
        }
        this.f6629d = i11;
        return i11;
    }

    public final void j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f6627a; i11++) {
            qc.b(sb2, i10, String.valueOf(this.b[i11] >>> 3), this.f6628c[i11]);
        }
    }

    public final void k(int i10, Object obj) {
        e();
        m(this.f6627a + 1);
        int[] iArr = this.b;
        int i11 = this.f6627a;
        iArr[i11] = i10;
        this.f6628c[i11] = obj;
        this.f6627a = i11 + 1;
    }

    public final md l(md mdVar) {
        if (mdVar.equals(f6626f)) {
            return this;
        }
        e();
        int i10 = this.f6627a + mdVar.f6627a;
        m(i10);
        System.arraycopy(mdVar.b, 0, this.b, this.f6627a, mdVar.f6627a);
        System.arraycopy(mdVar.f6628c, 0, this.f6628c, this.f6627a, mdVar.f6627a);
        this.f6627a = i10;
        return this;
    }

    public final void m(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.f6627a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.f6628c = Arrays.copyOf(this.f6628c, i10);
        }
    }

    public md() {
        this(0, new int[8], new Object[8], true);
    }
}
