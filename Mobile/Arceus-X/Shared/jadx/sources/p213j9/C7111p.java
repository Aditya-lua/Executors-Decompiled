package p213j9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import p325o9.C9717a;

/* JADX INFO: renamed from: j9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7111p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        boolean zM38441o = false;
        long jM38451y = -1;
        String strM38434h = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 3) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new Feature(strM38434h, iM38449w, jM38451y, zM38441o);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}
