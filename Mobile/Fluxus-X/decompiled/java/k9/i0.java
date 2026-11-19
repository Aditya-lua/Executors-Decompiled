package k9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        long jY = -1;
        boolean zO = false;
        int iW = 0;
        int iW2 = 0;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                zO = p9.b.o(parcel, iU);
            } else if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 4) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                jY = p9.b.y(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new h0(zO, strH, iW, iW2, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h0[i10];
    }
}
