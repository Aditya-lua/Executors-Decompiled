package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        byte[] bArrM38429c = null;
        Point[] pointArr = null;
        zzxu zzxuVar = null;
        zzxx zzxxVar = null;
        zzxy zzxyVar = null;
        zzya zzyaVar = null;
        zzxz zzxzVar = null;
        zzxv zzxvVar = null;
        zzxr zzxrVar = null;
        zzxs zzxsVar = null;
        zzxt zzxtVar = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    bArrM38429c = C9717a.m38429c(parcel, iM38447u);
                    break;
                case 5:
                    pointArr = (Point[]) C9717a.m38437k(parcel, iM38447u, Point.CREATOR);
                    break;
                case 6:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 7:
                    zzxuVar = (zzxu) C9717a.m38433g(parcel, iM38447u, zzxu.CREATOR);
                    break;
                case 8:
                    zzxxVar = (zzxx) C9717a.m38433g(parcel, iM38447u, zzxx.CREATOR);
                    break;
                case 9:
                    zzxyVar = (zzxy) C9717a.m38433g(parcel, iM38447u, zzxy.CREATOR);
                    break;
                case 10:
                    zzyaVar = (zzya) C9717a.m38433g(parcel, iM38447u, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) C9717a.m38433g(parcel, iM38447u, zzxz.CREATOR);
                    break;
                case 12:
                    zzxvVar = (zzxv) C9717a.m38433g(parcel, iM38447u, zzxv.CREATOR);
                    break;
                case 13:
                    zzxrVar = (zzxr) C9717a.m38433g(parcel, iM38447u, zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (zzxs) C9717a.m38433g(parcel, iM38447u, zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (zzxt) C9717a.m38433g(parcel, iM38447u, zzxt.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzyb(iM38449w, strM38434h, strM38434h2, bArrM38429c, pointArr, iM38449w2, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyb[i10];
    }
}
