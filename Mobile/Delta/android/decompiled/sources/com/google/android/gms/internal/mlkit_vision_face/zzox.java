package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzox implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
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
            int iU = a.u(parcel);
            switch (a.n(iU)) {
                case 1:
                    iW = a.w(parcel, iU);
                    break;
                case 2:
                    rect = (Rect) a.g(parcel, iU, Rect.CREATOR);
                    break;
                case 3:
                    fS = a.s(parcel, iU);
                    break;
                case 4:
                    fS2 = a.s(parcel, iU);
                    break;
                case 5:
                    fS3 = a.s(parcel, iU);
                    break;
                case 6:
                    fS4 = a.s(parcel, iU);
                    break;
                case 7:
                    fS5 = a.s(parcel, iU);
                    break;
                case 8:
                    fS6 = a.s(parcel, iU);
                    break;
                case 9:
                    fS7 = a.s(parcel, iU);
                    break;
                case 10:
                    arrayListL = a.l(parcel, iU, zzpc.CREATOR);
                    break;
                case 11:
                    arrayListL2 = a.l(parcel, iU, zzos.CREATOR);
                    break;
                default:
                    a.C(parcel, iU);
                    break;
            }
        }
        a.m(parcel, iD);
        return new zzow(iW, rect, fS, fS2, fS3, fS4, fS5, fS6, fS7, arrayListL, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzow[i10];
    }
}
