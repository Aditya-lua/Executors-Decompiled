package ib;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        int iW = 1;
        p pVar = null;
        IBinder iBinderV = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderV2 = null;
        IBinder iBinderV3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 2:
                    pVar = (p) p9.b.g(parcel, iU, p.CREATOR);
                    break;
                case 3:
                    iBinderV = p9.b.v(parcel, iU);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) p9.b.g(parcel, iU, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderV2 = p9.b.v(parcel, iU);
                    break;
                case 6:
                    iBinderV3 = p9.b.v(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new r(iW, pVar, iBinderV, pendingIntent, iBinderV2, iBinderV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r[] newArray(int i10) {
        return new r[i10];
    }
}
