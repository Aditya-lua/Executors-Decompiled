package e9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        ArrayList<String> arrayListJ = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                arrayListJ = o9.a.j(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                zO = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new RetrieveBytesRequest(arrayListJ, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RetrieveBytesRequest[i10];
    }
}
