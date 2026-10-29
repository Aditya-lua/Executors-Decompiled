package com.google.crypto.tink.shaded.protobuf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile int f8445f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8446a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f8448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8449e;

    public static final class b extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f8450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f8451h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8452i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8453j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8454k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8455l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8456m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f8457n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8458o;

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() throws b0 {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f8452i;
                int i11 = this.f8454k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f8450g, i11, iL, a0.b);
                    this.f8454k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw b0.g();
            }
            throw b0.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String B() throws b0 {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f8452i;
                int i11 = this.f8454k;
                if (iL <= i10 - i11) {
                    String strE = r1.e(this.f8450g, i11, iL);
                    this.f8454k += iL;
                    return strE;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw b0.g();
            }
            throw b0.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() throws b0 {
            if (f()) {
                this.f8456m = 0;
                return 0;
            }
            int iL = L();
            this.f8456m = iL;
            if (s1.a(iL) != 0) {
                return this.f8456m;
            }
            throw b0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int D() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long E() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean F(int i10) throws b0 {
            int iB = s1.b(i10);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(s1.c(s1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw b0.e();
            }
            P(4);
            return true;
        }

        public byte H() throws b0 {
            int i10 = this.f8454k;
            if (i10 == this.f8452i) {
                throw b0.m();
            }
            byte[] bArr = this.f8450g;
            this.f8454k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws b0 {
            if (i10 > 0) {
                int i11 = this.f8452i;
                int i12 = this.f8454k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f8454k = i13;
                    return Arrays.copyOfRange(this.f8450g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw b0.m();
            }
            if (i10 == 0) {
                return a0.f8390d;
            }
            throw b0.g();
        }

        public int J() throws b0 {
            int i10 = this.f8454k;
            if (this.f8452i - i10 < 4) {
                throw b0.m();
            }
            byte[] bArr = this.f8450g;
            this.f8454k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() throws b0 {
            int i10 = this.f8454k;
            if (this.f8452i - i10 < 8) {
                throw b0.m();
            }
            byte[] bArr = this.f8450g;
            this.f8454k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f8454k;
            int i12 = this.f8452i;
            if (i12 != i11) {
                byte[] bArr = this.f8450g;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f8454k = i13;
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
                    this.f8454k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f8454k;
            int i11 = this.f8452i;
            if (i11 != i10) {
                byte[] bArr = this.f8450g;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f8454k = i12;
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
                    this.f8454k = i13;
                    return j10;
                }
            }
            return N();
        }

        public long N() throws b0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw b0.f();
        }

        public final void O() {
            int i10 = this.f8452i + this.f8453j;
            this.f8452i = i10;
            int i11 = i10 - this.f8455l;
            int i12 = this.f8458o;
            if (i11 <= i12) {
                this.f8453j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f8453j = i13;
            this.f8452i = i10 - i13;
        }

        public void P(int i10) throws b0 {
            if (i10 >= 0) {
                int i11 = this.f8452i;
                int i12 = this.f8454k;
                if (i10 <= i11 - i12) {
                    this.f8454k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw b0.m();
            }
            throw b0.g();
        }

        public final void Q() throws b0 {
            if (this.f8452i - this.f8454k >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() throws b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f8450g;
                int i11 = this.f8454k;
                this.f8454k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        public final void S() throws b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i10) throws b0 {
            if (this.f8456m != i10) {
                throw b0.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int e() {
            return this.f8454k - this.f8455l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean f() {
            return this.f8454k == this.f8452i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void l(int i10) {
            this.f8458o = i10;
            O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int m(int i10) throws b0 {
            if (i10 < 0) {
                throw b0.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw b0.h();
            }
            int i11 = this.f8458o;
            if (iE > i11) {
                throw b0.m();
            }
            this.f8458o = iE;
            O();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean n() {
            return M() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f8452i;
                int i11 = this.f8454k;
                if (iL <= i10 - i11) {
                    h hVarB = (this.f8451h && this.f8457n) ? h.B(this.f8450g, i11, iL) : h.f(this.f8450g, i11, iL);
                    this.f8454k += iL;
                    return hVarB;
                }
            }
            return iL == 0 ? h.b : h.A(I(iL));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int r() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long s() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int u() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int w() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long x() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int y() {
            return i.c(L());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long z() {
            return i.d(M());
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f8458o = Integer.MAX_VALUE;
            this.f8450g = bArr;
            this.f8452i = i11 + i10;
            this.f8454k = i10;
            this.f8455l = i10;
            this.f8451h = z10;
        }
    }

    public static final class c extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InputStream f8459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f8460h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8461i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8462j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8463k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8464l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8465m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8466n;

        public static int H(InputStream inputStream) throws b0 {
            try {
                return inputStream.available();
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws b0 {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void T() {
            int i10 = this.f8461i + this.f8462j;
            this.f8461i = i10;
            int i11 = this.f8465m + i10;
            int i12 = this.f8466n;
            if (i11 <= i12) {
                this.f8462j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f8462j = i13;
            this.f8461i = i10 - i13;
        }

        public static long V(InputStream inputStream, long j10) throws b0 {
            try {
                return inputStream.skip(j10);
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void Y() throws b0 {
            if (this.f8461i - this.f8463k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f8460h;
                int i11 = this.f8463k;
                this.f8463k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private void a0() throws b0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() throws b0 {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f8461i;
                int i11 = this.f8463k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f8460h, i11, iQ, a0.b);
                    this.f8463k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw b0.g();
            }
            if (iQ > this.f8461i) {
                return new String(L(iQ, false), a0.b);
            }
            U(iQ);
            String str2 = new String(this.f8460h, this.f8463k, iQ, a0.b);
            this.f8463k += iQ;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f8463k;
            int i11 = this.f8461i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f8460h;
                this.f8463k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw b0.g();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f8460h;
                    this.f8463k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return r1.e(bArrL, i10, iQ);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() throws b0 {
            if (f()) {
                this.f8464l = 0;
                return 0;
            }
            int iQ = Q();
            this.f8464l = iQ;
            if (s1.a(iQ) != 0) {
                return this.f8464l;
            }
            throw b0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int D() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long E() {
            return R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean F(int i10) throws b0 {
            int iB = s1.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(s1.c(s1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw b0.e();
            }
            W(4);
            return true;
        }

        public final h J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return h.e(bArrM);
            }
            int i11 = this.f8463k;
            int i12 = this.f8461i;
            int length = i12 - i11;
            this.f8465m += i12;
            this.f8463k = 0;
            this.f8461i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8460h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return h.A(bArr);
        }

        public byte K() throws b0 {
            if (this.f8463k == this.f8461i) {
                U(1);
            }
            byte[] bArr = this.f8460h;
            int i10 = this.f8463k;
            this.f8463k = i10 + 1;
            return bArr[i10];
        }

        public final byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f8463k;
            int i12 = this.f8461i;
            int length = i12 - i11;
            this.f8465m += i12;
            this.f8463k = 0;
            this.f8461i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8460h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i10) throws b0 {
            if (i10 == 0) {
                return a0.f8390d;
            }
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = this.f8465m;
            int i12 = this.f8463k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f8447c > 0) {
                throw b0.l();
            }
            int i14 = this.f8466n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw b0.m();
            }
            int i15 = this.f8461i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f8459g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8460h, this.f8463k, bArr, 0, i15);
            this.f8465m += this.f8461i;
            this.f8463k = 0;
            this.f8461i = 0;
            while (i15 < i10) {
                int I = I(this.f8459g, bArr, i15, i10 - i15);
                if (I == -1) {
                    throw b0.m();
                }
                this.f8465m += I;
                i15 += I;
            }
            return bArr;
        }

        public final List<byte[]> N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, Barcode.FORMAT_AZTEC);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f8459g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw b0.m();
                    }
                    this.f8465m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() throws b0 {
            int i10 = this.f8463k;
            if (this.f8461i - i10 < 4) {
                U(4);
                i10 = this.f8463k;
            }
            byte[] bArr = this.f8460h;
            this.f8463k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() throws b0 {
            int i10 = this.f8463k;
            if (this.f8461i - i10 < 8) {
                U(8);
                i10 = this.f8463k;
            }
            byte[] bArr = this.f8460h;
            this.f8463k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f8463k;
            int i12 = this.f8461i;
            if (i12 != i11) {
                byte[] bArr = this.f8460h;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f8463k = i13;
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
                    this.f8463k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f8463k;
            int i11 = this.f8461i;
            if (i11 != i10) {
                byte[] bArr = this.f8460h;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f8463k = i12;
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
                    this.f8463k = i13;
                    return j10;
                }
            }
            return S();
        }

        public long S() throws b0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw b0.f();
        }

        public final void U(int i10) throws b0 {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f8447c - this.f8465m) - this.f8463k) {
                throw b0.m();
            }
            throw b0.l();
        }

        public void W(int i10) throws b0 {
            int i11 = this.f8461i;
            int i12 = this.f8463k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f8463k = i12 + i10;
            }
        }

        public final void X(int i10) throws b0 {
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = this.f8465m;
            int i12 = this.f8463k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f8466n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw b0.m();
            }
            this.f8465m = i11 + i12;
            int i15 = this.f8461i - i12;
            this.f8461i = 0;
            this.f8463k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f8459g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f8459g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } catch (Throwable th2) {
                    this.f8465m += i15;
                    T();
                    throw th2;
                }
            }
            this.f8465m += i15;
            T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f8461i;
            int i17 = i16 - this.f8463k;
            this.f8463k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f8461i;
                if (i18 <= i19) {
                    this.f8463k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f8463k = i19;
                    U(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i10) throws b0 {
            if (this.f8464l != i10) {
                throw b0.b();
            }
        }

        public final boolean b0(int i10) throws b0 {
            int i11 = this.f8463k;
            int i12 = i11 + i10;
            int i13 = this.f8461i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f8447c;
            int i15 = this.f8465m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f8466n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f8460h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f8465m += i11;
                this.f8461i -= i11;
                this.f8463k = 0;
            }
            InputStream inputStream = this.f8459g;
            byte[] bArr2 = this.f8460h;
            int i16 = this.f8461i;
            int I = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f8447c - this.f8465m) - i16));
            if (I == 0 || I < -1 || I > this.f8460h.length) {
                throw new IllegalStateException(this.f8459g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f8461i += I;
            T();
            if (this.f8461i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int e() {
            return this.f8465m + this.f8463k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean f() {
            return this.f8463k == this.f8461i && !b0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void l(int i10) {
            this.f8466n = i10;
            T();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int m(int i10) throws b0 {
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = i10 + this.f8465m + this.f8463k;
            if (i11 < 0) {
                throw b0.h();
            }
            int i12 = this.f8466n;
            if (i11 > i12) {
                throw b0.m();
            }
            this.f8466n = i11;
            T();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean n() {
            return R() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h o() throws b0 {
            int iQ = Q();
            int i10 = this.f8461i;
            int i11 = this.f8463k;
            if (iQ <= i10 - i11 && iQ > 0) {
                h hVarF = h.f(this.f8460h, i11, iQ);
                this.f8463k += iQ;
                return hVarF;
            }
            if (iQ == 0) {
                return h.b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw b0.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int r() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long s() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int u() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long v() {
            return R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int w() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long x() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int y() {
            return i.c(Q());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long z() {
            return i.d(R());
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f8466n = Integer.MAX_VALUE;
            a0.b(inputStream, "input");
            this.f8459g = inputStream;
            this.f8460h = new byte[i10];
            this.f8461i = 0;
            this.f8463k = 0;
            this.f8465m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static i g(InputStream inputStream) {
        return h(inputStream, Barcode.FORMAT_AZTEC);
    }

    public static i h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(a0.f8390d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static i j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    public static i k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws b0 {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f8446a++;
            zF = F(iC);
            this.f8446a--;
        } while (zF);
    }

    public abstract void a(int i10);

    public void b() throws b0 {
        if (this.f8446a >= this.b) {
            throw b0.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract h o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public i() {
        this.b = f8445f;
        this.f8447c = Integer.MAX_VALUE;
        this.f8449e = false;
    }
}
