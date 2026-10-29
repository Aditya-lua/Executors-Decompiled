package p598z8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import p325o9.C9717a;

/* JADX INFO: renamed from: z8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13740d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                pendingIntent = (PendingIntent) C9717a.m38433g(parcel, iM38447u, PendingIntent.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new BeginSignInResult(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInResult[i10];
    }
}
