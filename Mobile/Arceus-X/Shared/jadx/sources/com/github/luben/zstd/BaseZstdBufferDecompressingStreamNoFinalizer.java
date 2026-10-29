package com.github.luben.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseZstdBufferDecompressingStreamNoFinalizer implements Closeable {
    private int consumed;
    private int produced;
    protected ByteBuffer source;
    protected long stream;
    protected boolean closed = false;
    private boolean finishedFrame = false;
    private boolean streamEnd = false;

    public BaseZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        this.source = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            freeDStream(this.stream);
        } finally {
            this.closed = true;
            this.source = null;
        }
    }

    public abstract long createDStream();

    public abstract long decompressStream(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    public abstract long freeDStream(long j10);

    public boolean hasRemaining() {
        if (this.streamEnd) {
            return false;
        }
        return this.source.hasRemaining() || !this.finishedFrame;
    }

    public abstract long initDStream(long j10);

    public abstract int read(ByteBuffer byteBuffer);

    public int readInternal(ByteBuffer byteBuffer, boolean z10) throws IOException {
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (this.streamEnd) {
            return 0;
        }
        long j10 = this.stream;
        int iPosition = byteBuffer.position();
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.source;
        long jDecompressStream = decompressStream(j10, byteBuffer, iPosition, iRemaining, byteBuffer2, byteBuffer2.position(), this.source.remaining());
        if (Zstd.isError(jDecompressStream)) {
            throw new ZstdIOException(jDecompressStream);
        }
        ByteBuffer byteBuffer3 = this.source;
        byteBuffer3.position(byteBuffer3.position() + this.consumed);
        byteBuffer.position(byteBuffer.position() + this.produced);
        if (!this.source.hasRemaining()) {
            ByteBuffer byteBufferRefill = refill(this.source);
            this.source = byteBufferRefill;
            if (!z10 && byteBufferRefill.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
            }
            if (z10 && !this.source.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a direct buffer");
            }
        }
        boolean z11 = jDecompressStream == 0;
        this.finishedFrame = z11;
        if (z11) {
            this.streamEnd = !this.source.hasRemaining();
        }
        return this.produced;
    }

    public ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(byte[] bArr) throws ZstdIOException {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new ZstdIOException(jLoadDictDecompress);
        }
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setLongMax(int i10) throws ZstdIOException {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i10);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (!Zstd.isError(jLoadFastDictDecompress)) {
                zstdDictDecompress.releaseSharedLock();
                return this;
            }
            throw new ZstdIOException(jLoadFastDictDecompress);
        } catch (Throwable th2) {
            zstdDictDecompress.releaseSharedLock();
            throw th2;
        }
    }
}
