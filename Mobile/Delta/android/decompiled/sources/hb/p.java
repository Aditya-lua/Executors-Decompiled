package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        List<ClientIdentity> listL = zzba.f6341q;
        LocationRequest locationRequest = null;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        long jY = Long.MAX_VALUE;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN != 1) {
                switch (iN) {
                    case 5:
                        listL = o9.a.l(parcel, iU, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strH = o9.a.h(parcel, iU);
                        break;
                    case 7:
                        zO = o9.a.o(parcel, iU);
                        break;
                    case 8:
                        zO2 = o9.a.o(parcel, iU);
                        break;
                    case 9:
                        zO3 = o9.a.o(parcel, iU);
                        break;
                    case 10:
                        strH2 = o9.a.h(parcel, iU);
                        break;
                    case 11:
                        zO4 = o9.a.o(parcel, iU);
                        break;
                    case 12:
                        zO5 = o9.a.o(parcel, iU);
                        break;
                    case 13:
                        strH3 = o9.a.h(parcel, iU);
                        break;
                    case 14:
                        jY = o9.a.y(parcel, iU);
                        break;
                    default:
                        o9.a.C(parcel, iU);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) o9.a.g(parcel, iU, LocationRequest.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new zzba(locationRequest, listL, strH, zO, zO2, zO3, strH2, zO4, zO5, strH3, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i10) {
        return new zzba[i10];
    }
}
