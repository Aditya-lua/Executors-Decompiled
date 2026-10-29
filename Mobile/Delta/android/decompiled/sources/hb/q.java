package hb;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbc;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 1;
        zzba zzbaVar = null;
        IBinder iBinderV = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderV2 = null;
        IBinder iBinderV3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 2:
                    zzbaVar = (zzba) o9.a.g(parcel, iU, zzba.CREATOR);
                    break;
                case 3:
                    iBinderV = o9.a.v(parcel, iU);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) o9.a.g(parcel, iU, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderV2 = o9.a.v(parcel, iU);
                    break;
                case 6:
                    iBinderV3 = o9.a.v(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzbc(iW, zzbaVar, iBinderV, pendingIntent, iBinderV2, iBinderV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i10) {
        return new zzbc[i10];
    }
}
