package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2347v1 extends C2220o0 implements InterfaceC2383x1 {
    public C2347v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2383x1
    /* JADX INFO: renamed from: l */
    public final void mo10588l(Bundle bundle) {
        Parcel parcelM10474s2 = m10474s2();
        C2256q0.m10549c(parcelM10474s2, bundle);
        m10475t2(1, parcelM10474s2);
    }
}
