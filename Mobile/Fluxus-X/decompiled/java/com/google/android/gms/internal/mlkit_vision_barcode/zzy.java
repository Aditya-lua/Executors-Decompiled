package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        zzp zzpVar = null;
        String strH = null;
        String strH2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArrI = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 2:
                    zzpVar = (zzp) b.g(parcel, iU, zzp.CREATOR);
                    break;
                case 3:
                    strH = b.h(parcel, iU);
                    break;
                case 4:
                    strH2 = b.h(parcel, iU);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) b.k(parcel, iU, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) b.k(parcel, iU, zzn.CREATOR);
                    break;
                case 7:
                    strArrI = b.i(parcel, iU);
                    break;
                case 8:
                    zziVarArr = (zzi[]) b.k(parcel, iU, zzi.CREATOR);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzl(zzpVar, strH, strH2, zzqVarArr, zznVarArr, strArrI, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
