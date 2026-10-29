package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0866o1 {

    /* JADX INFO: renamed from: f */
    public static final C0866o1 f2964f = new C0866o1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f2965a;

    /* JADX INFO: renamed from: b */
    public int[] f2966b;

    /* JADX INFO: renamed from: c */
    public Object[] f2967c;

    /* JADX INFO: renamed from: d */
    public int f2968d;

    /* JADX INFO: renamed from: e */
    public boolean f2969e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0866o1() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: c */
    public static C0866o1 m3916c() {
        return f2964f;
    }

    /* JADX INFO: renamed from: f */
    public static int m3917f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m3918g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public static C0866o1 m3919j(C0866o1 c0866o1, C0866o1 c0866o2) {
        int i10 = c0866o1.f2965a + c0866o2.f2965a;
        int[] iArrCopyOf = Arrays.copyOf(c0866o1.f2966b, i10);
        System.arraycopy(c0866o2.f2966b, 0, iArrCopyOf, c0866o1.f2965a, c0866o2.f2965a);
        Object[] objArrCopyOf = Arrays.copyOf(c0866o1.f2967c, i10);
        System.arraycopy(c0866o2.f2967c, 0, objArrCopyOf, c0866o1.f2965a, c0866o2.f2965a);
        return new C0866o1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: k */
    public static C0866o1 m3920k() {
        return new C0866o1();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3921l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m3922o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static void m3923q(int i10, Object obj, InterfaceC0881t1 interfaceC0881t1) {
        int iM4058a = C0878s1.m4058a(i10);
        int iM4059b = C0878s1.m4059b(i10);
        if (iM4059b == 0) {
            interfaceC0881t1.mo3843u(iM4058a, ((Long) obj).longValue());
            return;
        }
        if (iM4059b == 1) {
            interfaceC0881t1.mo3839s(iM4058a, ((Long) obj).longValue());
            return;
        }
        if (iM4059b == 2) {
            interfaceC0881t1.mo3788K(iM4058a, (AbstractC0840g) obj);
            return;
        }
        if (iM4059b != 3) {
            if (iM4059b != 5) {
                throw new RuntimeException(C0823a0.m3342e());
            }
            interfaceC0881t1.mo3807c(iM4058a, ((Integer) obj).intValue());
        } else if (interfaceC0881t1.mo3841t() == InterfaceC0881t1.a.ASCENDING) {
            interfaceC0881t1.mo3849x(iM4058a);
            ((C0866o1) obj).m3933r(interfaceC0881t1);
            interfaceC0881t1.mo3780C(iM4058a);
        } else {
            interfaceC0881t1.mo3780C(iM4058a);
            ((C0866o1) obj).m3933r(interfaceC0881t1);
            interfaceC0881t1.mo3849x(iM4058a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3924a() {
        if (!this.f2969e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3925b(int i10) {
        int[] iArr = this.f2966b;
        if (i10 > iArr.length) {
            int i11 = this.f2965a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f2966b = Arrays.copyOf(iArr, i10);
            this.f2967c = Arrays.copyOf(this.f2967c, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m3926d() {
        int iM3649X;
        int i10 = this.f2968d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f2965a; i12++) {
            int i13 = this.f2966b[i12];
            int iM4058a = C0878s1.m4058a(i13);
            int iM4059b = C0878s1.m4059b(i13);
            if (iM4059b == 0) {
                iM3649X = AbstractC0849j.m3649X(iM4058a, ((Long) this.f2967c[i12]).longValue());
            } else if (iM4059b == 1) {
                iM3649X = AbstractC0849j.m3668o(iM4058a, ((Long) this.f2967c[i12]).longValue());
            } else if (iM4059b == 2) {
                iM3649X = AbstractC0849j.m3659g(iM4058a, (AbstractC0840g) this.f2967c[i12]);
            } else if (iM4059b == 3) {
                iM3649X = (AbstractC0849j.m3646U(iM4058a) * 2) + ((C0866o1) this.f2967c[i12]).m3926d();
            } else {
                if (iM4059b != 5) {
                    throw new IllegalStateException(C0823a0.m3342e());
                }
                iM3649X = AbstractC0849j.m3666m(iM4058a, ((Integer) this.f2967c[i12]).intValue());
            }
            i11 += iM3649X;
        }
        this.f2968d = i11;
        return i11;
    }

    /* JADX INFO: renamed from: e */
    public int m3927e() {
        int i10 = this.f2968d;
        if (i10 != -1) {
            return i10;
        }
        int iM3635J = 0;
        for (int i11 = 0; i11 < this.f2965a; i11++) {
            iM3635J += AbstractC0849j.m3635J(C0878s1.m4058a(this.f2966b[i11]), (AbstractC0840g) this.f2967c[i11]);
        }
        this.f2968d = iM3635J;
        return iM3635J;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0866o1)) {
            return false;
        }
        C0866o1 c0866o1 = (C0866o1) obj;
        int i10 = this.f2965a;
        return i10 == c0866o1.f2965a && m3922o(this.f2966b, c0866o1.f2966b, i10) && m3921l(this.f2967c, c0866o1.f2967c, this.f2965a);
    }

    /* JADX INFO: renamed from: h */
    public void m3928h() {
        if (this.f2969e) {
            this.f2969e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f2965a;
        return ((((527 + i10) * 31) + m3917f(this.f2966b, i10)) * 31) + m3918g(this.f2967c, this.f2965a);
    }

    /* JADX INFO: renamed from: i */
    public C0866o1 m3929i(C0866o1 c0866o1) {
        if (c0866o1.equals(m3916c())) {
            return this;
        }
        m3924a();
        int i10 = this.f2965a + c0866o1.f2965a;
        m3925b(i10);
        System.arraycopy(c0866o1.f2966b, 0, this.f2966b, this.f2965a, c0866o1.f2965a);
        System.arraycopy(c0866o1.f2967c, 0, this.f2967c, this.f2965a, c0866o1.f2965a);
        this.f2965a = i10;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m3930m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f2965a; i11++) {
            C0880t0.m4099d(sb2, i10, String.valueOf(C0878s1.m4058a(this.f2966b[i11])), this.f2967c[i11]);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m3931n(int i10, Object obj) {
        m3924a();
        m3925b(this.f2965a + 1);
        int[] iArr = this.f2966b;
        int i11 = this.f2965a;
        iArr[i11] = i10;
        this.f2967c[i11] = obj;
        this.f2965a = i11 + 1;
    }

    /* JADX INFO: renamed from: p */
    public void m3932p(InterfaceC0881t1 interfaceC0881t1) {
        if (interfaceC0881t1.mo3841t() == InterfaceC0881t1.a.DESCENDING) {
            for (int i10 = this.f2965a - 1; i10 >= 0; i10--) {
                interfaceC0881t1.mo3805b(C0878s1.m4058a(this.f2966b[i10]), this.f2967c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f2965a; i11++) {
            interfaceC0881t1.mo3805b(C0878s1.m4058a(this.f2966b[i11]), this.f2967c[i11]);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m3933r(InterfaceC0881t1 interfaceC0881t1) {
        if (this.f2965a == 0) {
            return;
        }
        if (interfaceC0881t1.mo3841t() == InterfaceC0881t1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f2965a; i10++) {
                m3923q(this.f2966b[i10], this.f2967c[i10], interfaceC0881t1);
            }
            return;
        }
        for (int i11 = this.f2965a - 1; i11 >= 0; i11--) {
            m3923q(this.f2966b[i11], this.f2967c[i11], interfaceC0881t1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0866o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f2968d = -1;
        this.f2965a = i10;
        this.f2966b = iArr;
        this.f2967c = objArr;
        this.f2969e = z10;
    }
}
