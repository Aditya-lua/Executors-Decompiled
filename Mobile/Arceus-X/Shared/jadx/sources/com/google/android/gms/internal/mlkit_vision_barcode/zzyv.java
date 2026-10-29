package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzyv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        long jM38451y = 0;
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        int iM38449w4 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 3) {
                iM38449w3 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 4) {
                iM38449w4 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzyu(iM38449w, iM38449w2, iM38449w3, iM38449w4, jM38451y);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyu[i10];
    }
}
