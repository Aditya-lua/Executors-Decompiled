package kf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.zzj;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        int iW = 0;
        String strH = null;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                zO = o9.a.o(parcel, iU);
            } else if (iN == 2) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 3) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 4) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                bundleB2 = o9.a.b(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzj(zO, iW, strH, bundleB, bundleB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
