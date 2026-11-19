package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        short sA = 0;
        short sA2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                sA = p9.b.A(parcel, iU);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                sA2 = p9.b.A(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new e0(iW, sA, sA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e0[i10];
    }
}
