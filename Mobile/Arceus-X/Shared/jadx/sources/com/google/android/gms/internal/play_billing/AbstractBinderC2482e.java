package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2482e extends BinderC2515h implements InterfaceC2493f {
    /* JADX INFO: renamed from: u2 */
    public static InterfaceC2493f m11374u2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2493f ? (InterfaceC2493f) iInterfaceQueryLocalInterface : new C2471d(iBinder);
    }
}
