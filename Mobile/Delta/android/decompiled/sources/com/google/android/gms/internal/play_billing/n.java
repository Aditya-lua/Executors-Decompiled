package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends h implements o {
    public n() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.h
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        s2(parcel);
        a(i12);
        return true;
    }
}
