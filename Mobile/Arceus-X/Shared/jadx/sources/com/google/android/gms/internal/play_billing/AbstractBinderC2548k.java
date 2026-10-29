package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2548k extends BinderC2515h implements InterfaceC2570m {
    /* JADX INFO: renamed from: u2 */
    public static InterfaceC2570m m11516u2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2570m ? (InterfaceC2570m) iInterfaceQueryLocalInterface : new C2537j(iBinder);
    }
}
