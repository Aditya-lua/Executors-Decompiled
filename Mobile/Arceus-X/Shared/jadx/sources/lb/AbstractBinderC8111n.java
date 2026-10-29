package lb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p166hb.BinderC6341o;
import p166hb.C6346t;

/* JADX INFO: renamed from: lb.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC8111n extends BinderC6341o implements InterfaceC8112o {
    /* JADX INFO: renamed from: s2 */
    public static InterfaceC8112o m33325s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8112o ? (InterfaceC8112o) iInterfaceQueryLocalInterface : new C8110m(iBinder);
    }

    @Override // p166hb.BinderC6341o
    /* JADX INFO: renamed from: r2 */
    public final boolean mo27649r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            mo27644P0((LocationResult) C6346t.m27651b(parcel, LocationResult.CREATOR));
        } else {
            if (i10 != 2) {
                return false;
            }
            mo27643N((LocationAvailability) C6346t.m27651b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
