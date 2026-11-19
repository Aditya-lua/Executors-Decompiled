package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends o0 implements x1 {
    public v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.x1
    public final void l(Bundle bundle) {
        Parcel parcelS2 = s2();
        q0.c(parcelS2, bundle);
        t2(1, parcelS2);
    }
}
