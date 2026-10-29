package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        int iW = 0;
        Intent intent = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                intent = (Intent) o9.a.g(parcel, iU, Intent.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new zzdf(iW, strH, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdf[i10];
    }
}
