package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ZstdDictCompress extends SharedDictBase {
    private int level;
    private long nativePtr;
    private ByteBuffer sharedDict;

    static {
        Native.load();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZstdDictCompress(byte[] bArr, int i10) {
        this(bArr, 0, bArr.length, i10);
    }

    private native void free();

    private native void init(byte[] bArr, int i10, int i11, int i12);

    private native void initDirect(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.github.luben.zstd.AutoCloseBase
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
            this.sharedDict = null;
        }
    }

    public ByteBuffer getByReferenceBuffer() {
        return this.sharedDict;
    }

    public int level() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ZstdDictCompress(byte[] bArr, int i10, int i11, int i12) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        Zstd.defaultCompressionLevel();
        this.level = i12;
        if (bArr.length - i10 < 0) {
            throw new IllegalArgumentException("Dictionary buffer is to short");
        }
        init(bArr, i10, i11, i12);
        if (0 == this.nativePtr) {
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        storeFence();
    }

    public ZstdDictCompress(ByteBuffer byteBuffer, int i10) {
        this(byteBuffer, i10, false);
    }

    public ZstdDictCompress(ByteBuffer byteBuffer, int i10, boolean z10) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        Zstd.defaultCompressionLevel();
        this.level = i10;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            initDirect(byteBuffer, byteBuffer.position(), iLimit, i10, z10 ? 1 : 0);
            if (this.nativePtr != 0) {
                if (z10) {
                    this.sharedDict = byteBuffer;
                }
                storeFence();
                return;
            }
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }
}
