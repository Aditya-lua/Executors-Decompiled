package mb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<b0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b0 createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = true;
        long jY = 50;
        float fS = 0.0f;
        long jY2 = Long.MAX_VALUE;
        int iW = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                zO = p9.b.o(parcel, iU);
            } else if (iN == 2) {
                jY = p9.b.y(parcel, iU);
            } else if (iN == 3) {
                fS = p9.b.s(parcel, iU);
            } else if (iN == 4) {
                jY2 = p9.b.y(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                iW = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new b0(zO, jY, fS, jY2, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b0[] newArray(int i10) {
        return new b0[i10];
    }
}
