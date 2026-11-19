package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        float fS = 0.0f;
        float fS2 = 0.0f;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    strH = b.h(parcel, iU);
                    break;
                case 2:
                    rect = (Rect) b.g(parcel, iU, Rect.CREATOR);
                    break;
                case 3:
                    arrayListL = b.l(parcel, iU, Point.CREATOR);
                    break;
                case 4:
                    strH2 = b.h(parcel, iU);
                    break;
                case 5:
                    fS = b.s(parcel, iU);
                    break;
                case 6:
                    fS2 = b.s(parcel, iU);
                    break;
                case 7:
                    arrayListL2 = b.l(parcel, iU, zzvj.CREATOR);
                    break;
                default:
                    b.C(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iD);
        return new zzvb(strH, rect, arrayListL, strH2, fS, fS2, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvb[i10];
    }
}
