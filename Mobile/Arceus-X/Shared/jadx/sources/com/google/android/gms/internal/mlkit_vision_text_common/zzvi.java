package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzvi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        int iM38449w = 0;
        boolean zM38441o2 = false;
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 5:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 6:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 7:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzvh(strM38434h, strM38434h2, strM38434h3, zM38441o, iM38449w, strM38434h4, zM38441o2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvh[i10];
    }
}
