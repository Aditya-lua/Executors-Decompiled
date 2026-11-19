package ib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator<p> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        List<o9.e> listL = p.f19322q;
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
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN != 1) {
                switch (iN) {
                    case 5:
                        listL = p9.b.l(parcel, iU, o9.e.CREATOR);
                        break;
                    case 6:
                        strH = p9.b.h(parcel, iU);
                        break;
                    case 7:
                        zO = p9.b.o(parcel, iU);
                        break;
                    case 8:
                        zO2 = p9.b.o(parcel, iU);
                        break;
                    case 9:
                        zO3 = p9.b.o(parcel, iU);
                        break;
                    case 10:
                        strH2 = p9.b.h(parcel, iU);
                        break;
                    case 11:
                        zO4 = p9.b.o(parcel, iU);
                        break;
                    case 12:
                        zO5 = p9.b.o(parcel, iU);
                        break;
                    case 13:
                        strH3 = p9.b.h(parcel, iU);
                        break;
                    case 14:
                        jY = p9.b.y(parcel, iU);
                        break;
                    default:
                        p9.b.C(parcel, iU);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) p9.b.g(parcel, iU, LocationRequest.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new p(locationRequest, listL, strH, zO, zO2, zO3, strH2, zO4, zO5, strH3, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p[] newArray(int i10) {
        return new p[i10];
    }
}
