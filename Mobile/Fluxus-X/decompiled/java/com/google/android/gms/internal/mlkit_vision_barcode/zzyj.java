package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        String strH = null;
        String strH2 = null;
        int iW = 0;
        String strH3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                strH = b.h(parcel, iU);
            } else if (iN == 3) {
                strH3 = b.h(parcel, iU);
            } else if (iN != 4) {
                b.C(parcel, iU);
            } else {
                strH2 = b.h(parcel, iU);
            }
        }
        b.m(parcel, iD);
        return new zzxu(iW, strH, strH3, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxu[i10];
    }
}
