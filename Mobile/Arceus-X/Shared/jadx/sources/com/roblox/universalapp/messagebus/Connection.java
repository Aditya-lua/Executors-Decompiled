package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
public class Connection {

    /* JADX INFO: renamed from: a */
    public long f12766a;

    public Connection(long j10) {
        this.f12766a = j10;
    }

    private native void deleteSharedPtr(long j10);

    private native boolean isConnected(long j10);

    /* JADX INFO: renamed from: a */
    public void m16010a() {
        deleteSharedPtr(this.f12766a);
    }

    public void finalize() {
        deleteSharedPtr(this.f12766a);
    }
}
