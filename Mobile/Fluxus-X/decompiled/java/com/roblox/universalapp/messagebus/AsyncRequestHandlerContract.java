package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncRequestHandlerContract {
    private final RequestHandlerAsync callback;
    private final String methodName;
    private final String protocolName;

    public AsyncRequestHandlerContract(String str, String str2, RequestHandlerAsync requestHandlerAsync) {
        this.protocolName = str;
        this.methodName = str2;
        this.callback = requestHandlerAsync;
    }

    public final RequestHandlerAsync getCallback() {
        return this.callback;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getProtocolName() {
        return this.protocolName;
    }
}
