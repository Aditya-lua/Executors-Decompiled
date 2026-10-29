package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        long jY = 0;
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
                jY = a.y(parcel, iU);
            } else if (iN != 6) {
                a.C(parcel, iU);
            } else {
                iW4 = a.w(parcel, iU);
            }
        }
        a.m(parcel, iD);
        return new zzp(iW, iW2, iW3, jY, iW4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
