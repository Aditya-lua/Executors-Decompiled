package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzbj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        ArrayList arrayListL = null;
        boolean zO = false;
        boolean zO2 = false;
        zzbj zzbjVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                arrayListL = o9.a.l(parcel, iU, LocationRequest.CREATOR);
            } else if (iN == 2) {
                zO = o9.a.o(parcel, iU);
            } else if (iN == 3) {
                zO2 = o9.a.o(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                zzbjVar = (zzbj) o9.a.g(parcel, iU, zzbj.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new LocationSettingsRequest(arrayListL, zO, zO2, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i10) {
        return new LocationSettingsRequest[i10];
    }
}
