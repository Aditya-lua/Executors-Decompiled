package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o1 f8516f = new o1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8517a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f8518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8520e;

    public o1() {
        this(0, new int[8], new Object[8], true);
    }

    public static o1 c() {
        return f8516f;
    }

    public static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    public static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    public static o1 j(o1 o1Var, o1 o1Var2) {
        int i10 = o1Var.f8517a + o1Var2.f8517a;
        int[] iArrCopyOf = Arrays.copyOf(o1Var.b, i10);
        System.arraycopy(o1Var2.b, 0, iArrCopyOf, o1Var.f8517a, o1Var2.f8517a);
        Object[] objArrCopyOf = Arrays.copyOf(o1Var.f8518c, i10);
        System.arraycopy(o1Var2.f8518c, 0, objArrCopyOf, o1Var.f8517a, o1Var2.f8517a);
        return new o1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static o1 k() {
        return new o1();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i10, Object obj, t1 t1Var) {
        int iA = s1.a(i10);
        int iB = s1.b(i10);
        if (iB == 0) {
            t1Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            t1Var.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            t1Var.M(iA, (h) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(b0.e());
            }
            t1Var.c(iA, ((Integer) obj).intValue());
        } else if (t1Var.t() == t1.a.ASCENDING) {
            t1Var.x(iA);
            ((o1) obj).r(t1Var);
            t1Var.C(iA);
        } else {
            t1Var.C(iA);
            ((o1) obj).r(t1Var);
            t1Var.x(iA);
        }
    }

    public void a() {
        if (!this.f8520e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.f8517a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.f8518c = Arrays.copyOf(this.f8518c, i10);
        }
    }

    public int d() {
        int iX;
        int i10 = this.f8519d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f8517a; i12++) {
            int i13 = this.b[i12];
            int iA = s1.a(i13);
            int iB = s1.b(i13);
            if (iB == 0) {
                iX = k.X(iA, ((Long) this.f8518c[i12]).longValue());
            } else if (iB == 1) {
                iX = k.o(iA, ((Long) this.f8518c[i12]).longValue());
            } else if (iB == 2) {
                iX = k.g(iA, (h) this.f8518c[i12]);
            } else if (iB == 3) {
                iX = (k.U(iA) * 2) + ((o1) this.f8518c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(b0.e());
                }
                iX = k.m(iA, ((Integer) this.f8518c[i12]).intValue());
            }
            i11 += iX;
        }
        this.f8519d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f8519d;
        if (i10 != -1) {
            return i10;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < this.f8517a; i11++) {
            iJ += k.J(s1.a(this.b[i11]), (h) this.f8518c[i11]);
        }
        this.f8519d = iJ;
        return iJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f8517a;
        return i10 == o1Var.f8517a && o(this.b, o1Var.b, i10) && l(this.f8518c, o1Var.f8518c, this.f8517a);
    }

    public void h() {
        if (this.f8520e) {
            this.f8520e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f8517a;
        return ((((527 + i10) * 31) + f(this.b, i10)) * 31) + g(this.f8518c, this.f8517a);
    }

    public o1 i(o1 o1Var) {
        if (o1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f8517a + o1Var.f8517a;
        b(i10);
        System.arraycopy(o1Var.b, 0, this.b, this.f8517a, o1Var.f8517a);
        System.arraycopy(o1Var.f8518c, 0, this.f8518c, this.f8517a, o1Var.f8517a);
        this.f8517a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f8517a; i11++) {
            u0.d(sb2, i10, String.valueOf(s1.a(this.b[i11])), this.f8518c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f8517a + 1);
        int[] iArr = this.b;
        int i11 = this.f8517a;
        iArr[i11] = i10;
        this.f8518c[i11] = obj;
        this.f8517a = i11 + 1;
    }

    public void p(t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            for (int i10 = this.f8517a - 1; i10 >= 0; i10--) {
                t1Var.b(s1.a(this.b[i10]), this.f8518c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f8517a; i11++) {
            t1Var.b(s1.a(this.b[i11]), this.f8518c[i11]);
        }
    }

    public void r(t1 t1Var) {
        if (this.f8517a == 0) {
            return;
        }
        if (t1Var.t() == t1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f8517a; i10++) {
                q(this.b[i10], this.f8518c[i10], t1Var);
            }
            return;
        }
        for (int i11 = this.f8517a - 1; i11 >= 0; i11--) {
            q(this.b[i11], this.f8518c[i11], t1Var);
        }
    }

    public o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f8519d = -1;
        this.f8517a = i10;
        this.b = iArr;
        this.f8518c = objArr;
        this.f8520e = z10;
    }
}
