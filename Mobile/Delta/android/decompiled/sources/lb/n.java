package lb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends hb.o implements o {
    public static o s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new m(iBinder);
    }

    @Override // hb.o
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            S0((LocationResult) hb.t.b(parcel, LocationResult.CREATOR));
        } else {
            if (i10 != 2) {
                return false;
            }
            P((LocationAvailability) hb.t.b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
