package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        Bundle bundleB = null;
        String strH = null;
        boolean zO = false;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                jY = o9.a.y(parcel, iU);
            } else if (iN == 2) {
                jY2 = o9.a.y(parcel, iU);
            } else if (iN == 3) {
                zO = o9.a.o(parcel, iU);
            } else if (iN == 7) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN != 8) {
                o9.a.C(parcel, iU);
            } else {
                strH = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzdd(jY, jY2, zO, bundleB, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
