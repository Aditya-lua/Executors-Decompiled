package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        float fM38445s = -1.0f;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 2:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 3:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 4:
                    iM38449w3 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 5:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 6:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 7:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzh(iM38449w, iM38449w2, iM38449w3, zM38441o, zM38441o2, fM38445s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzh[i10];
    }
}
