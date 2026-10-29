package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface u1 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(x1 x1Var);

    void getAppInstanceId(x1 x1Var);

    void getCachedAppInstanceId(x1 x1Var);

    void getConditionalUserProperties(String str, String str2, x1 x1Var);

    void getCurrentScreenClass(x1 x1Var);

    void getCurrentScreenName(x1 x1Var);

    void getGmpAppId(x1 x1Var);

    void getMaxUserProperties(String str, x1 x1Var);

    void getSessionId(x1 x1Var);

    void getTestFlag(x1 x1Var, int i10);

    void getUserProperties(String str, String str2, boolean z10, x1 x1Var);

    void initForTests(Map map);

    void initialize(y9.a aVar, zzdd zzddVar, long j10);

    void isDataCollectionEnabled(x1 x1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, x1 x1Var, long j10);

    void logHealthData(int i10, String str, y9.a aVar, y9.a aVar2, y9.a aVar3);

    void onActivityCreated(y9.a aVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10);

    void onActivityDestroyed(y9.a aVar, long j10);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityPaused(y9.a aVar, long j10);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityResumed(y9.a aVar, long j10);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivitySaveInstanceState(y9.a aVar, x1 x1Var, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, x1 x1Var, long j10);

    void onActivityStarted(y9.a aVar, long j10);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityStopped(y9.a aVar, long j10);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10);

    void performAction(Bundle bundle, x1 x1Var, long j10);

    void registerOnMeasurementEventListener(e2 e2Var);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(a2 a2Var);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(y9.a aVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(e2 e2Var);

    void setInstanceIdProvider(g2 g2Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, y9.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(e2 e2Var);
}
