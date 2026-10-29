package fb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.games_v2.zzaf;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        Bundle bundleB = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                iBinderV = o9.a.v(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzaf(bundleB, iBinderV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaf[i10];
    }
}
