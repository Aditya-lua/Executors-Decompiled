package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        PointF[] pointFArr = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 2) {
                pointFArr = (PointF[]) b.k(parcel, iU, PointF.CREATOR);
            } else if (iN != 3) {
                b.C(parcel, iU);
            } else {
                iW = b.w(parcel, iU);
            }
        }
        b.m(parcel, iD);
        return new zzd(pointFArr, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}
