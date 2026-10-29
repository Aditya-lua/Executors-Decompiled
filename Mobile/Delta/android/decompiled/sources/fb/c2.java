package fb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.internal.games_v2.zzx;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        zzx zzxVar = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                zzxVar = (zzx) o9.a.g(parcel, iU, zzx.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new zzq(iW, zzxVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
