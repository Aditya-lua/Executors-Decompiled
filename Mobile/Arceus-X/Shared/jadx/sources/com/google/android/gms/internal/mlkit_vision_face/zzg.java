package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        int iM38449w2 = 0;
        float fM38445s = 0.0f;
        float fM38445s2 = 0.0f;
        float fM38445s3 = 0.0f;
        float fM38445s4 = 0.0f;
        float fM38445s5 = 0.0f;
        float fM38445s6 = 0.0f;
        float fM38445s7 = 0.0f;
        float fM38445s8 = Float.MAX_VALUE;
        float fM38445s9 = Float.MAX_VALUE;
        float fM38445s10 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float fM38445s11 = -1.0f;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 3:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 4:
                    fM38445s2 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 5:
                    fM38445s3 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 6:
                    fM38445s4 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 7:
                    fM38445s8 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 8:
                    fM38445s9 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 9:
                    zznVarArr = (zzn[]) C9717a.m38437k(parcel, iM38447u, zzn.CREATOR);
                    break;
                case 10:
                    fM38445s5 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 11:
                    fM38445s6 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 12:
                    fM38445s7 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) C9717a.m38437k(parcel, iM38447u, zzd.CREATOR);
                    break;
                case 14:
                    fM38445s10 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 15:
                    fM38445s11 = C9717a.m38445s(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzf(iM38449w, iM38449w2, fM38445s, fM38445s2, fM38445s3, fM38445s4, fM38445s8, fM38445s9, fM38445s10, zznVarArr, fM38445s5, fM38445s6, fM38445s7, zzdVarArr, fM38445s11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
