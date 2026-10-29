package com.roblox.universalapp.call;

/* JADX INFO: loaded from: classes2.dex */
public class JNICallProtocol {
    public static native String getCallActionKey();

    public static native String getCallIdKey();

    public static native String getCalleeCombinedNameKey();

    public static native String getCalleeUserIdKey();

    public static native String getCallerCombinedNameKey();

    public static native String getCallerUserIdKey();

    public static native String getCreatedUtcKey();

    public static native String getGameInstanceIdKey();

    public static native String getHandleActiveCallId();

    public static native String getHandleAnswerCallId();

    public static native String getHandleConnectingCallId();

    public static native String getHandleEndCallId();

    public static native String getHandleReceiveCallId();

    public static native String getHandleRemovePendingReceivedCall();

    public static native String getIsCalleeMicEnabledKey();

    public static native String getIsDuplicateKey();

    public static native String getIsExpiredKey();

    public static native String getNotificationIdKey();

    public static native String getPlaceIdKey();

    public static native String getRejectCallId();

    public static native String getReservedServerAccessCodeKey();

    public static native String getSuppressCallId();

    public static native void receiveCall(String str);
}
