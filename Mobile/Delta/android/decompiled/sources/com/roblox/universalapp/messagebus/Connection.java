package com.roblox.universalapp.messagebus;

/* JADX INFO: loaded from: classes2.dex */
public class Connection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9803a;

    public Connection(long j10) {
        this.f9803a = j10;
    }

    private native void deleteSharedPtr(long j10);

    private native boolean isConnected(long j10);

    public void a() {
        deleteSharedPtr(this.f9803a);
    }

    public void finalize() {
        deleteSharedPtr(this.f9803a);
    }
}
