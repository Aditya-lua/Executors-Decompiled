package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2329u1 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC2383x1 interfaceC2383x1);

    void getAppInstanceId(InterfaceC2383x1 interfaceC2383x1);

    void getCachedAppInstanceId(InterfaceC2383x1 interfaceC2383x1);

    void getConditionalUserProperties(String str, String str2, InterfaceC2383x1 interfaceC2383x1);

    void getCurrentScreenClass(InterfaceC2383x1 interfaceC2383x1);

    void getCurrentScreenName(InterfaceC2383x1 interfaceC2383x1);

    void getGmpAppId(InterfaceC2383x1 interfaceC2383x1);

    void getMaxUserProperties(String str, InterfaceC2383x1 interfaceC2383x1);

    void getSessionId(InterfaceC2383x1 interfaceC2383x1);

    void getTestFlag(InterfaceC2383x1 interfaceC2383x1, int i10);

    void getUserProperties(String str, String str2, boolean z10, InterfaceC2383x1 interfaceC2383x1);

    void initForTests(Map map);

    void initialize(InterfaceC13133a interfaceC13133a, zzdd zzddVar, long j10);

    void isDataCollectionEnabled(InterfaceC2383x1 interfaceC2383x1);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2383x1 interfaceC2383x1, long j10);

    void logHealthData(int i10, String str, InterfaceC13133a interfaceC13133a, InterfaceC13133a interfaceC13133a2, InterfaceC13133a interfaceC13133a3);

    void onActivityCreated(InterfaceC13133a interfaceC13133a, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10);

    void onActivityDestroyed(InterfaceC13133a interfaceC13133a, long j10);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityPaused(InterfaceC13133a interfaceC13133a, long j10);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityResumed(InterfaceC13133a interfaceC13133a, long j10);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivitySaveInstanceState(InterfaceC13133a interfaceC13133a, InterfaceC2383x1 interfaceC2383x1, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, InterfaceC2383x1 interfaceC2383x1, long j10);

    void onActivityStarted(InterfaceC13133a interfaceC13133a, long j10);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityStopped(InterfaceC13133a interfaceC13133a, long j10);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10);

    void performAction(Bundle bundle, InterfaceC2383x1 interfaceC2383x1, long j10);

    void registerOnMeasurementEventListener(InterfaceC2039e2 interfaceC2039e2);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(InterfaceC1963a2 interfaceC1963a2);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(InterfaceC13133a interfaceC13133a, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC2039e2 interfaceC2039e2);

    void setInstanceIdProvider(InterfaceC2077g2 interfaceC2077g2);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, InterfaceC13133a interfaceC13133a, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(InterfaceC2039e2 interfaceC2039e2);
}
