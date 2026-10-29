package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        boolean zO = false;
        zzn[] zznVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        String strH = null;
        String strH2 = null;
        float fS = 0.0f;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            switch (a.n(iU)) {
                case 2:
                    zznVarArr = (zzn[]) a.k(parcel, iU, zzn.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) a.g(parcel, iU, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) a.g(parcel, iU, zzf.CREATOR);
                    break;
                case 5:
                    strH = a.h(parcel, iU);
                    break;
                case 6:
                    fS = a.s(parcel, iU);
                    break;
                case 7:
                    strH2 = a.h(parcel, iU);
                    break;
                case 8:
                    zO = a.o(parcel, iU);
                    break;
                default:
                    a.C(parcel, iU);
                    break;
            }
        }
        a.m(parcel, iD);
        return new zzr(zznVarArr, zzfVar, zzfVar2, strH, fS, strH2, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
