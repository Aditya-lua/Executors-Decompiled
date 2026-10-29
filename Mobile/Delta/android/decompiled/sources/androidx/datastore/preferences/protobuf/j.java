package androidx.datastore.preferences.protobuf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f2204c = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2205d = q1.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f2206a;
    public boolean b;

    public static abstract class b extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f2207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2209g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2210h;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f2207e = bArr;
            this.f2208f = bArr.length;
        }

        public final void a1(byte b) {
            byte[] bArr = this.f2207e;
            int i10 = this.f2209g;
            this.f2209g = i10 + 1;
            bArr[i10] = b;
            this.f2210h++;
        }

        public final void b1(int i10) {
            byte[] bArr = this.f2207e;
            int i11 = this.f2209g;
            int i12 = i11 + 1;
            this.f2209g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f2209g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f2209g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f2209g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f2210h += 4;
        }

        public final void c1(long j10) {
            byte[] bArr = this.f2207e;
            int i10 = this.f2209g;
            int i11 = i10 + 1;
            this.f2209g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f2209g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f2209g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f2209g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f2209g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f2209g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f2209g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f2209g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f2210h += 8;
        }

        public final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1(i10);
            }
        }

        public final void e1(int i10, int i11) {
            f1(s1.c(i10, i11));
        }

        public final void f1(int i10) {
            if (!j.f2205d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f2207e;
                    int i11 = this.f2209g;
                    this.f2209g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f2210h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f2207e;
                int i12 = this.f2209g;
                this.f2209g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f2210h++;
                return;
            }
            long j10 = this.f2209g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f2207e;
                int i13 = this.f2209g;
                this.f2209g = i13 + 1;
                q1.H(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f2207e;
            int i14 = this.f2209g;
            this.f2209g = i14 + 1;
            q1.H(bArr4, i14, (byte) i10);
            this.f2210h += (int) (((long) this.f2209g) - j10);
        }

        public final void g1(long j10) {
            if (!j.f2205d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f2207e;
                    int i10 = this.f2209g;
                    this.f2209g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f2210h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2207e;
                int i11 = this.f2209g;
                this.f2209g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f2210h++;
                return;
            }
            long j11 = this.f2209g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f2207e;
                int i12 = this.f2209g;
                this.f2209g = i12 + 1;
                q1.H(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f2207e;
            int i13 = this.f2209g;
            this.f2209g = i13 + 1;
            q1.H(bArr4, i13, (byte) j10);
            this.f2210h += (int) (((long) this.f2209g) - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class c extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f2211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f2213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2214h;

        public c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f2211e = bArr;
            this.f2212f = i10;
            this.f2214h = i10;
            this.f2213g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void D0(int i10, int i11) throws d {
            V0(i10, 0);
            E0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void E0(int i10) throws d {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void H0(int i10, r0 r0Var, g1 g1Var) throws d {
            V0(i10, 2);
            X0(((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var));
            g1Var.i(r0Var, this.f2206a);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void I0(r0 r0Var) throws d {
            X0(r0Var.c());
            r0Var.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void J0(int i10, r0 r0Var) throws d {
            V0(1, 3);
            W0(2, i10);
            b1(3, r0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void K0(int i10, g gVar) throws d {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void T0(int i10, String str) throws d {
            V0(i10, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void U0(String str) throws d {
            int i10 = this.f2214h;
            try {
                int iW = j.W(str.length() * 3);
                int iW2 = j.W(str.length());
                if (iW2 != iW) {
                    X0(r1.c(str));
                    this.f2214h = r1.b(str, this.f2211e, this.f2214h, h0());
                    return;
                }
                int i11 = i10 + iW2;
                this.f2214h = i11;
                int iB = r1.b(str, this.f2211e, i11, h0());
                this.f2214h = i10;
                X0((iB - i10) - iW2);
                this.f2214h = iB;
            } catch (r1.d e10) {
                this.f2214h = i10;
                c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void V0(int i10, int i11) throws d {
            X0(s1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void W0(int i10, int i11) throws d {
            V0(i10, 0);
            X0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void X0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f2211e;
                    int i11 = this.f2214h;
                    this.f2214h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2214h), Integer.valueOf(this.f2213g), 1), e10);
                }
            }
            byte[] bArr2 = this.f2211e;
            int i12 = this.f2214h;
            this.f2214h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void Y0(int i10, long j10) throws d {
            V0(i10, 0);
            Z0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void Z0(long j10) throws d {
            if (j.f2205d && h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f2211e;
                    int i10 = this.f2214h;
                    this.f2214h = i10 + 1;
                    q1.H(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2211e;
                int i11 = this.f2214h;
                this.f2214h = i11 + 1;
                q1.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f2211e;
                    int i12 = this.f2214h;
                    this.f2214h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2214h), Integer.valueOf(this.f2213g), 1), e10);
                }
            }
            byte[] bArr4 = this.f2211e;
            int i13 = this.f2214h;
            this.f2214h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.f
        public final void a(byte[] bArr, int i10, int i11) throws d {
            a1(bArr, i10, i11);
        }

        public final void a1(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f2211e, this.f2214h, i11);
                this.f2214h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2214h), Integer.valueOf(this.f2213g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void b0() {
        }

        public final void b1(int i10, r0 r0Var) throws d {
            V0(i10, 2);
            I0(r0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final int h0() {
            return this.f2213g - this.f2214h;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void i0(byte b) throws d {
            try {
                byte[] bArr = this.f2211e;
                int i10 = this.f2214h;
                this.f2214h = i10 + 1;
                bArr[i10] = b;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2214h), Integer.valueOf(this.f2213g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void j0(int i10, boolean z10) throws d {
            V0(i10, 0);
            i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void m0(byte[] bArr, int i10, int i11) throws d {
            X0(i11);
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void n0(int i10, g gVar) throws d {
            V0(i10, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void o0(g gVar) throws d {
            X0(gVar.size());
            gVar.C(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void t0(int i10, int i11) throws d {
            V0(i10, 5);
            u0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void u0(int i10) throws d {
            try {
                byte[] bArr = this.f2211e;
                int i11 = this.f2214h;
                int i12 = i11 + 1;
                this.f2214h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f2214h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f2214h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f2214h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2214h), Integer.valueOf(this.f2213g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void v0(int i10, long j10) throws d {
            V0(i10, 1);
            w0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void w0(long j10) throws d {
            try {
                byte[] bArr = this.f2211e;
                int i10 = this.f2214h;
                int i11 = i10 + 1;
                this.f2214h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f2214h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f2214h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f2214h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f2214h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f2214h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f2214h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f2214h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2214h), Integer.valueOf(this.f2213g), 1), e10);
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
        public final OutputStream f2215i;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f2215i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void D0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void E0(int i10) throws IOException {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void H0(int i10, r0 r0Var, g1 g1Var) throws IOException {
            V0(i10, 2);
            l1(r0Var, g1Var);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void I0(r0 r0Var) throws IOException {
            X0(r0Var.c());
            r0Var.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void J0(int i10, r0 r0Var) throws IOException {
            V0(1, 3);
            W0(2, i10);
            k1(3, r0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void K0(int i10, g gVar) throws IOException {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void T0(int i10, String str) throws IOException {
            V0(i10, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void U0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iW = j.W(length);
                int i10 = iW + length;
                int i11 = this.f2208f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = r1.b(str, bArr, 0, length);
                    X0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f2209g) {
                    h1();
                }
                int iW2 = j.W(str.length());
                int i12 = this.f2209g;
                try {
                    if (iW2 == iW) {
                        int i13 = i12 + iW2;
                        this.f2209g = i13;
                        int iB2 = r1.b(str, this.f2207e, i13, this.f2208f - i13);
                        this.f2209g = i12;
                        iC = (iB2 - i12) - iW2;
                        f1(iC);
                        this.f2209g = iB2;
                    } else {
                        iC = r1.c(str);
                        f1(iC);
                        this.f2209g = r1.b(str, this.f2207e, this.f2209g, iC);
                    }
                    this.f2210h += iC;
                } catch (r1.d e10) {
                    this.f2210h -= this.f2209g - i12;
                    this.f2209g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (r1.d e12) {
                c0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void V0(int i10, int i11) throws IOException {
            X0(s1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void W0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void X0(int i10) throws IOException {
            i1(5);
            f1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void Y0(int i10, long j10) throws IOException {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void Z0(long j10) throws IOException {
            i1(10);
            g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.f
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void b0() throws IOException {
            if (this.f2209g > 0) {
                h1();
            }
        }

        public final void h1() throws IOException {
            this.f2215i.write(this.f2207e, 0, this.f2209g);
            this.f2209g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void i0(byte b) throws IOException {
            if (this.f2209g == this.f2208f) {
                h1();
            }
            a1(b);
        }

        public final void i1(int i10) throws IOException {
            if (this.f2208f - this.f2209g < i10) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void j0(int i10, boolean z10) throws IOException {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : (byte) 0);
        }

        public void j1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f2208f;
            int i13 = this.f2209g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f2207e, i13, i11);
                this.f2209g += i11;
                this.f2210h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f2207e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f2209g = this.f2208f;
            this.f2210h += i14;
            h1();
            if (i16 <= this.f2208f) {
                System.arraycopy(bArr, i15, this.f2207e, 0, i16);
                this.f2209g = i16;
            } else {
                this.f2215i.write(bArr, i15, i16);
            }
            this.f2210h += i16;
        }

        public void k1(int i10, r0 r0Var) throws IOException {
            V0(i10, 2);
            I0(r0Var);
        }

        public void l1(r0 r0Var, g1 g1Var) throws IOException {
            X0(((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var));
            g1Var.i(r0Var, this.f2206a);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void m0(byte[] bArr, int i10, int i11) throws IOException {
            X0(i11);
            j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void n0(int i10, g gVar) throws IOException {
            V0(i10, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void o0(g gVar) throws IOException {
            X0(gVar.size());
            gVar.C(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void t0(int i10, int i11) throws IOException {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void u0(int i10) throws IOException {
            i1(4);
            b1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void v0(int i10, long j10) throws IOException {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void w0(long j10) throws IOException {
            i1(8);
            c1(j10);
        }
    }

    public static int A(int i10, d0 d0Var) {
        return U(i10) + B(d0Var);
    }

    public static int B(d0 d0Var) {
        return C(d0Var.b());
    }

    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, r0 r0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, r0Var);
    }

    public static int E(int i10, r0 r0Var) {
        return U(i10) + G(r0Var);
    }

    public static int F(int i10, r0 r0Var, g1 g1Var) {
        return U(i10) + H(r0Var, g1Var);
    }

    public static int G(r0 r0Var) {
        return C(r0Var.c());
    }

    public static int H(r0 r0Var, g1 g1Var) {
        return C(((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var));
    }

    public static int I(int i10) {
        return i10 > 4096 ? Barcode.FORMAT_AZTEC : i10;
    }

    public static int J(int i10, g gVar) {
        return (U(1) * 2) + V(2, i10) + g(3, gVar);
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
            length = r1.c(str);
        } catch (r1.d unused) {
            length = str.getBytes(z.b).length;
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

    public static j e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static j f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i10, g gVar) {
        return U(i10) + h(gVar);
    }

    public static j g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int h(g gVar) {
        return C(gVar.size());
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
    public static int s(int i10, r0 r0Var, g1 g1Var) {
        return (U(i10) * 2) + u(r0Var, g1Var);
    }

    @Deprecated
    public static int t(r0 r0Var) {
        return r0Var.c();
    }

    @Deprecated
    public static int u(r0 r0Var, g1 g1Var) {
        return ((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var);
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

    public static int z(int i10, d0 d0Var) {
        return (U(1) * 2) + V(2, i10) + A(3, d0Var);
    }

    @Deprecated
    public final void A0(int i10, r0 r0Var, g1 g1Var) {
        V0(i10, 3);
        C0(r0Var, g1Var);
        V0(i10, 4);
    }

    @Deprecated
    public final void B0(r0 r0Var) {
        r0Var.i(this);
    }

    @Deprecated
    public final void C0(r0 r0Var, g1 g1Var) {
        g1Var.i(r0Var, this.f2206a);
    }

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10);

    public final void F0(int i10, long j10) {
        Y0(i10, j10);
    }

    public final void G0(long j10) {
        Z0(j10);
    }

    public abstract void H0(int i10, r0 r0Var, g1 g1Var);

    public abstract void I0(r0 r0Var);

    public abstract void J0(int i10, r0 r0Var);

    public abstract void K0(int i10, g gVar);

    public final void L0(int i10, int i11) {
        t0(i10, i11);
    }

    public final void M0(int i10) {
        u0(i10);
    }

    public final void N0(int i10, long j10) {
        v0(i10, j10);
    }

    public final void O0(long j10) {
        w0(j10);
    }

    public final void P0(int i10, int i11) {
        W0(i10, Z(i11));
    }

    public final void Q0(int i10) {
        X0(Z(i10));
    }

    public final void R0(int i10, long j10) {
        Y0(i10, a0(j10));
    }

    public final void S0(long j10) {
        Z0(a0(j10));
    }

    public abstract void T0(int i10, String str);

    public abstract void U0(String str);

    public abstract void V0(int i10, int i11);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10);

    public abstract void Y0(int i10, long j10);

    public abstract void Z0(long j10);

    @Override // androidx.datastore.preferences.protobuf.f
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void b0();

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(String str, r1.d dVar) throws d {
        f2204c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.b);
        try {
            X0(bytes.length);
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

    public final void l0(byte[] bArr) {
        m0(bArr, 0, bArr.length);
    }

    public abstract void m0(byte[] bArr, int i10, int i11);

    public abstract void n0(int i10, g gVar);

    public abstract void o0(g gVar);

    public final void p0(int i10, double d10) {
        v0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void q0(double d10) {
        w0(Double.doubleToRawLongBits(d10));
    }

    public final void r0(int i10, int i11) {
        D0(i10, i11);
    }

    public final void s0(int i10) {
        E0(i10);
    }

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10);

    public abstract void v0(int i10, long j10);

    public abstract void w0(long j10);

    public final void x0(int i10, float f10) {
        t0(i10, Float.floatToRawIntBits(f10));
    }

    public final void y0(float f10) {
        u0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void z0(int i10, r0 r0Var) {
        V0(i10, 3);
        B0(r0Var);
        V0(i10, 4);
    }

    public j() {
    }
}
