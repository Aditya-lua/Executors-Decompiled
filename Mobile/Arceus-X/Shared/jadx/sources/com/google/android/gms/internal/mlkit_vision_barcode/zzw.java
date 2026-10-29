package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        int iM38449w4 = 0;
        int iM38449w5 = 0;
        int iM38449w6 = 0;
        boolean zM38441o = false;
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
                    iM38449w4 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 6:
                    iM38449w5 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 7:
                    iM38449w6 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 8:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 9:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzj(iM38449w, iM38449w2, iM38449w3, iM38449w4, iM38449w5, iM38449w6, zM38441o, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
