package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        Bundle bundleB = null;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                arrayListL = o9.a.l(parcel, iU, RetrieveBytesResponse.BlockstoreData.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new RetrieveBytesResponse(bundleB, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RetrieveBytesResponse[i10];
    }
}
