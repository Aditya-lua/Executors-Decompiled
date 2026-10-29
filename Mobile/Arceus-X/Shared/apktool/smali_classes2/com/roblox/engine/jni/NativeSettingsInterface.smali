.class public Lcom/roblox/engine/jni/NativeSettingsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native getInteractiveAssertsEnabled()Z
.end method

.method public static native getRunningArchitecture()I
.end method

.method public static native nativeCPUSupportsNEON()Z
.end method

.method public static native nativeConfigureDevRpc(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeGetCookiesForDomain(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeGetCookiesInNetscapeFormat(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeGetCpuFamilyAndFeatures()Ljava/lang/String;
.end method

.method public static native nativeGetDevRpcConfiguration()Ljava/lang/String;
.end method

.method public static native nativeInitAppCrashpadReporter(Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;)Z
.end method

.method public static native nativeInitCrashpad(Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;)Z
.end method

.method public static native nativeInitFastLog()V
.end method

.method public static native nativeIsDevRpcEnabled()Z
.end method

.method public static native nativeIsLuaLoginEnabled()Z
.end method

.method public static native nativeOverrideChannelPlatformName(Ljava/lang/String;)V
.end method

.method public static native nativeOverrideChannelPlatformName2(Ljava/lang/String;)V
.end method

.method public static native nativeParseRandomChannelSelection(Ljava/lang/String;)Lcom/roblox/engine/jni/model/ChannelRecord;
.end method

.method public static native nativeRunCrashpadHandler([Ljava/lang/String;)I
.end method

.method public static native nativeSetBaseDataDirectories(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeSetBaseUrl(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeSetCacheDirectory(Ljava/lang/String;)V
.end method

.method public static native nativeSetDefaultAppPolicyFile(Ljava/lang/String;)V
.end method

.method public static native nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V
.end method

.method public static native nativeSetExceptionReasonFilename(Ljava/lang/String;)V
.end method

.method public static native nativeSetExternalDirectory(Ljava/lang/String;)V
.end method

.method public static native nativeSetFilesDirectory(Ljava/lang/String;)V
.end method

.method public static native nativeSetHttpClientProxy(Ljava/lang/String;J)V
.end method

.method public static native nativeSetMultipleCookies(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeSetPlatformHeadersWithIdfa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeSetPreferencesFile(Ljava/lang/String;)V
.end method

.method public static native nativeSetRobloxChannel(Ljava/lang/String;)V
.end method

.method public static native nativeSetRobloxVersion(Ljava/lang/String;)V
.end method

.method public static native nativeSetUserId(Ljava/lang/String;)V
.end method
