package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzq;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        long jY = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                jY = o9.a.y(parcel, iU);
            } else if (iN == 2) {
                bArrC = o9.a.c(parcel, iU);
            } else if (iN == 3) {
                bArrC2 = o9.a.c(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                bArrC3 = o9.a.c(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzq(jY, bArrC, bArrC2, bArrC3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
