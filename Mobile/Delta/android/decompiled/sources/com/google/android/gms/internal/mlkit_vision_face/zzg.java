package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        int iW = 0;
        int iW2 = 0;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        float fS7 = 0.0f;
        float fS8 = Float.MAX_VALUE;
        float fS9 = Float.MAX_VALUE;
        float fS10 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float fS11 = -1.0f;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            switch (a.n(iU)) {
                case 1:
                    iW = a.w(parcel, iU);
                    break;
                case 2:
                    iW2 = a.w(parcel, iU);
                    break;
                case 3:
                    fS = a.s(parcel, iU);
                    break;
                case 4:
                    fS2 = a.s(parcel, iU);
                    break;
                case 5:
                    fS3 = a.s(parcel, iU);
                    break;
                case 6:
                    fS4 = a.s(parcel, iU);
                    break;
                case 7:
                    fS8 = a.s(parcel, iU);
                    break;
                case 8:
                    fS9 = a.s(parcel, iU);
                    break;
                case 9:
                    zznVarArr = (zzn[]) a.k(parcel, iU, zzn.CREATOR);
                    break;
                case 10:
                    fS5 = a.s(parcel, iU);
                    break;
                case 11:
                    fS6 = a.s(parcel, iU);
                    break;
                case 12:
                    fS7 = a.s(parcel, iU);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) a.k(parcel, iU, zzd.CREATOR);
                    break;
                case 14:
                    fS10 = a.s(parcel, iU);
                    break;
                case 15:
                    fS11 = a.s(parcel, iU);
                    break;
                default:
                    a.C(parcel, iU);
                    break;
            }
        }
        a.m(parcel, iD);
        return new zzf(iW, iW2, fS, fS2, fS3, fS4, fS8, fS9, fS10, zznVarArr, fS5, fS6, fS7, zzdVarArr, fS11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
