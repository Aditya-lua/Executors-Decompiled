package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalErrorException extends RuntimeException {

    @NotNull
    private final InternalErrorInfo errorInfo;

    public InternalErrorException(@NotNull InternalErrorInfo internalErrorInfo) {
        this.errorInfo = internalErrorInfo;
    }

    @NotNull
    public final InternalErrorInfo getErrorInfo() {
        return this.errorInfo;
    }
}
