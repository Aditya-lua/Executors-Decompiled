package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zO = false;
        boolean zO2 = false;
        float fS = -1.0f;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            switch (a.n(iU)) {
                case 2:
                    iW = a.w(parcel, iU);
                    break;
                case 3:
                    iW2 = a.w(parcel, iU);
                    break;
                case 4:
                    iW3 = a.w(parcel, iU);
                    break;
                case 5:
                    zO = a.o(parcel, iU);
                    break;
                case 6:
                    zO2 = a.o(parcel, iU);
                    break;
                case 7:
                    fS = a.s(parcel, iU);
                    break;
                default:
                    a.C(parcel, iU);
                    break;
            }
        }
        a.m(parcel, iD);
        return new zzh(iW, iW2, iW3, zO, zO2, fS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzh[i10];
    }
}
