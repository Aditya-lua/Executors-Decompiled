package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzyv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        long jY = 0;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN == 3) {
                iW3 = o9.a.w(parcel, iU);
            } else if (iN == 4) {
                iW4 = o9.a.w(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                jY = o9.a.y(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzyu(iW, iW2, iW3, iW4, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyu[i10];
    }
}
