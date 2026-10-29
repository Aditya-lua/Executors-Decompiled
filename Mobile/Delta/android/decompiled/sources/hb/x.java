package hb;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzl;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        zzj zzjVar = null;
        int iW = 1;
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                zzjVar = (zzj) o9.a.g(parcel, iU, zzj.CREATOR);
            } else if (iN == 3) {
                iBinderV = o9.a.v(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                iBinderV2 = o9.a.v(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzl(iW, zzjVar, iBinderV, iBinderV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
