package ib;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<a0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a0 createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        y yVar = null;
        int iW = 1;
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                yVar = (y) p9.b.g(parcel, iU, y.CREATOR);
            } else if (iN == 3) {
                iBinderV = p9.b.v(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                iBinderV2 = p9.b.v(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new a0(iW, yVar, iBinderV, iBinderV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a0[] newArray(int i10) {
        return new a0[i10];
    }
}
