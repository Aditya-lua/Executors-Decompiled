package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 102;
        long jY = 3600000;
        long jY2 = 600000;
        boolean zO = false;
        boolean zO2 = false;
        long jY3 = Long.MAX_VALUE;
        int iW2 = Integer.MAX_VALUE;
        float fS = 0.0f;
        long jY4 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 2:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 3:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 4:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 5:
                    jY3 = o9.a.y(parcel, iU);
                    break;
                case 6:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 7:
                    fS = o9.a.s(parcel, iU);
                    break;
                case 8:
                    jY4 = o9.a.y(parcel, iU);
                    break;
                case 9:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new LocationRequest(iW, jY, jY2, zO, jY3, iW2, fS, jY4, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
