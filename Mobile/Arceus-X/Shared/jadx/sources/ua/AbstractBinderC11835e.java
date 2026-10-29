package ua;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ua.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC11835e extends BinderC11832b implements InterfaceC11836f {
    /* JADX INFO: renamed from: r2 */
    public static InterfaceC11836f m44222r2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC11836f ? (InterfaceC11836f) iInterfaceQueryLocalInterface : new C11834d(iBinder);
    }
}
