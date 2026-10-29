package p213j9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzr;
import p325o9.C9717a;

/* JADX INFO: renamed from: j9.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7094e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        long jM38451y = -1;
        boolean zM38441o = false;
        int iM38449w = 0;
        int iM38449w2 = 0;
        String strM38434h = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 4) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzr(zM38441o, strM38434h, iM38449w, iM38449w2, jM38451y);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
