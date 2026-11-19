package com.github.luben.zstd;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public class RecyclingBufferPool implements BufferPool {
    public static final BufferPool INSTANCE = new RecyclingBufferPool();
    private static final int buffSize = Math.max(Math.max((int) ZstdOutputStreamNoFinalizer.recommendedCOutSize(), (int) ZstdInputStreamNoFinalizer.recommendedDInSize()), (int) ZstdInputStreamNoFinalizer.recommendedDOutSize());
    private final ConcurrentLinkedQueue<SoftReference<ByteBuffer>> pool = new ConcurrentLinkedQueue<>();

    private RecyclingBufferPool() {
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i10) {
        ByteBuffer byteBuffer;
        int i11 = buffSize;
        if (i10 <= i11) {
            do {
                SoftReference<ByteBuffer> softReferencePoll = this.pool.poll();
                if (softReferencePoll == null) {
                    return ByteBuffer.allocate(buffSize);
                }
                byteBuffer = softReferencePoll.get();
            } while (byteBuffer == null);
            return byteBuffer;
        }
        throw new RuntimeException("Unsupported buffer size: " + i10 + ". Supported buffer sizes: " + i11 + " or smaller.");
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= buffSize) {
            byteBuffer.clear();
            this.pool.add(new SoftReference<>(byteBuffer));
        }
    }
}
