package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2923i {

    /* JADX INFO: renamed from: f */
    public static volatile int f10865f = 100;

    /* JADX INFO: renamed from: a */
    public int f10866a;

    /* JADX INFO: renamed from: b */
    public int f10867b;

    /* JADX INFO: renamed from: c */
    public int f10868c;

    /* JADX INFO: renamed from: d */
    public C2926j f10869d;

    /* JADX INFO: renamed from: e */
    public boolean f10870e;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    public static final class b extends AbstractC2923i {

        /* JADX INFO: renamed from: g */
        public final byte[] f10871g;

        /* JADX INFO: renamed from: h */
        public final boolean f10872h;

        /* JADX INFO: renamed from: i */
        public int f10873i;

        /* JADX INFO: renamed from: j */
        public int f10874j;

        /* JADX INFO: renamed from: k */
        public int f10875k;

        /* JADX INFO: renamed from: l */
        public int f10876l;

        /* JADX INFO: renamed from: m */
        public int f10877m;

        /* JADX INFO: renamed from: n */
        public boolean f10878n;

        /* JADX INFO: renamed from: o */
        public int f10879o;

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: A */
        public String mo13588A() throws C2903b0 {
            int iM13618L = m13618L();
            if (iM13618L > 0) {
                int i10 = this.f10873i;
                int i11 = this.f10875k;
                if (iM13618L <= i10 - i11) {
                    String str = new String(this.f10871g, i11, iM13618L, C2900a0.f10795b);
                    this.f10875k += iM13618L;
                    return str;
                }
            }
            if (iM13618L == 0) {
                return "";
            }
            if (iM13618L < 0) {
                throw C2903b0.m13402g();
            }
            throw C2903b0.m13406m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: B */
        public String mo13589B() throws C2903b0 {
            int iM13618L = m13618L();
            if (iM13618L > 0) {
                int i10 = this.f10873i;
                int i11 = this.f10875k;
                if (iM13618L <= i10 - i11) {
                    String strM14136e = C2952r1.m14136e(this.f10871g, i11, iM13618L);
                    this.f10875k += iM13618L;
                    return strM14136e;
                }
            }
            if (iM13618L == 0) {
                return "";
            }
            if (iM13618L <= 0) {
                throw C2903b0.m13402g();
            }
            throw C2903b0.m13406m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: C */
        public int mo13590C() throws C2903b0 {
            if (mo13598f()) {
                this.f10877m = 0;
                return 0;
            }
            int iM13618L = m13618L();
            this.f10877m = iM13618L;
            if (C2955s1.m14179a(iM13618L) != 0) {
                return this.f10877m;
            }
            throw C2903b0.m13398c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: D */
        public int mo13591D() {
            return m13618L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: E */
        public long mo13592E() {
            return m13619M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: F */
        public boolean mo13593F(int i10) throws C2903b0 {
            int iM14180b = C2955s1.m14180b(i10);
            if (iM14180b == 0) {
                m13623Q();
                return true;
            }
            if (iM14180b == 1) {
                m13622P(8);
                return true;
            }
            if (iM14180b == 2) {
                m13622P(m13618L());
                return true;
            }
            if (iM14180b == 3) {
                m13594G();
                mo13595a(C2955s1.m14181c(C2955s1.m14179a(i10), 4));
                return true;
            }
            if (iM14180b == 4) {
                return false;
            }
            if (iM14180b != 5) {
                throw C2903b0.m13400e();
            }
            m13622P(4);
            return true;
        }

        /* JADX INFO: renamed from: H */
        public byte m13614H() throws C2903b0 {
            int i10 = this.f10875k;
            if (i10 == this.f10873i) {
                throw C2903b0.m13406m();
            }
            byte[] bArr = this.f10871g;
            this.f10875k = i10 + 1;
            return bArr[i10];
        }

        /* JADX INFO: renamed from: I */
        public byte[] m13615I(int i10) throws C2903b0 {
            if (i10 > 0) {
                int i11 = this.f10873i;
                int i12 = this.f10875k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f10875k = i13;
                    return Arrays.copyOfRange(this.f10871g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C2903b0.m13406m();
            }
            if (i10 == 0) {
                return C2900a0.f10797d;
            }
            throw C2903b0.m13402g();
        }

        /* JADX INFO: renamed from: J */
        public int m13616J() throws C2903b0 {
            int i10 = this.f10875k;
            if (this.f10873i - i10 < 4) {
                throw C2903b0.m13406m();
            }
            byte[] bArr = this.f10871g;
            this.f10875k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: K */
        public long m13617K() throws C2903b0 {
            int i10 = this.f10875k;
            if (this.f10873i - i10 < 8) {
                throw C2903b0.m13406m();
            }
            byte[] bArr = this.f10871g;
            this.f10875k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: L */
        public int m13618L() {
            int i10;
            int i11 = this.f10875k;
            int i12 = this.f10873i;
            if (i12 != i11) {
                byte[] bArr = this.f10871g;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f10875k = i13;
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
                    this.f10875k = i14;
                    return i10;
                }
            }
            return (int) m13620N();
        }

        /* JADX INFO: renamed from: M */
        public long m13619M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f10875k;
            int i11 = this.f10873i;
            if (i11 != i10) {
                byte[] bArr = this.f10871g;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f10875k = i12;
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
                    this.f10875k = i13;
                    return j10;
                }
            }
            return m13620N();
        }

        /* JADX INFO: renamed from: N */
        public long m13620N() throws C2903b0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bM13614H = m13614H();
                j10 |= ((long) (bM13614H & 127)) << i10;
                if ((bM13614H & 128) == 0) {
                    return j10;
                }
            }
            throw C2903b0.m13401f();
        }

        /* JADX INFO: renamed from: O */
        public final void m13621O() {
            int i10 = this.f10873i + this.f10874j;
            this.f10873i = i10;
            int i11 = i10 - this.f10876l;
            int i12 = this.f10879o;
            if (i11 <= i12) {
                this.f10874j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10874j = i13;
            this.f10873i = i10 - i13;
        }

        /* JADX INFO: renamed from: P */
        public void m13622P(int i10) throws C2903b0 {
            if (i10 >= 0) {
                int i11 = this.f10873i;
                int i12 = this.f10875k;
                if (i10 <= i11 - i12) {
                    this.f10875k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C2903b0.m13406m();
            }
            throw C2903b0.m13402g();
        }

        /* JADX INFO: renamed from: Q */
        public final void m13623Q() throws C2903b0 {
            if (this.f10873i - this.f10875k >= 10) {
                m13624R();
            } else {
                m13625S();
            }
        }

        /* JADX INFO: renamed from: R */
        public final void m13624R() throws C2903b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f10871g;
                int i11 = this.f10875k;
                this.f10875k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2903b0.m13401f();
        }

        /* JADX INFO: renamed from: S */
        public final void m13625S() throws C2903b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m13614H() >= 0) {
                    return;
                }
            }
            throw C2903b0.m13401f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: a */
        public void mo13595a(int i10) throws C2903b0 {
            if (this.f10877m != i10) {
                throw C2903b0.m13397b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: e */
        public int mo13597e() {
            return this.f10875k - this.f10876l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: f */
        public boolean mo13598f() {
            return this.f10875k == this.f10873i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: l */
        public void mo13599l(int i10) {
            this.f10879o = i10;
            m13621O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: m */
        public int mo13600m(int i10) throws C2903b0 {
            if (i10 < 0) {
                throw C2903b0.m13402g();
            }
            int iMo13597e = i10 + mo13597e();
            if (iMo13597e < 0) {
                throw C2903b0.m13403h();
            }
            int i11 = this.f10879o;
            if (iMo13597e > i11) {
                throw C2903b0.m13406m();
            }
            this.f10879o = iMo13597e;
            m13621O();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: n */
        public boolean mo13601n() {
            return m13619M() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: o */
        public AbstractC2920h mo13602o() {
            int iM13618L = m13618L();
            if (iM13618L > 0) {
                int i10 = this.f10873i;
                int i11 = this.f10875k;
                if (iM13618L <= i10 - i11) {
                    AbstractC2920h abstractC2920hM13551B = (this.f10872h && this.f10878n) ? AbstractC2920h.m13551B(this.f10871g, i11, iM13618L) : AbstractC2920h.m13556f(this.f10871g, i11, iM13618L);
                    this.f10875k += iM13618L;
                    return abstractC2920hM13551B;
                }
            }
            return iM13618L == 0 ? AbstractC2920h.f10853b : AbstractC2920h.m13550A(m13615I(iM13618L));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: p */
        public double mo13603p() {
            return Double.longBitsToDouble(m13617K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: q */
        public int mo13604q() {
            return m13618L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: r */
        public int mo13605r() {
            return m13616J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: s */
        public long mo13606s() {
            return m13617K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: t */
        public float mo13607t() {
            return Float.intBitsToFloat(m13616J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: u */
        public int mo13608u() {
            return m13618L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: v */
        public long mo13609v() {
            return m13619M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: w */
        public int mo13610w() {
            return m13616J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: x */
        public long mo13611x() {
            return m13617K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: y */
        public int mo13612y() {
            return AbstractC2923i.m13581c(m13618L());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: z */
        public long mo13613z() {
            return AbstractC2923i.m13582d(m13619M());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f10879o = Integer.MAX_VALUE;
            this.f10871g = bArr;
            this.f10873i = i11 + i10;
            this.f10875k = i10;
            this.f10876l = i10;
            this.f10872h = z10;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    public static final class c extends AbstractC2923i {

        /* JADX INFO: renamed from: g */
        public final InputStream f10880g;

        /* JADX INFO: renamed from: h */
        public final byte[] f10881h;

        /* JADX INFO: renamed from: i */
        public int f10882i;

        /* JADX INFO: renamed from: j */
        public int f10883j;

        /* JADX INFO: renamed from: k */
        public int f10884k;

        /* JADX INFO: renamed from: l */
        public int f10885l;

        /* JADX INFO: renamed from: m */
        public int f10886m;

        /* JADX INFO: renamed from: n */
        public int f10887n;

        /* JADX INFO: renamed from: H */
        public static int m13626H(InputStream inputStream) throws C2903b0 {
            try {
                return inputStream.available();
            } catch (C2903b0 e10) {
                e10.m13408j();
                throw e10;
            }
        }

        /* JADX INFO: renamed from: I */
        public static int m13627I(InputStream inputStream, byte[] bArr, int i10, int i11) throws C2903b0 {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C2903b0 e10) {
                e10.m13408j();
                throw e10;
            }
        }

        /* JADX INFO: renamed from: T */
        private void m13628T() {
            int i10 = this.f10882i + this.f10883j;
            this.f10882i = i10;
            int i11 = this.f10886m + i10;
            int i12 = this.f10887n;
            if (i11 <= i12) {
                this.f10883j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10883j = i13;
            this.f10882i = i10 - i13;
        }

        /* JADX INFO: renamed from: V */
        public static long m13629V(InputStream inputStream, long j10) throws C2903b0 {
            try {
                return inputStream.skip(j10);
            } catch (C2903b0 e10) {
                e10.m13408j();
                throw e10;
            }
        }

        /* JADX INFO: renamed from: Y */
        private void m13630Y() throws C2903b0 {
            if (this.f10882i - this.f10884k >= 10) {
                m13631Z();
            } else {
                m13632a0();
            }
        }

        /* JADX INFO: renamed from: Z */
        private void m13631Z() throws C2903b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f10881h;
                int i11 = this.f10884k;
                this.f10884k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2903b0.m13401f();
        }

        /* JADX INFO: renamed from: a0 */
        private void m13632a0() throws C2903b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m13634K() >= 0) {
                    return;
                }
            }
            throw C2903b0.m13401f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: A */
        public String mo13588A() throws C2903b0 {
            int iM13640Q = m13640Q();
            if (iM13640Q > 0) {
                int i10 = this.f10882i;
                int i11 = this.f10884k;
                if (iM13640Q <= i10 - i11) {
                    String str = new String(this.f10881h, i11, iM13640Q, C2900a0.f10795b);
                    this.f10884k += iM13640Q;
                    return str;
                }
            }
            if (iM13640Q == 0) {
                return "";
            }
            if (iM13640Q < 0) {
                throw C2903b0.m13402g();
            }
            if (iM13640Q > this.f10882i) {
                return new String(m13635L(iM13640Q, false), C2900a0.f10795b);
            }
            m13643U(iM13640Q);
            String str2 = new String(this.f10881h, this.f10884k, iM13640Q, C2900a0.f10795b);
            this.f10884k += iM13640Q;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: B */
        public String mo13589B() throws IOException {
            byte[] bArrM13635L;
            int iM13640Q = m13640Q();
            int i10 = this.f10884k;
            int i11 = this.f10882i;
            if (iM13640Q <= i11 - i10 && iM13640Q > 0) {
                bArrM13635L = this.f10881h;
                this.f10884k = i10 + iM13640Q;
            } else {
                if (iM13640Q == 0) {
                    return "";
                }
                if (iM13640Q < 0) {
                    throw C2903b0.m13402g();
                }
                i10 = 0;
                if (iM13640Q <= i11) {
                    m13643U(iM13640Q);
                    bArrM13635L = this.f10881h;
                    this.f10884k = iM13640Q;
                } else {
                    bArrM13635L = m13635L(iM13640Q, false);
                }
            }
            return C2952r1.m14136e(bArrM13635L, i10, iM13640Q);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: C */
        public int mo13590C() throws C2903b0 {
            if (mo13598f()) {
                this.f10885l = 0;
                return 0;
            }
            int iM13640Q = m13640Q();
            this.f10885l = iM13640Q;
            if (C2955s1.m14179a(iM13640Q) != 0) {
                return this.f10885l;
            }
            throw C2903b0.m13398c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: D */
        public int mo13591D() {
            return m13640Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: E */
        public long mo13592E() {
            return m13641R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: F */
        public boolean mo13593F(int i10) throws C2903b0 {
            int iM14180b = C2955s1.m14180b(i10);
            if (iM14180b == 0) {
                m13630Y();
                return true;
            }
            if (iM14180b == 1) {
                m13644W(8);
                return true;
            }
            if (iM14180b == 2) {
                m13644W(m13640Q());
                return true;
            }
            if (iM14180b == 3) {
                m13594G();
                mo13595a(C2955s1.m14181c(C2955s1.m14179a(i10), 4));
                return true;
            }
            if (iM14180b == 4) {
                return false;
            }
            if (iM14180b != 5) {
                throw C2903b0.m13400e();
            }
            m13644W(4);
            return true;
        }

        /* JADX INFO: renamed from: J */
        public final AbstractC2920h m13633J(int i10) throws IOException {
            byte[] bArrM13636M = m13636M(i10);
            if (bArrM13636M != null) {
                return AbstractC2920h.m13555e(bArrM13636M);
            }
            int i11 = this.f10884k;
            int i12 = this.f10882i;
            int length = i12 - i11;
            this.f10886m += i12;
            this.f10884k = 0;
            this.f10882i = 0;
            List<byte[]> listM13637N = m13637N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f10881h, i11, bArr, 0, length);
            for (byte[] bArr2 : listM13637N) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC2920h.m13550A(bArr);
        }

        /* JADX INFO: renamed from: K */
        public byte m13634K() throws C2903b0 {
            if (this.f10884k == this.f10882i) {
                m13643U(1);
            }
            byte[] bArr = this.f10881h;
            int i10 = this.f10884k;
            this.f10884k = i10 + 1;
            return bArr[i10];
        }

        /* JADX INFO: renamed from: L */
        public final byte[] m13635L(int i10, boolean z10) throws IOException {
            byte[] bArrM13636M = m13636M(i10);
            if (bArrM13636M != null) {
                return z10 ? (byte[]) bArrM13636M.clone() : bArrM13636M;
            }
            int i11 = this.f10884k;
            int i12 = this.f10882i;
            int length = i12 - i11;
            this.f10886m += i12;
            this.f10884k = 0;
            this.f10882i = 0;
            List<byte[]> listM13637N = m13637N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f10881h, i11, bArr, 0, length);
            for (byte[] bArr2 : listM13637N) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: M */
        public final byte[] m13636M(int i10) throws C2903b0 {
            if (i10 == 0) {
                return C2900a0.f10797d;
            }
            if (i10 < 0) {
                throw C2903b0.m13402g();
            }
            int i11 = this.f10886m;
            int i12 = this.f10884k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f10868c > 0) {
                throw C2903b0.m13405l();
            }
            int i14 = this.f10887n;
            if (i13 > i14) {
                m13644W((i14 - i11) - i12);
                throw C2903b0.m13406m();
            }
            int i15 = this.f10882i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > m13626H(this.f10880g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f10881h, this.f10884k, bArr, 0, i15);
            this.f10886m += this.f10882i;
            this.f10884k = 0;
            this.f10882i = 0;
            while (i15 < i10) {
                int iM13627I = m13627I(this.f10880g, bArr, i15, i10 - i15);
                if (iM13627I == -1) {
                    throw C2903b0.m13406m();
                }
                this.f10886m += iM13627I;
                i15 += iM13627I;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: N */
        public final List<byte[]> m13637N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f10880g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw C2903b0.m13406m();
                    }
                    this.f10886m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: O */
        public int m13638O() throws C2903b0 {
            int i10 = this.f10884k;
            if (this.f10882i - i10 < 4) {
                m13643U(4);
                i10 = this.f10884k;
            }
            byte[] bArr = this.f10881h;
            this.f10884k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: P */
        public long m13639P() throws C2903b0 {
            int i10 = this.f10884k;
            if (this.f10882i - i10 < 8) {
                m13643U(8);
                i10 = this.f10884k;
            }
            byte[] bArr = this.f10881h;
            this.f10884k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: Q */
        public int m13640Q() {
            int i10;
            int i11 = this.f10884k;
            int i12 = this.f10882i;
            if (i12 != i11) {
                byte[] bArr = this.f10881h;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f10884k = i13;
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
                    this.f10884k = i14;
                    return i10;
                }
            }
            return (int) m13642S();
        }

        /* JADX INFO: renamed from: R */
        public long m13641R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f10884k;
            int i11 = this.f10882i;
            if (i11 != i10) {
                byte[] bArr = this.f10881h;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f10884k = i12;
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
                    this.f10884k = i13;
                    return j10;
                }
            }
            return m13642S();
        }

        /* JADX INFO: renamed from: S */
        public long m13642S() throws C2903b0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bM13634K = m13634K();
                j10 |= ((long) (bM13634K & 127)) << i10;
                if ((bM13634K & 128) == 0) {
                    return j10;
                }
            }
            throw C2903b0.m13401f();
        }

        /* JADX INFO: renamed from: U */
        public final void m13643U(int i10) throws C2903b0 {
            if (m13646b0(i10)) {
                return;
            }
            if (i10 <= (this.f10868c - this.f10886m) - this.f10884k) {
                throw C2903b0.m13406m();
            }
            throw C2903b0.m13405l();
        }

        /* JADX INFO: renamed from: W */
        public void m13644W(int i10) throws C2903b0 {
            int i11 = this.f10882i;
            int i12 = this.f10884k;
            if (i10 > i11 - i12 || i10 < 0) {
                m13645X(i10);
            } else {
                this.f10884k = i12 + i10;
            }
        }

        /* JADX INFO: renamed from: X */
        public final void m13645X(int i10) throws C2903b0 {
            if (i10 < 0) {
                throw C2903b0.m13402g();
            }
            int i11 = this.f10886m;
            int i12 = this.f10884k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f10887n;
            if (i13 > i14) {
                m13644W((i14 - i11) - i12);
                throw C2903b0.m13406m();
            }
            this.f10886m = i11 + i12;
            int i15 = this.f10882i - i12;
            this.f10882i = 0;
            this.f10884k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jM13629V = m13629V(this.f10880g, j10);
                    if (jM13629V < 0 || jM13629V > j10) {
                        throw new IllegalStateException(this.f10880g.getClass() + "#skip returned invalid result: " + jM13629V + "\nThe InputStream implementation is buggy.");
                    }
                    if (jM13629V == 0) {
                        break;
                    } else {
                        i15 += (int) jM13629V;
                    }
                } catch (Throwable th2) {
                    this.f10886m += i15;
                    m13628T();
                    throw th2;
                }
            }
            this.f10886m += i15;
            m13628T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f10882i;
            int i17 = i16 - this.f10884k;
            this.f10884k = i16;
            m13643U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f10882i;
                if (i18 <= i19) {
                    this.f10884k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f10884k = i19;
                    m13643U(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: a */
        public void mo13595a(int i10) throws C2903b0 {
            if (this.f10885l != i10) {
                throw C2903b0.m13397b();
            }
        }

        /* JADX INFO: renamed from: b0 */
        public final boolean m13646b0(int i10) throws C2903b0 {
            int i11 = this.f10884k;
            int i12 = i11 + i10;
            int i13 = this.f10882i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f10868c;
            int i15 = this.f10886m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f10887n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f10881h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f10886m += i11;
                this.f10882i -= i11;
                this.f10884k = 0;
            }
            InputStream inputStream = this.f10880g;
            byte[] bArr2 = this.f10881h;
            int i16 = this.f10882i;
            int iM13627I = m13627I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f10868c - this.f10886m) - i16));
            if (iM13627I == 0 || iM13627I < -1 || iM13627I > this.f10881h.length) {
                throw new IllegalStateException(this.f10880g.getClass() + "#read(byte[]) returned invalid result: " + iM13627I + "\nThe InputStream implementation is buggy.");
            }
            if (iM13627I <= 0) {
                return false;
            }
            this.f10882i += iM13627I;
            m13628T();
            if (this.f10882i >= i10) {
                return true;
            }
            return m13646b0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: e */
        public int mo13597e() {
            return this.f10886m + this.f10884k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: f */
        public boolean mo13598f() {
            return this.f10884k == this.f10882i && !m13646b0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: l */
        public void mo13599l(int i10) {
            this.f10887n = i10;
            m13628T();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: m */
        public int mo13600m(int i10) throws C2903b0 {
            if (i10 < 0) {
                throw C2903b0.m13402g();
            }
            int i11 = i10 + this.f10886m + this.f10884k;
            if (i11 < 0) {
                throw C2903b0.m13403h();
            }
            int i12 = this.f10887n;
            if (i11 > i12) {
                throw C2903b0.m13406m();
            }
            this.f10887n = i11;
            m13628T();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: n */
        public boolean mo13601n() {
            return m13641R() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: o */
        public AbstractC2920h mo13602o() throws C2903b0 {
            int iM13640Q = m13640Q();
            int i10 = this.f10882i;
            int i11 = this.f10884k;
            if (iM13640Q <= i10 - i11 && iM13640Q > 0) {
                AbstractC2920h abstractC2920hM13556f = AbstractC2920h.m13556f(this.f10881h, i11, iM13640Q);
                this.f10884k += iM13640Q;
                return abstractC2920hM13556f;
            }
            if (iM13640Q == 0) {
                return AbstractC2920h.f10853b;
            }
            if (iM13640Q >= 0) {
                return m13633J(iM13640Q);
            }
            throw C2903b0.m13402g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: p */
        public double mo13603p() {
            return Double.longBitsToDouble(m13639P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: q */
        public int mo13604q() {
            return m13640Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: r */
        public int mo13605r() {
            return m13638O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: s */
        public long mo13606s() {
            return m13639P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: t */
        public float mo13607t() {
            return Float.intBitsToFloat(m13638O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: u */
        public int mo13608u() {
            return m13640Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: v */
        public long mo13609v() {
            return m13641R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: w */
        public int mo13610w() {
            return m13638O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: x */
        public long mo13611x() {
            return m13639P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: y */
        public int mo13612y() {
            return AbstractC2923i.m13581c(m13640Q());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2923i
        /* JADX INFO: renamed from: z */
        public long mo13613z() {
            return AbstractC2923i.m13582d(m13641R());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(InputStream inputStream, int i10) {
            super();
            this.f10887n = Integer.MAX_VALUE;
            C2900a0.m13380b(inputStream, "input");
            this.f10880g = inputStream;
            this.f10881h = new byte[i10];
            this.f10882i = 0;
            this.f10884k = 0;
            this.f10886m = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m13581c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* JADX INFO: renamed from: d */
    public static long m13582d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC2923i m13583g(InputStream inputStream) {
        return m13584h(inputStream, 4096);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC2923i m13584h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? m13585i(C2900a0.f10797d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC2923i m13585i(byte[] bArr) {
        return m13586j(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2923i m13586j(byte[] bArr, int i10, int i11) {
        return m13587k(bArr, i10, i11, false);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC2923i m13587k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.mo13600m(i11);
            return bVar;
        } catch (C2903b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo13588A();

    /* JADX INFO: renamed from: B */
    public abstract String mo13589B();

    /* JADX INFO: renamed from: C */
    public abstract int mo13590C();

    /* JADX INFO: renamed from: D */
    public abstract int mo13591D();

    /* JADX INFO: renamed from: E */
    public abstract long mo13592E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo13593F(int i10);

    /* JADX INFO: renamed from: G */
    public void m13594G() throws C2903b0 {
        boolean zMo13593F;
        do {
            int iMo13590C = mo13590C();
            if (iMo13590C == 0) {
                return;
            }
            m13596b();
            this.f10866a++;
            zMo13593F = mo13593F(iMo13590C);
            this.f10866a--;
        } while (zMo13593F);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo13595a(int i10);

    /* JADX INFO: renamed from: b */
    public void m13596b() throws C2903b0 {
        if (this.f10866a >= this.f10867b) {
            throw C2903b0.m13404i();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo13597e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo13598f();

    /* JADX INFO: renamed from: l */
    public abstract void mo13599l(int i10);

    /* JADX INFO: renamed from: m */
    public abstract int mo13600m(int i10);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo13601n();

    /* JADX INFO: renamed from: o */
    public abstract AbstractC2920h mo13602o();

    /* JADX INFO: renamed from: p */
    public abstract double mo13603p();

    /* JADX INFO: renamed from: q */
    public abstract int mo13604q();

    /* JADX INFO: renamed from: r */
    public abstract int mo13605r();

    /* JADX INFO: renamed from: s */
    public abstract long mo13606s();

    /* JADX INFO: renamed from: t */
    public abstract float mo13607t();

    /* JADX INFO: renamed from: u */
    public abstract int mo13608u();

    /* JADX INFO: renamed from: v */
    public abstract long mo13609v();

    /* JADX INFO: renamed from: w */
    public abstract int mo13610w();

    /* JADX INFO: renamed from: x */
    public abstract long mo13611x();

    /* JADX INFO: renamed from: y */
    public abstract int mo13612y();

    /* JADX INFO: renamed from: z */
    public abstract long mo13613z();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC2923i() {
        this.f10867b = f10865f;
        this.f10868c = Integer.MAX_VALUE;
        this.f10870e = false;
    }
}
