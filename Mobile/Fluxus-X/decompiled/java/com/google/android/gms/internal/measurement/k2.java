package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        int iW = 0;
        Intent intent = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                intent = (Intent) p9.b.g(parcel, iU, Intent.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new j2(iW, strH, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j2[i10];
    }
}
