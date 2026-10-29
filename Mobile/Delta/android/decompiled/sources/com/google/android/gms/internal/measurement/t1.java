package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 extends p0 implements u1 {
    public t1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static u1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new s1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        x1 v1Var = null;
        a2 y1Var = null;
        x1 v1Var2 = null;
        x1 v1Var3 = null;
        x1 v1Var4 = null;
        x1 v1Var5 = null;
        e2 b2Var = null;
        e2 b2Var2 = null;
        e2 b2Var3 = null;
        x1 v1Var6 = null;
        x1 v1Var7 = null;
        x1 v1Var8 = null;
        x1 v1Var9 = null;
        x1 v1Var10 = null;
        x1 v1Var11 = null;
        g2 f2Var = null;
        x1 v1Var12 = null;
        x1 v1Var13 = null;
        x1 v1Var14 = null;
        x1 v1Var15 = null;
        x1 v1Var16 = null;
        switch (i10) {
            case 1:
                y9.a aVarS2 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) q0.b(parcel, zzdd.CREATOR);
                long j10 = parcel.readLong();
                q0.f(parcel);
                initialize(aVarS2, zzddVar, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) q0.b(parcel, Bundle.CREATOR);
                boolean zA = q0.a(parcel);
                boolean zA2 = q0.a(parcel);
                long j11 = parcel.readLong();
                q0.f(parcel);
                logEvent(string, string2, bundle, zA, zA2, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var = iInterfaceQueryLocalInterface instanceof x1 ? (x1) iInterfaceQueryLocalInterface : new v1(strongBinder);
                }
                long j12 = parcel.readLong();
                q0.f(parcel);
                logEventAndBundle(string3, string4, bundle2, v1Var, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                y9.a aVarS3 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                boolean zA3 = q0.a(parcel);
                long j13 = parcel.readLong();
                q0.f(parcel);
                setUserProperty(string5, string6, aVarS3, zA3, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA4 = q0.a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var16 = iInterfaceQueryLocalInterface2 instanceof x1 ? (x1) iInterfaceQueryLocalInterface2 : new v1(strongBinder2);
                }
                q0.f(parcel);
                getUserProperties(string7, string8, zA4, v1Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var15 = iInterfaceQueryLocalInterface3 instanceof x1 ? (x1) iInterfaceQueryLocalInterface3 : new v1(strongBinder3);
                }
                q0.f(parcel);
                getMaxUserProperties(string9, v1Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                q0.f(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                q0.f(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                q0.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var14 = iInterfaceQueryLocalInterface4 instanceof x1 ? (x1) iInterfaceQueryLocalInterface4 : new v1(strongBinder4);
                }
                q0.f(parcel);
                getConditionalUserProperties(string13, string14, v1Var14);
                break;
            case 11:
                boolean zA5 = q0.a(parcel);
                long j16 = parcel.readLong();
                q0.f(parcel);
                setMeasurementEnabled(zA5, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                q0.f(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                q0.f(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                q0.f(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                y9.a aVarS4 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                q0.f(parcel);
                setCurrentScreen(aVarS4, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var13 = iInterfaceQueryLocalInterface5 instanceof x1 ? (x1) iInterfaceQueryLocalInterface5 : new v1(strongBinder5);
                }
                q0.f(parcel);
                getCurrentScreenName(v1Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var12 = iInterfaceQueryLocalInterface6 instanceof x1 ? (x1) iInterfaceQueryLocalInterface6 : new v1(strongBinder6);
                }
                q0.f(parcel);
                getCurrentScreenClass(v1Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    f2Var = iInterfaceQueryLocalInterface7 instanceof g2 ? (g2) iInterfaceQueryLocalInterface7 : new f2(strongBinder7);
                }
                q0.f(parcel);
                setInstanceIdProvider(f2Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var11 = iInterfaceQueryLocalInterface8 instanceof x1 ? (x1) iInterfaceQueryLocalInterface8 : new v1(strongBinder8);
                }
                q0.f(parcel);
                getCachedAppInstanceId(v1Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var10 = iInterfaceQueryLocalInterface9 instanceof x1 ? (x1) iInterfaceQueryLocalInterface9 : new v1(strongBinder9);
                }
                q0.f(parcel);
                getAppInstanceId(v1Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var9 = iInterfaceQueryLocalInterface10 instanceof x1 ? (x1) iInterfaceQueryLocalInterface10 : new v1(strongBinder10);
                }
                q0.f(parcel);
                getGmpAppId(v1Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var8 = iInterfaceQueryLocalInterface11 instanceof x1 ? (x1) iInterfaceQueryLocalInterface11 : new v1(strongBinder11);
                }
                q0.f(parcel);
                generateEventId(v1Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                q0.f(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                q0.f(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                y9.a aVarS5 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                q0.f(parcel);
                onActivityStarted(aVarS5, j23);
                break;
            case 26:
                y9.a aVarS6 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                q0.f(parcel);
                onActivityStopped(aVarS6, j24);
                break;
            case 27:
                y9.a aVarS7 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                q0.f(parcel);
                onActivityCreated(aVarS7, bundle5, j25);
                break;
            case 28:
                y9.a aVarS8 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                q0.f(parcel);
                onActivityDestroyed(aVarS8, j26);
                break;
            case 29:
                y9.a aVarS9 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                q0.f(parcel);
                onActivityPaused(aVarS9, j27);
                break;
            case 30:
                y9.a aVarS10 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                q0.f(parcel);
                onActivityResumed(aVarS10, j28);
                break;
            case 31:
                y9.a aVarS11 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var7 = iInterfaceQueryLocalInterface12 instanceof x1 ? (x1) iInterfaceQueryLocalInterface12 : new v1(strongBinder12);
                }
                long j29 = parcel.readLong();
                q0.f(parcel);
                onActivitySaveInstanceState(aVarS11, v1Var7, j29);
                break;
            case 32:
                Bundle bundle6 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var6 = iInterfaceQueryLocalInterface13 instanceof x1 ? (x1) iInterfaceQueryLocalInterface13 : new v1(strongBinder13);
                }
                long j30 = parcel.readLong();
                q0.f(parcel);
                performAction(bundle6, v1Var6, j30);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                y9.a aVarS12 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                y9.a aVarS13 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                y9.a aVarS14 = y9.a.AbstractBinderC0656a.s2(parcel.readStrongBinder());
                q0.f(parcel);
                logHealthData(i12, string19, aVarS12, aVarS13, aVarS14);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b2Var3 = iInterfaceQueryLocalInterface14 instanceof e2 ? (e2) iInterfaceQueryLocalInterface14 : new b2(strongBinder14);
                }
                q0.f(parcel);
                setEventInterceptor(b2Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b2Var2 = iInterfaceQueryLocalInterface15 instanceof e2 ? (e2) iInterfaceQueryLocalInterface15 : new b2(strongBinder15);
                }
                q0.f(parcel);
                registerOnMeasurementEventListener(b2Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b2Var = iInterfaceQueryLocalInterface16 instanceof e2 ? (e2) iInterfaceQueryLocalInterface16 : new b2(strongBinder16);
                }
                q0.f(parcel);
                unregisterOnMeasurementEventListener(b2Var);
                break;
            case 37:
                HashMap mapE = q0.e(parcel);
                q0.f(parcel);
                initForTests(mapE);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var5 = iInterfaceQueryLocalInterface17 instanceof x1 ? (x1) iInterfaceQueryLocalInterface17 : new v1(strongBinder17);
                }
                int i13 = parcel.readInt();
                q0.f(parcel);
                getTestFlag(v1Var5, i13);
                break;
            case 39:
                boolean zA6 = q0.a(parcel);
                q0.f(parcel);
                setDataCollectionEnabled(zA6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var4 = iInterfaceQueryLocalInterface18 instanceof x1 ? (x1) iInterfaceQueryLocalInterface18 : new v1(strongBinder18);
                }
                q0.f(parcel);
                isDataCollectionEnabled(v1Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                q0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j31 = parcel.readLong();
                q0.f(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                q0.f(parcel);
                setConsent(bundle8, j32);
                break;
            case 45:
                Bundle bundle9 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                q0.f(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var3 = iInterfaceQueryLocalInterface19 instanceof x1 ? (x1) iInterfaceQueryLocalInterface19 : new v1(strongBinder19);
                }
                q0.f(parcel);
                getSessionId(v1Var3);
                break;
            case 48:
                Intent intent = (Intent) q0.b(parcel, Intent.CREATOR);
                q0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdf zzdfVar = (zzdf) q0.b(parcel, zzdf.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j34 = parcel.readLong();
                q0.f(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, string20, string21, j34);
                break;
            case 51:
                zzdf zzdfVar2 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long j35 = parcel.readLong();
                q0.f(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, j35);
                break;
            case 52:
                zzdf zzdfVar3 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long j36 = parcel.readLong();
                q0.f(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, j36);
                break;
            case 53:
                zzdf zzdfVar4 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                Bundle bundle10 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long j37 = parcel.readLong();
                q0.f(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, j37);
                break;
            case 54:
                zzdf zzdfVar5 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long j38 = parcel.readLong();
                q0.f(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, j38);
                break;
            case 55:
                zzdf zzdfVar6 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long j39 = parcel.readLong();
                q0.f(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, j39);
                break;
            case 56:
                zzdf zzdfVar7 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long j40 = parcel.readLong();
                q0.f(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, j40);
                break;
            case 57:
                zzdf zzdfVar8 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v1Var2 = iInterfaceQueryLocalInterface20 instanceof x1 ? (x1) iInterfaceQueryLocalInterface20 : new v1(strongBinder20);
                }
                long j41 = parcel.readLong();
                q0.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, v1Var2, j41);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    y1Var = iInterfaceQueryLocalInterface21 instanceof a2 ? (a2) iInterfaceQueryLocalInterface21 : new y1(strongBinder21);
                }
                q0.f(parcel);
                retrieveAndUploadBatches(y1Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
