package p347p0;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: p0.b */
/* JADX INFO: loaded from: classes.dex */
public class C10086b extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public final OutputStream f36322a;

    /* JADX INFO: renamed from: b */
    public ByteOrder f36323b;

    public C10086b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f36322a = outputStream;
        this.f36323b = byteOrder;
    }

    /* JADX INFO: renamed from: a */
    public void m38896a(ByteOrder byteOrder) {
        this.f36323b = byteOrder;
    }

    /* JADX INFO: renamed from: b */
    public void m38897b(int i10) throws IOException {
        this.f36322a.write(i10);
    }

    /* JADX INFO: renamed from: c */
    public void m38898c(int i10) throws IOException {
        ByteOrder byteOrder = this.f36323b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f36322a.write(i10 & 255);
            this.f36322a.write((i10 >>> 8) & 255);
            this.f36322a.write((i10 >>> 16) & 255);
            this.f36322a.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f36322a.write((i10 >>> 24) & 255);
            this.f36322a.write((i10 >>> 16) & 255);
            this.f36322a.write((i10 >>> 8) & 255);
            this.f36322a.write(i10 & 255);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m38899d(short s8) throws IOException {
        ByteOrder byteOrder = this.f36323b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f36322a.write(s8 & 255);
            this.f36322a.write((s8 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f36322a.write((s8 >>> 8) & 255);
            this.f36322a.write(s8 & 255);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m38900e(long j10) throws IOException {
        m38898c((int) j10);
    }

    /* JADX INFO: renamed from: f */
    public void m38901f(int i10) throws IOException {
        m38899d((short) i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f36322a.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f36322a.write(bArr, i10, i11);
    }
}
