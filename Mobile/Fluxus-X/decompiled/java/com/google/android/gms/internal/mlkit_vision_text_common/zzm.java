package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        int iW = 0;
        boolean zO = false;
        int iW2 = 0;
        int iW3 = 0;
        zzr[] zzrVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        zzf zzfVar3 = null;
        String strH = null;
        String strH2 = null;
        float fS = 0.0f;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 2:
                    zzrVarArr = (zzr[]) b.k(parcel, iU, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) b.g(parcel, iU, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) b.g(parcel, iU, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) b.g(parcel, iU, zzf.CREATOR);
                    break;
                case 6:
                    strH = b.h(parcel, iU);
                    break;
                case 7:
                    fS = b.s(parcel, iU);
                    break;
                case 8:
                    strH2 = b.h(parcel, iU);
                    break;
                case 9:
                    iW = b.w(parcel, iU);
                    break;
                case 10:
                    zO = b.o(parcel, iU);
                    break;
                case 11:
                    iW2 = b.w(parcel, iU);
                    break;
                case 12:
                    iW3 = b.w(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, strH, fS, strH2, iW, zO, iW2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
