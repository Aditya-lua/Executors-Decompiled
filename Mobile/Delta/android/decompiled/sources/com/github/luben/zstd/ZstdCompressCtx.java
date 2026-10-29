package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ZstdCompressCtx extends AutoCloseBase {
    private long nativePtr;
    private ZstdDictCompress compression_dict = null;
    private SequenceProducer seqprod = null;
    private long seqprod_state = 0;

    static {
        Native.load();
    }

    public ZstdCompressCtx() {
        this.nativePtr = 0L;
        long jInit = init();
        this.nativePtr = jInit;
        if (0 == jInit) {
            throw new IllegalStateException("ZSTD_createCompressCtx failed");
        }
        storeFence();
    }

    private static native long compressByteArray0(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private static native long compressDirectByteBuffer0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long compressDirectByteBufferStream0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14);

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("Compression context is closed");
        }
    }

    private static native void free(long j10);

    private static native ZstdFrameProgression getFrameProgression0(long j10);

    private static native long init();

    private native long loadCDict0(long j10, byte[] bArr);

    private native long loadCDictFast0(long j10, ZstdDictCompress zstdDictCompress);

    private static native long reset0(long j10);

    private static native void setChecksum0(long j10, boolean z10);

    private static native void setContentSize0(long j10, boolean z10);

    private static native void setDictID0(long j10, boolean z10);

    private static native void setLevel0(long j10, int i10);

    private static native long setPledgedSrcSize0(long j10, long j11);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iCompressDirectByteBuffer = compressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iCompressDirectByteBuffer);
        return iCompressDirectByteBuffer;
    }

    public int compressByteArray(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        Objects.checkFromIndexSize(i12, i13, bArr2.length);
        Objects.checkFromIndexSize(i10, i11, bArr.length);
        ensureOpen();
        acquireSharedLock();
        try {
            long jCompressByteArray0 = compressByteArray0(this.nativePtr, bArr, i10, i11, bArr2, i12, i13);
            if (Zstd.isError(jCompressByteArray0)) {
                throw new ZstdException(jCompressByteArray0);
            }
            if (jCompressByteArray0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jCompressByteArray0;
            releaseSharedLock();
            return i14;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public int compressDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        ensureOpen();
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
        Objects.checkFromIndexSize(i12, i13, byteBuffer2.limit());
        Objects.checkFromIndexSize(i10, i11, byteBuffer.limit());
        acquireSharedLock();
        try {
            long jCompressDirectByteBuffer0 = compressDirectByteBuffer0(this.nativePtr, byteBuffer, i10, i11, byteBuffer2, i12, i13);
            if (Zstd.isError(jCompressDirectByteBuffer0)) {
                throw new ZstdException(jCompressDirectByteBuffer0);
            }
            if (jCompressDirectByteBuffer0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jCompressDirectByteBuffer0;
            releaseSharedLock();
            return i14;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public boolean compressDirectByteBufferStream(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, EndDirective endDirective) {
        ensureOpen();
        acquireSharedLock();
        try {
            long jCompressDirectByteBufferStream0 = compressDirectByteBufferStream0(this.nativePtr, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit(), endDirective.value());
            if ((2147483648L & jCompressDirectByteBufferStream0) != 0) {
                long j10 = -(jCompressDirectByteBufferStream0 & 255);
                throw new ZstdException(j10, Zstd.getErrorName(j10));
            }
            byteBuffer2.position((int) (2147483647L & jCompressDirectByteBufferStream0));
            byteBuffer.position(((int) (jCompressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
            boolean z10 = (jCompressDirectByteBufferStream0 >>> 63) == 1;
            releaseSharedLock();
            return z10;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    @Override // com.github.luben.zstd.AutoCloseBase
    public void doClose() {
        long j10 = this.nativePtr;
        if (j10 != 0) {
            free(j10);
            this.nativePtr = 0L;
            SequenceProducer sequenceProducer = this.seqprod;
            if (sequenceProducer != null) {
                sequenceProducer.freeState(this.seqprod_state);
                this.seqprod = null;
            }
        }
    }

    public ZstdFrameProgression getFrameProgression() {
        ensureOpen();
        acquireSharedLock();
        try {
            return getFrameProgression0(this.nativePtr);
        } finally {
            releaseSharedLock();
        }
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public ZstdCompressCtx loadDict(ZstdDictCompress zstdDictCompress) {
        ensureOpen();
        acquireSharedLock();
        zstdDictCompress.acquireSharedLock();
        try {
            long jLoadCDictFast0 = loadCDictFast0(this.nativePtr, zstdDictCompress);
            if (Zstd.isError(jLoadCDictFast0)) {
                throw new ZstdException(jLoadCDictFast0);
            }
            this.compression_dict = zstdDictCompress;
            zstdDictCompress.releaseSharedLock();
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            zstdDictCompress.releaseSharedLock();
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx registerSequenceProducer(SequenceProducer sequenceProducer) {
        ensureOpen();
        acquireSharedLock();
        try {
            try {
                SequenceProducer sequenceProducer2 = this.seqprod;
                if (sequenceProducer2 != null) {
                    sequenceProducer2.freeState(this.seqprod_state);
                    this.seqprod = null;
                }
                if (sequenceProducer == null) {
                    Zstd.registerSequenceProducer(this.nativePtr, 0L, 0L);
                } else {
                    long jCreateState = sequenceProducer.createState();
                    this.seqprod_state = jCreateState;
                    Zstd.registerSequenceProducer(this.nativePtr, jCreateState, sequenceProducer.getFunctionPointer());
                    this.seqprod = sequenceProducer;
                }
                releaseSharedLock();
                return this;
            } catch (Exception e10) {
                this.seqprod = null;
                Zstd.registerSequenceProducer(this.nativePtr, 0L, 0L);
                throw e10;
            }
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public void reset() {
        ensureOpen();
        acquireSharedLock();
        try {
            long jReset0 = reset0(this.nativePtr);
            if (Zstd.isError(jReset0)) {
                throw new ZstdException(jReset0);
            }
            releaseSharedLock();
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setChainLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionChainLog = Zstd.setCompressionChainLog(this.nativePtr, i10);
            if (Zstd.isError(compressionChainLog)) {
                throw new ZstdException(compressionChainLog);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setChecksum(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        setChecksum0(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setContentSize(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        setContentSize0(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setDictID(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        setDictID0(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setEnableLongDistanceMatching(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long enableLongDistanceMatching = Zstd.setEnableLongDistanceMatching(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(enableLongDistanceMatching)) {
                throw new ZstdException(enableLongDistanceMatching);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setHashLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionHashLog = Zstd.setCompressionHashLog(this.nativePtr, i10);
            if (Zstd.isError(compressionHashLog)) {
                throw new ZstdException(compressionHashLog);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setJobSize(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionJobSize = Zstd.setCompressionJobSize(this.nativePtr, i10);
            if (Zstd.isError(compressionJobSize)) {
                throw new ZstdException(compressionJobSize);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setLevel(int i10) {
        ensureOpen();
        acquireSharedLock();
        setLevel0(this.nativePtr, i10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setLong(int i10) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setCompressionLong(this.nativePtr, i10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setMagicless(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setCompressionMagicless(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setMinMatch(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.nativePtr, i10);
            if (Zstd.isError(compressionMinMatch)) {
                throw new ZstdException(compressionMinMatch);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setOverlapLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.nativePtr, i10);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new ZstdException(compressionOverlapLog);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public void setPledgedSrcSize(long j10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long pledgedSrcSize0 = setPledgedSrcSize0(this.nativePtr, j10);
            if (Zstd.isError(pledgedSrcSize0)) {
                throw new ZstdException(pledgedSrcSize0);
            }
            releaseSharedLock();
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setSearchForExternalRepcodes(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long searchForExternalRepcodes = Zstd.setSearchForExternalRepcodes(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(searchForExternalRepcodes)) {
                throw new ZstdException(searchForExternalRepcodes);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setSearchLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.nativePtr, i10);
            if (Zstd.isError(compressionSearchLog)) {
                throw new ZstdException(compressionSearchLog);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setSequenceProducerFallback(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long sequenceProducerFallback = Zstd.setSequenceProducerFallback(this.nativePtr, z10);
            if (Zstd.isError(sequenceProducerFallback)) {
                throw new ZstdException(sequenceProducerFallback);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setStrategy(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionStrategy = Zstd.setCompressionStrategy(this.nativePtr, i10);
            if (Zstd.isError(compressionStrategy)) {
                throw new ZstdException(compressionStrategy);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setTargetLength(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.nativePtr, i10);
            if (Zstd.isError(compressionTargetLength)) {
                throw new ZstdException(compressionTargetLength);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setValidateSequences(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long validateSequences = Zstd.setValidateSequences(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(validateSequences)) {
                throw new ZstdException(validateSequences);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setWindowLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.nativePtr, i10);
            if (Zstd.isError(compressionWindowLog)) {
                throw new ZstdException(compressionWindowLog);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ZstdCompressCtx setWorkers(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionWorkers = Zstd.setCompressionWorkers(this.nativePtr, i10);
            if (Zstd.isError(compressionWorkers)) {
                throw new ZstdException(compressionWorkers);
            }
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ByteBuffer compress(ByteBuffer byteBuffer) {
        long jCompressBound = Zstd.compressBound(byteBuffer.limit() - byteBuffer.position());
        if (jCompressBound <= 2147483647L) {
            int i10 = (int) jCompressBound;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
            int iCompressDirectByteBuffer = compressDirectByteBuffer(byteBufferAllocateDirect, 0, i10, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
            byteBuffer.position(byteBuffer.limit());
            byteBufferAllocateDirect.limit(iCompressDirectByteBuffer);
            return byteBufferAllocateDirect;
        }
        throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }

    public ZstdCompressCtx loadDict(byte[] bArr) {
        ensureOpen();
        acquireSharedLock();
        try {
            long jLoadCDict0 = loadCDict0(this.nativePtr, bArr);
            if (!Zstd.isError(jLoadCDict0)) {
                this.compression_dict = null;
                releaseSharedLock();
                return this;
            }
            throw new ZstdException(jLoadCDict0);
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public byte[] compress(byte[] bArr) {
        long jCompressBound = Zstd.compressBound(bArr.length);
        if (jCompressBound <= 2147483647L) {
            int i10 = (int) jCompressBound;
            byte[] bArr2 = new byte[i10];
            return Arrays.copyOfRange(bArr2, 0, compressByteArray(bArr2, 0, i10, bArr, 0, bArr.length));
        }
        throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }
}
