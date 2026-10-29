package lb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p166hb.BinderC6341o;

/* JADX INFO: renamed from: lb.k */
/* JADX INFO: loaded from: classes.dex */
public class BinderC8108k extends BinderC6341o implements InterfaceC8109l {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC8109l m33324s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8109l ? (InterfaceC8109l) iInterfaceQueryLocalInterface : new C8107j(iBinder);
    }

    @Override // p166hb.BinderC6341o
    /* JADX INFO: renamed from: r2 */
    public final boolean mo27649r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
