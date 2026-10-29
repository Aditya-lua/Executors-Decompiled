package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        int iW = 0;
        float fS = 0.0f;
        float fS2 = 0.0f;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            int iN = a.n(iU);
            if (iN == 1) {
                iW = a.w(parcel, iU);
            } else if (iN == 2) {
                fS = a.s(parcel, iU);
            } else if (iN == 3) {
                fS2 = a.s(parcel, iU);
            } else if (iN != 4) {
                a.C(parcel, iU);
            } else {
                iW2 = a.w(parcel, iU);
            }
        }
        a.m(parcel, iD);
        return new zzn(iW, fS, fS2, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzn[i10];
    }
}
