package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface BufferPool {
    ByteBuffer get(int i10);

    void release(ByteBuffer byteBuffer);
}
