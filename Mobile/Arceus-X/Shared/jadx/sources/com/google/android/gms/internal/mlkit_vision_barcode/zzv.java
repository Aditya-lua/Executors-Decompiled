package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        double dM38443q = 0.0d;
        int iM38449w = 0;
        int iM38449w2 = 0;
        boolean zM38441o = false;
        String strM38434h = null;
        String strM38434h2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArrM38429c = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 2:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 6:
                    pointArr = (Point[]) C9717a.m38437k(parcel, iM38447u, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) C9717a.m38433g(parcel, iM38447u, zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (zzq) C9717a.m38433g(parcel, iM38447u, zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (zzr) C9717a.m38433g(parcel, iM38447u, zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (zzt) C9717a.m38433g(parcel, iM38447u, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) C9717a.m38433g(parcel, iM38447u, zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (zzo) C9717a.m38433g(parcel, iM38447u, zzo.CREATOR);
                    break;
                case 13:
                    zzkVar = (zzk) C9717a.m38433g(parcel, iM38447u, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) C9717a.m38433g(parcel, iM38447u, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) C9717a.m38433g(parcel, iM38447u, zzm.CREATOR);
                    break;
                case 16:
                    bArrM38429c = C9717a.m38429c(parcel, iM38447u);
                    break;
                case 17:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 18:
                    dM38443q = C9717a.m38443q(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzu(iM38449w, strM38434h, strM38434h2, iM38449w2, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArrM38429c, zM38441o, dM38443q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
