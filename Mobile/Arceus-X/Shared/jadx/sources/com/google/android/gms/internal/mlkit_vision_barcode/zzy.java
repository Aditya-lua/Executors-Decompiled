package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        zzp zzpVar = null;
        String strM38434h = null;
        String strM38434h2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArrM38435i = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 2:
                    zzpVar = (zzp) C9717a.m38433g(parcel, iM38447u, zzp.CREATOR);
                    break;
                case 3:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) C9717a.m38437k(parcel, iM38447u, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) C9717a.m38437k(parcel, iM38447u, zzn.CREATOR);
                    break;
                case 7:
                    strArrM38435i = C9717a.m38435i(parcel, iM38447u);
                    break;
                case 8:
                    zziVarArr = (zzi[]) C9717a.m38437k(parcel, iM38447u, zzi.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzl(zzpVar, strM38434h, strM38434h2, zzqVarArr, zznVarArr, strArrM38435i, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
