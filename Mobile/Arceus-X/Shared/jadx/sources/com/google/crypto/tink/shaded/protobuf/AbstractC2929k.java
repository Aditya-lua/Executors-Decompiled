package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2929k extends AbstractC2917g {

    /* JADX INFO: renamed from: c */
    public static final Logger f10918c = Logger.getLogger(AbstractC2929k.class.getName());

    /* JADX INFO: renamed from: d */
    public static final boolean f10919d = C2949q1.m14070E();

    /* JADX INFO: renamed from: a */
    public C2932l f10920a;

    /* JADX INFO: renamed from: b */
    public boolean f10921b;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k$b */
    public static abstract class b extends AbstractC2929k {

        /* JADX INFO: renamed from: e */
        public final byte[] f10922e;

        /* JADX INFO: renamed from: f */
        public final int f10923f;

        /* JADX INFO: renamed from: g */
        public int f10924g;

        /* JADX INFO: renamed from: h */
        public int f10925h;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f10922e = bArr;
            this.f10923f = bArr.length;
        }

        /* JADX INFO: renamed from: T0 */
        public final void m13851T0(byte b) {
            byte[] bArr = this.f10922e;
            int i10 = this.f10924g;
            this.f10924g = i10 + 1;
            bArr[i10] = b;
            this.f10925h++;
        }

        /* JADX INFO: renamed from: U0 */
        public final void m13852U0(int i10) {
            byte[] bArr = this.f10922e;
            int i11 = this.f10924g;
            int i12 = i11 + 1;
            this.f10924g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f10924g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f10924g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f10924g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f10925h += 4;
        }

        /* JADX INFO: renamed from: V0 */
        public final void m13853V0(long j10) {
            byte[] bArr = this.f10922e;
            int i10 = this.f10924g;
            int i11 = i10 + 1;
            this.f10924g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f10924g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f10924g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f10924g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f10924g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f10924g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f10924g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f10924g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f10925h += 8;
        }

        /* JADX INFO: renamed from: W0 */
        public final void m13854W0(int i10) {
            if (i10 >= 0) {
                m13856Y0(i10);
            } else {
                m13857Z0(i10);
            }
        }

        /* JADX INFO: renamed from: X0 */
        public final void m13855X0(int i10, int i11) {
            m13856Y0(C2955s1.m14181c(i10, i11));
        }

        /* JADX INFO: renamed from: Y0 */
        public final void m13856Y0(int i10) {
            if (!AbstractC2929k.f10919d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f10922e;
                    int i11 = this.f10924g;
                    this.f10924g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f10925h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f10922e;
                int i12 = this.f10924g;
                this.f10924g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f10925h++;
                return;
            }
            long j10 = this.f10924g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f10922e;
                int i13 = this.f10924g;
                this.f10924g = i13 + 1;
                C2949q1.m14076K(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f10922e;
            int i14 = this.f10924g;
            this.f10924g = i14 + 1;
            C2949q1.m14076K(bArr4, i14, (byte) i10);
            this.f10925h += (int) (((long) this.f10924g) - j10);
        }

        /* JADX INFO: renamed from: Z0 */
        public final void m13857Z0(long j10) {
            if (!AbstractC2929k.f10919d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f10922e;
                    int i10 = this.f10924g;
                    this.f10924g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f10925h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f10922e;
                int i11 = this.f10924g;
                this.f10924g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f10925h++;
                return;
            }
            long j11 = this.f10924g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f10922e;
                int i12 = this.f10924g;
                this.f10924g = i12 + 1;
                C2949q1.m14076K(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f10922e;
            int i13 = this.f10924g;
            this.f10924g = i13 + 1;
            C2949q1.m14076K(bArr4, i13, (byte) j10);
            this.f10925h += (int) (((long) this.f10924g) - j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: h0 */
        public final int mo13832h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k$c */
    public static class c extends AbstractC2929k {

        /* JADX INFO: renamed from: e */
        public final byte[] f10926e;

        /* JADX INFO: renamed from: f */
        public final int f10927f;

        /* JADX INFO: renamed from: g */
        public final int f10928g;

        /* JADX INFO: renamed from: h */
        public int f10929h;

        public c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f10926e = bArr;
            this.f10927f = i10;
            this.f10929h = i10;
            this.f10928g = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: C0 */
        public final void mo13811C0(int i10, InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) throws d {
            mo13823O0(i10, 2);
            mo13825Q0(((AbstractC2899a) interfaceC2954s0).mo13371j(interfaceC2919g1));
            interfaceC2919g1.mo13549j(interfaceC2954s0, this.f10920a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: D0 */
        public final void mo13812D0(int i10, InterfaceC2954s0 interfaceC2954s0) throws d {
            mo13823O0(1, 3);
            mo13824P0(2, i10);
            m13860V0(3, interfaceC2954s0);
            mo13823O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: E0 */
        public final void mo13813E0(int i10, AbstractC2920h abstractC2920h) throws d {
            mo13823O0(1, 3);
            mo13824P0(2, i10);
            mo13836l0(3, abstractC2920h);
            mo13823O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: N0 */
        public final void mo13822N0(int i10, String str) throws d {
            mo13823O0(i10, 2);
            m13862X0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: O0 */
        public final void mo13823O0(int i10, int i11) throws d {
            mo13825Q0(C2955s1.m14181c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: P0 */
        public final void mo13824P0(int i10, int i11) throws d {
            mo13823O0(i10, 0);
            mo13825Q0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: Q0 */
        public final void mo13825Q0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f10926e;
                    int i11 = this.f10929h;
                    this.f10929h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10929h), Integer.valueOf(this.f10928g), 1), e10);
                }
            }
            byte[] bArr2 = this.f10926e;
            int i12 = this.f10929h;
            this.f10929h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: R0 */
        public final void mo13826R0(int i10, long j10) throws d {
            mo13823O0(i10, 0);
            mo13827S0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: S0 */
        public final void mo13827S0(long j10) throws d {
            if (AbstractC2929k.f10919d && mo13832h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f10926e;
                    int i10 = this.f10929h;
                    this.f10929h = i10 + 1;
                    C2949q1.m14076K(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f10926e;
                int i11 = this.f10929h;
                this.f10929h = i11 + 1;
                C2949q1.m14076K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f10926e;
                    int i12 = this.f10929h;
                    this.f10929h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10929h), Integer.valueOf(this.f10928g), 1), e10);
                }
            }
            byte[] bArr4 = this.f10926e;
            int i13 = this.f10929h;
            this.f10929h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        /* JADX INFO: renamed from: T0 */
        public final void m13858T0(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f10926e, this.f10929h, i11);
                this.f10929h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10929h), Integer.valueOf(this.f10928g), Integer.valueOf(i11)), e10);
            }
        }

        /* JADX INFO: renamed from: U0 */
        public final void m13859U0(AbstractC2920h abstractC2920h) throws d {
            mo13825Q0(abstractC2920h.size());
            abstractC2920h.mo13560C(this);
        }

        /* JADX INFO: renamed from: V0 */
        public final void m13860V0(int i10, InterfaceC2954s0 interfaceC2954s0) throws d {
            mo13823O0(i10, 2);
            m13861W0(interfaceC2954s0);
        }

        /* JADX INFO: renamed from: W0 */
        public final void m13861W0(InterfaceC2954s0 interfaceC2954s0) throws d {
            mo13825Q0(interfaceC2954s0.mo14176c());
            interfaceC2954s0.mo14178i(this);
        }

        /* JADX INFO: renamed from: X0 */
        public final void m13862X0(String str) throws d {
            int i10 = this.f10929h;
            try {
                int iM13777W = AbstractC2929k.m13777W(str.length() * 3);
                int iM13777W2 = AbstractC2929k.m13777W(str.length());
                if (iM13777W2 != iM13777W) {
                    mo13825Q0(C2952r1.m14138g(str));
                    this.f10929h = C2952r1.m14137f(str, this.f10926e, this.f10929h, mo13832h0());
                    return;
                }
                int i11 = i10 + iM13777W2;
                this.f10929h = i11;
                int iM14137f = C2952r1.m14137f(str, this.f10926e, i11, mo13832h0());
                this.f10929h = i10;
                mo13825Q0((iM14137f - i10) - iM13777W2);
                this.f10929h = iM14137f;
            } catch (C2952r1.d e10) {
                this.f10929h = i10;
                m13830c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k, com.google.crypto.tink.shaded.protobuf.AbstractC2917g
        /* JADX INFO: renamed from: a */
        public final void mo13536a(byte[] bArr, int i10, int i11) throws d {
            m13858T0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: b0 */
        public void mo13828b0() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: h0 */
        public final int mo13832h0() {
            return this.f10928g - this.f10929h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: i0 */
        public final void mo13833i0(byte b) throws d {
            try {
                byte[] bArr = this.f10926e;
                int i10 = this.f10929h;
                this.f10929h = i10 + 1;
                bArr[i10] = b;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10929h), Integer.valueOf(this.f10928g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: j0 */
        public final void mo13834j0(int i10, boolean z10) throws d {
            mo13823O0(i10, 0);
            mo13833i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: l0 */
        public final void mo13836l0(int i10, AbstractC2920h abstractC2920h) throws d {
            mo13823O0(i10, 2);
            m13859U0(abstractC2920h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: q0 */
        public final void mo13841q0(int i10, int i11) throws d {
            mo13823O0(i10, 5);
            mo13842r0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: r0 */
        public final void mo13842r0(int i10) throws d {
            try {
                byte[] bArr = this.f10926e;
                int i11 = this.f10929h;
                int i12 = i11 + 1;
                this.f10929h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f10929h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f10929h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f10929h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10929h), Integer.valueOf(this.f10928g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: s0 */
        public final void mo13843s0(int i10, long j10) throws d {
            mo13823O0(i10, 1);
            mo13844t0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: t0 */
        public final void mo13844t0(long j10) throws d {
            try {
                byte[] bArr = this.f10926e;
                int i10 = this.f10929h;
                int i11 = i10 + 1;
                this.f10929h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f10929h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f10929h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f10929h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f10929h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f10929h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f10929h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f10929h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10929h), Integer.valueOf(this.f10928g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: y0 */
        public final void mo13849y0(int i10, int i11) throws d {
            mo13823O0(i10, 0);
            mo13850z0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: z0 */
        public final void mo13850z0(int i10) throws d {
            if (i10 >= 0) {
                mo13825Q0(i10);
            } else {
                mo13827S0(i10);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k$d */
    public static class d extends IOException {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k$e */
    public static final class e extends b {

        /* JADX INFO: renamed from: i */
        public final OutputStream f10930i;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f10930i = outputStream;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: C0 */
        public void mo13811C0(int i10, InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) throws IOException {
            mo13823O0(i10, 2);
            m13869g1(interfaceC2954s0, interfaceC2919g1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: D0 */
        public void mo13812D0(int i10, InterfaceC2954s0 interfaceC2954s0) throws IOException {
            mo13823O0(1, 3);
            mo13824P0(2, i10);
            m13867e1(3, interfaceC2954s0);
            mo13823O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: E0 */
        public void mo13813E0(int i10, AbstractC2920h abstractC2920h) throws IOException {
            mo13823O0(1, 3);
            mo13824P0(2, i10);
            mo13836l0(3, abstractC2920h);
            mo13823O0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: N0 */
        public void mo13822N0(int i10, String str) throws IOException {
            mo13823O0(i10, 2);
            m13870h1(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: O0 */
        public void mo13823O0(int i10, int i11) throws IOException {
            mo13825Q0(C2955s1.m14181c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: P0 */
        public void mo13824P0(int i10, int i11) throws IOException {
            m13864b1(20);
            m13855X0(i10, 0);
            m13856Y0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: Q0 */
        public void mo13825Q0(int i10) throws IOException {
            m13864b1(5);
            m13856Y0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: R0 */
        public void mo13826R0(int i10, long j10) throws IOException {
            m13864b1(20);
            m13855X0(i10, 0);
            m13857Z0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: S0 */
        public void mo13827S0(long j10) throws IOException {
            m13864b1(10);
            m13857Z0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k, com.google.crypto.tink.shaded.protobuf.AbstractC2917g
        /* JADX INFO: renamed from: a */
        public void mo13536a(byte[] bArr, int i10, int i11) throws IOException {
            m13865c1(bArr, i10, i11);
        }

        /* JADX INFO: renamed from: a1 */
        public final void m13863a1() throws IOException {
            this.f10930i.write(this.f10922e, 0, this.f10924g);
            this.f10924g = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: b0 */
        public void mo13828b0() throws IOException {
            if (this.f10924g > 0) {
                m13863a1();
            }
        }

        /* JADX INFO: renamed from: b1 */
        public final void m13864b1(int i10) throws IOException {
            if (this.f10923f - this.f10924g < i10) {
                m13863a1();
            }
        }

        /* JADX INFO: renamed from: c1 */
        public void m13865c1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f10923f;
            int i13 = this.f10924g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f10922e, i13, i11);
                this.f10924g += i11;
                this.f10925h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f10922e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f10924g = this.f10923f;
            this.f10925h += i14;
            m13863a1();
            if (i16 <= this.f10923f) {
                System.arraycopy(bArr, i15, this.f10922e, 0, i16);
                this.f10924g = i16;
            } else {
                this.f10930i.write(bArr, i15, i16);
            }
            this.f10925h += i16;
        }

        /* JADX INFO: renamed from: d1 */
        public void m13866d1(AbstractC2920h abstractC2920h) throws IOException {
            mo13825Q0(abstractC2920h.size());
            abstractC2920h.mo13560C(this);
        }

        /* JADX INFO: renamed from: e1 */
        public void m13867e1(int i10, InterfaceC2954s0 interfaceC2954s0) throws IOException {
            mo13823O0(i10, 2);
            m13868f1(interfaceC2954s0);
        }

        /* JADX INFO: renamed from: f1 */
        public void m13868f1(InterfaceC2954s0 interfaceC2954s0) throws IOException {
            mo13825Q0(interfaceC2954s0.mo14176c());
            interfaceC2954s0.mo14178i(this);
        }

        /* JADX INFO: renamed from: g1 */
        public void m13869g1(InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) throws IOException {
            mo13825Q0(((AbstractC2899a) interfaceC2954s0).mo13371j(interfaceC2919g1));
            interfaceC2919g1.mo13549j(interfaceC2954s0, this.f10920a);
        }

        /* JADX INFO: renamed from: h1 */
        public void m13870h1(String str) throws IOException {
            int iM14138g;
            try {
                int length = str.length() * 3;
                int iM13777W = AbstractC2929k.m13777W(length);
                int i10 = iM13777W + length;
                int i11 = this.f10923f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iM14137f = C2952r1.m14137f(str, bArr, 0, length);
                    mo13825Q0(iM14137f);
                    mo13536a(bArr, 0, iM14137f);
                    return;
                }
                if (i10 > i11 - this.f10924g) {
                    m13863a1();
                }
                int iM13777W2 = AbstractC2929k.m13777W(str.length());
                int i12 = this.f10924g;
                try {
                    if (iM13777W2 == iM13777W) {
                        int i13 = i12 + iM13777W2;
                        this.f10924g = i13;
                        int iM14137f2 = C2952r1.m14137f(str, this.f10922e, i13, this.f10923f - i13);
                        this.f10924g = i12;
                        iM14138g = (iM14137f2 - i12) - iM13777W2;
                        m13856Y0(iM14138g);
                        this.f10924g = iM14137f2;
                    } else {
                        iM14138g = C2952r1.m14138g(str);
                        m13856Y0(iM14138g);
                        this.f10924g = C2952r1.m14137f(str, this.f10922e, this.f10924g, iM14138g);
                    }
                    this.f10925h += iM14138g;
                } catch (C2952r1.d e10) {
                    this.f10925h -= this.f10924g - i12;
                    this.f10924g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (C2952r1.d e12) {
                m13830c0(str, e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: i0 */
        public void mo13833i0(byte b) throws IOException {
            if (this.f10924g == this.f10923f) {
                m13863a1();
            }
            m13851T0(b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: j0 */
        public void mo13834j0(int i10, boolean z10) throws IOException {
            m13864b1(11);
            m13855X0(i10, 0);
            m13851T0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: l0 */
        public void mo13836l0(int i10, AbstractC2920h abstractC2920h) throws IOException {
            mo13823O0(i10, 2);
            m13866d1(abstractC2920h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: q0 */
        public void mo13841q0(int i10, int i11) throws IOException {
            m13864b1(14);
            m13855X0(i10, 5);
            m13852U0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: r0 */
        public void mo13842r0(int i10) throws IOException {
            m13864b1(4);
            m13852U0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: s0 */
        public void mo13843s0(int i10, long j10) throws IOException {
            m13864b1(18);
            m13855X0(i10, 1);
            m13853V0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: t0 */
        public void mo13844t0(long j10) throws IOException {
            m13864b1(8);
            m13853V0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: y0 */
        public void mo13849y0(int i10, int i11) throws IOException {
            m13864b1(20);
            m13855X0(i10, 0);
            m13854W0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2929k
        /* JADX INFO: renamed from: z0 */
        public void mo13850z0(int i10) throws IOException {
            if (i10 >= 0) {
                mo13825Q0(i10);
            } else {
                mo13827S0(i10);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m13755A(int i10, C2912e0 c2912e0) {
        return m13775U(i10) + m13756B(c2912e0);
    }

    /* JADX INFO: renamed from: B */
    public static int m13756B(C2912e0 c2912e0) {
        return m13757C(c2912e0.m13471b());
    }

    /* JADX INFO: renamed from: C */
    public static int m13757C(int i10) {
        return m13777W(i10) + i10;
    }

    /* JADX INFO: renamed from: D */
    public static int m13758D(int i10, InterfaceC2954s0 interfaceC2954s0) {
        return (m13775U(1) * 2) + m13776V(2, i10) + m13759E(3, interfaceC2954s0);
    }

    /* JADX INFO: renamed from: E */
    public static int m13759E(int i10, InterfaceC2954s0 interfaceC2954s0) {
        return m13775U(i10) + m13761G(interfaceC2954s0);
    }

    /* JADX INFO: renamed from: F */
    public static int m13760F(int i10, InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) {
        return m13775U(i10) + m13762H(interfaceC2954s0, interfaceC2919g1);
    }

    /* JADX INFO: renamed from: G */
    public static int m13761G(InterfaceC2954s0 interfaceC2954s0) {
        return m13757C(interfaceC2954s0.mo14176c());
    }

    /* JADX INFO: renamed from: H */
    public static int m13762H(InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) {
        return m13757C(((AbstractC2899a) interfaceC2954s0).mo13371j(interfaceC2919g1));
    }

    /* JADX INFO: renamed from: I */
    public static int m13763I(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    /* JADX INFO: renamed from: J */
    public static int m13764J(int i10, AbstractC2920h abstractC2920h) {
        return (m13775U(1) * 2) + m13776V(2, i10) + m13788g(3, abstractC2920h);
    }

    /* JADX INFO: renamed from: K */
    public static int m13765K(int i10, int i11) {
        return m13775U(i10) + m13766L(i11);
    }

    /* JADX INFO: renamed from: L */
    public static int m13766L(int i10) {
        return 4;
    }

    /* JADX INFO: renamed from: M */
    public static int m13767M(int i10, long j10) {
        return m13775U(i10) + m13768N(j10);
    }

    /* JADX INFO: renamed from: N */
    public static int m13768N(long j10) {
        return 8;
    }

    /* JADX INFO: renamed from: O */
    public static int m13769O(int i10, int i11) {
        return m13775U(i10) + m13770P(i11);
    }

    /* JADX INFO: renamed from: P */
    public static int m13770P(int i10) {
        return m13777W(m13780Z(i10));
    }

    /* JADX INFO: renamed from: Q */
    public static int m13771Q(int i10, long j10) {
        return m13775U(i10) + m13772R(j10);
    }

    /* JADX INFO: renamed from: R */
    public static int m13772R(long j10) {
        return m13779Y(m13781a0(j10));
    }

    /* JADX INFO: renamed from: S */
    public static int m13773S(int i10, String str) {
        return m13775U(i10) + m13774T(str);
    }

    /* JADX INFO: renamed from: T */
    public static int m13774T(String str) {
        int length;
        try {
            length = C2952r1.m14138g(str);
        } catch (C2952r1.d unused) {
            length = str.getBytes(C2900a0.f10795b).length;
        }
        return m13757C(length);
    }

    /* JADX INFO: renamed from: U */
    public static int m13775U(int i10) {
        return m13777W(C2955s1.m14181c(i10, 0));
    }

    /* JADX INFO: renamed from: V */
    public static int m13776V(int i10, int i11) {
        return m13775U(i10) + m13777W(i11);
    }

    /* JADX INFO: renamed from: W */
    public static int m13777W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: X */
    public static int m13778X(int i10, long j10) {
        return m13775U(i10) + m13779Y(j10);
    }

    /* JADX INFO: renamed from: Y */
    public static int m13779Y(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: Z */
    public static int m13780Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* JADX INFO: renamed from: a0 */
    public static long m13781a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* JADX INFO: renamed from: d */
    public static int m13783d(int i10, boolean z10) {
        return m13775U(i10) + m13784e(z10);
    }

    /* JADX INFO: renamed from: e */
    public static int m13784e(boolean z10) {
        return 1;
    }

    /* JADX INFO: renamed from: e0 */
    public static AbstractC2929k m13785e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    /* JADX INFO: renamed from: f */
    public static int m13786f(byte[] bArr) {
        return m13757C(bArr.length);
    }

    /* JADX INFO: renamed from: f0 */
    public static AbstractC2929k m13787f0(byte[] bArr) {
        return m13789g0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: g */
    public static int m13788g(int i10, AbstractC2920h abstractC2920h) {
        return m13775U(i10) + m13790h(abstractC2920h);
    }

    /* JADX INFO: renamed from: g0 */
    public static AbstractC2929k m13789g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: h */
    public static int m13790h(AbstractC2920h abstractC2920h) {
        return m13757C(abstractC2920h.size());
    }

    /* JADX INFO: renamed from: i */
    public static int m13791i(int i10, double d10) {
        return m13775U(i10) + m13792j(d10);
    }

    /* JADX INFO: renamed from: j */
    public static int m13792j(double d10) {
        return 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m13793k(int i10, int i11) {
        return m13775U(i10) + m13794l(i11);
    }

    /* JADX INFO: renamed from: l */
    public static int m13794l(int i10) {
        return m13805w(i10);
    }

    /* JADX INFO: renamed from: m */
    public static int m13795m(int i10, int i11) {
        return m13775U(i10) + m13796n(i11);
    }

    /* JADX INFO: renamed from: n */
    public static int m13796n(int i10) {
        return 4;
    }

    /* JADX INFO: renamed from: o */
    public static int m13797o(int i10, long j10) {
        return m13775U(i10) + m13798p(j10);
    }

    /* JADX INFO: renamed from: p */
    public static int m13798p(long j10) {
        return 8;
    }

    /* JADX INFO: renamed from: q */
    public static int m13799q(int i10, float f10) {
        return m13775U(i10) + m13800r(f10);
    }

    /* JADX INFO: renamed from: r */
    public static int m13800r(float f10) {
        return 4;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static int m13801s(int i10, InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) {
        return (m13775U(i10) * 2) + m13803u(interfaceC2954s0, interfaceC2919g1);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static int m13802t(InterfaceC2954s0 interfaceC2954s0) {
        return interfaceC2954s0.mo14176c();
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static int m13803u(InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) {
        return ((AbstractC2899a) interfaceC2954s0).mo13371j(interfaceC2919g1);
    }

    /* JADX INFO: renamed from: v */
    public static int m13804v(int i10, int i11) {
        return m13775U(i10) + m13805w(i11);
    }

    /* JADX INFO: renamed from: w */
    public static int m13805w(int i10) {
        return m13779Y(i10);
    }

    /* JADX INFO: renamed from: x */
    public static int m13806x(int i10, long j10) {
        return m13775U(i10) + m13807y(j10);
    }

    /* JADX INFO: renamed from: y */
    public static int m13807y(long j10) {
        return m13779Y(j10);
    }

    /* JADX INFO: renamed from: z */
    public static int m13808z(int i10, C2912e0 c2912e0) {
        return (m13775U(1) * 2) + m13776V(2, i10) + m13755A(3, c2912e0);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m13809A0(int i10, long j10) {
        mo13826R0(i10, j10);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m13810B0(long j10) {
        mo13827S0(j10);
    }

    /* JADX INFO: renamed from: C0 */
    public abstract void mo13811C0(int i10, InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1);

    /* JADX INFO: renamed from: D0 */
    public abstract void mo13812D0(int i10, InterfaceC2954s0 interfaceC2954s0);

    /* JADX INFO: renamed from: E0 */
    public abstract void mo13813E0(int i10, AbstractC2920h abstractC2920h);

    /* JADX INFO: renamed from: F0 */
    public final void m13814F0(int i10, int i11) {
        mo13841q0(i10, i11);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m13815G0(int i10) {
        mo13842r0(i10);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m13816H0(int i10, long j10) {
        mo13843s0(i10, j10);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m13817I0(long j10) {
        mo13844t0(j10);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m13818J0(int i10, int i11) {
        mo13824P0(i10, m13780Z(i11));
    }

    /* JADX INFO: renamed from: K0 */
    public final void m13819K0(int i10) {
        mo13825Q0(m13780Z(i10));
    }

    /* JADX INFO: renamed from: L0 */
    public final void m13820L0(int i10, long j10) {
        mo13826R0(i10, m13781a0(j10));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m13821M0(long j10) {
        mo13827S0(m13781a0(j10));
    }

    /* JADX INFO: renamed from: N0 */
    public abstract void mo13822N0(int i10, String str);

    /* JADX INFO: renamed from: O0 */
    public abstract void mo13823O0(int i10, int i11);

    /* JADX INFO: renamed from: P0 */
    public abstract void mo13824P0(int i10, int i11);

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo13825Q0(int i10);

    /* JADX INFO: renamed from: R0 */
    public abstract void mo13826R0(int i10, long j10);

    /* JADX INFO: renamed from: S0 */
    public abstract void mo13827S0(long j10);

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2917g
    /* JADX INFO: renamed from: a */
    public abstract void mo13536a(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: b0 */
    public abstract void mo13828b0();

    /* JADX INFO: renamed from: c */
    public final void m13829c() {
        if (mo13832h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m13830c0(String str, C2952r1.d dVar) throws d {
        f10918c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C2900a0.f10795b);
        try {
            mo13825Q0(bytes.length);
            mo13536a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m13831d0() {
        return this.f10921b;
    }

    /* JADX INFO: renamed from: h0 */
    public abstract int mo13832h0();

    /* JADX INFO: renamed from: i0 */
    public abstract void mo13833i0(byte b10);

    /* JADX INFO: renamed from: j0 */
    public abstract void mo13834j0(int i10, boolean z10);

    /* JADX INFO: renamed from: k0 */
    public final void m13835k0(boolean z10) {
        mo13833i0(z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: l0 */
    public abstract void mo13836l0(int i10, AbstractC2920h abstractC2920h);

    /* JADX INFO: renamed from: m0 */
    public final void m13837m0(int i10, double d10) {
        mo13843s0(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m13838n0(double d10) {
        mo13844t0(Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m13839o0(int i10, int i11) {
        mo13849y0(i10, i11);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m13840p0(int i10) {
        mo13850z0(i10);
    }

    /* JADX INFO: renamed from: q0 */
    public abstract void mo13841q0(int i10, int i11);

    /* JADX INFO: renamed from: r0 */
    public abstract void mo13842r0(int i10);

    /* JADX INFO: renamed from: s0 */
    public abstract void mo13843s0(int i10, long j10);

    /* JADX INFO: renamed from: t0 */
    public abstract void mo13844t0(long j10);

    /* JADX INFO: renamed from: u0 */
    public final void m13845u0(int i10, float f10) {
        mo13841q0(i10, Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m13846v0(float f10) {
        mo13842r0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    /* JADX INFO: renamed from: w0 */
    public final void m13847w0(int i10, InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) {
        mo13823O0(i10, 3);
        m13848x0(interfaceC2954s0, interfaceC2919g1);
        mo13823O0(i10, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: x0 */
    public final void m13848x0(InterfaceC2954s0 interfaceC2954s0, InterfaceC2919g1 interfaceC2919g1) {
        interfaceC2919g1.mo13549j(interfaceC2954s0, this.f10920a);
    }

    /* JADX INFO: renamed from: y0 */
    public abstract void mo13849y0(int i10, int i11);

    /* JADX INFO: renamed from: z0 */
    public abstract void mo13850z0(int i10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC2929k() {
    }
}
