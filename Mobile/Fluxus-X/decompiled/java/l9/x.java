package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        boolean zO = true;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN == 3) {
                iW3 = p9.b.w(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                zO = p9.b.o(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new f(iW, iW2, iW3, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
