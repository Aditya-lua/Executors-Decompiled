package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        d0 d0Var = null;
        n1 n1Var = null;
        f fVar = null;
        p1 p1Var = null;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                d0Var = (d0) p9.b.g(parcel, iU, d0.CREATOR);
            } else if (iN == 2) {
                n1Var = (n1) p9.b.g(parcel, iU, n1.CREATOR);
            } else if (iN == 3) {
                fVar = (f) p9.b.g(parcel, iU, f.CREATOR);
            } else if (iN == 4) {
                p1Var = (p1) p9.b.g(parcel, iU, p1.CREATOR);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new e(d0Var, n1Var, fVar, p1Var, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
