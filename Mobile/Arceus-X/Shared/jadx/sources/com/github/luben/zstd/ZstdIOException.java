package com.github.luben.zstd;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ZstdIOException extends IOException {
    private long code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZstdIOException(long j10) {
        this(Zstd.getErrorCode(j10), Zstd.getErrorName(j10));
    }

    public long getErrorCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ZstdIOException(long j10, String str) {
        super(str);
        this.code = j10;
    }
}
