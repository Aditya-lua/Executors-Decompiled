package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        PointF[] pointFArr = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            int iN = a.n(iU);
            if (iN == 2) {
                pointFArr = (PointF[]) a.k(parcel, iU, PointF.CREATOR);
            } else if (iN != 3) {
                a.C(parcel, iU);
            } else {
                iW = a.w(parcel, iU);
            }
        }
        a.m(parcel, iD);
        return new zzd(pointFArr, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}
