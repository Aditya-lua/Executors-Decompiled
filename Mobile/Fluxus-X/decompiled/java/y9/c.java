package y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = -1;
        long jY = 0;
        long jY2 = 0;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                jY = p9.b.y(parcel, iU);
            } else if (iN == 4) {
                jY2 = p9.b.y(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                iW = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new DriveId(strH, jY, jY2, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DriveId[i10];
    }
}
