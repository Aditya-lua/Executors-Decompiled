package com.roblox.universalapp.logging;

import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;

/* JADX INFO: loaded from: classes2.dex */
public class JNILoggingProtocol {
    /* JADX INFO: renamed from: a */
    public static void m15990a(String str, long j10, Object... objArr) {
        nativeLogEvent(str, j10, objArr);
    }

    public static native long nativeGetTimestamp();

    private static native void nativeLogEvent(String str, long j10, Object[] objArr);

    public static native void nativeLogRobloxTelemetryEvent(RobloxTelemetryEvent robloxTelemetryEvent);
}
