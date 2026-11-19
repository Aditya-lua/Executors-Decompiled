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

    void initialize(z9.a aVar, h2 h2Var, long j10);

    void isDataCollectionEnabled(x1 x1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, x1 x1Var, long j10);

    void logHealthData(int i10, String str, z9.a aVar, z9.a aVar2, z9.a aVar3);

    void onActivityCreated(z9.a aVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(j2 j2Var, Bundle bundle, long j10);

    void onActivityDestroyed(z9.a aVar, long j10);

    void onActivityDestroyedByScionActivityInfo(j2 j2Var, long j10);

    void onActivityPaused(z9.a aVar, long j10);

    void onActivityPausedByScionActivityInfo(j2 j2Var, long j10);

    void onActivityResumed(z9.a aVar, long j10);

    void onActivityResumedByScionActivityInfo(j2 j2Var, long j10);

    void onActivitySaveInstanceState(z9.a aVar, x1 x1Var, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(j2 j2Var, x1 x1Var, long j10);

    void onActivityStarted(z9.a aVar, long j10);

    void onActivityStartedByScionActivityInfo(j2 j2Var, long j10);

    void onActivityStopped(z9.a aVar, long j10);

    void onActivityStoppedByScionActivityInfo(j2 j2Var, long j10);

    void performAction(Bundle bundle, x1 x1Var, long j10);

    void registerOnMeasurementEventListener(e2 e2Var);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(a2 a2Var);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(z9.a aVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(j2 j2Var, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(e2 e2Var);

    void setInstanceIdProvider(g2 g2Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, z9.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(e2 e2Var);
}
