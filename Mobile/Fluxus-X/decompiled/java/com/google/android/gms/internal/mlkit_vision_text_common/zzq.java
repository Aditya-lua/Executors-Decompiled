package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            if (b.n(iU) != 2) {
                b.C(parcel, iU);
            } else {
                strH = b.h(parcel, iU);
            }
        }
        b.m(parcel, iD);
        return new zzp(strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
