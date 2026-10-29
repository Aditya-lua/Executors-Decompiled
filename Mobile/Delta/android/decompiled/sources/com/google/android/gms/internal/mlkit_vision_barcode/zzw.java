package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 2:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 3:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 4:
                    iW3 = o9.a.w(parcel, iU);
                    break;
                case 5:
                    iW4 = o9.a.w(parcel, iU);
                    break;
                case 6:
                    iW5 = o9.a.w(parcel, iU);
                    break;
                case 7:
                    iW6 = o9.a.w(parcel, iU);
                    break;
                case 8:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 9:
                    strH = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzj(iW, iW2, iW3, iW4, iW5, iW6, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
