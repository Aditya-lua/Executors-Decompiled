package androidx.datastore.preferences.protobuf;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile int f1979f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1980a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f1982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1983e;

    public static final class b extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f1984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f1985h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1986i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1987j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1988k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1989l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1990m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f1991n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1992o;

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws a0 {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f1986i;
                int i11 = this.f1988k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f1984g, i11, iL, z.b);
                    this.f1988k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iL < 0) {
                throw a0.g();
            }
            throw a0.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws a0 {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f1986i;
                int i11 = this.f1988k;
                if (iL <= i10 - i11) {
                    String strA = r1.a(this.f1984g, i11, iL);
                    this.f1988k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iL <= 0) {
                throw a0.g();
            }
            throw a0.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws a0 {
            if (f()) {
                this.f1990m = 0;
                return 0;
            }
            int iL = L();
            this.f1990m = iL;
            if (s1.a(iL) != 0) {
                return this.f1990m;
            }
            throw a0.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) throws a0 {
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
                throw a0.e();
            }
            P(4);
            return true;
        }

        public byte H() throws a0 {
            int i10 = this.f1988k;
            if (i10 == this.f1986i) {
                throw a0.m();
            }
            byte[] bArr = this.f1984g;
            this.f1988k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws a0 {
            if (i10 > 0) {
                int i11 = this.f1986i;
                int i12 = this.f1988k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f1988k = i13;
                    return Arrays.copyOfRange(this.f1984g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw a0.m();
            }
            if (i10 == 0) {
                return z.f2206d;
            }
            throw a0.g();
        }

        public int J() throws a0 {
            int i10 = this.f1988k;
            if (this.f1986i - i10 < 4) {
                throw a0.m();
            }
            byte[] bArr = this.f1984g;
            this.f1988k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() throws a0 {
            int i10 = this.f1988k;
            if (this.f1986i - i10 < 8) {
                throw a0.m();
            }
            byte[] bArr = this.f1984g;
            this.f1988k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f1988k;
            int i12 = this.f1986i;
            if (i12 != i11) {
                byte[] bArr = this.f1984g;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f1988k = i13;
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
                    this.f1988k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f1988k;
            int i11 = this.f1986i;
            if (i11 != i10) {
                byte[] bArr = this.f1984g;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f1988k = i12;
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
                    this.f1988k = i13;
                    return j10;
                }
            }
            return N();
        }

        public long N() throws a0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw a0.f();
        }

        public final void O() {
            int i10 = this.f1986i + this.f1987j;
            this.f1986i = i10;
            int i11 = i10 - this.f1989l;
            int i12 = this.f1992o;
            if (i11 <= i12) {
                this.f1987j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f1987j = i13;
            this.f1986i = i10 - i13;
        }

        public void P(int i10) throws a0 {
            if (i10 >= 0) {
                int i11 = this.f1986i;
                int i12 = this.f1988k;
                if (i10 <= i11 - i12) {
                    this.f1988k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw a0.m();
            }
            throw a0.g();
        }

        public final void Q() throws a0 {
            if (this.f1986i - this.f1988k >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() throws a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f1984g;
                int i11 = this.f1988k;
                this.f1988k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        public final void S() throws a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws a0 {
            if (this.f1990m != i10) {
                throw a0.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f1988k - this.f1989l;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f1988k == this.f1986i;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f1992o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) throws a0 {
            if (i10 < 0) {
                throw a0.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw a0.h();
            }
            int i11 = this.f1992o;
            if (iE > i11) {
                throw a0.m();
            }
            this.f1992o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f1986i;
                int i11 = this.f1988k;
                if (iL <= i10 - i11) {
                    g gVarB = (this.f1985h && this.f1991n) ? g.B(this.f1984g, i11, iL) : g.f(this.f1984g, i11, iL);
                    this.f1988k += iL;
                    return gVarB;
                }
            }
            return iL == 0 ? g.b : g.A(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(M());
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f1992o = Integer.MAX_VALUE;
            this.f1984g = bArr;
            this.f1986i = i11 + i10;
            this.f1988k = i10;
            this.f1989l = i10;
            this.f1985h = z10;
        }
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InputStream f1993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f1994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1995i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1996j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1997k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1998l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1999m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2000n;

        public static int H(InputStream inputStream) throws a0 {
            try {
                return inputStream.available();
            } catch (a0 e10) {
                e10.j();
                throw e10;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws a0 {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (a0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void T() {
            int i10 = this.f1995i + this.f1996j;
            this.f1995i = i10;
            int i11 = this.f1999m + i10;
            int i12 = this.f2000n;
            if (i11 <= i12) {
                this.f1996j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f1996j = i13;
            this.f1995i = i10 - i13;
        }

        public static long V(InputStream inputStream, long j10) throws a0 {
            try {
                return inputStream.skip(j10);
            } catch (a0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void Y() throws a0 {
            if (this.f1995i - this.f1997k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f1994h;
                int i11 = this.f1997k;
                this.f1997k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private void a0() throws a0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws a0 {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f1995i;
                int i11 = this.f1997k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f1994h, i11, iQ, z.b);
                    this.f1997k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iQ < 0) {
                throw a0.g();
            }
            if (iQ > this.f1995i) {
                return new String(L(iQ, false), z.b);
            }
            U(iQ);
            String str2 = new String(this.f1994h, this.f1997k, iQ, z.b);
            this.f1997k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f1997k;
            int i11 = this.f1995i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f1994h;
                this.f1997k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return BuildConfig.FLAVOR;
                }
                if (iQ < 0) {
                    throw a0.g();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f1994h;
                    this.f1997k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return r1.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws a0 {
            if (f()) {
                this.f1998l = 0;
                return 0;
            }
            int iQ = Q();
            this.f1998l = iQ;
            if (s1.a(iQ) != 0) {
                return this.f1998l;
            }
            throw a0.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) throws a0 {
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
                throw a0.e();
            }
            W(4);
            return true;
        }

        public final g J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return g.e(bArrM);
            }
            int i11 = this.f1997k;
            int i12 = this.f1995i;
            int length = i12 - i11;
            this.f1999m += i12;
            this.f1997k = 0;
            this.f1995i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1994h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return g.A(bArr);
        }

        public byte K() throws a0 {
            if (this.f1997k == this.f1995i) {
                U(1);
            }
            byte[] bArr = this.f1994h;
            int i10 = this.f1997k;
            this.f1997k = i10 + 1;
            return bArr[i10];
        }

        public final byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f1997k;
            int i12 = this.f1995i;
            int length = i12 - i11;
            this.f1999m += i12;
            this.f1997k = 0;
            this.f1995i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1994h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i10) throws a0 {
            if (i10 == 0) {
                return z.f2206d;
            }
            if (i10 < 0) {
                throw a0.g();
            }
            int i11 = this.f1999m;
            int i12 = this.f1997k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f1981c > 0) {
                throw a0.l();
            }
            int i14 = this.f2000n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw a0.m();
            }
            int i15 = this.f1995i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f1993g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1994h, this.f1997k, bArr, 0, i15);
            this.f1999m += this.f1995i;
            this.f1997k = 0;
            this.f1995i = 0;
            while (i15 < i10) {
                int I = I(this.f1993g, bArr, i15, i10 - i15);
                if (I == -1) {
                    throw a0.m();
                }
                this.f1999m += I;
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
                    int i12 = this.f1993g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw a0.m();
                    }
                    this.f1999m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() throws a0 {
            int i10 = this.f1997k;
            if (this.f1995i - i10 < 4) {
                U(4);
                i10 = this.f1997k;
            }
            byte[] bArr = this.f1994h;
            this.f1997k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() throws a0 {
            int i10 = this.f1997k;
            if (this.f1995i - i10 < 8) {
                U(8);
                i10 = this.f1997k;
            }
            byte[] bArr = this.f1994h;
            this.f1997k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f1997k;
            int i12 = this.f1995i;
            if (i12 != i11) {
                byte[] bArr = this.f1994h;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f1997k = i13;
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
                    this.f1997k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f1997k;
            int i11 = this.f1995i;
            if (i11 != i10) {
                byte[] bArr = this.f1994h;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f1997k = i12;
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
                    this.f1997k = i13;
                    return j10;
                }
            }
            return S();
        }

        public long S() throws a0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw a0.f();
        }

        public final void U(int i10) throws a0 {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f1981c - this.f1999m) - this.f1997k) {
                throw a0.m();
            }
            throw a0.l();
        }

        public void W(int i10) throws a0 {
            int i11 = this.f1995i;
            int i12 = this.f1997k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f1997k = i12 + i10;
            }
        }

        public final void X(int i10) throws a0 {
            if (i10 < 0) {
                throw a0.g();
            }
            int i11 = this.f1999m;
            int i12 = this.f1997k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f2000n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw a0.m();
            }
            this.f1999m = i11 + i12;
            int i15 = this.f1995i - i12;
            this.f1995i = 0;
            this.f1997k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f1993g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f1993g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } catch (Throwable th2) {
                    this.f1999m += i15;
                    T();
                    throw th2;
                }
            }
            this.f1999m += i15;
            T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f1995i;
            int i17 = i16 - this.f1997k;
            this.f1997k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f1995i;
                if (i18 <= i19) {
                    this.f1997k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f1997k = i19;
                    U(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws a0 {
            if (this.f1998l != i10) {
                throw a0.b();
            }
        }

        public final boolean b0(int i10) throws a0 {
            int i11 = this.f1997k;
            int i12 = i11 + i10;
            int i13 = this.f1995i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f1981c;
            int i15 = this.f1999m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f2000n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f1994h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f1999m += i11;
                this.f1995i -= i11;
                this.f1997k = 0;
            }
            InputStream inputStream = this.f1993g;
            byte[] bArr2 = this.f1994h;
            int i16 = this.f1995i;
            int I = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f1981c - this.f1999m) - i16));
            if (I == 0 || I < -1 || I > this.f1994h.length) {
                throw new IllegalStateException(this.f1993g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f1995i += I;
            T();
            if (this.f1995i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f1999m + this.f1997k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f1997k == this.f1995i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f2000n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) throws a0 {
            if (i10 < 0) {
                throw a0.g();
            }
            int i11 = i10 + this.f1999m + this.f1997k;
            if (i11 < 0) {
                throw a0.h();
            }
            int i12 = this.f2000n;
            if (i11 > i12) {
                throw a0.m();
            }
            this.f2000n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() throws a0 {
            int iQ = Q();
            int i10 = this.f1995i;
            int i11 = this.f1997k;
            if (iQ <= i10 - i11 && iQ > 0) {
                g gVarF = g.f(this.f1994h, i11, iQ);
                this.f1997k += iQ;
                return gVarF;
            }
            if (iQ == 0) {
                return g.b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw a0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(R());
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f2000n = Integer.MAX_VALUE;
            z.b(inputStream, "input");
            this.f1993g = inputStream;
            this.f1994h = new byte[i10];
            this.f1995i = 0;
            this.f1997k = 0;
            this.f1999m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static h g(InputStream inputStream) {
        return h(inputStream, Barcode.FORMAT_AZTEC);
    }

    public static h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(z.f2206d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    public static h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (a0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws a0 {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f1980a++;
            zF = F(iC);
            this.f1980a--;
        } while (zF);
    }

    public abstract void a(int i10);

    public void b() throws a0 {
        if (this.f1980a >= this.b) {
            throw a0.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract g o();

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

    public h() {
        this.b = f1979f;
        this.f1981c = Integer.MAX_VALUE;
        this.f1983e = false;
    }
}
