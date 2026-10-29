package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzvi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        boolean zO = false;
        int iW = 0;
        boolean zO2 = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            switch (a.n(iU)) {
                case 1:
                    strH = a.h(parcel, iU);
                    break;
                case 2:
                    strH2 = a.h(parcel, iU);
                    break;
                case 3:
                    strH3 = a.h(parcel, iU);
                    break;
                case 4:
                    zO = a.o(parcel, iU);
                    break;
                case 5:
                    iW = a.w(parcel, iU);
                    break;
                case 6:
                    strH4 = a.h(parcel, iU);
                    break;
                case 7:
                    zO2 = a.o(parcel, iU);
                    break;
                default:
                    a.C(parcel, iU);
                    break;
            }
        }
        a.m(parcel, iD);
        return new zzvh(strH, strH2, strH3, zO, iW, strH4, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvh[i10];
    }
}
