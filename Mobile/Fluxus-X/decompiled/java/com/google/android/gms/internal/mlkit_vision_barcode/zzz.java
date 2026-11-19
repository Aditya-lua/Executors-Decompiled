package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        String strH11 = null;
        String strH12 = null;
        String strH13 = null;
        String strH14 = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 2:
                    strH = b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = b.h(parcel, iU);
                    break;
                case 4:
                    strH3 = b.h(parcel, iU);
                    break;
                case 5:
                    strH4 = b.h(parcel, iU);
                    break;
                case 6:
                    strH5 = b.h(parcel, iU);
                    break;
                case 7:
                    strH6 = b.h(parcel, iU);
                    break;
                case 8:
                    strH7 = b.h(parcel, iU);
                    break;
                case 9:
                    strH8 = b.h(parcel, iU);
                    break;
                case 10:
                    strH9 = b.h(parcel, iU);
                    break;
                case 11:
                    strH10 = b.h(parcel, iU);
                    break;
                case 12:
                    strH11 = b.h(parcel, iU);
                    break;
                case 13:
                    strH12 = b.h(parcel, iU);
                    break;
                case 14:
                    strH13 = b.h(parcel, iU);
                    break;
                case 15:
                    strH14 = b.h(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzm(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, strH11, strH12, strH13, strH14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzm[i10];
    }
}
