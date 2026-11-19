package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        String strH = null;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                strH = b.h(parcel, iU);
            } else if (iN != 2) {
                b.C(parcel, iU);
            } else {
                arrayListL = b.l(parcel, iU, zzuz.CREATOR);
            }
        }
        b.m(parcel, iD);
        return new zzvf(strH, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvf[i10];
    }
}
