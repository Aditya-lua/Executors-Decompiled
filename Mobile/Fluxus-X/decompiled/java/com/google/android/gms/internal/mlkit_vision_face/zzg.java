package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
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
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    iW = b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = b.w(parcel, iU);
                    break;
                case 3:
                    fS = b.s(parcel, iU);
                    break;
                case 4:
                    fS2 = b.s(parcel, iU);
                    break;
                case 5:
                    fS3 = b.s(parcel, iU);
                    break;
                case 6:
                    fS4 = b.s(parcel, iU);
                    break;
                case 7:
                    fS8 = b.s(parcel, iU);
                    break;
                case 8:
                    fS9 = b.s(parcel, iU);
                    break;
                case 9:
                    zznVarArr = (zzn[]) b.k(parcel, iU, zzn.CREATOR);
                    break;
                case 10:
                    fS5 = b.s(parcel, iU);
                    break;
                case 11:
                    fS6 = b.s(parcel, iU);
                    break;
                case 12:
                    fS7 = b.s(parcel, iU);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) b.k(parcel, iU, zzd.CREATOR);
                    break;
                case 14:
                    fS10 = b.s(parcel, iU);
                    break;
                case 15:
                    fS11 = b.s(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzf(iW, iW2, fS, fS2, fS3, fS4, fS8, fS9, fS10, zznVarArr, fS5, fS6, fS7, zzdVarArr, fS11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
