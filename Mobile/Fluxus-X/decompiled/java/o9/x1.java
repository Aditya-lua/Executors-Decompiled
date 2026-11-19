package o9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1 extends eb.n implements y1 {
    public x1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static y1 s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof y1 ? (y1) iInterfaceQueryLocalInterface : new w1(iBinder);
    }

    @Override // eb.n
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            z9.a aVarZzd = zzd();
            parcel2.writeNoException();
            eb.o.d(parcel2, aVarZzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }
}
