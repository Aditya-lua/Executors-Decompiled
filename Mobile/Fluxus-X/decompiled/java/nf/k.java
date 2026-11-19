package nf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 0;
        Bundle bundleB = null;
        j jVar = null;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                bundleB = p9.b.b(parcel, iU);
            } else if (iN == 2) {
                jVar = (j) p9.b.g(parcel, iU, j.CREATOR);
            } else if (iN == 3) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 4) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN != 1000) {
                p9.b.C(parcel, iU);
            } else {
                iW = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new Thing(iW, bundleB, jVar, strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Thing[i10];
    }
}
