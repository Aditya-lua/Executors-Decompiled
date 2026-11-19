package bb;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends d implements n {
    public m() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // bb.d
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) e.a(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            s2(parcel);
            u0(status, bArrCreateByteArray);
        } else {
            if (i10 != 2) {
                return false;
            }
            Status status2 = (Status) e.a(parcel, Status.CREATOR);
            f9.e eVar = (f9.e) e.a(parcel, f9.e.CREATOR);
            s2(parcel);
            z(status2, eVar);
        }
        return true;
    }
}
