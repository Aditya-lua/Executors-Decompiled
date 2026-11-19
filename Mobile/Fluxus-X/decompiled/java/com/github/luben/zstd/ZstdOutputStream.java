package com.github.luben.zstd;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ZstdOutputStream extends FilterOutputStream {
    private ZstdOutputStreamNoFinalizer inner;

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i10, boolean z10, boolean z11) {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i10);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z10);
        this.inner.setChecksum(z11);
    }

    public static long recommendedCOutSize() {
        return ZstdOutputStreamNoFinalizer.recommendedCOutSize();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    public void finalize() {
        close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.inner.flush();
    }

    public ZstdOutputStream setChainLog(int i10) {
        this.inner.setChainLog(i10);
        return this;
    }

    public ZstdOutputStream setChecksum(boolean z10) {
        this.inner.setChecksum(z10);
        return this;
    }

    public ZstdOutputStream setCloseFrameOnFlush(boolean z10) {
        this.inner.setCloseFrameOnFlush(z10);
        return this;
    }

    public ZstdOutputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    @Deprecated
    public void setFinalize(boolean z10) {
    }

    public ZstdOutputStream setHashLog(int i10) {
        this.inner.setHashLog(i10);
        return this;
    }

    public ZstdOutputStream setJobSize(int i10) {
        this.inner.setJobSize(i10);
        return this;
    }

    public ZstdOutputStream setLevel(int i10) {
        this.inner.setLevel(i10);
        return this;
    }

    public ZstdOutputStream setLong(int i10) {
        this.inner.setLong(i10);
        return this;
    }

    public ZstdOutputStream setMinMatch(int i10) {
        this.inner.setMinMatch(i10);
        return this;
    }

    public ZstdOutputStream setOverlapLog(int i10) {
        this.inner.setOverlapLog(i10);
        return this;
    }

    public ZstdOutputStream setSearchLog(int i10) {
        this.inner.setSearchLog(i10);
        return this;
    }

    public ZstdOutputStream setStrategy(int i10) {
        this.inner.setStrategy(i10);
        return this;
    }

    public ZstdOutputStream setTargetLength(int i10) {
        this.inner.setTargetLength(i10);
        return this;
    }

    public ZstdOutputStream setWindowLog(int i10) {
        this.inner.setWindowLog(i10);
        return this;
    }

    public ZstdOutputStream setWorkers(int i10) {
        this.inner.setWorkers(i10);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws Throwable {
        this.inner.write(bArr, i10, i11);
    }

    public ZstdOutputStream setDict(ZstdDictCompress zstdDictCompress) {
        this.inner.setDict(zstdDictCompress);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws Throwable {
        this.inner.write(i10);
    }

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i10, boolean z10) {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i10);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z10);
    }

    public ZstdOutputStream(OutputStream outputStream, int i10) {
        this(outputStream, NoPool.INSTANCE);
        this.inner.setLevel(i10);
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, NoPool.INSTANCE);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool, int i10) {
        this(outputStream, bufferPool);
        this.inner.setLevel(i10);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool) {
        super(outputStream);
        this.inner = new ZstdOutputStreamNoFinalizer(outputStream, bufferPool);
    }
}
