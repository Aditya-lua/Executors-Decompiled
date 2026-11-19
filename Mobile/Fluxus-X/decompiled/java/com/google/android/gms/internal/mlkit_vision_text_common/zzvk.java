package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = b.D(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iD) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                strH = b.h(parcel, iU);
            } else if (iN == 2) {
                rect = (Rect) b.g(parcel, iU, Rect.CREATOR);
            } else if (iN == 3) {
                arrayListL = b.l(parcel, iU, Point.CREATOR);
            } else if (iN == 4) {
                fS = b.s(parcel, iU);
            } else if (iN != 5) {
                b.C(parcel, iU);
            } else {
                fS2 = b.s(parcel, iU);
            }
        }
        b.m(parcel, iD);
        return new zzvj(strH, rect, arrayListL, fS, fS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvj[i10];
    }
}
