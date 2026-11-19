package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        String strH = null;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 3) {
                strH = p9.b.h(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                iW2 = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new i(iW, strH, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
