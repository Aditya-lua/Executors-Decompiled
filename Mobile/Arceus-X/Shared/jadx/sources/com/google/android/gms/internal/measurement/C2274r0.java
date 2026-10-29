package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2274r0 extends C2220o0 implements InterfaceC2310t0 {
    public C2274r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310t0
    /* JADX INFO: renamed from: j */
    public final Bundle mo10586j(Bundle bundle) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, bundle);
        Parcel parcelM10473r2 = m10473r2(1, parcelM10474s2);
        Bundle bundle2 = (Bundle) C2256q0.m10548b(parcelM10473r2, Bundle.CREATOR);
        parcelM10473r2.recycle();
        return bundle2;
    }
}
