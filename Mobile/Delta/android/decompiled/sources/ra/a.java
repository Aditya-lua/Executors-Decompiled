package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.video.VideoCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean[] zArrA = null;
        boolean[] zArrA2 = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                zO = o9.a.o(parcel, iU);
            } else if (iN == 2) {
                zO2 = o9.a.o(parcel, iU);
            } else if (iN == 3) {
                zO3 = o9.a.o(parcel, iU);
            } else if (iN == 4) {
                zArrA = o9.a.a(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                zArrA2 = o9.a.a(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new VideoCapabilities(zO, zO2, zO3, zArrA, zArrA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VideoCapabilities[i10];
    }
}
