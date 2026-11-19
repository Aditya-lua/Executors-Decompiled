package wa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                strH3 = p9.b.h(parcel, iU);
            } else if (iN == 4) {
                strH4 = p9.b.h(parcel, iU);
            } else if (iN == 6) {
                strH5 = p9.b.h(parcel, iU);
            } else if (iN != 7) {
                p9.b.C(parcel, iU);
            } else {
                bundleB = p9.b.b(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new f0(strH, strH2, strH3, strH4, strH5, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f0[i10];
    }
}
