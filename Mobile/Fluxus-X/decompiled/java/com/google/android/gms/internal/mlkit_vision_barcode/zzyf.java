package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        String strH = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    iW = b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = b.w(parcel, iU);
                    break;
                case 3:
                    iW3 = b.w(parcel, iU);
                    break;
                case 4:
                    iW4 = b.w(parcel, iU);
                    break;
                case 5:
                    iW5 = b.w(parcel, iU);
                    break;
                case 6:
                    iW6 = b.w(parcel, iU);
                    break;
                case 7:
                    zO = b.o(parcel, iU);
                    break;
                case 8:
                    strH = b.h(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzxq(iW, iW2, iW3, iW4, iW5, iW6, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxq[i10];
    }
}
