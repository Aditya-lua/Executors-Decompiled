package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzot implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        int iW = 0;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            int iN = a.n(iU);
            if (iN == 1) {
                iW = a.w(parcel, iU);
            } else if (iN != 2) {
                a.C(parcel, iU);
            } else {
                arrayListL = a.l(parcel, iU, PointF.CREATOR);
            }
        }
        a.m(parcel, iD);
        return new zzos(iW, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzos[i10];
    }
}
