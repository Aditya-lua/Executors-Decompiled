package l9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        k9.b bVar = null;
        int iW = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                pendingIntent = (PendingIntent) p9.b.g(parcel, iU, PendingIntent.CREATOR);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                bVar = (k9.b) p9.b.g(parcel, iU, k9.b.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new Status(iW, strH, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
