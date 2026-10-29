package p242k9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p325o9.C9717a;

/* JADX INFO: renamed from: k9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7514x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        ConnectionResult connectionResult = null;
        int iM38449w = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                pendingIntent = (PendingIntent) C9717a.m38433g(parcel, iM38447u, PendingIntent.CREATOR);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                connectionResult = (ConnectionResult) C9717a.m38433g(parcel, iM38447u, ConnectionResult.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new Status(iM38449w, strM38434h, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
