package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2537j extends C2504g implements InterfaceC2570m {
    public C2537j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2570m
    /* JADX INFO: renamed from: f1 */
    public final void mo11506f1(String str, String str2, InterfaceC2592o interfaceC2592o) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        C2526i.m11468c(parcelM11415r2, interfaceC2592o);
        m11417t2(1, parcelM11415r2);
    }
}
