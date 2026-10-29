package p306nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import p325o9.C9717a;

/* JADX INFO: renamed from: nb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9102h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        zzpl zzplVar = null;
        String strM38434h3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long jM38451y = 0;
        long jM38451y2 = 0;
        long jM38451y3 = 0;
        boolean zM38441o = false;
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
                    zzplVar = (zzpl) C9717a.m38433g(parcel, iM38447u, zzpl.CREATOR);
                    break;
                case 5:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 6:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    zzbgVar = (zzbg) C9717a.m38433g(parcel, iM38447u, zzbg.CREATOR);
                    break;
                case 9:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 10:
                    zzbgVar2 = (zzbg) C9717a.m38433g(parcel, iM38447u, zzbg.CREATOR);
                    break;
                case 11:
                    jM38451y3 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 12:
                    zzbgVar3 = (zzbg) C9717a.m38433g(parcel, iM38447u, zzbg.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzah(strM38434h, strM38434h2, zzplVar, jM38451y, zM38441o, strM38434h3, zzbgVar, jM38451y2, zzbgVar2, jM38451y3, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzah[i10];
    }
}
