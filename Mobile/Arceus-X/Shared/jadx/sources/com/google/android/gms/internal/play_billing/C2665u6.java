package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2665u6 {

    /* JADX INFO: renamed from: f */
    public static final C2665u6 f9401f = new C2665u6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f9402a;

    /* JADX INFO: renamed from: b */
    public int[] f9403b;

    /* JADX INFO: renamed from: c */
    public Object[] f9404c;

    /* JADX INFO: renamed from: d */
    public int f9405d;

    /* JADX INFO: renamed from: e */
    public boolean f9406e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2665u6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f9405d = -1;
        this.f9402a = i10;
        this.f9403b = iArr;
        this.f9404c = objArr;
        this.f9406e = z10;
    }

    /* JADX INFO: renamed from: c */
    public static C2665u6 m11776c() {
        return f9401f;
    }

    /* JADX INFO: renamed from: e */
    public static C2665u6 m11777e(C2665u6 c2665u6, C2665u6 c2665u7) {
        int i10 = c2665u6.f9402a + c2665u7.f9402a;
        int[] iArrCopyOf = Arrays.copyOf(c2665u6.f9403b, i10);
        System.arraycopy(c2665u7.f9403b, 0, iArrCopyOf, c2665u6.f9402a, c2665u7.f9402a);
        Object[] objArrCopyOf = Arrays.copyOf(c2665u6.f9404c, i10);
        System.arraycopy(c2665u7.f9404c, 0, objArrCopyOf, c2665u6.f9402a, c2665u7.f9402a);
        return new C2665u6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: f */
    public static C2665u6 m11778f() {
        return new C2665u6(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m11779a() {
        int iM11173v;
        int iM11174w;
        int iM11173v2;
        int i10 = this.f9405d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f9402a; i12++) {
            int i13 = this.f9403b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f9404c[i12]).getClass();
                    iM11173v2 = AbstractC2443a4.m11173v(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    AbstractC2640s3 abstractC2640s3 = (AbstractC2640s3) this.f9404c[i12];
                    int iM11173v3 = AbstractC2443a4.m11173v(i16);
                    int iMo11587d = abstractC2640s3.mo11587d();
                    iM11173v2 = iM11173v3 + AbstractC2443a4.m11173v(iMo11587d) + iMo11587d;
                } else if (i15 == 3) {
                    int iM11173v4 = AbstractC2443a4.m11173v(i14 << 3);
                    iM11173v = iM11173v4 + iM11173v4;
                    iM11174w = ((C2665u6) this.f9404c[i12]).m11779a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C2488e5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f9404c[i12]).getClass();
                    iM11173v2 = AbstractC2443a4.m11173v(i14 << 3) + 4;
                }
                i11 += iM11173v2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f9404c[i12]).longValue();
                iM11173v = AbstractC2443a4.m11173v(i17);
                iM11174w = AbstractC2443a4.m11174w(jLongValue);
            }
            iM11173v2 = iM11173v + iM11174w;
            i11 += iM11173v2;
        }
        this.f9405d = i11;
        return i11;
    }

    /* JADX INFO: renamed from: b */
    public final int m11780b() {
        int i10 = this.f9405d;
        if (i10 != -1) {
            return i10;
        }
        int iM11173v = 0;
        for (int i11 = 0; i11 < this.f9402a; i11++) {
            int i12 = this.f9403b[i11] >>> 3;
            AbstractC2640s3 abstractC2640s3 = (AbstractC2640s3) this.f9404c[i11];
            int iM11173v2 = AbstractC2443a4.m11173v(8);
            int iM11173v3 = AbstractC2443a4.m11173v(16) + AbstractC2443a4.m11173v(i12);
            int iM11173v4 = AbstractC2443a4.m11173v(24);
            int iMo11587d = abstractC2640s3.mo11587d();
            iM11173v += iM11173v2 + iM11173v2 + iM11173v3 + iM11173v4 + AbstractC2443a4.m11173v(iMo11587d) + iMo11587d;
        }
        this.f9405d = iM11173v;
        return iM11173v;
    }

    /* JADX INFO: renamed from: d */
    public final C2665u6 m11781d(C2665u6 c2665u6) {
        if (c2665u6.equals(f9401f)) {
            return this;
        }
        m11782g();
        int i10 = this.f9402a + c2665u6.f9402a;
        m11788m(i10);
        System.arraycopy(c2665u6.f9403b, 0, this.f9403b, this.f9402a, c2665u6.f9402a);
        System.arraycopy(c2665u6.f9404c, 0, this.f9404c, this.f9402a, c2665u6.f9402a);
        this.f9402a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2665u6)) {
            return false;
        }
        C2665u6 c2665u6 = (C2665u6) obj;
        int i10 = this.f9402a;
        if (i10 == c2665u6.f9402a) {
            int[] iArr = this.f9403b;
            int[] iArr2 = c2665u6.f9403b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f9404c;
            Object[] objArr2 = c2665u6.f9404c;
            int i12 = this.f9402a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m11782g() {
        if (!this.f9406e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11783h() {
        if (this.f9406e) {
            this.f9406e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f9402a;
        int i11 = i10 + 527;
        int[] iArr = this.f9403b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f9404c;
        int i15 = this.f9402a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m11784i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f9402a; i11++) {
            C2719z5.m11860b(sb2, i10, String.valueOf(this.f9403b[i11] >>> 3), this.f9404c[i11]);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11785j(int i10, Object obj) {
        m11782g();
        m11788m(this.f9402a + 1);
        int[] iArr = this.f9403b;
        int i11 = this.f9402a;
        iArr[i11] = i10;
        this.f9404c[i11] = obj;
        this.f9402a = i11 + 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m11786k(InterfaceC2534i7 interfaceC2534i7) {
        for (int i10 = 0; i10 < this.f9402a; i10++) {
            interfaceC2534i7.mo11280D(this.f9403b[i10] >>> 3, this.f9404c[i10]);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11787l(InterfaceC2534i7 interfaceC2534i7) {
        if (this.f9402a != 0) {
            for (int i10 = 0; i10 < this.f9402a; i10++) {
                int i11 = this.f9403b[i10];
                Object obj = this.f9404c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC2534i7.mo11299k(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC2534i7.mo11288L(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC2534i7.mo11281E(i13, (AbstractC2640s3) obj);
                } else if (i12 == 3) {
                    interfaceC2534i7.mo11305q(i13);
                    ((C2665u6) obj).m11787l(interfaceC2534i7);
                    interfaceC2534i7.mo11311w(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C2488e5("Protocol message tag had invalid wire type."));
                    }
                    interfaceC2534i7.mo11292d(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11788m(int i10) {
        int[] iArr = this.f9403b;
        if (i10 > iArr.length) {
            int i11 = this.f9402a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f9403b = Arrays.copyOf(iArr, i10);
            this.f9404c = Arrays.copyOf(this.f9404c, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2665u6() {
        this(0, new int[8], new Object[8], true);
    }
}
