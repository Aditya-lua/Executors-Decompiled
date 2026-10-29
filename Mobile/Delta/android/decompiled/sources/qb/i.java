package qb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        ConnectionResult connectionResult = null;
        int iW = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                connectionResult = (ConnectionResult) o9.a.g(parcel, iU, ConnectionResult.CREATOR);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                zavVar = (zav) o9.a.g(parcel, iU, zav.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new zak(iW, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}
