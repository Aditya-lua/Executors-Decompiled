package p012ab;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ab.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0116m extends BinderC0107d implements InterfaceC0117n {
    public AbstractBinderC0116m() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // p012ab.BinderC0107d
    /* JADX INFO: renamed from: r2 */
    public final boolean mo307r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) C0108e.m310a(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            m308s2(parcel);
            mo314s0(status, bArrCreateByteArray);
        } else {
            if (i10 != 2) {
                return false;
            }
            Status status2 = (Status) C0108e.m310a(parcel, Status.CREATOR);
            RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) C0108e.m310a(parcel, RetrieveBytesResponse.CREATOR);
            m308s2(parcel);
            mo321a1(status2, retrieveBytesResponse);
        }
        return true;
    }
}
