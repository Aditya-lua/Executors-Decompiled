package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends o0 implements u1 {
    public s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeLong(j10);
        t2(23, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        q0.c(parcelS2, bundle);
        t2(9, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeLong(j10);
        t2(24, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void generateEventId(x1 x1Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, x1Var);
        t2(22, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCachedAppInstanceId(x1 x1Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, x1Var);
        t2(19, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getConditionalUserProperties(String str, String str2, x1 x1Var) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        q0.d(parcelS2, x1Var);
        t2(10, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCurrentScreenClass(x1 x1Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, x1Var);
        t2(17, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCurrentScreenName(x1 x1Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, x1Var);
        t2(16, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getGmpAppId(x1 x1Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, x1Var);
        t2(21, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getMaxUserProperties(String str, x1 x1Var) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        q0.d(parcelS2, x1Var);
        t2(6, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getUserProperties(String str, String str2, boolean z10, x1 x1Var) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        ClassLoader classLoader = q0.f6744a;
        parcelS2.writeInt(z10 ? 1 : 0);
        q0.d(parcelS2, x1Var);
        t2(5, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void initialize(y9.a aVar, zzdd zzddVar, long j10) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, aVar);
        q0.c(parcelS2, zzddVar);
        parcelS2.writeLong(j10);
        t2(1, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        q0.c(parcelS2, bundle);
        parcelS2.writeInt(z10 ? 1 : 0);
        parcelS2.writeInt(z11 ? 1 : 0);
        parcelS2.writeLong(j10);
        t2(2, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void logHealthData(int i10, String str, y9.a aVar, y9.a aVar2, y9.a aVar3) {
        Parcel parcelS2 = s2();
        parcelS2.writeInt(5);
        parcelS2.writeString(str);
        q0.d(parcelS2, aVar);
        q0.d(parcelS2, aVar2);
        q0.d(parcelS2, aVar3);
        t2(33, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        q0.c(parcelS2, bundle);
        parcelS2.writeLong(j10);
        t2(53, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        parcelS2.writeLong(j10);
        t2(54, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        parcelS2.writeLong(j10);
        t2(55, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        parcelS2.writeLong(j10);
        t2(56, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, x1 x1Var, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        q0.d(parcelS2, x1Var);
        parcelS2.writeLong(j10);
        t2(57, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        parcelS2.writeLong(j10);
        t2(51, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        parcelS2.writeLong(j10);
        t2(52, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void performAction(Bundle bundle, x1 x1Var, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, bundle);
        q0.d(parcelS2, x1Var);
        parcelS2.writeLong(j10);
        t2(32, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void registerOnMeasurementEventListener(e2 e2Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, e2Var);
        t2(35, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void retrieveAndUploadBatches(a2 a2Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, a2Var);
        t2(58, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, bundle);
        parcelS2.writeLong(j10);
        t2(8, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, zzdfVar);
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        parcelS2.writeLong(j10);
        t2(50, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelS2 = s2();
        ClassLoader classLoader = q0.f6744a;
        parcelS2.writeInt(z10 ? 1 : 0);
        t2(39, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setEventInterceptor(e2 e2Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, e2Var);
        t2(34, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setUserProperty(String str, String str2, y9.a aVar, boolean z10, long j10) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        q0.d(parcelS2, aVar);
        parcelS2.writeInt(z10 ? 1 : 0);
        parcelS2.writeLong(j10);
        t2(4, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void unregisterOnMeasurementEventListener(e2 e2Var) {
        Parcel parcelS2 = s2();
        q0.d(parcelS2, e2Var);
        t2(36, parcelS2);
    }
}
