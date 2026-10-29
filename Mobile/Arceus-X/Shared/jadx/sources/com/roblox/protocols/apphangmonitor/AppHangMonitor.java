package com.roblox.protocols.apphangmonitor;

/* JADX INFO: loaded from: classes2.dex */
public class AppHangMonitor {

    /* JADX INFO: renamed from: a */
    public long f12628a = createAppHangMonitor();

    private native long createAppHangMonitor();

    private native void nativePause(long j10);

    private native void nativeResume(long j10);

    private native void nativeStartMonitoring(long j10);

    /* JADX INFO: renamed from: a */
    public void m15845a() {
        long j10 = this.f12628a;
        if (j10 != 0) {
            nativePause(j10);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15846b() {
        long j10 = this.f12628a;
        if (j10 != 0) {
            nativeResume(j10);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15847c() {
        long j10 = this.f12628a;
        if (j10 != 0) {
            nativeStartMonitoring(j10);
        }
    }
}
