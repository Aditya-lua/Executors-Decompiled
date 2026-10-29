package com.github.luben.zstd;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ZstdInputStream extends FilterInputStream {
    private ZstdInputStreamNoFinalizer inner;

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream);
    }

    public static long recommendedDInSize() {
        return ZstdInputStreamNoFinalizer.recommendedDInSize();
    }

    public static long recommendedDOutSize() {
        return ZstdInputStreamNoFinalizer.recommendedDOutSize();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.inner.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    public void finalize() {
        close();
    }

    public boolean getContinuous() {
        return this.inner.getContinuous();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return this.inner.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.inner.read(bArr, i10, i11);
    }

    public ZstdInputStream setContinuous(boolean z10) {
        this.inner.setContinuous(z10);
        return this;
    }

    public ZstdInputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    @Deprecated
    public void setFinalize(boolean z10) {
    }

    public ZstdInputStream setLongMax(int i10) {
        this.inner.setLongMax(i10);
        return this;
    }

    public ZstdInputStream setRefMultipleDDicts(boolean z10) {
        this.inner.setRefMultipleDDicts(z10);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        return this.inner.skip(j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return this.inner.read();
    }

    public ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    public ZstdInputStream(InputStream inputStream, BufferPool bufferPool) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream, bufferPool);
    }
}
