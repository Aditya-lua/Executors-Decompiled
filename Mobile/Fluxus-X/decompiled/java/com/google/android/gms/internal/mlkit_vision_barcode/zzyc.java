package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
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
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    iW = b.w(parcel, iU);
                    break;
                case 2:
                    strH = b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = b.h(parcel, iU);
                    break;
                case 4:
                    bArrC = b.c(parcel, iU);
                    break;
                case 5:
                    pointArr = (Point[]) b.k(parcel, iU, Point.CREATOR);
                    break;
                case 6:
                    iW2 = b.w(parcel, iU);
                    break;
                case 7:
                    zzxuVar = (zzxu) b.g(parcel, iU, zzxu.CREATOR);
                    break;
                case 8:
                    zzxxVar = (zzxx) b.g(parcel, iU, zzxx.CREATOR);
                    break;
                case 9:
                    zzxyVar = (zzxy) b.g(parcel, iU, zzxy.CREATOR);
                    break;
                case 10:
                    zzyaVar = (zzya) b.g(parcel, iU, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) b.g(parcel, iU, zzxz.CREATOR);
                    break;
                case 12:
                    zzxvVar = (zzxv) b.g(parcel, iU, zzxv.CREATOR);
                    break;
                case 13:
                    zzxrVar = (zzxr) b.g(parcel, iU, zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (zzxs) b.g(parcel, iU, zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (zzxt) b.g(parcel, iU, zzxt.CREATOR);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzyb(iW, strH, strH2, bArrC, pointArr, iW2, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyb[i10];
    }
}
