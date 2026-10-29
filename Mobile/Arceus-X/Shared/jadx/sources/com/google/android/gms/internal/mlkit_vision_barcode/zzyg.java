package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzyg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        String strM38434h5 = null;
        zzxq zzxqVar = null;
        zzxq zzxqVar2 = null;
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
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    zzxqVar = (zzxq) C9717a.m38433g(parcel, iM38447u, zzxq.CREATOR);
                    break;
                case 7:
                    zzxqVar2 = (zzxq) C9717a.m38433g(parcel, iM38447u, zzxq.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzxr(strM38434h, strM38434h2, strM38434h3, strM38434h4, strM38434h5, zzxqVar, zzxqVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxr[i10];
    }
}
