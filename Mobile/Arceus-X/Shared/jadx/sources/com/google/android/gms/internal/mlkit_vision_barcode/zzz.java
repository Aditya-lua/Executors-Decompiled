package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        String strM38434h5 = null;
        String strM38434h6 = null;
        String strM38434h7 = null;
        String strM38434h8 = null;
        String strM38434h9 = null;
        String strM38434h10 = null;
        String strM38434h11 = null;
        String strM38434h12 = null;
        String strM38434h13 = null;
        String strM38434h14 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 2:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h6 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    strM38434h7 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 9:
                    strM38434h8 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 10:
                    strM38434h9 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 11:
                    strM38434h10 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 12:
                    strM38434h11 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 13:
                    strM38434h12 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 14:
                    strM38434h13 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 15:
                    strM38434h14 = C9717a.m38434h(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzm(strM38434h, strM38434h2, strM38434h3, strM38434h4, strM38434h5, strM38434h6, strM38434h7, strM38434h8, strM38434h9, strM38434h10, strM38434h11, strM38434h12, strM38434h13, strM38434h14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzm[i10];
    }
}
