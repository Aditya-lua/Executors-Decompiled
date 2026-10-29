package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends h implements c {
    public b() {
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.h
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) i.a(parcel, Bundle.CREATOR);
        s2(parcel);
        N1(bundle);
        return true;
    }
}
