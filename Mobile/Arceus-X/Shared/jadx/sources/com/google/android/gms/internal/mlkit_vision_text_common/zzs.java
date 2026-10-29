package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        zzn[] zznVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        String strM38434h = null;
        String strM38434h2 = null;
        float fM38445s = 0.0f;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 2:
                    zznVarArr = (zzn[]) C9717a.m38437k(parcel, iM38447u, zzn.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) C9717a.m38433g(parcel, iM38447u, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) C9717a.m38433g(parcel, iM38447u, zzf.CREATOR);
                    break;
                case 5:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzr(zznVarArr, zzfVar, zzfVar2, strM38434h, fM38445s, strM38434h2, zM38441o);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
