package p100eb;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: eb.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4941h4 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final InputStream f19660a;

    /* JADX INFO: renamed from: b */
    public C4935g4 f19661b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19662c = new byte[8];

    /* JADX INFO: renamed from: d */
    public final C4947i4 f19663d = C4947i4.m23634a();

    public C4941h4(InputStream inputStream) {
        this.f19660a = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final long m23618a() throws IOException {
        m23627l((byte) -128);
        m23626j();
        long jM23625h = m23625h();
        if (jM23625h < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (jM23625h > 0) {
            this.f19663d.m23640g(jM23625h);
        }
        return jM23625h;
    }

    /* JADX INFO: renamed from: b */
    public final long m23619b() throws IOException {
        boolean z10;
        m23621d();
        if (this.f19661b.m23604b() == 0) {
            z10 = true;
        } else {
            if (this.f19661b.m23604b() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.f19661b.m23605c())));
            }
            z10 = false;
        }
        long jM23625h = m23625h();
        if (jM23625h >= 0) {
            return z10 ? jM23625h : ~jM23625h;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    /* JADX INFO: renamed from: c */
    public final long m23620c() throws IOException {
        m23627l((byte) -96);
        m23626j();
        long jM23625h = m23625h();
        if (jM23625h < 0 || jM23625h > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jM23625h > 0) {
            this.f19663d.m23640g(jM23625h + jM23625h);
        }
        return jM23625h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19660a.close();
        this.f19663d.m23635b();
    }

    /* JADX INFO: renamed from: d */
    public final C4935g4 m23621d() throws IOException {
        if (this.f19661b == null) {
            int i10 = this.f19660a.read();
            if (i10 == -1) {
                this.f19663d.m23635b();
                return null;
            }
            C4935g4 c4935g4 = new C4935g4(i10);
            this.f19661b = c4935g4;
            byte bM23604b = c4935g4.m23604b();
            if (bM23604b == -128 || bM23604b == -96 || bM23604b == -64) {
                this.f19663d.m23637d();
                this.f19663d.m23639f();
            } else {
                if (bM23604b != -32) {
                    if (bM23604b != 0 && bM23604b != 32) {
                        if (bM23604b == 64) {
                            this.f19663d.m23638e(-1L);
                        } else {
                            if (bM23604b != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.f19661b.m23605c())));
                            }
                            this.f19663d.m23638e(-2L);
                        }
                    }
                    this.f19663d.m23639f();
                } else if (this.f19661b.m23603a() == 31) {
                    this.f19663d.m23636c();
                }
                this.f19663d.m23637d();
                this.f19663d.m23639f();
            }
        }
        return this.f19661b;
    }

    /* JADX INFO: renamed from: e */
    public final String m23622e() throws IOException {
        m23627l((byte) 96);
        return new String(m23629n(), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m23623f() throws IOException {
        m23627l((byte) -32);
        if (this.f19661b.m23603a() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iM23625h = (int) m23625h();
        if (iM23625h == 20) {
            return false;
        }
        if (iM23625h == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m23624g() throws IOException {
        m23627l((byte) 64);
        return m23629n();
    }

    /* JADX INFO: renamed from: h */
    public final long m23625h() throws IOException {
        if (this.f19661b.m23603a() < 24) {
            long jM23603a = this.f19661b.m23603a();
            this.f19661b = null;
            return jM23603a;
        }
        if (this.f19661b.m23603a() == 24) {
            int i10 = this.f19660a.read();
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f19661b = null;
            return ((long) i10) & 255;
        }
        if (this.f19661b.m23603a() == 25) {
            m23628m(this.f19662c, 2);
            byte[] bArr = this.f19662c;
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (this.f19661b.m23603a() == 26) {
            m23628m(this.f19662c, 4);
            byte[] bArr2 = this.f19662c;
            long j10 = bArr2[0];
            long j11 = bArr2[1];
            return (((long) bArr2[3]) & 255) | ((j11 & 255) << 16) | ((j10 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.f19661b.m23603a() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.f19661b.m23603a()), Integer.valueOf(this.f19661b.m23605c())));
        }
        m23628m(this.f19662c, 8);
        byte[] bArr3 = this.f19662c;
        long j12 = bArr3[0];
        long j13 = bArr3[1];
        long j14 = bArr3[2];
        long j15 = bArr3[3];
        return (((long) bArr3[7]) & 255) | ((j14 & 255) << 40) | ((j12 & 255) << 56) | ((j13 & 255) << 48) | ((j15 & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8);
    }

    /* JADX INFO: renamed from: j */
    public final void m23626j() throws IOException {
        m23621d();
        if (this.f19661b.m23603a() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.f19661b.m23603a())));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m23627l(byte b) throws IOException {
        m23621d();
        if (this.f19661b.m23604b() != b) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b >> 5) & 7), Integer.valueOf(this.f19661b.m23605c())));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m23628m(byte[] bArr, int i10) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int i12 = this.f19660a.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        this.f19661b = null;
    }

    /* JADX INFO: renamed from: n */
    public final byte[] m23629n() throws IOException {
        m23626j();
        long jM23625h = m23625h();
        if (jM23625h < 0 || jM23625h > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
        }
        if (this.f19660a.available() < jM23625h) {
            throw new EOFException();
        }
        int i10 = (int) jM23625h;
        byte[] bArr = new byte[i10];
        m23628m(bArr, i10);
        return bArr;
    }
}
