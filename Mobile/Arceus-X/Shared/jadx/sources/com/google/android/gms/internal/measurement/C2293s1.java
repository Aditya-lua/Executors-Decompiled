package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2293s1 extends C2220o0 implements InterfaceC2329u1 {
    public C2293s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeLong(j10);
        m10475t2(23, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        C2256q0.m10549c(parcelM10474s2, bundle);
        m10475t2(9, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeLong(j10);
        m10475t2(24, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void generateEventId(InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(22, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void getCachedAppInstanceId(InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(19, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void getConditionalUserProperties(String str, String str2, InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(10, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void getCurrentScreenClass(InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(17, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void getCurrentScreenName(InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(16, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void getGmpAppId(InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(21, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void getMaxUserProperties(String str, InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(6, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC2383x1 interfaceC2383x1) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        ClassLoader classLoader = C2256q0.f8588a;
        parcelM10474s2.writeInt(z10 ? 1 : 0);
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        m10475t2(5, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void initialize(InterfaceC13133a interfaceC13133a, zzdd zzddVar, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC13133a);
        C2256q0.m10549c(parcelM10474s2, zzddVar);
        parcelM10474s2.writeLong(j10);
        m10475t2(1, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        C2256q0.m10549c(parcelM10474s2, bundle);
        parcelM10474s2.writeInt(z10 ? 1 : 0);
        parcelM10474s2.writeInt(z11 ? 1 : 0);
        parcelM10474s2.writeLong(j10);
        m10475t2(2, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void logHealthData(int i10, String str, InterfaceC13133a interfaceC13133a, InterfaceC13133a interfaceC13133a2, InterfaceC13133a interfaceC13133a3) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeInt(5);
        parcelM10474s2.writeString(str);
        C2256q0.m10550d(parcelM10474s2, interfaceC13133a);
        C2256q0.m10550d(parcelM10474s2, interfaceC13133a2);
        C2256q0.m10550d(parcelM10474s2, interfaceC13133a3);
        m10475t2(33, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        C2256q0.m10549c(parcelM10474s2, bundle);
        parcelM10474s2.writeLong(j10);
        m10475t2(53, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        parcelM10474s2.writeLong(j10);
        m10475t2(54, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        parcelM10474s2.writeLong(j10);
        m10475t2(55, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        parcelM10474s2.writeLong(j10);
        m10475t2(56, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, InterfaceC2383x1 interfaceC2383x1, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        parcelM10474s2.writeLong(j10);
        m10475t2(57, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        parcelM10474s2.writeLong(j10);
        m10475t2(51, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        parcelM10474s2.writeLong(j10);
        m10475t2(52, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void performAction(Bundle bundle, InterfaceC2383x1 interfaceC2383x1, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, bundle);
        C2256q0.m10550d(parcelM10474s2, interfaceC2383x1);
        parcelM10474s2.writeLong(j10);
        m10475t2(32, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void registerOnMeasurementEventListener(InterfaceC2039e2 interfaceC2039e2) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2039e2);
        m10475t2(35, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void retrieveAndUploadBatches(InterfaceC1963a2 interfaceC1963a2) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC1963a2);
        m10475t2(58, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, bundle);
        parcelM10474s2.writeLong(j10);
        m10475t2(8, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, zzdfVar);
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        parcelM10474s2.writeLong(j10);
        m10475t2(50, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelM10474s2 = m10474s2();
        ClassLoader classLoader = C2256q0.f8588a;
        parcelM10474s2.writeInt(z10 ? 1 : 0);
        m10475t2(39, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void setEventInterceptor(InterfaceC2039e2 interfaceC2039e2) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2039e2);
        m10475t2(34, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void setUserProperty(String str, String str2, InterfaceC13133a interfaceC13133a, boolean z10, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        C2256q0.m10550d(parcelM10474s2, interfaceC13133a);
        parcelM10474s2.writeInt(z10 ? 1 : 0);
        parcelM10474s2.writeLong(j10);
        m10475t2(4, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329u1
    public final void unregisterOnMeasurementEventListener(InterfaceC2039e2 interfaceC2039e2) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10550d(parcelM10474s2, interfaceC2039e2);
        m10475t2(36, parcelM10474s2);
    }
}
