package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.common.MlKitException;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
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
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 2:
                    iW = b.w(parcel, iU);
                    break;
                case 3:
                    strH = b.h(parcel, iU);
                    break;
                case 4:
                    strH2 = b.h(parcel, iU);
                    break;
                case 5:
                    iW2 = b.w(parcel, iU);
                    break;
                case 6:
                    pointArr = (Point[]) b.k(parcel, iU, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) b.g(parcel, iU, zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (zzq) b.g(parcel, iU, zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (zzr) b.g(parcel, iU, zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (zzt) b.g(parcel, iU, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) b.g(parcel, iU, zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (zzo) b.g(parcel, iU, zzo.CREATOR);
                    break;
                case 13:
                    zzkVar = (zzk) b.g(parcel, iU, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) b.g(parcel, iU, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) b.g(parcel, iU, zzm.CREATOR);
                    break;
                case 16:
                    bArrC = b.c(parcel, iU);
                    break;
                case 17:
                    zO = b.o(parcel, iU);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    dQ = b.q(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzu(iW, strH, strH2, iW2, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArrC, zO, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
