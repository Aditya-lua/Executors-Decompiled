package s9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        Long lZ = null;
        Long lZ2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN == 3) {
                lZ = p9.b.z(parcel, iU);
            } else if (iN == 4) {
                lZ2 = p9.b.z(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                iW3 = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new h(iW, iW2, lZ, lZ2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
