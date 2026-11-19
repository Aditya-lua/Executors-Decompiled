package o9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Bundle bundleB = null;
        g gVar = null;
        int iW = 0;
        k9.d[] dVarArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                bundleB = p9.b.b(parcel, iU);
            } else if (iN == 2) {
                dVarArr = (k9.d[]) p9.b.k(parcel, iU, k9.d.CREATOR);
            } else if (iN == 3) {
                iW = p9.b.w(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                gVar = (g) p9.b.g(parcel, iU, g.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new l1(bundleB, dVarArr, iW, gVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l1[i10];
    }
}
