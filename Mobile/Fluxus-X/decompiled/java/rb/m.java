package rb;

import android.os.Parcel;
import android.os.Parcelable;
import o9.t0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        k9.b bVar = null;
        int iW = 0;
        t0 t0Var = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                bVar = (k9.b) p9.b.g(parcel, iU, k9.b.CREATOR);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                t0Var = (t0) p9.b.g(parcel, iU, t0.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new l(iW, bVar, t0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
