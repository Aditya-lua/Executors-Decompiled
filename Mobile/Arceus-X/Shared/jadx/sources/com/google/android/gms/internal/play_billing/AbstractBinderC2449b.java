package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2449b extends BinderC2515h implements InterfaceC2460c {
    public AbstractBinderC2449b() {
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.BinderC2515h
    /* JADX INFO: renamed from: r2 */
    public final boolean mo11270r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C2526i.m11466a(parcel, Bundle.CREATOR);
        m11441s2(parcel);
        mo11323N1(bundle);
        return true;
    }
}
