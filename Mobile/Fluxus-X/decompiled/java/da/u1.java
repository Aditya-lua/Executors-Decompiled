package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        Boolean boolP = null;
        String strH2 = null;
        String strH3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                boolP = p9.b.p(parcel, iU);
            } else if (iN == 4) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                strH3 = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new k(strH, boolP, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
