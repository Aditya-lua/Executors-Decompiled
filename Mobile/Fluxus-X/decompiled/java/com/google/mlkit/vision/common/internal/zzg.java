package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        long jY = 0;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = b.w(parcel, iU);
            } else if (iN == 3) {
                iW3 = b.w(parcel, iU);
            } else if (iN == 4) {
                jY = b.y(parcel, iU);
            } else if (iN != 5) {
                b.C(parcel, iU);
            } else {
                iW4 = b.w(parcel, iU);
            }
        }
        b.m(parcel, iD);
        return new VisionImageMetadataParcel(iW, iW2, iW3, jY, iW4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VisionImageMetadataParcel[i10];
    }
}
