package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
class RawRequestHandlerContract {
    private final RequestHandlerRaw callback;
    private final String methodName;
    private final String protocolName;

    public RawRequestHandlerContract(String str, String str2, RequestHandlerRaw requestHandlerRaw) {
        this.protocolName = str;
        this.methodName = str2;
        this.callback = requestHandlerRaw;
    }

    public final RequestHandlerRaw getCallback() {
        return this.callback;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getProtocolName() {
        return this.protocolName;
    }
}
