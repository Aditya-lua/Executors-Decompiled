package com.roblox.protocols.apphangmonitor;

/* JADX INFO: loaded from: classes2.dex */
public class AppHangMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9685a = createAppHangMonitor();

    private native long createAppHangMonitor();

    private native void nativePause(long j10);

    private native void nativeResume(long j10);

    private native void nativeStartMonitoring(long j10);

    public void a() {
        long j10 = this.f9685a;
        if (j10 != 0) {
            nativePause(j10);
        }
    }

    public void b() {
        long j10 = this.f9685a;
        if (j10 != 0) {
            nativeResume(j10);
        }
    }

    public void c() {
        long j10 = this.f9685a;
        if (j10 != 0) {
            nativeStartMonitoring(j10);
        }
    }
}
