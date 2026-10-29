package lb;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p166hb.BinderC6341o;
import p166hb.C6346t;

/* JADX INFO: renamed from: lb.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC8114q extends BinderC6341o implements InterfaceC8115r {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC8115r m33326s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8115r ? (InterfaceC8115r) iInterfaceQueryLocalInterface : new C8113p(iBinder);
    }

    @Override // p166hb.BinderC6341o
    /* JADX INFO: renamed from: r2 */
    public final boolean mo27649r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        mo27645s((Location) C6346t.m27651b(parcel, Location.CREATOR));
        return true;
    }
}
