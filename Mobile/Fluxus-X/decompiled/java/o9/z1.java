package o9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 extends eb.n implements m {
    public z1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // eb.n
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) eb.o.b(parcel, Bundle.CREATOR);
            eb.o.e(parcel);
            Z(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) eb.o.b(parcel, Bundle.CREATOR);
            eb.o.e(parcel);
            i(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            l1 l1Var = (l1) eb.o.b(parcel, l1.CREATOR);
            eb.o.e(parcel);
            T1(i14, strongBinder2, l1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
