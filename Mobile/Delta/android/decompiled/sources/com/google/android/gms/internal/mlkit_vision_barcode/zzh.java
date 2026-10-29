package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String[] strArrI = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 2) {
                iW = o9.a.w(parcel, iU);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                strArrI = o9.a.i(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzi(iW, strArrI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzi[i10];
    }
}
