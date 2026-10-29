package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        float fS = 0.0f;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            int iN = a.n(iU);
            if (iN == 2) {
                iW = a.w(parcel, iU);
            } else if (iN == 3) {
                iW2 = a.w(parcel, iU);
            } else if (iN == 4) {
                iW3 = a.w(parcel, iU);
            } else if (iN == 5) {
                iW4 = a.w(parcel, iU);
            } else if (iN != 6) {
                a.C(parcel, iU);
            } else {
                fS = a.s(parcel, iU);
            }
        }
        a.m(parcel, iD);
        return new zzf(iW, iW2, iW3, iW4, fS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
