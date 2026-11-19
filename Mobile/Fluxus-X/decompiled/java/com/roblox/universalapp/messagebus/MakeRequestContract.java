package com.roblox.universalapp.messagebus;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MakeRequestContract {
    private final NewCallback callback;
    private final String methodName;
    private final JSONObject params;
    private final String protocolName;

    public MakeRequestContract(String str, String str2, JSONObject jSONObject, NewCallback newCallback) {
        this.protocolName = str;
        this.methodName = str2;
        this.callback = newCallback;
        this.params = jSONObject;
    }

    public final NewCallback getCallback() {
        return this.callback;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final JSONObject getParams() {
        return this.params;
    }

    public final String getProtocolName() {
        return this.protocolName;
    }
}
