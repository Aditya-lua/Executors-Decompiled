package k9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        ConnectionResult connectionResult = null;
        int iW = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                pendingIntent = (PendingIntent) o9.a.g(parcel, iU, PendingIntent.CREATOR);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                connectionResult = (ConnectionResult) o9.a.g(parcel, iU, ConnectionResult.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new Status(iW, strH, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
