package p305n9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import p325o9.C9717a;

/* JADX INFO: renamed from: n9.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8948k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        IBinder iBinderM38448v = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iBinderM38448v = C9717a.m38448v(parcel, iM38447u);
            } else if (iM38440n == 3) {
                connectionResult = (ConnectionResult) C9717a.m38433g(parcel, iM38447u, ConnectionResult.CREATOR);
            } else if (iM38440n == 4) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zM38441o2 = C9717a.m38441o(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zav(iM38449w, iBinderM38448v, connectionResult, zM38441o, zM38441o2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zav[i10];
    }
}
