package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzyi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
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
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 6:
                    strH6 = o9.a.h(parcel, iU);
                    break;
                case 7:
                    strH7 = o9.a.h(parcel, iU);
                    break;
                case 8:
                    strH8 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    strH9 = o9.a.h(parcel, iU);
                    break;
                case 10:
                    strH10 = o9.a.h(parcel, iU);
                    break;
                case 11:
                    strH11 = o9.a.h(parcel, iU);
                    break;
                case 12:
                    strH12 = o9.a.h(parcel, iU);
                    break;
                case 13:
                    strH13 = o9.a.h(parcel, iU);
                    break;
                case 14:
                    strH14 = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzxt(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, strH11, strH12, strH13, strH14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxt[i10];
    }
}
