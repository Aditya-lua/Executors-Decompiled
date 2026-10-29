package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2311t1 extends BinderC2238p0 implements InterfaceC2329u1 {
    public AbstractBinderC2311t1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC2329u1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2329u1 ? (InterfaceC2329u1) iInterfaceQueryLocalInterface : new C2293s1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2238p0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo9842r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2383x1 c2347v1 = null;
        InterfaceC1963a2 c2401y1 = null;
        InterfaceC2383x1 c2347v2 = null;
        InterfaceC2383x1 c2347v3 = null;
        InterfaceC2383x1 c2347v4 = null;
        InterfaceC2383x1 c2347v5 = null;
        InterfaceC2039e2 c1982b2 = null;
        InterfaceC2039e2 c1982b3 = null;
        InterfaceC2039e2 c1982b4 = null;
        InterfaceC2383x1 c2347v6 = null;
        InterfaceC2383x1 c2347v7 = null;
        InterfaceC2383x1 c2347v8 = null;
        InterfaceC2383x1 c2347v9 = null;
        InterfaceC2383x1 c2347v10 = null;
        InterfaceC2383x1 c2347v11 = null;
        InterfaceC2077g2 c2058f2 = null;
        InterfaceC2383x1 c2347v12 = null;
        InterfaceC2383x1 c2347v13 = null;
        InterfaceC2383x1 c2347v14 = null;
        InterfaceC2383x1 c2347v15 = null;
        InterfaceC2383x1 c2347v16 = null;
        switch (i10) {
            case 1:
                InterfaceC13133a interfaceC13133aM48741s2 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) C2256q0.m10548b(parcel, zzdd.CREATOR);
                long j10 = parcel.readLong();
                C2256q0.m10552f(parcel);
                initialize(interfaceC13133aM48741s2, zzddVar, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                boolean zM10547a = C2256q0.m10547a(parcel);
                boolean zM10547a2 = C2256q0.m10547a(parcel);
                long j11 = parcel.readLong();
                C2256q0.m10552f(parcel);
                logEvent(string, string2, bundle, zM10547a, zM10547a2, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v1 = iInterfaceQueryLocalInterface instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface : new C2347v1(strongBinder);
                }
                long j12 = parcel.readLong();
                C2256q0.m10552f(parcel);
                logEventAndBundle(string3, string4, bundle2, c2347v1, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC13133a interfaceC13133aM48741s3 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                boolean zM10547a3 = C2256q0.m10547a(parcel);
                long j13 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setUserProperty(string5, string6, interfaceC13133aM48741s3, zM10547a3, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zM10547a4 = C2256q0.m10547a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v16 = iInterfaceQueryLocalInterface2 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface2 : new C2347v1(strongBinder2);
                }
                C2256q0.m10552f(parcel);
                getUserProperties(string7, string8, zM10547a4, c2347v16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v15 = iInterfaceQueryLocalInterface3 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface3 : new C2347v1(strongBinder3);
                }
                C2256q0.m10552f(parcel);
                getMaxUserProperties(string9, c2347v15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                C2256q0.m10552f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v14 = iInterfaceQueryLocalInterface4 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface4 : new C2347v1(strongBinder4);
                }
                C2256q0.m10552f(parcel);
                getConditionalUserProperties(string13, string14, c2347v14);
                break;
            case 11:
                boolean zM10547a5 = C2256q0.m10547a(parcel);
                long j16 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setMeasurementEnabled(zM10547a5, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                C2256q0.m10552f(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                InterfaceC13133a interfaceC13133aM48741s4 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setCurrentScreen(interfaceC13133aM48741s4, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v13 = iInterfaceQueryLocalInterface5 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface5 : new C2347v1(strongBinder5);
                }
                C2256q0.m10552f(parcel);
                getCurrentScreenName(c2347v13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v12 = iInterfaceQueryLocalInterface6 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface6 : new C2347v1(strongBinder6);
                }
                C2256q0.m10552f(parcel);
                getCurrentScreenClass(c2347v12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c2058f2 = iInterfaceQueryLocalInterface7 instanceof InterfaceC2077g2 ? (InterfaceC2077g2) iInterfaceQueryLocalInterface7 : new C2058f2(strongBinder7);
                }
                C2256q0.m10552f(parcel);
                setInstanceIdProvider(c2058f2);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v11 = iInterfaceQueryLocalInterface8 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface8 : new C2347v1(strongBinder8);
                }
                C2256q0.m10552f(parcel);
                getCachedAppInstanceId(c2347v11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v10 = iInterfaceQueryLocalInterface9 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface9 : new C2347v1(strongBinder9);
                }
                C2256q0.m10552f(parcel);
                getAppInstanceId(c2347v10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v9 = iInterfaceQueryLocalInterface10 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface10 : new C2347v1(strongBinder10);
                }
                C2256q0.m10552f(parcel);
                getGmpAppId(c2347v9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v8 = iInterfaceQueryLocalInterface11 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface11 : new C2347v1(strongBinder11);
                }
                C2256q0.m10552f(parcel);
                generateEventId(c2347v8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                C2256q0.m10552f(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                C2256q0.m10552f(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                InterfaceC13133a interfaceC13133aM48741s5 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityStarted(interfaceC13133aM48741s5, j23);
                break;
            case 26:
                InterfaceC13133a interfaceC13133aM48741s6 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityStopped(interfaceC13133aM48741s6, j24);
                break;
            case 27:
                InterfaceC13133a interfaceC13133aM48741s7 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityCreated(interfaceC13133aM48741s7, bundle5, j25);
                break;
            case 28:
                InterfaceC13133a interfaceC13133aM48741s8 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityDestroyed(interfaceC13133aM48741s8, j26);
                break;
            case 29:
                InterfaceC13133a interfaceC13133aM48741s9 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityPaused(interfaceC13133aM48741s9, j27);
                break;
            case 30:
                InterfaceC13133a interfaceC13133aM48741s10 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityResumed(interfaceC13133aM48741s10, j28);
                break;
            case 31:
                InterfaceC13133a interfaceC13133aM48741s11 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v7 = iInterfaceQueryLocalInterface12 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface12 : new C2347v1(strongBinder12);
                }
                long j29 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivitySaveInstanceState(interfaceC13133aM48741s11, c2347v7, j29);
                break;
            case 32:
                Bundle bundle6 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v6 = iInterfaceQueryLocalInterface13 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface13 : new C2347v1(strongBinder13);
                }
                long j30 = parcel.readLong();
                C2256q0.m10552f(parcel);
                performAction(bundle6, c2347v6, j30);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC13133a interfaceC13133aM48741s12 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                InterfaceC13133a interfaceC13133aM48741s13 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                InterfaceC13133a interfaceC13133aM48741s14 = InterfaceC13133a.a.m48741s2(parcel.readStrongBinder());
                C2256q0.m10552f(parcel);
                logHealthData(i12, string19, interfaceC13133aM48741s12, interfaceC13133aM48741s13, interfaceC13133aM48741s14);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1982b4 = iInterfaceQueryLocalInterface14 instanceof InterfaceC2039e2 ? (InterfaceC2039e2) iInterfaceQueryLocalInterface14 : new C1982b2(strongBinder14);
                }
                C2256q0.m10552f(parcel);
                setEventInterceptor(c1982b4);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1982b3 = iInterfaceQueryLocalInterface15 instanceof InterfaceC2039e2 ? (InterfaceC2039e2) iInterfaceQueryLocalInterface15 : new C1982b2(strongBinder15);
                }
                C2256q0.m10552f(parcel);
                registerOnMeasurementEventListener(c1982b3);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1982b2 = iInterfaceQueryLocalInterface16 instanceof InterfaceC2039e2 ? (InterfaceC2039e2) iInterfaceQueryLocalInterface16 : new C1982b2(strongBinder16);
                }
                C2256q0.m10552f(parcel);
                unregisterOnMeasurementEventListener(c1982b2);
                break;
            case 37:
                HashMap mapM10551e = C2256q0.m10551e(parcel);
                C2256q0.m10552f(parcel);
                initForTests(mapM10551e);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v5 = iInterfaceQueryLocalInterface17 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface17 : new C2347v1(strongBinder17);
                }
                int i13 = parcel.readInt();
                C2256q0.m10552f(parcel);
                getTestFlag(c2347v5, i13);
                break;
            case 39:
                boolean zM10547a6 = C2256q0.m10547a(parcel);
                C2256q0.m10552f(parcel);
                setDataCollectionEnabled(zM10547a6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v4 = iInterfaceQueryLocalInterface18 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface18 : new C2347v1(strongBinder18);
                }
                C2256q0.m10552f(parcel);
                isDataCollectionEnabled(c2347v4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                C2256q0.m10552f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j31 = parcel.readLong();
                C2256q0.m10552f(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setConsent(bundle8, j32);
                break;
            case 45:
                Bundle bundle9 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v3 = iInterfaceQueryLocalInterface19 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface19 : new C2347v1(strongBinder19);
                }
                C2256q0.m10552f(parcel);
                getSessionId(c2347v3);
                break;
            case 48:
                Intent intent = (Intent) C2256q0.m10548b(parcel, Intent.CREATOR);
                C2256q0.m10552f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdf zzdfVar = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j34 = parcel.readLong();
                C2256q0.m10552f(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, string20, string21, j34);
                break;
            case 51:
                zzdf zzdfVar2 = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                long j35 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, j35);
                break;
            case 52:
                zzdf zzdfVar3 = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                long j36 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, j36);
                break;
            case 53:
                zzdf zzdfVar4 = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                Bundle bundle10 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                long j37 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, j37);
                break;
            case 54:
                zzdf zzdfVar5 = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                long j38 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, j38);
                break;
            case 55:
                zzdf zzdfVar6 = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                long j39 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, j39);
                break;
            case 56:
                zzdf zzdfVar7 = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                long j40 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, j40);
                break;
            case 57:
                zzdf zzdfVar8 = (zzdf) C2256q0.m10548b(parcel, zzdf.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2347v2 = iInterfaceQueryLocalInterface20 instanceof InterfaceC2383x1 ? (InterfaceC2383x1) iInterfaceQueryLocalInterface20 : new C2347v1(strongBinder20);
                }
                long j41 = parcel.readLong();
                C2256q0.m10552f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, c2347v2, j41);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c2401y1 = iInterfaceQueryLocalInterface21 instanceof InterfaceC1963a2 ? (InterfaceC1963a2) iInterfaceQueryLocalInterface21 : new C2401y1(strongBinder21);
                }
                C2256q0.m10552f(parcel);
                retrieveAndUploadBatches(c2401y1);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
