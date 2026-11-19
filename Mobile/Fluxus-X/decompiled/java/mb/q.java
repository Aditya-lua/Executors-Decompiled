package mb;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends ib.o implements r {
    public static r s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new p(iBinder);
    }

    @Override // ib.o
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        t((Location) ib.v.b(parcel, Location.CREATOR));
        return true;
    }
}
