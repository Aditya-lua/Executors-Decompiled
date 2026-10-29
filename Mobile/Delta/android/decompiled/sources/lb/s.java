package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzbo;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 1000;
        int iW2 = 1;
        int iW3 = 1;
        long jY = 0;
        zzbo[] zzboVarArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                iW3 = o9.a.w(parcel, iU);
            } else if (iN == 3) {
                jY = o9.a.y(parcel, iU);
            } else if (iN == 4) {
                iW = o9.a.w(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                zzboVarArr = (zzbo[]) o9.a.k(parcel, iU, zzbo.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new LocationAvailability(iW, iW2, iW3, jY, zzboVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
