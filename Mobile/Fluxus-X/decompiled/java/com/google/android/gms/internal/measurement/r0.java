package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends o0 implements t0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final Bundle j(Bundle bundle) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, bundle);
        Parcel parcelR2 = r2(1, parcelS2);
        Bundle bundle2 = (Bundle) q0.b(parcelR2, Bundle.CREATOR);
        parcelR2.recycle();
        return bundle2;
    }
}
