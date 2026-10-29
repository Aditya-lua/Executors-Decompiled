package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzve implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            switch (a.n(iU)) {
                case 1:
                    strH = a.h(parcel, iU);
                    break;
                case 2:
                    rect = (Rect) a.g(parcel, iU, Rect.CREATOR);
                    break;
                case 3:
                    arrayListL = a.l(parcel, iU, Point.CREATOR);
                    break;
                case 4:
                    strH2 = a.h(parcel, iU);
                    break;
                case 5:
                    arrayListL2 = a.l(parcel, iU, zzvb.CREATOR);
                    break;
                case 6:
                    fS = a.s(parcel, iU);
                    break;
                case 7:
                    fS2 = a.s(parcel, iU);
                    break;
                default:
                    a.C(parcel, iU);
                    break;
            }
        }
        a.m(parcel, iD);
        return new zzvd(strH, rect, arrayListL, strH2, arrayListL2, fS, fS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvd[i10];
    }
}
