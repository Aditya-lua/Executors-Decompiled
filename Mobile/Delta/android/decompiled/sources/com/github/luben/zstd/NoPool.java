package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class NoPool implements BufferPool {
    public static final BufferPool INSTANCE = new NoPool();

    private NoPool() {
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i10) {
        return ByteBuffer.allocate(i10);
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
    }
}
