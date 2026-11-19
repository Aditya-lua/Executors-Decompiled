package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
public class RequestHandlerContract {
    private final RequestHandler callback;
    private final String methodName;
    private final String protocolName;

    public RequestHandlerContract(String str, String str2, RequestHandler requestHandler) {
        this.protocolName = str;
        this.methodName = str2;
        this.callback = requestHandler;
    }

    public final RequestHandler getCallback() {
        return this.callback;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getProtocolName() {
        return this.protocolName;
    }
}
