package com.github.luben.zstd;

/* JADX INFO: loaded from: classes.dex */
public interface SequenceProducer {
    long createState();

    void freeState(long j10);

    long getFunctionPointer();
}
