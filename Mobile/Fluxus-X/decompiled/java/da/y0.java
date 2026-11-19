package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        byte[] bArrC = null;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                bArrC = p9.b.c(parcel, iU);
            } else if (iN == 3) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 4) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                strH3 = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new w(bArrC, strH, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new w[i10];
    }
}
