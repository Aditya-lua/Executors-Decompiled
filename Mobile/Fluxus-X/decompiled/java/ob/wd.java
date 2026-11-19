package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        long jY = 0;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                jY = p9.b.y(parcel, iU);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                iW = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new vd(strH, jY, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new vd[i10];
    }
}
