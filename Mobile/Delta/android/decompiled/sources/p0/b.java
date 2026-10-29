package p0;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f28057a;
    public ByteOrder b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f28057a = outputStream;
        this.b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.b = byteOrder;
    }

    public void b(int i10) throws IOException {
        this.f28057a.write(i10);
    }

    public void c(int i10) throws IOException {
        ByteOrder byteOrder = this.b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f28057a.write(i10 & 255);
            this.f28057a.write((i10 >>> 8) & 255);
            this.f28057a.write((i10 >>> 16) & 255);
            this.f28057a.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f28057a.write((i10 >>> 24) & 255);
            this.f28057a.write((i10 >>> 16) & 255);
            this.f28057a.write((i10 >>> 8) & 255);
            this.f28057a.write(i10 & 255);
        }
    }

    public void d(short s8) throws IOException {
        ByteOrder byteOrder = this.b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f28057a.write(s8 & 255);
            this.f28057a.write((s8 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f28057a.write((s8 >>> 8) & 255);
            this.f28057a.write(s8 & 255);
        }
    }

    public void e(long j10) throws IOException {
        c((int) j10);
    }

    public void f(int i10) throws IOException {
        d((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f28057a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f28057a.write(bArr, i10, i11);
    }
}
