package mb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
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
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 2:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 3:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 4:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 5:
                    jY3 = p9.b.y(parcel, iU);
                    break;
                case 6:
                    iW2 = p9.b.w(parcel, iU);
                    break;
                case 7:
                    fS = p9.b.s(parcel, iU);
                    break;
                case 8:
                    jY4 = p9.b.y(parcel, iU);
                    break;
                case 9:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new LocationRequest(iW, jY, jY2, zO, jY3, iW2, fS, jY4, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
