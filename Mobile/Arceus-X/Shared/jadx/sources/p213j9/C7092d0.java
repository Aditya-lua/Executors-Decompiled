package p213j9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzp;
import p325o9.C9717a;

/* JADX INFO: renamed from: j9.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7092d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        boolean zM38441o4 = false;
        boolean zM38441o5 = false;
        String strM38434h = null;
        IBinder iBinderM38448v = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 3:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 4:
                    iBinderM38448v = C9717a.m38448v(parcel, iM38447u);
                    break;
                case 5:
                    zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 6:
                    zM38441o4 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 7:
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
                case 8:
                    zM38441o5 = C9717a.m38441o(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzp(strM38434h, zM38441o, zM38441o2, iBinderM38448v, zM38441o3, zM38441o4, zM38441o5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
