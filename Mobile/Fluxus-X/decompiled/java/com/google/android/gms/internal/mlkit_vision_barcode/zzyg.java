package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        zzxq zzxqVar = null;
        zzxq zzxqVar2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    strH = b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = b.h(parcel, iU);
                    break;
                case 3:
                    strH3 = b.h(parcel, iU);
                    break;
                case 4:
                    strH4 = b.h(parcel, iU);
                    break;
                case 5:
                    strH5 = b.h(parcel, iU);
                    break;
                case 6:
                    zzxqVar = (zzxq) b.g(parcel, iU, zzxq.CREATOR);
                    break;
                case 7:
                    zzxqVar2 = (zzxq) b.g(parcel, iU, zzxq.CREATOR);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzxr(strH, strH2, strH3, strH4, strH5, zzxqVar, zzxqVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxr[i10];
    }
}
