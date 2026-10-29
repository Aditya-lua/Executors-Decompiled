package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2581n extends BinderC2515h implements InterfaceC2592o {
    public AbstractBinderC2581n() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.BinderC2515h
    /* JADX INFO: renamed from: r2 */
    public final boolean mo11270r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        m11441s2(parcel);
        mo11630a(i12);
        return true;
    }
}
