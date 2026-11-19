package nf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        int iW = 0;
        String strH = null;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                zO = p9.b.o(parcel, iU);
            } else if (iN == 2) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 3) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 4) {
                bundleB = p9.b.b(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                bundleB2 = p9.b.b(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new j(zO, iW, strH, bundleB, bundleB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
