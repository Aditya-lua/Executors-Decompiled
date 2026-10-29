.class public Lcom/roblox/universalapp/linking/JNILinkingProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static native getAttributionUrlKey()Ljava/lang/String;
.end method

.method public static native getDetectURLId()Ljava/lang/String;
.end method

.method public static native getEnableTrackingKey()Ljava/lang/String;
.end method

.method public static native getIsRegisteredKey()Ljava/lang/String;
.end method

.method public static native getIsTrackingAvailableId()Ljava/lang/String;
.end method

.method public static native getIsURLRegisteredId()Ljava/lang/String;
.end method

.method public static native getIsURLRegisteredRequestId()Ljava/lang/String;
.end method

.method public static native getIsURLRegisteredResponseId()Ljava/lang/String;
.end method

.method public static native getOpenURLId()Ljava/lang/String;
.end method

.method public static native getProtocolName()Ljava/lang/String;
.end method

.method public static native getSetTrackingEnabledId()Ljava/lang/String;
.end method

.method public static native getSetUIDId()Ljava/lang/String;
.end method

.method public static native getSuccessKey()Ljava/lang/String;
.end method

.method public static native getTrackingAvailableKey()Ljava/lang/String;
.end method

.method public static native getUIDKey()Ljava/lang/String;
.end method

.method public static native getUrlKey()Ljava/lang/String;
.end method

.method public static native nativeCreateAtIngress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeCreateAtIngressWithOrigin(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
.end method

.method public static native nativeCreateInternalDlic(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeDetectDlic(Ljava/lang/String;)V
.end method

.method public static native nativeDlicGetUrl(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeDlicSetTerminated(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static native nativeReportReceived(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeReportReceived(Ljava/lang/String;Ljava/lang/String;Z)V
.end method
