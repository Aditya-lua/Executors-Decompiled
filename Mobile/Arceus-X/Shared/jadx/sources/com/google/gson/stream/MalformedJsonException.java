package com.google.gson.stream;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class MalformedJsonException extends IOException {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MalformedJsonException(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MalformedJsonException(String str, Throwable th2) {
        super(str, th2);
    }

    public MalformedJsonException(Throwable th2) {
        super(th2);
    }
}
