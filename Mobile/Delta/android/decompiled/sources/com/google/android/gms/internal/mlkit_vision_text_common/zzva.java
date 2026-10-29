package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzva implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = a.u(parcel);
            int iN = a.n(iU);
            if (iN == 1) {
                strH = a.h(parcel, iU);
            } else if (iN == 2) {
                rect = (Rect) a.g(parcel, iU, Rect.CREATOR);
            } else if (iN == 3) {
                arrayListL = a.l(parcel, iU, Point.CREATOR);
            } else if (iN == 4) {
                strH2 = a.h(parcel, iU);
            } else if (iN != 5) {
                a.C(parcel, iU);
            } else {
                arrayListL2 = a.l(parcel, iU, zzvd.CREATOR);
            }
        }
        a.m(parcel, iD);
        return new zzuz(strH, rect, arrayListL, strH2, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzuz[i10];
    }
}
