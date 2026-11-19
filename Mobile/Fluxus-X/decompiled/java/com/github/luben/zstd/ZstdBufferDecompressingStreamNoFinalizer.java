package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ZstdBufferDecompressingStreamNoFinalizer extends BaseZstdBufferDecompressingStreamNoFinalizer {
    static {
        Native.load();
    }

    public ZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
        }
        long jCreateDStream = createDStream();
        this.stream = jCreateDStream;
        initDStream(jCreateDStream);
    }

    private native long createDStreamNative();

    private native long decompressStreamNative(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private native long freeDStreamNative(long j10);

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
        if (!byteBuffer2.hasArray()) {
            throw new IllegalArgumentException("provided source ByteBuffer lacks array");
        }
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("provided destination ByteBuffer lacks array");
        }
        return decompressStreamNative(j10, byteBuffer.array(), i10 + byteBuffer.arrayOffset(), i11, byteBuffer2.array(), i12 + byteBuffer2.arrayOffset(), i13);
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
            throw new IllegalArgumentException("Target buffer should be a non-direct buffer");
        }
        return readInternal(byteBuffer, false);
    }
}
