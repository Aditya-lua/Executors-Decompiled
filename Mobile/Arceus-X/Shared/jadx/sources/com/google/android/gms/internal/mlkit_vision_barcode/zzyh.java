package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzyh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        zzxw zzxwVar = null;
        String strM38434h = null;
        String strM38434h2 = null;
        zzxx[] zzxxVarArr = null;
        zzxu[] zzxuVarArr = null;
        String[] strArrM38435i = null;
        zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    zzxwVar = (zzxw) C9717a.m38433g(parcel, iM38447u, zzxw.CREATOR);
                    break;
                case 2:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    zzxxVarArr = (zzxx[]) C9717a.m38437k(parcel, iM38447u, zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (zzxu[]) C9717a.m38437k(parcel, iM38447u, zzxu.CREATOR);
                    break;
                case 6:
                    strArrM38435i = C9717a.m38435i(parcel, iM38447u);
                    break;
                case 7:
                    zzxpVarArr = (zzxp[]) C9717a.m38437k(parcel, iM38447u, zzxp.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzxs(zzxwVar, strM38434h, strM38434h2, zzxxVarArr, zzxuVarArr, strArrM38435i, zzxpVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxs[i10];
    }
}
