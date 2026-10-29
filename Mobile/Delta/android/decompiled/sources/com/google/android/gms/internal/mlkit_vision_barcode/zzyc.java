package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        byte[] bArrC = null;
        Point[] pointArr = null;
        zzxu zzxuVar = null;
        zzxx zzxxVar = null;
        zzxy zzxyVar = null;
        zzya zzyaVar = null;
        zzxz zzxzVar = null;
        zzxv zzxvVar = null;
        zzxr zzxrVar = null;
        zzxs zzxsVar = null;
        zzxt zzxtVar = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 2:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    bArrC = o9.a.c(parcel, iU);
                    break;
                case 5:
                    pointArr = (Point[]) o9.a.k(parcel, iU, Point.CREATOR);
                    break;
                case 6:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 7:
                    zzxuVar = (zzxu) o9.a.g(parcel, iU, zzxu.CREATOR);
                    break;
                case 8:
                    zzxxVar = (zzxx) o9.a.g(parcel, iU, zzxx.CREATOR);
                    break;
                case 9:
                    zzxyVar = (zzxy) o9.a.g(parcel, iU, zzxy.CREATOR);
                    break;
                case 10:
                    zzyaVar = (zzya) o9.a.g(parcel, iU, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) o9.a.g(parcel, iU, zzxz.CREATOR);
                    break;
                case 12:
                    zzxvVar = (zzxv) o9.a.g(parcel, iU, zzxv.CREATOR);
                    break;
                case 13:
                    zzxrVar = (zzxr) o9.a.g(parcel, iU, zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (zzxs) o9.a.g(parcel, iU, zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (zzxt) o9.a.g(parcel, iU, zzxt.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzyb(iW, strH, strH2, bArrC, pointArr, iW2, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyb[i10];
    }
}
