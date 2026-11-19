package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncRequestHandlerRawContract {
    private final RequestHandlerAsyncRaw callback;
    private final String methodName;
    private final String protocolName;

    public AsyncRequestHandlerRawContract(String str, String str2, RequestHandlerAsyncRaw requestHandlerAsyncRaw) {
        this.protocolName = str;
        this.methodName = str2;
        this.callback = requestHandlerAsyncRaw;
    }

    public final RequestHandlerAsyncRaw getCallback() {
        return this.callback;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getProtocolName() {
        return this.protocolName;
    }
}
