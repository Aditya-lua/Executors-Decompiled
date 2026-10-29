package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.md */
/* JADX INFO: loaded from: classes.dex */
public final class C2197md {

    /* JADX INFO: renamed from: f */
    public static final C2197md f8421f = new C2197md(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f8422a;

    /* JADX INFO: renamed from: b */
    public int[] f8423b;

    /* JADX INFO: renamed from: c */
    public Object[] f8424c;

    /* JADX INFO: renamed from: d */
    public int f8425d;

    /* JADX INFO: renamed from: e */
    public boolean f8426e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2197md(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f8425d = -1;
        this.f8422a = i10;
        this.f8423b = iArr;
        this.f8424c = objArr;
        this.f8426e = z10;
    }

    /* JADX INFO: renamed from: a */
    public static C2197md m10389a() {
        return f8421f;
    }

    /* JADX INFO: renamed from: b */
    public static C2197md m10390b() {
        return new C2197md(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: c */
    public static C2197md m10391c(C2197md c2197md, C2197md c2197md2) {
        int i10 = c2197md.f8422a + c2197md2.f8422a;
        int[] iArrCopyOf = Arrays.copyOf(c2197md.f8423b, i10);
        System.arraycopy(c2197md2.f8423b, 0, iArrCopyOf, c2197md.f8422a, c2197md2.f8422a);
        Object[] objArrCopyOf = Arrays.copyOf(c2197md.f8424c, i10);
        System.arraycopy(c2197md2.f8424c, 0, objArrCopyOf, c2197md.f8422a, c2197md2.f8422a);
        return new C2197md(i10, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m10392d() {
        if (this.f8426e) {
            this.f8426e = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10393e() {
        if (!this.f8426e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2197md)) {
            return false;
        }
        C2197md c2197md = (C2197md) obj;
        int i10 = this.f8422a;
        if (i10 == c2197md.f8422a) {
            int[] iArr = this.f8423b;
            int[] iArr2 = c2197md.f8423b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f8424c;
            Object[] objArr2 = c2197md.f8424c;
            int i12 = this.f8422a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m10394f(InterfaceC2413yd interfaceC2413yd) {
        for (int i10 = 0; i10 < this.f8422a; i10++) {
            interfaceC2413yd.mo10442J(this.f8423b[i10] >>> 3, this.f8424c[i10]);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10395g(InterfaceC2413yd interfaceC2413yd) {
        if (this.f8422a != 0) {
            for (int i10 = 0; i10 < this.f8422a; i10++) {
                int i11 = this.f8423b[i10];
                Object obj = this.f8424c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC2413yd.mo10455k(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC2413yd.mo10467w(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC2413yd.mo10466v(i13, (AbstractC2104ha) obj);
                } else if (i12 == 3) {
                    interfaceC2413yd.mo10458n(i13);
                    ((C2197md) obj).m10395g(interfaceC2413yd);
                    interfaceC2413yd.mo10459o(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C2285rb("Protocol message tag had invalid wire type."));
                    }
                    interfaceC2413yd.mo10448d(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m10396h() {
        int i10 = this.f8425d;
        if (i10 != -1) {
            return i10;
        }
        int iM10380G = 0;
        for (int i11 = 0; i11 < this.f8422a; i11++) {
            int i12 = this.f8423b[i11] >>> 3;
            AbstractC2104ha abstractC2104ha = (AbstractC2104ha) this.f8424c[i11];
            int iM10380G2 = AbstractC2194ma.m10380G(8);
            int iM10380G3 = AbstractC2194ma.m10380G(16) + AbstractC2194ma.m10380G(i12);
            int iM10380G4 = AbstractC2194ma.m10380G(24);
            int iMo9871d = abstractC2104ha.mo9871d();
            iM10380G += iM10380G2 + iM10380G2 + iM10380G3 + iM10380G4 + AbstractC2194ma.m10380G(iMo9871d) + iMo9871d;
        }
        this.f8425d = iM10380G;
        return iM10380G;
    }

    public final int hashCode() {
        int i10 = this.f8422a;
        int i11 = i10 + 527;
        int[] iArr = this.f8423b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f8424c;
        int i15 = this.f8422a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final int m10397i() {
        int iM10380G;
        int iM10381a;
        int iM10380G2;
        int i10 = this.f8425d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f8422a; i12++) {
            int i13 = this.f8423b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f8424c[i12]).getClass();
                    iM10380G2 = AbstractC2194ma.m10380G(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    AbstractC2104ha abstractC2104ha = (AbstractC2104ha) this.f8424c[i12];
                    int iM10380G3 = AbstractC2194ma.m10380G(i16);
                    int iMo9871d = abstractC2104ha.mo9871d();
                    iM10380G2 = iM10380G3 + AbstractC2194ma.m10380G(iMo9871d) + iMo9871d;
                } else if (i15 == 3) {
                    int iM10380G4 = AbstractC2194ma.m10380G(i14 << 3);
                    iM10380G = iM10380G4 + iM10380G4;
                    iM10381a = ((C2197md) this.f8424c[i12]).m10397i();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C2285rb("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f8424c[i12]).getClass();
                    iM10380G2 = AbstractC2194ma.m10380G(i14 << 3) + 4;
                }
                i11 += iM10380G2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f8424c[i12]).longValue();
                iM10380G = AbstractC2194ma.m10380G(i17);
                iM10381a = AbstractC2194ma.m10381a(jLongValue);
            }
            iM10380G2 = iM10380G + iM10381a;
            i11 += iM10380G2;
        }
        this.f8425d = i11;
        return i11;
    }

    /* JADX INFO: renamed from: j */
    public final void m10398j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f8422a; i11++) {
            C2268qc.m10581b(sb2, i10, String.valueOf(this.f8423b[i11] >>> 3), this.f8424c[i11]);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10399k(int i10, Object obj) {
        m10393e();
        m10401m(this.f8422a + 1);
        int[] iArr = this.f8423b;
        int i11 = this.f8422a;
        iArr[i11] = i10;
        this.f8424c[i11] = obj;
        this.f8422a = i11 + 1;
    }

    /* JADX INFO: renamed from: l */
    public final C2197md m10400l(C2197md c2197md) {
        if (c2197md.equals(f8421f)) {
            return this;
        }
        m10393e();
        int i10 = this.f8422a + c2197md.f8422a;
        m10401m(i10);
        System.arraycopy(c2197md.f8423b, 0, this.f8423b, this.f8422a, c2197md.f8422a);
        System.arraycopy(c2197md.f8424c, 0, this.f8424c, this.f8422a, c2197md.f8422a);
        this.f8422a = i10;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m10401m(int i10) {
        int[] iArr = this.f8423b;
        if (i10 > iArr.length) {
            int i11 = this.f8422a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f8423b = Arrays.copyOf(iArr, i10);
            this.f8424c = Arrays.copyOf(this.f8424c, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2197md() {
        this(0, new int[8], new Object[8], true);
    }
}
