package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        l lVar = null;
        l lVar2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                jY = p9.b.y(parcel, iU);
            } else if (iN == 2) {
                jY2 = p9.b.y(parcel, iU);
            } else if (iN == 3) {
                lVar = (l) p9.b.g(parcel, iU, l.CREATOR);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                lVar2 = (l) p9.b.g(parcel, iU, l.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new m(jY, jY2, lVar, lVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
