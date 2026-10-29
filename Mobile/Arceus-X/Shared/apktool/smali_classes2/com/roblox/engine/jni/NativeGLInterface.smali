.class public Lcom/roblox/engine/jni/NativeGLInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native enableVRVirtualInput(Z)V
.end method

.method public static native getActiveShaders()[Ljava/lang/String;
.end method

.method public static native getIxpEnrolledExperiments()Ljava/lang/String;
.end method

.method public static native getRolloutFlagsInControl()Ljava/lang/String;
.end method

.method public static native getRolloutFlagsInVariant()Ljava/lang/String;
.end method

.method public static native initMaquettesSDK(Landroid/app/Activity;)V
.end method

.method public static native isColdStartDeeplinkToGame()Z
.end method

.method public static native isVRVirtualInputFlagEnabled()Z
.end method

.method public static native nativeAppBridgeStartLuaAppDM()V
.end method

.method public static native nativeAppBridgeV2DestroyApp()V
.end method

.method public static native nativeAppBridgeV2InitWithParams(Lcom/roblox/engine/jni/autovalue/InitParams;)V
.end method

.method public static native nativeAppBridgeV2LeaveGame()V
.end method

.method public static native nativeAppBridgeV2OnLowMemory()V
.end method

.method public static native nativeAppBridgeV2OnLowMemoryForRenderView(II)V
.end method

.method public static native nativeAppBridgeV2PauseApp()V
.end method

.method public static native nativeAppBridgeV2PauseGame()V
.end method

.method public static native nativeAppBridgeV2ResumeGameWithPlatformParams(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Landroid/app/Activity;)V
.end method

.method public static native nativeAppBridgeV2SendAppEventOnAppReady(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeAppBridgeV2SendAppEventOnGameLoaded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeAppBridgeV2StartAppWithParams(Lcom/roblox/engine/jni/autovalue/StartAppParams;)V
.end method

.method public static native nativeAppBridgeV2StartGameWithParam(Lcom/roblox/engine/jni/autovalue/StartGameParams;)I
.end method

.method public static native nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;)V
.end method

.method public static native nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Landroid/app/Activity;)V
.end method

.method public static native nativeAppBridgeV2UserDidLogout()V
.end method

.method public static native nativeBroadcastConnection(ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeCallMessagesFromMainThread()V
.end method

.method public static native nativeFetchLmkdProperties(Ljava/lang/String;)V
.end method

.method public static native nativeGameGlobalInit()V
.end method

.method public static native nativeGetTextBoxInfo()Lcom/roblox/engine/jni/model/NativeTextBoxInfo;
.end method

.method public static native nativeHandleBackPressed()V
.end method

.method public static native nativeImageSavedToAlbumFinished(Ljava/lang/String;ZLjava/lang/String;)V
.end method

.method public static native nativeInGamePurchaseFinished(ZJLjava/lang/String;)V
.end method

.method public static native nativeInGamePurchaseFinishedV2(ZJLjava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeInitBenchmarkSettings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static native nativeInitClientSettings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static native nativeInitClientSettingsSigned(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static native nativeMarketplacePurchaseFinished(ZLjava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeOOAPPurchaseFinished(Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;)V
.end method

.method public static native nativeOnExperienceSessionPause()V
.end method

.method public static native nativeOnExperienceSessionResume()V
.end method

.method public static native nativeOnFragmentStart()V
.end method

.method public static native nativeOnFragmentStop()V
.end method

.method public static native nativePassCurrentDisplayRefreshRate(F)V
.end method

.method public static native nativePassKeyEvent(ZIIZ)V
.end method

.method public static native nativePassSupportedRefreshRates([F)V
.end method

.method public static native nativePassText(JLjava/lang/String;ZI)V
.end method

.method public static native nativePostClientSettingsLoadedInitialization3(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;",
            ">;)V"
        }
    .end annotation
.end method

.method public static native nativeReleaseAllRbxEventStreams()V
.end method

.method public static native nativeReleaseFocus(J)V
.end method

.method public static native nativeReportToDiagByCountryCode(Ljava/lang/String;Ljava/lang/String;D)V
.end method

.method public static native nativeReturnPressedFromOnScreenKeyboard(J)V
.end method

.method public static native nativeScheduleOnFirstFrame(Ljava/lang/Runnable;)V
.end method

.method public static native nativeSendExtendedAnalytics([BI)V
.end method

.method public static native nativeSendExtendedAnalyticsJoinData(Ljava/lang/String;)V
.end method

.method public static native nativeSetAppPreviousExitReasons(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;",
            ">;)V"
        }
    .end annotation
.end method

.method public static native nativeUpdateAdapterInit()V
.end method

.method public static native nativeUpdateMobileHapticsState(ZLjava/lang/String;)V
.end method

.method public static native nativeUserGameSettingsGetReducedMotion()Z
.end method

.method public static native readLocalFlags()Lcom/roblox/engine/jni/model/ClientLocalFlags;
.end method

.method public static native reportBatteryStateChanged(II)V
.end method

.method public static native reportBatteryStatus(Lcom/roblox/engine/jni/model/BatteryStatus;)V
.end method

.method public static native reportNetworkStateChanged(I)V
.end method

.method public static native reportThermalStateChanged(I)V
.end method

.method public static native screenTimeResume()V
.end method

.method public static native screenTimeStart()V
.end method

.method public static native screenTimeStartByGuac()V
.end method

.method public static native screenTimeStop()V
.end method

.method public static native setIrisJoinTimeEnabled()V
.end method

.method public static native setMobileAdvertisingId(Ljava/lang/String;)V
.end method

.method public static native setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V
.end method

.method public static native setVRCameraCFrame(FFF)V
.end method

.method public static native setVRWorldRayCFrameFromScreenPosition(IFFI)V
.end method

.method public static native setVirtualVRJoyStickPosition(FF)V
.end method

.method public static native setWebviewUserAgent(Ljava/lang/String;)V
.end method

.method public static native shouldDisplayOpenGLUnsupportedMessage()Z
.end method

.method public static native syncTextboxTextAndCursorPosition2(Ljava/lang/String;I)V
.end method

.method public static native takeScreenshot()V
.end method

.method public static native updateAppUISizes(IIIII)V
.end method

.method public static native updateKeyboardSize(ZIIII)V
.end method
