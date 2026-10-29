package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        String strM38434h5 = null;
        zzj zzjVar = null;
        zzj zzjVar2 = null;
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
                    zzjVar = (zzj) C9717a.m38433g(parcel, iM38447u, zzj.CREATOR);
                    break;
                case 8:
                    zzjVar2 = (zzj) C9717a.m38433g(parcel, iM38447u, zzj.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzk(strM38434h, strM38434h2, strM38434h3, strM38434h4, strM38434h5, zzjVar, zzjVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
