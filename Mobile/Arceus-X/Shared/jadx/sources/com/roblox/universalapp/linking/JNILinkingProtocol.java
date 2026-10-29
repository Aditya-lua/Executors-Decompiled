package com.roblox.universalapp.linking;

/* JADX INFO: loaded from: classes2.dex */
public class JNILinkingProtocol {
    public static native String getAttributionUrlKey();

    public static native String getDetectURLId();

    public static native String getEnableTrackingKey();

    public static native String getIsRegisteredKey();

    public static native String getIsTrackingAvailableId();

    public static native String getIsURLRegisteredId();

    public static native String getIsURLRegisteredRequestId();

    public static native String getIsURLRegisteredResponseId();

    public static native String getOpenURLId();

    public static native String getProtocolName();

    public static native String getSetTrackingEnabledId();

    public static native String getSetUIDId();

    public static native String getSuccessKey();

    public static native String getTrackingAvailableKey();

    public static native String getUIDKey();

    public static native String getUrlKey();

    public static native String nativeCreateAtIngress(String str, String str2);

    public static native String nativeCreateAtIngressWithOrigin(String str, String str2, boolean z10);

    public static native String nativeCreateInternalDlic(String str, String str2);

    public static native void nativeDetectDlic(String str);

    public static native String nativeDlicGetUrl(String str);

    public static native boolean nativeDlicSetTerminated(String str, String str2, String str3, String str4);

    public static native void nativeReportReceived(String str, String str2);

    public static native void nativeReportReceived(String str, String str2, boolean z10);
}
