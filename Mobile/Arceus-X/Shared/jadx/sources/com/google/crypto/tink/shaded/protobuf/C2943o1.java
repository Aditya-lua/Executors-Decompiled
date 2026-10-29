package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2943o1 {

    /* JADX INFO: renamed from: f */
    public static final C2943o1 f10951f = new C2943o1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f10952a;

    /* JADX INFO: renamed from: b */
    public int[] f10953b;

    /* JADX INFO: renamed from: c */
    public Object[] f10954c;

    /* JADX INFO: renamed from: d */
    public int f10955d;

    /* JADX INFO: renamed from: e */
    public boolean f10956e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2943o1() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: c */
    public static C2943o1 m14017c() {
        return f10951f;
    }

    /* JADX INFO: renamed from: f */
    public static int m14018f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m14019g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public static C2943o1 m14020j(C2943o1 c2943o1, C2943o1 c2943o2) {
        int i10 = c2943o1.f10952a + c2943o2.f10952a;
        int[] iArrCopyOf = Arrays.copyOf(c2943o1.f10953b, i10);
        System.arraycopy(c2943o2.f10953b, 0, iArrCopyOf, c2943o1.f10952a, c2943o2.f10952a);
        Object[] objArrCopyOf = Arrays.copyOf(c2943o1.f10954c, i10);
        System.arraycopy(c2943o2.f10954c, 0, objArrCopyOf, c2943o1.f10952a, c2943o2.f10952a);
        return new C2943o1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: k */
    public static C2943o1 m14021k() {
        return new C2943o1();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m14022l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m14023o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static void m14024q(int i10, Object obj, InterfaceC2958t1 interfaceC2958t1) {
        int iM14179a = C2955s1.m14179a(i10);
        int iM14180b = C2955s1.m14180b(i10);
        if (iM14180b == 0) {
            interfaceC2958t1.mo13946u(iM14179a, ((Long) obj).longValue());
            return;
        }
        if (iM14180b == 1) {
            interfaceC2958t1.mo13942s(iM14179a, ((Long) obj).longValue());
            return;
        }
        if (iM14180b == 2) {
            interfaceC2958t1.mo13893M(iM14179a, (AbstractC2920h) obj);
            return;
        }
        if (iM14180b != 3) {
            if (iM14180b != 5) {
                throw new RuntimeException(C2903b0.m13400e());
            }
            interfaceC2958t1.mo13910c(iM14179a, ((Integer) obj).intValue());
        } else if (interfaceC2958t1.mo13944t() == InterfaceC2958t1.a.ASCENDING) {
            interfaceC2958t1.mo13949x(iM14179a);
            ((C2943o1) obj).m14034r(interfaceC2958t1);
            interfaceC2958t1.mo13883C(iM14179a);
        } else {
            interfaceC2958t1.mo13883C(iM14179a);
            ((C2943o1) obj).m14034r(interfaceC2958t1);
            interfaceC2958t1.mo13949x(iM14179a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14025a() {
        if (!this.f10956e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14026b(int i10) {
        int[] iArr = this.f10953b;
        if (i10 > iArr.length) {
            int i11 = this.f10952a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f10953b = Arrays.copyOf(iArr, i10);
            this.f10954c = Arrays.copyOf(this.f10954c, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m14027d() {
        int iM13778X;
        int i10 = this.f10955d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f10952a; i12++) {
            int i13 = this.f10953b[i12];
            int iM14179a = C2955s1.m14179a(i13);
            int iM14180b = C2955s1.m14180b(i13);
            if (iM14180b == 0) {
                iM13778X = AbstractC2929k.m13778X(iM14179a, ((Long) this.f10954c[i12]).longValue());
            } else if (iM14180b == 1) {
                iM13778X = AbstractC2929k.m13797o(iM14179a, ((Long) this.f10954c[i12]).longValue());
            } else if (iM14180b == 2) {
                iM13778X = AbstractC2929k.m13788g(iM14179a, (AbstractC2920h) this.f10954c[i12]);
            } else if (iM14180b == 3) {
                iM13778X = (AbstractC2929k.m13775U(iM14179a) * 2) + ((C2943o1) this.f10954c[i12]).m14027d();
            } else {
                if (iM14180b != 5) {
                    throw new IllegalStateException(C2903b0.m13400e());
                }
                iM13778X = AbstractC2929k.m13795m(iM14179a, ((Integer) this.f10954c[i12]).intValue());
            }
            i11 += iM13778X;
        }
        this.f10955d = i11;
        return i11;
    }

    /* JADX INFO: renamed from: e */
    public int m14028e() {
        int i10 = this.f10955d;
        if (i10 != -1) {
            return i10;
        }
        int iM13764J = 0;
        for (int i11 = 0; i11 < this.f10952a; i11++) {
            iM13764J += AbstractC2929k.m13764J(C2955s1.m14179a(this.f10953b[i11]), (AbstractC2920h) this.f10954c[i11]);
        }
        this.f10955d = iM13764J;
        return iM13764J;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2943o1)) {
            return false;
        }
        C2943o1 c2943o1 = (C2943o1) obj;
        int i10 = this.f10952a;
        return i10 == c2943o1.f10952a && m14023o(this.f10953b, c2943o1.f10953b, i10) && m14022l(this.f10954c, c2943o1.f10954c, this.f10952a);
    }

    /* JADX INFO: renamed from: h */
    public void m14029h() {
        if (this.f10956e) {
            this.f10956e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f10952a;
        return ((((527 + i10) * 31) + m14018f(this.f10953b, i10)) * 31) + m14019g(this.f10954c, this.f10952a);
    }

    /* JADX INFO: renamed from: i */
    public C2943o1 m14030i(C2943o1 c2943o1) {
        if (c2943o1.equals(m14017c())) {
            return this;
        }
        m14025a();
        int i10 = this.f10952a + c2943o1.f10952a;
        m14026b(i10);
        System.arraycopy(c2943o1.f10953b, 0, this.f10953b, this.f10952a, c2943o1.f10952a);
        System.arraycopy(c2943o1.f10954c, 0, this.f10954c, this.f10952a, c2943o1.f10952a);
        this.f10952a = i10;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m14031m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f10952a; i11++) {
            C2960u0.m14216d(sb2, i10, String.valueOf(C2955s1.m14179a(this.f10953b[i11])), this.f10954c[i11]);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14032n(int i10, Object obj) {
        m14025a();
        m14026b(this.f10952a + 1);
        int[] iArr = this.f10953b;
        int i11 = this.f10952a;
        iArr[i11] = i10;
        this.f10954c[i11] = obj;
        this.f10952a = i11 + 1;
    }

    /* JADX INFO: renamed from: p */
    public void m14033p(InterfaceC2958t1 interfaceC2958t1) {
        if (interfaceC2958t1.mo13944t() == InterfaceC2958t1.a.DESCENDING) {
            for (int i10 = this.f10952a - 1; i10 >= 0; i10--) {
                interfaceC2958t1.mo13908b(C2955s1.m14179a(this.f10953b[i10]), this.f10954c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f10952a; i11++) {
            interfaceC2958t1.mo13908b(C2955s1.m14179a(this.f10953b[i11]), this.f10954c[i11]);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m14034r(InterfaceC2958t1 interfaceC2958t1) {
        if (this.f10952a == 0) {
            return;
        }
        if (interfaceC2958t1.mo13944t() == InterfaceC2958t1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f10952a; i10++) {
                m14024q(this.f10953b[i10], this.f10954c[i10], interfaceC2958t1);
            }
            return;
        }
        for (int i11 = this.f10952a - 1; i11 >= 0; i11--) {
            m14024q(this.f10953b[i11], this.f10954c[i11], interfaceC2958t1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2943o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f10955d = -1;
        this.f10952a = i10;
        this.f10953b = iArr;
        this.f10954c = objArr;
        this.f10956e = z10;
    }
}
