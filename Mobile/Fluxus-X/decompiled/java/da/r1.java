package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        byte[] bArrC4 = null;
        byte[] bArrC5 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                bArrC = p9.b.c(parcel, iU);
            } else if (iN == 3) {
                bArrC2 = p9.b.c(parcel, iU);
            } else if (iN == 4) {
                bArrC3 = p9.b.c(parcel, iU);
            } else if (iN == 5) {
                bArrC4 = p9.b.c(parcel, iU);
            } else if (iN != 6) {
                p9.b.C(parcel, iU);
            } else {
                bArrC5 = p9.b.c(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new g(bArrC, bArrC2, bArrC3, bArrC4, bArrC5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
