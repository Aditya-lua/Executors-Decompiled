package com.roblox.engine.jni;

import com.roblox.engine.jni.model.ChannelRecord;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.NativeInitCrashpadParams;

/* JADX INFO: loaded from: classes2.dex */
public class NativeSettingsInterface {
    public static native boolean getInteractiveAssertsEnabled();

    public static native int getRunningArchitecture();

    public static native boolean nativeCPUSupportsNEON();

    public static native void nativeConfigureDevRpc(String str, String str2);

    public static native String nativeGetCookiesForDomain(String str);

    public static native String nativeGetCookiesInNetscapeFormat(String str);

    public static native String nativeGetCpuFamilyAndFeatures();

    public static native String nativeGetDevRpcConfiguration();

    public static native boolean nativeInitAppCrashpadReporter(NativeInitCrashpadParams nativeInitCrashpadParams);

    public static native boolean nativeInitCrashpad(NativeInitCrashpadParams nativeInitCrashpadParams);

    public static native void nativeInitFastLog();

    public static native boolean nativeIsDevRpcEnabled();

    public static native boolean nativeIsLuaLoginEnabled();

    public static native void nativeOverrideChannelPlatformName(String str);

    public static native void nativeOverrideChannelPlatformName2(String str);

    public static native ChannelRecord nativeParseRandomChannelSelection(String str);

    public static native int nativeRunCrashpadHandler(String[] strArr);

    public static native void nativeSetBaseDataDirectories(String str, String str2);

    public static native void nativeSetBaseUrl(String str, String str2);

    public static native void nativeSetCacheDirectory(String str);

    public static native void nativeSetDefaultAppPolicyFile(String str);

    public static native void nativeSetDeviceInfo(DeviceParams deviceParams);

    public static native void nativeSetExceptionReasonFilename(String str);

    public static native void nativeSetExternalDirectory(String str);

    public static native void nativeSetFilesDirectory(String str);

    public static native void nativeSetHttpClientProxy(String str, long j10);

    public static native void nativeSetMultipleCookies(String str, String str2);

    public static native void nativeSetPlatformHeadersWithIdfa(String str, String str2, String str3);

    public static native void nativeSetPreferencesFile(String str);

    public static native void nativeSetRobloxChannel(String str);

    public static native void nativeSetRobloxVersion(String str);

    public static native void nativeSetUserId(String str);
}
