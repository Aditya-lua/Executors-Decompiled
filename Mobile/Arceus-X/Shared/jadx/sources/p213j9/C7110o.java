package p213j9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import p325o9.C9717a;

/* JADX INFO: renamed from: j9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7110o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        PendingIntent pendingIntent = null;
        String strM38434h = null;
        Integer numM38450x = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 3) {
                pendingIntent = (PendingIntent) C9717a.m38433g(parcel, iM38447u, PendingIntent.CREATOR);
            } else if (iM38440n == 4) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                numM38450x = C9717a.m38450x(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ConnectionResult(iM38449w, iM38449w2, pendingIntent, strM38434h, numM38450x);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionResult[i10];
    }
}
