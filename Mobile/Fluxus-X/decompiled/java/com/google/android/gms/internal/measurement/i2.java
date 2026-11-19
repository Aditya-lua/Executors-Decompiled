package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Bundle bundleB = null;
        String strH = null;
        boolean zO = false;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                jY = p9.b.y(parcel, iU);
            } else if (iN == 2) {
                jY2 = p9.b.y(parcel, iU);
            } else if (iN == 3) {
                zO = p9.b.o(parcel, iU);
            } else if (iN == 7) {
                bundleB = p9.b.b(parcel, iU);
            } else if (iN != 8) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new h2(jY, jY2, zO, bundleB, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h2[i10];
    }
}
