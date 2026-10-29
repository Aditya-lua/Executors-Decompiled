package p271lf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.zzj;
import p325o9.C9717a;

/* JADX INFO: renamed from: lf.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8133e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        int iM38449w = 0;
        String strM38434h = null;
        Bundle bundleM38428b = null;
        Bundle bundleM38428b2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 3) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 4) {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                bundleM38428b2 = C9717a.m38428b(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzj(zM38441o, iM38449w, strM38434h, bundleM38428b, bundleM38428b2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
