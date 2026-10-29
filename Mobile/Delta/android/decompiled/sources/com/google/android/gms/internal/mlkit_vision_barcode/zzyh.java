package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzyh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        zzxw zzxwVar = null;
        String strH = null;
        String strH2 = null;
        zzxx[] zzxxVarArr = null;
        zzxu[] zzxuVarArr = null;
        String[] strArrI = null;
        zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    zzxwVar = (zzxw) o9.a.g(parcel, iU, zzxw.CREATOR);
                    break;
                case 2:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    zzxxVarArr = (zzxx[]) o9.a.k(parcel, iU, zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (zzxu[]) o9.a.k(parcel, iU, zzxu.CREATOR);
                    break;
                case 6:
                    strArrI = o9.a.i(parcel, iU);
                    break;
                case 7:
                    zzxpVarArr = (zzxp[]) o9.a.k(parcel, iU, zzxp.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzxs(zzxwVar, strH, strH2, zzxxVarArr, zzxuVarArr, strArrI, zzxpVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxs[i10];
    }
}
