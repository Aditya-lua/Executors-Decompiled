package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        double dQ = 0.0d;
        int iW = 0;
        int iW2 = 0;
        boolean zO = false;
        String strH = null;
        String strH2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 2:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 3:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 6:
                    pointArr = (Point[]) o9.a.k(parcel, iU, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) o9.a.g(parcel, iU, zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (zzq) o9.a.g(parcel, iU, zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (zzr) o9.a.g(parcel, iU, zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (zzt) o9.a.g(parcel, iU, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) o9.a.g(parcel, iU, zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (zzo) o9.a.g(parcel, iU, zzo.CREATOR);
                    break;
                case 13:
                    zzkVar = (zzk) o9.a.g(parcel, iU, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) o9.a.g(parcel, iU, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) o9.a.g(parcel, iU, zzm.CREATOR);
                    break;
                case 16:
                    bArrC = o9.a.c(parcel, iU);
                    break;
                case 17:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 18:
                    dQ = o9.a.q(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzu(iW, strH, strH2, iW2, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArrC, zO, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
