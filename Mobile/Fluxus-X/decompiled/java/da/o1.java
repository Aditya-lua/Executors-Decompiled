package da;

import android.os.Parcel;
import android.os.Parcelable;
import fb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                bArrC = p9.b.c(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                bArrC2 = p9.b.c(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new n1(bArrC == null ? null : m3.m(bArrC, 0, bArrC.length), bArrC2 != null ? m3.m(bArrC2, 0, bArrC2.length) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n1[i10];
    }
}
