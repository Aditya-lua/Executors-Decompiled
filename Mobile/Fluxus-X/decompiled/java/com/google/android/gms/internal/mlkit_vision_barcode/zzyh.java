package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        zzxw zzxwVar = null;
        String strH = null;
        String strH2 = null;
        zzxx[] zzxxVarArr = null;
        zzxu[] zzxuVarArr = null;
        String[] strArrI = null;
        zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    zzxwVar = (zzxw) b.g(parcel, iU, zzxw.CREATOR);
                    break;
                case 2:
                    strH = b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = b.h(parcel, iU);
                    break;
                case 4:
                    zzxxVarArr = (zzxx[]) b.k(parcel, iU, zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (zzxu[]) b.k(parcel, iU, zzxu.CREATOR);
                    break;
                case 6:
                    strArrI = b.i(parcel, iU);
                    break;
                case 7:
                    zzxpVarArr = (zzxp[]) b.k(parcel, iU, zzxp.CREATOR);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzxs(zzxwVar, strH, strH2, zzxxVarArr, zzxuVarArr, strArrI, zzxpVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxs[i10];
    }
}
