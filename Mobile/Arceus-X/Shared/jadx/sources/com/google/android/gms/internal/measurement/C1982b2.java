package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1982b2 extends C2220o0 implements InterfaceC2039e2 {
    public C1982b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2039e2
    /* JADX INFO: renamed from: p */
    public final void mo9774p(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelM10474s2 = m10474s2();
        parcelM10474s2.writeString(str);
        parcelM10474s2.writeString(str2);
        C2256q0.m10549c(parcelM10474s2, bundle);
        parcelM10474s2.writeLong(j10);
        m10475t2(1, parcelM10474s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2039e2
    public final int zzf() {
        Parcel parcelM10473r2 = m10473r2(2, m10474s2());
        int i10 = parcelM10473r2.readInt();
        parcelM10473r2.recycle();
        return i10;
    }
}
