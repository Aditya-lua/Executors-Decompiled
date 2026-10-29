package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzag;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            if (o9.a.n(iU) != 1) {
                o9.a.C(parcel, iU);
            } else {
                strH = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzag(strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzag[i10];
    }
}
