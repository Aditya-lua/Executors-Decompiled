package eb;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class h4 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f15273a;
    public g4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f15274c = new byte[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4 f15275d = i4.a();

    public h4(InputStream inputStream) {
        this.f15273a = inputStream;
    }

    public final long a() throws IOException {
        l((byte) -128);
        j();
        long jH = h();
        if (jH < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (jH > 0) {
            this.f15275d.g(jH);
        }
        return jH;
    }

    public final long b() throws IOException {
        boolean z10;
        d();
        if (this.b.b() == 0) {
            z10 = true;
        } else {
            if (this.b.b() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.b.c())));
            }
            z10 = false;
        }
        long jH = h();
        if (jH >= 0) {
            return z10 ? jH : ~jH;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    public final long c() throws IOException {
        l((byte) -96);
        j();
        long jH = h();
        if (jH < 0 || jH > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jH > 0) {
            this.f15275d.g(jH + jH);
        }
        return jH;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15273a.close();
        this.f15275d.b();
    }

    public final g4 d() throws IOException {
        if (this.b == null) {
            int i10 = this.f15273a.read();
            if (i10 == -1) {
                this.f15275d.b();
                return null;
            }
            g4 g4Var = new g4(i10);
            this.b = g4Var;
            byte b = g4Var.b();
            if (b == -128 || b == -96 || b == -64) {
                this.f15275d.d();
                this.f15275d.f();
            } else {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            this.f15275d.e(-1L);
                        } else {
                            if (b != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.b.c())));
                            }
                            this.f15275d.e(-2L);
                        }
                    }
                    this.f15275d.f();
                } else if (this.b.a() == 31) {
                    this.f15275d.c();
                }
                this.f15275d.d();
                this.f15275d.f();
            }
        }
        return this.b;
    }

    public final String e() throws IOException {
        l((byte) 96);
        return new String(n(), StandardCharsets.UTF_8);
    }

    public final boolean f() throws IOException {
        l((byte) -32);
        if (this.b.a() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iH = (int) h();
        if (iH == 20) {
            return false;
        }
        if (iH == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    public final byte[] g() throws IOException {
        l((byte) 64);
        return n();
    }

    public final long h() throws IOException {
        if (this.b.a() < 24) {
            long jA = this.b.a();
            this.b = null;
            return jA;
        }
        if (this.b.a() == 24) {
            int i10 = this.f15273a.read();
            if (i10 == -1) {
                throw new EOFException();
            }
            this.b = null;
            return ((long) i10) & 255;
        }
        if (this.b.a() == 25) {
            m(this.f15274c, 2);
            byte[] bArr = this.f15274c;
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (this.b.a() == 26) {
            m(this.f15274c, 4);
            byte[] bArr2 = this.f15274c;
            long j10 = bArr2[0];
            long j11 = bArr2[1];
            return (((long) bArr2[3]) & 255) | ((j11 & 255) << 16) | ((j10 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.b.a() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.b.a()), Integer.valueOf(this.b.c())));
        }
        m(this.f15274c, 8);
        byte[] bArr3 = this.f15274c;
        long j12 = bArr3[0];
        long j13 = bArr3[1];
        long j14 = bArr3[2];
        long j15 = bArr3[3];
        return (((long) bArr3[7]) & 255) | ((j14 & 255) << 40) | ((j12 & 255) << 56) | ((j13 & 255) << 48) | ((j15 & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8);
    }

    public final void j() throws IOException {
        d();
        if (this.b.a() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.b.a())));
        }
    }

    public final void l(byte b) throws IOException {
        d();
        if (this.b.b() != b) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b >> 5) & 7), Integer.valueOf(this.b.c())));
        }
    }

    public final void m(byte[] bArr, int i10) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int i12 = this.f15273a.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        this.b = null;
    }

    public final byte[] n() throws IOException {
        j();
        long jH = h();
        if (jH < 0 || jH > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
        }
        if (this.f15273a.available() < jH) {
            throw new EOFException();
        }
        int i10 = (int) jH;
        byte[] bArr = new byte[i10];
        m(bArr, i10);
        return bArr;
    }
}
