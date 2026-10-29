package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0849j extends AbstractC0837f {

    /* JADX INFO: renamed from: c */
    public static final Logger f2902c = Logger.getLogger(AbstractC0849j.class.getName());

    /* JADX INFO: renamed from: d */
    public static final boolean f2903d = C0872q1.m3961B();

    /* JADX INFO: renamed from: a */
    public C0852k f2904a;

    /* JADX INFO: renamed from: b */
    public boolean f2905b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$b */
    public static abstract class b extends AbstractC0849j {

        /* JADX INFO: renamed from: e */
        public final byte[] f2906e;

        /* JADX INFO: renamed from: f */
        public final int f2907f;

        /* JADX INFO: renamed from: g */
        public int f2908g;

        /* JADX INFO: renamed from: h */
        public int f2909h;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f2906e = bArr;
            this.f2907f = bArr.length;
        }

        /* JADX INFO: renamed from: a1 */
        public final void m3729a1(byte b) {
            byte[] bArr = this.f2906e;
            int i10 = this.f2908g;
            this.f2908g = i10 + 1;
            bArr[i10] = b;
            this.f2909h++;
        }

        /* JADX INFO: renamed from: b1 */
        public final void m3730b1(int i10) {
            byte[] bArr = this.f2906e;
            int i11 = this.f2908g;
            int i12 = i11 + 1;
            this.f2908g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f2908g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f2908g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f2908g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f2909h += 4;
        }

        /* JADX INFO: renamed from: c1 */
        public final void m3731c1(long j10) {
            byte[] bArr = this.f2906e;
            int i10 = this.f2908g;
            int i11 = i10 + 1;
            this.f2908g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f2908g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f2908g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f2908g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f2908g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f2908g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f2908g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f2908g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f2909h += 8;
        }

        /* JADX INFO: renamed from: d1 */
        public final void m3732d1(int i10) {
            if (i10 >= 0) {
                m3734f1(i10);
            } else {
                m3735g1(i10);
            }
        }

        /* JADX INFO: renamed from: e1 */
        public final void m3733e1(int i10, int i11) {
            m3734f1(C0878s1.m4060c(i10, i11));
        }

        /* JADX INFO: renamed from: f1 */
        public final void m3734f1(int i10) {
            if (!AbstractC0849j.f2903d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f2906e;
                    int i11 = this.f2908g;
                    this.f2908g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f2909h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f2906e;
                int i12 = this.f2908g;
                this.f2908g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f2909h++;
                return;
            }
            long j10 = this.f2908g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f2906e;
                int i13 = this.f2908g;
                this.f2908g = i13 + 1;
                C0872q1.m3967H(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f2906e;
            int i14 = this.f2908g;
            this.f2908g = i14 + 1;
            C0872q1.m3967H(bArr4, i14, (byte) i10);
            this.f2909h += (int) (((long) this.f2908g) - j10);
        }

        /* JADX INFO: renamed from: g1 */
        public final void m3735g1(long j10) {
            if (!AbstractC0849j.f2903d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f2906e;
                    int i10 = this.f2908g;
                    this.f2908g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f2909h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2906e;
                int i11 = this.f2908g;
                this.f2908g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f2909h++;
                return;
            }
            long j11 = this.f2908g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f2906e;
                int i12 = this.f2908g;
                this.f2908g = i12 + 1;
                C0872q1.m3967H(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f2906e;
            int i13 = this.f2908g;
            this.f2908g = i13 + 1;
            C0872q1.m3967H(bArr4, i13, (byte) j10);
            this.f2909h += (int) (((long) this.f2908g) - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: h0 */
        public final int mo3710h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends AbstractC0849j {

        /* JADX INFO: renamed from: e */
        public final byte[] f2910e;

        /* JADX INFO: renamed from: f */
        public final int f2911f;

        /* JADX INFO: renamed from: g */
        public final int f2912g;

        /* JADX INFO: renamed from: h */
        public int f2913h;

        public c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f2910e = bArr;
            this.f2911f = i10;
            this.f2913h = i10;
            this.f2912g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: D0 */
        public final void mo3683D0(int i10, int i11) throws d {
            mo3701V0(i10, 0);
            mo3684E0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: E0 */
        public final void mo3684E0(int i10) throws d {
            if (i10 >= 0) {
                mo3703X0(i10);
            } else {
                mo3705Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: H0 */
        public final void mo3687H0(int i10, InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) throws d {
            mo3701V0(i10, 2);
            mo3703X0(((AbstractC0822a) interfaceC0874r0).mo3328k(interfaceC0842g1));
            interfaceC0842g1.mo3476i(interfaceC0874r0, this.f2904a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: I0 */
        public final void mo3688I0(InterfaceC0874r0 interfaceC0874r0) throws d {
            mo3703X0(interfaceC0874r0.mo4026c());
            interfaceC0874r0.mo4029i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: J0 */
        public final void mo3689J0(int i10, InterfaceC0874r0 interfaceC0874r0) throws d {
            mo3701V0(1, 3);
            mo3702W0(2, i10);
            m3737b1(3, interfaceC0874r0);
            mo3701V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: K0 */
        public final void mo3690K0(int i10, AbstractC0840g abstractC0840g) throws d {
            mo3701V0(1, 3);
            mo3702W0(2, i10);
            mo3716n0(3, abstractC0840g);
            mo3701V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: T0 */
        public final void mo3699T0(int i10, String str) throws d {
            mo3701V0(i10, 2);
            mo3700U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: U0 */
        public final void mo3700U0(String str) throws d {
            int i10 = this.f2913h;
            try {
                int iM3648W = AbstractC0849j.m3648W(str.length() * 3);
                int iM3648W2 = AbstractC0849j.m3648W(str.length());
                if (iM3648W2 != iM3648W) {
                    mo3703X0(C0875r1.m4034c(str));
                    this.f2913h = C0875r1.m4033b(str, this.f2910e, this.f2913h, mo3710h0());
                    return;
                }
                int i11 = i10 + iM3648W2;
                this.f2913h = i11;
                int iM4033b = C0875r1.m4033b(str, this.f2910e, i11, mo3710h0());
                this.f2913h = i10;
                mo3703X0((iM4033b - i10) - iM3648W2);
                this.f2913h = iM4033b;
            } catch (C0875r1.d e10) {
                this.f2913h = i10;
                m3708c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: V0 */
        public final void mo3701V0(int i10, int i11) throws d {
            mo3703X0(C0878s1.m4060c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: W0 */
        public final void mo3702W0(int i10, int i11) throws d {
            mo3701V0(i10, 0);
            mo3703X0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: X0 */
        public final void mo3703X0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f2910e;
                    int i11 = this.f2913h;
                    this.f2913h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2913h), Integer.valueOf(this.f2912g), 1), e10);
                }
            }
            byte[] bArr2 = this.f2910e;
            int i12 = this.f2913h;
            this.f2913h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: Y0 */
        public final void mo3704Y0(int i10, long j10) throws d {
            mo3701V0(i10, 0);
            mo3705Z0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: Z0 */
        public final void mo3705Z0(long j10) throws d {
            if (AbstractC0849j.f2903d && mo3710h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f2910e;
                    int i10 = this.f2913h;
                    this.f2913h = i10 + 1;
                    C0872q1.m3967H(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2910e;
                int i11 = this.f2913h;
                this.f2913h = i11 + 1;
                C0872q1.m3967H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f2910e;
                    int i12 = this.f2913h;
                    this.f2913h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2913h), Integer.valueOf(this.f2912g), 1), e10);
                }
            }
            byte[] bArr4 = this.f2910e;
            int i13 = this.f2913h;
            this.f2913h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j, androidx.datastore.preferences.protobuf.AbstractC0837f
        /* JADX INFO: renamed from: a */
        public final void mo3392a(byte[] bArr, int i10, int i11) throws d {
            m3736a1(bArr, i10, i11);
        }

        /* JADX INFO: renamed from: a1 */
        public final void m3736a1(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f2910e, this.f2913h, i11);
                this.f2913h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2913h), Integer.valueOf(this.f2912g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: b0 */
        public void mo3706b0() {
        }

        /* JADX INFO: renamed from: b1 */
        public final void m3737b1(int i10, InterfaceC0874r0 interfaceC0874r0) throws d {
            mo3701V0(i10, 2);
            mo3688I0(interfaceC0874r0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: h0 */
        public final int mo3710h0() {
            return this.f2912g - this.f2913h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: i0 */
        public final void mo3711i0(byte b) throws d {
            try {
                byte[] bArr = this.f2910e;
                int i10 = this.f2913h;
                this.f2913h = i10 + 1;
                bArr[i10] = b;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2913h), Integer.valueOf(this.f2912g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: j0 */
        public final void mo3712j0(int i10, boolean z10) throws d {
            mo3701V0(i10, 0);
            mo3711i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: m0 */
        public final void mo3715m0(byte[] bArr, int i10, int i11) throws d {
            mo3703X0(i11);
            m3736a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: n0 */
        public final void mo3716n0(int i10, AbstractC0840g abstractC0840g) throws d {
            mo3701V0(i10, 2);
            mo3717o0(abstractC0840g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: o0 */
        public final void mo3717o0(AbstractC0840g abstractC0840g) throws d {
            mo3703X0(abstractC0840g.size());
            abstractC0840g.mo3448C(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: t0 */
        public final void mo3722t0(int i10, int i11) throws d {
            mo3701V0(i10, 5);
            mo3723u0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: u0 */
        public final void mo3723u0(int i10) throws d {
            try {
                byte[] bArr = this.f2910e;
                int i11 = this.f2913h;
                int i12 = i11 + 1;
                this.f2913h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f2913h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f2913h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f2913h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2913h), Integer.valueOf(this.f2912g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: v0 */
        public final void mo3724v0(int i10, long j10) throws d {
            mo3701V0(i10, 1);
            mo3725w0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: w0 */
        public final void mo3725w0(long j10) throws d {
            try {
                byte[] bArr = this.f2910e;
                int i10 = this.f2913h;
                int i11 = i10 + 1;
                this.f2913h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f2913h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f2913h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f2913h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f2913h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f2913h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f2913h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f2913h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2913h), Integer.valueOf(this.f2912g), 1), e10);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$d */
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$e */
    public static final class e extends b {

        /* JADX INFO: renamed from: i */
        public final OutputStream f2914i;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f2914i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: D0 */
        public void mo3683D0(int i10, int i11) throws IOException {
            m3739i1(20);
            m3733e1(i10, 0);
            m3732d1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: E0 */
        public void mo3684E0(int i10) throws IOException {
            if (i10 >= 0) {
                mo3703X0(i10);
            } else {
                mo3705Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: H0 */
        public void mo3687H0(int i10, InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) throws IOException {
            mo3701V0(i10, 2);
            m3742l1(interfaceC0874r0, interfaceC0842g1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: I0 */
        public void mo3688I0(InterfaceC0874r0 interfaceC0874r0) throws IOException {
            mo3703X0(interfaceC0874r0.mo4026c());
            interfaceC0874r0.mo4029i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: J0 */
        public void mo3689J0(int i10, InterfaceC0874r0 interfaceC0874r0) throws IOException {
            mo3701V0(1, 3);
            mo3702W0(2, i10);
            m3741k1(3, interfaceC0874r0);
            mo3701V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: K0 */
        public void mo3690K0(int i10, AbstractC0840g abstractC0840g) throws IOException {
            mo3701V0(1, 3);
            mo3702W0(2, i10);
            mo3716n0(3, abstractC0840g);
            mo3701V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: T0 */
        public void mo3699T0(int i10, String str) throws IOException {
            mo3701V0(i10, 2);
            mo3700U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: U0 */
        public void mo3700U0(String str) throws IOException {
            int iM4034c;
            try {
                int length = str.length() * 3;
                int iM3648W = AbstractC0849j.m3648W(length);
                int i10 = iM3648W + length;
                int i11 = this.f2907f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iM4033b = C0875r1.m4033b(str, bArr, 0, length);
                    mo3703X0(iM4033b);
                    mo3392a(bArr, 0, iM4033b);
                    return;
                }
                if (i10 > i11 - this.f2908g) {
                    m3738h1();
                }
                int iM3648W2 = AbstractC0849j.m3648W(str.length());
                int i12 = this.f2908g;
                try {
                    if (iM3648W2 == iM3648W) {
                        int i13 = i12 + iM3648W2;
                        this.f2908g = i13;
                        int iM4033b2 = C0875r1.m4033b(str, this.f2906e, i13, this.f2907f - i13);
                        this.f2908g = i12;
                        iM4034c = (iM4033b2 - i12) - iM3648W2;
                        m3734f1(iM4034c);
                        this.f2908g = iM4033b2;
                    } else {
                        iM4034c = C0875r1.m4034c(str);
                        m3734f1(iM4034c);
                        this.f2908g = C0875r1.m4033b(str, this.f2906e, this.f2908g, iM4034c);
                    }
                    this.f2909h += iM4034c;
                } catch (C0875r1.d e10) {
                    this.f2909h -= this.f2908g - i12;
                    this.f2908g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (C0875r1.d e12) {
                m3708c0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: V0 */
        public void mo3701V0(int i10, int i11) throws IOException {
            mo3703X0(C0878s1.m4060c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: W0 */
        public void mo3702W0(int i10, int i11) throws IOException {
            m3739i1(20);
            m3733e1(i10, 0);
            m3734f1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: X0 */
        public void mo3703X0(int i10) throws IOException {
            m3739i1(5);
            m3734f1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: Y0 */
        public void mo3704Y0(int i10, long j10) throws IOException {
            m3739i1(20);
            m3733e1(i10, 0);
            m3735g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: Z0 */
        public void mo3705Z0(long j10) throws IOException {
            m3739i1(10);
            m3735g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j, androidx.datastore.preferences.protobuf.AbstractC0837f
        /* JADX INFO: renamed from: a */
        public void mo3392a(byte[] bArr, int i10, int i11) throws IOException {
            m3740j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: b0 */
        public void mo3706b0() throws IOException {
            if (this.f2908g > 0) {
                m3738h1();
            }
        }

        /* JADX INFO: renamed from: h1 */
        public final void m3738h1() throws IOException {
            this.f2914i.write(this.f2906e, 0, this.f2908g);
            this.f2908g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: i0 */
        public void mo3711i0(byte b) throws IOException {
            if (this.f2908g == this.f2907f) {
                m3738h1();
            }
            m3729a1(b);
        }

        /* JADX INFO: renamed from: i1 */
        public final void m3739i1(int i10) throws IOException {
            if (this.f2907f - this.f2908g < i10) {
                m3738h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: j0 */
        public void mo3712j0(int i10, boolean z10) throws IOException {
            m3739i1(11);
            m3733e1(i10, 0);
            m3729a1(z10 ? (byte) 1 : (byte) 0);
        }

        /* JADX INFO: renamed from: j1 */
        public void m3740j1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f2907f;
            int i13 = this.f2908g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f2906e, i13, i11);
                this.f2908g += i11;
                this.f2909h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f2906e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f2908g = this.f2907f;
            this.f2909h += i14;
            m3738h1();
            if (i16 <= this.f2907f) {
                System.arraycopy(bArr, i15, this.f2906e, 0, i16);
                this.f2908g = i16;
            } else {
                this.f2914i.write(bArr, i15, i16);
            }
            this.f2909h += i16;
        }

        /* JADX INFO: renamed from: k1 */
        public void m3741k1(int i10, InterfaceC0874r0 interfaceC0874r0) throws IOException {
            mo3701V0(i10, 2);
            mo3688I0(interfaceC0874r0);
        }

        /* JADX INFO: renamed from: l1 */
        public void m3742l1(InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) throws IOException {
            mo3703X0(((AbstractC0822a) interfaceC0874r0).mo3328k(interfaceC0842g1));
            interfaceC0842g1.mo3476i(interfaceC0874r0, this.f2904a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: m0 */
        public void mo3715m0(byte[] bArr, int i10, int i11) throws IOException {
            mo3703X0(i11);
            m3740j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: n0 */
        public void mo3716n0(int i10, AbstractC0840g abstractC0840g) throws IOException {
            mo3701V0(i10, 2);
            mo3717o0(abstractC0840g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: o0 */
        public void mo3717o0(AbstractC0840g abstractC0840g) throws IOException {
            mo3703X0(abstractC0840g.size());
            abstractC0840g.mo3448C(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: t0 */
        public void mo3722t0(int i10, int i11) throws IOException {
            m3739i1(14);
            m3733e1(i10, 5);
            m3730b1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: u0 */
        public void mo3723u0(int i10) throws IOException {
            m3739i1(4);
            m3730b1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: v0 */
        public void mo3724v0(int i10, long j10) throws IOException {
            m3739i1(18);
            m3733e1(i10, 1);
            m3731c1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0849j
        /* JADX INFO: renamed from: w0 */
        public void mo3725w0(long j10) throws IOException {
            m3739i1(8);
            m3731c1(j10);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m3626A(int i10, C0832d0 c0832d0) {
        return m3646U(i10) + m3627B(c0832d0);
    }

    /* JADX INFO: renamed from: B */
    public static int m3627B(C0832d0 c0832d0) {
        return m3628C(c0832d0.m3372b());
    }

    /* JADX INFO: renamed from: C */
    public static int m3628C(int i10) {
        return m3648W(i10) + i10;
    }

    /* JADX INFO: renamed from: D */
    public static int m3629D(int i10, InterfaceC0874r0 interfaceC0874r0) {
        return (m3646U(1) * 2) + m3647V(2, i10) + m3630E(3, interfaceC0874r0);
    }

    /* JADX INFO: renamed from: E */
    public static int m3630E(int i10, InterfaceC0874r0 interfaceC0874r0) {
        return m3646U(i10) + m3632G(interfaceC0874r0);
    }

    /* JADX INFO: renamed from: F */
    public static int m3631F(int i10, InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) {
        return m3646U(i10) + m3633H(interfaceC0874r0, interfaceC0842g1);
    }

    /* JADX INFO: renamed from: G */
    public static int m3632G(InterfaceC0874r0 interfaceC0874r0) {
        return m3628C(interfaceC0874r0.mo4026c());
    }

    /* JADX INFO: renamed from: H */
    public static int m3633H(InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) {
        return m3628C(((AbstractC0822a) interfaceC0874r0).mo3328k(interfaceC0842g1));
    }

    /* JADX INFO: renamed from: I */
    public static int m3634I(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    /* JADX INFO: renamed from: J */
    public static int m3635J(int i10, AbstractC0840g abstractC0840g) {
        return (m3646U(1) * 2) + m3647V(2, i10) + m3659g(3, abstractC0840g);
    }

    /* JADX INFO: renamed from: K */
    public static int m3636K(int i10, int i11) {
        return m3646U(i10) + m3637L(i11);
    }

    /* JADX INFO: renamed from: L */
    public static int m3637L(int i10) {
        return 4;
    }

    /* JADX INFO: renamed from: M */
    public static int m3638M(int i10, long j10) {
        return m3646U(i10) + m3639N(j10);
    }

    /* JADX INFO: renamed from: N */
    public static int m3639N(long j10) {
        return 8;
    }

    /* JADX INFO: renamed from: O */
    public static int m3640O(int i10, int i11) {
        return m3646U(i10) + m3641P(i11);
    }

    /* JADX INFO: renamed from: P */
    public static int m3641P(int i10) {
        return m3648W(m3651Z(i10));
    }

    /* JADX INFO: renamed from: Q */
    public static int m3642Q(int i10, long j10) {
        return m3646U(i10) + m3643R(j10);
    }

    /* JADX INFO: renamed from: R */
    public static int m3643R(long j10) {
        return m3650Y(m3652a0(j10));
    }

    /* JADX INFO: renamed from: S */
    public static int m3644S(int i10, String str) {
        return m3646U(i10) + m3645T(str);
    }

    /* JADX INFO: renamed from: T */
    public static int m3645T(String str) {
        int length;
        try {
            length = C0875r1.m4034c(str);
        } catch (C0875r1.d unused) {
            length = str.getBytes(C0892z.f3158b).length;
        }
        return m3628C(length);
    }

    /* JADX INFO: renamed from: U */
    public static int m3646U(int i10) {
        return m3648W(C0878s1.m4060c(i10, 0));
    }

    /* JADX INFO: renamed from: V */
    public static int m3647V(int i10, int i11) {
        return m3646U(i10) + m3648W(i11);
    }

    /* JADX INFO: renamed from: W */
    public static int m3648W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: X */
    public static int m3649X(int i10, long j10) {
        return m3646U(i10) + m3650Y(j10);
    }

    /* JADX INFO: renamed from: Y */
    public static int m3650Y(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: Z */
    public static int m3651Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* JADX INFO: renamed from: a0 */
    public static long m3652a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* JADX INFO: renamed from: d */
    public static int m3654d(int i10, boolean z10) {
        return m3646U(i10) + m3655e(z10);
    }

    /* JADX INFO: renamed from: e */
    public static int m3655e(boolean z10) {
        return 1;
    }

    /* JADX INFO: renamed from: e0 */
    public static AbstractC0849j m3656e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    /* JADX INFO: renamed from: f */
    public static int m3657f(byte[] bArr) {
        return m3628C(bArr.length);
    }

    /* JADX INFO: renamed from: f0 */
    public static AbstractC0849j m3658f0(byte[] bArr) {
        return m3660g0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: g */
    public static int m3659g(int i10, AbstractC0840g abstractC0840g) {
        return m3646U(i10) + m3661h(abstractC0840g);
    }

    /* JADX INFO: renamed from: g0 */
    public static AbstractC0849j m3660g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: h */
    public static int m3661h(AbstractC0840g abstractC0840g) {
        return m3628C(abstractC0840g.size());
    }

    /* JADX INFO: renamed from: i */
    public static int m3662i(int i10, double d10) {
        return m3646U(i10) + m3663j(d10);
    }

    /* JADX INFO: renamed from: j */
    public static int m3663j(double d10) {
        return 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m3664k(int i10, int i11) {
        return m3646U(i10) + m3665l(i11);
    }

    /* JADX INFO: renamed from: l */
    public static int m3665l(int i10) {
        return m3676w(i10);
    }

    /* JADX INFO: renamed from: m */
    public static int m3666m(int i10, int i11) {
        return m3646U(i10) + m3667n(i11);
    }

    /* JADX INFO: renamed from: n */
    public static int m3667n(int i10) {
        return 4;
    }

    /* JADX INFO: renamed from: o */
    public static int m3668o(int i10, long j10) {
        return m3646U(i10) + m3669p(j10);
    }

    /* JADX INFO: renamed from: p */
    public static int m3669p(long j10) {
        return 8;
    }

    /* JADX INFO: renamed from: q */
    public static int m3670q(int i10, float f10) {
        return m3646U(i10) + m3671r(f10);
    }

    /* JADX INFO: renamed from: r */
    public static int m3671r(float f10) {
        return 4;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static int m3672s(int i10, InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) {
        return (m3646U(i10) * 2) + m3674u(interfaceC0874r0, interfaceC0842g1);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static int m3673t(InterfaceC0874r0 interfaceC0874r0) {
        return interfaceC0874r0.mo4026c();
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static int m3674u(InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) {
        return ((AbstractC0822a) interfaceC0874r0).mo3328k(interfaceC0842g1);
    }

    /* JADX INFO: renamed from: v */
    public static int m3675v(int i10, int i11) {
        return m3646U(i10) + m3676w(i11);
    }

    /* JADX INFO: renamed from: w */
    public static int m3676w(int i10) {
        return m3650Y(i10);
    }

    /* JADX INFO: renamed from: x */
    public static int m3677x(int i10, long j10) {
        return m3646U(i10) + m3678y(j10);
    }

    /* JADX INFO: renamed from: y */
    public static int m3678y(long j10) {
        return m3650Y(j10);
    }

    /* JADX INFO: renamed from: z */
    public static int m3679z(int i10, C0832d0 c0832d0) {
        return (m3646U(1) * 2) + m3647V(2, i10) + m3626A(3, c0832d0);
    }

    @Deprecated
    /* JADX INFO: renamed from: A0 */
    public final void m3680A0(int i10, InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) {
        mo3701V0(i10, 3);
        m3682C0(interfaceC0874r0, interfaceC0842g1);
        mo3701V0(i10, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: B0 */
    public final void m3681B0(InterfaceC0874r0 interfaceC0874r0) {
        interfaceC0874r0.mo4029i(this);
    }

    @Deprecated
    /* JADX INFO: renamed from: C0 */
    public final void m3682C0(InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1) {
        interfaceC0842g1.mo3476i(interfaceC0874r0, this.f2904a);
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo3683D0(int i10, int i11);

    /* JADX INFO: renamed from: E0 */
    public abstract void mo3684E0(int i10);

    /* JADX INFO: renamed from: F0 */
    public final void m3685F0(int i10, long j10) {
        mo3704Y0(i10, j10);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m3686G0(long j10) {
        mo3705Z0(j10);
    }

    /* JADX INFO: renamed from: H0 */
    public abstract void mo3687H0(int i10, InterfaceC0874r0 interfaceC0874r0, InterfaceC0842g1 interfaceC0842g1);

    /* JADX INFO: renamed from: I0 */
    public abstract void mo3688I0(InterfaceC0874r0 interfaceC0874r0);

    /* JADX INFO: renamed from: J0 */
    public abstract void mo3689J0(int i10, InterfaceC0874r0 interfaceC0874r0);

    /* JADX INFO: renamed from: K0 */
    public abstract void mo3690K0(int i10, AbstractC0840g abstractC0840g);

    /* JADX INFO: renamed from: L0 */
    public final void m3691L0(int i10, int i11) {
        mo3722t0(i10, i11);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m3692M0(int i10) {
        mo3723u0(i10);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m3693N0(int i10, long j10) {
        mo3724v0(i10, j10);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m3694O0(long j10) {
        mo3725w0(j10);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m3695P0(int i10, int i11) {
        mo3702W0(i10, m3651Z(i11));
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m3696Q0(int i10) {
        mo3703X0(m3651Z(i10));
    }

    /* JADX INFO: renamed from: R0 */
    public final void m3697R0(int i10, long j10) {
        mo3704Y0(i10, m3652a0(j10));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m3698S0(long j10) {
        mo3705Z0(m3652a0(j10));
    }

    /* JADX INFO: renamed from: T0 */
    public abstract void mo3699T0(int i10, String str);

    /* JADX INFO: renamed from: U0 */
    public abstract void mo3700U0(String str);

    /* JADX INFO: renamed from: V0 */
    public abstract void mo3701V0(int i10, int i11);

    /* JADX INFO: renamed from: W0 */
    public abstract void mo3702W0(int i10, int i11);

    /* JADX INFO: renamed from: X0 */
    public abstract void mo3703X0(int i10);

    /* JADX INFO: renamed from: Y0 */
    public abstract void mo3704Y0(int i10, long j10);

    /* JADX INFO: renamed from: Z0 */
    public abstract void mo3705Z0(long j10);

    @Override // androidx.datastore.preferences.protobuf.AbstractC0837f
    /* JADX INFO: renamed from: a */
    public abstract void mo3392a(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: b0 */
    public abstract void mo3706b0();

    /* JADX INFO: renamed from: c */
    public final void m3707c() {
        if (mo3710h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3708c0(String str, C0875r1.d dVar) throws d {
        f2902c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C0892z.f3158b);
        try {
            mo3703X0(bytes.length);
            mo3392a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m3709d0() {
        return this.f2905b;
    }

    /* JADX INFO: renamed from: h0 */
    public abstract int mo3710h0();

    /* JADX INFO: renamed from: i0 */
    public abstract void mo3711i0(byte b10);

    /* JADX INFO: renamed from: j0 */
    public abstract void mo3712j0(int i10, boolean z10);

    /* JADX INFO: renamed from: k0 */
    public final void m3713k0(boolean z10) {
        mo3711i0(z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m3714l0(byte[] bArr) {
        mo3715m0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: m0 */
    public abstract void mo3715m0(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: n0 */
    public abstract void mo3716n0(int i10, AbstractC0840g abstractC0840g);

    /* JADX INFO: renamed from: o0 */
    public abstract void mo3717o0(AbstractC0840g abstractC0840g);

    /* JADX INFO: renamed from: p0 */
    public final void m3718p0(int i10, double d10) {
        mo3724v0(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m3719q0(double d10) {
        mo3725w0(Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m3720r0(int i10, int i11) {
        mo3683D0(i10, i11);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m3721s0(int i10) {
        mo3684E0(i10);
    }

    /* JADX INFO: renamed from: t0 */
    public abstract void mo3722t0(int i10, int i11);

    /* JADX INFO: renamed from: u0 */
    public abstract void mo3723u0(int i10);

    /* JADX INFO: renamed from: v0 */
    public abstract void mo3724v0(int i10, long j10);

    /* JADX INFO: renamed from: w0 */
    public abstract void mo3725w0(long j10);

    /* JADX INFO: renamed from: x0 */
    public final void m3726x0(int i10, float f10) {
        mo3722t0(i10, Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m3727y0(float f10) {
        mo3723u0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    /* JADX INFO: renamed from: z0 */
    public final void m3728z0(int i10, InterfaceC0874r0 interfaceC0874r0) {
        mo3701V0(i10, 3);
        m3681B0(interfaceC0874r0);
        mo3701V0(i10, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC0849j() {
    }
}
