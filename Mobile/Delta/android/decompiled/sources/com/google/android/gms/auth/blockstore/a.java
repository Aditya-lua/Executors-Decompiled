package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        byte[] bArrC = null;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                bArrC = o9.a.c(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                strH = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new RetrieveBytesResponse.BlockstoreData(bArrC, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RetrieveBytesResponse.BlockstoreData[i10];
    }
}
