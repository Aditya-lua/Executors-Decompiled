package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzox implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        int iW = 0;
        Rect rect = null;
        ArrayList arrayListL = null;
        ArrayList arrayListL2 = null;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        float fS7 = 0.0f;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    iW = b.w(parcel, iU);
                    break;
                case 2:
                    rect = (Rect) b.g(parcel, iU, Rect.CREATOR);
                    break;
                case 3:
                    fS = b.s(parcel, iU);
                    break;
                case 4:
                    fS2 = b.s(parcel, iU);
                    break;
                case 5:
                    fS3 = b.s(parcel, iU);
                    break;
                case 6:
                    fS4 = b.s(parcel, iU);
                    break;
                case 7:
                    fS5 = b.s(parcel, iU);
                    break;
                case 8:
                    fS6 = b.s(parcel, iU);
                    break;
                case 9:
                    fS7 = b.s(parcel, iU);
                    break;
                case 10:
                    arrayListL = b.l(parcel, iU, zzpc.CREATOR);
                    break;
                case 11:
                    arrayListL2 = b.l(parcel, iU, zzos.CREATOR);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzow(iW, rect, fS, fS2, fS3, fS4, fS5, fS6, fS7, arrayListL, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzow[i10];
    }
}
