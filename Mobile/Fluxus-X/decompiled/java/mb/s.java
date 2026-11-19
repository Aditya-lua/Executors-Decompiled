package mb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 1000;
        int iW2 = 1;
        int iW3 = 1;
        long jY = 0;
        z[] zVarArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                iW3 = p9.b.w(parcel, iU);
            } else if (iN == 3) {
                jY = p9.b.y(parcel, iU);
            } else if (iN == 4) {
                iW = p9.b.w(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                zVarArr = (z[]) p9.b.k(parcel, iU, z.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new LocationAvailability(iW, iW2, iW3, jY, zVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
