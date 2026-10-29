package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzh;
import eb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        byte[] bArrC = null;
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                zO = o9.a.o(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                bArrC = o9.a.c(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzh(zO, bArrC != null ? m3.m(bArrC, 0, bArrC.length) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzh[i10];
    }
}
