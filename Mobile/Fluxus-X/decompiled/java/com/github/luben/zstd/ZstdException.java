package com.github.luben.zstd;

/* JADX INFO: loaded from: classes.dex */
public class ZstdException extends RuntimeException {
    private long code;

    public ZstdException(long j10) {
        this(Zstd.getErrorCode(j10), Zstd.getErrorName(j10));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdException(long j10, String str) {
        super(str);
        this.code = j10;
    }
}
