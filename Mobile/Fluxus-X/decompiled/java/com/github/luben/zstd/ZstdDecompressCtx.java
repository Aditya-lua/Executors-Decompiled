package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ZstdDecompressCtx extends AutoCloseBase {
    private ZstdDictDecompress decompression_dict = null;
    private long nativePtr;

    static {
        Native.load();
    }

    public ZstdDecompressCtx() {
        this.nativePtr = 0L;
        long jInit = init();
        this.nativePtr = jInit;
        if (0 == jInit) {
            throw new IllegalStateException("ZSTD_createDeCompressCtx failed");
        }
        storeFence();
    }

    private static native long decompressByteArray0(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private static native long decompressByteArrayToDirectByteBuffer0(long j10, ByteBuffer byteBuffer, int i10, int i11, byte[] bArr, int i12, int i13);

    private static native long decompressDirectByteBuffer0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long decompressDirectByteBufferStream0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long decompressDirectByteBufferToByteArray0(long j10, byte[] bArr, int i10, int i11, ByteBuffer byteBuffer, int i12, int i13);

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("Decompression context is closed");
        }
    }

    private static native void free(long j10);

    private static native long init();

    private static native long loadDDict0(long j10, byte[] bArr);

    private static native long loadDDictFast0(long j10, ZstdDictDecompress zstdDictDecompress);

    private static native long reset0(long j10);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iDecompressDirectByteBuffer = decompressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iDecompressDirectByteBuffer);
        return iDecompressDirectByteBuffer;
    }

    public int decompressByteArray(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        Objects.checkFromIndexSize(i12, i13, bArr2.length);
        Objects.checkFromIndexSize(i10, i11, bArr.length);
        ensureOpen();
        acquireSharedLock();
        try {
            long jDecompressByteArray0 = decompressByteArray0(this.nativePtr, bArr, i10, i11, bArr2, i12, i13);
            if (Zstd.isError(jDecompressByteArray0)) {
                throw new ZstdException(jDecompressByteArray0);
            }
            if (jDecompressByteArray0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressByteArray0;
            releaseSharedLock();
            return i14;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public int decompressByteArrayToDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11, byte[] bArr, int i12, int i13) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
        Objects.checkFromIndexSize(i12, i13, bArr.length);
        Objects.checkFromIndexSize(i10, i11, byteBuffer.limit());
        ensureOpen();
        acquireSharedLock();
        try {
            long jDecompressByteArrayToDirectByteBuffer0 = decompressByteArrayToDirectByteBuffer0(this.nativePtr, byteBuffer, i10, i11, bArr, i12, i13);
            if (Zstd.isError(jDecompressByteArrayToDirectByteBuffer0)) {
                throw new ZstdException(jDecompressByteArrayToDirectByteBuffer0);
            }
            if (jDecompressByteArrayToDirectByteBuffer0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressByteArrayToDirectByteBuffer0;
            releaseSharedLock();
            return i14;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public int decompressDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
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
            long jDecompressDirectByteBuffer0 = decompressDirectByteBuffer0(this.nativePtr, byteBuffer, i10, i11, byteBuffer2, i12, i13);
            if (Zstd.isError(jDecompressDirectByteBuffer0)) {
                throw new ZstdException(jDecompressDirectByteBuffer0);
            }
            if (jDecompressDirectByteBuffer0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressDirectByteBuffer0;
            releaseSharedLock();
            return i14;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public boolean decompressDirectByteBufferStream(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ensureOpen();
        acquireSharedLock();
        try {
            long jDecompressDirectByteBufferStream0 = decompressDirectByteBufferStream0(this.nativePtr, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit());
            if ((2147483648L & jDecompressDirectByteBufferStream0) != 0) {
                long j10 = -(jDecompressDirectByteBufferStream0 & 255);
                throw new ZstdException(j10, Zstd.getErrorName(j10));
            }
            byteBuffer2.position((int) (2147483647L & jDecompressDirectByteBufferStream0));
            byteBuffer.position(((int) (jDecompressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
            boolean z10 = (jDecompressDirectByteBufferStream0 >>> 63) == 1;
            releaseSharedLock();
            return z10;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public int decompressDirectByteBufferToByteArray(byte[] bArr, int i10, int i11, ByteBuffer byteBuffer, int i12, int i13) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        Objects.checkFromIndexSize(i12, i13, byteBuffer.limit());
        Objects.checkFromIndexSize(i10, i11, bArr.length);
        ensureOpen();
        acquireSharedLock();
        try {
            long jDecompressDirectByteBufferToByteArray0 = decompressDirectByteBufferToByteArray0(this.nativePtr, bArr, i10, i11, byteBuffer, i12, i13);
            if (Zstd.isError(jDecompressDirectByteBufferToByteArray0)) {
                throw new ZstdException(jDecompressDirectByteBufferToByteArray0);
            }
            if (jDecompressDirectByteBufferToByteArray0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressDirectByteBufferToByteArray0;
            releaseSharedLock();
            return i14;
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
        }
    }

    public ZstdDecompressCtx loadDict(ZstdDictDecompress zstdDictDecompress) {
        ensureOpen();
        acquireSharedLock();
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadDDictFast0 = loadDDictFast0(this.nativePtr, zstdDictDecompress);
            if (Zstd.isError(jLoadDDictFast0)) {
                throw new ZstdException(jLoadDDictFast0);
            }
            this.decompression_dict = zstdDictDecompress;
            zstdDictDecompress.releaseSharedLock();
            releaseSharedLock();
            return this;
        } catch (Throwable th2) {
            zstdDictDecompress.releaseSharedLock();
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

    public ZstdDecompressCtx setMagicless(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setDecompressionMagicless(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public int decompress(ByteBuffer byteBuffer, byte[] bArr) {
        int iDecompressByteArrayToDirectByteBuffer = decompressByteArrayToDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), bArr, 0, bArr.length);
        byteBuffer.position(byteBuffer.position() + iDecompressByteArrayToDirectByteBuffer);
        return iDecompressByteArrayToDirectByteBuffer;
    }

    public int decompress(byte[] bArr, ByteBuffer byteBuffer) {
        int iDecompressDirectByteBufferToByteArray = decompressDirectByteBufferToByteArray(bArr, 0, bArr.length, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        byteBuffer.position(byteBuffer.limit());
        return iDecompressDirectByteBufferToByteArray;
    }

    public ZstdDecompressCtx loadDict(byte[] bArr) {
        ensureOpen();
        acquireSharedLock();
        try {
            long jLoadDDict0 = loadDDict0(this.nativePtr, bArr);
            if (!Zstd.isError(jLoadDDict0)) {
                this.decompression_dict = null;
                releaseSharedLock();
                return this;
            }
            throw new ZstdException(jLoadDDict0);
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public ByteBuffer decompress(ByteBuffer byteBuffer, int i10) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
        decompressDirectByteBuffer(byteBufferAllocateDirect, 0, i10, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        byteBuffer.position(byteBuffer.limit());
        return byteBufferAllocateDirect;
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public byte[] decompress(byte[] bArr, int i10) {
        return decompress(bArr, 0, bArr.length, i10);
    }

    public byte[] decompress(byte[] bArr, int i10, int i11, int i12) {
        if (i12 >= 0) {
            byte[] bArr2 = new byte[i12];
            int iDecompressByteArray = decompressByteArray(bArr2, 0, i12, bArr, i10, i11);
            return iDecompressByteArray != i12 ? Arrays.copyOfRange(bArr2, 0, iDecompressByteArray) : bArr2;
        }
        throw new ZstdException(Zstd.errGeneric(), "Original size should not be negative");
    }
}
