package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2292s0 extends BinderC2238p0 implements InterfaceC2310t0 {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC2310t0 m10672s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2310t0 ? (InterfaceC2310t0) iInterfaceQueryLocalInterface : new C2274r0(iBinder);
    }
}
