package p376qb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import p325o9.C9717a;

/* JADX INFO: renamed from: qb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10494i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ConnectionResult connectionResult = null;
        int iM38449w = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                connectionResult = (ConnectionResult) C9717a.m38433g(parcel, iM38447u, ConnectionResult.CREATOR);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zavVar = (zav) C9717a.m38433g(parcel, iM38447u, zav.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zak(iM38449w, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}
