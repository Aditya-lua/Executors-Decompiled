package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
class MakeRequestContractRaw {
    private final NewRawCallback callback;
    private final String methodName;
    private final String params;
    private final String protocolName;

    public MakeRequestContractRaw(String str, String str2, String str3, NewRawCallback newRawCallback) {
        this.protocolName = str;
        this.methodName = str2;
        this.callback = newRawCallback;
        this.params = str3;
    }

    public final NewRawCallback getCallback() {
        return this.callback;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getProtocolName() {
        return this.protocolName;
    }
}
