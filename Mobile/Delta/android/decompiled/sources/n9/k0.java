package n9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        IBinder iBinderV = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                iBinderV = o9.a.v(parcel, iU);
            } else if (iN == 3) {
                connectionResult = (ConnectionResult) o9.a.g(parcel, iU, ConnectionResult.CREATOR);
            } else if (iN == 4) {
                zO = o9.a.o(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                zO2 = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zav(iW, iBinderV, connectionResult, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zav[i10];
    }
}
