package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                iW = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new f(strH, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
