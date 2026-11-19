package k9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        boolean zO = false;
        long jY = -1;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 3) {
                jY = p9.b.y(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                zO = p9.b.o(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new d(strH, iW, jY, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
