package mb;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        List<Location> listL = LocationResult.f7380g;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            if (p9.b.n(iU) != 1) {
                p9.b.C(parcel, iU);
            } else {
                listL = p9.b.l(parcel, iU, Location.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new LocationResult(listL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
