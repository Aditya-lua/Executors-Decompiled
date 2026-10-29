package com.github.luben.zstd;

/* JADX INFO: loaded from: classes.dex */
public class ZstdFrameProgression {
    private long consumed;
    private int currentJobID;
    private long flushed;
    private long ingested;
    private int nbActiveWorkers;
    private long produced;

    public ZstdFrameProgression(long j10, long j11, long j12, long j13, int i10, int i11) {
        this.ingested = j10;
        this.consumed = j11;
        this.produced = j12;
        this.flushed = j13;
        this.currentJobID = i10;
        this.nbActiveWorkers = i11;
    }

    public long getConsumed() {
        return this.consumed;
    }

    public int getCurrentJobID() {
        return this.currentJobID;
    }

    public long getFlushed() {
        return this.flushed;
    }

    public long getIngested() {
        return this.ingested;
    }

    public int getNbActiveWorkers() {
        return this.nbActiveWorkers;
    }

    public long getProduced() {
        return this.produced;
    }
}
