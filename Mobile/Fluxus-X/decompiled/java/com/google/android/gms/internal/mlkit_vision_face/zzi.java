package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zO = false;
        boolean zO2 = false;
        float fS = -1.0f;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 2:
                    iW = b.w(parcel, iU);
                    break;
                case 3:
                    iW2 = b.w(parcel, iU);
                    break;
                case 4:
                    iW3 = b.w(parcel, iU);
                    break;
                case 5:
                    zO = b.o(parcel, iU);
                    break;
                case 6:
                    zO2 = b.o(parcel, iU);
                    break;
                case 7:
                    fS = b.s(parcel, iU);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzh(iW, iW2, iW3, zO, zO2, fS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzh[i10];
    }
}
