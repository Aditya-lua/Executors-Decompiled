package kf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzj;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        Bundle bundleB = null;
        zzj zzjVar = null;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN == 2) {
                zzjVar = (zzj) o9.a.g(parcel, iU, zzj.CREATOR);
            } else if (iN == 3) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 4) {
                strH2 = o9.a.h(parcel, iU);
            } else if (iN != 1000) {
                o9.a.C(parcel, iU);
            } else {
                iW = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new Thing(iW, bundleB, zzjVar, strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Thing[i10];
    }
}
