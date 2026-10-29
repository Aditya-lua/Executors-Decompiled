package n9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 extends db.n implements h {
    public n1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // db.n
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) db.o.b(parcel, Bundle.CREATOR);
            db.o.e(parcel);
            f0(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) db.o.b(parcel, Bundle.CREATOR);
            db.o.e(parcel);
            i(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) db.o.b(parcel, zzj.CREATOR);
            db.o.e(parcel);
            z1(i14, strongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
