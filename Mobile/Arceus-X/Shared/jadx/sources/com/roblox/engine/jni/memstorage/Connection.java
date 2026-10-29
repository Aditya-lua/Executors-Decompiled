package com.roblox.engine.jni.memstorage;

/* JADX INFO: loaded from: classes2.dex */
public class Connection {
    private long ref;

    public Connection(long j10) {
        this.ref = j10;
    }

    private static native void disconnect(Connection connection);

    private static native void releaseConnection(Connection connection);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void disconnect() {
        disconnect(this);
    }

    public void finalize() {
        releaseConnection(this);
    }
}
