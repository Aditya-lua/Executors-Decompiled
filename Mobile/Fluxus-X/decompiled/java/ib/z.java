package ib;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Parcelable.Creator<y> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ y createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        mb.b0 b0Var = y.f19345j;
        List<o9.e> listL = y.f19344i;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                b0Var = (mb.b0) p9.b.g(parcel, iU, mb.b0.CREATOR);
            } else if (iN == 2) {
                listL = p9.b.l(parcel, iU, o9.e.CREATOR);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new y(b0Var, listL, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ y[] newArray(int i10) {
        return new y[i10];
    }
}
