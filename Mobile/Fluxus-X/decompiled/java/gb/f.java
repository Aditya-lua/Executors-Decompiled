package gb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Bundle bundleB = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                bundleB = p9.b.b(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                iBinderV = p9.b.v(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new e(bundleB, iBinderV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
