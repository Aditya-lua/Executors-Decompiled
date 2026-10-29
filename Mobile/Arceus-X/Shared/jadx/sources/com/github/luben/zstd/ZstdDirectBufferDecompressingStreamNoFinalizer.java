package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ZstdDirectBufferDecompressingStreamNoFinalizer extends BaseZstdBufferDecompressingStreamNoFinalizer {
    static {
        Native.load();
    }

    public ZstdDirectBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        this.source = byteBuffer;
        long jCreateDStream = createDStream();
        this.stream = jCreateDStream;
        initDStream(jCreateDStream);
    }

    private static native long createDStreamNative();

    private native long decompressStreamNative(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long freeDStreamNative(long j10);

    private native long initDStreamNative(long j10);

    private static native long recommendedDOutSizeNative();

    public static int recommendedTargetBufferSize() {
        return (int) recommendedDOutSizeNative();
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long createDStream() {
        return createDStreamNative();
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long decompressStream(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        return decompressStreamNative(j10, byteBuffer, i10, i11, byteBuffer2, i12, i13);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long freeDStream(long j10) {
        return freeDStreamNative(j10);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long initDStream(long j10) {
        return initDStreamNative(j10);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public int read(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return readInternal(byteBuffer, true);
        }
        throw new IllegalArgumentException("Target buffer should be a direct buffer");
    }
}
