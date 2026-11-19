package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        boolean zO = false;
        zzn[] zznVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        String strH = null;
        String strH2 = null;
        float fS = 0.0f;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 2:
                    zznVarArr = (zzn[]) b.k(parcel, iU, zzn.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) b.g(parcel, iU, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) b.g(parcel, iU, zzf.CREATOR);
                    break;
                case 5:
                    strH = b.h(parcel, iU);
                    break;
                case 6:
                    fS = b.s(parcel, iU);
                    break;
                case 7:
                    strH2 = b.h(parcel, iU);
                    break;
                case 8:
                    zO = b.o(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzr(zznVarArr, zzfVar, zzfVar2, strH, fS, strH2, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
