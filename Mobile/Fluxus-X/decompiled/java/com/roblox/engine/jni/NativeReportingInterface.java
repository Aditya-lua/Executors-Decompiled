package com.roblox.engine.jni;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class NativeReportingInterface {
    public static native void applicationBackgrounded();

    public static native void applicationForegrounded();

    public static native void flushEngineTelemetryV1Events();

    public static native void flushEngineTelemetryV2Events();

    public static native void gameBackgrounded();

    public static native void gameForegrounded();

    public static native HashMap<String, String> getPushNotificationSessionInfo(String str);

    public static native void initAppShellReporter();

    public static native void pushNotificationInteracted(String str, String str2, Object obj);

    public static native void pushNotificationReceived(String str, String str2, Object obj);

    public static native void setAppSuspended(boolean z10);

    public static native void stopPushNotificationSession();
}
