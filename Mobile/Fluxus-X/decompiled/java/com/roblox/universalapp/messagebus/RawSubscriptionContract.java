package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
public class RawSubscriptionContract {
    private final boolean callImmediatelyIfAvailable;
    private final NewRawCallback callback;
    private final boolean disconnectAfterReceive;
    private final String domain;
    private final String mid;

    public RawSubscriptionContract(String str, NewRawCallback newRawCallback, String str2, boolean z10, boolean z11) {
        this.mid = str;
        this.callback = newRawCallback;
        this.domain = str2;
        this.disconnectAfterReceive = z10;
        this.callImmediatelyIfAvailable = z11;
    }

    public final boolean getCallImmediatelyIfAvailable() {
        return this.callImmediatelyIfAvailable;
    }

    public final NewRawCallback getCallback() {
        return this.callback;
    }

    public final boolean getDisconnectAfterReceive() {
        return this.disconnectAfterReceive;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getMid() {
        return this.mid;
    }

    public RawSubscriptionContract(String str, NewRawCallback newRawCallback, String str2, boolean z10) {
        this.mid = str;
        this.callback = newRawCallback;
        this.domain = str2;
        this.disconnectAfterReceive = z10;
        this.callImmediatelyIfAvailable = true;
    }

    public RawSubscriptionContract(String str, NewRawCallback newRawCallback, String str2) {
        this.mid = str;
        this.callback = newRawCallback;
        this.domain = str2;
        this.disconnectAfterReceive = false;
        this.callImmediatelyIfAvailable = true;
    }

    public RawSubscriptionContract(String str, NewRawCallback newRawCallback) {
        this.mid = str;
        this.callback = newRawCallback;
        this.domain = null;
        this.disconnectAfterReceive = false;
        this.callImmediatelyIfAvailable = true;
    }
}
