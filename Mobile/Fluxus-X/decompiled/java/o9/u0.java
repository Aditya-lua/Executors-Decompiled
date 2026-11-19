package o9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        IBinder iBinderV = null;
        k9.b bVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                iBinderV = p9.b.v(parcel, iU);
            } else if (iN == 3) {
                bVar = (k9.b) p9.b.g(parcel, iU, k9.b.CREATOR);
            } else if (iN == 4) {
                zO = p9.b.o(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                zO2 = p9.b.o(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new t0(iW, iBinderV, bVar, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t0[i10];
    }
}
