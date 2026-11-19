package sa;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean[] zArrA = null;
        boolean[] zArrA2 = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                zO = p9.b.o(parcel, iU);
            } else if (iN == 2) {
                zO2 = p9.b.o(parcel, iU);
            } else if (iN == 3) {
                zO3 = p9.b.o(parcel, iU);
            } else if (iN == 4) {
                zArrA = p9.b.a(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                zArrA2 = p9.b.a(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new a(zO, zO2, zO3, zArrA, zArrA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
