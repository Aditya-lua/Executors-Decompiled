package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = a.D(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
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
                fS = a.s(parcel, iU);
            } else if (iN != 5) {
                a.C(parcel, iU);
            } else {
                fS2 = a.s(parcel, iU);
            }
        }
        a.m(parcel, iD);
        return new zzvj(strH, rect, arrayListL, fS, fS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvj[i10];
    }
}
