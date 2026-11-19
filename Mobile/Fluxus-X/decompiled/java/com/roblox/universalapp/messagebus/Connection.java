package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
public class Connection {
    private long ref;

    public Connection(long j10) {
        this.ref = j10;
    }

    private native void deleteSharedPtr(long j10);

    private native boolean isConnected(long j10);

    public boolean connected() {
        return isConnected(this.ref);
    }

    public void disconnect() {
        deleteSharedPtr(this.ref);
    }

    public void finalize() {
        deleteSharedPtr(this.ref);
    }
}
