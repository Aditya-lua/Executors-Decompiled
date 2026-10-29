package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2365w1 extends BinderC2238p0 implements InterfaceC2383x1 {
    public AbstractBinderC2365w1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2238p0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo9842r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
        C2256q0.m10552f(parcel);
        mo10588l(bundle);
        parcel2.writeNoException();
        return true;
    }
}
