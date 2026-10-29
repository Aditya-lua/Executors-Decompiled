package com.roblox.engine.jni;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams;
import com.roblox.engine.jni.autovalue.StartAppParams;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.ApplicationExitInfoCpp;
import com.roblox.engine.jni.model.BatteryStatus;
import com.roblox.engine.jni.model.ClientLocalFlags;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NativeGLInterface {
    public static native void enableVRVirtualInput(boolean z10);

    public static native String[] getActiveShaders();

    public static native String getIxpEnrolledExperiments();

    public static native String getRolloutFlagsInControl();

    public static native String getRolloutFlagsInVariant();

    public static native void initMaquettesSDK(Activity activity);

    public static native boolean isColdStartDeeplinkToGame();

    public static native boolean isVRVirtualInputFlagEnabled();

    public static native void nativeAppBridgeStartLuaAppDM();

    public static native void nativeAppBridgeV2DestroyApp();

    public static native void nativeAppBridgeV2InitWithParams(InitParams initParams);

    public static native void nativeAppBridgeV2LeaveGame();

    public static native void nativeAppBridgeV2OnLowMemory();

    public static native void nativeAppBridgeV2OnLowMemoryForRenderView(int i10, int i11);

    public static native void nativeAppBridgeV2PauseApp();

    public static native void nativeAppBridgeV2PauseGame();

    public static native void nativeAppBridgeV2ResumeGameWithPlatformParams(Surface surface, PlatformParams platformParams, Activity activity);

    public static native void nativeAppBridgeV2SendAppEventOnAppReady(String str, String str2, String str3, String str4);

    public static native void nativeAppBridgeV2SendAppEventOnGameLoaded(String str, String str2, String str3);

    public static native void nativeAppBridgeV2StartAppWithParams(StartAppParams startAppParams);

    public static native int nativeAppBridgeV2StartGameWithParam(StartGameParams startGameParams);

    public static native void nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(Surface surface, PlatformParams platformParams);

    public static native void nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(Surface surface, PlatformParams platformParams, Activity activity);

    public static native void nativeAppBridgeV2UserDidLogout();

    public static native void nativeBroadcastConnection(int i10, String str, String str2);

    public static native void nativeBroadcastEventWithNamespace(String str, String str2, String str3);

    public static native void nativeCallMessagesFromMainThread();

    public static native void nativeFetchLmkdProperties(String str);

    public static native void nativeGameGlobalInit();

    public static native NativeTextBoxInfo nativeGetTextBoxInfo();

    public static native void nativeHandleBackPressed();

    public static native void nativeImageSavedToAlbumFinished(String str, boolean z10, String str2);

    public static native void nativeInGamePurchaseFinished(boolean z10, long j10, String str);

    public static native void nativeInGamePurchaseFinishedV2(boolean z10, long j10, String str, String str2);

    public static native int nativeInitBenchmarkSettings(String str, String str2, String str3);

    public static native int nativeInitClientSettings(String str, String str2, String str3);

    public static native int nativeInitClientSettingsCached(String str, String str2, String str3, String str4, long j10);

    public static native int nativeInitClientSettingsCachedCompressed(byte[] bArr, String str, String str2, String str3, long j10, boolean z10);

    public static native int nativeInitClientSettingsSigned(String str, String str2, String str3, String str4);

    public static native void nativeMarketplacePurchaseFinished(boolean z10, String str, String str2);

    public static native void nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams oOAPPurchaseFinishedParams);

    public static native void nativeOnExperienceSessionPause();

    public static native void nativeOnExperienceSessionResume();

    public static native void nativeOnFragmentStart();

    public static native void nativeOnFragmentStop();

    public static native void nativePassCurrentDisplayRefreshRate(float f10);

    public static native void nativePassKeyEvent(boolean z10, int i10, int i11, boolean z11);

    public static native void nativePassSupportedRefreshRates(float[] fArr);

    public static native void nativePassText(long j10, String str, boolean z10, int i10);

    public static native void nativePostClientSettingsLoadedInitialization3(List<ApplicationExitInfoCpp> list);

    public static native void nativeReleaseAllRbxEventStreams();

    public static native void nativeReleaseFocus(long j10);

    public static native void nativeReportToDiagByCountryCode(String str, String str2, double d10);

    public static native void nativeReturnPressedFromOnScreenKeyboard(long j10);

    public static native void nativeScheduleOnFirstFrame(Runnable runnable);

    public static native void nativeSendExtendedAnalytics(byte[] bArr, int i10);

    public static native void nativeSendExtendedAnalyticsJoinData(String str);

    public static native void nativeSetAppPreviousExitReasons(List<ApplicationExitInfoCpp> list);

    public static native void nativeUpdateAdapterInit();

    public static native void nativeUpdateMobileHapticsState(boolean z10, String str);

    public static native boolean nativeUserGameSettingsGetReducedMotion();

    public static native ClientLocalFlags readLocalFlags();

    public static native void reportBatteryStateChanged(int i10, int i11);

    public static native void reportBatteryStatus(BatteryStatus batteryStatus);

    public static native void reportNetworkStateChanged(int i10);

    public static native void reportThermalStateChanged(int i10);

    public static native void screenTimeResume();

    public static native void screenTimeStart();

    public static native void screenTimeStartByGuac();

    public static native void screenTimeStop();

    public static native void setIrisJoinTimeEnabled();

    public static native void setMobileAdvertisingId(String str);

    public static native void setTaskSchedulerBackgroundMode(boolean z10, String str);

    public static native void setVRCameraCFrame(float f10, float f11, float f12);

    public static native void setVRWorldRayCFrameFromScreenPosition(int i10, float f10, float f11, int i11);

    public static native void setVirtualVRJoyStickPosition(float f10, float f11);

    public static native void setWebviewUserAgent(String str);

    public static native boolean shouldDisplayOpenGLUnsupportedMessage();

    public static native void syncTextboxTextAndCursorPosition2(String str, int i10);

    public static native void takeScreenshot();

    public static native void updateAppUISizes(int i10, int i11, int i12, int i13, int i14);

    public static native void updateKeyboardSize(boolean z10, int i10, int i11, int i12, int i13);
}
