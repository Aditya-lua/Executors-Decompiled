package p213j9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzt;
import p325o9.C9717a;

/* JADX INFO: renamed from: j9.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7096f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        String strM38434h = null;
        IBinder iBinderM38448v = null;
        boolean zM38441o2 = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iBinderM38448v = C9717a.m38448v(parcel, iM38447u);
            } else if (iM38440n == 3) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zM38441o2 = C9717a.m38441o(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzt(strM38434h, iBinderM38448v, zM38441o, zM38441o2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzt[i10];
    }
}
