package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzf;
import eb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                bArrC = o9.a.c(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                bArrC2 = o9.a.c(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzf(bArrC == null ? null : m3.m(bArrC, 0, bArrC.length), bArrC2 != null ? m3.m(bArrC2, 0, bArrC2.length) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
