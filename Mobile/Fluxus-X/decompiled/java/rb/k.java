package rb;

import android.os.Parcel;
import android.os.Parcelable;
import o9.r0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        r0 r0Var = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                r0Var = (r0) p9.b.g(parcel, iU, r0.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new j(iW, r0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
