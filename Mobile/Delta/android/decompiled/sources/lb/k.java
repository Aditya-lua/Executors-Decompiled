package lb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class k extends hb.o implements l {
    public static l s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new j(iBinder);
    }

    @Override // hb.o
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
