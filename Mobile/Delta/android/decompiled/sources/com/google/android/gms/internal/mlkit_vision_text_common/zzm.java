package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
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
            int iU = a.u(parcel);
            switch (a.n(iU)) {
                case 2:
                    zzrVarArr = (zzr[]) a.k(parcel, iU, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) a.g(parcel, iU, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) a.g(parcel, iU, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) a.g(parcel, iU, zzf.CREATOR);
                    break;
                case 6:
                    strH = a.h(parcel, iU);
                    break;
                case 7:
                    fS = a.s(parcel, iU);
                    break;
                case 8:
                    strH2 = a.h(parcel, iU);
                    break;
                case 9:
                    iW = a.w(parcel, iU);
                    break;
                case 10:
                    zO = a.o(parcel, iU);
                    break;
                case 11:
                    iW2 = a.w(parcel, iU);
                    break;
                case 12:
                    iW3 = a.w(parcel, iU);
                    break;
                default:
                    a.C(parcel, iU);
                    break;
            }
        }
        a.m(parcel, iD);
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, strH, fS, strH2, iW, zO, iW2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
