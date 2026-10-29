package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzot implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        ArrayList arrayListM38438l = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                arrayListM38438l = C9717a.m38438l(parcel, iM38447u, PointF.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzos(iM38449w, arrayListM38438l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzos[i10];
    }
}
