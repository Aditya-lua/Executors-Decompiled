package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzpd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        int iW = 0;
        PointF pointF = null;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            int iN = a.n(iU);
            if (iN == 1) {
                iW = a.w(parcel, iU);
            } else if (iN != 2) {
                a.C(parcel, iU);
            } else {
                pointF = (PointF) a.g(parcel, iU, PointF.CREATOR);
            }
        }
        a.m(parcel, iD);
        return new zzpc(iW, pointF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzpc[i10];
    }
}
