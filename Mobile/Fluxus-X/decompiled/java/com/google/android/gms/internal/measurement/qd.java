package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qd f6792f = new qd(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6793a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6796e;

    public qd(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f6795d = -1;
        this.f6793a = i10;
        this.b = iArr;
        this.f6794c = objArr;
        this.f6796e = z10;
    }

    public static qd a() {
        return f6792f;
    }

    public static qd b() {
        return new qd(0, new int[8], new Object[8], true);
    }

    public static qd c(qd qdVar, qd qdVar2) {
        int i10 = qdVar.f6793a + qdVar2.f6793a;
        int[] iArrCopyOf = Arrays.copyOf(qdVar.b, i10);
        System.arraycopy(qdVar2.b, 0, iArrCopyOf, qdVar.f6793a, qdVar2.f6793a);
        Object[] objArrCopyOf = Arrays.copyOf(qdVar.f6794c, i10);
        System.arraycopy(qdVar2.f6794c, 0, objArrCopyOf, qdVar.f6793a, qdVar2.f6793a);
        return new qd(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final void d() {
        if (this.f6796e) {
            this.f6796e = false;
        }
    }

    public final void e() {
        if (!this.f6796e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        int i10 = this.f6793a;
        if (i10 == qdVar.f6793a) {
            int[] iArr = this.b;
            int[] iArr2 = qdVar.b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f6794c;
            Object[] objArr2 = qdVar.f6794c;
            int i12 = this.f6793a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(ce ceVar) {
        for (int i10 = 0; i10 < this.f6793a; i10++) {
            ceVar.J(this.b[i10] >>> 3, this.f6794c[i10]);
        }
    }

    public final void g(ce ceVar) {
        if (this.f6793a != 0) {
            for (int i10 = 0; i10 < this.f6793a; i10++) {
                int i11 = this.b[i10];
                Object obj = this.f6794c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ceVar.k(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ceVar.w(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ceVar.v(i13, (la) obj);
                } else if (i12 == 3) {
                    ceVar.n(i13);
                    ((qd) obj).g(ceVar);
                    ceVar.o(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new vb("Protocol message tag had invalid wire type."));
                    }
                    ceVar.d(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i10 = this.f6795d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f6793a; i11++) {
            int i12 = this.b[i11] >>> 3;
            la laVar = (la) this.f6794c[i11];
            int iG2 = qa.G(8);
            int iG3 = qa.G(16) + qa.G(i12);
            int iG4 = qa.G(24);
            int iD = laVar.d();
            iG += iG2 + iG2 + iG3 + iG4 + qa.G(iD) + iD;
        }
        this.f6795d = iG;
        return iG;
    }

    public final int hashCode() {
        int i10 = this.f6793a;
        int i11 = i10 + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f6794c;
        int i15 = this.f6793a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int iG;
        int iA;
        int iG2;
        int i10 = this.f6795d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6793a; i12++) {
            int i13 = this.b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f6794c[i12]).getClass();
                    iG2 = qa.G(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    la laVar = (la) this.f6794c[i12];
                    int iG3 = qa.G(i16);
                    int iD = laVar.d();
                    iG2 = iG3 + qa.G(iD) + iD;
                } else if (i15 == 3) {
                    int iG4 = qa.G(i14 << 3);
                    iG = iG4 + iG4;
                    iA = ((qd) this.f6794c[i12]).i();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new vb("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f6794c[i12]).getClass();
                    iG2 = qa.G(i14 << 3) + 4;
                }
                i11 += iG2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f6794c[i12]).longValue();
                iG = qa.G(i17);
                iA = qa.a(jLongValue);
            }
            iG2 = iG + iA;
            i11 += iG2;
        }
        this.f6795d = i11;
        return i11;
    }

    public final void j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f6793a; i11++) {
            uc.b(sb2, i10, String.valueOf(this.b[i11] >>> 3), this.f6794c[i11]);
        }
    }

    public final void k(int i10, Object obj) {
        e();
        m(this.f6793a + 1);
        int[] iArr = this.b;
        int i11 = this.f6793a;
        iArr[i11] = i10;
        this.f6794c[i11] = obj;
        this.f6793a = i11 + 1;
    }

    public final qd l(qd qdVar) {
        if (qdVar.equals(f6792f)) {
            return this;
        }
        e();
        int i10 = this.f6793a + qdVar.f6793a;
        m(i10);
        System.arraycopy(qdVar.b, 0, this.b, this.f6793a, qdVar.f6793a);
        System.arraycopy(qdVar.f6794c, 0, this.f6794c, this.f6793a, qdVar.f6793a);
        this.f6793a = i10;
        return this;
    }

    public final void m(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.f6793a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.f6794c = Arrays.copyOf(this.f6794c, i10);
        }
    }

    public qd() {
        this(0, new int[8], new Object[8], true);
    }
}
