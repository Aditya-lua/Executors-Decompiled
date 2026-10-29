package com.google.crypto.tink.shaded.protobuf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f8488c = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8489d = q1.E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f8490a;
    public boolean b;

    public static abstract class b extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f8491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8492f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8493g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8494h;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f8491e = bArr;
            this.f8492f = bArr.length;
        }

        public final void T0(byte b) {
            byte[] bArr = this.f8491e;
            int i10 = this.f8493g;
            this.f8493g = i10 + 1;
            bArr[i10] = b;
            this.f8494h++;
        }

        public final void U0(int i10) {
            byte[] bArr = this.f8491e;
            int i11 = this.f8493g;
            int i12 = i11 + 1;
            this.f8493g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f8493g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f8493g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f8493g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f8494h += 4;
        }

        public final void V0(long j10) {
            byte[] bArr = this.f8491e;
            int i10 = this.f8493g;
            int i11 = i10 + 1;
            this.f8493g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f8493g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f8493g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f8493g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f8493g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f8493g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f8493g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f8493g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f8494h += 8;
        }

        public final void W0(int i10) {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                Z0(i10);
            }
        }

        public final void X0(int i10, int i11) {
            Y0(s1.c(i10, i11));
        }

        public final void Y0(int i10) {
            if (!k.f8489d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f8491e;
                    int i11 = this.f8493g;
                    this.f8493g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f8494h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f8491e;
                int i12 = this.f8493g;
                this.f8493g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f8494h++;
                return;
            }
            long j10 = this.f8493g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f8491e;
                int i13 = this.f8493g;
                this.f8493g = i13 + 1;
                q1.K(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f8491e;
            int i14 = this.f8493g;
            this.f8493g = i14 + 1;
            q1.K(bArr4, i14, (byte) i10);
            this.f8494h += (int) (((long) this.f8493g) - j10);
        }

        public final void Z0(long j10) {
            if (!k.f8489d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f8491e;
                    int i10 = this.f8493g;
                    this.f8493g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f8494h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f8491e;
                int i11 = this.f8493g;
                this.f8493g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f8494h++;
                return;
            }
            long j11 = this.f8493g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f8491e;
                int i12 = this.f8493g;
                this.f8493g = i12 + 1;
                q1.K(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f8491e;
            int i13 = this.f8493g;
            this.f8493g = i13 + 1;
            q1.K(bArr4, i13, (byte) j10);
            this.f8494h += (int) (((long) this.f8493g) - j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class c extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f8495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8498h;

        public c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f8495e = bArr;
            this.f8496f = i10;
            this.f8498h = i10;
            this.f8497g = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void C0(int i10, s0 s0Var, g1 g1Var) throws d {
            O0(i10, 2);
            Q0(((com.google.crypto.tink.shaded.protobuf.a) s0Var).j(g1Var));
            g1Var.j(s0Var, this.f8490a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void D0(int i10, s0 s0Var) throws d {
            O0(1, 3);
            P0(2, i10);
            V0(3, s0Var);
            O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void E0(int i10, h hVar) throws d {
            O0(1, 3);
            P0(2, i10);
            l0(3, hVar);
            O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void N0(int i10, String str) throws d {
            O0(i10, 2);
            X0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void O0(int i10, int i11) throws d {
            Q0(s1.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void P0(int i10, int i11) throws d {
            O0(i10, 0);
            Q0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void Q0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f8495e;
                    int i11 = this.f8498h;
                    this.f8498h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8498h), Integer.valueOf(this.f8497g), 1), e10);
                }
            }
            byte[] bArr2 = this.f8495e;
            int i12 = this.f8498h;
            this.f8498h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void R0(int i10, long j10) throws d {
            O0(i10, 0);
            S0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void S0(long j10) throws d {
            if (k.f8489d && h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f8495e;
                    int i10 = this.f8498h;
                    this.f8498h = i10 + 1;
                    q1.K(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f8495e;
                int i11 = this.f8498h;
                this.f8498h = i11 + 1;
                q1.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f8495e;
                    int i12 = this.f8498h;
                    this.f8498h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8498h), Integer.valueOf(this.f8497g), 1), e10);
                }
            }
            byte[] bArr4 = this.f8495e;
            int i13 = this.f8498h;
            this.f8498h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void T0(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f8495e, this.f8498h, i11);
                this.f8498h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8498h), Integer.valueOf(this.f8497g), Integer.valueOf(i11)), e10);
            }
        }

        public final void U0(h hVar) throws d {
            Q0(hVar.size());
            hVar.C(this);
        }

        public final void V0(int i10, s0 s0Var) throws d {
            O0(i10, 2);
            W0(s0Var);
        }

        public final void W0(s0 s0Var) throws d {
            Q0(s0Var.c());
            s0Var.i(this);
        }

        public final void X0(String str) throws d {
            int i10 = this.f8498h;
            try {
                int iW = k.W(str.length() * 3);
                int iW2 = k.W(str.length());
                if (iW2 != iW) {
                    Q0(r1.g(str));
                    this.f8498h = r1.f(str, this.f8495e, this.f8498h, h0());
                    return;
                }
                int i11 = i10 + iW2;
                this.f8498h = i11;
                int iF = r1.f(str, this.f8495e, i11, h0());
                this.f8498h = i10;
                Q0((iF - i10) - iW2);
                this.f8498h = iF;
            } catch (r1.d e10) {
                this.f8498h = i10;
                c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.g
        public final void a(byte[] bArr, int i10, int i11) throws d {
            T0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void b0() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final int h0() {
            return this.f8497g - this.f8498h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void i0(byte b) throws d {
            try {
                byte[] bArr = this.f8495e;
                int i10 = this.f8498h;
                this.f8498h = i10 + 1;
                bArr[i10] = b;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8498h), Integer.valueOf(this.f8497g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void j0(int i10, boolean z10) throws d {
            O0(i10, 0);
            i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void l0(int i10, h hVar) throws d {
            O0(i10, 2);
            U0(hVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void q0(int i10, int i11) throws d {
            O0(i10, 5);
            r0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void r0(int i10) throws d {
            try {
                byte[] bArr = this.f8495e;
                int i11 = this.f8498h;
                int i12 = i11 + 1;
                this.f8498h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f8498h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f8498h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f8498h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8498h), Integer.valueOf(this.f8497g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void s0(int i10, long j10) throws d {
            O0(i10, 1);
            t0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void t0(long j10) throws d {
            try {
                byte[] bArr = this.f8495e;
                int i10 = this.f8498h;
                int i11 = i10 + 1;
                this.f8498h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f8498h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f8498h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f8498h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f8498h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f8498h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f8498h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f8498h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8498h), Integer.valueOf(this.f8497g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void y0(int i10, int i11) throws d {
            O0(i10, 0);
            z0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void z0(int i10) throws d {
            if (i10 >= 0) {
                Q0(i10);
            } else {
                S0(i10);
            }
        }
    }

    public static class d extends IOException {
        public d(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        public d(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final OutputStream f8499i;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f8499i = outputStream;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void C0(int i10, s0 s0Var, g1 g1Var) throws IOException {
            O0(i10, 2);
            g1(s0Var, g1Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void D0(int i10, s0 s0Var) throws IOException {
            O0(1, 3);
            P0(2, i10);
            e1(3, s0Var);
            O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void E0(int i10, h hVar) throws IOException {
            O0(1, 3);
            P0(2, i10);
            l0(3, hVar);
            O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void N0(int i10, String str) throws IOException {
            O0(i10, 2);
            h1(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void O0(int i10, int i11) throws IOException {
            Q0(s1.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void P0(int i10, int i11) throws IOException {
            b1(20);
            X0(i10, 0);
            Y0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void Q0(int i10) throws IOException {
            b1(5);
            Y0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void R0(int i10, long j10) throws IOException {
            b1(20);
            X0(i10, 0);
            Z0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void S0(long j10) throws IOException {
            b1(10);
            Z0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.g
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            c1(bArr, i10, i11);
        }

        public final void a1() throws IOException {
            this.f8499i.write(this.f8491e, 0, this.f8493g);
            this.f8493g = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void b0() throws IOException {
            if (this.f8493g > 0) {
                a1();
            }
        }

        public final void b1(int i10) throws IOException {
            if (this.f8492f - this.f8493g < i10) {
                a1();
            }
        }

        public void c1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f8492f;
            int i13 = this.f8493g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f8491e, i13, i11);
                this.f8493g += i11;
                this.f8494h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f8491e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f8493g = this.f8492f;
            this.f8494h += i14;
            a1();
            if (i16 <= this.f8492f) {
                System.arraycopy(bArr, i15, this.f8491e, 0, i16);
                this.f8493g = i16;
            } else {
                this.f8499i.write(bArr, i15, i16);
            }
            this.f8494h += i16;
        }

        public void d1(h hVar) throws IOException {
            Q0(hVar.size());
            hVar.C(this);
        }

        public void e1(int i10, s0 s0Var) throws IOException {
            O0(i10, 2);
            f1(s0Var);
        }

        public void f1(s0 s0Var) throws IOException {
            Q0(s0Var.c());
            s0Var.i(this);
        }

        public void g1(s0 s0Var, g1 g1Var) throws IOException {
            Q0(((com.google.crypto.tink.shaded.protobuf.a) s0Var).j(g1Var));
            g1Var.j(s0Var, this.f8490a);
        }

        public void h1(String str) throws IOException {
            int iG;
            try {
                int length = str.length() * 3;
                int iW = k.W(length);
                int i10 = iW + length;
                int i11 = this.f8492f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iF = r1.f(str, bArr, 0, length);
                    Q0(iF);
                    a(bArr, 0, iF);
                    return;
                }
                if (i10 > i11 - this.f8493g) {
                    a1();
                }
                int iW2 = k.W(str.length());
                int i12 = this.f8493g;
                try {
                    if (iW2 == iW) {
                        int i13 = i12 + iW2;
                        this.f8493g = i13;
                        int iF2 = r1.f(str, this.f8491e, i13, this.f8492f - i13);
                        this.f8493g = i12;
                        iG = (iF2 - i12) - iW2;
                        Y0(iG);
                        this.f8493g = iF2;
                    } else {
                        iG = r1.g(str);
                        Y0(iG);
                        this.f8493g = r1.f(str, this.f8491e, this.f8493g, iG);
                    }
                    this.f8494h += iG;
                } catch (r1.d e10) {
                    this.f8494h -= this.f8493g - i12;
                    this.f8493g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (r1.d e12) {
                c0(str, e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void i0(byte b) throws IOException {
            if (this.f8493g == this.f8492f) {
                a1();
            }
            T0(b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void j0(int i10, boolean z10) throws IOException {
            b1(11);
            X0(i10, 0);
            T0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void l0(int i10, h hVar) throws IOException {
            O0(i10, 2);
            d1(hVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void q0(int i10, int i11) throws IOException {
            b1(14);
            X0(i10, 5);
            U0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void r0(int i10) throws IOException {
            b1(4);
            U0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void s0(int i10, long j10) throws IOException {
            b1(18);
            X0(i10, 1);
            V0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void t0(long j10) throws IOException {
            b1(8);
            V0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void y0(int i10, int i11) throws IOException {
            b1(20);
            X0(i10, 0);
            W0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public void z0(int i10) throws IOException {
            if (i10 >= 0) {
                Q0(i10);
            } else {
                S0(i10);
            }
        }
    }

    public static int A(int i10, e0 e0Var) {
        return U(i10) + B(e0Var);
    }

    public static int B(e0 e0Var) {
        return C(e0Var.b());
    }

    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, s0 s0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, s0Var);
    }

    public static int E(int i10, s0 s0Var) {
        return U(i10) + G(s0Var);
    }

    public static int F(int i10, s0 s0Var, g1 g1Var) {
        return U(i10) + H(s0Var, g1Var);
    }

    public static int G(s0 s0Var) {
        return C(s0Var.c());
    }

    public static int H(s0 s0Var, g1 g1Var) {
        return C(((com.google.crypto.tink.shaded.protobuf.a) s0Var).j(g1Var));
    }

    public static int I(int i10) {
        return i10 > 4096 ? Barcode.FORMAT_AZTEC : i10;
    }

    public static int J(int i10, h hVar) {
        return (U(1) * 2) + V(2, i10) + g(3, hVar);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = r1.g(str);
        } catch (r1.d unused) {
            length = str.getBytes(a0.b).length;
        }
        return C(length);
    }

    public static int U(int i10) {
        return W(s1.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static k e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static k f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i10, h hVar) {
        return U(i10) + h(hVar);
    }

    public static k g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int h(h hVar) {
        return C(hVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    public static int s(int i10, s0 s0Var, g1 g1Var) {
        return (U(i10) * 2) + u(s0Var, g1Var);
    }

    @Deprecated
    public static int t(s0 s0Var) {
        return s0Var.c();
    }

    @Deprecated
    public static int u(s0 s0Var, g1 g1Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) s0Var).j(g1Var);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        return Y(i10);
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, e0 e0Var) {
        return (U(1) * 2) + V(2, i10) + A(3, e0Var);
    }

    public final void A0(int i10, long j10) {
        R0(i10, j10);
    }

    public final void B0(long j10) {
        S0(j10);
    }

    public abstract void C0(int i10, s0 s0Var, g1 g1Var);

    public abstract void D0(int i10, s0 s0Var);

    public abstract void E0(int i10, h hVar);

    public final void F0(int i10, int i11) {
        q0(i10, i11);
    }

    public final void G0(int i10) {
        r0(i10);
    }

    public final void H0(int i10, long j10) {
        s0(i10, j10);
    }

    public final void I0(long j10) {
        t0(j10);
    }

    public final void J0(int i10, int i11) {
        P0(i10, Z(i11));
    }

    public final void K0(int i10) {
        Q0(Z(i10));
    }

    public final void L0(int i10, long j10) {
        R0(i10, a0(j10));
    }

    public final void M0(long j10) {
        S0(a0(j10));
    }

    public abstract void N0(int i10, String str);

    public abstract void O0(int i10, int i11);

    public abstract void P0(int i10, int i11);

    public abstract void Q0(int i10);

    public abstract void R0(int i10, long j10);

    public abstract void S0(long j10);

    @Override // com.google.crypto.tink.shaded.protobuf.g
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void b0();

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(String str, r1.d dVar) throws d {
        f8488c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(a0.b);
        try {
            Q0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    public boolean d0() {
        return this.b;
    }

    public abstract int h0();

    public abstract void i0(byte b10);

    public abstract void j0(int i10, boolean z10);

    public final void k0(boolean z10) {
        i0(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void l0(int i10, h hVar);

    public final void m0(int i10, double d10) {
        s0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void n0(double d10) {
        t0(Double.doubleToRawLongBits(d10));
    }

    public final void o0(int i10, int i11) {
        y0(i10, i11);
    }

    public final void p0(int i10) {
        z0(i10);
    }

    public abstract void q0(int i10, int i11);

    public abstract void r0(int i10);

    public abstract void s0(int i10, long j10);

    public abstract void t0(long j10);

    public final void u0(int i10, float f10) {
        q0(i10, Float.floatToRawIntBits(f10));
    }

    public final void v0(float f10) {
        r0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void w0(int i10, s0 s0Var, g1 g1Var) {
        O0(i10, 3);
        x0(s0Var, g1Var);
        O0(i10, 4);
    }

    @Deprecated
    public final void x0(s0 s0Var, g1 g1Var) {
        g1Var.j(s0Var, this.f8490a);
    }

    public abstract void y0(int i10, int i11);

    public abstract void z0(int i10);

    public k() {
    }
}
