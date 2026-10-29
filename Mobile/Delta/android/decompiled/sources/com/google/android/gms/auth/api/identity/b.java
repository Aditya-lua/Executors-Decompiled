package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        ArrayList<String> arrayListJ = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 2:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 5:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 6:
                    arrayListJ = o9.a.j(parcel, iU);
                    break;
                case 7:
                    zO3 = o9.a.o(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zO, strH, strH2, zO2, strH3, arrayListJ, zO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i10];
    }
}
