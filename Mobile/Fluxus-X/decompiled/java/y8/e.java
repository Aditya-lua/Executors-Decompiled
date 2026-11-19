package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                strH2 = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new d(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
