package mb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ z createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 1;
        int iW2 = 1;
        long jY = -1;
        long jY2 = -1;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN == 3) {
                jY = p9.b.y(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                jY2 = p9.b.y(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new z(iW, iW2, jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ z[] newArray(int i10) {
        return new z[i10];
    }
}
