package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        zzp zzpVar = null;
        String strH = null;
        String strH2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArrI = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 2:
                    zzpVar = (zzp) o9.a.g(parcel, iU, zzp.CREATOR);
                    break;
                case 3:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) o9.a.k(parcel, iU, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) o9.a.k(parcel, iU, zzn.CREATOR);
                    break;
                case 7:
                    strArrI = o9.a.i(parcel, iU);
                    break;
                case 8:
                    zziVarArr = (zzi[]) o9.a.k(parcel, iU, zzi.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzl(zzpVar, strH, strH2, zzqVarArr, zznVarArr, strArrI, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
