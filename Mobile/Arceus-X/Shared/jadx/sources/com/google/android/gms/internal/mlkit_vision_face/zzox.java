package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzox implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        Rect rect = null;
        ArrayList arrayListM38438l = null;
        ArrayList arrayListM38438l2 = null;
        float fM38445s = 0.0f;
        float fM38445s2 = 0.0f;
        float fM38445s3 = 0.0f;
        float fM38445s4 = 0.0f;
        float fM38445s5 = 0.0f;
        float fM38445s6 = 0.0f;
        float fM38445s7 = 0.0f;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    rect = (Rect) C9717a.m38433g(parcel, iM38447u, Rect.CREATOR);
                    break;
                case 3:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 4:
                    fM38445s2 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 5:
                    fM38445s3 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 6:
                    fM38445s4 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 7:
                    fM38445s5 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 8:
                    fM38445s6 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 9:
                    fM38445s7 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 10:
                    arrayListM38438l = C9717a.m38438l(parcel, iM38447u, zzpc.CREATOR);
                    break;
                case 11:
                    arrayListM38438l2 = C9717a.m38438l(parcel, iM38447u, zzos.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzow(iM38449w, rect, fM38445s, fM38445s2, fM38445s3, fM38445s4, fM38445s5, fM38445s6, fM38445s7, arrayListM38438l, arrayListM38438l2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzow[i10];
    }
}
