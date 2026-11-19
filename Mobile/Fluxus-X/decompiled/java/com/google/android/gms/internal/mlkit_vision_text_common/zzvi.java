package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        boolean zO = false;
        int iW = 0;
        boolean zO2 = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
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
                    zO = b.o(parcel, iU);
                    break;
                case 5:
                    iW = b.w(parcel, iU);
                    break;
                case 6:
                    strH4 = b.h(parcel, iU);
                    break;
                case 7:
                    zO2 = b.o(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzvh(strH, strH2, strH3, zO, iW, strH4, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvh[i10];
    }
}
