package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0843h {

    /* JADX INFO: renamed from: f */
    public static volatile int f2866f = 100;

    /* JADX INFO: renamed from: a */
    public int f2867a;

    /* JADX INFO: renamed from: b */
    public int f2868b;

    /* JADX INFO: renamed from: c */
    public int f2869c;

    /* JADX INFO: renamed from: d */
    public C0846i f2870d;

    /* JADX INFO: renamed from: e */
    public boolean f2871e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b extends AbstractC0843h {

        /* JADX INFO: renamed from: g */
        public final byte[] f2872g;

        /* JADX INFO: renamed from: h */
        public final boolean f2873h;

        /* JADX INFO: renamed from: i */
        public int f2874i;

        /* JADX INFO: renamed from: j */
        public int f2875j;

        /* JADX INFO: renamed from: k */
        public int f2876k;

        /* JADX INFO: renamed from: l */
        public int f2877l;

        /* JADX INFO: renamed from: m */
        public int f2878m;

        /* JADX INFO: renamed from: n */
        public boolean f2879n;

        /* JADX INFO: renamed from: o */
        public int f2880o;

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: A */
        public String mo3484A() throws C0823a0 {
            int iM3514L = m3514L();
            if (iM3514L > 0) {
                int i10 = this.f2874i;
                int i11 = this.f2876k;
                if (iM3514L <= i10 - i11) {
                    String str = new String(this.f2872g, i11, iM3514L, C0892z.f3158b);
                    this.f2876k += iM3514L;
                    return str;
                }
            }
            if (iM3514L == 0) {
                return "";
            }
            if (iM3514L < 0) {
                throw C0823a0.m3344g();
            }
            throw C0823a0.m3348m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: B */
        public String mo3485B() throws C0823a0 {
            int iM3514L = m3514L();
            if (iM3514L > 0) {
                int i10 = this.f2874i;
                int i11 = this.f2876k;
                if (iM3514L <= i10 - i11) {
                    String strM4032a = C0875r1.m4032a(this.f2872g, i11, iM3514L);
                    this.f2876k += iM3514L;
                    return strM4032a;
                }
            }
            if (iM3514L == 0) {
                return "";
            }
            if (iM3514L <= 0) {
                throw C0823a0.m3344g();
            }
            throw C0823a0.m3348m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: C */
        public int mo3486C() throws C0823a0 {
            if (mo3494f()) {
                this.f2878m = 0;
                return 0;
            }
            int iM3514L = m3514L();
            this.f2878m = iM3514L;
            if (C0878s1.m4058a(iM3514L) != 0) {
                return this.f2878m;
            }
            throw C0823a0.m3340c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: D */
        public int mo3487D() {
            return m3514L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: E */
        public long mo3488E() {
            return m3515M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: F */
        public boolean mo3489F(int i10) throws C0823a0 {
            int iM4059b = C0878s1.m4059b(i10);
            if (iM4059b == 0) {
                m3519Q();
                return true;
            }
            if (iM4059b == 1) {
                m3518P(8);
                return true;
            }
            if (iM4059b == 2) {
                m3518P(m3514L());
                return true;
            }
            if (iM4059b == 3) {
                m3490G();
                mo3491a(C0878s1.m4060c(C0878s1.m4058a(i10), 4));
                return true;
            }
            if (iM4059b == 4) {
                return false;
            }
            if (iM4059b != 5) {
                throw C0823a0.m3342e();
            }
            m3518P(4);
            return true;
        }

        /* JADX INFO: renamed from: H */
        public byte m3510H() throws C0823a0 {
            int i10 = this.f2876k;
            if (i10 == this.f2874i) {
                throw C0823a0.m3348m();
            }
            byte[] bArr = this.f2872g;
            this.f2876k = i10 + 1;
            return bArr[i10];
        }

        /* JADX INFO: renamed from: I */
        public byte[] m3511I(int i10) throws C0823a0 {
            if (i10 > 0) {
                int i11 = this.f2874i;
                int i12 = this.f2876k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f2876k = i13;
                    return Arrays.copyOfRange(this.f2872g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C0823a0.m3348m();
            }
            if (i10 == 0) {
                return C0892z.f3160d;
            }
            throw C0823a0.m3344g();
        }

        /* JADX INFO: renamed from: J */
        public int m3512J() throws C0823a0 {
            int i10 = this.f2876k;
            if (this.f2874i - i10 < 4) {
                throw C0823a0.m3348m();
            }
            byte[] bArr = this.f2872g;
            this.f2876k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: K */
        public long m3513K() throws C0823a0 {
            int i10 = this.f2876k;
            if (this.f2874i - i10 < 8) {
                throw C0823a0.m3348m();
            }
            byte[] bArr = this.f2872g;
            this.f2876k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: L */
        public int m3514L() {
            int i10;
            int i11 = this.f2876k;
            int i12 = this.f2874i;
            if (i12 != i11) {
                byte[] bArr = this.f2872g;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f2876k = i13;
                    return b;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b10 = bArr[i18];
                                int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f2876k = i14;
                    return i10;
                }
            }
            return (int) m3516N();
        }

        /* JADX INFO: renamed from: M */
        public long m3515M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f2876k;
            int i11 = this.f2874i;
            if (i11 != i10) {
                byte[] bArr = this.f2872g;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f2876k = i12;
                    return b;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f2876k = i13;
                    return j10;
                }
            }
            return m3516N();
        }

        /* JADX INFO: renamed from: N */
        public long m3516N() throws C0823a0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bM3510H = m3510H();
                j10 |= ((long) (bM3510H & 127)) << i10;
                if ((bM3510H & 128) == 0) {
                    return j10;
                }
            }
            throw C0823a0.m3343f();
        }

        /* JADX INFO: renamed from: O */
        public final void m3517O() {
            int i10 = this.f2874i + this.f2875j;
            this.f2874i = i10;
            int i11 = i10 - this.f2877l;
            int i12 = this.f2880o;
            if (i11 <= i12) {
                this.f2875j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f2875j = i13;
            this.f2874i = i10 - i13;
        }

        /* JADX INFO: renamed from: P */
        public void m3518P(int i10) throws C0823a0 {
            if (i10 >= 0) {
                int i11 = this.f2874i;
                int i12 = this.f2876k;
                if (i10 <= i11 - i12) {
                    this.f2876k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C0823a0.m3348m();
            }
            throw C0823a0.m3344g();
        }

        /* JADX INFO: renamed from: Q */
        public final void m3519Q() throws C0823a0 {
            if (this.f2874i - this.f2876k >= 10) {
                m3520R();
            } else {
                m3521S();
            }
        }

        /* JADX INFO: renamed from: R */
        public final void m3520R() throws C0823a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f2872g;
                int i11 = this.f2876k;
                this.f2876k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C0823a0.m3343f();
        }

        /* JADX INFO: renamed from: S */
        public final void m3521S() throws C0823a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m3510H() >= 0) {
                    return;
                }
            }
            throw C0823a0.m3343f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: a */
        public void mo3491a(int i10) throws C0823a0 {
            if (this.f2878m != i10) {
                throw C0823a0.m3339b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: e */
        public int mo3493e() {
            return this.f2876k - this.f2877l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: f */
        public boolean mo3494f() {
            return this.f2876k == this.f2874i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: l */
        public void mo3495l(int i10) {
            this.f2880o = i10;
            m3517O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: m */
        public int mo3496m(int i10) throws C0823a0 {
            if (i10 < 0) {
                throw C0823a0.m3344g();
            }
            int iMo3493e = i10 + mo3493e();
            if (iMo3493e < 0) {
                throw C0823a0.m3345h();
            }
            int i11 = this.f2880o;
            if (iMo3493e > i11) {
                throw C0823a0.m3348m();
            }
            this.f2880o = iMo3493e;
            m3517O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: n */
        public boolean mo3497n() {
            return m3515M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: o */
        public AbstractC0840g mo3498o() {
            int iM3514L = m3514L();
            if (iM3514L > 0) {
                int i10 = this.f2874i;
                int i11 = this.f2876k;
                if (iM3514L <= i10 - i11) {
                    AbstractC0840g abstractC0840gM3439B = (this.f2873h && this.f2879n) ? AbstractC0840g.m3439B(this.f2872g, i11, iM3514L) : AbstractC0840g.m3444f(this.f2872g, i11, iM3514L);
                    this.f2876k += iM3514L;
                    return abstractC0840gM3439B;
                }
            }
            return iM3514L == 0 ? AbstractC0840g.f2854b : AbstractC0840g.m3438A(m3511I(iM3514L));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: p */
        public double mo3499p() {
            return Double.longBitsToDouble(m3513K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: q */
        public int mo3500q() {
            return m3514L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: r */
        public int mo3501r() {
            return m3512J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: s */
        public long mo3502s() {
            return m3513K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: t */
        public float mo3503t() {
            return Float.intBitsToFloat(m3512J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: u */
        public int mo3504u() {
            return m3514L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: v */
        public long mo3505v() {
            return m3515M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: w */
        public int mo3506w() {
            return m3512J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: x */
        public long mo3507x() {
            return m3513K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: y */
        public int mo3508y() {
            return AbstractC0843h.m3477c(m3514L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: z */
        public long mo3509z() {
            return AbstractC0843h.m3478d(m3515M());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f2880o = Integer.MAX_VALUE;
            this.f2872g = bArr;
            this.f2874i = i11 + i10;
            this.f2876k = i10;
            this.f2877l = i10;
            this.f2873h = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$c */
    public static final class c extends AbstractC0843h {

        /* JADX INFO: renamed from: g */
        public final InputStream f2881g;

        /* JADX INFO: renamed from: h */
        public final byte[] f2882h;

        /* JADX INFO: renamed from: i */
        public int f2883i;

        /* JADX INFO: renamed from: j */
        public int f2884j;

        /* JADX INFO: renamed from: k */
        public int f2885k;

        /* JADX INFO: renamed from: l */
        public int f2886l;

        /* JADX INFO: renamed from: m */
        public int f2887m;

        /* JADX INFO: renamed from: n */
        public int f2888n;

        /* JADX INFO: renamed from: H */
        public static int m3522H(InputStream inputStream) throws C0823a0 {
            try {
                return inputStream.available();
            } catch (C0823a0 e10) {
                e10.m3350j();
                throw e10;
            }
        }

        /* JADX INFO: renamed from: I */
        public static int m3523I(InputStream inputStream, byte[] bArr, int i10, int i11) throws C0823a0 {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C0823a0 e10) {
                e10.m3350j();
                throw e10;
            }
        }

        /* JADX INFO: renamed from: T */
        private void m3524T() {
            int i10 = this.f2883i + this.f2884j;
            this.f2883i = i10;
            int i11 = this.f2887m + i10;
            int i12 = this.f2888n;
            if (i11 <= i12) {
                this.f2884j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f2884j = i13;
            this.f2883i = i10 - i13;
        }

        /* JADX INFO: renamed from: V */
        public static long m3525V(InputStream inputStream, long j10) throws C0823a0 {
            try {
                return inputStream.skip(j10);
            } catch (C0823a0 e10) {
                e10.m3350j();
                throw e10;
            }
        }

        /* JADX INFO: renamed from: Y */
        private void m3526Y() throws C0823a0 {
            if (this.f2883i - this.f2885k >= 10) {
                m3527Z();
            } else {
                m3528a0();
            }
        }

        /* JADX INFO: renamed from: Z */
        private void m3527Z() throws C0823a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f2882h;
                int i11 = this.f2885k;
                this.f2885k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C0823a0.m3343f();
        }

        /* JADX INFO: renamed from: a0 */
        private void m3528a0() throws C0823a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m3530K() >= 0) {
                    return;
                }
            }
            throw C0823a0.m3343f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: A */
        public String mo3484A() throws C0823a0 {
            int iM3536Q = m3536Q();
            if (iM3536Q > 0) {
                int i10 = this.f2883i;
                int i11 = this.f2885k;
                if (iM3536Q <= i10 - i11) {
                    String str = new String(this.f2882h, i11, iM3536Q, C0892z.f3158b);
                    this.f2885k += iM3536Q;
                    return str;
                }
            }
            if (iM3536Q == 0) {
                return "";
            }
            if (iM3536Q < 0) {
                throw C0823a0.m3344g();
            }
            if (iM3536Q > this.f2883i) {
                return new String(m3531L(iM3536Q, false), C0892z.f3158b);
            }
            m3539U(iM3536Q);
            String str2 = new String(this.f2882h, this.f2885k, iM3536Q, C0892z.f3158b);
            this.f2885k += iM3536Q;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: B */
        public String mo3485B() throws IOException {
            byte[] bArrM3531L;
            int iM3536Q = m3536Q();
            int i10 = this.f2885k;
            int i11 = this.f2883i;
            if (iM3536Q <= i11 - i10 && iM3536Q > 0) {
                bArrM3531L = this.f2882h;
                this.f2885k = i10 + iM3536Q;
            } else {
                if (iM3536Q == 0) {
                    return "";
                }
                if (iM3536Q < 0) {
                    throw C0823a0.m3344g();
                }
                i10 = 0;
                if (iM3536Q <= i11) {
                    m3539U(iM3536Q);
                    bArrM3531L = this.f2882h;
                    this.f2885k = iM3536Q;
                } else {
                    bArrM3531L = m3531L(iM3536Q, false);
                }
            }
            return C0875r1.m4032a(bArrM3531L, i10, iM3536Q);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: C */
        public int mo3486C() throws C0823a0 {
            if (mo3494f()) {
                this.f2886l = 0;
                return 0;
            }
            int iM3536Q = m3536Q();
            this.f2886l = iM3536Q;
            if (C0878s1.m4058a(iM3536Q) != 0) {
                return this.f2886l;
            }
            throw C0823a0.m3340c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: D */
        public int mo3487D() {
            return m3536Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: E */
        public long mo3488E() {
            return m3537R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: F */
        public boolean mo3489F(int i10) throws C0823a0 {
            int iM4059b = C0878s1.m4059b(i10);
            if (iM4059b == 0) {
                m3526Y();
                return true;
            }
            if (iM4059b == 1) {
                m3540W(8);
                return true;
            }
            if (iM4059b == 2) {
                m3540W(m3536Q());
                return true;
            }
            if (iM4059b == 3) {
                m3490G();
                mo3491a(C0878s1.m4060c(C0878s1.m4058a(i10), 4));
                return true;
            }
            if (iM4059b == 4) {
                return false;
            }
            if (iM4059b != 5) {
                throw C0823a0.m3342e();
            }
            m3540W(4);
            return true;
        }

        /* JADX INFO: renamed from: J */
        public final AbstractC0840g m3529J(int i10) throws IOException {
            byte[] bArrM3532M = m3532M(i10);
            if (bArrM3532M != null) {
                return AbstractC0840g.m3443e(bArrM3532M);
            }
            int i11 = this.f2885k;
            int i12 = this.f2883i;
            int length = i12 - i11;
            this.f2887m += i12;
            this.f2885k = 0;
            this.f2883i = 0;
            List<byte[]> listM3533N = m3533N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2882h, i11, bArr, 0, length);
            for (byte[] bArr2 : listM3533N) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC0840g.m3438A(bArr);
        }

        /* JADX INFO: renamed from: K */
        public byte m3530K() throws C0823a0 {
            if (this.f2885k == this.f2883i) {
                m3539U(1);
            }
            byte[] bArr = this.f2882h;
            int i10 = this.f2885k;
            this.f2885k = i10 + 1;
            return bArr[i10];
        }

        /* JADX INFO: renamed from: L */
        public final byte[] m3531L(int i10, boolean z10) throws IOException {
            byte[] bArrM3532M = m3532M(i10);
            if (bArrM3532M != null) {
                return z10 ? (byte[]) bArrM3532M.clone() : bArrM3532M;
            }
            int i11 = this.f2885k;
            int i12 = this.f2883i;
            int length = i12 - i11;
            this.f2887m += i12;
            this.f2885k = 0;
            this.f2883i = 0;
            List<byte[]> listM3533N = m3533N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2882h, i11, bArr, 0, length);
            for (byte[] bArr2 : listM3533N) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: M */
        public final byte[] m3532M(int i10) throws C0823a0 {
            if (i10 == 0) {
                return C0892z.f3160d;
            }
            if (i10 < 0) {
                throw C0823a0.m3344g();
            }
            int i11 = this.f2887m;
            int i12 = this.f2885k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f2869c > 0) {
                throw C0823a0.m3347l();
            }
            int i14 = this.f2888n;
            if (i13 > i14) {
                m3540W((i14 - i11) - i12);
                throw C0823a0.m3348m();
            }
            int i15 = this.f2883i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > m3522H(this.f2881g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2882h, this.f2885k, bArr, 0, i15);
            this.f2887m += this.f2883i;
            this.f2885k = 0;
            this.f2883i = 0;
            while (i15 < i10) {
                int iM3523I = m3523I(this.f2881g, bArr, i15, i10 - i15);
                if (iM3523I == -1) {
                    throw C0823a0.m3348m();
                }
                this.f2887m += iM3523I;
                i15 += iM3523I;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: N */
        public final List<byte[]> m3533N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f2881g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw C0823a0.m3348m();
                    }
                    this.f2887m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: O */
        public int m3534O() throws C0823a0 {
            int i10 = this.f2885k;
            if (this.f2883i - i10 < 4) {
                m3539U(4);
                i10 = this.f2885k;
            }
            byte[] bArr = this.f2882h;
            this.f2885k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: P */
        public long m3535P() throws C0823a0 {
            int i10 = this.f2885k;
            if (this.f2883i - i10 < 8) {
                m3539U(8);
                i10 = this.f2885k;
            }
            byte[] bArr = this.f2882h;
            this.f2885k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: Q */
        public int m3536Q() {
            int i10;
            int i11 = this.f2885k;
            int i12 = this.f2883i;
            if (i12 != i11) {
                byte[] bArr = this.f2882h;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f2885k = i13;
                    return b;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b10 = bArr[i18];
                                int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f2885k = i14;
                    return i10;
                }
            }
            return (int) m3538S();
        }

        /* JADX INFO: renamed from: R */
        public long m3537R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f2885k;
            int i11 = this.f2883i;
            if (i11 != i10) {
                byte[] bArr = this.f2882h;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f2885k = i12;
                    return b;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f2885k = i13;
                    return j10;
                }
            }
            return m3538S();
        }

        /* JADX INFO: renamed from: S */
        public long m3538S() throws C0823a0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bM3530K = m3530K();
                j10 |= ((long) (bM3530K & 127)) << i10;
                if ((bM3530K & 128) == 0) {
                    return j10;
                }
            }
            throw C0823a0.m3343f();
        }

        /* JADX INFO: renamed from: U */
        public final void m3539U(int i10) throws C0823a0 {
            if (m3542b0(i10)) {
                return;
            }
            if (i10 <= (this.f2869c - this.f2887m) - this.f2885k) {
                throw C0823a0.m3348m();
            }
            throw C0823a0.m3347l();
        }

        /* JADX INFO: renamed from: W */
        public void m3540W(int i10) throws C0823a0 {
            int i11 = this.f2883i;
            int i12 = this.f2885k;
            if (i10 > i11 - i12 || i10 < 0) {
                m3541X(i10);
            } else {
                this.f2885k = i12 + i10;
            }
        }

        /* JADX INFO: renamed from: X */
        public final void m3541X(int i10) throws C0823a0 {
            if (i10 < 0) {
                throw C0823a0.m3344g();
            }
            int i11 = this.f2887m;
            int i12 = this.f2885k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f2888n;
            if (i13 > i14) {
                m3540W((i14 - i11) - i12);
                throw C0823a0.m3348m();
            }
            this.f2887m = i11 + i12;
            int i15 = this.f2883i - i12;
            this.f2883i = 0;
            this.f2885k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jM3525V = m3525V(this.f2881g, j10);
                    if (jM3525V < 0 || jM3525V > j10) {
                        throw new IllegalStateException(this.f2881g.getClass() + "#skip returned invalid result: " + jM3525V + "\nThe InputStream implementation is buggy.");
                    }
                    if (jM3525V == 0) {
                        break;
                    } else {
                        i15 += (int) jM3525V;
                    }
                } catch (Throwable th2) {
                    this.f2887m += i15;
                    m3524T();
                    throw th2;
                }
            }
            this.f2887m += i15;
            m3524T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f2883i;
            int i17 = i16 - this.f2885k;
            this.f2885k = i16;
            m3539U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f2883i;
                if (i18 <= i19) {
                    this.f2885k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f2885k = i19;
                    m3539U(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: a */
        public void mo3491a(int i10) throws C0823a0 {
            if (this.f2886l != i10) {
                throw C0823a0.m3339b();
            }
        }

        /* JADX INFO: renamed from: b0 */
        public final boolean m3542b0(int i10) throws C0823a0 {
            int i11 = this.f2885k;
            int i12 = i11 + i10;
            int i13 = this.f2883i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f2869c;
            int i15 = this.f2887m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f2888n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f2882h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f2887m += i11;
                this.f2883i -= i11;
                this.f2885k = 0;
            }
            InputStream inputStream = this.f2881g;
            byte[] bArr2 = this.f2882h;
            int i16 = this.f2883i;
            int iM3523I = m3523I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f2869c - this.f2887m) - i16));
            if (iM3523I == 0 || iM3523I < -1 || iM3523I > this.f2882h.length) {
                throw new IllegalStateException(this.f2881g.getClass() + "#read(byte[]) returned invalid result: " + iM3523I + "\nThe InputStream implementation is buggy.");
            }
            if (iM3523I <= 0) {
                return false;
            }
            this.f2883i += iM3523I;
            m3524T();
            if (this.f2883i >= i10) {
                return true;
            }
            return m3542b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: e */
        public int mo3493e() {
            return this.f2887m + this.f2885k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: f */
        public boolean mo3494f() {
            return this.f2885k == this.f2883i && !m3542b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: l */
        public void mo3495l(int i10) {
            this.f2888n = i10;
            m3524T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: m */
        public int mo3496m(int i10) throws C0823a0 {
            if (i10 < 0) {
                throw C0823a0.m3344g();
            }
            int i11 = i10 + this.f2887m + this.f2885k;
            if (i11 < 0) {
                throw C0823a0.m3345h();
            }
            int i12 = this.f2888n;
            if (i11 > i12) {
                throw C0823a0.m3348m();
            }
            this.f2888n = i11;
            m3524T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: n */
        public boolean mo3497n() {
            return m3537R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: o */
        public AbstractC0840g mo3498o() throws C0823a0 {
            int iM3536Q = m3536Q();
            int i10 = this.f2883i;
            int i11 = this.f2885k;
            if (iM3536Q <= i10 - i11 && iM3536Q > 0) {
                AbstractC0840g abstractC0840gM3444f = AbstractC0840g.m3444f(this.f2882h, i11, iM3536Q);
                this.f2885k += iM3536Q;
                return abstractC0840gM3444f;
            }
            if (iM3536Q == 0) {
                return AbstractC0840g.f2854b;
            }
            if (iM3536Q >= 0) {
                return m3529J(iM3536Q);
            }
            throw C0823a0.m3344g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: p */
        public double mo3499p() {
            return Double.longBitsToDouble(m3535P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: q */
        public int mo3500q() {
            return m3536Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: r */
        public int mo3501r() {
            return m3534O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: s */
        public long mo3502s() {
            return m3535P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: t */
        public float mo3503t() {
            return Float.intBitsToFloat(m3534O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: u */
        public int mo3504u() {
            return m3536Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: v */
        public long mo3505v() {
            return m3537R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: w */
        public int mo3506w() {
            return m3534O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: x */
        public long mo3507x() {
            return m3535P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: y */
        public int mo3508y() {
            return AbstractC0843h.m3477c(m3536Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0843h
        /* JADX INFO: renamed from: z */
        public long mo3509z() {
            return AbstractC0843h.m3478d(m3537R());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(InputStream inputStream, int i10) {
            super();
            this.f2888n = Integer.MAX_VALUE;
            C0892z.m4237b(inputStream, "input");
            this.f2881g = inputStream;
            this.f2882h = new byte[i10];
            this.f2883i = 0;
            this.f2885k = 0;
            this.f2887m = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m3477c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* JADX INFO: renamed from: d */
    public static long m3478d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0843h m3479g(InputStream inputStream) {
        return m3480h(inputStream, 4096);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0843h m3480h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? m3481i(C0892z.f3160d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC0843h m3481i(byte[] bArr) {
        return m3482j(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC0843h m3482j(byte[] bArr, int i10, int i11) {
        return m3483k(bArr, i10, i11, false);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC0843h m3483k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.mo3496m(i11);
            return bVar;
        } catch (C0823a0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo3484A();

    /* JADX INFO: renamed from: B */
    public abstract String mo3485B();

    /* JADX INFO: renamed from: C */
    public abstract int mo3486C();

    /* JADX INFO: renamed from: D */
    public abstract int mo3487D();

    /* JADX INFO: renamed from: E */
    public abstract long mo3488E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo3489F(int i10);

    /* JADX INFO: renamed from: G */
    public void m3490G() throws C0823a0 {
        boolean zMo3489F;
        do {
            int iMo3486C = mo3486C();
            if (iMo3486C == 0) {
                return;
            }
            m3492b();
            this.f2867a++;
            zMo3489F = mo3489F(iMo3486C);
            this.f2867a--;
        } while (zMo3489F);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3491a(int i10);

    /* JADX INFO: renamed from: b */
    public void m3492b() throws C0823a0 {
        if (this.f2867a >= this.f2868b) {
            throw C0823a0.m3346i();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo3493e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3494f();

    /* JADX INFO: renamed from: l */
    public abstract void mo3495l(int i10);

    /* JADX INFO: renamed from: m */
    public abstract int mo3496m(int i10);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo3497n();

    /* JADX INFO: renamed from: o */
    public abstract AbstractC0840g mo3498o();

    /* JADX INFO: renamed from: p */
    public abstract double mo3499p();

    /* JADX INFO: renamed from: q */
    public abstract int mo3500q();

    /* JADX INFO: renamed from: r */
    public abstract int mo3501r();

    /* JADX INFO: renamed from: s */
    public abstract long mo3502s();

    /* JADX INFO: renamed from: t */
    public abstract float mo3503t();

    /* JADX INFO: renamed from: u */
    public abstract int mo3504u();

    /* JADX INFO: renamed from: v */
    public abstract long mo3505v();

    /* JADX INFO: renamed from: w */
    public abstract int mo3506w();

    /* JADX INFO: renamed from: x */
    public abstract long mo3507x();

    /* JADX INFO: renamed from: y */
    public abstract int mo3508y();

    /* JADX INFO: renamed from: z */
    public abstract long mo3509z();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC0843h() {
        this.f2868b = f2866f;
        this.f2869c = Integer.MAX_VALUE;
        this.f2871e = false;
    }
}
