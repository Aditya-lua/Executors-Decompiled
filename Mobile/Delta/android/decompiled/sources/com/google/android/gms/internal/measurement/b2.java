package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends o0 implements e2 {
    public b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void p(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeString(str2);
        q0.c(parcelS2, bundle);
        parcelS2.writeLong(j10);
        t2(1, parcelS2);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int zzf() {
        Parcel parcelR2 = r2(2, s2());
        int i10 = parcelR2.readInt();
        parcelR2.recycle();
        return i10;
    }
}
