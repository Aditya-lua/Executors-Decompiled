package mb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        ArrayList arrayListL = null;
        boolean zO = false;
        boolean zO2 = false;
        w wVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                arrayListL = p9.b.l(parcel, iU, LocationRequest.CREATOR);
            } else if (iN == 2) {
                zO = p9.b.o(parcel, iU);
            } else if (iN == 3) {
                zO2 = p9.b.o(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                wVar = (w) p9.b.g(parcel, iU, w.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new LocationSettingsRequest(arrayListL, zO, zO2, wVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i10) {
        return new LocationSettingsRequest[i10];
    }
}
