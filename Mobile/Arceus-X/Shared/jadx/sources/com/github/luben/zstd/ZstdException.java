package com.github.luben.zstd;

/* JADX INFO: loaded from: classes.dex */
public class ZstdException extends RuntimeException {
    private long code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZstdException(long j10) {
        this(Zstd.getErrorCode(j10), Zstd.getErrorName(j10));
    }

    public long getErrorCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ZstdException(long j10, String str) {
        super(str);
        this.code = j10;
    }
}
