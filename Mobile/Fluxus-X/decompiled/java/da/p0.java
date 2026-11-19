package da;

import android.os.Parcel;
import android.os.Parcelable;
import fb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                bArrC = p9.b.c(parcel, iU);
            } else if (iN == 2) {
                bArrC2 = p9.b.c(parcel, iU);
            } else if (iN == 3) {
                bArrC3 = p9.b.c(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                iW = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new o0(bArrC == null ? null : m3.m(bArrC, 0, bArrC.length), bArrC2 == null ? null : m3.m(bArrC2, 0, bArrC2.length), bArrC3 != null ? m3.m(bArrC3, 0, bArrC3.length) : null, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o0[i10];
    }
}
