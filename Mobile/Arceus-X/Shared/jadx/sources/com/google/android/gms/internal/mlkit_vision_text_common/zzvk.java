package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        float fM38445s = 0.0f;
        float fM38445s2 = 0.0f;
        String strM38434h = null;
        Rect rect = null;
        ArrayList arrayListM38438l = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                rect = (Rect) C9717a.m38433g(parcel, iM38447u, Rect.CREATOR);
            } else if (iM38440n == 3) {
                arrayListM38438l = C9717a.m38438l(parcel, iM38447u, Point.CREATOR);
            } else if (iM38440n == 4) {
                fM38445s = C9717a.m38445s(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                fM38445s2 = C9717a.m38445s(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzvj(strM38434h, rect, arrayListM38438l, fM38445s, fM38445s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvj[i10];
    }
}
