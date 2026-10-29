package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            if (a.n(iU) != 2) {
                a.C(parcel, iU);
            } else {
                strH = a.h(parcel, iU);
            }
        }
        a.m(parcel, iD);
        return new zzp(strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
