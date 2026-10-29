package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j extends g implements m {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override // com.google.android.gms.internal.play_billing.m
    public final void j1(String str, String str2, o oVar) {
        Parcel parcelR2 = r2();
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        i.c(parcelR2, oVar);
        t2(1, parcelR2);
    }
}
