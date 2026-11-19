package e9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Bundle bundleB = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                bundleB = p9.b.b(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new a(iW, iW2, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
