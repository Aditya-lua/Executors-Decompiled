package com.roblox.engine.jni;

/* JADX INFO: loaded from: classes2.dex */
public class NativeAppBridgeInterface {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m15789a(String str, String str2, boolean z10, String str3, String str4) {
        nativeAppBridgeAppStart(str, str2, z10, str3, str4, "");
    }

    public static native void nativeAppBridgeAppStart(String str, String str2, boolean z10, String str3, String str4, String str5);

    public static native void setEnableConnectivityV2ForAndroid(boolean z10);

    public static native void setFastFollowedCJKPath(String str);

    public static native void setIsFirstInstall(boolean z10);
}
